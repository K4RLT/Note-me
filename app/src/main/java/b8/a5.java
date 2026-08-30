package b8;
import f7.c;
import ia.b;
import ia.c;
import l4.a;
import r0.a1;
import u7.u0;
import z5.e;

import com.google.android.gms.internal.ads.gl;

/* loaded from: classes.dex */
public final /* synthetic */ class a5 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1836u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f1837v;

    public /* synthetic */ a5(a1 a1Var, int i) {
        this.f1836u = i;
        this.f1837v = a1Var;
    }

    @Override // df.a
    public final Object invoke() {
        int i = this.f1836u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f1837v;
        switch (i) {
            case 0:
                a1Var.setValue(Boolean.TRUE);
                return zVar;
            case 1:
                a1Var.setValue(2);
                return zVar;
            case 2:
                a1Var.setValue(2);
                c.s("arrival_opened");
                b();
                z5 z5Var = z5.f3075a;
                e();
                return zVar;
            case 3:
                int i10 = x9.f2990a[((la) a1Var.getValue()).ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                a1Var.setValue(la.PICK_NOTEBOOK);
                            } else {
                                a.o();
                                return null;
                            }
                        } else {
                            a1Var.setValue(la.EXPLORE);
                        }
                    } else {
                        a1Var.setValue(la.EXPLORE);
                    }
                } else {
                    z5 z5Var2 = z5.f3075a;
                    sf.n0 n0Var = z5.f3081h;
                    Boolean bool = Boolean.FALSE;
                    n0Var.getClass();
                    n0Var.k(null, bool);
                }
                return zVar;
            case 4:
                a1Var.setValue(null);
                return zVar;
            case 5:
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 6:
                a1Var.setValue(la.EXPLORE);
                return zVar;
            case 7:
                a1Var.setValue(la.EXPLORE);
                return zVar;
            case 8:
                a1Var.setValue(la.PICK_NOTEBOOK);
                return zVar;
            case 9:
                a1Var.setValue("money");
                return zVar;
            case 10:
                a1Var.setValue(Boolean.FALSE);
                c(false);
                return zVar;
            case 11:
                a1Var.setValue(Boolean.FALSE);
                c.s("bubble_opened");
                b();
                z5 z5Var3 = z5.f3075a;
                e();
                return zVar;
            case 12:
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 13:
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 14:
                a1Var.setValue(Boolean.valueOf(!((Boolean) a1Var.getValue()).booleanValue()));
                return zVar;
            case 15:
                u0.j(a1Var);
                return zVar;
            case 16:
                a1Var.setValue(Boolean.valueOf(!((Boolean) a1Var.getValue()).booleanValue()));
                return zVar;
            case 17:
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 18:
                a1Var.setValue(Boolean.TRUE);
                return zVar;
            case 19:
                a1Var.setValue(Boolean.valueOf(!((Boolean) a1Var.getValue()).booleanValue()));
                return zVar;
            case 20:
                a1Var.setValue(Boolean.TRUE);
                return zVar;
            case gl.zzm /* 21 */:
                a1Var.setValue(Boolean.TRUE);
                return zVar;
            case 22:
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 23:
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 24:
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 25:
                a1Var.setValue(Boolean.TRUE);
                return zVar;
            case 26:
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 27:
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 28:
                a1Var.setValue(Boolean.valueOf(!((Boolean) a1Var.getValue()).booleanValue()));
                return zVar;
            default:
                a1Var.setValue(Boolean.FALSE);
                return zVar;
        }
    }
}
