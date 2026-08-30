package com.google.android.gms.internal.play_billing;
import i1.o;
import p.a;
import q2.p;

import com.google.android.gms.internal.ads.fm1;
import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public final class k2 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f15477a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f15478b;

    public k2(p1 p1Var, b1 b1Var) {
        p1 p1Var2 = l1.f15481a;
        this.f15478b = p1Var;
        this.f15477a = b1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final r1 a() {
        b1 b1Var = this.f15477a;
        if (b1Var instanceof r1) {
            return ((r1) b1Var).n();
        }
        q1 q1Var = (q1) ((r1) b1Var).j(5);
        boolean h3 = q1Var.f15516v.h();
        r1 r1Var = q1Var.f15516v;
        if (!h3) {
            return r1Var;
        }
        r1Var.getClass();
        m2.f15489c.a(r1Var.getClass()).b(r1Var);
        r1Var.e();
        return q1Var.f15516v;
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final void b(Object obj) {
        this.f15478b.getClass();
        s2 s2Var = ((r1) obj).zzc;
        if (s2Var.e) {
            s2Var.e = false;
        }
        p1 p1Var = l1.f15481a;
        throw p.a.f(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final void c(Object obj, byte[] bArr, int i, int i10, fm1 fm1Var) {
        r1 r1Var = (r1) obj;
        if (r1Var.zzc == s2.f15527f) {
            r1Var.zzc = s2.b();
        }
        throw p.a.f(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final boolean d(Object obj) {
        throw p.a.f(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final void e(Object obj, Object obj2) {
        q2.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final boolean f(r1 r1Var, r1 r1Var2) {
        if (!r1Var.zzc.equals(r1Var2.zzc)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final int g(b1 b1Var) {
        s2 s2Var = ((r1) b1Var).zzc;
        int i = s2Var.f15531d;
        if (i == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < s2Var.f15528a; i11++) {
                int i12 = s2Var.f15529b[i11] >>> 3;
                g1 g1Var = (g1) s2Var.f15530c[i11];
                int o10 = i1.o(8);
                int o11 = i1.o(i12) + i1.o(16);
                int o12 = i1.o(24);
                int g8 = g1Var.g();
                i10 += o10 + o10 + o11 + wd0.w(g8, g8, o12);
            }
            s2Var.f15531d = i10;
            return i10;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final void h(Object obj, d2 d2Var) {
        throw p.a.f(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final int i(r1 r1Var) {
        return r1Var.zzc.hashCode();
    }
}
