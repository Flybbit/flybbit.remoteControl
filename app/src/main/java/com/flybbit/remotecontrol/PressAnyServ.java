package com.flybbit.remotecontrol;

import android.content.Intent;

public class PressAnyServ extends PressKeyServ {
    public PressAnyServ() {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Key = intent.getIntExtra("key", 0);
        return super.onStartCommand(intent, flags, startId);
    }

}
