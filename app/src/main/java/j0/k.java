package j0;

import g0.p1;
import k0.a1;
import k0.b1;
import k0.s;
import k0.t;
import k0.y;
import z1.x;

/* loaded from: classes.dex */
public final class k implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public long f18739a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f18740b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f18741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f18742d;
    public final /* synthetic */ long e;

    public k(i iVar, a1 a1Var, long j10) {
        this.f18741c = iVar;
        this.f18742d = a1Var;
        this.e = j10;
    }

    @Override // g0.p1
    public final void a(long j10) {
        x xVar = (x) this.f18741c.invoke();
        a1 a1Var = this.f18742d;
        if (xVar != null) {
            if (xVar.i()) {
                s sVar = t.e;
                e1.m mVar = a1Var.f19221f;
                if (mVar != null) {
                    mVar.d(Boolean.TRUE, xVar, new j1.b(j10), sVar);
                }
                this.f18739a = j10;
            } else {
                return;
            }
        }
        if (!b1.a(a1Var, this.e)) {
            return;
        }
        this.f18740b = 0L;
    }

    @Override // g0.p1
    public final void d(long j10) {
        x xVar = (x) this.f18741c.invoke();
        if (xVar != null && xVar.i()) {
            a1 a1Var = this.f18742d;
            if (b1.a(a1Var, this.e)) {
                long h3 = j1.b.h(this.f18740b, j10);
                this.f18740b = h3;
                long h10 = j1.b.h(this.f18739a, h3);
                if (a1Var.b(xVar, h10, this.f18739a, t.e, true)) {
                    this.f18739a = h10;
                    this.f18740b = 0L;
                }
            }
        }
    }

    @Override // g0.p1
    public final void onCancel() {
        y yVar;
        long j10 = this.e;
        a1 a1Var = this.f18742d;
        if (b1.a(a1Var, j10) && (yVar = a1Var.f19223h) != null) {
            yVar.invoke();
        }
    }

    @Override // g0.p1
    public final void onStop() {
        y yVar;
        long j10 = this.e;
        a1 a1Var = this.f18742d;
        if (b1.a(a1Var, j10) && (yVar = a1Var.f19223h) != null) {
            yVar.invoke();
        }
    }

    @Override // g0.p1
    public final void b() {
    }

    @Override // g0.p1
    public final void c() {
    }
}
