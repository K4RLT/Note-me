package s0;
import s.c;

import com.google.android.gms.internal.ads.hb;
import java.util.ArrayList;
import r0.d2;
import r0.e2;

/* loaded from: classes.dex */
public final class u extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f24900c = new i0(1, 0, 2);

    @Override // s0.i0
    public final void a(androidx.datastore.preferences.protobuf.i iVar, r0.c cVar, e2 e2Var, hb hbVar, j0 j0Var) {
        int[] iArr;
        r0.a aVar;
        int c10;
        int i;
        int c11 = iVar.c(0);
        if (e2Var.f24228n != 0) {
            r0.c("Cannot move a group while inserting");
        }
        if (c11 < 0) {
            r0.c("Parameter offset is out of bounds");
        }
        if (c11 != 0) {
            int i10 = e2Var.f24234t;
            int i11 = e2Var.f24236v;
            int i12 = e2Var.f24235u;
            int i13 = i10;
            while (true) {
                iArr = e2Var.f24218b;
                if (c11 <= 0) {
                    break;
                }
                i13 += iArr[(e2Var.r(i13) * 5) + 3];
                if (i13 > i12) {
                    r0.c("Parameter offset is out of bounds");
                }
                c11--;
            }
            int i14 = iArr[(e2Var.r(i13) * 5) + 3];
            int g8 = e2Var.g(e2Var.r(e2Var.f24234t), e2Var.f24218b);
            int g10 = e2Var.g(e2Var.r(i13), e2Var.f24218b);
            int i15 = i13 + i14;
            int g11 = e2Var.g(e2Var.r(i15), e2Var.f24218b);
            int i16 = g11 - g10;
            e2Var.w(i16, Math.max(e2Var.f24234t - 1, 0));
            e2Var.v(i14);
            int[] iArr2 = e2Var.f24218b;
            int r8 = e2Var.r(i15) * 5;
            qe.k.c(e2Var.r(i10) * 5, r8, (i14 * 5) + r8, iArr2, iArr2);
            if (i16 > 0) {
                Object[] objArr = e2Var.f24219c;
                int h3 = e2Var.h(g10 + i16);
                System.arraycopy(objArr, h3, objArr, g8, e2Var.h(g11 + i16) - h3);
            }
            int i17 = g10 + i16;
            int i18 = i17 - g8;
            int i19 = e2Var.f24225k;
            int i20 = e2Var.f24226l;
            int length = e2Var.f24219c.length;
            int i21 = e2Var.f24227m;
            int i22 = i10 + i14;
            int i23 = i10;
            while (i23 < i22) {
                int r10 = e2Var.r(i23);
                int i24 = i18;
                int g12 = e2Var.g(r10, iArr2) - i24;
                if (i21 < r10) {
                    i = 0;
                } else {
                    i = i19;
                }
                int[] iArr3 = iArr2;
                iArr3[(r10 * 5) + 4] = e2.i(e2.i(g12, i, i20, length), e2Var.f24225k, e2Var.f24226l, e2Var.f24219c.length);
                i23++;
                i18 = i24;
                iArr2 = iArr3;
                i19 = i19;
            }
            int i25 = i15 + i14;
            int p10 = e2Var.p();
            int a10 = d2.a(e2Var.f24220d, i15, p10);
            ArrayList arrayList = new ArrayList();
            if (a10 >= 0) {
                while (a10 < e2Var.f24220d.size() && (c10 = e2Var.c((aVar = (r0.a) e2Var.f24220d.get(a10)))) >= i15 && c10 < i25) {
                    arrayList.add(aVar);
                }
            }
            int i26 = i10 - i15;
            int size = arrayList.size();
            for (int i27 = 0; i27 < size; i27++) {
                r0.a aVar2 = (r0.a) arrayList.get(i27);
                int c12 = e2Var.c(aVar2) + i26;
                if (c12 >= e2Var.f24222g) {
                    aVar2.f24176a = -(p10 - c12);
                } else {
                    aVar2.f24176a = c12;
                }
                e2Var.f24220d.add(d2.a(e2Var.f24220d, c12, p10), aVar2);
            }
            if (e2Var.H(i15, i14)) {
                r0.c("Unexpectedly removed anchors");
            }
            e2Var.m(i11, e2Var.f24235u, i10);
            if (i16 > 0) {
                e2Var.I(i17, i16, i15 - 1);
            }
        }
    }
}
