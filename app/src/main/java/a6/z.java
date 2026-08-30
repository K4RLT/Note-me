package a6;
import q.d;
import q.f;
import q.x;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final String f298a = f("WorkerFactory");

    public final p a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f298a;
        p pVar = null;
        try {
            cls = Class.forName(str).asSubclass(p.class);
        } catch (Throwable th) {
            d().c(str2, "Invalid class: " + str, th);
            cls = null;
        }
        if (cls != null) {
            try {
                pVar = (p) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                d().c(str2, "Could not instantiate " + str, th2);
            }
        }
        if (pVar != null && pVar.isUsed()) {
            x.o(a5.a.h("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
            return null;
        }
        return pVar;
    }
}
