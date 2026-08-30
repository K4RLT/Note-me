package com.google.android.gms.internal.measurement;
import g3.a;
import g5.q;
import l4.a;
import p.a;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m4 {
    protected int zza;

    public static void b(Iterable iterable, List list) {
        Charset charset = d5.f13686a;
        iterable.getClass();
        if (iterable instanceof m5) {
            List m214zza = ((m5) iterable).m214zza();
            m5 m5Var = (m5) list;
            int size = list.size();
            for (Object obj : m214zza) {
                if (obj == null) {
                    String i = a.i("Element at index ", m5Var.size() - size, " is null.");
                    for (int size2 = m5Var.size() - 1; size2 >= size; size2--) {
                        m5Var.remove(size2);
                    }
                    q.h(i);
                    return;
                }
                if (obj instanceof s4) {
                    m5Var.m215zza();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    s4.d(bArr, 0, bArr.length);
                    m5Var.m215zza();
                } else {
                    m5Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof w5) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String i10 = a.i("Element at index ", list.size() - size3, " is null.");
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                q.h(i10);
                return;
            }
            list.add(obj2);
        }
    }

    public abstract int a(a6 a6Var);

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, com.google.android.gms.internal.measurement.o5] */
    public final byte[] c() {
        o5 o5Var;
        try {
            int a10 = ((b5) this).a(null);
            byte[] bArr = new byte[a10];
            t4 t4Var = new t4(bArr, a10);
            b5 b5Var = (b5) this;
            y5 y5Var = y5.f13983c;
            y5Var.getClass();
            a6 a11 = y5Var.a(b5Var.getClass());
            o5 o5Var2 = t4Var.f13916a;
            if (o5Var2 != null) {
                o5Var = o5Var2;
            } else {
                Object obj = new Object();
                Charset charset = d5.f13686a;
                obj.f13873u = t4Var;
                t4Var.f13916a = obj;
                o5Var = obj;
            }
            a11.e(b5Var, o5Var);
            if (t4Var.f() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            a.k(a.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}