package com.example.a127107.demofilereading;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    boolean started;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Service", "Created: ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(started == false){
            started = true;
            Log.d("service","Started");
        }else{
            Log.d("service","Still running");
        }
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.d("service","Exited");
        super.onDestroy();

    }
}

