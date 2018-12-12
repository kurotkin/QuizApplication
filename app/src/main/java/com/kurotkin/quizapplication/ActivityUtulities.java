package com.kurotkin.quizapplication;

import android.app.Activity;
import android.content.Intent;

public class ActivityUtulities {

    private static ActivityUtulities activityUtulities = null;

    public static ActivityUtulities getInstance(){
        if(activityUtulities == null) activityUtulities = new ActivityUtulities();
        return activityUtulities;
    }

    public void invokeNewActivity(Activity activity, Class<?> tClass, boolean shoulgFinish){   // Контекст, вызываемая активити, принудительно завершить активити
        Intent intent = new Intent(activity, tClass);
        activity.startActivity(intent);
        if(shoulgFinish) activity.finish();
    }
}
