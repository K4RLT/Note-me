package w6;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f27714a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f27715b;

    /* renamed from: c, reason: collision with root package name */
    public final v6.a f27716c;

    /* renamed from: d, reason: collision with root package name */
    public final v6.a f27717d;
    public final v6.a e;

    /* renamed from: f, reason: collision with root package name */
    public final v6.a f27718f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27719g;

    public d(String str, int i, Path.FillType fillType, v6.a aVar, v6.a aVar2, v6.a aVar3, v6.a aVar4, boolean z3) {
        this.f27714a = i;
        this.f27715b = fillType;
        this.f27716c = aVar;
        this.f27717d = aVar2;
        this.e = aVar3;
        this.f27718f = aVar4;
        this.f27719g = z3;
    }

    @Override // w6.b
    public final q6.c a(o6.j jVar, o6.a aVar, x6.b bVar) {
        return new q6.h(jVar, aVar, bVar, this);
    }
}
