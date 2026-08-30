package t;

/* loaded from: classes.dex */
public final class y0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public f5.a f25583u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25584v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f5.a f25585w;

    /* renamed from: x, reason: collision with root package name */
    public int f25586x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(f5.a aVar, ve.c cVar) {
        super(cVar);
        this.f25585w = aVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25584v = obj;
        this.f25586x |= Integer.MIN_VALUE;
        return this.f25585w.h(null, null, this);
    }
}
