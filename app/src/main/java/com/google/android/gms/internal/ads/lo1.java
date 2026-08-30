package com.google.android.gms.internal.ads;
import g5.q;
import q.x;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class lo1 {
    public static final void a(om1 om1Var, ArrayDeque arrayDeque) {
        if (om1Var.x()) {
            int binarySearch = Arrays.binarySearch(no1.B, om1Var.k());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int D = no1.D(binarySearch + 1);
            if (!arrayDeque.isEmpty() && ((om1) arrayDeque.peek()).k() < D) {
                int D2 = no1.D(binarySearch);
                om1 om1Var2 = (om1) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((om1) arrayDeque.peek()).k() < D2) {
                    om1Var2 = new no1((om1) arrayDeque.pop(), om1Var2);
                }
                no1 no1Var = new no1(om1Var2, om1Var);
                while (!arrayDeque.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(no1.B, no1Var.f8791w);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((om1) arrayDeque.peek()).k() >= no1.D(binarySearch2 + 1)) {
                        break;
                    } else {
                        no1Var = new no1((om1) arrayDeque.pop(), no1Var);
                    }
                }
                arrayDeque.push(no1Var);
                return;
            }
            arrayDeque.push(om1Var);
            return;
        }
        if (om1Var instanceof no1) {
            no1 no1Var2 = (no1) om1Var;
            a(no1Var2.f8792x, arrayDeque);
            a(no1Var2.f8793y, arrayDeque);
            return;
        }
        x.n("Has a new type of ByteString been created? Found ".concat(String.valueOf(om1Var.getClass())));
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        q.h("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void c(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        x.o(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
