package w6;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27752a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f27753b;

    /* renamed from: c, reason: collision with root package name */
    public final v6.a f27754c;

    /* renamed from: d, reason: collision with root package name */
    public final v6.a f27755d;
    public final boolean e;

    public l(String str, boolean z3, Path.FillType fillType, v6.a aVar, v6.a aVar2, boolean z9) {
        this.f27752a = z3;
        this.f27753b = fillType;
        this.f27754c = aVar;
        this.f27755d = aVar2;
        this.e = z9;
    }

    @Override // w6.b
    public final q6.c a(o6.j jVar, o6.a aVar, x6.b bVar) {
        return new q6.g(jVar, bVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f27752a + '}';
    }
}
