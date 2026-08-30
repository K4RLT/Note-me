package m2;
import b.b;
import g0.i;
import j.i0;
import l.a;
import r0.e;

import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import wa.b9;
import ya.qd;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final q2.h f20537a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.c f20538b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.m f20539c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f20540d = new i0(7);

    public o0(q2.h hVar, y2.c cVar, y2.m mVar) {
        this.f20537a = hVar;
        this.f20538b = cVar;
        this.f20539c = mVar;
    }

    public static m0 a(o0 o0Var, String str, q0 q0Var, long j10, int i) {
        int i10;
        long j11;
        if ((i & 4) != 0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        int i11 = i10;
        if ((i & 32) != 0) {
            j11 = y2.b(0, 0, 15);
        } else {
            j11 = j10;
        }
        y2.m mVar = o0Var.f20539c;
        y2.c cVar = o0Var.f20538b;
        q2.h hVar = o0Var.f20537a;
        o0Var.getClass();
        return b(o0Var, new g(str), q0Var, i11, 1, j11, mVar, cVar, hVar, 32);
    }

    public static m0 b(o0 o0Var, g gVar, q0 q0Var, int i, int i10, long j10, y2.m mVar, y2.c cVar, q2.h hVar, int i11) {
        int i12;
        long j11;
        y2.m mVar2;
        y2.c cVar2;
        q2.h hVar2;
        int h3;
        m0 m0Var;
        int i13 = 1;
        if ((i11 & 4) != 0) {
            i12 = 1;
        } else {
            i12 = i;
        }
        if ((i11 & 64) != 0) {
            j11 = y2.b(0, 0, 15);
        } else {
            j11 = j10;
        }
        if ((i11 & 128) != 0) {
            mVar2 = o0Var.f20539c;
        } else {
            mVar2 = mVar;
        }
        if ((i11 & 256) != 0) {
            cVar2 = o0Var.f20538b;
        } else {
            cVar2 = cVar;
        }
        if ((i11 & 512) != 0) {
            hVar2 = o0Var.f20537a;
        } else {
            hVar2 = hVar;
        }
        i0 i0Var = o0Var.f20540d;
        qe.s sVar = qe.s.f24023u;
        l0 l0Var = new l0(gVar, q0Var, sVar, i10, false, i12, cVar2, mVar2, hVar2, j11);
        m0 m0Var2 = null;
        if (i0Var != null) {
            j jVar = new j(l0Var);
            com.google.android.gms.internal.ads.h0 h0Var = (com.google.android.gms.internal.ads.h0) i0Var.f18636v;
            if (h0Var != null) {
                m0Var = (m0) h0Var.c(jVar);
            } else if (kotlin.jvm.internal.a((j) i0Var.f18637w, jVar)) {
                m0Var = (m0) i0Var.f18638x;
            }
            if (m0Var != null && !m0Var.f20525b.f20547a.a()) {
                m0Var2 = m0Var;
            }
        }
        if (m0Var2 != null) {
            return new m0(l0Var, m0Var2.f20525b, y2.b.d(j11, (((int) Math.ceil(e)) & 4294967295L) | (((int) Math.ceil(r0.f20550d)) << 32)));
        }
        u0 u0Var = new u0(gVar, i(q0Var, mVar2), sVar, cVar2, hVar2);
        int j12 = y2.a.j(j11);
        if ((i12 == 2 || i12 == 4 || i12 == 5) && y2.a.d(j11)) {
            h3 = y2.a.h(j11);
        } else {
            h3 = Integer.MAX_VALUE;
        }
        if (i12 != 2 && i12 != 4 && i12 != 5) {
            i13 = i10;
        }
        if (j12 != h3) {
            h3 = b9.e((int) Math.ceil(u0Var.d()), j12, h3);
        }
        m0 m0Var3 = new m0(l0Var, new q(u0Var, qd.b(0, h3, 0, y2.a.g(j11)), i13, i12), y2.b.d(j11, (((int) Math.ceil(r6.e)) & 4294967295L) | (((int) Math.ceil(r6.f20550d)) << 32)));
        if (i0Var != null) {
            com.google.android.gms.internal.ads.h0 h0Var2 = (com.google.android.gms.internal.ads.h0) i0Var.f18636v;
            if (h0Var2 != null) {
                h0Var2.d(new j(l0Var), m0Var3);
                return m0Var3;
            }
            i0Var.f18637w = new j(l0Var);
            i0Var.f18638x = m0Var3;
        }
        return m0Var3;
    }
}
