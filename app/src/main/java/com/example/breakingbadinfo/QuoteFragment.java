package com.example.breakingbadinfo;

import static android.content.Context.ALARM_SERVICE;


import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuoteFragment extends Fragment {
    private QuoteRepository quoteRepository;
    private QuoteViewModel quoteViewModel;
    private static String randomQuote;

    public QuoteFragment() {
    }

    public void setRandomQuote(String randomQuote) {
        QuoteFragment.randomQuote = randomQuote;
    }

    public String getRandomQuote() {
        return randomQuote;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quote, container, false);

        Button notification_quote_btn = (Button) view.findViewById(R.id.notification_btn);

        notification_quote_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialTimePicker(getContext());
            }
        });

        quoteRepository = new QuoteRepository(getActivity());
        quoteViewModel = new ViewModelProvider(this).get(QuoteViewModel.class);

        fetchData();
        observeDb();

        return view;
    }

    public void fetchData() {
        RetrofitClient.getRetrofitClient().getBreakingBadApi().getQuoteApiResponse().enqueue(new Callback<List<QuoteApiResponse>>() {
            @Override
            public void onResponse(Call<List<QuoteApiResponse>> call, Response<List<QuoteApiResponse>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    quoteRepository.insert(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<QuoteApiResponse>> call, Throwable t) {

            }
        });
    }

    public void observeDb() {
        quoteViewModel
                .getAllQuotes()
                .observe(getViewLifecycleOwner(), new Observer<List<QuoteDataModel>>() {
                    @Override
                    public void onChanged(List<QuoteDataModel> quoteDataModels) {
                        List<String> quoteList = new ArrayList<>();
                        for (QuoteDataModel quoteDataModel : quoteDataModels) {
                            quoteList.add(quoteDataModel.getQuote());
                        }
                        int index = (new Random()).nextInt(quoteList.size());
                        randomQuote = quoteList.get(index);
                        setRandomQuote(randomQuote);
                    }
                });
    }

    private void materialTimePicker(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());

        MaterialTimePicker materialTimePicker = new MaterialTimePicker.Builder()
                .setTimeFormat(TimeFormat.CLOCK_24H)
                .setHour(12)
                .setMinute(0)
                .setTitleText("Выберете время получения цитаты")
                .build();

        materialTimePicker.addOnPositiveButtonClickListener(v1 -> {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            calendar.set(Calendar.MINUTE, materialTimePicker.getMinute());
            calendar.set(Calendar.HOUR_OF_DAY, materialTimePicker.getHour());

            AlarmManager alarmManager = (AlarmManager) context.getSystemService(ALARM_SERVICE);
            AlarmManager.AlarmClockInfo alarmClockInfo = new AlarmManager.AlarmClockInfo(calendar.getTimeInMillis(), getAlarmInfoPendingIntent());
            alarmManager.setAlarmClock(alarmClockInfo, getAlarmActionPendingIntent());

            Toast.makeText(getContext(), "Уведомление сработает в " + simpleDateFormat.format(calendar.getTime()), Toast.LENGTH_SHORT).show();
        });

        materialTimePicker.show(getActivity().getSupportFragmentManager(), "picker");
    }

    private PendingIntent getAlarmInfoPendingIntent() {
        Intent alarmInfoIntent = new Intent();
        alarmInfoIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        return PendingIntent.getBroadcast(getActivity(), 0, alarmInfoIntent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    private PendingIntent getAlarmActionPendingIntent() {
        Intent intent = new Intent(getActivity(), QuoteReceiver.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        return PendingIntent.getBroadcast(getActivity(), 1, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }
}