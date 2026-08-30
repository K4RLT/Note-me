package sf;

import c2.a3;

/* loaded from: classes.dex */
public final class j extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25184u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a3 f25185v;

    /* renamed from: w, reason: collision with root package name */
    public int f25186w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a3 a3Var, te.c cVar) {
        super(cVar);
        this.f25185v = a3Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25184u = obj;
        this.f25186w |= Integer.MIN_VALUE;
        return this.f25185v.e(null, this);
    }
}
