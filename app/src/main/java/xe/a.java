package xe;

import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f30764a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f30765b;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 < length) {
                method2 = methods[i10];
                if (l.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 1) {
                        cls = parameterTypes[0];
                    } else {
                        cls = null;
                    }
                    if (l.a(cls, Throwable.class)) {
                        break;
                    }
                }
                i10++;
            } else {
                method2 = null;
                break;
            }
        }
        f30764a = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            Method method3 = methods[i];
            if (l.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        f30765b = method;
    }
}
