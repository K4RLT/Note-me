package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class qy0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10037u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ry0 f10038v;

    public /* synthetic */ qy0(int i, ry0 ry0Var) {
        this.f10037u = i;
        this.f10038v = ry0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i10;
        ld ldVar;
        d51 u9;
        int i11;
        int i12;
        String str;
        StringWriter stringWriter;
        switch (this.f10037u) {
            case 0:
                ry0 ry0Var = this.f10038v;
                if (ry0Var.e && !ry0Var.f10362l.getAndSet(true)) {
                    Context context = ry0Var.f10353a;
                    String str2 = ry0Var.f10360j;
                    int i13 = ry0Var.f10370t;
                    double d2 = ry0Var.i;
                    long j10 = ry0Var.f10361k;
                    Locale locale = Locale.getDefault();
                    if (i13 != 1) {
                        int i14 = i13 - 2;
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    i = 5;
                                } else {
                                    i = 4;
                                }
                            } else {
                                i = 3;
                            }
                        } else {
                            i = 2;
                        }
                        ld z3 = md.z();
                        long j11 = Build.VERSION.SDK_INT;
                        z3.b();
                        ((md) z3.f4845v).C(j11);
                        String str3 = Build.MODEL;
                        z3.b();
                        ((md) z3.f4845v).D(str3);
                        String language = locale.getLanguage();
                        z3.b();
                        ((md) z3.f4845v).E(language);
                        String country = locale.getCountry();
                        z3.b();
                        ((md) z3.f4845v).F(country);
                        z3.b();
                        ((md) z3.f4845v).I(str2);
                        z3.b();
                        ((md) z3.f4845v).O(i);
                        z3.b();
                        ((md) z3.f4845v).P(3);
                        String packageName = context.getPackageName();
                        z3.b();
                        ((md) z3.f4845v).G(packageName);
                        z3.b();
                        ((md) z3.f4845v).L(j10);
                        if (d2 > 0.0d) {
                            z3.b();
                            ((md) z3.f4845v).K((int) (1.0d / d2));
                        }
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            long j12 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                            z3.b();
                            ((md) z3.f4845v).H(j12);
                        } catch (Exception unused) {
                        }
                        try {
                            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                                i10 = 5;
                            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                                i10 = 4;
                            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                                i10 = 7;
                            } else {
                                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                                if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                                    i10 = 6;
                                } else {
                                    i10 = 2;
                                }
                            }
                            z3.b();
                            ((md) z3.f4845v).N(i10);
                        } catch (RuntimeException unused2) {
                        }
                        md mdVar = (md) z3.c();
                        synchronized (ry0Var.f10363m) {
                            ry0Var.f10366p.d(mdVar);
                        }
                        return;
                    }
                    ln1.a();
                    throw null;
                }
                return;
            default:
                ry0 ry0Var2 = this.f10038v;
                synchronized (ry0Var2.f10363m) {
                    ld ldVar2 = ry0Var2.f10366p;
                    bn1 bn1Var = (bn1) ldVar2.f4844u.v(5, null);
                    boolean h3 = ldVar2.f4845v.h();
                    dn1 dn1Var = ldVar2.f4845v;
                    if (h3) {
                        dn1Var.getClass();
                        ho1.f6854c.a(dn1Var.getClass()).d(dn1Var);
                        dn1Var.i();
                        dn1Var = ldVar2.f4845v;
                    }
                    bn1Var.f4845v = dn1Var;
                    ldVar = (ld) bn1Var;
                }
                synchronized (ry0Var2.f10364n) {
                    ArrayList arrayList = ry0Var2.f10367q;
                    u9 = d51.u(arrayList);
                    arrayList.clear();
                    ry0Var2.f10368r = false;
                }
                int size = u9.size();
                int i15 = 0;
                int i16 = 0;
                while (i16 < size) {
                    py0 py0Var = (py0) u9.get(i16);
                    if (i15 >= ry0Var2.f10358g) {
                        ry0Var2.b((md) ldVar.c());
                        ldVar.b();
                        ((md) ldVar.f4845v).B();
                        i11 = 0;
                    } else {
                        i11 = i15;
                    }
                    td z9 = ud.z();
                    long j13 = py0Var.f9663a;
                    z9.b();
                    ((ud) z9.f4845v).A(j13);
                    long j14 = py0Var.f9664b;
                    z9.b();
                    ((ud) z9.f4845v).B(j14);
                    long j15 = py0Var.e;
                    z9.b();
                    ((ud) z9.f4845v).E(j15);
                    String str4 = py0Var.f9666d;
                    if (str4 != null) {
                        z9.b();
                        ((ud) z9.f4845v).F(str4);
                    }
                    Throwable th = py0Var.f9665c;
                    if (th == null) {
                        i12 = 2;
                    } else {
                        i12 = 3;
                    }
                    z9.b();
                    ((ud) z9.f4845v).G(i12);
                    if (th != null) {
                        String name = th.getClass().getName();
                        z9.b();
                        ((ud) z9.f4845v).C(name);
                        try {
                            stringWriter = new StringWriter();
                        } catch (IOException unused3) {
                            str = "";
                        }
                        try {
                            PrintWriter printWriter = new PrintWriter(stringWriter);
                            try {
                                th.printStackTrace(printWriter);
                                str = stringWriter.toString();
                                printWriter.close();
                                stringWriter.close();
                                z9.b();
                                ((ud) z9.f4845v).D(str);
                            } finally {
                                break;
                            }
                        } finally {
                        }
                    }
                    ud udVar = (ud) z9.c();
                    ldVar.b();
                    ((md) ldVar.f4845v).A(udVar);
                    i16++;
                    i15 = i11 + 1;
                }
                if (i15 > 0) {
                    ry0Var2.b((md) ldVar.c());
                    ldVar.b();
                    ((md) ldVar.f4845v).B();
                    return;
                }
                return;
        }
    }
}
