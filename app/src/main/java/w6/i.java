package w6;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27744a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final v6.b f27745b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27746c;

    /* renamed from: d, reason: collision with root package name */
    public final v6.e f27747d;
    public final Object e;

    public i(String str, v6.b bVar, v6.b bVar2, v6.d dVar, boolean z3) {
        this.f27745b = bVar;
        this.f27747d = bVar2;
        this.e = dVar;
        this.f27746c = z3;
    }

    @Override // w6.b
    public final q6.c a(o6.j jVar, o6.a aVar, x6.b bVar) {
        switch (this.f27744a) {
            case 0:
                return new q6.n(jVar, bVar, this);
            default:
                return new q6.o(jVar, bVar, this);
        }
    }

    public String toString() {
        switch (this.f27744a) {
            case 0:
                return "RectangleShape{position=" + this.f27747d + ", size=" + ((v6.e) this.e) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, v6.e eVar, v6.a aVar, v6.b bVar, boolean z3) {
        this.f27747d = eVar;
        this.e = aVar;
        this.f27745b = bVar;
        this.f27746c = z3;
    }
}
