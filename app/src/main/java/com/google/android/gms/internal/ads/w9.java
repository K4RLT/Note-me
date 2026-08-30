package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w9 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12170a;

    /* renamed from: b, reason: collision with root package name */
    public int f12171b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12172c;

    /* renamed from: d, reason: collision with root package name */
    public int f12173d;
    public Object e;

    public w9(int i) {
        this.f12171b = i;
        byte[] bArr = new byte[131];
        this.e = bArr;
        bArr[2] = 1;
    }

    public void a() {
        this.f12170a = false;
        this.f12172c = false;
    }

    public void b(int i) {
        boolean z3 = true;
        if (1 != ((this.f12170a ? 1 : 0) | i)) {
            z3 = false;
        }
        this.f12170a = z3;
        this.f12171b += i;
    }

    public void c(int i) {
        boolean z3 = true;
        b80.K(!this.f12170a);
        if (i != this.f12171b) {
            z3 = false;
        }
        this.f12170a = z3;
        if (z3) {
            this.f12173d = 3;
            this.f12172c = false;
        }
    }

    public void d(byte[] bArr, int i, int i10) {
        if (!this.f12170a) {
            return;
        }
        int i11 = i10 - i;
        byte[] bArr2 = (byte[]) this.e;
        int length = bArr2.length;
        int i12 = this.f12173d + i11;
        if (length < i12) {
            this.e = Arrays.copyOf(bArr2, i12 + i12);
        }
        System.arraycopy(bArr, i, (byte[]) this.e, this.f12173d, i11);
        this.f12173d += i11;
    }

    public boolean e(int i) {
        if (!this.f12170a) {
            return false;
        }
        this.f12173d -= i;
        this.f12170a = false;
        this.f12172c = true;
        return true;
    }

    public w9(vt1 vt1Var) {
        this.e = vt1Var;
    }
}
