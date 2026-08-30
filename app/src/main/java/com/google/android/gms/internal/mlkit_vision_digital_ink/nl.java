package com.google.android.gms.internal.mlkit_vision_digital_ink;
import c.a;
import d.d;
import de.c;
import de.e;
import de.k;
import e5.f;
import ib.o;
import pa.d;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nl {
    public static z4 i;

    /* renamed from: j, reason: collision with root package name */
    public static final e5 f14707j = e5.f(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);

    /* renamed from: a, reason: collision with root package name */
    public final String f14708a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14709b;

    /* renamed from: c, reason: collision with root package name */
    public final ll f14710c;

    /* renamed from: d, reason: collision with root package name */
    public final de.k f14711d;
    public final ib.o e;

    /* renamed from: f, reason: collision with root package name */
    public final ib.o f14712f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14713g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14714h;

    public nl(Context context, de.k kVar, ll llVar) {
        int i10;
        new HashMap();
        new HashMap();
        this.f14708a = context.getPackageName();
        this.f14709b = de.c.a(context);
        this.f14711d = kVar;
        this.f14710c = llVar;
        jm.h();
        this.f14713g = "digital-ink-recognition";
        de.e a10 = de.e.a();
        f1 f1Var = new f1(1, this);
        a10.getClass();
        this.e = de.e.b(f1Var);
        de.e a11 = de.e.a();
        Objects.requireNonNull(kVar);
        f1 f1Var2 = new f1(2, kVar);
        a11.getClass();
        this.f14712f = de.e.b(f1Var2);
        e5 e5Var = f14707j;
        if (e5Var.containsKey("digital-ink-recognition")) {
            i10 = pa.d.d(context, (String) e5Var.get("digital-ink-recognition"), false);
        } else {
            i10 = -1;
        }
        this.f14714h = i10;
    }
}
