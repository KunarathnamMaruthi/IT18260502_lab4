package com.example.singn_up;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;

import androidx.core.app.NotificationCompat;

public class newnotfication<ate,FLAG_ACTIVITY_NEW_TASK,FLAG_ACTIVITY_CLEAR_TASK,app,explicit> {

    ate an
    final explicit intent = new Intent ( this,Notification.class ) for an Activity in your app

    intent.(FLAG_ACTIVITY_NEW_TASK |
    FLAG_ACTIVITY_CLEAR_TASK);
    PendingIntent pendingIntent;
    NotificationCompat.Builder builder

    {

        builder = new
                NotificationCompat.Builder ( this,CHANNEL_ID );
        builder.setSmallIcon ( R.drawable.ic_launcher_background );
        builder.setContentTitle ( "My notification" );
        builder.setContentText ( "Hello World!" );
    }

    public newnotfication ( Intent intent ) {
        this.intent = intent;
        pendingIntent = PendingIntent.getActivity ( this,0,this.intent,0 );
    }
}
