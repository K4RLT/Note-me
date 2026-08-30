package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class dy1 implements xx1, wx1 {
    public zy1 A;
    public xx1[] B;
    public nx1 C;

    /* renamed from: u, reason: collision with root package name */
    public final xx1[] f5549u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f5550v;

    /* renamed from: w, reason: collision with root package name */
    public final IdentityHashMap f5551w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f5552x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f5553y = new HashMap();

    /* renamed from: z, reason: collision with root package name */
    public Object f5554z;

    public dy1(long[] jArr, xx1... xx1VarArr) {
        this.f5549u = xx1VarArr;
        b51 b51Var = d51.f5314v;
        y51 y51Var = y51.f12781y;
        this.C = new nx1(y51Var, y51Var);
        this.f5551w = new IdentityHashMap();
        this.B = new xx1[0];
        this.f5550v = new boolean[xx1VarArr.length];
        for (int i = 0; i < xx1VarArr.length; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                this.f5550v[i] = true;
                this.f5549u[i] = new xy1(xx1VarArr[i], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void X(long j10) {
        for (xx1 xx1Var : this.B) {
            xx1Var.X(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean a() {
        return this.C.a();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long b(long j10) {
        long b10 = this.B[0].b(j10);
        int i = 1;
        while (true) {
            xx1[] xx1VarArr = this.B;
            if (i < xx1VarArr.length) {
                if (xx1VarArr[i].b(b10) == b10) {
                    i++;
                } else {
                    q.x.o("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else {
                return b10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long c() {
        return this.C.c();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void d(wx1 wx1Var, long j10) {
        this.f5554z = wx1Var;
        ArrayList arrayList = this.f5552x;
        xx1[] xx1VarArr = this.f5549u;
        Collections.addAll(arrayList, xx1VarArr);
        for (xx1 xx1Var : xx1VarArr) {
            xx1Var.d(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long e(long j10, du1 du1Var) {
        xx1 xx1Var;
        xx1[] xx1VarArr = this.B;
        if (xx1VarArr.length > 0) {
            xx1Var = xx1VarArr[0];
        } else {
            xx1Var = this.f5549u[0];
        }
        return xx1Var.e(j10, du1Var);
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean f(jt1 jt1Var) {
        ArrayList arrayList = this.f5552x;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((xx1) arrayList.get(i)).f(jt1Var);
            }
            return false;
        }
        return this.C.f(jt1Var);
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final void g(long j10) {
        this.C.g(j10);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.wx1, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.wx1
    public final void h(xx1 xx1Var) {
        xx1[] xx1VarArr;
        ArrayList arrayList = this.f5552x;
        arrayList.remove(xx1Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        int i10 = 0;
        while (true) {
            xx1VarArr = this.f5549u;
            if (i >= xx1VarArr.length) {
                break;
            }
            i10 += xx1VarArr[i].n().f13337a;
            i++;
        }
        hi[] hiVarArr = new hi[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < xx1VarArr.length; i12++) {
            zy1 n10 = xx1VarArr[i12].n();
            int i13 = n10.f13337a;
            int i14 = 0;
            while (i14 < i13) {
                hi a10 = n10.a(i14);
                int i15 = a10.f6819a;
                mw1[] mw1VarArr = new mw1[i15];
                int i16 = 0;
                while (i16 < i15) {
                    mw1 mw1Var = a10.f6822d[i16];
                    mw1Var.getClass();
                    rv1 rv1Var = new rv1(mw1Var);
                    String str = mw1Var.f8447a;
                    if (str == null) {
                        str = "";
                    }
                    xx1[] xx1VarArr2 = xx1VarArr;
                    int i17 = i11;
                    StringBuilder sb2 = new StringBuilder(str.length() + g3.a.d(i12, 1));
                    sb2.append(i12);
                    sb2.append(":");
                    sb2.append(str);
                    rv1Var.f10296a = sb2.toString();
                    String str2 = mw1Var.f8457m;
                    if (str2 != null) {
                        StringBuilder sb3 = new StringBuilder(g3.a.d(i12, 1) + str2.length());
                        sb3.append(i12);
                        sb3.append(":");
                        sb3.append(str2);
                        rv1Var.f10305l = sb3.toString();
                    }
                    mw1VarArr[i16] = new mw1(rv1Var);
                    i16++;
                    xx1VarArr = xx1VarArr2;
                    i11 = i17;
                }
                xx1[] xx1VarArr3 = xx1VarArr;
                int i18 = i11;
                String str3 = a10.f6820b;
                StringBuilder sb4 = new StringBuilder(g3.a.d(i12, 1) + String.valueOf(str3).length());
                sb4.append(i12);
                sb4.append(":");
                sb4.append(str3);
                hi hiVar = new hi(sb4.toString(), mw1VarArr);
                this.f5553y.put(hiVar, a10);
                i11 = i18 + 1;
                hiVarArr[i18] = hiVar;
                i14++;
                xx1VarArr = xx1VarArr3;
            }
        }
        this.A = new zy1(hiVarArr);
        Object r12 = this.f5554z;
        r12.getClass();
        r12.h(this);
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long i(r[] rVarArr, boolean[] zArr, sy1[] sy1VarArr, boolean[] zArr2, long j10) {
        int length;
        IdentityHashMap identityHashMap;
        sy1 sy1Var;
        int[] iArr;
        int[] iArr2;
        Integer num;
        int intValue;
        int length2 = rVarArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i = 0;
        int i10 = 0;
        while (true) {
            length = rVarArr.length;
            identityHashMap = this.f5551w;
            if (i10 >= length) {
                break;
            }
            sy1 sy1Var2 = sy1VarArr[i10];
            if (sy1Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(sy1Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr3[i10] = intValue;
            r rVar = rVarArr[i10];
            if (rVar != null) {
                String str = rVar.zza().f6820b;
                iArr4[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        sy1[] sy1VarArr2 = new sy1[length];
        sy1[] sy1VarArr3 = new sy1[length];
        r[] rVarArr2 = new r[length];
        xx1[] xx1VarArr = this.f5549u;
        ArrayList arrayList = new ArrayList(xx1VarArr.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < xx1VarArr.length) {
            int i12 = i;
            while (i12 < rVarArr.length) {
                if (iArr3[i12] == i11) {
                    sy1Var = sy1VarArr[i12];
                } else {
                    sy1Var = null;
                }
                sy1VarArr3[i12] = sy1Var;
                if (iArr4[i12] == i11) {
                    r rVar2 = rVarArr[i12];
                    rVar2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    hi hiVar = (hi) this.f5553y.get(rVar2.zza());
                    hiVar.getClass();
                    rVarArr2[i12] = new cy1(rVar2, hiVar);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    rVarArr2[i12] = null;
                }
                i12++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            xx1[] xx1VarArr2 = xx1VarArr;
            int i13 = i11;
            long i14 = xx1VarArr[i11].i(rVarArr2, zArr, sy1VarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = i14;
            } else if (i14 != j11) {
                q.x.o("Children enabled at different positions.");
                return 0L;
            }
            boolean z3 = false;
            for (int i15 = 0; i15 < rVarArr.length; i15++) {
                boolean z9 = true;
                if (iArr5[i15] == i13) {
                    sy1 sy1Var3 = sy1VarArr3[i15];
                    sy1Var3.getClass();
                    sy1VarArr2[i15] = sy1Var3;
                    identityHashMap.put(sy1Var3, Integer.valueOf(i13));
                    z3 = true;
                } else if (iArr6[i15] == i13) {
                    if (sy1VarArr3[i15] != null) {
                        z9 = false;
                    }
                    b80.K(z9);
                }
            }
            if (z3) {
                arrayList2.add(xx1VarArr2[i13]);
            }
            i11 = i13 + 1;
            arrayList = arrayList2;
            xx1VarArr = xx1VarArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i = 0;
        }
        int i16 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(sy1VarArr2, i16, sy1VarArr, i16, length);
        this.B = (xx1[]) arrayList3.toArray(new xx1[i16]);
        this.C = new nx1(arrayList3, ed1.C(arrayList3, b11.f4661f));
        return j11;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.wx1, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.wx1
    public final /* bridge */ /* synthetic */ void j(ty1 ty1Var) {
        com.google.android.gms.internal.ads.wx1 r12 = this.f5554z;
        r12.getClass();
        r12.j(this);
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void m() {
        int i = 0;
        while (true) {
            xx1[] xx1VarArr = this.f5549u;
            if (i < xx1VarArr.length) {
                xx1VarArr[i].m();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final zy1 n() {
        zy1 zy1Var = this.A;
        zy1Var.getClass();
        return zy1Var;
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long v() {
        long j10 = -9223372036854775807L;
        for (xx1 xx1Var : this.B) {
            long v2 = xx1Var.v();
            if (v2 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (xx1 xx1Var2 : this.B) {
                        if (xx1Var2 == xx1Var) {
                            break;
                        }
                        if (xx1Var2.b(v2) != v2) {
                            q.x.o("Unexpected child seekToUs result.");
                            return 0L;
                        }
                    }
                    j10 = v2;
                } else if (v2 != j10) {
                    q.x.o("Conflicting discontinuities.");
                    return 0L;
                }
            } else if (j10 != -9223372036854775807L && xx1Var.b(j10) != j10) {
                q.x.o("Unexpected child seekToUs result.");
                return 0L;
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long zzb() {
        return this.C.zzb();
    }
}
