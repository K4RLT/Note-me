package com.google.android.gms.internal.ads;
import ac.b;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class kr0 {

    /* renamed from: d, reason: collision with root package name */
    public static final v81 f7850d = v81.f11836v;

    /* renamed from: a, reason: collision with root package name */
    public final wx f7851a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f7852b;

    /* renamed from: c, reason: collision with root package name */
    public final jr0 f7853c;

    public kr0(wx wxVar, ScheduledExecutorService scheduledExecutorService, jr0 jr0Var) {
        this.f7851a = wxVar;
        this.f7852b = scheduledExecutorService;
        this.f7853c = jr0Var;
    }

    public final k60 a(ac.b bVar, Object obj) {
        return new k60(this, obj, null, bVar, Collections.singletonList(bVar), bVar);
    }
}
