package com.flybbit.remotecontrol;

import android.content.Intent;
import android.view.KeyEvent;

public class PressBackServ extends PressKeyServ {
    public PressBackServ() {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Key = KeyEvent.KEYCODE_BACK;
        return super.onStartCommand(intent, flags, startId);
    }




}
