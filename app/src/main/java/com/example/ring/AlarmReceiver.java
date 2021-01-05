package com.example.ring;


import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.core.app.NotificationCompat;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
/*
        String url = "https://www.google.fr";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setData(Uri.parse(url));
        context.startActivity(i);
*/
        intent.getFlags();
        String name = intent.getStringExtra("name");
        NotificationHelper notificationHelper = new NotificationHelper(context);
        if (name != null) {
            NotificationCompat.Builder nb = notificationHelper.getChannel1Notification("TestTitle", name);
            notificationHelper.getManager().notify(1, nb.build());
        } else {
            NotificationCompat.Builder nb = notificationHelper.getChannel2Notification("TestTitle", "TestMessage");
            notificationHelper.getManager().notify(1, nb.build());
        }
    }
}
