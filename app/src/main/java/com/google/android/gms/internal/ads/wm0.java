package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wm0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12295a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12296b;

    /* renamed from: c, reason: collision with root package name */
    public int f12297c;

    /* renamed from: d, reason: collision with root package name */
    public int f12298d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12299f;

    /* renamed from: g, reason: collision with root package name */
    public long f12300g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_digital_ink.lw f12301h;

    public wm0(com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar, int i) {
        this.f12301h = lwVar;
        this.f12295a = i;
    }

    public final void a() {
        Object f10;
        com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = this.f12301h;
        ys1 ys1Var = (ys1) lwVar.f14643u;
        io0 io0Var = (io0) lwVar.f14647y;
        if (ys1Var.x1() == 3 && ys1Var.E1() && ys1Var.A1() == 0) {
            uh J1 = ys1Var.J1();
            if (J1.g()) {
                f10 = null;
            } else {
                f10 = J1.f(ys1Var.n2());
            }
            int q02 = ys1Var.q0();
            int t22 = ys1Var.t2();
            long p22 = ys1Var.p2();
            if (f10 != null && q02 == -1) {
                J1.o(f10, (qg) lwVar.f14646x);
                p22 -= bq0.t(0L);
                q02 = -1;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z3 = this.f12299f;
            int i = this.f12295a;
            if (z3 && Objects.equals(f10, this.f12296b) && q02 == this.f12297c && t22 == this.f12298d && p22 == this.e) {
                if (elapsedRealtime - this.f12300g >= i) {
                    ((rs1) lwVar.f14645w).f10282u.Y1(new ns1(2, new vn0(2, i), 1003));
                    return;
                }
                return;
            }
            this.f12299f = true;
            this.f12300g = elapsedRealtime;
            this.f12296b = f10;
            this.f12297c = q02;
            this.f12298d = t22;
            this.e = p22;
            io0Var.d(2);
            io0Var.f7185a.sendEmptyMessageDelayed(2, i);
            return;
        }
        if (this.f12299f) {
            io0Var.d(2);
        }
        this.f12299f = false;
    }
}
