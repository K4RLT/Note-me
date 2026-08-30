package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class tx {

    /* renamed from: a, reason: collision with root package name */
    public wx f11479a;

    /* renamed from: b, reason: collision with root package name */
    public be0 f11480b;

    /* renamed from: c, reason: collision with root package name */
    public Context f11481c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f11482d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public long f11483f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f11484g = -1;

    public final void a(wx wxVar, be0 be0Var, Context context) {
        if (this.f11482d.getAndSet(true)) {
            return;
        }
        this.f11479a = wxVar;
        this.f11480b = be0Var;
        nl nlVar = sl.f10944sf;
        g9.r rVar = g9.r.e;
        this.f11483f = ((Long) rVar.f17698c.a(nlVar)).longValue();
        this.f11484g = ((Long) rVar.f17698c.a(sl.f10959tf)).longValue();
        this.f11481c = context;
    }
}
