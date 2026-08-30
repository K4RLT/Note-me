package u7;
import b1.v;
import b1.y;
import o7.b;
import q.d;
import q.e;
import r0.a1;
import r0.f1;

import b8.fa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ya.he;

/* loaded from: classes.dex */
public final class y4 extends ve.i implements df.p {
    public final /* synthetic */ y A;
    public final /* synthetic */ y B;
    public final /* synthetic */ f1 C;
    public final /* synthetic */ y D;
    public final /* synthetic */ y E;
    public final /* synthetic */ pf.z F;
    public final /* synthetic */ a1 G;
    public final /* synthetic */ d H;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f27063u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f27064v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f27065w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o1 f27066x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f27067y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v f27068z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(List list, m3 m3Var, o1 o1Var, d dVar, v vVar, y yVar, y yVar2, f1 f1Var, y yVar3, y yVar4, pf.z zVar, a1 a1Var, d dVar2, te.c cVar) {
        super(2, cVar);
        this.f27064v = list;
        this.f27065w = m3Var;
        this.f27066x = o1Var;
        this.f27067y = dVar;
        this.f27068z = vVar;
        this.A = yVar;
        this.B = yVar2;
        this.C = f1Var;
        this.D = yVar3;
        this.E = yVar4;
        this.F = zVar;
        this.G = a1Var;
        this.H = dVar2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        y4 y4Var = new y4(this.f27064v, this.f27065w, this.f27066x, this.f27067y, this.f27068z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, cVar);
        y4Var.f27063u = obj;
        return y4Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        y4 y4Var = (y4) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        y4Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        char c10;
        y yVar;
        y yVar2;
        a1 a1Var;
        boolean z3;
        pf.z zVar = (pf.z) this.f27063u;
        pe.a.e(obj);
        char c11 = 3;
        boolean z9 = false;
        if (!this.f27064v.isEmpty()) {
            int size = this.f27064v.size() - 1;
            f1 f1Var = this.C;
            float f10 = k6.f26414a;
            if (f1Var.h() > size) {
                this.C.i(size);
                this.f27065w.S0(size);
            }
            List list = this.f27064v;
            v vVar = this.f27068z;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!vVar.contains(((b) it.next()).f21848a)) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            float a10 = this.f27066x.a(((Number) this.f27067y.e()).floatValue());
            if (!z3 && Math.abs(((Number) this.f27067y.e()).floatValue() - a10) > 0.001f) {
                pf.b0.x(zVar, null, new fa(a10, 2, this.f27067y, null), 3);
            }
            float size2 = this.f27066x.i().f26212a.size() - 1;
            if (((Number) this.f27066x.f26661q.e()).floatValue() > size2) {
                pf.b0.x(zVar, null, new l1(this.f27066x, size2, null, 1), 3);
            }
        }
        List list2 = this.f27064v;
        v vVar2 = this.f27068z;
        y yVar3 = this.D;
        y yVar4 = this.E;
        pf.z zVar2 = this.F;
        a1 a1Var2 = this.G;
        d dVar = this.f27067y;
        d dVar2 = this.H;
        o1 o1Var = this.f27066x;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str = ((b) it2.next()).f21848a;
            if (!vVar2.contains(str)) {
                float f11 = k6.f26414a;
                if (!((Boolean) a1Var2.getValue()).booleanValue()) {
                    vVar2.add(str);
                    boolean z10 = he.f31326b;
                    he.f31326b = z9;
                    d a11 = e.a(1.0f);
                    d a12 = e.a(0.0f);
                    yVar3.put(str, a11);
                    yVar4.put(str, a12);
                    yVar = yVar3;
                    yVar2 = yVar4;
                    a1Var = a1Var2;
                    x4 x4Var = new x4(dVar, dVar2, z10, o1Var, list2, a11, str, yVar, yVar2, a12, null);
                    c10 = 3;
                    pf.b0.x(zVar2, null, x4Var, 3);
                } else {
                    c10 = c11;
                    yVar = yVar3;
                    yVar2 = yVar4;
                    a1Var = a1Var2;
                    vVar2.add(str);
                }
            } else {
                c10 = c11;
                yVar = yVar3;
                yVar2 = yVar4;
                a1Var = a1Var2;
            }
            a1Var2 = a1Var;
            c11 = c10;
            yVar3 = yVar;
            yVar4 = yVar2;
            z9 = false;
        }
        if (!this.f27064v.isEmpty()) {
            a1 a1Var3 = this.G;
            float f12 = k6.f26414a;
            a1Var3.setValue(Boolean.FALSE);
        }
        List list3 = this.f27064v;
        ArrayList arrayList = new ArrayList(qe.m.d(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList.add(((b) it3.next()).f21848a);
        }
        Set U = qe.l.U(arrayList);
        this.f27068z.retainAll(U);
        this.A.f1409w.retainAll(U);
        this.B.f1409w.retainAll(U);
        return pe.z.f22715a;
    }
}
