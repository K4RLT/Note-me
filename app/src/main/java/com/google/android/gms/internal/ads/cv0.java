package com.google.android.gms.internal.ads;
import c7.x;
import ib.h;
import ib.o;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class cv0 {
    public static volatile int e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5179a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5180b;

    /* renamed from: c, reason: collision with root package name */
    public final o f5181c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5182d;

    public cv0(Context context, Executor executor, o oVar, boolean z3) {
        this.f5179a = context;
        this.f5180b = executor;
        this.f5181c = oVar;
        this.f5182d = z3;
    }

    public static cv0 a(Context context, Executor executor, boolean z3) {
        h hVar = new h();
        if (z3) {
            executor.execute(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(context, 27, hVar));
        } else {
            executor.execute(new qu0(2, hVar));
        }
        return new cv0(context, executor, hVar.f18363a, z3);
    }

    public void b(int i, long j10) {
        e(i, j10, null, null, null);
    }

    public void c(int i, long j10, Exception exc) {
        e(i, j10, exc, null, null);
    }

    public void d(int i, String str) {
        e(i, 0L, null, null, str);
    }

    public final o e(int i, long j10, Exception exc, String str, String str2) {
        if (!this.f5182d) {
            return this.f5181c.g(this.f5180b, ho0.A);
        }
        Context context = this.f5179a;
        od z3 = rd.z();
        String packageName = context.getPackageName();
        z3.b();
        ((rd) z3.f4845v).A(packageName);
        z3.b();
        ((rd) z3.f4845v).B(j10);
        int i10 = e;
        z3.b();
        ((rd) z3.f4845v).G(i10);
        if (exc != null) {
            Object obj = u31.f11530a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            z3.b();
            ((rd) z3.f4845v).C(stringWriter2);
            String name = exc.getClass().getName();
            z3.b();
            ((rd) z3.f4845v).D(name);
        }
        if (str2 != null) {
            z3.b();
            ((rd) z3.f4845v).E(str2);
        }
        if (str != null) {
            z3.b();
            ((rd) z3.f4845v).F(str);
        }
        return this.f5181c.g(this.f5180b, new x(z3, i, 8));
    }
}
