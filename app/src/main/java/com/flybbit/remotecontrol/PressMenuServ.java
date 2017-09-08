package com.flybbit.remotecontrol;

import android.content.Intent;
import android.view.KeyEvent;

public class PressMenuServ extends PressKeyServ {
    public PressMenuServ() {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Key = KeyEvent.KEYCODE_MENU;
        return super.onStartCommand(intent, flags, startId);
    }




}
