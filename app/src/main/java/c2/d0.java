package c2;
import n.x;

/* loaded from: classes.dex */
public final class d0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public x f3499u;

    /* renamed from: v, reason: collision with root package name */
    public rf.c f3500v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3501w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f0 f3502x;

    /* renamed from: y, reason: collision with root package name */
    public int f3503y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, ve.c cVar) {
        super(cVar);
        this.f3502x = f0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f3501w = obj;
        this.f3503y |= Integer.MIN_VALUE;
        return this.f3502x.e(this);
    }
}
