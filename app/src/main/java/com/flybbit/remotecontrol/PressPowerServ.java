package com.flybbit.remotecontrol;

import android.content.Intent;
import android.view.KeyEvent;

public class PressPowerServ extends PressKeyServ {
    public PressPowerServ() {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Key = KeyEvent.KEYCODE_POWER;
        return super.onStartCommand(intent, flags, startId);
    }




}
