package x7;

import r0.a1;

/* loaded from: classes.dex */
public final class n extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30240u;

    /* renamed from: v, reason: collision with root package name */
    public int f30241v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f30242w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f30243x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f30244y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(boolean z3, a1 a1Var, a1 a1Var2, te.c cVar, int i) {
        super(2, cVar);
        this.f30240u = i;
        this.f30242w = z3;
        this.f30243x = a1Var;
        this.f30244y = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f30240u) {
            case 0:
                return new n(this.f30242w, this.f30243x, this.f30244y, cVar, 0);
            case 1:
                return new n(this.f30242w, this.f30243x, this.f30244y, cVar, 1);
            case 2:
                return new n(this.f30242w, this.f30243x, this.f30244y, cVar, 2);
            case 3:
                return new n(this.f30242w, this.f30243x, this.f30244y, cVar, 3);
            case 4:
                return new n(this.f30242w, this.f30243x, this.f30244y, cVar, 4);
            default:
                return new n(this.f30242w, this.f30243x, this.f30244y, cVar, 5);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f30240u) {
            case 0:
                return ((n) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((n) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((n) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((n) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((n) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((n) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a2, code lost:
    
        if (pf.b0.j(150, r5) == r0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e1, code lost:
    
        if (pf.b0.j(50, r5) == r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01f7, code lost:
    
        if (pf.b0.j(150, r5) == r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (pf.b0.j(50, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (pf.b0.j(150, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        if (pf.b0.j(50, r5) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        if (pf.b0.j(150, r5) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e2, code lost:
    
        if (pf.b0.j(50, r5) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f8, code lost:
    
        if (pf.b0.j(150, r5) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0137, code lost:
    
        if (pf.b0.j(50, r5) == r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014d, code lost:
    
        if (pf.b0.j(150, r5) == r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018c, code lost:
    
        if (pf.b0.j(50, r5) == r0) goto L95;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
