package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    public final hi f10404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10405b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f10406c;

    /* renamed from: d, reason: collision with root package name */
    public final mw1[] f10407d;
    public int e;

    public s(hi hiVar, int[] iArr) {
        boolean z3;
        mw1[] mw1VarArr;
        int length = iArr.length;
        if (length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        hiVar.getClass();
        mw1[] mw1VarArr2 = hiVar.f6822d;
        this.f10404a = hiVar;
        this.f10405b = length;
        this.f10407d = new mw1[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            mw1VarArr = this.f10407d;
            if (i >= length2) {
                break;
            }
            mw1VarArr[i] = mw1VarArr2[iArr[i]];
            i++;
        }
        Arrays.sort(mw1VarArr, c.L);
        this.f10406c = new int[this.f10405b];
        for (int i10 = 0; i10 < this.f10405b; i10++) {
            int[] iArr2 = this.f10406c;
            mw1 mw1Var = this.f10407d[i10];
            int i11 = 0;
            while (true) {
                if (i11 < mw1VarArr2.length) {
                    if (mw1Var == mw1VarArr2[i11]) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            iArr2[i10] = i11;
        }
    }

    public static void b(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (int i = 0; i < 2; i++) {
            j10 += jArr[i];
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a51 a51Var = (a51) arrayList.get(i10);
            if (a51Var != null) {
                a51Var.a(new bz1(j10, jArr[i10]));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r
    public final int a() {
        return this.f10406c.length;
    }

    @Override // com.google.android.gms.internal.ads.r
    public final mw1 c() {
        return this.f10407d[0];
    }

    @Override // com.google.android.gms.internal.ads.r
    public final int d() {
        return this.f10406c[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f10404a.equals(sVar.f10404a) && Arrays.equals(this.f10406c, sVar.f10406c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.f10406c) + (System.identityHashCode(this.f10404a) * 31);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.r
    public final int o0(int i) {
        for (int i10 = 0; i10 < this.f10405b; i10++) {
            if (this.f10406c[i10] == i) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.r
    public final int u(int i) {
        return this.f10406c[i];
    }

    @Override // com.google.android.gms.internal.ads.r
    public final mw1 w(int i) {
        return this.f10407d[i];
    }

    @Override // com.google.android.gms.internal.ads.r
    public final hi zza() {
        return this.f10404a;
    }
}
