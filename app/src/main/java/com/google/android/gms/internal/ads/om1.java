package com.google.android.gms.internal.ads;
import a5.a;
import g3.a;
import q.x;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class om1 implements Iterable, Serializable {

    /* renamed from: v */
    public static final mm1 f9167v = new mm1(ln1.f8074a);

    /* renamed from: u */
    public int f9168u = 0;

    static {
        int i = em1.f5727a;
    }

    public static mm1 A(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return f9167v;
        }
        b(i, i + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return new mm1(bArr2);
    }

    public static om1 C(ArrayList arrayList) {
        int size;
        if (arrayList == null) {
            int size2 = arrayList.size();
            size = 0;
            int i = 0;
            while (i < size2) {
                arrayList.get(i);
                i++;
                size++;
            }
        } else {
            size = arrayList.size();
        }
        if (size == 0) {
            return f9167v;
        }
        return t(arrayList.iterator(), size);
    }

    public static int b(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) < 0) {
            if (i >= 0) {
                if (i10 < i) {
                    q.x.l(g3.a.f(i, i10, "Beginning index larger than ending index: ", ", ", new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i10).length())));
                    return 0;
                }
                q.x.l(g3.a.f(i10, i11, "End index: ", " >= ", new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(i11).length())));
                return 0;
            }
            q.x.l(a5.a.j(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
            return 0;
        }
        return i12;
    }

    public static /* synthetic */ boolean d(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        int i12 = i + i11;
        b(i, i12, bArr.length);
        b(i10, i11 + i10, bArr2.length);
        while (i < i12) {
            if (bArr[i] != bArr2[i10]) {
                return false;
            }
            i++;
            i10++;
        }
        return true;
    }

    public static om1 t(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (om1) it.next();
            }
            int i10 = i >>> 1;
            om1 t3 = t(it, i10);
            om1 t10 = t(it, i - i10);
            if (Integer.MAX_VALUE - t3.k() >= t10.k()) {
                if (t10.k() == 0) {
                    return t3;
                }
                if (t3.k() == 0) {
                    return t10;
                }
                int k3 = t10.k() + t3.k();
                mm1 mm1Var = f9167v;
                if (k3 < 128) {
                    int k4 = t3.k();
                    int k10 = t10.k();
                    int i11 = k4 + k10;
                    byte[] bArr = new byte[i11];
                    b(0, k4, t3.k());
                    b(0, k4, i11);
                    if (k4 > 0) {
                        t3.p(0, 0, k4, bArr);
                    }
                    b(0, k10, t10.k());
                    b(k4, i11, i11);
                    if (k10 > 0) {
                        t10.p(0, k4, k10, bArr);
                    }
                    if (i11 == 0) {
                        return mm1Var;
                    }
                    try {
                        return new mm1(bArr);
                    } catch (pn1 e) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                    }
                }
                if (t3 instanceof no1) {
                    no1 no1Var = (no1) t3;
                    om1 om1Var = no1Var.f8792x;
                    om1 om1Var2 = no1Var.f8793y;
                    if (t10.k() + om1Var2.k() < 128) {
                        int k11 = om1Var2.k();
                        int k12 = t10.k();
                        int i12 = k11 + k12;
                        byte[] bArr2 = new byte[i12];
                        b(0, k11, om1Var2.k());
                        b(0, k11, i12);
                        if (k11 > 0) {
                            om1Var2.p(0, 0, k11, bArr2);
                        }
                        b(0, k12, t10.k());
                        b(k11, i12, i12);
                        if (k12 > 0) {
                            t10.p(0, k11, k12, bArr2);
                        }
                        if (i12 != 0) {
                            try {
                                mm1Var = new mm1(bArr2);
                            } catch (pn1 e8) {
                                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e8);
                            }
                        }
                        return new no1(om1Var, mm1Var);
                    }
                    if (om1Var.w() > om1Var2.w() && no1Var.A > t10.w()) {
                        return new no1(om1Var, new no1(om1Var2, t10));
                    }
                }
                if (k3 >= no1.D(Math.max(t3.w(), t10.w()) + 1)) {
                    return new no1(t3, t10);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                lo1.a(t3, arrayDeque);
                lo1.a(t10, arrayDeque);
                om1 om1Var3 = (om1) arrayDeque.pop();
                while (!arrayDeque.isEmpty()) {
                    om1Var3 = new no1((om1) arrayDeque.pop(), om1Var3);
                }
                return om1Var3;
            }
            int k13 = t3.k();
            int k14 = t10.k();
            q.x.n(g3.a.f(k13, k14, "ByteString would be too long: ", "+", new StringBuilder(String.valueOf(k13).length() + 31 + String.valueOf(k14).length())));
            return null;
        }
        Locale locale = Locale.ROOT;
        q.x.n(g3.a.i("length (", i, ") must be >= 1"));
        return null;
    }

    public static mm1 z(byte[] bArr, int i, int i10) {
        try {
            return A(bArr, i, i10);
        } catch (pn1 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public final byte[] a() {
        int k3 = k();
        if (k3 == 0) {
            return ln1.f8074a;
        }
        byte[] bArr = new byte[k3];
        p(0, 0, k3, bArr);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof om1)) {
            return false;
        }
        om1 om1Var = (om1) obj;
        int k3 = k();
        if (k3 != om1Var.k()) {
            return false;
        }
        if (k3 == 0) {
            return true;
        }
        int i = this.f9168u;
        int i10 = om1Var.f9168u;
        if (i != 0 && i10 != 0 && i != i10) {
            return false;
        }
        return s(om1Var);
    }

    public abstract byte g(int i);

    public final int hashCode() {
        int i = this.f9168u;
        if (i == 0) {
            int k3 = k();
            i = u(k3, 0, k3);
            if (i == 0) {
                i = 1;
            }
            this.f9168u = i;
        }
        return i;
    }

    public abstract int k();

    public abstract om1 n(int i, int i10);

    public abstract om1 o(int i, int i10);

    public abstract void p(int i, int i10, int i11, byte[] bArr);

    public abstract ByteBuffer q();

    public abstract void r(um1 um1Var);

    public abstract boolean s(om1 om1Var);

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int k3 = k();
        if (k() <= 50) {
            concat = so1.b(a());
        } else {
            concat = so1.b(o(0, 47).a()).concat("...");
        }
        return a5.a.k(a5.a.m("<ByteString@", hexString, " size=", k3, " contents=\""), concat, "\">");
    }

    public abstract int u(int i, int i10, int i11);

    public abstract rm1 v();

    public abstract int w();

    public abstract boolean x();

    @Override // java.lang.Iterable
    /* renamed from: y */
    public m61 iterator() {
        return new jm1(this);
    }
}
