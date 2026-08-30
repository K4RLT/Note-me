package j;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public Method f18612a;

    /* renamed from: b, reason: collision with root package name */
    public Method f18613b;

    /* renamed from: c, reason: collision with root package name */
    public Method f18614c;

    public /* synthetic */ a0(Method method, Method method2, Method method3) {
        this.f18612a = method;
        this.f18613b = method2;
        this.f18614c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
