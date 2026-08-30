package com.google.android.gms.internal.ads;
import ab.b;
import c7.f0;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class c11 implements w01 {

    /* renamed from: a, reason: collision with root package name */
    public final ry0 f4943a;

    /* renamed from: b, reason: collision with root package name */
    public final t11 f4944b;

    /* renamed from: c, reason: collision with root package name */
    public final s11 f4945c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f4946d;
    public final x11 e;

    /* renamed from: f, reason: collision with root package name */
    public final h21 f4947f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4948g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final String f4949h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4950j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4951k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4952l;

    /* renamed from: m, reason: collision with root package name */
    public d6 f4953m;

    public c11(ry0 ry0Var, t11 t11Var, s11 s11Var, x11 x11Var, h21 h21Var, rx0 rx0Var, ExecutorService executorService) {
        this.f4943a = ry0Var;
        this.f4944b = t11Var;
        this.f4945c = s11Var;
        this.f4946d = executorService;
        this.e = x11Var;
        this.f4947f = h21Var;
        this.f4949h = rx0Var.Q();
        this.i = rx0Var.Y();
        this.f4950j = rx0Var.X();
        this.f4951k = rx0Var.O();
        this.f4952l = rx0Var.P();
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final h91 a(Context context, View view, Activity activity) {
        return ed1.E(new vb0(this, context, view, activity, 5), this.f4946d);
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final void b(InputEvent inputEvent) {
        try {
            synchronized (this.f4948g) {
                try {
                    d6 d6Var = this.f4953m;
                    if (d6Var != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("evt", inputEvent);
                        ((c7.f0) d6Var.f5318x).w(d6Var.f5316v, Optional.of(hashMap));
                    } else {
                        this.f4947f.b(20105);
                    }
                } finally {
                }
            }
        } catch (cc | fc e) {
            this.f4947f.d(20104, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final h91 c(Context context) {
        return ed1.E(new xe(this, 13, context), this.f4946d);
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final h91 d(Context context, String str, View view) {
        return ed1.E(new vb0(this, context, str, view, 6), this.f4946d);
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final int e() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.HashMap r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c11.f(java.util.HashMap):void");
    }

    public final void g(c7.f0 f0Var, byte[] bArr, boolean z3) {
        g21 a10 = this.f4947f.a(20102);
        try {
            try {
                a10.a();
                synchronized (this.f4948g) {
                    this.f4953m = d6.l(f0Var, bArr, z3);
                }
                a10.c();
            } catch (cc e) {
                e = e;
                a10.b(e);
                throw new ab.b(3, "r: 2", e);
            } catch (fc e8) {
                e = e8;
                a10.b(e);
                throw new ab.b(3, "r: 2", e);
            } catch (Throwable th) {
                a10.b(th);
                throw th;
            }
        } catch (Throwable th2) {
            a10.c();
            throw th2;
        }
    }

    public final String h(HashMap hashMap) {
        String g8;
        h21 h21Var = this.f4947f;
        try {
            h21Var.a(20110).a();
            synchronized (this.f4948g) {
                try {
                    d6 d6Var = this.f4953m;
                    if (d6Var == null) {
                        h21Var.b(20109);
                        g8 = "";
                    } else {
                        byte[] bArr = (byte[]) ((c7.f0) d6Var.f5318x).w(d6Var.f5315u, Optional.of(hashMap));
                        p61 p61Var = r61.e;
                        if (p61Var.f10132b != null) {
                            p61Var = new p61(p61Var.f10131a, (Character) null);
                        }
                        g8 = p61Var.g(bArr, bArr.length);
                    }
                } finally {
                }
            }
            return g8;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final String zza() {
        synchronized (this.f4948g) {
            try {
                d6 d6Var = this.f4953m;
                if (d6Var != null) {
                    return (String) d6Var.f5317w;
                }
                return "3.904631200.-1";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final q81 zzb() {
        o81 o81Var = o81.f9033u;
        boolean z3 = this.f4952l;
        s11 s11Var = this.f4945c;
        if (z3) {
            h91 E = ed1.E(kl.f7798g, s11Var.e);
            s11Var.f10454d.e(20312, E);
            return ed1.d0(E, new a11(this, 1), o81Var);
        }
        q81 t3 = q81.t(s11Var.zzb());
        b11 b11Var = b11.f4658b;
        ExecutorService executorService = this.f4946d;
        final int i = 0;
        b81 c02 = ed1.c0(ed1.S(t3, Throwable.class, b11Var, executorService), new j81(this) { // from class: com.google.android.gms.internal.ads.z01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c11 f13027b;

            {
                this.f13027b = this;
            }

            @Override // com.google.android.gms.internal.ads.j81
            public final ac.b l(Object obj) {
                switch (i) {
                    case 0:
                        c11 c11Var = this.f13027b;
                        vy0 vy0Var = (vy0) obj;
                        if (vy0Var != null) {
                            ry0 ry0Var = c11Var.f4943a;
                            List C = vy0Var.C();
                            synchronized (ry0Var.f10363m) {
                                ld ldVar = ry0Var.f10366p;
                                ldVar.b();
                                ((md) ldVar.f4845v).M((hn1) C);
                            }
                        }
                        if (c11Var.f4944b.b(vy0Var)) {
                            s11 s11Var2 = c11Var.f4945c;
                            ly0 ly0Var = s11Var2.f10452b;
                            ly0Var.getClass();
                            h91 E2 = ed1.E(new bo0(4, ly0Var), ly0Var.f8186b);
                            s11Var2.f10454d.e(20304, E2);
                            return ed1.d0(E2, new a11(c11Var, 0), o81.f9033u);
                        }
                        c11Var.f4947f.b(20103);
                        throw new ab.b(1);
                    default:
                        c11 c11Var2 = this.f13027b;
                        Throwable th = (Throwable) obj;
                        if (c11Var2.f4951k) {
                            s11 s11Var3 = c11Var2.f4945c;
                            h91 E3 = ed1.E(kl.f7798g, s11Var3.e);
                            s11Var3.f10454d.e(20312, E3);
                            return ed1.d0(E3, new a11(c11Var2, 1), o81.f9033u);
                        }
                        return ed1.A(th);
                }
            }
        }, executorService);
        final int i10 = 1;
        return ed1.U(c02, Throwable.class, new j81(this) { // from class: com.google.android.gms.internal.ads.z01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c11 f13027b;

            {
                this.f13027b = this;
            }

            @Override // com.google.android.gms.internal.ads.j81
            public final ac.b l(Object obj) {
                switch (i10) {
                    case 0:
                        c11 c11Var = this.f13027b;
                        vy0 vy0Var = (vy0) obj;
                        if (vy0Var != null) {
                            ry0 ry0Var = c11Var.f4943a;
                            List C = vy0Var.C();
                            synchronized (ry0Var.f10363m) {
                                ld ldVar = ry0Var.f10366p;
                                ldVar.b();
                                ((md) ldVar.f4845v).M((hn1) C);
                            }
                        }
                        if (c11Var.f4944b.b(vy0Var)) {
                            s11 s11Var2 = c11Var.f4945c;
                            ly0 ly0Var = s11Var2.f10452b;
                            ly0Var.getClass();
                            h91 E2 = ed1.E(new bo0(4, ly0Var), ly0Var.f8186b);
                            s11Var2.f10454d.e(20304, E2);
                            return ed1.d0(E2, new a11(c11Var, 0), o81.f9033u);
                        }
                        c11Var.f4947f.b(20103);
                        throw new ab.b(1);
                    default:
                        c11 c11Var2 = this.f13027b;
                        Throwable th = (Throwable) obj;
                        if (c11Var2.f4951k) {
                            s11 s11Var3 = c11Var2.f4945c;
                            h91 E3 = ed1.E(kl.f7798g, s11Var3.e);
                            s11Var3.f10454d.e(20312, E3);
                            return ed1.d0(E3, new a11(c11Var2, 1), o81.f9033u);
                        }
                        return ed1.A(th);
                }
            }
        }, o81Var);
    }
}
