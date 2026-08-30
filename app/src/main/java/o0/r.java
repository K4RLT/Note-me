package o0;
import b2.l;
import k1.r;
import k1.u;

/* loaded from: classes.dex */
public final class r implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21643b;

    public /* synthetic */ r(int i, Object obj) {
        this.f21642a = i;
        this.f21643b = obj;
    }

    @Override // u
    public final long a() {
        switch (this.f21642a) {
            case 0:
                t tVar = (t) this.f21643b;
                long a10 = tVar.N.a();
                if (a10 == 16) {
                    g1 g1Var = (g1) l.h(tVar, i1.f21517b);
                    if (g1Var != null) {
                        long j10 = g1Var.f21491a;
                        if (j10 != 16) {
                            return j10;
                        }
                    }
                    return ((k1.r) l.h(tVar, q.f21634a)).f19523a;
                }
                return a10;
            default:
                return ((j1) this.f21643b).f21532c;
        }
    }
}
