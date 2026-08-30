package com.google.android.gms.internal.play_billing;
import g3.a;
import i1.c;
import q.x;
import x.l;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import wa.w5;

/* loaded from: classes.dex */
public abstract class g1 implements Iterable, Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final h1 f15429v = new h1(w1.f15540b);

    /* renamed from: u, reason: collision with root package name */
    public int f15430u = 0;

    static {
        int i = d1.f15402a;
    }

    public static int p(int i, int i10, int i11) {
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

    public static h1 q(byte[] bArr, int i, int i10) {
        try {
            p(i, i + i10, bArr.length);
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i, bArr2, 0, i10);
            return new h1(bArr2);
        } catch (y1 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean r(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        int i12 = i + i11;
        p(i, i12, bArr.length);
        p(i10, i11 + i10, bArr2.length);
        while (i < i12) {
            if (bArr[i] != bArr2[i10]) {
                return false;
            }
            i++;
            i10++;
        }
        return true;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d(int i, int i10);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof g1) {
                g1 g1Var = (g1) obj;
                int g8 = g();
                if (g8 == g1Var.g()) {
                    if (g8 != 0) {
                        int i = this.f15430u;
                        int i10 = g1Var.f15430u;
                        if (i != 0 && i10 != 0 && i != i10) {
                            return false;
                        }
                        return o(g1Var);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public abstract int g();

    public final int hashCode() {
        int i = this.f15430u;
        if (i == 0) {
            int g8 = g();
            i = d(g8, g8);
            if (i == 0) {
                i = 1;
            }
            this.f15430u = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public abstract g1 k(int i, int i10);

    public abstract void n(i1 i1Var);

    public abstract boolean o(g1 g1Var);

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int g8 = g();
        if (g() <= 50) {
            concat = w5.a(this);
        } else {
            concat = w5.a(k(0, 47)).concat("...");
        }
        return a5.a.k(a5.a.m("<ByteString@", hexString, " size=", g8, " contents=\""), concat, "\">");
    }
}
