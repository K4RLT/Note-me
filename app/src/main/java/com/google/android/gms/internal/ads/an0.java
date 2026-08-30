package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class an0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4548a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4549b;

    /* renamed from: c, reason: collision with root package name */
    public int f4550c;

    /* renamed from: d, reason: collision with root package name */
    public int f4551d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public long f4552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_digital_ink.lw f4553g;

    public an0(com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar, int i) {
        this.f4553g = lwVar;
        this.f4548a = i;
    }

    public final void a() {
        Object f10;
        long j10;
        boolean z3;
        com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = this.f4553g;
        ys1 ys1Var = (ys1) lwVar.f14643u;
        qg qgVar = (qg) lwVar.f14646x;
        io0 io0Var = (io0) lwVar.f14647y;
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
            J1.o(f10, qgVar);
            p22 -= bq0.t(0L);
            j10 = bq0.t(qgVar.f9842d);
            q02 = -1;
        } else if (q02 != -1) {
            j10 = ys1Var.o2();
        } else {
            j10 = -9223372036854775807L;
        }
        if (ys1Var.x1() == 3 && ys1Var.E1() && ys1Var.A1() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && j10 != -9223372036854775807L && p22 >= j10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z9 = this.e;
            int i = this.f4548a;
            if (z9 && Objects.equals(f10, this.f4549b) && q02 == this.f4550c && t22 == this.f4551d) {
                if (elapsedRealtime - this.f4552f >= i) {
                    ((rs1) lwVar.f14645w).f10282u.Y1(new ns1(2, new vn0(3, i), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f4552f = elapsedRealtime;
            this.f4549b = f10;
            this.f4550c = q02;
            this.f4551d = t22;
            io0Var.d(3);
            io0Var.f7185a.sendEmptyMessageDelayed(3, i);
            return;
        }
        io0Var.d(3);
        if (z3 && j10 != -9223372036854775807L) {
            ys1Var.Q0();
            io0Var.f7185a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j10 - p22)) / ys1Var.f12954r0.f11997o.f11870a));
        }
        this.e = false;
    }
}
