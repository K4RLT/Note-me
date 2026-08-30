package tf;

import g0.a0;

/* loaded from: classes.dex */
public final class i extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public a0 f25728u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25729v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25730w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a0 f25731x;

    /* renamed from: y, reason: collision with root package name */
    public int f25732y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a0 a0Var, te.c cVar) {
        super(cVar);
        this.f25731x = a0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25730w = obj;
        this.f25732y |= Integer.MIN_VALUE;
        return this.f25731x.e(null, this);
    }
}
