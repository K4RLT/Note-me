package c0;
import l.a;
import z.m;

import b0.v0;
import b0.y0;
import r.u0;
import t.s1;
import t.z0;

/* loaded from: classes.dex */
public final class i implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f3331c;

    public /* synthetic */ i(s1 s1Var, boolean z3, int i) {
        this.f3329a = i;
        this.f3331c = s1Var;
        this.f3330b = z3;
    }

    @Override // v0
    public final int a() {
        long e;
        long e8;
        switch (this.f3329a) {
            case 0:
                d dVar = (d) this.f3331c;
                if (dVar.l().e == z0.f25597u) {
                    e = dVar.l().e() & 4294967295L;
                } else {
                    e = dVar.l().e() >> 32;
                }
                return (int) e;
            default:
                m mVar = (m) this.f3331c;
                if (mVar.i().f31701o == z0.f25597u) {
                    e8 = mVar.i().e() & 4294967295L;
                } else {
                    e8 = mVar.i().e() >> 32;
                }
                return (int) e8;
        }
    }

    @Override // v0
    public final float b() {
        switch (this.f3329a) {
            case 0:
                return (float) wa.a((d) this.f3331c);
            default:
                m mVar = (m) this.f3331c;
                return (mVar.g() * 500) + mVar.h();
        }
    }

    @Override // v0
    public final int c() {
        int i;
        int i10;
        switch (this.f3329a) {
            case 0:
                d dVar = (d) this.f3331c;
                i = -dVar.l().f3423f;
                i10 = dVar.l().f3422d;
                break;
            default:
                m mVar = (m) this.f3331c;
                i = -mVar.i().f31698l;
                i10 = mVar.i().f31702p;
                break;
        }
        return i + i10;
    }

    @Override // v0
    public final float d() {
        switch (this.f3329a) {
            case 0:
                d dVar = (d) this.f3331c;
                return (float) m0.a(dVar.l(), dVar.m());
            default:
                m mVar = (m) this.f3331c;
                int g8 = mVar.g();
                int h3 = mVar.h();
                if (mVar.c()) {
                    return (g8 * 500) + h3 + 100;
                }
                return (g8 * 500) + h3;
        }
    }

    @Override // v0
    public final j2.b e() {
        switch (this.f3329a) {
            case 0:
                d dVar = (d) this.f3331c;
                if (this.f3330b) {
                    return new j2.b(dVar.m(), 1);
                }
                return new j2.b(1, dVar.m());
            default:
                if (this.f3330b) {
                    return new j2.b(-1, 1);
                }
                return new j2.b(1, -1);
        }
    }

    @Override // v0
    public final Object f(int i, y0 y0Var) {
        switch (this.f3329a) {
            case 0:
                d dVar = (d) this.f3331c;
                Object e = dVar.e(u0.f24148u, new y0(dVar, i, null, 2), y0Var);
                pe.z zVar = pe.z.f22715a;
                ue.a aVar = ue.a.f27192u;
                if (e != aVar) {
                    e = zVar;
                }
                if (e == aVar) {
                    return e;
                }
                return zVar;
            default:
                Object k3 = m.k((m) this.f3331c, i, y0Var);
                if (k3 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return k3;
        }
    }
}
