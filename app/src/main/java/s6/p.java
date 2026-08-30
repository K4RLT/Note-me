package s6;

/* loaded from: classes.dex */
public final class p implements o6.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf.l f24976b;

    public /* synthetic */ p(pf.l lVar, int i) {
        this.f24975a = i;
        this.f24976b = lVar;
    }

    @Override // o6.m
    public final void onResult(Object obj) {
        switch (this.f24975a) {
            case 0:
                pf.l lVar = this.f24976b;
                if (!lVar.w()) {
                    lVar.resumeWith(obj);
                    return;
                }
                return;
            default:
                Throwable th = (Throwable) obj;
                pf.l lVar2 = this.f24976b;
                if (!lVar2.w()) {
                    th.getClass();
                    lVar2.resumeWith(new pe.k(th));
                    return;
                }
                return;
        }
    }
}
