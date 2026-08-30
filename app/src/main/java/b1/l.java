package b1;

/* loaded from: classes.dex */
public final class l extends ve.h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public long[] f1356u;

    /* renamed from: v, reason: collision with root package name */
    public int f1357v;

    /* renamed from: w, reason: collision with root package name */
    public int f1358w;

    /* renamed from: x, reason: collision with root package name */
    public int f1359x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f1360y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m f1361z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, te.c cVar) {
        super(2, cVar);
        this.f1361z = mVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        l lVar = new l(this.f1361z, cVar);
        lVar.f1360y = obj;
        return lVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((lf.e) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bc -> B:7:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:20:0x0094). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
