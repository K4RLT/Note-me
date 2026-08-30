package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o31 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public String f8946u;

    /* renamed from: w, reason: collision with root package name */
    public final CharSequence f8948w;

    /* renamed from: x, reason: collision with root package name */
    public final z21 f8949x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f8950y;

    /* renamed from: v, reason: collision with root package name */
    public int f8947v = 2;

    /* renamed from: z, reason: collision with root package name */
    public int f8951z = 0;
    public int A = Integer.MAX_VALUE;

    public o31(mf mfVar, CharSequence charSequence) {
        this.f8949x = (z21) mfVar.f8337v;
        this.f8950y = mfVar.f8336u;
        this.f8948w = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z3;
        int a10;
        CharSequence charSequence;
        int b10;
        z21 z21Var;
        if (this.f8947v != 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        int i = this.f8947v;
        int i10 = i - 1;
        String str = null;
        if (i != 0) {
            if (i10 == 0) {
                return true;
            }
            if (i10 != 2) {
                this.f8947v = 4;
                int i11 = this.f8951z;
                while (true) {
                    int i12 = this.f8951z;
                    if (i12 != -1) {
                        a10 = a(i12);
                        charSequence = this.f8948w;
                        if (a10 == -1) {
                            a10 = charSequence.length();
                            this.f8951z = -1;
                            b10 = -1;
                        } else {
                            b10 = b(a10);
                            this.f8951z = b10;
                        }
                        if (b10 == i11) {
                            int i13 = b10 + 1;
                            this.f8951z = i13;
                            if (i13 > charSequence.length()) {
                                this.f8951z = -1;
                            }
                        } else {
                            while (true) {
                                z21Var = this.f8949x;
                                if (i11 >= a10 || !z21Var.a(charSequence.charAt(i11))) {
                                    break;
                                }
                                i11++;
                            }
                            while (a10 > i11) {
                                int i14 = a10 - 1;
                                if (!z21Var.a(charSequence.charAt(i14))) {
                                    break;
                                }
                                a10 = i14;
                            }
                            if (!this.f8950y || i11 != a10) {
                                break;
                            }
                            i11 = this.f8951z;
                        }
                    } else {
                        this.f8947v = 3;
                        break;
                    }
                }
                int i15 = this.A;
                if (i15 == 1) {
                    a10 = charSequence.length();
                    this.f8951z = -1;
                    while (a10 > i11) {
                        int i16 = a10 - 1;
                        if (!z21Var.a(charSequence.charAt(i16))) {
                            break;
                        }
                        a10 = i16;
                    }
                } else {
                    this.A = i15 - 1;
                }
                str = charSequence.subSequence(i11, a10).toString();
                this.f8946u = str;
                if (this.f8947v != 3) {
                    this.f8947v = 1;
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f8947v = 2;
            String str = this.f8946u;
            this.f8946u = null;
            return str;
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
