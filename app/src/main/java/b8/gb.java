package b8;
import b0.j;
import b8.gb;
import d.c;

/* loaded from: classes.dex */
public final class gb extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public long f2136u;

    /* renamed from: v, reason: collision with root package name */
    public int f2137v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f2138w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2139x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q.d f2140y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(boolean z3, int i, q.d dVar, te.c cVar) {
        super(2, cVar);
        this.f2138w = z3;
        this.f2139x = i;
        this.f2140y = dVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new gb(this.f2138w, this.f2139x, this.f2140y, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((gb) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (pf.j(r5, r9) == r4) goto L22;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f2137v
            pe.z r1 = pe.z.f22715a
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            pe.a.e(r10)
            return r1
        L12:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r10)
            r10 = 0
            return r10
        L19:
            long r5 = r9.f2136u
            pe.a.e(r10)
            goto L3c
        L1f:
            pe.a.e(r10)
            boolean r10 = r9.f2138w
            if (r10 != 0) goto L27
            goto L5b
        L27:
            int r10 = r9.f2139x
            r0 = 6
            if (r10 <= r0) goto L2d
            r10 = r0
        L2d:
            long r5 = (long) r10
            r7 = 40
            long r5 = r5 * r7
            r9.f2136u = r5
            r9.f2137v = r3
            java.lang.Object r10 = pf.j(r5, r9)
            if (r10 != r4) goto L3c
            goto L5a
        L3c:
            java.lang.Float r10 = new java.lang.Float
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.<init>(r0)
            r0 = 1137180672(0x43c80000, float:400.0)
            r3 = 4
            r7 = 1061326684(0x3f428f5c, float:0.76)
            r8 = 0
            q.r0 r0 = q.e.r(r7, r0, r8, r3)
            r9.f2136u = r5
            r9.f2137v = r2
            q.d r2 = r9.f2140y
            java.lang.Object r10 = q.c(r2, r10, r0, r9)
            if (r10 != r4) goto L5b
        L5a:
            return r4
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.gb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
