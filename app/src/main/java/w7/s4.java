package w7;
import w7.s4;

import android.content.Context;

/* loaded from: classes.dex */
public final class s4 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f29053u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29054v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29055w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f29056x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f29057y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(boolean z3, u7.m3 m3Var, int i, Context context, int i10, te.c cVar) {
        super(2, cVar);
        this.f29053u = z3;
        this.f29054v = m3Var;
        this.f29055w = i;
        this.f29056x = context;
        this.f29057y = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new s4(this.f29053u, this.f29054v, this.f29055w, this.f29056x, this.f29057y, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s4) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [u7.m3] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.s4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
