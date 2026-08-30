package a8;
import c.a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import df.p;
import o0.a0;
import o0.h1;
import o0.m;
import o0.o;
import pe.k;
import pe.l;
import pe.z;
import r0.q1;
import r0.r;
import r0.y;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final m f354a = o.a(a.f346a, 0, 0, 0, 0, a.f347b, 0, 0, 0, a.f348c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15);

    /* renamed from: b, reason: collision with root package name */
    public static final m f355b = o.d(a.f349d, 0, 0, 0, 0, a.e, 0, 0, 0, a.f350f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15);

    public static final void a(final boolean z3, final boolean z9, z0.c cVar, r0.m mVar, final int i) {
        boolean z10;
        final z0.c cVar2;
        m mVar2;
        Object kVar;
        r rVar = (r) mVar;
        rVar.c0(120329475);
        int i10 = i | 50;
        if ((i10 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.R(i10 & 1, z10)) {
            rVar.W();
            if ((i & 1) != 0 && !rVar.A()) {
                rVar.U();
            } else {
                if ((((Configuration) rVar.j(AndroidCompositionLocals_androidKt.f641a)).uiMode & 48) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z9 = true;
            }
            rVar.q();
            m mVar3 = f355b;
            m mVar4 = f354a;
            if (z9 && Build.VERSION.SDK_INT >= 31) {
                rVar.a0(-1561978948);
                Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
                try {
                    if (z3) {
                        kVar = h1.b(context);
                    } else {
                        kVar = h1.c(context);
                    }
                } catch (Throwable th) {
                    kVar = new k(th);
                }
                if (l.a(kVar) != null) {
                    if (z3) {
                        mVar3 = mVar4;
                    }
                    kVar = mVar3;
                }
                mVar3 = (m) kVar;
                rVar.p(false);
            } else if (z3) {
                rVar.a0(-327446510);
                rVar.p(false);
                mVar2 = mVar4;
                cVar2 = cVar;
                a0.a(mVar2, null, d.f356a, cVar2, rVar, 3456);
            } else {
                rVar.a0(-327445485);
                rVar.p(false);
            }
            mVar2 = mVar3;
            cVar2 = cVar;
            a0.a(mVar2, null, d.f356a, cVar2, rVar, 3456);
        } else {
            cVar2 = cVar;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new p(z3, z9, cVar2, i) { // from class: a8.b

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f351u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f352v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ z0.c f353w;

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(385);
                    a(this.f351u, this.f352v, this.f353w, (r0.m) obj, L);
                    return z.f22715a;
                }
            };
        }
    }
}
