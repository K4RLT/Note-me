package com.google.android.gms.internal.ads;
import ac.b;
import g5.q;
import q.h;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class to0 implements zo0, n80, dr0, s81, p31, r31, ie0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11405u;

    /* renamed from: v, reason: collision with root package name */
    public Object f11406v;

    public to0(int i, byte b10) {
        this.f11405u = i;
        switch (i) {
            case 7:
                this.f11406v = new AtomicBoolean(false);
                return;
            default:
                return;
        }
    }

    public void a(String str, wr1 wr1Var) {
        if (wr1Var != null) {
            ((LinkedHashMap) this.f11406v).put(str, wr1Var);
        } else {
            g5.q.h("provider");
        }
    }

    public synchronized ac.b b(x90 x90Var, yo0 yo0Var, j60 j60Var) {
        i50 zza;
        try {
            if (j60Var != null) {
                this.f11406v = j60Var;
            } else {
                this.f11406v = (j60) yo0Var.h((xo0) x90Var.f12503w).c();
            }
            zza = ((j60) this.f11406v).zza();
        } catch (Throwable th) {
            throw th;
        }
        return zza.c(zza.b());
    }

    public void c(String str, wr1 wr1Var) {
        a(str, wr1Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.qr1, com.google.android.gms.internal.ads.ur1] */
    public ur1 d() {
        return new qr1((LinkedHashMap) this.f11406v);
    }

    @Override // com.google.android.gms.internal.ads.p31
    public /* synthetic */ Iterator f(mf mfVar, CharSequence charSequence) {
        return new m31(mfVar, charSequence, (a31) this.f11406v, 0);
    }

    @Override // com.google.android.gms.internal.ads.zo0
    public Object k() {
        j60 j60Var;
        synchronized (this) {
            j60Var = (j60) this.f11406v;
        }
        return j60Var;
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        switch (this.f11405u) {
            case 1:
                hr0 hr0Var = (hr0) this.f11406v;
                ((lr0) obj).t((ir0) hr0Var.f6875u, hr0Var.f6876v);
                return;
            case 12:
                ((hu1) obj).g((hs1) this.f11406v);
                return;
            default:
                ir irVar = (ir) this.f11406v;
                ((hu1) obj).h(irVar);
                int i = irVar.f7194a;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zo0
    public /* bridge */ /* synthetic */ ac.b o(x90 x90Var, yo0 yo0Var) {
        return b(x90Var, yo0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        ry0 ry0Var = ((zy0) this.f11406v).f13333c;
        wy0 wy0Var = (wy0) obj;
        synchronized (ry0Var.f10363m) {
            ld ldVar = ry0Var.f10366p;
            String zza = wy0Var.zza();
            ldVar.b();
            ((md) ldVar.f4845v).J(zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.r31
    public /* synthetic */ Object zza() {
        int i = os1.A;
        return (p) this.f11406v;
    }

    public /* synthetic */ to0(gu1 gu1Var, Object obj, int i) {
        this.f11405u = i;
        this.f11406v = obj;
    }

    public to0(int i) {
        this.f11405u = 9;
        this.f11406v = gm1.d(i);
    }

    public /* synthetic */ to0(int i, Object obj) {
        this.f11405u = i;
        this.f11406v = obj;
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.dr0
    public /* synthetic */ Object l(Object obj) {
        if (((Boolean) rm.f10240c.p()).booleanValue()) {
            ((rr0) this.f11406v).zza();
        }
        return obj;
    }
}
