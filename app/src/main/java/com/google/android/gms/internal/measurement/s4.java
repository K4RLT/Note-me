package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class s4 implements Serializable, Iterable {

    /* renamed from: w, reason: collision with root package name */
    public static final s4 f13907w = new s4(d5.f13687b);

    /* renamed from: x, reason: collision with root package name */
    public static final c5 f13908x = new c5(4);

    /* renamed from: u, reason: collision with root package name */
    public int f13909u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f13910v;

    public s4(byte[] bArr) {
        bArr.getClass();
        this.f13910v = bArr;
    }

    public static int b(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) < 0) {
            if (i >= 0) {
                if (i10 < i) {
                    q.x.l(w7.i1.c("Beginning index larger than ending index: ", i, i10, ", "));
                    return 0;
                }
                q.x.l(w7.i1.c("End index: ", i10, i11, " >= "));
                return 0;
            }
            q.x.l(g3.a.i("Beginning index: ", i, " < 0"));
            return 0;
        }
        return i12;
    }

    public static s4 d(byte[] bArr, int i, int i10) {
        b(i, i + i10, bArr.length);
        f13908x.getClass();
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return new s4(bArr2);
    }

    public byte a(int i) {
        return this.f13910v[i];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof s4) && k() == ((s4) obj).k()) {
                if (k() != 0) {
                    if (obj instanceof s4) {
                        s4 s4Var = (s4) obj;
                        int i = this.f13909u;
                        int i10 = s4Var.f13909u;
                        if (i == 0 || i10 == 0 || i == i10) {
                            int k3 = k();
                            if (k3 <= s4Var.k()) {
                                if (k3 <= s4Var.k()) {
                                    byte[] bArr = s4Var.f13910v;
                                    int n10 = n() + k3;
                                    int n11 = n();
                                    int n12 = s4Var.n();
                                    while (n11 < n10) {
                                        if (this.f13910v[n11] != bArr[n12]) {
                                            return false;
                                        }
                                        n11++;
                                        n12++;
                                    }
                                    return true;
                                }
                                q.x.n(w7.i1.c("Ran off end of other: 0, ", k3, s4Var.k(), ", "));
                                return false;
                            }
                            androidx.datastore.preferences.protobuf.s1.c(k3, k());
                            return false;
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public byte g(int i) {
        return this.f13910v[i];
    }

    public final int hashCode() {
        int i = this.f13909u;
        if (i == 0) {
            int k3 = k();
            int n10 = n();
            int i10 = k3;
            for (int i11 = n10; i11 < n10 + k3; i11++) {
                i10 = (i10 * 31) + this.f13910v[i11];
            }
            if (i10 == 0) {
                i10 = 1;
            }
            this.f13909u = i10;
            return i10;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public int k() {
        return this.f13910v.length;
    }

    public int n() {
        return 0;
    }

    public final String toString() {
        s4 r4Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int k3 = k();
        if (k() <= 50) {
            concat = w3.b(this);
        } else {
            int b10 = b(0, 47, k());
            if (b10 == 0) {
                r4Var = f13907w;
            } else {
                r4Var = new r4(this.f13910v, n(), b10);
            }
            concat = w3.b(r4Var).concat("...");
        }
        return a5.a.k(a5.a.m("<ByteString@", hexString, " size=", k3, " contents=\""), concat, "\">");
    }
}
