package hd;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ib.h f18023a;

    public h(ib.h hVar) {
        this.f18023a = hVar;
    }

    @Override // hd.j
    public final boolean a(id.a aVar) {
        int i = aVar.f18425b;
        if (i == 3 || i == 4 || i == 5) {
            this.f18023a.d(aVar.f18424a);
            return true;
        }
        return false;
    }

    @Override // hd.j
    public final boolean b(Exception exc) {
        return false;
    }
}
