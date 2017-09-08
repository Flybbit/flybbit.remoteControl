package com.flybbit.remotecontrol;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class CommandServ extends Service {


    private final IBinder mBinder = new LocalBinder();

    public CommandServ() {
    }



    private class LocalBinder extends Binder {
        CommandServ getService() {
            return CommandServ.this;
        }
    }


    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

}
