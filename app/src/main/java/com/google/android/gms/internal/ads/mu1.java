package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final class mu1 {

    /* renamed from: h, reason: collision with root package name */
    public static final Random f8428h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public su1 f8432d;

    /* renamed from: f, reason: collision with root package name */
    public String f8433f;

    /* renamed from: a, reason: collision with root package name */
    public final ah f8429a = new ah();

    /* renamed from: b, reason: collision with root package name */
    public final qg f8430b = new qg();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8431c = new HashMap();
    public uh e = uh.f11636a;

    /* renamed from: g, reason: collision with root package name */
    public long f8434g = -1;

    public final synchronized String a(uh uhVar, yx1 yx1Var) {
        return e(uhVar.o(yx1Var.f13003a, this.f8430b).f9841c, yx1Var).f8155a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r6 < r10) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(com.google.android.gms.internal.ads.gu1 r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mu1.b(com.google.android.gms.internal.ads.gu1):void");
    }

    public final void c(gu1 gu1Var) {
        yx1 yx1Var;
        boolean g8 = gu1Var.f6460b.g();
        String str = this.f8433f;
        HashMap hashMap = this.f8431c;
        if (g8) {
            if (str != null) {
                lu1 lu1Var = (lu1) hashMap.get(str);
                lu1Var.getClass();
                d(lu1Var);
                return;
            }
            return;
        }
        lu1 lu1Var2 = (lu1) hashMap.get(str);
        int i = gu1Var.f6461c;
        yx1 yx1Var2 = gu1Var.f6462d;
        this.f8433f = e(i, yx1Var2).f8155a;
        b(gu1Var);
        if (yx1Var2 != null) {
            long j10 = yx1Var2.f13006d;
            if (yx1Var2.b()) {
                if (lu1Var2 != null && lu1Var2.f8157c == j10 && (yx1Var = lu1Var2.f8158d) != null) {
                    if (yx1Var.f13004b == yx1Var2.f13004b) {
                        if (yx1Var.f13005c == yx1Var2.f13005c) {
                            return;
                        }
                    }
                }
                e(i, new yx1(j10, yx1Var2.f13003a));
            }
        }
    }

    public final void d(lu1 lu1Var) {
        long j10 = lu1Var.f8157c;
        if (j10 != -1 && lu1Var.e) {
            this.f8434g = j10;
        }
        this.f8433f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.lu1 e(int r19, com.google.android.gms.internal.ads.yx1 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.f8431c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.ads.lu1 r8 = (com.google.android.gms.internal.ads.lu1) r8
            long r9 = r8.f8157c
            com.google.android.gms.internal.ads.yx1 r11 = r8.f8158d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.f8156b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            com.google.android.gms.internal.ads.mu1 r9 = r8.f8160g
            long r14 = r2.f13006d
            java.util.HashMap r10 = r9.f8431c
            r16 = r12
            java.lang.String r12 = r9.f8433f
            java.lang.Object r10 = r10.get(r12)
            com.google.android.gms.internal.ads.lu1 r10 = (com.google.android.gms.internal.ads.lu1) r10
            if (r10 == 0) goto L4b
            long r12 = r10.f8157c
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 == 0) goto L4b
            goto L50
        L4b:
            long r9 = r9.f8434g
            r12 = 1
            long r12 = r12 + r9
        L50:
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 < 0) goto L59
            r8.f8157c = r14
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 == 0) goto L84
            long r9 = r2.f13006d
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L84
        L62:
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.f8157c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L88
        L71:
            long r12 = r11.f13006d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.f13004b
            int r10 = r11.f13004b
            if (r9 != r10) goto L16
            int r9 = r2.f13005c
            int r10 = r11.f13005c
            if (r9 != r10) goto L16
            goto L88
        L84:
            int r9 = r8.f8156b
            if (r1 != r9) goto L16
        L88:
            long r9 = r8.f8157c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 >= 0) goto L93
            goto La0
        L93:
            if (r12 != 0) goto L16
            java.lang.String r9 = com.google.android.gms.internal.ads.bq0.f4860a
            com.google.android.gms.internal.ads.yx1 r9 = r7.f8158d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r7 = r8
            goto L16
        La0:
            r7 = r8
            r5 = r9
            goto L16
        La4:
            if (r7 != 0) goto Lbe
            r4 = 12
            byte[] r4 = new byte[r4]
            java.util.Random r5 = com.google.android.gms.internal.ads.mu1.f8428h
            r5.nextBytes(r4)
            r5 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            com.google.android.gms.internal.ads.lu1 r5 = new com.google.android.gms.internal.ads.lu1
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
            return r5
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mu1.e(int, com.google.android.gms.internal.ads.yx1):com.google.android.gms.internal.ads.lu1");
    }
}
