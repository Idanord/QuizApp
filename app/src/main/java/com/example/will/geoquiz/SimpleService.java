package com.example.will.geoquiz;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import org.jetbrains.annotations.Nullable;

/**
 * Created by Will on 5/15/2018.
 */

public class SimpleService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent){
        return null;
    }//end onBind

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        //let it continue until stopped
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        //leave the service in the started state
        return START_STICKY;
    }//end onStartCommand

    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Service destroyed", Toast.LENGTH_SHORT).show();
    }//end onDestroy
}//end class SimpleService
