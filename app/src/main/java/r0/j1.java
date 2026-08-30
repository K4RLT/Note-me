package r0;
import c2.a1;

/* loaded from: classes.dex */
public final class j1 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public df.l f24268u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f24269v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f24270w;

    /* renamed from: x, reason: collision with root package name */
    public int f24271x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(a1 a1Var, te.c cVar) {
        super(cVar);
        this.f24270w = a1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f24269v = obj;
        this.f24271x |= Integer.MIN_VALUE;
        return this.f24270w.R(null, this);
    }
}
