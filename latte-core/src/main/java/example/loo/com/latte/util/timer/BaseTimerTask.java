package example.loo.com.latte.util.timer;

import java.util.TimerTask;

import example.loo.com.latte.net.interceptors.BaseInterceptor;

/**
 * Created by jingluyuan on 8/3/18.
 */

public class BaseTimerTask extends TimerTask {

    private ITimerListener mITimerListener = null;

    public BaseTimerTask(ITimerListener iTimerListener) {
        this.mITimerListener = iTimerListener;
    }

    @Override
    public void run() {
        if (mITimerListener != null) {
            mITimerListener.onTimer();
        }
    }
}
