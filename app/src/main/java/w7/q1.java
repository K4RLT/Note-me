package w7;
import w7.p1;
import w7.q1;
import x.o;

/* loaded from: classes.dex */
public final class q1 extends ve.i implements df.p {
    public final /* synthetic */ kotlin.jvm.internal.y A;
    public final /* synthetic */ float B;
    public final /* synthetic */ float C;

    /* renamed from: u, reason: collision with root package name */
    public int f28937u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f28938v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28939w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28940x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28941y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f28942z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(boolean z3, int i, int i10, u7.m3 m3Var, int i11, kotlin.jvm.internal.y yVar, float f10, float f11, te.c cVar) {
        super(2, cVar);
        this.f28938v = z3;
        this.f28939w = i;
        this.f28940x = i10;
        this.f28941y = m3Var;
        this.f28942z = i11;
        this.A = yVar;
        this.B = f10;
        this.C = f11;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new q1(this.f28938v, this.f28939w, this.f28940x, this.f28941y, this.f28942z, this.A, this.B, this.C, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (pf.b0.j(450, r16) == r6) goto L23;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f28937u
            pe.z r2 = pe.z.f22715a
            int r3 = r0.f28939w
            r4 = 2
            r5 = 1
            ue.a r6 = ue.a.f27192u
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L16
            pe.a.e(r17)
            return r2
        L16:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            q.o(r1)
            r1 = 0
            return r1
        L1d:
            pe.a.e(r17)
            goto L36
        L21:
            pe.a.e(r17)
            boolean r1 = r0.f28938v
            if (r1 != 0) goto L63
            if (r3 > r5) goto L2b
            goto L63
        L2b:
            r0.f28937u = r5
            r7 = 450(0x1c2, double:2.223E-321)
            java.lang.Object r1 = pf.b0.j(r7, r0)
            if (r1 != r6) goto L36
            goto L62
        L36:
            int r1 = r0.f28940x
            int r1 = r1 + r5
            kotlin.jvm.internal.y r12 = r0.A
            u7.m3 r10 = r0.f28941y
            if (r1 >= r3) goto L48
            java.lang.Object r3 = r12.f19787u
            android.content.Context r3 = (android.content.Context) r3
            int r5 = r0.f28942z
            r10.J0(r5, r1, r3)
        L48:
            wf.e r1 = pf.l0.f22767a
            p1 r7 = new p1
            float r14 = r0.C
            r15 = 0
            int r8 = r0.f28940x
            int r9 = r0.f28939w
            int r11 = r0.f28942z
            float r13 = r0.B
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f28937u = r4
            java.lang.Object r1 = pf.b0.J(r1, r7, r0)
            if (r1 != r6) goto L63
        L62:
            return r6
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
