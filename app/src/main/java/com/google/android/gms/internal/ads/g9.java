package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    public List f6330a = Collections.EMPTY_LIST;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    public List a(nb nbVar) {
        boolean z3;
        String str;
        int i;
        List list;
        byte[] bArr;
        xk0 xk0Var = new xk0((byte[]) nbVar.f8636w);
        ArrayList arrayList = this.f6330a;
        while (xk0Var.B() > 0) {
            int K = xk0Var.K();
            int K2 = xk0Var.f12581b + xk0Var.K();
            if (K == 134) {
                arrayList = new ArrayList();
                int K3 = xk0Var.K() & 31;
                for (int i10 = 0; i10 < K3; i10++) {
                    String k3 = xk0Var.k(3, StandardCharsets.UTF_8);
                    int K4 = xk0Var.K();
                    if ((K4 & 128) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i = K4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte K5 = (byte) xk0Var.K();
                    xk0Var.G(1);
                    if (z3) {
                        int i11 = K5 & 64;
                        byte[] bArr2 = va0.f11866a;
                        if (i11 != 0) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    rv1 rv1Var = new rv1();
                    rv1Var.e(str);
                    rv1Var.f10299d = k3;
                    rv1Var.M = i;
                    rv1Var.f10310q = list;
                    arrayList.add(new mw1(rv1Var));
                }
            }
            xk0Var.E(K2);
            arrayList = arrayList;
        }
        return arrayList;
    }
}
