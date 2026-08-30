package com.google.android.gms.internal.consent_sdk;
import a5.a;
import g3.a;
import i1.c;
import q.x;
import s1.c;
import z.b;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class h5 implements Iterable, Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final h5 f13430w = new h5(u5.f13576b);

    /* renamed from: u, reason: collision with root package name */
    public int f13431u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f13432v;

    static {
        int i = e5.f13399a;
    }

    public h5(byte[] bArr) {
        bArr.getClass();
        this.f13432v = bArr;
    }

    public static void k(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        x.l(a.g(i, "End index: 47 >= "));
    }

    public byte a(int i) {
        return this.f13432v[i];
    }

    public byte b(int i) {
        return this.f13432v[i];
    }

    public int d() {
        return this.f13432v.length;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h5) {
                h5 h5Var = (h5) obj;
                int d2 = d();
                if (d2 == h5Var.d()) {
                    if (d2 != 0) {
                        int i = this.f13431u;
                        int i10 = h5Var.f13431u;
                        if (i != 0 && i10 != 0 && i != i10) {
                            return false;
                        }
                        return g(h5Var);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean g(h5 h5Var) {
        if (h5Var instanceof h5) {
            int d2 = d();
            if (d2 <= h5Var.d()) {
                if (d2 <= h5Var.d()) {
                    byte[] bArr = h5Var.f13432v;
                    int i = 0;
                    int i10 = 0;
                    while (i < d2) {
                        if (this.f13432v[i] != bArr[i10]) {
                            return false;
                        }
                        i++;
                        i10++;
                    }
                    return true;
                }
                x.n(w7.c("Ran off end of other: 0, ", d2, h5Var.d(), ", "));
                return false;
            }
            androidx.datastore.preferences.protobuf.c(d2, d());
            return false;
        }
        return h5Var.g(this);
    }

    public final int hashCode() {
        int i = this.f13431u;
        if (i == 0) {
            int d2 = d();
            int i10 = d2;
            for (int i11 = 0; i11 < d2; i11++) {
                i10 = (i10 * 31) + this.f13432v[i11];
            }
            if (i10 == 0) {
                i10 = 1;
            }
            this.f13431u = i10;
            return i10;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d2 = d();
        if (d() <= 50) {
            concat = b(this);
        } else {
            k(d());
            byte[] bArr = this.f13432v;
            h5 h5Var = new h5(bArr);
            k(bArr.length);
            concat = b(h5Var).concat("...");
        }
        return a.k(a.m("<ByteString@", hexString, " size=", d2, " contents=\""), concat, "\">");
    }
}
