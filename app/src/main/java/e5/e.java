package e5;
import f.c;

/* loaded from: classes.dex */
public final class e extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public f f15917u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f15918v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f15919w;

    /* renamed from: x, reason: collision with root package name */
    public int f15920x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, te.c cVar) {
        super(cVar);
        this.f15919w = fVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f15918v = obj;
        this.f15920x |= Integer.MIN_VALUE;
        return c(this.f15919w, null, this);
    }
}
