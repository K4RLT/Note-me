package y6;
import l.c;
import n.b;
import p.b;

import java.util.ArrayList;
import ya.fe;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final j6.e f30914a = j6.e.j("k", "x", "y");

    public static q1.f a(z6.b bVar, o6.a aVar) {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (bVar.H() == 1) {
            bVar.f();
            while (bVar.p()) {
                if (bVar.H() == 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z6.b bVar2 = bVar;
                o6.a aVar2 = aVar;
                arrayList.add(new r6.j(aVar2, o.b(bVar2, aVar2, a7.c(), f.f30930y, z3, false)));
                bVar = bVar2;
                aVar = aVar2;
            }
            bVar.k();
            b(arrayList);
        } else {
            arrayList.add(new b7.a(b(bVar, a7.c())));
        }
        return new q1.f(arrayList);
    }

    public static v6.e b(z6.b bVar, o6.a aVar) {
        bVar.j();
        q1.f fVar = null;
        v6.b bVar2 = null;
        boolean z3 = false;
        v6.b bVar3 = null;
        while (bVar.H() != 4) {
            int L = bVar.L(f30914a);
            if (L != 0) {
                if (L != 1) {
                    if (L != 2) {
                        bVar.M();
                        bVar.N();
                    } else if (bVar.H() == 6) {
                        bVar.N();
                        z3 = true;
                    } else {
                        bVar2 = fe.b(bVar, aVar, true);
                    }
                } else if (bVar.H() == 6) {
                    bVar.N();
                    z3 = true;
                } else {
                    bVar3 = fe.b(bVar, aVar, true);
                }
            } else {
                fVar = a(bVar, aVar);
            }
        }
        bVar.m();
        if (z3) {
            aVar.a("Lottie doesn't support expressions.");
        }
        if (fVar != null) {
            return fVar;
        }
        return new v6.c(bVar3, bVar2);
    }
}
