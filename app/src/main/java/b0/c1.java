package b0;
import a0.k0;
import a0.u;
import a1.e;
import a1.l;
import a1.n;
import a1.o;
import a1.p;
import a1.q;
import n.j0;
import n.q0;
import r0.l;
import r0.m;
import r0.r;
import r0.y;
import z0.c;

import java.util.Map;
import r0.o2;

/* loaded from: classes.dex */
public final class c1 implements o, e {

    /* renamed from: u, reason: collision with root package name */
    public final p f1166u;

    /* renamed from: v, reason: collision with root package name */
    public final l f1167v;

    /* renamed from: w, reason: collision with root package name */
    public final j0 f1168w;

    public c1(o oVar, Map map, l lVar) {
        k0 k0Var = new k0(4, oVar);
        o2 o2Var = q.f219a;
        this.f1166u = new p(map, k0Var);
        this.f1167v = lVar;
        int i = q0.f20928a;
        this.f1168w = new j0();
    }

    @Override // e
    public final void a(Object obj, c cVar, m mVar, int i) {
        r rVar = (r) mVar;
        rVar.a0(-697180401);
        this.f1167v.a(obj, cVar, rVar, i & 126);
        boolean h3 = rVar.h(this) | rVar.h(obj);
        Object O = rVar.O();
        if (h3 || O == l.f24285a) {
            O = new u(this, 4, obj);
            rVar.k0(O);
        }
        y.c(obj, (df.l) O, rVar);
        rVar.p(false);
    }

    @Override // o
    public final boolean b(Object obj) {
        return this.f1166u.b(obj);
    }

    @Override // o
    public final Map c() {
        j0 j0Var = this.f1168w;
        Object[] objArr = j0Var.f20899b;
        long[] jArr = j0Var.f20898a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i << 3) + i11];
                            l lVar = this.f1167v;
                            if (lVar.f212v.k(obj) == null) {
                                lVar.f211u.remove(obj);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.f1166u.c();
    }

    @Override // o
    public final n d(String str, df.a aVar) {
        return this.f1166u.d(str, aVar);
    }

    @Override // o
    public final Object e(String str) {
        return this.f1166u.e(str);
    }
}
