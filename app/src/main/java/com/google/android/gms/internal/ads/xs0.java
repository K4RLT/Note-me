package com.google.android.gms.internal.ads;
import ac.b;
import ic.c;
import l9.h;
import l9.l;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xs0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12613a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f12614b;

    /* renamed from: c, reason: collision with root package name */
    public final c91 f12615c;

    /* renamed from: d, reason: collision with root package name */
    public final l9.l f12616d;
    public final vs0 e;

    /* renamed from: f, reason: collision with root package name */
    public final vr0 f12617f;

    /* renamed from: g, reason: collision with root package name */
    public final h10 f12618g;

    public xs0(Context context, wx wxVar, c91 c91Var, l9.l lVar, vs0 vs0Var, vr0 vr0Var, h10 h10Var) {
        this.f12613a = context;
        this.f12614b = wxVar;
        this.f12615c = c91Var;
        this.f12616d = lVar;
        this.e = vs0Var;
        this.f12617f = vr0Var;
        this.f12618g = h10Var;
    }

    public final void a(List list, ic.c cVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), cVar, null, null);
        }
    }

    public final void b(String str, ic.c cVar, ur0 ur0Var, s70 s70Var) {
        ac.b j10;
        rr0 rr0Var = null;
        if (vr0.a() && ((Boolean) rm.f10241d.p()).booleanValue()) {
            rr0Var = rr0.d(this.f12613a, 14);
            rr0Var.zza();
        }
        rr0 rr0Var2 = rr0Var;
        if (cVar != null) {
            j10 = new p8((l9.h) cVar.f18393v, this.f12616d, this.f12615c, this.e, this.f12618g, 9).b(str);
        } else {
            j10 = this.f12615c.j(new xe(this, 9, str));
        }
        j10.a(new t81(j10, 0, new tw(this, rr0Var2, ur0Var, s70Var, 24, false)), this.f12614b);
    }
}
