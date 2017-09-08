package com.flybbit.remotecontrol;

import android.content.Intent;

public class PressKeyServ extends CommandServ {

    public int Key;


    public PressKeyServ() {
    }



    public int onStartCommand(Intent intent, int flags, int startId) {
        Utils.PresKey(Key, true);
        return super.onStartCommand(intent, flags, startId);
    }



}
