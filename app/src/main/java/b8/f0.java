package b8;
import b8.f0;
import d.c;
import r0.a1;
import r1.a;

/* loaded from: classes.dex */
public final class f0 extends ve.i implements df.p {
    public final /* synthetic */ q.d A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ a D;

    /* renamed from: u, reason: collision with root package name */
    public int f2052u;

    /* renamed from: v, reason: collision with root package name */
    public int f2053v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f2054w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f2055x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f2056y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ q.d f2057z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a1 a1Var, boolean z3, q.d dVar, q.d dVar2, String str, boolean z9, a aVar, te.c cVar) {
        super(2, cVar);
        this.f2055x = a1Var;
        this.f2056y = z3;
        this.f2057z = dVar;
        this.A = dVar2;
        this.B = str;
        this.C = z9;
        this.D = aVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        f0 f0Var = new f0(this.f2055x, this.f2056y, this.f2057z, this.A, this.B, this.C, this.D, cVar);
        f0Var.f2054w = obj;
        return f0Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x01ad, code lost:
    
        if (q.c(r14, r0, r3, r13) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0168, code lost:
    
        if (r14.g(r2, r13) != r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0134, code lost:
    
        if (q.c(r14, r0, r3, r13) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
    
        if (r14 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r14.g(r2, r13) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        if (r14.g(r5, r13) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0185, code lost:
    
        if (r4.g(r14, r13) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d3, code lost:
    
        if (q.c(r14, r0, r3, r13) == r1) goto L70;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
