package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class c01 implements b01 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4933a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4934b;

    /* renamed from: c, reason: collision with root package name */
    public final pz0 f4935c;

    /* renamed from: d, reason: collision with root package name */
    public final wd f4936d;
    public final g21 e;

    public c01(String str, String str2, wd wdVar, pz0 pz0Var, g21 g21Var) {
        this.f4933a = str;
        this.f4934b = str2;
        this.f4936d = wdVar;
        this.f4935c = pz0Var;
        this.e = g21Var;
    }

    public abstract void a(Method method, wd wdVar);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        g21 g21Var = this.e;
        try {
            g21Var.a();
            Method b10 = this.f4935c.b(this.f4933a, this.f4934b);
            if (b10 != null) {
                a(b10, this.f4936d);
            }
            g21Var.c();
            return null;
        } catch (Throwable th) {
            try {
                g21Var.b(th);
                throw th;
            } catch (Throwable th2) {
                g21Var.c();
                throw th2;
            }
        }
    }
}
