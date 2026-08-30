package uf;
import x.o;
import f.c;
import q.x;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final qf.d f27235a;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qf.a] */
    static {
        String str;
        int i = t.f27241a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            it.getClass();
            Iterator it2 = lf.c(new lf.a(new lf.h(it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    ((qf.a) obj).getClass();
                    do {
                        ((qf.a) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((qf.a) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    f27235a = new qf.d(qf.e.a(mainLooper));
                    return;
                } else {
                    x.o("The main looper is not available");
                    return;
                }
            }
            x.o("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
