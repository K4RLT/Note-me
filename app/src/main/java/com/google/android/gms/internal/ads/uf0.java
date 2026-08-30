package com.google.android.gms.internal.ads;
import m9.b;
import z8.l;
import z8.u;

import java.util.Objects;

/* loaded from: classes.dex */
public final class uf0 extends b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11634d;
    public final /* synthetic */ wf0 e;

    public uf0(wf0 wf0Var, String str) {
        this.f11634d = str;
        Objects.requireNonNull(wf0Var);
        this.e = wf0Var;
    }

    @Override // u
    public final void a(l lVar) {
        this.e.w4(wf0.z4(lVar));
    }

    @Override // u
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = this.f11634d;
        this.e.v4((fw) obj, str);
    }
}
