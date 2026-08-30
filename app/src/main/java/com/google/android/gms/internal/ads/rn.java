package com.google.android.gms.internal.ads;
import c9.c;
import g9.w2;
import ga.a;
import q9.d;
import r0.e;
import r0.i;
import wa.e7;
import z8.t;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class rn extends a {
    public static final Parcelable.Creator<rn> CREATOR = new bj(2);
    public final boolean A;
    public final int B;
    public final int C;
    public final boolean D;
    public final int E;

    /* renamed from: u, reason: collision with root package name */
    public final int f10248u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f10249v;

    /* renamed from: w, reason: collision with root package name */
    public final int f10250w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f10251x;

    /* renamed from: y, reason: collision with root package name */
    public final int f10252y;

    /* renamed from: z, reason: collision with root package name */
    public final w2 f10253z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rn(c r13) {
        /*
            r12 = this;
            boolean r2 = r13.f4007a
            int r3 = r13.f4008b
            boolean r4 = r13.f4010d
            int r5 = r13.e
            t r0 = r13.f4011f
            if (r0 == 0) goto L13
            w2 r1 = new w2
            r1.<init>(r0)
        L11:
            r6 = r1
            goto L15
        L13:
            r1 = 0
            goto L11
        L15:
            boolean r7 = r13.f4012g
            int r8 = r13.f4009c
            r10 = 0
            r11 = 0
            r1 = 4
            r9 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rn.<init>(c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d a(com.google.android.gms.internal.ads.rn r5) {
        /*
            d r0 = new d
            r0.<init>()
            if (r5 != 0) goto Ld
            d r5 = new d
            r5.<init>(r0)
            return r5
        Ld:
            int r1 = r5.f10248u
            r2 = 2
            if (r1 == r2) goto L43
            r3 = 3
            if (r1 == r3) goto L38
            r4 = 4
            if (r1 == r4) goto L19
            goto L47
        L19:
            boolean r1 = r5.A
            r0.f23615f = r1
            int r1 = r5.B
            r0.f23612b = r1
            int r1 = r5.C
            boolean r4 = r5.D
            r0.f23616g = r4
            r0.f23617h = r1
            int r1 = r5.E
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            i = r2
        L38:
            w2 r1 = r5.f10253z
            if (r1 == 0) goto L43
            t r2 = new t
            r2.<init>(r1)
            e = r2
        L43:
            int r1 = r5.f10252y
            r0.f23614d = r1
        L47:
            boolean r1 = r5.f10249v
            r0.f23611a = r1
            boolean r5 = r5.f10251x
            r0.f23613c = r5
            d r5 = new d
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rn.a(com.google.android.gms.internal.ads.rn):d");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f10248u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f10249v ? 1 : 0);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f10250w);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f10251x ? 1 : 0);
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f10252y);
        e7.d(parcel, 6, this.f10253z, i);
        e7.j(parcel, 7, 4);
        parcel.writeInt(this.A ? 1 : 0);
        e7.j(parcel, 8, 4);
        parcel.writeInt(this.B);
        e7.j(parcel, 9, 4);
        parcel.writeInt(this.C);
        e7.j(parcel, 10, 4);
        parcel.writeInt(this.D ? 1 : 0);
        e7.j(parcel, 11, 4);
        parcel.writeInt(this.E);
        e7.l(parcel, k3);
    }

    public rn(int i, boolean z3, int i10, boolean z9, int i11, w2 w2Var, boolean z10, int i12, int i13, boolean z11, int i14) {
        this.f10248u = i;
        this.f10249v = z3;
        this.f10250w = i10;
        this.f10251x = z9;
        this.f10252y = i11;
        this.f10253z = w2Var;
        this.A = z10;
        this.B = i12;
        this.D = z11;
        this.C = i13;
        this.E = i14;
    }
}
