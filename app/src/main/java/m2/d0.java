package m2;

/* loaded from: classes.dex */
public final class d0 implements a1.s {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ df.p f20449u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f20450v;

    public d0(df.p pVar, df.l lVar) {
        this.f20449u = pVar;
        this.f20450v = lVar;
    }

    @Override // a1.s
    public final Object c(Object obj) {
        return this.f20450v.invoke(obj);
    }

    @Override // a1.s
    public final Object d(a1.d dVar, Object obj) {
        return this.f20449u.invoke(dVar, obj);
    }
}
