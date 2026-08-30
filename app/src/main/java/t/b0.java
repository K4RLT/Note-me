package t;
import t.b0;
import v1.b;

/* loaded from: classes.dex */
public final class b0 extends ve.h implements df.p {
    public final /* synthetic */ pe.d A;
    public final /* synthetic */ Object B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25327u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25328v;

    /* renamed from: w, reason: collision with root package name */
    public int f25329w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f25330x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f25331y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ pe.d f25332z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(pf.z zVar, df.q qVar, df.l lVar, c1 c1Var, te.c cVar) {
        super(2, cVar);
        this.f25327u = 2;
        this.f25331y = zVar;
        this.f25332z = (ve.i) qVar;
        this.A = (kotlin.jvm.internal.m) lVar;
        this.B = c1Var;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [df.q, ve.i] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.internal.m, df.l] */
    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25327u) {
            case 0:
                b0 b0Var = new b0((df.l) this.f25331y, (df.p) this.f25332z, (df.a) this.A, (df.a) this.B, cVar, 0);
                b0Var.f25330x = obj;
                return b0Var;
            case 1:
                b0 b0Var2 = new b0((df.l) this.f25331y, (df.p) this.f25332z, (df.a) this.A, (df.a) this.B, cVar, 1);
                b0Var2.f25330x = obj;
                return b0Var2;
            default:
                b0 b0Var3 = new b0((pf.z) this.f25331y, (ve.i) this.f25332z, (kotlin.jvm.internal.m) this.A, (c1) this.B, cVar);
                b0Var3.f25330x = obj;
                return b0Var3;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f25327u) {
            case 0:
                return ((b0) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((b0) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((b0) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r1 == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r11 == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0142, code lost:
    
        if (r0 == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ee, code lost:
    
        if (r1 == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ef, code lost:
    
        if (r0 == r8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019c, code lost:
    
        if (r1 == r8) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [df.q, ve.i] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.internal.m, df.l] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(df.l lVar, df.p pVar, df.a aVar, df.a aVar2, te.c cVar, int i) {
        super(2, cVar);
        this.f25327u = i;
        this.f25331y = lVar;
        this.f25332z = pVar;
        this.A = aVar;
        this.B = aVar2;
    }
}
