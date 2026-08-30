package t;
import z1.a;

/* loaded from: classes.dex */
public final class p1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25491u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f25492v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25493w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(h8.f fVar, long j10, te.c cVar) {
        super(2, cVar);
        this.f25493w = fVar;
        this.f25492v = j10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25491u) {
            case 0:
                p1 p1Var = new p1(this.f25492v, cVar);
                p1Var.f25493w = obj;
                return p1Var;
            default:
                return new p1((h8.f) this.f25493w, this.f25492v, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25491u) {
            case 0:
                p1 p1Var = (p1) create((x1) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                p1Var.invokeSuspend(zVar);
                return zVar;
            default:
                p1 p1Var2 = (p1) create((pf.z) obj, (te.c) obj2);
                pe.z zVar2 = pe.z.f22715a;
                p1Var2.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25491u) {
            case 0:
                pe.a.e(obj);
                z1 z1Var = ((x1) this.f25493w).f25580a;
                a(z1Var, z1Var.f25607j, this.f25492v, 1);
                return pe.z.f22715a;
            default:
                pe.a.e(obj);
                ((h8.f) this.f25493w).b(this.f25492v);
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(long j10, te.c cVar) {
        super(2, cVar);
        this.f25492v = j10;
    }
}
