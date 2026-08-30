package g5;
import o0.a;

/* loaded from: classes.dex */
public final class g0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public Object f17444u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f17445v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o0 f17446w;

    /* renamed from: x, reason: collision with root package name */
    public int f17447x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(o0 o0Var, ve.c cVar) {
        super(cVar);
        this.f17446w = o0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f17445v = obj;
        this.f17447x |= Integer.MIN_VALUE;
        return a(this.f17446w, null, this);
    }
}
