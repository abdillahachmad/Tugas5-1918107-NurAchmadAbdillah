package com.example.tugas_5;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
public class AlertReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelper notificationHelper = new NotificationHelper(context);
        PendingIntent pendingIntent = PendingIntent.getActivity(context,0,new Intent(context,MainActivity.class),0);
        NotificationCompat.Builder nb = notificationHelper.getChannel_1Notification();
        nb.setContentTitle("Pesan");
        nb.setContentIntent(pendingIntent);
        nb.setAutoCancel(true);
        nb.setContentText("Nur Achmad Abdillah 1918107-Alarm");
        notificationHelper.getManager().notify(1, nb.build());
    }
}

