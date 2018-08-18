package example.loo.com.latte.delegates.web.event;

import example.loo.com.latte.util.logger.LatteLogger;

/**
 * Created by jingluyuan on 8/9/18.
 */

public class UndefineEvent extends Event{
    @Override
    public String execute(String params) {
        LatteLogger.e("UndefineEvent",params);
        return null;
    }
}
