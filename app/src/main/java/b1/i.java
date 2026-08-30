package b1;
import p.u;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public m f1345a;

    /* renamed from: b, reason: collision with root package name */
    public long f1346b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1347c;

    /* renamed from: d, reason: collision with root package name */
    public int f1348d;

    public i(long j10, m mVar) {
        int i;
        int numberOfTrailingZeros;
        this.f1345a = mVar;
        this.f1346b = j10;
        a1.j jVar = p.f1385a;
        if (j10 != 0) {
            m d2 = d();
            long j11 = d2.f1369w;
            long[] jArr = d2.f1370x;
            if (jArr != null) {
                j10 = jArr[0];
            } else {
                long j12 = d2.f1368v;
                if (j12 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                } else {
                    long j13 = d2.f1367u;
                    if (j13 != 0) {
                        j11 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
                    }
                }
                j10 = numberOfTrailingZeros + j11;
            }
            synchronized (p.f1387c) {
                i = p.f1389f.d(j10);
            }
        } else {
            i = -1;
        }
        this.f1348d = i;
    }

    public static void q(i iVar) {
        p.f1386b.c(iVar);
    }

    public final void a() {
        synchronized (p.f1387c) {
            b();
            p();
        }
    }

    public void b() {
        p.f1388d = p.f1388d.b(g());
    }

    public abstract void c();

    public m d() {
        return this.f1345a;
    }

    public abstract df.l e();

    public abstract boolean f();

    public long g() {
        return this.f1346b;
    }

    public int h() {
        return 0;
    }

    public abstract df.l i();

    public final i j() {
        ya.y yVar = p.f1386b;
        i iVar = (i) yVar.b();
        yVar.c(this);
        return iVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(h0 h0Var);

    public final void o() {
        int i = this.f1348d;
        if (i >= 0) {
            u(i);
            this.f1348d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(m mVar) {
        this.f1345a = mVar;
    }

    public void s(long j10) {
        this.f1346b = j10;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract i u(df.l lVar);
}
