package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b.c;
import ig.p;
import ig.q;
import jg.b;

import android.content.Context;

/* loaded from: classes.dex */
public final class vl implements z2 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ab f15128u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f15129v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f15130w;

    public vl(ab abVar, Context context, i iVar) {
        this.f15128u = abVar;
        this.f15129v = context;
        this.f15130w = iVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.z2
    public final Object zza() {
        ig.p pVar = new ig.p();
        pVar.f18561v = jg.b.c(60000L);
        pVar.f18562w = jg.b.c(60000L);
        pVar.f18563x = jg.b.c(60000L);
        pVar.f18560u = true;
        wl wlVar = new wl(this.f15128u);
        s5 s5Var = new s5(new ig.q(pVar));
        Context context = this.f15129v;
        return new ul(context, new c(s5Var, context, wlVar), this.f15130w);
    }
}
