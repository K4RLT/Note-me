package u7;
import d.c;
import q.d;
import q.e;
import q.r0;
import q.x;
import u7.a6;

/* loaded from: classes.dex */
public final class a6 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f25910u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f25911v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f25912w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f25913x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(int i, int i10, d dVar, te.c cVar) {
        super(2, cVar);
        this.f25911v = dVar;
        this.f25912w = i;
        this.f25913x = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new a6(this.f25912w, this.f25913x, this.f25911v, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a6) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (d.c(r1, r0, r8, r7) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r1.g(r0, r7) == r4) goto L15;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f25910u
            d r1 = r7.f25911v
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            pe.a.e(r8)
            goto L4d
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            r8 = 0
            return r8
        L19:
            pe.a.e(r8)
            goto L31
        L1d:
            pe.a.e(r8)
            int r8 = r7.f25912w
            float r8 = (float) r8
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r8)
            r7.f25910u = r3
            java.lang.Object r8 = r1.g(r0, r7)
            if (r8 != r4) goto L31
            goto L4c
        L31:
            int r8 = r7.f25913x
            float r8 = (float) r8
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r8)
            r8 = 1128792064(0x43480000, float:200.0)
            r3 = 4
            r5 = 1061662228(0x3f47ae14, float:0.78)
            r6 = 0
            r0 r8 = e.r(r5, r8, r6, r3)
            r7.f25910u = r2
            java.lang.Object r8 = d.c(r1, r0, r8, r7)
            if (r8 != r4) goto L4d
        L4c:
            return r4
        L4d:
            pe.z r8 = pe.z.f22715a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.a6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
