package example.loo.com.latte.util.callback;

import java.util.WeakHashMap;

/**
 * Created by jingluyuan on 8/10/18.
 */

public class CallbackManager {

    private static final WeakHashMap<Object,IGlobeCallback> CALLBACKS = new WeakHashMap<>();

    private static class Holder{
        private static final CallbackManager INSTANCE = new CallbackManager();
    }

    public static CallbackManager getInstance()
    {
        return Holder.INSTANCE;
    }

    public CallbackManager addCallback(Object tag, IGlobeCallback callback)
    {
        CALLBACKS.put(tag,callback);
        return this;
    }

    public IGlobeCallback getCallback(Object tag)
    {
       return CALLBACKS.get(tag);
    }
}
