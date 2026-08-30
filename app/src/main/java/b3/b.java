package b3;
import c.b;

import android.view.View;
import android.view.ViewGroup;
import c3.t;
import com.google.android.gms.internal.ads.zb1;
import java.util.List;
import q3.a0;
import q3.q0;
import ya.td;
import z1.h1;

/* loaded from: classes.dex */
public final class b extends zb1 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1641w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1642x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ViewGroup viewGroup, int i) {
        super(1);
        this.f1641w = i;
        this.f1642x = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final q0 d(q0 q0Var, List list) {
        switch (this.f1641w) {
            case 0:
                return ((s) this.f1642x).g(q0Var);
            default:
                t tVar = (t) this.f1642x;
                if (!tVar.F) {
                    View childAt = tVar.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, tVar.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, tVar.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        return q0Var.f23423a.n(max, max2, max3, max4);
                    }
                    return q0Var;
                }
                return q0Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final j6.l e(a0 a0Var, j6.l lVar) {
        switch (this.f1641w) {
            case 0:
                b2.s sVar = (b2.s) ((s) this.f1642x).S.Z.f1458x;
                if (sVar.f1589k0.H) {
                    long b10 = td.b(sVar.W(0L));
                    int i = (int) (b10 >> 32);
                    int i10 = 0;
                    if (i < 0) {
                        i = 0;
                    }
                    int i11 = (int) (b10 & 4294967295L);
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    long k3 = h1.i(sVar).k();
                    int i12 = (int) (k3 >> 32);
                    int i13 = (int) (k3 & 4294967295L);
                    long j10 = sVar.f31771w;
                    long b11 = td.b(sVar.W((Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L)));
                    int i14 = i12 - ((int) (b11 >> 32));
                    if (i14 < 0) {
                        i14 = 0;
                    }
                    int i15 = i13 - ((int) (4294967295L & b11));
                    if (i15 >= 0) {
                        i10 = i15;
                    }
                    if (i != 0 || i11 != 0 || i14 != 0 || i10 != 0) {
                        return new j6.l(k.f((j3.c) lVar.f18933v, i, i11, i14, i10), 18, k.f((j3.c) lVar.f18934w, i, i11, i14, i10));
                    }
                    return lVar;
                }
                return lVar;
            default:
                t tVar = (t) this.f1642x;
                if (!tVar.F) {
                    View childAt = tVar.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, tVar.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, tVar.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        j3.c b12 = j3.c.b(max, max2, max3, max4);
                        int i16 = b12.f18874a;
                        j3.c cVar = (j3.c) lVar.f18933v;
                        int i17 = b12.f18875b;
                        int i18 = b12.f18876c;
                        int i19 = b12.f18877d;
                        return new j6.l(q0.a(cVar, i16, i17, i18, i19), 18, q0.a((j3.c) lVar.f18934w, i16, i17, i18, i19));
                    }
                    return lVar;
                }
                return lVar;
        }
    }
}
