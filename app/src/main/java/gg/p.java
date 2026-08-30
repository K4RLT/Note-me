package gg;

import fg.z;
import java.util.List;
import qe.x;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: j, reason: collision with root package name */
    public final z f17782j;

    /* renamed from: k, reason: collision with root package name */
    public final List f17783k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17784l;

    /* renamed from: m, reason: collision with root package name */
    public int f17785m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(fg.c cVar, z zVar) {
        super(cVar, zVar, (String) null, 12);
        cVar.getClass();
        this.f17782j = zVar;
        List P = qe.l.P(zVar.f17001u.keySet());
        this.f17783k = P;
        this.f17784l = P.size() * 2;
        this.f17785m = -1;
    }

    @Override // gg.n, gg.a
    public final fg.m D(String str) {
        str.getClass();
        if (this.f17785m % 2 == 0) {
            eg.z zVar = fg.n.f16990a;
            return new fg.t(str, true);
        }
        return (fg.m) x.a(str, this.f17782j);
    }

    @Override // gg.n, gg.a
    public final String P(cg.d dVar, int i) {
        dVar.getClass();
        return (String) this.f17783k.get(i / 2);
    }

    @Override // gg.n, gg.a
    public final fg.m R() {
        return this.f17782j;
    }

    @Override // gg.n
    /* renamed from: W */
    public final z R() {
        return this.f17782j;
    }

    @Override // gg.n, gg.a, dg.a
    public final void f(cg.d dVar) {
        dVar.getClass();
    }

    @Override // gg.n, dg.a
    public final int t(cg.d dVar) {
        dVar.getClass();
        int i = this.f17785m;
        if (i < this.f17784l - 1) {
            int i10 = i + 1;
            this.f17785m = i10;
            return i10;
        }
        return -1;
    }
}
