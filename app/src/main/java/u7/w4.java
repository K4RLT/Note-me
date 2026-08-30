package u7;
import d.c;
import q.d;
import r0.f1;
import u7.w4;

/* loaded from: classes.dex */
public final class w4 extends ve.i implements df.p {
    public final /* synthetic */ f1 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26992u;

    /* renamed from: v, reason: collision with root package name */
    public int f26993v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f26994w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f26995x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ pf.z f26996y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ l2 f26997z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4(d dVar, d dVar2, pf.z zVar, l2 l2Var, f1 f1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f26992u = i;
        this.f26994w = dVar;
        this.f26995x = dVar2;
        this.f26996y = zVar;
        this.f26997z = l2Var;
        this.A = f1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26992u) {
            case 0:
                return new w4(this.f26994w, this.f26995x, this.f26996y, this.f26997z, this.A, cVar, 0);
            default:
                return new w4(this.f26994w, this.f26995x, this.f26996y, this.f26997z, this.A, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26992u) {
            case 0:
                return ((w4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((w4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (d.c(r10, r15, r0, r14) == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        if (d.c(r10, r15, r0, r14) == r7) goto L36;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.w4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
