package wa;
import b2.k1;
import i2.g;
import i2.h;
import j2.h;
import j2.i;
import j2.j;
import j2.n;
import j2.q;
import j2.s;
import n.i0;
import t0.e;
import y2.k;
import z1.h1;

import com.google.android.gms.internal.ads.wd0;
import java.util.List;
import ya.ud;

/* loaded from: classes.dex */
public abstract class c8 {
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.internal.m, df.a] */
    public static final void a(n nVar, int i, g gVar) {
        n nVar2;
        e eVar = new e(new n[16]);
        List i10 = nVar.i(false, false);
        while (true) {
            eVar.c(eVar.f25619w, i10);
            while (true) {
                int i11 = eVar.f25619w;
                if (i11 != 0) {
                    nVar2 = (n) eVar.n(i11 - 1);
                    boolean e = q.e(nVar2);
                    j jVar = nVar2.f18823d;
                    i0 i0Var = jVar.f18813u;
                    if (!e && !i0Var.c(s.i)) {
                        k1 d2 = nVar2.d();
                        if (d2 != null) {
                            k a10 = ud.a(h1.g(d2));
                            if (a10.f30809a < a10.f30811c && a10.f30810b < a10.f30812d) {
                                Object g8 = jVar.f18813u.g(i.e);
                                Object obj = null;
                                if (g8 == null) {
                                    g8 = null;
                                }
                                df.p pVar = (df.p) g8;
                                Object g10 = i0Var.g(s.f18857u);
                                if (g10 != null) {
                                    obj = g10;
                                }
                                h hVar = (h) obj;
                                if (pVar != null && hVar != null && ((Number) hVar.f18788b.invoke()).floatValue() > 0.0f) {
                                    int i12 = i + 1;
                                    gVar.invoke(new h(nVar2, i12, a10, d2));
                                    a(nVar2, i12, gVar);
                                }
                            }
                        } else {
                            throw wd0.m("Expected semantics node to have a coordinator.");
                        }
                    }
                } else {
                    return;
                }
            }
            i10 = nVar2.i(false, false);
        }
    }
}
