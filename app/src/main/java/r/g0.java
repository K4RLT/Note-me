package r;
import v.f;

/* loaded from: classes.dex */
public final class g0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public j0 f24078u;

    /* renamed from: v, reason: collision with root package name */
    public f f24079v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24080w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f24081x;

    /* renamed from: y, reason: collision with root package name */
    public int f24082y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, ve.c cVar) {
        super(cVar);
        this.f24081x = j0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f24080w = obj;
        this.f24082y |= Integer.MIN_VALUE;
        return j0.Y0(this.f24081x, this);
    }
}
