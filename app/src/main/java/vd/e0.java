package vd;
import f0.a;

/* loaded from: classes.dex */
public final class e0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public f0 f27568u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f27569v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f27570w;

    /* renamed from: x, reason: collision with root package name */
    public int f27571x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, ve.c cVar) {
        super(cVar);
        this.f27570w = f0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f27569v = obj;
        this.f27571x |= Integer.MIN_VALUE;
        return a(this.f27570w, this);
    }
}
