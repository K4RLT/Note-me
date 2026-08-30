package com.google.android.gms.internal.ads;
import i0.m;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class jx1 implements by1, kw1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7561a;

    /* renamed from: b, reason: collision with root package name */
    public m f7562b;

    /* renamed from: c, reason: collision with root package name */
    public z11 f7563c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx1 f7564d;

    public jx1(lx1 lx1Var, Object obj) {
        this.f7564d = lx1Var;
        Object obj2 = null;
        this.f7562b = new m((CopyOnWriteArrayList) lx1Var.f6917c.f18054v, 11, obj2);
        this.f7563c = new z11(10, lx1Var.f6918d.f13047w, obj2, false);
        this.f7561a = obj;
    }

    public final boolean a(yx1 yx1Var) {
        yx1 yx1Var2;
        Object obj = this.f7561a;
        lx1 lx1Var = this.f7564d;
        if (yx1Var != null) {
            yx1Var2 = lx1Var.v(obj, yx1Var);
            if (yx1Var2 == null) {
                return false;
            }
        } else {
            yx1Var2 = null;
        }
        lx1Var.u(obj);
        m mVar = this.f7562b;
        mVar.getClass();
        if (!Objects.equals((yx1) mVar.f18055w, yx1Var2)) {
            this.f7562b = new m((CopyOnWriteArrayList) lx1Var.f6917c.f18054v, 11, yx1Var2);
        }
        z11 z11Var = this.f7563c;
        z11Var.getClass();
        if (!Objects.equals((yx1) z11Var.f13046v, yx1Var2)) {
            this.f7563c = new z11(10, lx1Var.f6918d.f13047w, (Object) yx1Var2, false);
            return true;
        }
        return true;
    }

    public final void b(vx1 vx1Var, yx1 yx1Var) {
        long j10 = vx1Var.f12065c;
        lx1 lx1Var = this.f7564d;
        Object obj = this.f7561a;
        lx1Var.w(j10, obj);
        lx1Var.w(vx1Var.f12066d, obj);
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void g(int i, yx1 yx1Var, vx1 vx1Var) {
        if (a(yx1Var)) {
            m mVar = this.f7562b;
            b(vx1Var, yx1Var);
            mVar.getClass();
            mVar.s(new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(mVar, 11, vx1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void l(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var, int i10) {
        if (a(yx1Var)) {
            m mVar = this.f7562b;
            b(vx1Var, yx1Var);
            mVar.getClass();
            mVar.s(new tc(mVar, qx1Var, vx1Var, i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void m(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var, IOException iOException, boolean z3) {
        if (a(yx1Var)) {
            m mVar = this.f7562b;
            b(vx1Var, yx1Var);
            mVar.getClass();
            mVar.s(new xv0(mVar, qx1Var, vx1Var, iOException, z3));
        }
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void n(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var) {
        if (a(yx1Var)) {
            m mVar = this.f7562b;
            b(vx1Var, yx1Var);
            mVar.getClass();
            mVar.s(new hq0(mVar, qx1Var, vx1Var, 29, false));
        }
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void o(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var) {
        if (a(yx1Var)) {
            m mVar = this.f7562b;
            b(vx1Var, yx1Var);
            mVar.getClass();
            mVar.s(new zd1(29, mVar, qx1Var, vx1Var));
        }
    }
}
