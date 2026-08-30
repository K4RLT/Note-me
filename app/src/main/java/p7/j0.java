package p7;

/* loaded from: classes.dex */
public final class j0 extends ve.h implements df.p {
    public long A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ df.l D;
    public final /* synthetic */ df.p E;
    public final /* synthetic */ df.a F;
    public final /* synthetic */ e0 G;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.x f22507u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22508v;

    /* renamed from: w, reason: collision with root package name */
    public int f22509w;

    /* renamed from: x, reason: collision with root package name */
    public int f22510x;

    /* renamed from: y, reason: collision with root package name */
    public int f22511y;

    /* renamed from: z, reason: collision with root package name */
    public int f22512z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(df.l lVar, df.p pVar, df.a aVar, e0 e0Var, te.c cVar) {
        super(2, cVar);
        this.D = lVar;
        this.E = pVar;
        this.F = aVar;
        this.G = e0Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        j0 j0Var = new j0(this.D, this.E, this.F, this.G, cVar);
        j0Var.C = obj;
        return j0Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((v1.b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0056, code lost:
    
        if (r3 == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011c, code lost:
    
        if (r10 == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011e, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02df  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x011c -> B:6:0x011f). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
