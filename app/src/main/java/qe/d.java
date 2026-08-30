package qe;
import q.x;

import java.util.List;
import java.util.RandomAccess;
import w7.i1;
import ya.pa;

/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    public final e f24013u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24014v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24015w;

    public d(e eVar, int i, int i10) {
        this.f24013u = eVar;
        this.f24014v = i;
        pa.a(i, i10, eVar.a());
        this.f24015w = i10 - i;
    }

    @Override // qe.a
    public final int a() {
        return this.f24015w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i10 = this.f24015w;
        if (i >= 0 && i < i10) {
            return this.f24013u.get(this.f24014v + i);
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    @Override // qe.e, java.util.List
    public final List subList(int i, int i10) {
        pa.a(i, i10, this.f24015w);
        int i11 = this.f24014v;
        return new d(this.f24013u, i + i11, i11 + i10);
    }
}
