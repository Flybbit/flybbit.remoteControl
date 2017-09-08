package com.flybbit.remotecontrol;

import android.content.Intent;
import android.view.KeyEvent;

public class PressHomeServ extends PressKeyServ {
    public PressHomeServ() {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Key = KeyEvent.KEYCODE_HOME;
        return super.onStartCommand(intent, flags, startId);
    }




}
