package pf;

/* loaded from: classes.dex */
public final class s1 extends uf.q {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f22791y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(te.g gVar, te.c cVar, int i) {
        super(cVar, gVar);
        this.f22791y = i;
    }

    @Override // pf.k1
    public final boolean z(Throwable th) {
        switch (this.f22791y) {
            case 0:
                return false;
            default:
                if (th instanceof tf.k) {
                    return true;
                }
                return u(th);
        }
    }
}
