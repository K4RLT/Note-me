package s0;
import s.c;

import com.google.android.gms.internal.ads.hb;
import r0.e2;
import r0.q1;
import r0.w1;

/* loaded from: classes.dex */
public final class d0 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f24869c = new i0(1, 0, 2);

    @Override // s0.i0
    public final void a(androidx.datastore.preferences.protobuf.i iVar, r0.c cVar, e2 e2Var, hb hbVar, j0 j0Var) {
        int c10 = iVar.c(0);
        int i = e2Var.f24236v;
        int M = e2Var.M(e2Var.r(i), e2Var.f24218b);
        int g8 = e2Var.g(e2Var.r(i + 1), e2Var.f24218b);
        for (int max = Math.max(M, g8 - c10); max < g8; max++) {
            Object obj = e2Var.f24219c[e2Var.h(max)];
            if (obj instanceof w1) {
                hbVar.e((w1) obj);
            } else if (obj instanceof q1) {
                ((q1) obj).c();
            }
        }
        if (c10 <= 0) {
            r0.c("Check failed");
        }
        int i10 = e2Var.f24236v;
        int M2 = e2Var.M(e2Var.r(i10), e2Var.f24218b);
        int g10 = e2Var.g(e2Var.r(i10 + 1), e2Var.f24218b) - c10;
        if (g10 < M2) {
            r0.c("Check failed");
        }
        e2Var.I(g10, c10, i10);
        int i11 = e2Var.i;
        if (i11 >= M2) {
            e2Var.i = i11 - c10;
        }
    }
}
