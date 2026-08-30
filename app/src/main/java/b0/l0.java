package b0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1226a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f1227b;

    public l0(n0 n0Var) {
        this.f1227b = n0Var;
    }

    public final void a(int i) {
        long j10 = o0.f1237a;
        n0 n0Var = this.f1227b;
        ra.e eVar = n0Var.f1236c;
        if (eVar == null) {
            return;
        }
        this.f1226a.add(new i1(eVar, i, j10, n0Var.f1235b));
    }
}
