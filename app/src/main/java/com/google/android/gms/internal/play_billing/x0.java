package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.wd0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class x0 extends r1 {
    private static final x0 zzb;
    private v1 zzd = n2.f15493y;

    static {
        x0 x0Var = new x0();
        zzb = x0Var;
        r1.f(x0.class, x0Var);
    }

    public static w0 p() {
        return (w0) zzb.k();
    }

    public static void q(x0 x0Var, ArrayList arrayList) {
        v1 v1Var = x0Var.zzd;
        if (!((c1) v1Var).f15394u) {
            int size = v1Var.size();
            x0Var.zzd = v1Var.f(size + size);
        }
        List list = x0Var.zzd;
        Charset charset = w1.f15539a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof n2) {
            n2 n2Var = (n2) list;
            int i = n2Var.f15495w + size2;
            int length = n2Var.f15494v.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = wd0.l(length, 3, 2, 1, 10);
                    }
                    n2Var.f15494v = Arrays.copyOf(n2Var.f15494v, length);
                } else {
                    n2Var.f15494v = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i10 = 0; i10 < size4; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == null) {
                String i11 = g3.a.i("Element at index ", list.size() - size3, " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 >= size3) {
                        list.remove(size5);
                    } else {
                        g5.q.h(i11);
                        return;
                    }
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final Object j(int i) {
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new q1(zzb);
                }
                return new x0();
            }
            return new o2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", v0.class});
        }
        return (byte) 1;
    }
}
