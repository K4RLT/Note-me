package y3;
import z.b;

/* loaded from: classes.dex */
public final class p extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public Object f30846u;

    /* renamed from: v, reason: collision with root package name */
    public z f30847v;

    /* renamed from: w, reason: collision with root package name */
    public pf.q f30848w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f30849x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f30850y;

    /* renamed from: z, reason: collision with root package name */
    public int f30851z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, ve.c cVar) {
        super(cVar);
        this.f30850y = zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30849x = obj;
        this.f30851z |= Integer.MIN_VALUE;
        return b(this.f30850y, null, this);
    }
}
