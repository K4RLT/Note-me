package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class p11 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q11 f9324b;

    public /* synthetic */ p11(q11 q11Var, int i) {
        this.f9323a = i;
        this.f9324b = q11Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9323a) {
            case 0:
                u01 u01Var = this.f9324b.f9704a;
                vy0 b10 = u01Var.b(1);
                if (b10 == null) {
                    u01Var.e.b(15315);
                    return null;
                }
                String z3 = b10.z().z();
                File c10 = ct.c(z3, "pcam.jar", u01Var.c());
                c10.getClass();
                if (!c10.exists()) {
                    c10 = ct.c(z3, "pcam", u01Var.c());
                    c10.getClass();
                }
                File c11 = ct.c(z3, "pcopt", u01Var.c());
                c11.getClass();
                File c12 = ct.c(z3, "pcbc", u01Var.c());
                c12.getClass();
                return new uv0(b10.z(), c10, c12, c11);
            default:
                vy0 b11 = this.f9324b.f9704a.b(1);
                if (b11 == null) {
                    return vy0.F();
                }
                return b11;
        }
    }
}
