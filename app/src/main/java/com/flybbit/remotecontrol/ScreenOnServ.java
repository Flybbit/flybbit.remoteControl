package com.flybbit.remotecontrol;

public class ScreenOnServ extends ScreenServ {
    public ScreenOnServ() {
    }

    @Override
    boolean needAction() {
        return !isScreenOn();
    }

    @Override
    protected String getErrorMessage() {
        return "screen off!!!!";
    }


}
