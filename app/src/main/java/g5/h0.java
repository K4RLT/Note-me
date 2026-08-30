package g5;
import g0.a0;

/* loaded from: classes.dex */
public final class h0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public int[] f17449u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f17450v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f17451w;

    /* renamed from: x, reason: collision with root package name */
    public int f17452x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(a0 a0Var, te.c cVar) {
        super(cVar);
        this.f17451w = a0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f17450v = obj;
        this.f17452x |= Integer.MIN_VALUE;
        return this.f17451w.a(null, this);
    }
}
