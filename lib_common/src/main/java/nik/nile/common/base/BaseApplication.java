package nik.nile.common.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @author : ChenHuiMing
 * @date : 2019-11-20
 * @email : 907399255@qq.com
 * description : Application 基类
 * 主要处理Application常见的分包等处理，ActivityLifecycleCallbacks Activity全局监控
 */
public class BaseApplication extends Application implements Application.ActivityLifecycleCallbacks {


    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
        AppManager.getAppManager().addActivity(activity);
    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {

    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {
        AppManager.getAppManager().removeActivity(activity);
    }
}
