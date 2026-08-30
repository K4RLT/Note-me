package k0;
import k0.g1;

/* loaded from: classes.dex */
public final class g1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19291u;

    /* renamed from: v, reason: collision with root package name */
    public int f19292v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j1 f19293w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(j1 j1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f19291u = i;
        this.f19293w = j1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f19291u) {
            case 0:
                return new g1(this.f19293w, cVar, 0);
            default:
                return new g1(this.f19293w, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f19291u) {
            case 0:
                return ((g1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((g1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x00f4, code lost:
    
        r14 = r4;
        r40 = r7;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
