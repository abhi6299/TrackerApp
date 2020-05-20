package com.example.trackerapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;

public class RunithOS extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equalsIgnoreCase("android.intent.action.BOOT_COMPLETED")){


            /// only when system start
            Intent intentService=new Intent(context,MyService.class);
            context. startService(intentService);
        }
    }
    /*@Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equalsIgnoreCase("android.intent.action.BOOT_COMPLETED"))
        {
            GlobalInfo globalInfo=new GlobalInfo(context);
            globalInfo.LoadData();
            //start location track
            if(!TrackLocation.isRunning)
            {
                TrackLocation trackLocation=new TrackLocation();
                LocationManager lm=(LocationManager)context.getSystemService(Context.LOCATION_SERVICE);
                lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,trackLocation);
            }
            if(!MyService.isRunning)
            {
                Intent intent1=new Intent(context,MyService.class);
                context.startService(intent1);
            }
        }
    }*/
}
