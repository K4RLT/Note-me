package j3;

import android.graphics.Typeface;
import g5.q;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class j extends i {
    @Override // j3.i
    public final Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f18890f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f18895l.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            q.k(e);
            return null;
        }
    }

    @Override // j3.i
    public final Method l(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
