package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class gn0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6435a;

    /* renamed from: b, reason: collision with root package name */
    public int f6436b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6437c;

    /* renamed from: d, reason: collision with root package name */
    public long f6438d;
    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_digital_ink.lw e;

    public gn0(com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar, int i) {
        this.e = lwVar;
        this.f6435a = i;
    }

    public final void a() {
        com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = this.e;
        ys1 ys1Var = (ys1) lwVar.f14643u;
        io0 io0Var = (io0) lwVar.f14647y;
        int A1 = ys1Var.A1();
        ys1 ys1Var2 = (ys1) lwVar.f14643u;
        if (ys1Var2.E1() && ys1Var2.x1() != 1 && ys1Var2.x1() != 4 && A1 != 0 && A1 != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z3 = this.f6437c;
            int i = this.f6435a;
            if (z3 && this.f6436b == A1) {
                if (elapsedRealtime - this.f6438d >= i) {
                    ((rs1) lwVar.f14645w).f10282u.Y1(new ns1(2, new vn0(4, i), 1003));
                    return;
                }
                return;
            }
            this.f6437c = true;
            this.f6438d = elapsedRealtime;
            this.f6436b = A1;
            io0Var.d(4);
            io0Var.f7185a.sendEmptyMessageDelayed(4, i);
            return;
        }
        if (this.f6437c) {
            io0Var.d(4);
        }
        this.f6437c = false;
    }
}
