package eg;
import b.b;
import f.e;
import p.a;

/* loaded from: classes.dex */
public final class r implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f16567a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f16568b = new v0("kotlin.time.Duration", cg.c.f4117j);

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        long j10;
        int g8;
        int g10;
        boolean z3;
        boolean z9;
        long j11 = ((nf.b) obj).f21334u;
        nf.a aVar = nf.b.f21330v;
        StringBuilder sb2 = new StringBuilder();
        if (j11 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        if (j11 < 0) {
            j10 = nf.b.h(j11);
        } else {
            j10 = j11;
        }
        long g11 = nf.b.g(j10, nf.d.HOURS);
        boolean z10 = false;
        if (nf.b.e(j10)) {
            g8 = 0;
        } else {
            g8 = (int) (nf.b.g(j10, nf.d.MINUTES) % 60);
        }
        if (nf.b.e(j10)) {
            g10 = 0;
        } else {
            g10 = (int) (nf.b.g(j10, nf.d.SECONDS) % 60);
        }
        int d2 = nf.b.d(j10);
        if (nf.b.e(j11)) {
            g11 = 9999999999999L;
        }
        if (g11 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g10 == 0 && d2 == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (g8 != 0 || (z9 && z3)) {
            z10 = true;
        }
        if (z3) {
            sb2.append(g11);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(g8);
            sb2.append('M');
        }
        if (z9 || (!z3 && !z10)) {
            nf.b(sb2, g10, d2, 9, "S", true);
        }
        tVar.u(sb2.toString());
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        boolean z3;
        nf.a aVar = nf.b.f21330v;
        String j10 = bVar.j();
        j10.getClass();
        try {
            long e = nf.e(j10);
            if (e == nf.b.f21333y) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                return new nf.b(e);
            }
            throw new IllegalStateException("invariant failed");
        } catch (IllegalArgumentException e8) {
            throw new IllegalArgumentException(a.k("Invalid ISO duration string format: '", j10, "'."), e8);
        }
    }

    @Override // ag.a
    public final cg.d d() {
        return f16568b;
    }
}
