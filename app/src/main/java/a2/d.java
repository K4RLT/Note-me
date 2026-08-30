package a2;

import b2.i0;
import b2.k;
import b2.l;
import c2.x;
import d1.q;
import java.util.HashSet;
import n.d0;
import x.a0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final x f229a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.e f230b = new t0.e(new b2.c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final t0.e f231c = new t0.e(new g[16]);

    /* renamed from: d, reason: collision with root package name */
    public final t0.e f232d = new t0.e(new i0[16]);
    public final t0.e e = new t0.e(new g[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f233f;

    public d(x xVar) {
        this.f229a = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(q qVar, g gVar, HashSet hashSet) {
        if (!qVar.f15688u.H) {
            y1.a.b("visitSubtreeIf called on an unattached node");
        }
        t0.e eVar = new t0.e(new q[16]);
        q qVar2 = qVar.f15688u;
        q qVar3 = qVar2.f15693z;
        if (qVar3 == null) {
            l.b(eVar, qVar2);
        } else {
            eVar.b(qVar3);
        }
        while (true) {
            int i = eVar.f25619w;
            if (i != 0) {
                q qVar4 = (q) eVar.n(i - 1);
                if ((qVar4.f15691x & 32) != 0) {
                    for (q qVar5 = qVar4; qVar5 != null; qVar5 = qVar5.f15693z) {
                        if ((qVar5.f15690w & 32) != 0) {
                            k kVar = qVar5;
                            Object r52 = 0;
                            while (kVar != 0) {
                                if (kVar instanceof e) {
                                    e eVar2 = (e) kVar;
                                    if (eVar2 instanceof b2.c) {
                                        b2.c cVar = (b2.c) eVar2;
                                        if ((cVar.I instanceof a0) && cVar.K.contains(gVar)) {
                                            hashSet.add(eVar2);
                                        }
                                    }
                                    if (eVar2.f0().a(gVar)) {
                                        break;
                                    }
                                } else if ((kVar.f15690w & 32) != 0 && (kVar instanceof k)) {
                                    q qVar6 = kVar.J;
                                    int i10 = 0;
                                    kVar = kVar;
                                    r52 = r52;
                                    while (qVar6 != null) {
                                        if ((qVar6.f15690w & 32) != 0) {
                                            i10++;
                                            r52 = r52;
                                            if (i10 == 1) {
                                                kVar = qVar6;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new t0.e(new q[16]);
                                                }
                                                if (kVar != 0) {
                                                    r52.b(kVar);
                                                    kVar = 0;
                                                }
                                                r52.b(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.f15693z;
                                        kVar = kVar;
                                        r52 = r52;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                kVar = l.e(r52);
                            }
                        }
                    }
                }
                l.b(eVar, qVar4);
            } else {
                return;
            }
        }
    }

    public final void a() {
        if (!this.f233f) {
            this.f233f = true;
            c cVar = new c(0, this);
            d0 d0Var = this.f229a.P0;
            if (d0Var.f(cVar) < 0) {
                d0Var.a(cVar);
            }
        }
    }
}