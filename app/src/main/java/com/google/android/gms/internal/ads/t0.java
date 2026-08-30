package com.google.android.gms.internal.ads;
import r0.a;
import r0.b;
import r0.c;
import r7.e;
import t0.a;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f11211c;
    public int e;

    /* renamed from: h, reason: collision with root package name */
    public long f11215h;
    public final r0 i;

    /* renamed from: a, reason: collision with root package name */
    public s0 f11209a = new s0();

    /* renamed from: b, reason: collision with root package name */
    public s0 f11210b = new s0();

    /* renamed from: d, reason: collision with root package name */
    public long f11212d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public float f11213f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f11214g = -1.0f;

    public t0(r0 r0Var) {
        this.i = r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r0 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r8) {
        /*
            r7 = this;
            long r0 = r7.f11212d
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = r7.f11215h
            r2 = 1
            long r0 = r0 + r2
            r7.f11215h = r0
            com.google.android.gms.internal.ads.s0 r0 = r7.f11209a
            c(r8)
            com.google.android.gms.internal.ads.s0 r0 = r7.f11209a
            boolean r0 = b()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            r7.f11211c = r2
            goto L5b
        L20:
            long r3 = r7.f11212d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L5b
            boolean r0 = r7.f11211c
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.s0 r0 = r7.f11210b
            long r3 = r0.f10411d
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L3b
            r0 = r2
            goto L46
        L3b:
            boolean[] r0 = r0.f10413g
            r5 = -1
            long r3 = r3 + r5
            r5 = 15
            long r3 = r3 % r5
            int r3 = (int) r3
            boolean r0 = r0[r3]
        L46:
            if (r0 == 0) goto L54
        L48:
            com.google.android.gms.internal.ads.s0 r0 = r7.f11210b
            a()
            com.google.android.gms.internal.ads.s0 r0 = r7.f11210b
            long r3 = r7.f11212d
            c(r3)
        L54:
            r7.f11211c = r1
            com.google.android.gms.internal.ads.s0 r0 = r7.f11210b
            c(r8)
        L5b:
            boolean r0 = r7.f11211c
            if (r0 == 0) goto L71
            com.google.android.gms.internal.ads.s0 r0 = r7.f11210b
            boolean r0 = b()
            if (r0 == 0) goto L71
            com.google.android.gms.internal.ads.s0 r0 = r7.f11209a
            com.google.android.gms.internal.ads.s0 r3 = r7.f11210b
            r7.f11209a = r3
            r7.f11210b = r0
            r7.f11211c = r2
        L71:
            r7.f11212d = r8
            com.google.android.gms.internal.ads.s0 r8 = r7.f11209a
            boolean r8 = r8.b()
            if (r8 == 0) goto L7c
            goto L80
        L7c:
            int r8 = e
            int r2 = r8 + 1
        L80:
            e = r2
            r7.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a(long):void");
    }

    public final long b() {
        if (this.f11209a.b()) {
            s0 s0Var = this.f11209a;
            long j10 = s0Var.e;
            if (j10 == 0) {
                return 0L;
            }
            return s0Var.f10412f / j10;
        }
        return -9223372036854775807L;
    }

    public final void c() {
        float f10;
        boolean b10 = this.f11209a.b();
        if (b10) {
            s0 s0Var = this.f11209a;
            long j10 = s0Var.e;
            long j11 = 0;
            if (j10 != 0) {
                j11 = s0Var.f10412f / j10;
            }
            f10 = (float) (1.0E9d / j11);
        } else {
            f10 = this.f11213f;
        }
        float f11 = this.f11214g;
        if (f10 != f11) {
            if (f10 != -1.0f && f11 != -1.0f) {
                float f12 = 1.0f;
                if (b10 && this.f11209a.f10412f >= 5000000000L) {
                    f12 = 0.1f;
                }
                if (Math.abs(f10 - f11) < f12) {
                    return;
                }
            } else if (f10 == -1.0f && this.e < 30) {
                return;
            }
            this.f11214g = f10;
            this.i.g(f10);
        }
    }
}
