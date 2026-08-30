package j0;
import a.a;

import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import g0.a1;
import java.util.List;
import m2.g0;
import m2.l0;
import m2.m0;
import m2.q0;
import qe.s;
import wa.l8;
import wa.m8;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public m2.g f18698a;

    /* renamed from: b, reason: collision with root package name */
    public q2.h f18699b;

    /* renamed from: c, reason: collision with root package name */
    public int f18700c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18701d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f18702f;

    /* renamed from: g, reason: collision with root package name */
    public List f18703g;

    /* renamed from: h, reason: collision with root package name */
    public g0.i f18704h;
    public b i;

    /* renamed from: k, reason: collision with root package name */
    public y2.c f18706k;

    /* renamed from: l, reason: collision with root package name */
    public q0 f18707l;

    /* renamed from: m, reason: collision with root package name */
    public u0 f18708m;

    /* renamed from: n, reason: collision with root package name */
    public y2.m f18709n;

    /* renamed from: o, reason: collision with root package name */
    public m0 f18710o;

    /* renamed from: r, reason: collision with root package name */
    public d f18713r;

    /* renamed from: j, reason: collision with root package name */
    public long f18705j = a.f18685a;

    /* renamed from: p, reason: collision with root package name */
    public int f18711p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f18712q = -1;

    public e(m2.g gVar, q0 q0Var, q2.h hVar, int i, boolean z3, int i10, int i11, List list, g0.i iVar) {
        this.f18698a = gVar;
        this.f18699b = hVar;
        this.f18700c = i;
        this.f18701d = z3;
        this.e = i10;
        this.f18702f = i11;
        this.f18703g = list;
        this.f18704h = iVar;
        this.f18707l = q0Var;
    }

    public final int a(int i, y2.m mVar) {
        int i10 = this.f18711p;
        int i11 = this.f18712q;
        if (i == i10 && i10 != -1) {
            return i11;
        }
        long a10 = y2.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f18702f > 1) {
            a10 = g(a10, mVar);
        }
        int q10 = a1.q(b(a10, mVar).e);
        int i12 = y2.a.i(a10);
        if (q10 < i12) {
            q10 = i12;
        }
        this.f18711p = i;
        this.f18712q = q10;
        return q10;
    }

    public final m2.q b(long j10, y2.m mVar) {
        int i;
        u0 d2 = d(mVar);
        long a10 = l8.a(j10, this.f18701d, this.f18700c, d2.d());
        boolean z3 = this.f18701d;
        int i10 = this.f18700c;
        int i11 = this.e;
        if ((!z3 && (i10 == 2 || i10 == 4 || i10 == 5)) || i11 < 1) {
            i = 1;
        } else {
            i = i11;
        }
        return new m2.q(d2, a10, i, i10);
    }

    public final void c(y2.c cVar) {
        long j10;
        y2.c cVar2 = this.f18706k;
        if (cVar != null) {
            int i = a.f18686b;
            j10 = a(cVar.a(), cVar.i0());
        } else {
            j10 = a.f18685a;
        }
        if (cVar2 == null) {
            this.f18706k = cVar;
            this.f18705j = j10;
        } else {
            if (cVar != null && this.f18705j == j10) {
                return;
            }
            this.f18706k = cVar;
            this.f18705j = j10;
            this.f18708m = null;
            this.f18710o = null;
            this.f18712q = -1;
            this.f18711p = -1;
            this.f18713r = null;
        }
    }

    public final u0 d(y2.m mVar) {
        u0 u0Var = this.f18708m;
        if (u0Var == null || mVar != this.f18709n || u0Var.a()) {
            this.f18709n = mVar;
            m2.g gVar = this.f18698a;
            q0 i = g0.i(this.f18707l, mVar);
            y2.c cVar = this.f18706k;
            cVar.getClass();
            q2.h hVar = this.f18699b;
            List list = this.f18703g;
            if (list == null) {
                list = s.f24023u;
            }
            u0Var = new u0(gVar, i, list, cVar, hVar);
        }
        this.f18708m = u0Var;
        return u0Var;
    }

    public final void e(q0 q0Var) {
        boolean c10 = q0Var.c(this.f18707l);
        this.f18707l = q0Var;
        if (!c10) {
            this.f18708m = null;
            this.f18710o = null;
            this.f18712q = -1;
            this.f18711p = -1;
        }
    }

    public final m0 f(y2.m mVar, long j10, m2.q qVar) {
        float min = Math.min(qVar.f20547a.d(), qVar.f20550d);
        m2.g gVar = this.f18698a;
        q0 q0Var = this.f18707l;
        List list = this.f18703g;
        if (list == null) {
            list = s.f24023u;
        }
        int i = this.e;
        boolean z3 = this.f18701d;
        int i10 = this.f18700c;
        y2.c cVar = this.f18706k;
        cVar.getClass();
        return new m0(new l0(gVar, q0Var, list, i, z3, i10, cVar, mVar, this.f18699b, j10), qVar, y2.b.d(j10, (a1.q(min) << 32) | (a1.q(qVar.e) & 4294967295L)));
    }

    public final long g(long j10, y2.m mVar) {
        b bVar = this.i;
        q0 q0Var = this.f18707l;
        y2.c cVar = this.f18706k;
        cVar.getClass();
        b a10 = m8.a(bVar, mVar, q0Var, cVar, this.f18699b);
        this.i = a10;
        return a10.a(this.f18702f, j10);
    }
}
