package n8;
import p.a;

import android.content.Context;
import j.i0;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import q.x;

/* loaded from: classes.dex */
public final class q {
    public static volatile j e;

    /* renamed from: a, reason: collision with root package name */
    public final w8.a f21201a;

    /* renamed from: b, reason: collision with root package name */
    public final w8.a f21202b;

    /* renamed from: c, reason: collision with root package name */
    public final s8.a f21203c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.c f21204d;

    public q(w8.a aVar, w8.a aVar2, s8.a aVar3, com.google.android.gms.internal.consent_sdk.c cVar, nd.o oVar) {
        this.f21201a = aVar;
        this.f21202b = aVar2;
        this.f21203c = aVar3;
        this.f21204d = cVar;
        ((Executor) oVar.f21271u).execute(new a6.e(26, oVar));
    }

    public static q a() {
        j jVar = e;
        if (jVar != null) {
            return (q) jVar.f21189z.get();
        }
        x.o("Not initialized!");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [jb.f, java.lang.Object] */
    public static void b(Context context) {
        if (e == null) {
            synchronized (q.class) {
                try {
                    if (e == null) {
                        Object obj = new Object();
                        context.getClass();
                        obj.f19108a = context;
                        e = obj.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final o c(l8.a aVar) {
        Set singleton;
        byte[] bytes;
        if (aVar instanceof l8.a) {
            singleton = Collections.unmodifiableSet(l8.a.f20019d);
        } else {
            singleton = Collections.singleton(new k8.c("proto"));
        }
        i0 a10 = i.a();
        aVar.getClass();
        a10.f18636v = "cct";
        String str = aVar.f20021a;
        String str2 = aVar.f20022b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = a.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f18637w = bytes;
        return new o(singleton, a10.d(), this);
    }
}