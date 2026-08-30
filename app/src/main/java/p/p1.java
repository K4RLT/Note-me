package p;
import q.d;
import q.h;
import q.i;
import q.r0;
import q.x;

/* loaded from: classes.dex */
public final class p1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f22225u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o1 f22226v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f22227w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r1 f22228x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(o1 o1Var, long j10, r1 r1Var, te.c cVar) {
        super(2, cVar);
        this.f22226v = o1Var;
        this.f22227w = j10;
        this.f22228x = r1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new p1(this.f22226v, this.f22227w, this.f22228x, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f22225u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            d dVar = this.f22226v.f22218a;
            y2.l lVar = new y2.l(this.f22227w);
            r0 r0Var = this.f22228x.I;
            this.f22225u = 1;
            obj = d.c(dVar, lVar, r0Var, this);
            ue.a aVar = ue.a.f27192u;
            if (obj == aVar) {
                return aVar;
            }
        }
        h hVar = ((i) obj).f22917b;
        return pe.z.f22715a;
    }
}
