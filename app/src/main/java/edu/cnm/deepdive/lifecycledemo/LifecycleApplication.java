package edu.cnm.deepdive.lifecycledemo;

import static edu.cnm.deepdive.lifecycledemo.MainActivity.LOG_TAG;

import android.app.Application;
import android.util.Log;

public class LifecycleApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Log.d(LOG_TAG, "LifecycleApplication::onCreate");
  }

}