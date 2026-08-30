package u0;

import java.util.List;
import qe.e;
import ya.od;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: u, reason: collision with root package name */
    public final v0.b f25800u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25801v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25802w;

    public a(v0.b bVar, int i, int i10) {
        this.f25800u = bVar;
        this.f25801v = i;
        od.c(i, i10, bVar.size());
        this.f25802w = i10 - i;
    }

    @Override // qe.a
    public final int a() {
        return this.f25802w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        od.a(i, this.f25802w);
        return this.f25800u.get(this.f25801v + i);
    }

    @Override // qe.e, java.util.List
    public final List subList(int i, int i10) {
        od.c(i, i10, this.f25802w);
        int i11 = this.f25801v;
        return new a(this.f25800u, i + i11, i11 + i10);
    }
}
