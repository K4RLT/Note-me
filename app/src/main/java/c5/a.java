package c5;
import a.a;

import android.content.Context;
import android.os.Build;
import d5.b;
import e5.d;
import e5.f;
import pf.b0;
import pf.l0;
import uf.n;
import wf.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f3881a;

    public a(f fVar) {
        this.f3881a = fVar;
    }

    public static final a a(Context context) {
        int i;
        d dVar;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        z4.a aVar = z4.a.f31910a;
        if (i10 >= 30) {
            i = aVar.a();
        } else {
            i = 0;
        }
        if (i >= 5) {
            Object systemService = context.getSystemService((Class<Object>) b.o());
            systemService.getClass();
            dVar = new d(b.k(systemService), 1);
        } else {
            if (i10 >= 30) {
                i11 = aVar.a();
            }
            if (i11 == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) b.o());
                systemService2.getClass();
                dVar = new d(b.k(systemService2), 0);
            } else {
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new a(dVar);
    }

    public ac.b b(e5.a aVar) {
        aVar.getClass();
        e eVar = l0.f22767a;
        return ff.a.a(b0.e(b0.b(n.f27235a), new b5.a(this, aVar, null, 15), 3));
    }
}
