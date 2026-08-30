package com.google.android.gms.internal.ads;
import p.a;

/* loaded from: classes.dex */
public final class do1 implements oo1 {

    /* renamed from: a, reason: collision with root package name */
    public final cm1 f5469a;

    public do1(s6 s6Var, cm1 cm1Var) {
        this.f5469a = cm1Var;
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final boolean c(Object obj) {
        throw a.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final void d(Object obj) {
        vo1 vo1Var = ((dn1) obj).zzt;
        if (vo1Var.e) {
            vo1Var.e = false;
        }
        throw a.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final void e(Object obj, Object obj2) {
        po1.d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final void f(Object obj, androidx.datastore.preferences.protobuf.i iVar, wm1 wm1Var) {
        s6.D(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final void g(Object obj, lt0 lt0Var) {
        throw a.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final void h(Object obj, byte[] bArr, int i, int i10, fm1 fm1Var) {
        dn1 dn1Var = (dn1) obj;
        if (dn1Var.zzt == vo1.f11961f) {
            dn1Var.zzt = vo1.a();
        }
        throw a.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final boolean i(dn1 dn1Var, dn1 dn1Var2) {
        if (!dn1Var.zzt.equals(dn1Var2.zzt)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final int j(dn1 dn1Var) {
        vo1 vo1Var = dn1Var.zzt;
        int i = vo1Var.f11965d;
        if (i == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < vo1Var.f11962a; i11++) {
                int i12 = vo1Var.f11963b[i11] >>> 3;
                om1 om1Var = (om1) vo1Var.f11964c[i11];
                int T = um1.T(8);
                int T2 = um1.T(i12) + um1.T(16);
                int T3 = um1.T(24);
                int k3 = om1Var.k();
                i10 += T + T + T2 + wd0.p(k3, k3, T3);
            }
            vo1Var.f11965d = i10;
            return i10;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final int k(dn1 dn1Var) {
        return dn1Var.zzt.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final dn1 zza() {
        cm1 cm1Var = this.f5469a;
        if (cm1Var instanceof dn1) {
            return ((dn1) cm1Var).p();
        }
        bn1 bn1Var = (bn1) ((dn1) cm1Var).v(5, null);
        boolean h3 = bn1Var.f4845v.h();
        dn1 dn1Var = bn1Var.f4845v;
        if (!h3) {
            return dn1Var;
        }
        dn1Var.getClass();
        ho1.f6854c.a(dn1Var.getClass()).d(dn1Var);
        dn1Var.i();
        return bn1Var.f4845v;
    }
}
