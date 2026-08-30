package o0;
import o0.y1;

/* loaded from: classes.dex */
public final class y1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21752u;

    /* renamed from: v, reason: collision with root package name */
    public int f21753v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f21754w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ float f21755x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(z1 z1Var, float f10, te.c cVar, int i) {
        super(2, cVar);
        this.f21752u = i;
        this.f21754w = z1Var;
        this.f21755x = f10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f21752u) {
            case 0:
                return new y1((z1) this.f21754w, this.f21755x, cVar, 0);
            case 1:
                return new y1((z1) this.f21754w, this.f21755x, cVar, 1);
            default:
                y1 y1Var = new y1((i2.c) this.f21754w, cVar);
                y1Var.f21755x = ((Number) obj).floatValue();
                return y1Var;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21752u) {
            case 0:
                return ((y1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((y1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((y1) create(Float.valueOf(((Number) obj).floatValue()), (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r10 == r0) goto L16;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.y1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(i2.c cVar, te.c cVar2) {
        super(2, cVar2);
        this.f21752u = 2;
        this.f21754w = cVar;
    }
}
