package w6;

import java.util.ArrayList;
import q6.r;

/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final v6.b f27763a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27764b;

    /* renamed from: c, reason: collision with root package name */
    public final v6.a f27765c;

    /* renamed from: d, reason: collision with root package name */
    public final v6.a f27766d;
    public final v6.b e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27767f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27768g;

    /* renamed from: h, reason: collision with root package name */
    public final float f27769h;
    public final boolean i;

    public o(String str, v6.b bVar, ArrayList arrayList, v6.a aVar, v6.a aVar2, v6.b bVar2, int i, int i10, float f10, boolean z3) {
        this.f27763a = bVar;
        this.f27764b = arrayList;
        this.f27765c = aVar;
        this.f27766d = aVar2;
        this.e = bVar2;
        this.f27767f = i;
        this.f27768g = i10;
        this.f27769h = f10;
        this.i = z3;
    }

    @Override // w6.b
    public final q6.c a(o6.j jVar, o6.a aVar, x6.b bVar) {
        return new r(jVar, bVar, this);
    }
}
