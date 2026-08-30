package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* loaded from: classes.dex */
public final class kf {

    /* renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f7725c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    public static volatile dw0 f7726d = null;
    public static volatile Random e = null;

    /* renamed from: a, reason: collision with root package name */
    public final dg f7727a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f7728b;

    public kf(dg dgVar) {
        this.f7727a = dgVar;
        dgVar.f5419b.execute(new f(5, this));
    }

    public final void a(int i, int i10, long j10, String str, Exception exc) {
        try {
            f7725c.block();
            if (this.f7728b.booleanValue() && f7726d != null) {
                od z3 = rd.z();
                String packageName = this.f7727a.f5418a.getPackageName();
                z3.b();
                ((rd) z3.f4845v).A(packageName);
                z3.b();
                ((rd) z3.f4845v).B(j10);
                if (str != null) {
                    z3.b();
                    ((rd) z3.f4845v).E(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    String stringWriter2 = stringWriter.toString();
                    z3.b();
                    ((rd) z3.f4845v).C(stringWriter2);
                    String name = exc.getClass().getName();
                    z3.b();
                    ((rd) z3.f4845v).D(name);
                }
                dw0 dw0Var = f7726d;
                byte[] b10 = ((rd) z3.c()).b();
                dw0Var.getClass();
                l3 l3Var = new l3(dw0Var, b10);
                l3Var.f7926c = i;
                if (i10 != -1) {
                    l3Var.f7925b = i10;
                }
                l3Var.p();
            }
        } catch (Exception unused) {
        }
    }
}
