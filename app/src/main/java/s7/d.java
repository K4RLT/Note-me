package s7;

import com.daren.scraply.R;
import d1.o;
import df.p;
import pe.z;
import r0.m;
import r0.r;
import r0.y;
import w7.m7;
import w7.n4;
import wa.ca;
import wa.n7;
import wa.r9;
import ya.yb;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24999u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f25000v;

    public /* synthetic */ d(int i, int i10, boolean z3) {
        this.f24999u = i10;
        this.f25000v = z3;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        q1.e a10;
        q1.e a11;
        int i = this.f24999u;
        o oVar = o.f15687a;
        boolean z3 = false;
        z zVar = z.f22715a;
        boolean z9 = this.f25000v;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                yb.c(z9, (m) obj, y.L(1));
                return zVar;
            case 1:
                m mVar = (m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    if (z9) {
                        a10 = r9.a();
                    } else {
                        a10 = ca.a();
                    }
                    o0.y.b(a10, n7.b(R.string.gallery_sync_state, rVar), androidx.compose.foundation.layout.d.k(oVar, 14), k1.r.c(k1.r.f19515d, 0.7f), rVar, 3456, 0);
                } else {
                    rVar.U();
                }
                return zVar;
            case 2:
                m mVar2 = (m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.R(intValue2 & 1, z3)) {
                    if (z9) {
                        a11 = r9.a();
                    } else {
                        a11 = ca.a();
                    }
                    o0.y.b(a11, n7.b(R.string.gallery_sync_state, rVar2), androidx.compose.foundation.layout.d.k(oVar, 16), k1.r.c(k1.r.f19515d, 0.7f), rVar2, 3456, 0);
                } else {
                    rVar2.U();
                }
                return zVar;
            case 3:
                ((Integer) obj2).getClass();
                m7.b(z9, (m) obj, y.L(1));
                return zVar;
            case 4:
                ((Integer) obj2).getClass();
                m7.c(z9, (m) obj, y.L(1));
                return zVar;
            case 5:
                ((Integer) obj2).getClass();
                m7.p(z9, (m) obj, y.L(1));
                return zVar;
            default:
                ((Integer) obj2).getClass();
                n4.o0(z9, (m) obj, y.L(7));
                return zVar;
        }
    }

    public /* synthetic */ d(int i, boolean z3) {
        this.f24999u = i;
        this.f25000v = z3;
    }
}
