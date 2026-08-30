package g5;
import o0.c;

/* loaded from: classes.dex */
public final class k0 extends ve.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ o0 B;
    public int C;

    /* renamed from: u, reason: collision with root package name */
    public m f17473u;

    /* renamed from: v, reason: collision with root package name */
    public String f17474v;

    /* renamed from: w, reason: collision with root package name */
    public String[] f17475w;

    /* renamed from: x, reason: collision with root package name */
    public int f17476x;

    /* renamed from: y, reason: collision with root package name */
    public int f17477y;

    /* renamed from: z, reason: collision with root package name */
    public int f17478z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o0 o0Var, ve.c cVar) {
        super(cVar);
        this.B = o0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return c(this.B, null, 0, this);
    }
}
