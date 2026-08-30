package com.google.android.gms.internal.ads;
import r9.a;
import r9.d;

/* loaded from: classes.dex */
public final class lu1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8155a;

    /* renamed from: b, reason: collision with root package name */
    public int f8156b;

    /* renamed from: c, reason: collision with root package name */
    public long f8157c;

    /* renamed from: d, reason: collision with root package name */
    public final yx1 f8158d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mu1 f8160g;

    public lu1(mu1 mu1Var, String str, int i, yx1 yx1Var) {
        long j10;
        this.f8160g = mu1Var;
        this.f8155a = str;
        this.f8156b = i;
        if (yx1Var == null) {
            j10 = -1;
        } else {
            j10 = yx1Var.f13006d;
        }
        this.f8157c = j10;
        if (yx1Var != null && yx1Var.b()) {
            this.f8158d = yx1Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.a()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.google.android.gms.internal.ads.uh r8, com.google.android.gms.internal.ads.uh r9) {
        /*
            r7 = this;
            int r0 = r7.f8156b
            int r1 = r8.a()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r8 = r9.a()
            if (r0 >= r8) goto L11
            goto L38
        L11:
            r0 = r3
            goto L38
        L13:
            com.google.android.gms.internal.ads.mu1 r1 = r7.f8160g
            com.google.android.gms.internal.ads.ah r4 = r1.f8429a
            r5 = 0
            r8.b(r0, r4, r5)
            int r0 = r4.f4506k
        L1e:
            int r5 = r4.f4507l
            if (r0 > r5) goto L11
            java.lang.Object r5 = r8.f(r0)
            int r5 = r9.e(r5)
            if (r5 == r3) goto L35
            com.google.android.gms.internal.ads.qg r8 = r1.f8430b
            com.google.android.gms.internal.ads.qg r8 = r9.d(r5, r8, r2)
            int r0 = r8.f9841c
            goto L38
        L35:
            int r0 = r0 + 1
            goto L1e
        L38:
            r7.f8156b = r0
            if (r0 != r3) goto L3d
            goto L4c
        L3d:
            com.google.android.gms.internal.ads.yx1 r8 = r7.f8158d
            if (r8 != 0) goto L42
            goto L4a
        L42:
            java.lang.Object r8 = r8.f13003a
            int r8 = r9.e(r8)
            if (r8 == r3) goto L4c
        L4a:
            r8 = 1
            return r8
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lu1.a(com.google.android.gms.internal.ads.uh, com.google.android.gms.internal.ads.uh):boolean");
    }

    public final boolean b(gu1 gu1Var) {
        yx1 yx1Var = gu1Var.f6462d;
        if (yx1Var == null) {
            if (this.f8156b != gu1Var.f6461c) {
                return true;
            }
            return false;
        }
        long j10 = this.f8157c;
        if (j10 != -1) {
            long j11 = yx1Var.f13006d;
            if (j11 <= j10) {
                yx1 yx1Var2 = this.f8158d;
                if (yx1Var2 != null) {
                    uh uhVar = gu1Var.f6460b;
                    int e = uhVar.e(yx1Var.f13003a);
                    int e8 = uhVar.e(yx1Var2.f13003a);
                    long j12 = yx1Var2.f13006d;
                    int i = yx1Var2.f13004b;
                    if (j11 >= j12 && e >= e8) {
                        if (e <= e8) {
                            if (yx1Var.b()) {
                                int i10 = yx1Var.f13004b;
                                int i11 = yx1Var.f13005c;
                                if (i10 <= i) {
                                    if (i10 == i && i11 > yx1Var2.f13005c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = yx1Var.e;
                            if (i12 == -1 || i12 > i) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
