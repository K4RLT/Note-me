package j0;
import a.a;

import g0.a1;
import m2.g0;
import m2.q0;
import m2.u;
import qe.s;
import wa.l8;
import wa.m8;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f18715a;

    /* renamed from: b, reason: collision with root package name */
    public q0 f18716b;

    /* renamed from: c, reason: collision with root package name */
    public q2.h f18717c;

    /* renamed from: d, reason: collision with root package name */
    public int f18718d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int f18719f;

    /* renamed from: g, reason: collision with root package name */
    public int f18720g;
    public y2.c i;

    /* renamed from: j, reason: collision with root package name */
    public m2.a f18722j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18723k;

    /* renamed from: l, reason: collision with root package name */
    public long f18724l;

    /* renamed from: m, reason: collision with root package name */
    public b f18725m;

    /* renamed from: n, reason: collision with root package name */
    public u f18726n;

    /* renamed from: o, reason: collision with root package name */
    public y2.m f18727o;

    /* renamed from: h, reason: collision with root package name */
    public long f18721h = a.f18685a;

    /* renamed from: p, reason: collision with root package name */
    public long f18728p = y2.b.h(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f18729q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f18730r = -1;

    public g(String str, q0 q0Var, q2.h hVar, int i, boolean z3, int i10, int i11) {
        this.f18715a = str;
        this.f18716b = q0Var;
        this.f18717c = hVar;
        this.f18718d = i;
        this.e = z3;
        this.f18719f = i10;
        this.f18720g = i11;
        long j10 = 0;
        this.f18724l = (j10 & 4294967295L) | (j10 << 32);
    }

    public static long e(g gVar, long j10, y2.m mVar) {
        q0 q0Var = gVar.f18716b;
        b bVar = gVar.f18725m;
        y2.c cVar = gVar.i;
        cVar.getClass();
        b a10 = m8.a(bVar, mVar, q0Var, cVar, gVar.f18717c);
        gVar.f18725m = a10;
        return a10.a(gVar.f18720g, j10);
    }

    public final int a(int i, y2.m mVar) {
        int i10;
        int i11 = this.f18729q;
        int i12 = this.f18730r;
        if (i == i11 && i11 != -1) {
            return i12;
        }
        long a10 = y2.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f18720g > 1) {
            a10 = e(this, a10, mVar);
        }
        u d2 = d(mVar);
        long a11 = l8.a(a10, this.e, this.f18718d, d2.d());
        boolean z3 = this.e;
        int i13 = this.f18718d;
        int i14 = this.f18719f;
        if ((!z3 && (i13 == 2 || i13 == 4 || i13 == 5)) || i14 < 1) {
            i10 = 1;
        } else {
            i10 = i14;
        }
        int q10 = a1.q(new m2.a((u2.c) d2, i10, i13, a11).h());
        int i15 = y2.a.i(a10);
        if (q10 < i15) {
            q10 = i15;
        }
        this.f18729q = i;
        this.f18730r = q10;
        return q10;
    }

    public final void b() {
        this.f18722j = null;
        this.f18726n = null;
        this.f18727o = null;
        this.f18729q = -1;
        this.f18730r = -1;
        this.f18728p = y2.b.h(0, 0, 0, 0);
        long j10 = 0;
        this.f18724l = (j10 & 4294967295L) | (j10 << 32);
        this.f18723k = false;
    }

    public final void c(y2.c cVar) {
        long j10;
        y2.c cVar2 = this.i;
        if (cVar != null) {
            int i = a.f18686b;
            j10 = a(cVar.a(), cVar.i0());
        } else {
            j10 = a.f18685a;
        }
        if (cVar2 == null) {
            this.i = cVar;
            this.f18721h = j10;
        } else {
            if (cVar != null && this.f18721h == j10) {
                return;
            }
            this.i = cVar;
            this.f18721h = j10;
            b();
        }
    }

    public final u d(y2.m mVar) {
        u uVar = this.f18726n;
        if (uVar == null || mVar != this.f18727o || uVar.a()) {
            this.f18727o = mVar;
            String str = this.f18715a;
            q0 i = g0.i(this.f18716b, mVar);
            y2.c cVar = this.i;
            cVar.getClass();
            q2.h hVar = this.f18717c;
            s sVar = s.f24023u;
            uVar = new u2.c(str, i, sVar, sVar, hVar, cVar);
        }
        this.f18726n = uVar;
        return uVar;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        if (this.f18722j != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        sb2.append(str);
        sb2.append(", lastDensity=");
        long j10 = this.f18721h;
        int i = a.f18686b;
        sb2.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j10 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j10 & 4294967295L)) + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
