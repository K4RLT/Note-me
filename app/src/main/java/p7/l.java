package p7;

import r0.a1;

/* loaded from: classes.dex */
public final class l extends ve.h implements df.p {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22524u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f22525v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f22526w;

    /* renamed from: x, reason: collision with root package name */
    public Object f22527x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f22528y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f22529z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(df.l lVar, df.a aVar, df.a aVar2, df.p pVar, te.c cVar) {
        super(2, cVar);
        this.f22527x = lVar;
        this.f22528y = aVar;
        this.f22529z = aVar2;
        this.A = pVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f22524u) {
            case 0:
                l lVar = new l((b1.v) this.f22528y, (b1.v) this.f22529z, (a1) this.A, cVar);
                lVar.f22526w = obj;
                return lVar;
            default:
                l lVar2 = new l((df.l) this.f22527x, (df.a) this.f22528y, (df.a) this.f22529z, (df.p) this.A, cVar);
                lVar2.f22526w = obj;
                return lVar2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        v1.b bVar = (v1.b) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f22524u) {
            case 0:
                return ((l) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((l) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f9, code lost:
    
        if (r12 == r2) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[Catch: CancellationException -> 0x0020, TryCatch #0 {CancellationException -> 0x0020, blocks: (B:10:0x001c, B:11:0x0088, B:13:0x0090, B:15:0x00a2, B:17:0x00ae, B:19:0x00b1, B:22:0x00b4, B:26:0x00bc, B:30:0x002f, B:31:0x005e, B:33:0x0062, B:39:0x0037, B:40:0x004f, B:45:0x0043), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[Catch: CancellationException -> 0x0020, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0020, blocks: (B:10:0x001c, B:11:0x0088, B:13:0x0090, B:15:0x00a2, B:17:0x00ae, B:19:0x00b1, B:22:0x00b4, B:26:0x00bc, B:30:0x002f, B:31:0x005e, B:33:0x0062, B:39:0x0037, B:40:0x004f, B:45:0x0043), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062 A[Catch: CancellationException -> 0x0020, TryCatch #0 {CancellationException -> 0x0020, blocks: (B:10:0x001c, B:11:0x0088, B:13:0x0090, B:15:0x00a2, B:17:0x00ae, B:19:0x00b1, B:22:0x00b4, B:26:0x00bc, B:30:0x002f, B:31:0x005e, B:33:0x0062, B:39:0x0037, B:40:0x004f, B:45:0x0043), top: B:4:0x0010 }] */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.util.List, java.lang.Object] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b1.v vVar, b1.v vVar2, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f22528y = vVar;
        this.f22529z = vVar2;
        this.A = a1Var;
    }
}
