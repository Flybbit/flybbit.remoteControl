package com.flybbit.remotecontrol;

public class ScreenOffServ extends ScreenServ {
    public ScreenOffServ() {
    }

    @Override
    boolean needAction() {
        return isScreenOn();
    }

    @Override
    protected String getErrorMessage() {
        return "screen on!!!!";
    }


}
