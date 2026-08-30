package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q9 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final hq0 f9775a;
    public long e;

    /* renamed from: g, reason: collision with root package name */
    public String f9780g;

    /* renamed from: h, reason: collision with root package name */
    public i3 f9781h;
    public p9 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9782j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9784l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f9779f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    public final w9 f9776b = new w9(7);

    /* renamed from: c, reason: collision with root package name */
    public final w9 f9777c = new w9(8);

    /* renamed from: d, reason: collision with root package name */
    public final w9 f9778d = new w9(6);

    /* renamed from: k, reason: collision with root package name */
    public long f9783k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public final xk0 f9785m = new xk0();

    public q9(hq0 hq0Var) {
        this.f9775a = hq0Var;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        faVar.a();
        faVar.b();
        this.f9780g = faVar.e;
        faVar.b();
        i3 A = p2Var.A(faVar.f5998d, 2);
        this.f9781h = A;
        this.i = new p9(A);
        this.f9775a.q(p2Var, faVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    @Override // com.google.android.gms.internal.ads.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.xk0 r15) {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.i3 r2 = r14.f9781h
            r2.getClass()
            java.lang.String r2 = com.google.android.gms.internal.ads.bq0.f4860a
            int r2 = r15.f12581b
            int r7 = r15.f12582c
            byte[] r8 = r15.f12580a
            long r3 = r14.e
            int r5 = r15.B()
            long r5 = (long) r5
            long r3 = r3 + r5
            r14.e = r3
            com.google.android.gms.internal.ads.i3 r3 = r14.f9781h
            int r4 = r15.B()
            r3.a(r4, r15)
        L20:
            boolean[] r1 = r14.f9779f
            int r1 = com.google.android.gms.internal.ads.xy.Z(r8, r2, r7, r1)
            com.google.android.gms.internal.ads.w9 r3 = r14.f9778d
            com.google.android.gms.internal.ads.w9 r4 = r14.f9777c
            com.google.android.gms.internal.ads.w9 r5 = r14.f9776b
            if (r1 == r7) goto L70
            int r6 = r1 + 3
            r6 = r8[r6]
            r9 = r6 & 31
            r6 = 3
            if (r1 <= 0) goto L40
            int r10 = r1 + (-1)
            r11 = r8[r10]
            if (r11 != 0) goto L40
            r6 = 4
        L3e:
            r11 = r6
            goto L42
        L40:
            r10 = r1
            goto L3e
        L42:
            int r1 = r10 - r2
            if (r1 <= 0) goto L53
            boolean r6 = r14.f9782j
            if (r6 != 0) goto L50
            r5.d(r8, r2, r10)
            r4.d(r8, r2, r10)
        L50:
            r3.d(r8, r2, r10)
        L53:
            int r5 = r7 - r10
            long r2 = r14.e
            long r12 = (long) r5
            long r2 = r2 - r12
            if (r1 >= 0) goto L5f
            int r1 = -r1
        L5c:
            r6 = r1
            r1 = r2
            goto L61
        L5f:
            r1 = 0
            goto L5c
        L61:
            long r3 = r14.f9783k
            r0 = r14
            r0.f(r1, r3, r5, r6)
            long r4 = r14.f9783k
            r3 = r9
            r0.e(r1, r3, r4)
            int r2 = r10 + r11
            goto L20
        L70:
            boolean r1 = r14.f9782j
            if (r1 != 0) goto L7a
            r5.d(r8, r2, r7)
            r4.d(r8, r2, r7)
        L7a:
            r3.d(r8, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q9.c(com.google.android.gms.internal.ads.xk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        boolean z3;
        this.f9783k = j10;
        int i10 = i & 2;
        boolean z9 = this.f9784l;
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f9784l = z3 | z9;
    }

    public final void e(long j10, int i, long j11) {
        if (!this.f9782j) {
            this.f9776b.c(i);
            this.f9777c.c(i);
        }
        this.f9778d.c(i);
        p9 p9Var = this.i;
        boolean z3 = this.f9784l;
        p9Var.f9441d = i;
        p9Var.f9442f = j11;
        p9Var.e = j10;
        p9Var.f9446k = z3;
    }

    public final void f(long j10, long j11, int i, int i10) {
        b2.d2 d2Var = (b2.d2) this.f9775a.f6874x;
        boolean z3 = true;
        if (!this.f9782j) {
            w9 w9Var = this.f9776b;
            w9Var.e(i10);
            w9 w9Var2 = this.f9777c;
            w9Var2.e(i10);
            boolean z9 = this.f9782j;
            boolean z10 = w9Var.f12172c;
            if (!z9) {
                if (z10 && w9Var2.f12172c) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf((byte[]) w9Var.e, w9Var.f12173d));
                    arrayList.add(Arrays.copyOf((byte[]) w9Var2.e, w9Var2.f12173d));
                    v11 S = xy.S((byte[]) w9Var.e, 4, w9Var.f12173d);
                    a2 a2Var = new a2((byte[]) w9Var2.e, 4, w9Var2.f12173d);
                    int r8 = a2Var.r();
                    a2Var.r();
                    a2Var.k();
                    a2Var.o();
                    ho0 ho0Var = new ho0(r8);
                    int i11 = S.f11771a;
                    int i12 = S.f11772b;
                    int i13 = S.f11773c;
                    byte[] bArr = va0.f11866a;
                    String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
                    i3 i3Var = this.f9781h;
                    rv1 rv1Var = new rv1();
                    rv1Var.f10296a = this.f9780g;
                    rv1Var.d("video/mp2t");
                    rv1Var.e("video/avc");
                    rv1Var.f10303j = format;
                    rv1Var.f10314u = S.e;
                    rv1Var.f10315v = S.f11775f;
                    rv1Var.E = new mk1(S.f11778j, S.f11779k, S.f11780l, null, S.f11777h + 8, S.i + 8);
                    rv1Var.B = S.f11776g;
                    rv1Var.f10310q = arrayList;
                    int i14 = S.f11781m;
                    rv1Var.f10309p = i14;
                    i3Var.e(new mw1(rv1Var));
                    this.f9782j = true;
                    d2Var.c(i14);
                    this.i.f9439b.append(S.f11774d, S);
                    this.i.f9440c.append(r8, ho0Var);
                    w9Var.a();
                    w9Var2.a();
                }
            } else if (z10) {
                v11 S2 = xy.S((byte[]) w9Var.e, 4, w9Var.f12173d);
                d2Var.c(S2.f11781m);
                this.i.f9439b.append(S2.f11774d, S2);
                w9Var.a();
            } else if (w9Var2.f12172c) {
                a2 a2Var2 = new a2((byte[]) w9Var2.e, 4, w9Var2.f12173d);
                int r10 = a2Var2.r();
                a2Var2.r();
                a2Var2.k();
                a2Var2.o();
                this.i.f9440c.append(r10, new ho0(r10));
                w9Var2.a();
            }
        }
        w9 w9Var3 = this.f9778d;
        if (w9Var3.e(i10)) {
            int o10 = xy.o((byte[]) w9Var3.e, w9Var3.f12173d);
            byte[] bArr2 = (byte[]) w9Var3.e;
            xk0 xk0Var = this.f9785m;
            xk0Var.z(bArr2, o10);
            xk0Var.E(4);
            d2Var.d(j11, xk0Var);
        }
        p9 p9Var = this.i;
        boolean z11 = this.f9782j;
        if (p9Var.f9441d == 9) {
            if (z11 && p9Var.f9443g) {
                long j12 = p9Var.e;
                int i15 = i + ((int) (j10 - j12));
                long j13 = p9Var.i;
                if (j13 != -9223372036854775807L) {
                    long j14 = p9Var.f9444h;
                    if (j12 != j14) {
                        p9Var.f9438a.c(j13, p9Var.f9445j ? 1 : 0, (int) (j12 - j14), i15, null);
                    }
                }
            }
            p9Var.f9444h = p9Var.e;
            p9Var.i = p9Var.f9442f;
            p9Var.f9445j = false;
            p9Var.f9443g = true;
        }
        boolean z12 = p9Var.f9446k;
        boolean z13 = p9Var.f9445j;
        int i16 = p9Var.f9441d;
        if (i16 != 5 && (!z12 || i16 != 1)) {
            z3 = false;
        }
        boolean z14 = z13 | z3;
        p9Var.f9445j = z14;
        p9Var.f9441d = 24;
        if (z14) {
            this.f9784l = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void n() {
        this.f9781h.getClass();
        String str = bq0.f4860a;
        ((b2.d2) this.f9775a.f6874x).e(0);
        f(this.e, this.f9783k, 0, 0);
        e(this.e, 9, this.f9783k);
        f(this.e, this.f9783k, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        this.e = 0L;
        this.f9784l = false;
        this.f9783k = -9223372036854775807L;
        xy.a0(this.f9779f);
        this.f9776b.a();
        this.f9777c.a();
        this.f9778d.a();
        ((b2.d2) this.f9775a.f6874x).e(0);
        p9 p9Var = this.i;
        if (p9Var != null) {
            p9Var.f9443g = false;
        }
    }
}
