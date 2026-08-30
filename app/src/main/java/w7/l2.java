package w7;
import v1.w;

/* loaded from: classes.dex */
public final class l2 extends ve.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public w f28610u;

    /* renamed from: v, reason: collision with root package name */
    public float f28611v;

    /* renamed from: w, reason: collision with root package name */
    public float f28612w;

    /* renamed from: x, reason: collision with root package name */
    public float f28613x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f28614y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m2 f28615z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, te.c cVar) {
        super(cVar);
        this.f28615z = m2Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f28614y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f28615z.invoke(null, this);
    }
}
