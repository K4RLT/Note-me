package b8;
import b.a;
import u.b;
import u.c;
import z6.a;
import j2.j;
import j2.s;
import j2.u;
import j2.v;
import k1.b;
import k1.l0;
import k1.m0;
import k1.p;
import m1.d;
import r0.e1;
import u7.i7;
import u7.v6;
import u7.z6;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class na implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2464u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f2465v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2466w;

    public /* synthetic */ na(boolean z3, e1 e1Var) {
        this.f2464u = 1;
        this.f2465v = z3;
        this.f2466w = e1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f2464u;
        boolean z3 = this.f2465v;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.f2466w;
        switch (i) {
            case 0:
                j jVar = (j) obj;
                jVar.getClass();
                u.c(jVar, 4);
                u.b(jVar, (String) obj2);
                v vVar = s.H;
                kf.g gVar = u.f18865a[21];
                jVar.k(vVar, Boolean.valueOf(z3));
                return zVar;
            case 1:
                e1 e1Var = (e1) obj2;
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                if (z3) {
                    m0Var.r(e1Var.h());
                    m0Var.h(1.04f);
                    m0Var.i(1.04f);
                    m0Var.j(m0Var.J.a() * 12);
                }
                return zVar;
            default:
                d dVar = (d) obj;
                dVar.getClass();
                d.t(dVar, l0.c(((Number) v6.f26967a.getValue()).intValue()), 0L, 0L, 0.0f, null, 126);
                p j10 = dVar.p0().j();
                ConcurrentHashMap concurrentHashMap = z6.f27107a;
                z6.a(b.a(j10), 0.0f, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (dVar.e() & 4294967295L)), (i7) obj2, this.f2465v, true);
                return zVar;
        }
    }

    public /* synthetic */ na(int i, Object obj, boolean z3) {
        this.f2464u = i;
        this.f2466w = obj;
        this.f2465v = z3;
    }
}
