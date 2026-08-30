package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d4 extends um1 {

    /* renamed from: w, reason: collision with root package name */
    public long f5301w;

    /* renamed from: x, reason: collision with root package name */
    public long[] f5302x;

    /* renamed from: y, reason: collision with root package name */
    public long[] f5303y;

    public static String U1(xk0 xk0Var) {
        int L = xk0Var.L();
        int i = xk0Var.f12581b;
        xk0Var.G(L);
        return new String(xk0Var.f12580a, i, L);
    }

    public static HashMap V1(xk0 xk0Var) {
        int h3 = xk0Var.h();
        HashMap hashMap = new HashMap(h3);
        for (int i = 0; i < h3; i++) {
            String U1 = U1(xk0Var);
            Serializable W1 = W1(xk0Var.K(), xk0Var);
            if (W1 != null) {
                hashMap.put(U1, W1);
            }
        }
        return hashMap;
    }

    public static Serializable W1(int i, xk0 xk0Var) {
        if (i != 0) {
            boolean z3 = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(xk0Var.d()));
                                xk0Var.G(2);
                                return date;
                            }
                            int h3 = xk0Var.h();
                            ArrayList arrayList = new ArrayList(h3);
                            for (int i10 = 0; i10 < h3; i10++) {
                                Serializable W1 = W1(xk0Var.K(), xk0Var);
                                if (W1 != null) {
                                    arrayList.add(W1);
                                }
                            }
                            return arrayList;
                        }
                        return V1(xk0Var);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String U1 = U1(xk0Var);
                        int K = xk0Var.K();
                        if (K == 9) {
                            return hashMap;
                        }
                        Serializable W12 = W1(K, xk0Var);
                        if (W12 != null) {
                            hashMap.put(U1, W12);
                        }
                    }
                } else {
                    return U1(xk0Var);
                }
            } else {
                if (xk0Var.K() == 1) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(xk0Var.d()));
        }
    }
}
