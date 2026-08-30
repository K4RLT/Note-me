package gg;

/* loaded from: classes.dex */
public final class o extends a {

    /* renamed from: f, reason: collision with root package name */
    public final fg.e f17779f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17780g;

    /* renamed from: h, reason: collision with root package name */
    public int f17781h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fg.c cVar, fg.e eVar) {
        super(cVar, null);
        cVar.getClass();
        eVar.getClass();
        this.f17779f = eVar;
        this.f17780g = eVar.f16968u.size();
        this.f17781h = -1;
    }

    @Override // gg.a
    public final fg.m D(String str) {
        str.getClass();
        return (fg.m) this.f17779f.f16968u.get(Integer.parseInt(str));
    }

    @Override // gg.a
    public final String P(cg.d dVar, int i) {
        dVar.getClass();
        return String.valueOf(i);
    }

    @Override // gg.a
    public final fg.m R() {
        return this.f17779f;
    }

    @Override // dg.a
    public final int t(cg.d dVar) {
        dVar.getClass();
        int i = this.f17781h;
        if (i < this.f17780g - 1) {
            int i10 = i + 1;
            this.f17781h = i10;
            return i10;
        }
        return -1;
    }
}
