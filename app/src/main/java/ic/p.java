package ic;

/* loaded from: classes.dex */
public final class p implements gd.b {

    /* renamed from: c, reason: collision with root package name */
    public static final g5.q f18418c = new g5.q(6);

    /* renamed from: d, reason: collision with root package name */
    public static final f f18419d = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public gd.a f18420a;

    /* renamed from: b, reason: collision with root package name */
    public volatile gd.b f18421b;

    public p(g5.q qVar, gd.b bVar) {
        this.f18420a = qVar;
        this.f18421b = bVar;
    }

    public final void a(gd.a aVar) {
        gd.b bVar;
        gd.b bVar2;
        gd.b bVar3 = this.f18421b;
        f fVar = f18419d;
        if (bVar3 != fVar) {
            aVar.i(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f18421b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f18420a = new e7.d(this.f18420a, 3, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.i(bVar);
        }
    }

    @Override // gd.b
    public final Object get() {
        return this.f18421b.get();
    }
}
