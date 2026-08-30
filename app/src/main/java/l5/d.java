package l5;

import df.l;
import df.p;
import g5.e0;
import g5.f0;
import g5.v;
import pe.z;

/* loaded from: classes.dex */
public final class d extends ve.i implements p {
    public final /* synthetic */ l A;

    /* renamed from: u, reason: collision with root package name */
    public e0 f19912u;

    /* renamed from: v, reason: collision with root package name */
    public int f19913v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f19914w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f19915x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f19916y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v f19917z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, v vVar, te.c cVar, boolean z3, boolean z9) {
        super(2, cVar);
        this.f19915x = z3;
        this.f19916y = z9;
        this.f19917z = vVar;
        this.A = lVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        d dVar = new d(this.A, this.f19917z, cVar, this.f19915x, this.f19916y);
        dVar.f19914w = obj;
        return dVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (te.c) obj2)).invokeSuspend(z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r12 != r8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00be  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
