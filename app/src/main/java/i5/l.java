package i5;

/* loaded from: classes.dex */
public final class l implements d0, g5.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18261b;

    public /* synthetic */ l(int i, Object obj) {
        this.f18260a = i;
        this.f18261b = obj;
    }

    @Override // i5.d0
    public final p5.a b() {
        switch (this.f18260a) {
            case 0:
                return ((q) this.f18261b).f18279b;
            default:
                return ((c0) this.f18261b).f18225b;
        }
    }

    @Override // g5.m
    public final Object c(String str, df.l lVar, ve.c cVar) {
        switch (this.f18260a) {
            case 0:
                return ((q) this.f18261b).c(str, lVar, cVar);
            default:
                return ((c0) this.f18261b).c(str, lVar, cVar);
        }
    }
}
