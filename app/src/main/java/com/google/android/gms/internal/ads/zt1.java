package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zt1 extends uh {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f13263k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f13264b;

    /* renamed from: c, reason: collision with root package name */
    public final uy1 f13265c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13266d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f13267f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f13268g;

    /* renamed from: h, reason: collision with root package name */
    public final uh[] f13269h;
    public final Object[] i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f13270j;

    public zt1(uh[] uhVarArr, Object[] objArr, uy1 uy1Var) {
        this.f13265c = uy1Var;
        this.f13264b = uy1Var.f11756b.length;
        this.f13269h = uhVarArr;
        int length = uhVarArr.length;
        this.f13267f = new int[length];
        this.f13268g = new int[length];
        this.i = objArr;
        this.f13270j = new HashMap();
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i < uhVarArr.length) {
            uh uhVar = uhVarArr[i];
            this.f13269h[i12] = uhVar;
            this.f13268g[i12] = i10;
            this.f13267f[i12] = i11;
            i10 += uhVar.a();
            i11 += this.f13269h[i12].c();
            this.f13270j.put(objArr[i12], Integer.valueOf(i12));
            i++;
            i12++;
        }
        this.f13266d = i10;
        this.e = i11;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int a() {
        return this.f13266d;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final ah b(int i, ah ahVar, long j10) {
        int[] iArr = this.f13268g;
        int r8 = bq0.r(iArr, i + 1, false, false);
        int i10 = iArr[r8];
        int i11 = this.f13267f[r8];
        this.f13269h[r8].b(i - i10, ahVar, j10);
        Object obj = this.i[r8];
        if (!ah.f4496m.equals(ahVar.f4498a)) {
            obj = Pair.create(obj, ahVar.f4498a);
        }
        ahVar.f4498a = obj;
        ahVar.f4506k += i11;
        ahVar.f4507l += i11;
        return ahVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final qg d(int i, qg qgVar, boolean z3) {
        int[] iArr = this.f13267f;
        int r8 = bq0.r(iArr, i + 1, false, false);
        int i10 = this.f13268g[r8];
        this.f13269h[r8].d(i - iArr[r8], qgVar, z3);
        qgVar.f9841c += i10;
        if (z3) {
            Object obj = this.i[r8];
            Object obj2 = qgVar.f9840b;
            obj2.getClass();
            qgVar.f9840b = Pair.create(obj, obj2);
        }
        return qgVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int e(Object obj) {
        int intValue;
        int e;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f13270j.get(obj2);
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            if (intValue != -1 && (e = this.f13269h[intValue].e(obj3)) != -1) {
                return this.f13267f[intValue] + e;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final Object f(int i) {
        int[] iArr = this.f13267f;
        int r8 = bq0.r(iArr, i + 1, false, false);
        return Pair.create(this.i[r8], this.f13269h[r8].f(i - iArr[r8]));
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int h(int i, int i10, boolean z3) {
        int[] iArr = this.f13268g;
        int i11 = 0;
        int r8 = bq0.r(iArr, i + 1, false, false);
        int i12 = iArr[r8];
        uh[] uhVarArr = this.f13269h;
        uh uhVar = uhVarArr[r8];
        int i13 = i - i12;
        if (i10 != 2) {
            i11 = i10;
        }
        int h3 = uhVar.h(i13, i11, z3);
        if (h3 != -1) {
            return i12 + h3;
        }
        int p10 = p(r8, z3);
        while (p10 != -1 && uhVarArr[p10].g()) {
            p10 = p(p10, z3);
        }
        if (p10 != -1) {
            return uhVarArr[p10].k(z3) + iArr[p10];
        }
        if (i10 != 2) {
            return -1;
        }
        return k(z3);
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int i(int i) {
        int[] iArr = this.f13268g;
        int r8 = bq0.r(iArr, i + 1, false, false);
        int i10 = iArr[r8];
        uh[] uhVarArr = this.f13269h;
        int i11 = uhVarArr[r8].i(i - i10);
        if (i11 != -1) {
            return i10 + i11;
        }
        int q10 = q(r8, false);
        while (q10 != -1 && uhVarArr[q10].g()) {
            q10 = q(q10, false);
        }
        if (q10 == -1) {
            return -1;
        }
        return uhVarArr[q10].j(false) + iArr[q10];
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int j(boolean z3) {
        int i;
        int i10 = this.f13264b;
        if (i10 != 0) {
            if (z3) {
                int[] iArr = this.f13265c.f11756b;
                int length = iArr.length;
                if (length > 0) {
                    i = iArr[length - 1];
                } else {
                    i = -1;
                }
            } else {
                i = i10 - 1;
            }
            do {
                uh[] uhVarArr = this.f13269h;
                if (uhVarArr[i].g()) {
                    i = q(i, z3);
                } else {
                    return uhVarArr[i].j(z3) + this.f13268g[i];
                }
            } while (i != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int k(boolean z3) {
        if (this.f13264b != 0) {
            int i = 0;
            if (z3) {
                int[] iArr = this.f13265c.f11756b;
                if (iArr.length > 0) {
                    i = iArr[0];
                } else {
                    i = -1;
                }
            }
            do {
                uh[] uhVarArr = this.f13269h;
                if (uhVarArr[i].g()) {
                    i = p(i, z3);
                } else {
                    return uhVarArr[i].k(z3) + this.f13268g[i];
                }
            } while (i != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final qg o(Object obj, qg qgVar) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f13270j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i = this.f13268g[intValue];
        this.f13269h[intValue].o(obj3, qgVar);
        qgVar.f9841c += i;
        qgVar.f9840b = obj;
        return qgVar;
    }

    public final int p(int i, boolean z3) {
        if (z3) {
            uy1 uy1Var = this.f13265c;
            int i10 = uy1Var.f11757c[i] + 1;
            int[] iArr = uy1Var.f11756b;
            if (i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }
        if (i >= this.f13264b - 1) {
            return -1;
        }
        return i + 1;
    }

    public final int q(int i, boolean z3) {
        if (z3) {
            uy1 uy1Var = this.f13265c;
            int i10 = uy1Var.f11757c[i] - 1;
            if (i10 < 0) {
                return -1;
            }
            return uy1Var.f11756b[i10];
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zt1(java.util.List r7, com.google.android.gms.internal.ads.uy1 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.uh[] r0 = new com.google.android.gms.internal.ads.uh[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.ot1 r4 = (com.google.android.gms.internal.ads.ot1) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.uh r4 = r4.zzb()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.ot1 r3 = (com.google.android.gms.internal.ads.ot1) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zza()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zt1.<init>(java.util.List, com.google.android.gms.internal.ads.uy1):void");
    }
}
