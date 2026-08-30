package s0;
import n.j0;
import s.c;

import com.google.android.gms.internal.ads.hb;
import r0.e2;
import r0.w1;

/* loaded from: classes.dex */
public final class e extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f24870c = new i0(0, 2, 1);

    @Override // s0.i0
    public final void a(androidx.datastore.preferences.protobuf.i iVar, r0.c cVar, e2 e2Var, hb hbVar, j0 j0Var) {
        r0.a aVar = (r0.a) iVar.d(0);
        Object d2 = iVar.d(1);
        if (d2 instanceof w1) {
            w1 w1Var = (w1) d2;
            ((t0.e) hbVar.f6653y).b(w1Var);
            ((j0) hbVar.f6652x).a(w1Var);
        }
        if (e2Var.f24228n != 0) {
            r0.c("Can only append a slot if not current inserting");
        }
        int i = e2Var.i;
        int i10 = e2Var.f24224j;
        int c10 = e2Var.c(aVar);
        int g8 = e2Var.g(e2Var.r(c10 + 1), e2Var.f24218b);
        e2Var.i = g8;
        e2Var.f24224j = g8;
        e2Var.w(1, c10);
        if (i >= g8) {
            i++;
            i10++;
        }
        e2Var.f24219c[g8] = d2;
        e2Var.i = i;
        e2Var.f24224j = i10;
    }
}
