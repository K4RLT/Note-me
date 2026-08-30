package de;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import fa.y;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15839b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static f f15840c;

    /* renamed from: a, reason: collision with root package name */
    public ic.g f15841a;

    public static f c() {
        boolean z3;
        f fVar;
        synchronized (f15839b) {
            if (f15840c != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            y.j("MlKitContext has not been initialized", z3);
            fVar = f15840c;
            y.h(fVar);
        }
        return fVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [de.f, java.lang.Object] */
    public static f d(Context context, Executor executor) {
        boolean z3;
        f fVar;
        synchronized (f15839b) {
            if (f15840c == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            y.j("MlKitContext is already initialized", z3);
            Object obj = new Object();
            f15840c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList a10 = new j6.e(context, new ic.c(0, MlKitComponentDiscoveryService.class)).a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            g5.q qVar = ic.e.f18394r;
            arrayList.addAll(a10);
            arrayList2.add(ic.a.c(context, Context.class, new Class[0]));
            arrayList2.add(ic.a.c(obj, f.class, new Class[0]));
            ic.g gVar = new ic.g(executor, arrayList, arrayList2, qVar);
            obj.f15841a = gVar;
            gVar.c(true);
            fVar = f15840c;
        }
        return fVar;
    }

    public final Object a(Class cls) {
        boolean z3;
        if (f15840c == this) {
            z3 = true;
        } else {
            z3 = false;
        }
        y.j("MlKitContext has been deleted", z3);
        y.h(this.f15841a);
        return this.f15841a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}