package u7;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26909a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26910b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26911c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26912d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26913f;

    /* renamed from: g, reason: collision with root package name */
    public final df.l f26914g;

    public u1(int i, boolean z3, boolean z9, float f10, float f11, df.l lVar, int i10) {
        z3 = (i10 & 2) != 0 ? true : z3;
        z9 = (i10 & 4) != 0 ? true : z9;
        boolean z10 = (i10 & 8) == 0;
        f10 = (i10 & 16) != 0 ? 0.0f : f10;
        f11 = (i10 & 32) != 0 ? 0.0f : f11;
        lVar = (i10 & 64) != 0 ? new y0(3) : lVar;
        this.f26909a = i;
        this.f26910b = z3;
        this.f26911c = z9;
        this.f26912d = z10;
        this.e = f10;
        this.f26913f = f11;
        this.f26914g = lVar;
    }
}
