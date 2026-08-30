package com.google.android.gms.internal.measurement;
import a4.h;
import a5.a;
import b6.e;
import p.a;

import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public final class u5 implements a6 {

    /* renamed from: a, reason: collision with root package name */
    public final m4 f13937a;

    public u5(m4 m4Var) {
        this.f13937a = m4Var;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final boolean a(Object obj) {
        a.p(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final boolean b(b5 b5Var, b5 b5Var2) {
        if (!b5Var.zzb.equals(b5Var2.zzb)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void c(Object obj) {
        b6 b6Var = ((b5) obj).zzb;
        if (b6Var.e) {
            b6Var.e = false;
        }
        a.p(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final int d(b5 b5Var) {
        b6 b6Var = b5Var.zzb;
        int i = b6Var.f13658d;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < b6Var.f13655a; i11++) {
            int i12 = b6Var.f13656b[i11] >>> 3;
            i10 += t4.m(3, (s4) b6Var.f13657c[i11]) + wd0.t(i12, t4.t(16), t4.t(8) << 1);
        }
        b6Var.f13658d = i10;
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void e(Object obj, o5 o5Var) {
        a.p(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final int f(b5 b5Var) {
        return b5Var.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void g(Object obj, Object obj2) {
        h(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void h(Object obj, byte[] bArr, int i, int i10, com.google.android.gms.internal.ads.r7 r7Var) {
        b5 b5Var = (b5) obj;
        if (b5Var.zzb == b6.f13654f) {
            b5Var.zzb = e();
        }
        throw a.f(obj);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final b5 zza() {
        m4 m4Var = this.f13937a;
        if (m4Var instanceof b5) {
            return (b5) ((b5) m4Var).g(4);
        }
        a5 a5Var = (a5) ((b5) m4Var).g(5);
        boolean o10 = a5Var.f13639v.o();
        b5 b5Var = a5Var.f13639v;
        if (!o10) {
            return b5Var;
        }
        b5Var.m();
        return a5Var.f13639v;
    }
}
