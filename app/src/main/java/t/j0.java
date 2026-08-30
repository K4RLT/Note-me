package t;
import v.b;

/* loaded from: classes.dex */
public final class j0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public r1 f25424u;

    /* renamed from: v, reason: collision with root package name */
    public o f25425v;

    /* renamed from: w, reason: collision with root package name */
    public b f25426w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f25427x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r1 f25428y;

    /* renamed from: z, reason: collision with root package name */
    public int f25429z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(r1 r1Var, ve.c cVar) {
        super(cVar);
        this.f25428y = r1Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25427x = obj;
        this.f25429z |= Integer.MIN_VALUE;
        return r1.c1(this.f25428y, null, this);
    }
}
