package com.google.android.gms.internal.measurement;
import j6.n;
import o0.a;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class y implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f13981u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f13982v;

    public y(j jVar, n nVar) {
        this.f13981u = jVar;
        this.f13982v = nVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        if (nVar instanceof t) {
            if (nVar2 instanceof t) {
                return 0;
            }
            return 1;
        }
        if (nVar2 instanceof t) {
            return -1;
        }
        j jVar = this.f13981u;
        if (jVar == null) {
            return nVar.b().compareTo(nVar2.b());
        }
        return (int) a(jVar.e(this.f13982v, Arrays.asList(nVar, nVar2)).a().doubleValue());
    }
}
