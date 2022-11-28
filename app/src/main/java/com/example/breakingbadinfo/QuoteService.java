//package com.example.breakingbadinfo;
//
//import static androidx.core.app.NotificationCompat.PRIORITY_HIGH;
//
//import android.app.Notification;
//import android.app.NotificationChannel;
//import android.app.NotificationManager;
//import android.app.PendingIntent;
//import android.app.Service;
//import android.content.Context;
//import android.content.Intent;
//import android.os.IBinder;
//import android.util.Log;
//
//import androidx.annotation.Nullable;
//import androidx.core.app.NotificationCompat;
//
////
//public class QuoteService extends Service {
//
//    QuoteFragment quoteFragment = new QuoteFragment();
//    private static final int NOTIFY_ID = 1;
//    private static final String CHANNEL_ID = "Quote channel";
//
//    public void startNotification() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                showNotification();
//            }
//        }).start();
//    }
//
//
//    @Nullable
//    @Override
//    public IBinder onBind(Intent intent) {
//        return null;
//    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        return super.onStartCommand(intent,flags,startId);
//    }
//
//    @Override
//    public void onCreate() {
//        startNotification();
//        super.onCreate();
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//    }
//
//    public void showNotification() {
//
//        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        Intent intent = new Intent(getApplicationContext(), HomeFragment.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
//        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
//
//        NotificationCompat.Builder builder =
//                new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)
//                        .setAutoCancel(true)
//                        .setSmallIcon(R.drawable.ic_android_black_24dp)
//                        .setWhen(System.currentTimeMillis())
//                        .setContentIntent(pendingIntent)
//                        .setContentTitle("27!")
//                        .setContentText(quoteFragment.getRandomQuote())
//                        .setPriority(PRIORITY_HIGH);
//
//        //Log.d("quot123", "onChanged : " + quoteFragment.randomQuote());
//
//        createChannelIfNeeded(notificationManager);
//        notificationManager.notify(NOTIFY_ID, builder.build());
//    }
//
//    public static void createChannelIfNeeded(NotificationManager manager) {
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, CHANNEL_ID, NotificationManager.IMPORTANCE_DEFAULT);
//            manager.createNotificationChannel(notificationChannel);
//        }
//    }
//}