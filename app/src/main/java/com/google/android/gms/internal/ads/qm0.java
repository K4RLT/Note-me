package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qm0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9897a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9898b;

    /* renamed from: c, reason: collision with root package name */
    public int f9899c;

    /* renamed from: d, reason: collision with root package name */
    public int f9900d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f9901f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9902g;

    /* renamed from: h, reason: collision with root package name */
    public long f9903h;
    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_digital_ink.lw i;

    public qm0(com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar, int i) {
        this.i = lwVar;
        this.f9897a = i;
    }

    public final void a() {
        Object f10;
        Object obj;
        com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = this.i;
        ys1 ys1Var = (ys1) lwVar.f14643u;
        io0 io0Var = (io0) lwVar.f14647y;
        if (ys1Var.x1() == 2 && ys1Var.E1() && ys1Var.A1() == 0) {
            uh J1 = ys1Var.J1();
            if (J1.g()) {
                f10 = null;
            } else {
                f10 = J1.f(ys1Var.n2());
            }
            int q02 = ys1Var.q0();
            int t22 = ys1Var.t2();
            long q22 = ys1Var.q2();
            long max = Math.max(0L, ys1Var.r2() - Math.max(0L, q22 - ys1Var.p2()));
            if (f10 != null && q02 == -1) {
                J1.o(f10, (qg) lwVar.f14646x);
                q22 -= bq0.t(0L);
                q02 = -1;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z3 = this.f9902g;
            int i = this.f9897a;
            if (z3 && Objects.equals(f10, this.f9898b) && q02 == this.f9899c && t22 == this.f9900d) {
                obj = f10;
                if (q22 == this.e && max == this.f9901f) {
                    if (elapsedRealtime - this.f9903h >= i) {
                        ((rs1) lwVar.f14645w).f10282u.Y1(new ns1(2, new vn0(1, i), 1003));
                        return;
                    }
                    return;
                }
            } else {
                obj = f10;
            }
            this.f9902g = true;
            this.f9903h = elapsedRealtime;
            this.f9898b = obj;
            this.f9899c = q02;
            this.f9900d = t22;
            this.e = q22;
            this.f9901f = max;
            io0Var.d(1);
            io0Var.f7185a.sendEmptyMessageDelayed(1, i);
            return;
        }
        if (this.f9902g) {
            io0Var.d(1);
        }
        this.f9902g = false;
    }
}
