package com.example.breakingbadinfo;

import static androidx.core.app.NotificationCompat.PRIORITY_HIGH;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;


import androidx.core.app.NotificationCompat;

public class QuoteReceiver extends BroadcastReceiver {

    private static final int NOTIFY_ID = 1;
    private static final String CHANNEL_ID = "Quote channel";

    @Override
    public void onReceive(Context context, Intent intent) {
        QuoteFragment quoteFragment = new QuoteFragment();

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        intent = new Intent(context, QuoteReceiver.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

            NotificationCompat.Builder builder =
                new NotificationCompat.Builder(context, CHANNEL_ID)
                        .setAutoCancel(true)
                        .setSmallIcon(R.drawable.notification_logo)
                        .setWhen(System.currentTimeMillis())
                        .setContentIntent(pendingIntent)
                        .setContentTitle("Цитата сериала BreakingBad")
                        .setStyle(new NotificationCompat.BigTextStyle().bigText(quoteFragment.getRandomQuote()))
                        .setPriority(PRIORITY_HIGH);

        createChannelIfNeeded(notificationManager);
        notificationManager.notify(NOTIFY_ID, builder.build());
    }

    public static void createChannelIfNeeded(NotificationManager manager) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "QuoteChannel", NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(notificationChannel);
        }
    }
}