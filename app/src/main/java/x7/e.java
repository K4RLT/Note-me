package x7;
import q.x;
import r.h;

import r0.e1;

/* loaded from: classes.dex */
public final class e extends ve.h implements df.p {
    public final /* synthetic */ df.a A;
    public final /* synthetic */ e1 B;

    /* renamed from: u, reason: collision with root package name */
    public v1.t f30171u;

    /* renamed from: v, reason: collision with root package name */
    public int f30172v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f30173w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.l f30174x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f30175y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f30176z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(df.l lVar, float f10, float f11, df.a aVar, e1 e1Var, te.c cVar) {
        super(2, cVar);
        this.f30174x = lVar;
        this.f30175y = f10;
        this.f30176z = f11;
        this.A = aVar;
        this.B = e1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        e eVar = new e(this.f30174x, this.f30175y, this.f30176z, this.A, this.B, cVar);
        eVar.f30173w = obj;
        return eVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((v1.b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 != r12) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003f, code lost:
    
        if (r2 == r12) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006e -> B:6:0x0071). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.f30173w
            v1.b r1 = (v1.b) r1
            int r2 = r0.f30172v
            float r3 = r0.f30176z
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r0.e1 r6 = r0.B
            r7 = 32
            df.l r8 = r0.f30174x
            r9 = 2
            r10 = 1
            float r11 = r0.f30175y
            ue.a r12 = ue.a.f27192u
            if (r2 == 0) goto L34
            if (r2 == r10) goto L2e
            if (r2 != r9) goto L27
            v1.t r2 = r0.f30171u
            pe.a.e(r17)
            r10 = r17
            goto L71
        L27:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r1)
            r1 = 0
            return r1
        L2e:
            pe.a.e(r17)
            r2 = r17
            goto L42
        L34:
            pe.a.e(r17)
            r0.f30173w = r1
            r0.f30172v = r10
            java.lang.Object r2 = t.k2.c(r1, r0, r9)
            if (r2 != r12) goto L42
            goto L70
        L42:
            v1.t r2 = (v1.t) r2
            r2.a()
            long r13 = r2.f27343c
            long r13 = r13 >> r7
            int r10 = (int) r13
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r13 = r6.h()
            float r10 = r10 / r13
            float r10 = wa.b9.d(r10, r5, r4)
            float r10 = g3.a.x(r3, r11, r10, r11)
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r10)
            r8.invoke(r13)
        L64:
            r0.f30173w = r1
            r0.f30171u = r2
            r0.f30172v = r9
            java.lang.Object r10 = v1.b.q0(r1, r0)
            if (r10 != r12) goto L71
        L70:
            return r12
        L71:
            v1.k r10 = (v1.k) r10
            java.lang.Object r10 = r10.f27327a
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L7b:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L99
            java.lang.Object r13 = r10.next()
            r14 = r13
            v1.t r14 = (v1.t) r14
            long r14 = r14.f27341a
            r17 = r10
            long r9 = r2.f27341a
            boolean r9 = v1.s.a(r14, r9)
            if (r9 == 0) goto L95
            goto L9a
        L95:
            r10 = r17
            r9 = 2
            goto L7b
        L99:
            r13 = 0
        L9a:
            v1.t r13 = (v1.t) r13
            if (r13 != 0) goto L9f
            goto Lcb
        L9f:
            boolean r9 = r13.f27344d
            if (r9 == 0) goto Lcb
            boolean r9 = v1.h(r13)
            if (r9 == 0) goto Lc9
            r13.a()
            long r9 = r13.f27343c
            long r9 = r9 >> r7
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = r6.h()
            float r9 = r9 / r10
            float r9 = wa.b9.d(r9, r5, r4)
            float r9 = g3.a.x(r3, r11, r9, r11)
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r9)
            r8.invoke(r10)
        Lc9:
            r9 = 2
            goto L64
        Lcb:
            df.a r1 = r0.A
            if (r1 == 0) goto Ld2
            r1.invoke()
        Ld2:
            pe.z r1 = pe.z.f22715a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
