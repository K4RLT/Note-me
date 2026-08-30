package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b4.b;
import g5.q;
import q1.a;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f14782a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f14783b = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable th2;
        boolean z3;
        jm jmVar;
        Closeable closeable;
        WeakHashMap weakHashMap = f14783b;
        synchronized (weakHashMap) {
            th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                } finally {
                }
            }
            if (th2 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            weakHashMap.put(th, Boolean.valueOf(z3));
        }
        if (th2 == null) {
            WeakHashMap weakHashMap2 = f14782a;
            synchronized (weakHashMap2) {
                Throwable th3 = th;
                while (th3 != null) {
                    try {
                        if (weakHashMap2.containsKey(th3)) {
                            break;
                        } else {
                            th3 = th3.getCause();
                        }
                    } finally {
                    }
                }
                if (th3 == null) {
                    jmVar = null;
                } else {
                    weakHashMap2.put(th, (m1) weakHashMap2.get(th3));
                    jmVar = new jm(13);
                }
            }
            if (jmVar == null && (closeable = a().f14179b) != null) {
                ArrayList arrayList = new ArrayList();
                for (closeable = a().f14179b; closeable != null; closeable = ((l1) closeable).f14585u) {
                    arrayList.add(closeable);
                }
                UUID uuid = ((l1) ((e2) arrayList.get(0))).f14586v;
                if (uuid != null) {
                    ((e2) arrayList.get(0)).getClass();
                    int size = arrayList.size();
                    e4 e4Var = h4.f14393v;
                    n5.d(size, "expectedSize");
                    n5.d(size, "initialCapacity");
                    Object[] objArr = new Object[size];
                    int size2 = arrayList.size();
                    n5.d(size2, "expectedSize");
                    n5.d(size2, "initialCapacity");
                    Object[] objArr2 = new Object[size2];
                    int i = 0;
                    boolean z9 = false;
                    int i10 = 0;
                    boolean z10 = false;
                    for (e2 e2Var : nw.l(arrayList)) {
                        String str = ((l1) e2Var).f14588x;
                        int length = objArr2.length;
                        int b10 = b(length, i10 + 1);
                        if (b10 > length || z10) {
                            objArr2 = Arrays.copyOf(objArr2, b10);
                            z10 = false;
                        }
                        int i11 = i10 + 1;
                        objArr2[i10] = str;
                        a2 d2 = e2Var.d();
                        d2.getClass();
                        int length2 = objArr.length;
                        int b11 = b(length2, i + 1);
                        if (b11 > length2 || z9) {
                            objArr = Arrays.copyOf(objArr, b11);
                            z9 = false;
                        }
                        objArr[i] = d2;
                        i++;
                        i10 = i11;
                    }
                    synchronized (weakHashMap2) {
                        try {
                            z4 r8 = h4.r(objArr2, i10);
                            if (r8 != null) {
                                z4 r10 = h4.r(objArr, i);
                                if (r10 != null) {
                                    weakHashMap2.put(th, new m1(r8, r10, uuid));
                                } else {
                                    throw new NullPointerException("Null extras");
                                }
                            } else {
                                throw new NullPointerException("Null spansNames");
                            }
                        } finally {
                        }
                    }
                    return;
                }
                q.h("Null rootTraceId");
            }
        }
    }
}
