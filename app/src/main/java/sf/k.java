package sf;

import b8.fb;

/* loaded from: classes.dex */
public final class k extends ve.i implements df.q {
    public final /* synthetic */ g A;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.y f25191u;

    /* renamed from: v, reason: collision with root package name */
    public kotlin.jvm.internal.x f25192v;

    /* renamed from: w, reason: collision with root package name */
    public int f25193w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f25194x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f25195y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ fb f25196z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(fb fbVar, g gVar, te.c cVar) {
        super(3, cVar);
        this.f25196z = fbVar;
        this.A = gVar;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        k kVar = new k(this.f25196z, this.A, (te.c) obj3);
        kVar.f25194x = (pf.z) obj;
        kVar.f25195y = (h) obj2;
        return kVar.invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
    
        if (r12.c(r19) == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x001d, code lost:
    
        if (r12.d(r19) == r6) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [rf.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r7v9, types: [rf.l] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
