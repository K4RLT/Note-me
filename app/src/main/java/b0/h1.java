package b0;
import d1.q;
import i1.s;
import m.i;

import b2.i2;
import b2.j2;
import java.util.List;

/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1194u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f1195v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(kotlin.jvm.internal.y yVar, int i) {
        super(1);
        this.f1194u = i;
        this.f1195v = yVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        switch (this.f1194u) {
            case 0:
                j2 j2Var = (j2) obj;
                j2Var.getClass();
                n0 n0Var = ((m1) j2Var).I;
                kotlin.jvm.internal.y yVar = this.f1195v;
                List list = (List) yVar.f19787u;
                if (list != null) {
                    list.add(n0Var);
                } else {
                    list = qe.i(n0Var);
                }
                yVar.f19787u = list;
                return i2.f1502v;
            case 1:
                this.f1195v.f19787u = (s) obj;
                return Boolean.TRUE;
            case 2:
                b2.j jVar = (j2) obj;
                if (((q) jVar).f15688u.H) {
                    this.f1195v.f19787u = jVar;
                    z3 = false;
                } else {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            default:
                v1.g gVar = (v1.g) obj;
                kotlin.jvm.internal.y yVar2 = this.f1195v;
                Object obj2 = yVar2.f19787u;
                if (obj2 == null && gVar.K) {
                    yVar2.f19787u = gVar;
                } else if (obj2 != null) {
                    gVar.getClass();
                }
                return Boolean.TRUE;
        }
    }
}
