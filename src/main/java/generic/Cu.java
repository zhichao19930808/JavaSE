package generic;

import com.sun.xml.internal.fastinfoset.stax.events.EndElementEvent;

/**
 * Created by Administrator on 2017/4/13.
 */
public class Cu<T> {
    public T yy(T ee,T eq) {
        return ee;
    }
}

class YY<T> extends Cu<T> {

    @Override
    public T yy(Object ee, Object eq) {
        return (T) eq;
    }
}

