package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14658a;

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f14658a) {
            case 0:
                k4 k4Var = (k4) obj;
                k4Var.getClass();
                ArrayList arrayList = ((k4) obj2).f14543a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    y4 y4Var = (y4) obj3;
                    pa.q(!y4Var.f15273u.equals(y4Var.f15274v), "range must not be empty, but was %s", y4Var);
                    k4Var.f14543a.add(y4Var);
                }
                return k4Var;
            case 1:
                d4 d4Var = (d4) obj;
                d4 d4Var2 = (d4) obj2;
                Object[] objArr = d4Var2.f14061a;
                int i10 = d4Var2.f14062b;
                d4Var.getClass();
                n5.g(objArr, i10);
                d4Var.c(i10);
                System.arraycopy(objArr, 0, d4Var.f14061a, d4Var.f14062b, i10);
                d4Var.f14062b += i10;
                return d4Var;
            case 2:
                m4 m4Var = (m4) obj;
                m4 m4Var2 = (m4) obj2;
                Object[] objArr2 = m4Var2.f14061a;
                int i11 = m4Var2.f14062b;
                m4Var.getClass();
                n5.g(objArr2, i11);
                m4Var.c(i11);
                System.arraycopy(objArr2, 0, m4Var.f14061a, m4Var.f14062b, i11);
                m4Var.f14062b += i11;
                return m4Var;
            default:
                j4 j4Var = (j4) obj;
                j4 j4Var2 = (j4) obj2;
                j4Var.getClass();
                j4Var2.getClass();
                j4Var.d(j4Var.f14496b + j4Var2.f14496b);
                Object[] objArr3 = j4Var2.f14495a;
                Object[] objArr4 = j4Var.f14495a;
                int i12 = j4Var.f14496b;
                int i13 = j4Var2.f14496b;
                System.arraycopy(objArr3, 0, objArr4, i12 + i12, i13 + i13);
                j4Var.f14496b += j4Var2.f14496b;
                return j4Var;
        }
    }
}
