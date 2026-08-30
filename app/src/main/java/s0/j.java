package s0;
import s.c;

import com.google.android.gms.internal.ads.hb;
import r0.e2;
import ya.rb;

/* loaded from: classes.dex */
public final class j extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f24881c = new i0(0, 2, 1);

    @Override // s0.i0
    public final void a(androidx.datastore.preferences.protobuf.i iVar, r0.c cVar, e2 e2Var, hb hbVar, j0 j0Var) {
        int i;
        int i10;
        z0.d dVar = (z0.d) iVar.d(0);
        int c10 = e2Var.c((r0.a) iVar.d(1));
        if (e2Var.f24234t >= c10) {
            r0.c("Check failed");
        }
        rb.a(e2Var, cVar, c10);
        int i11 = e2Var.f24234t;
        int i12 = e2Var.f24236v;
        while (i12 >= 0 && !e2Var.x(i12)) {
            i12 = e2Var.D(i12, e2Var.f24218b);
        }
        int i13 = i12 + 1;
        int i14 = 0;
        while (i13 < i11) {
            if (e2Var.u(i11, i13)) {
                if (e2Var.x(i13)) {
                    i14 = 0;
                }
                i13++;
            } else {
                if (e2Var.x(i13)) {
                    i10 = 1;
                } else {
                    i10 = e2Var.f24218b[(e2Var.r(i13) * 5) + 1] & 67108863;
                }
                i14 += i10;
                i13 += e2Var.t(i13);
            }
        }
        while (true) {
            i = e2Var.f24234t;
            if (i >= c10) {
                break;
            }
            if (e2Var.u(c10, i)) {
                int i15 = e2Var.f24234t;
                if (i15 < e2Var.f24235u && (e2Var.f24218b[(e2Var.r(i15) * 5) + 1] & 1073741824) != 0) {
                    cVar.e(e2Var.C(e2Var.f24234t));
                    i14 = 0;
                }
                e2Var.O();
            } else {
                i14 += e2Var.K();
            }
        }
        if (i != c10) {
            r0.c("Check failed");
        }
        dVar.f31760a = i14;
    }
}
