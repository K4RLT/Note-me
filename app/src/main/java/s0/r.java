package s0;
import n.j0;

import com.google.android.gms.internal.ads.hb;
import r0.e2;
import r0.q1;
import r0.w1;

/* loaded from: classes.dex */
public final class r extends i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final r f24894d;
    public static final r e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f24895f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f24896g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24897c;

    static {
        int i = 1;
        f24894d = new r(i, 2, 0);
        int i10 = 1;
        e = new r(i10, i10, 1);
        f24895f = new r(i, 2, 2);
        int i11 = 1;
        f24896g = new r(i11, i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i10, int i11) {
        super(i, i10);
        this.f24897c = i11;
    }

    @Override // s0.i0
    public final void a(androidx.datastore.preferences.protobuf.i iVar, r0.c cVar, e2 e2Var, hb hbVar, j0 j0Var) {
        switch (this.f24897c) {
            case 0:
                Object invoke = ((df.a) iVar.d(0)).invoke();
                r0.a aVar = (r0.a) iVar.d(1);
                int c10 = iVar.c(0);
                aVar.getClass();
                e2Var.T(e2Var.c(aVar), invoke);
                cVar.n(c10, invoke);
                cVar.e(invoke);
                return;
            case 1:
                r0.a aVar2 = (r0.a) iVar.d(0);
                int c11 = iVar.c(0);
                cVar.l();
                aVar2.getClass();
                cVar.d(c11, e2Var.C(e2Var.c(aVar2)));
                return;
            case 2:
                Object d2 = iVar.d(0);
                r0.a aVar3 = (r0.a) iVar.d(1);
                int c12 = iVar.c(0);
                if (d2 instanceof w1) {
                    w1 w1Var = (w1) d2;
                    ((t0.e) hbVar.f6653y).b(w1Var);
                    ((j0) hbVar.f6652x).a(w1Var);
                }
                Object J = e2Var.J(e2Var.c(aVar3), d2, c12);
                if (J instanceof w1) {
                    hbVar.e((w1) J);
                    return;
                } else {
                    if (J instanceof q1) {
                        ((q1) J).c();
                        return;
                    }
                    return;
                }
            default:
                Object d10 = iVar.d(0);
                int c13 = iVar.c(0);
                if (d10 instanceof w1) {
                    w1 w1Var2 = (w1) d10;
                    ((t0.e) hbVar.f6653y).b(w1Var2);
                    ((j0) hbVar.f6652x).a(w1Var2);
                }
                Object J2 = e2Var.J(e2Var.f24234t, d10, c13);
                if (J2 instanceof w1) {
                    hbVar.e((w1) J2);
                    return;
                } else {
                    if (J2 instanceof q1) {
                        ((q1) J2).c();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // s0.i0
    public r0.a b(androidx.datastore.preferences.protobuf.i iVar) {
        switch (this.f24897c) {
            case 0:
                return (r0.a) iVar.d(1);
            case 1:
                return (r0.a) iVar.d(0);
            default:
                return super.b(iVar);
        }
    }
}
