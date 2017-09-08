package com.flybbit.remotecontrol;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;

public abstract class ScreenServ extends CommandServ {
    public ScreenServ() {
    }

    abstract boolean needAction();

    protected abstract String getErrorMessage();

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (needAction()){
            Utils.PresKey(KeyEvent.KEYCODE_POWER, true);
            if (needAction()){
                Log.e("1", getErrorMessage());
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }



    public boolean isScreenOn() {
        DisplayManager dm = (DisplayManager) getSystemService(Context.DISPLAY_SERVICE);

        for (Display display : dm.getDisplays()) {
            if (display.getState() != Display.STATE_OFF) {
                return true;
            }
        }
        return false;
    }
}
