package com.google.android.gms.internal.ads;
import b.a;
import g9.n0;
import g9.r;
import g9.t2;
import l9.a;
import la.a;
import r.e;
import z8.b;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class pt0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9594a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.a f9595b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f9596c;

    /* renamed from: d, reason: collision with root package name */
    public final fr0 f9597d;
    public final ClientApi e = new ClientApi();

    /* renamed from: f, reason: collision with root package name */
    public final hq0 f9598f;

    /* renamed from: g, reason: collision with root package name */
    public final la.a f9599g;

    /* renamed from: h, reason: collision with root package name */
    public final at0 f9600h;
    public final bl0 i;

    public pt0(Context context, l9.a aVar, ScheduledExecutorService scheduledExecutorService, fr0 fr0Var, hq0 hq0Var, la.a aVar2, at0 at0Var, bl0 bl0Var) {
        this.f9594a = context;
        this.f9595b = aVar;
        this.f9596c = scheduledExecutorService;
        this.f9597d = fr0Var;
        this.f9599g = aVar2;
        this.f9598f = hq0Var;
        this.f9600h = at0Var;
        this.i = bl0Var;
    }

    public final dt0 a(g9.t2 t2Var, g9.n0 n0Var) {
        z8.b a10 = z8.b.a(t2Var.f17703v);
        if (a10 != null) {
            int ordinal = a10.ordinal();
            Context context = this.f9594a;
            l9.a aVar = this.f9595b;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 5) {
                        return null;
                    }
                    return new dt0(this.e, context, aVar.f20031w, this.f9598f, t2Var, n0Var, this.f9596c, this.f9597d, b(), this.f9599g, 0);
                }
                return new dt0(this.e, context, aVar.f20031w, this.f9598f, t2Var, n0Var, this.f9596c, this.f9597d, b(), this.f9599g, 2);
            }
            return new dt0(this.e, context, aVar.f20031w, this.f9598f, t2Var, n0Var, this.f9596c, this.f9597d, b(), this.f9599g, 1);
        }
        return null;
    }

    public final et0 b() {
        nl nlVar = sl.J;
        g9.r rVar = g9.r.e;
        return new et0(((Long) rVar.f17698c.a(nlVar)).longValue(), ((Long) rVar.f17698c.a(sl.K)).longValue(), this.f9599g, this.i);
    }
}
