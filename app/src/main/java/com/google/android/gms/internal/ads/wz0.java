package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class wz0 extends c01 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12378f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f12379g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(wd wdVar, pz0 pz0Var, Context context, h21 h21Var, int i) {
        super("uhXgNuGSyd8UZxNVLle6+R5FVDrGs3ztJxFRccM25tfzP1xuUPcwCU9TKSVvh2k9", "qKJ/azzJVrSI96ukKyGiETTBFTHn9OIRjLO/t8+zHyA=", wdVar, pz0Var, h21Var.a(115));
        this.f12378f = i;
        switch (i) {
            case 1:
                super("H0YdM17mgrrozxD0WVa3M40/jGgbp6xsWEqC8q+HAngxqz5clYs9XrZGt0ruoMVC", "vTRbdp+bvCvcqmoB2mkwDXNuKnz+mZ0QzFSaQEl2hgg=", wdVar, pz0Var, h21Var.a(119));
                this.f12379g = context;
                return;
            default:
                this.f12379g = context;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.c01
    public final void a(Method method, wd wdVar) {
        int i;
        switch (this.f12378f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", this.f12379g);
                objArr.getClass();
                synchronized (wdVar) {
                    try {
                        long intValue = ((Integer) objArr[0]).intValue();
                        wdVar.b();
                        ((je) wdVar.f4845v).X(intValue);
                        int i10 = 1;
                        long intValue2 = ((Integer) objArr[1]).intValue();
                        wdVar.b();
                        ((je) wdVar.f4845v).G0(intValue2);
                        long intValue3 = ((Integer) objArr[2]).intValue();
                        wdVar.b();
                        ((je) wdVar.f4845v).H0(intValue3);
                        long intValue4 = ((Integer) objArr[3]).intValue();
                        wdVar.b();
                        ((je) wdVar.f4845v).l0(intValue4);
                        Boolean bool = (Boolean) objArr[4];
                        if (bool == null) {
                            wdVar.b();
                            ((je) wdVar.f4845v).p0(3);
                        } else {
                            if (true != bool.booleanValue()) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            wdVar.b();
                            ((je) wdVar.f4845v).p0(i);
                        }
                        Boolean bool2 = (Boolean) objArr[5];
                        if (bool2 == null) {
                            wdVar.f(3);
                        } else {
                            if (true == bool2.booleanValue()) {
                                i10 = 2;
                            }
                            wdVar.f(i10);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Object[] objArr2 = (Object[]) method.invoke("", this.f12379g);
                objArr2.getClass();
                synchronized (wdVar) {
                    long longValue = ((Long) objArr2[0]).longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).F0(longValue);
                    long longValue2 = ((Long) objArr2[1]).longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).Y(longValue2);
                }
                return;
        }
    }
}
