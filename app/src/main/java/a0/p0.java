package a0;

import b0.v0;
import b0.y0;
import com.google.android.gms.internal.ads.x90;
import r.u0;
import t.z0;

/* loaded from: classes.dex */
public final class p0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f115a;

    public p0(l0 l0Var) {
        this.f115a = l0Var;
    }

    @Override // b0.v0
    public final int a() {
        long e;
        l0 l0Var = this.f115a;
        if (l0Var.g().f174p == z0.f25597u) {
            e = l0Var.g().e() & 4294967295L;
        } else {
            e = l0Var.g().e() >> 32;
        }
        return (int) e;
    }

    @Override // b0.v0
    public final float b() {
        l0 l0Var = this.f115a;
        return (l0Var.f89d.f28b.h() * 500) + l0Var.f89d.f29c.h();
    }

    @Override // b0.v0
    public final int c() {
        l0 l0Var = this.f115a;
        return (-l0Var.g().f171m) + l0Var.g().f175q;
    }

    @Override // b0.v0
    public final float d() {
        l0 l0Var = this.f115a;
        int h3 = l0Var.f89d.f28b.h();
        int h10 = l0Var.f89d.f29c.h();
        if (l0Var.c()) {
            return (h3 * 500) + h10 + 100;
        }
        return (h3 * 500) + h10;
    }

    @Override // b0.v0
    public final j2.b e() {
        return new j2.b(-1, -1);
    }

    @Override // b0.v0
    public final Object f(int i, y0 y0Var) {
        x90 x90Var = l0.f85w;
        l0 l0Var = this.f115a;
        l0Var.getClass();
        Object e = l0Var.e(u0.f24148u, new j0(l0Var, i, null, 0), y0Var);
        pe.z zVar = pe.z.f22715a;
        ue.a aVar = ue.a.f27192u;
        if (e != aVar) {
            e = zVar;
        }
        if (e == aVar) {
            return e;
        }
        return zVar;
    }
}
