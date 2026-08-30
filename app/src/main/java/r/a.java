package r;
import r.a;
import t.c1;
import v.i;
import v.k;

/* loaded from: classes.dex */
public final class a extends ve.i implements df.p {
    public final /* synthetic */ d A;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24039u;

    /* renamed from: v, reason: collision with root package name */
    public int f24040v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24041w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c1 f24042x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f24043y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ i f24044z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c1 c1Var, long j10, i iVar, d dVar, te.c cVar) {
        super(2, cVar);
        this.f24042x = c1Var;
        this.f24043y = j10;
        this.f24044z = iVar;
        this.A = dVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        a aVar = new a(this.f24042x, this.f24043y, this.f24044z, this.A, cVar);
        aVar.f24041w = obj;
        return aVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bc, code lost:
    
        if (r15.a(r1, r18) != r11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        if (r15.a(r3, r18) == r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (r3 == r11) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.concurrent.CancellationException, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [k] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v4, types: [pf.d1] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
