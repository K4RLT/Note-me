package a4;

import a0.o;
import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_digital_ink.er;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import ig.l;
import ig.n;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pf.z;
import qe.m;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f239b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f240c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f241d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f242f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f243g;

    public b(u0 u0Var) {
        Map unmodifiableMap;
        this.f240c = (n) u0Var.f15036v;
        this.f239b = (String) u0Var.f15037w;
        f4.h hVar = (f4.h) u0Var.f15038x;
        hVar.getClass();
        this.f241d = new l(hVar);
        this.e = (er) u0Var.f15039y;
        Map map = (Map) u0Var.f15040z;
        byte[] bArr = jg.b.f19199a;
        if (map.isEmpty()) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        this.f242f = unmodifiableMap;
    }

    public b4.d a(Object obj, kf.g gVar) {
        b4.d dVar;
        Context context = (Context) obj;
        context.getClass();
        gVar.getClass();
        b4.d dVar2 = (b4.d) this.f243g;
        if (dVar2 == null) {
            synchronized (this.f242f) {
                try {
                    if (((b4.d) this.f243g) == null) {
                        Context applicationContext = context.getApplicationContext();
                        u.c cVar = (u.c) this.f240c;
                        df.l lVar = (df.l) this.f241d;
                        applicationContext.getClass();
                        List list = (List) lVar.invoke(applicationContext);
                        z zVar = (z) this.e;
                        o oVar = new o(applicationContext, 1, this);
                        list.getClass();
                        this.f243g = new b4.d(new y3.z(new a2.c(3, oVar), b4.h.f1708a, m.g(new l5.a(list, null, 23)), cVar, zVar));
                    }
                    dVar = (b4.d) this.f243g;
                    dVar.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar;
        }
        return dVar2;
    }

    public u0 b() {
        u0 u0Var = new u0(false);
        Object obj = Collections.EMPTY_MAP;
        u0Var.f15040z = obj;
        u0Var.f15036v = (n) this.f240c;
        u0Var.f15037w = this.f239b;
        u0Var.f15039y = (er) this.e;
        Map map = (Map) this.f242f;
        if (!map.isEmpty()) {
            obj = new LinkedHashMap(map);
        }
        u0Var.f15040z = obj;
        u0Var.f15038x = ((l) this.f241d).e();
        return u0Var;
    }

    public String toString() {
        switch (this.f238a) {
            case 1:
                return "Request{method=" + this.f239b + ", url=" + ((n) this.f240c) + ", tags=" + ((Map) this.f242f) + '}';
            default:
                return super.toString();
        }
    }

    public b(String str, u.c cVar, df.l lVar, z zVar) {
        str.getClass();
        this.f239b = str;
        this.f240c = cVar;
        this.f241d = lVar;
        this.e = zVar;
        this.f242f = new Object();
    }
}
