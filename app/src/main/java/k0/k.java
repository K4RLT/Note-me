package k0;
import d1.e;
import j.c;

import ya.td;

/* loaded from: classes.dex */
public final class k implements c3.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f19340a;

    /* renamed from: b, reason: collision with root package name */
    public final o f19341b;

    /* renamed from: c, reason: collision with root package name */
    public long f19342c = 0;

    public k(e eVar, o oVar) {
        this.f19340a = eVar;
        this.f19341b = oVar;
    }

    @Override // c3.a0
    public final long a(y2.k kVar, long j10, y2.m mVar, long j11) {
        long a10 = this.f19341b.a();
        if ((9223372034707292159L & a10) == 9205357640488583168L) {
            a10 = this.f19342c;
        }
        this.f19342c = a10;
        return y2.c(y2.c(kVar.c(), td.b(a10)), this.f19340a.a(j11, 0L, mVar));
    }
}
