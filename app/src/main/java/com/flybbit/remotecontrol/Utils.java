package com.flybbit.remotecontrol;

import android.app.Instrumentation;

import android.util.Log;


class Utils {

    /*
    public static final String WEBCAM_PACKAGE = "com.pas.webcam";
    public static final String WEBCAM_ACTIVITY = "com.pas.webcam.Rolling";
    public static final String INJECT_EVENTS = "android.permission.INJECT_EVENTS";
    public static final int MY_PERMISSIONS_REQUEST_INJECT_EVENTS = 42;
*/
    static  private class PresKeyThread  extends Thread {

        private final int key;
        private final int delay;

        PresKeyThread(int key, int delay ) {
            this.key = key;
            this.delay = delay;
        }

        @Override
        public void run() {
            try {
                if (delay > 0){
                    sleep(delay);
                }

                Log.e("1", String.format("press key: %d", key));
                Instrumentation inst = new Instrumentation();
                inst.sendKeyDownUpSync(key);


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static public void PresKey(int key, int delay, boolean wait) {
        PresKeyThread thread = new PresKeyThread(key, delay);
        thread.start();
        if (wait){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static  public void PresKey(int key) {
        PresKey(key, -1, false);
    }

    static  public void PresKey(int key, boolean wait) {
        PresKey(key, -1, wait);
    }

    /*
    static  public void RequestSU() {

        try {
            Process shell = Runtime.getRuntime().exec("su");
            //TimeUnit.MILLISECONDS.sleep(500);
        } catch (IOException e) {
            e.printStackTrace();
        } //catch (InterruptedException e) {
          //  e.printStackTrace();
        //}

    }

    public static void RequestPermission(Activity activit) {

        if (
                //(ContextCompat.checkSelfPermission(this,
                //Manifest.permission.READ_EXTERNAL_STORAGE)
                //!= PackageManager.PERMISSION_GRANTED) ||
                (ContextCompat.checkSelfPermission(activit,
                INJECT_EVENTS)
                != PackageManager.PERMISSION_GRANTED))
        {

            // Should we show an explanation?
            //if (ActivityCompat.shouldShowRequestPermissionRationale(this, INJECT_EVENTS)) {

            // Show an explanation to the user *asynchronously* -- don't block
            // this thread waiting for the user's response! After the user
            // sees the explanation, try again to request the permission.

            //} else {

            // No explanation needed, we can request the permission.

            ActivityCompat.requestPermissions(activit,
                    new String[]{
                    //Manifest.permission.READ_EXTERNAL_STORAGE,
                    INJECT_EVENTS},
                    MY_PERMISSIONS_REQUEST_INJECT_EVENTS);

            // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
            // app-defined int constant. The callback method gets the
            // result of the request.
            //}
        }
    }
    */
}
