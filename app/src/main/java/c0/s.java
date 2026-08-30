package c0;
import c0.d;
import c0.i0;
import c0.m0;
import c0.s;
import q.e;
import q.x;
import r.u0;

/* loaded from: classes.dex */
public final class s extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3400u;

    /* renamed from: v, reason: collision with root package name */
    public int f3401v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f3402w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(d dVar, te.c cVar, int i) {
        super(2, cVar);
        this.f3400u = i;
        this.f3402w = dVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f3400u) {
            case 0:
                return new s(this.f3402w, cVar, 0);
            case 1:
                return new s(this.f3402w, cVar, 1);
            default:
                return new s(this.f3402w, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f3400u) {
            case 0:
                return ((s) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((s) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((s) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r8 = r1.f(r1.j() + 1, e.r(0.0f, 0.0f, null, 7), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        r8 = r1.f(r1.j() - 1, e.r(0.0f, 0.0f, null, 7), r7);
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f3400u
            d r1 = r7.f3402w
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            ue.a r3 = ue.a.f27192u
            r4 = 1
            pe.z r5 = pe.z.f22715a
            r6 = 0
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L38;
                default: goto Lf;
            }
        Lf:
            int r0 = r7.f3401v
            if (r0 == 0) goto L1f
            if (r0 != r4) goto L1a
            pe.a.e(r8)
        L18:
            r3 = r5
            goto L37
        L1a:
            x.o(r2)
            r3 = r6
            goto L37
        L1f:
            pe.a.e(r8)
            r7.f3401v = r4
            c2.w0 r8 = new c2.w0
            r0 = 2
            r2 = 5
            r8.<init>(r0, r6, r2)
            u0 r0 = u0.f24148u
            java.lang.Object r8 = i0.s(r1, r0, r8, r7)
            if (r8 != r3) goto L34
            goto L35
        L34:
            r8 = r5
        L35:
            if (r8 != r3) goto L18
        L37:
            return r3
        L38:
            int r0 = r7.f3401v
            if (r0 == 0) goto L48
            if (r0 != r4) goto L43
            pe.a.e(r8)
        L41:
            r3 = r5
            goto L69
        L43:
            x.o(r2)
            r3 = r6
            goto L69
        L48:
            pe.a.e(r8)
            r7.f3401v = r4
            float r8 = m0.f3374a
            int r8 = r1.j()
            int r8 = r8 + r4
            int r0 = r1.m()
            if (r8 >= r0) goto L66
            int r8 = r1.j()
            int r8 = r8 + r4
            java.lang.Object r8 = i0.g(r1, r8, r7)
            if (r8 != r3) goto L66
            goto L67
        L66:
            r8 = r5
        L67:
            if (r8 != r3) goto L41
        L69:
            return r3
        L6a:
            int r0 = r7.f3401v
            if (r0 == 0) goto L7a
            if (r0 != r4) goto L75
            pe.a.e(r8)
        L73:
            r3 = r5
            goto L97
        L75:
            x.o(r2)
            r3 = r6
            goto L97
        L7a:
            pe.a.e(r8)
            r7.f3401v = r4
            float r8 = m0.f3374a
            int r8 = r1.j()
            int r8 = r8 - r4
            if (r8 < 0) goto L94
            int r8 = r1.j()
            int r8 = r8 - r4
            java.lang.Object r8 = i0.g(r1, r8, r7)
            if (r8 != r3) goto L94
            goto L95
        L94:
            r8 = r5
        L95:
            if (r8 != r3) goto L73
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
