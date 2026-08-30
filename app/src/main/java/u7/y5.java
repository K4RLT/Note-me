package u7;
import q.d;
import u7.y5;

/* loaded from: classes.dex */
public final class y5 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27069u;

    /* renamed from: v, reason: collision with root package name */
    public int f27070v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27071w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f27072x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(int i, d dVar, te.c cVar) {
        super(2, cVar);
        this.f27069u = 2;
        this.f27072x = dVar;
        this.f27071w = i;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f27069u) {
            case 0:
                d dVar = this.f27072x;
                return new y5(this.f27071w, 0, dVar, cVar);
            case 1:
                d dVar2 = this.f27072x;
                return new y5(this.f27071w, 1, dVar2, cVar);
            case 2:
                return new y5(this.f27071w, this.f27072x, cVar);
            default:
                d dVar3 = this.f27072x;
                return new y5(this.f27071w, 3, dVar3, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f27069u) {
            case 0:
                return ((y5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((y5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((y5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((y5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.y5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(int i, int i10, d dVar, te.c cVar) {
        super(2, cVar);
        this.f27069u = i10;
        this.f27071w = i;
        this.f27072x = dVar;
    }
}
