package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class cm1 {
    protected transient int zzq;

    public static void e(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof sn1) {
            List zza = ((sn1) iterable).zza();
            sn1 sn1Var = (sn1) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    int size2 = sn1Var.size() - size;
                    String j10 = a5.a.j(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = sn1Var.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            sn1Var.remove(size3);
                        } else {
                            g5.q.h(j10);
                            return;
                        }
                    }
                } else if (obj instanceof om1) {
                    sn1Var.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    om1.z(bArr, 0, bArr.length);
                    sn1Var.zzb();
                } else {
                    sn1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof go1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof io1) {
                io1 io1Var = (io1) list;
                int i = io1Var.f7189w + size4;
                int length = io1Var.f7188v.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = wd0.l(length, 3, 2, 1, 10);
                        }
                        io1Var.f7188v = Arrays.copyOf(io1Var.f7188v, length);
                    } else {
                        io1Var.f7188v = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
            List list2 = (List) iterable;
            int size6 = list2.size();
            for (int i10 = 0; i10 < size6; i10++) {
                Object obj2 = list2.get(i10);
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    bn1.e(size5, list);
                    throw null;
                }
            }
            return;
        }
        for (Object obj3 : iterable) {
            if (obj3 != null) {
                list.add(obj3);
            } else {
                bn1.e(size5, list);
                throw null;
            }
        }
    }

    public final mm1 a() {
        try {
            int d2 = ((dn1) this).d(null);
            mm1 mm1Var = om1.f9167v;
            byte[] bArr = new byte[d2];
            sm1 sm1Var = new sm1(bArr, d2);
            ((dn1) this).u(sm1Var);
            sm1Var.W();
            return new mm1(bArr);
        } catch (IOException e) {
            l4.a.k(f("ByteString"), e);
            return null;
        }
    }

    public final byte[] b() {
        try {
            int d2 = ((dn1) this).d(null);
            byte[] bArr = new byte[d2];
            sm1 sm1Var = new sm1(bArr, d2);
            ((dn1) this).u(sm1Var);
            sm1Var.W();
            return bArr;
        } catch (IOException e) {
            l4.a.k(f("byte array"), e);
            return null;
        }
    }

    public final void c(OutputStream outputStream) {
        dn1 dn1Var = (dn1) this;
        int d2 = dn1Var.d(null);
        if (d2 > 4096) {
            d2 = 4096;
        }
        tm1 tm1Var = new tm1(outputStream, d2);
        dn1Var.u(tm1Var);
        if (tm1Var.f11394y > 0) {
            tm1Var.Z1();
        }
    }

    public abstract int d(oo1 oo1Var);

    public final String f(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 18 + str.length() + 44);
        g3.a.t(sb2, "Serializing ", name, " to a ", str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }
}
