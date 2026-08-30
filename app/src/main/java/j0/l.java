package j0;

import b2.k1;
import m2.m0;
import z1.x;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final l f18743c = new l(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final x f18744a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f18745b;

    public l(m0 m0Var, x xVar) {
        this.f18744a = xVar;
        this.f18745b = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [z1.x] */
    public static l a(l lVar, k1 k1Var, m0 m0Var, int i) {
        k1 k1Var2 = k1Var;
        if ((i & 1) != 0) {
            k1Var2 = lVar.f18744a;
        }
        if ((i & 2) != 0) {
            m0Var = lVar.f18745b;
        }
        return new l(m0Var, k1Var2);
    }
}
