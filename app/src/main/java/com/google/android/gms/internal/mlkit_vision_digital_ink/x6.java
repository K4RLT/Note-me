package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;

import java.util.Set;

/* loaded from: classes.dex */
public final class x6 extends a7 {

    /* renamed from: b, reason: collision with root package name */
    public final gn f15230b;

    /* renamed from: c, reason: collision with root package name */
    public final gn f15231c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f15232d;
    public final int e;

    public x6(gn gnVar, gn gnVar2) {
        boolean z3;
        int i;
        this.f15230b = gnVar;
        this.f15231c = gnVar2;
        int a10 = gnVar2.a();
        if (a10 <= 28) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            int[] iArr = new int[a10];
            this.f15232d = iArr;
            long j10 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i10 < a10) {
                d6 d2 = d(i10);
                long j11 = d2.e | j10;
                if (j11 == j10) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                            if (d2.equals(d(iArr[i12] & 31))) {
                                break;
                            } else {
                                i12++;
                            }
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    if (i12 != -1) {
                        if (d2.f14186c) {
                            i = iArr[i12] | (1 << (i10 + 4));
                        } else {
                            i = i10;
                        }
                        iArr[i12] = i;
                        i10++;
                        j10 = j11;
                    }
                }
                iArr[i11] = i10;
                i11++;
                i10++;
                j10 = j11;
            }
            this.e = i11;
            return;
        }
        x.n("metadata size too large");
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.a7
    public final int a() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.a7
    public final Set b() {
        return new androidx.datastore.preferences.protobuf.h1(3, this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.a7
    public final void c(u6 u6Var, p6 p6Var) {
        for (int i = 0; i < this.e; i++) {
            int i10 = this.f15232d[i];
            d6 d2 = d(i10 & 31);
            if (!d2.f14186c) {
                gn gnVar = this.f15230b;
                int a10 = gnVar.a();
                if (i10 >= a10) {
                    gnVar = this.f15231c;
                    i10 -= a10;
                }
                u6Var.a(d2, d2.f14185b.cast(gnVar.r(i10)), p6Var);
            } else {
                u6Var.b(d2, new w6(this, d2, i10), p6Var);
            }
        }
    }

    public final d6 d(int i) {
        gn gnVar = this.f15230b;
        int a10 = gnVar.a();
        if (i >= a10) {
            return this.f15231c.i(i - a10);
        }
        return gnVar.i(i);
    }
}
