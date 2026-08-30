package g0;
import c2.r1;
import i1.i;
import i1.j;
import l.a;
import m2.g;
import m2.p0;
import q.x;
import r0.i1;
import r0.q1;

import c2.n2;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17129u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e1 f17130v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(e1 e1Var, int i) {
        super(1);
        this.f17129u = i;
        this.f17130v = e1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        df.l lVar;
        pe.z zVar;
        n2 n2Var;
        String str;
        switch (this.f17129u) {
            case 0:
                x xVar = (x) obj;
                g2 d2 = this.f17130v.d();
                if (d2 != null) {
                    d2.f17115c = xVar;
                }
                return pe.z.f22715a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f17130v.f17076q.setValue(bool);
                return pe.z.f22715a;
            case 2:
                int i = ((r2.i) obj).f24490a;
                b1 b1Var = this.f17130v.f17077r;
                b1Var.getClass();
                if (i == 7) {
                    lVar = b1Var.a().f17033a;
                } else {
                    if (i == 2) {
                        b1Var.a();
                    } else if (i == 6) {
                        b1Var.a();
                    } else if (i == 5) {
                        b1Var.a();
                    } else if (i == 3) {
                        b1Var.a();
                    } else if (i == 4) {
                        b1Var.a();
                    } else if (i != 1 && i != 0) {
                        x.o("invalid ImeAction");
                        return null;
                    }
                    lVar = null;
                }
                pe.z zVar2 = pe.z.f22715a;
                if (lVar != null) {
                    lVar.invoke(b1Var);
                    zVar = zVar2;
                } else {
                    zVar = null;
                }
                if (zVar == null) {
                    if (i == 6) {
                        i iVar = b1Var.f17024c;
                        if (iVar != null) {
                            ((j) iVar).g(1);
                            return zVar2;
                        }
                        kotlin.jvm.internal.l.h("focusManager");
                        throw null;
                    }
                    if (i == 5) {
                        i iVar2 = b1Var.f17024c;
                        if (iVar2 != null) {
                            ((j) iVar2).g(2);
                            return zVar2;
                        }
                        kotlin.jvm.internal.l.h("focusManager");
                        throw null;
                    }
                    if (i == 7 && (n2Var = b1Var.f17022a) != null) {
                        ((r1) n2Var).a();
                        return zVar2;
                    }
                    return zVar2;
                }
                return zVar2;
            default:
                r2.x xVar2 = (r2.x) obj;
                String str2 = xVar2.f24515a.f20477v;
                e1 e1Var = this.f17130v;
                i1 i1Var = e1Var.f17079t;
                g gVar = e1Var.f17069j;
                if (gVar != null) {
                    str = gVar.f20477v;
                } else {
                    str = null;
                }
                if (!kotlin.jvm.internal.a(str2, str)) {
                    e1Var.f17070k.setValue(s0.f17275u);
                    if (((Boolean) i1Var.getValue()).booleanValue()) {
                        i1Var.setValue(Boolean.FALSE);
                    } else {
                        e1Var.f17078s.setValue(Boolean.FALSE);
                    }
                }
                long j10 = p0.f20544b;
                e1Var.f(j10);
                e1Var.e(j10);
                e1Var.f17080u.invoke(xVar2);
                q1 q1Var = e1Var.f17063b;
                x xVar3 = q1Var.f24329a;
                if (xVar3 != null) {
                    xVar3.r(q1Var, null);
                }
                return pe.z.f22715a;
        }
    }
}
