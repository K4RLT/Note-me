package u7;

import java.util.List;

/* loaded from: classes.dex */
public final class s2 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public List f26827u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26828v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t2 f26829w;

    /* renamed from: x, reason: collision with root package name */
    public int f26830x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var, te.c cVar) {
        super(cVar);
        this.f26829w = t2Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f26828v = obj;
        this.f26830x |= Integer.MIN_VALUE;
        return this.f26829w.a(null, this);
    }
}
