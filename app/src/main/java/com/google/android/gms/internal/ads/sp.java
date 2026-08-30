package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sp implements j9.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g9.a f11088c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f11089d;
    public final /* synthetic */ Map e;

    public sp(tp tpVar, boolean z3, g9.a aVar, HashMap hashMap, Map map) {
        this.f11087b = z3;
        this.f11088c = aVar;
        this.f11089d = hashMap;
        this.e = map;
        Objects.requireNonNull(tpVar);
        this.f11086a = false;
    }

    @Override // j9.a
    public final void g0(boolean z3) {
        if (!this.f11086a) {
            g9.a aVar = this.f11088c;
            if (z3 && this.f11087b) {
                ((f90) aVar).M();
            }
            this.f11086a = true;
            String str = (String) this.e.get("event_id");
            Boolean valueOf = Boolean.valueOf(z3);
            HashMap hashMap = this.f11089d;
            hashMap.put(str, valueOf);
            ((qq) aVar).b("openIntentAsync", hashMap);
        }
    }

    @Override // j9.a
    public final void w(int i) {
    }
}
