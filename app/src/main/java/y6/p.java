package y6;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final j6.e f30954a = j6.e.j("k");

    public static ArrayList a(z6.a aVar, o6.a aVar2, float f10, d0 d0Var, boolean z3) {
        z6.a aVar3;
        o6.a aVar4;
        float f11;
        d0 d0Var2;
        boolean z9;
        ArrayList arrayList = new ArrayList();
        if (aVar.H() == 6) {
            aVar2.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.j();
        while (aVar.p()) {
            if (aVar.L(f30954a) != 0) {
                aVar.N();
            } else if (aVar.H() == 1) {
                aVar.f();
                if (aVar.H() == 7) {
                    z6.a aVar5 = aVar;
                    o6.a aVar6 = aVar2;
                    float f12 = f10;
                    d0 d0Var3 = d0Var;
                    boolean z10 = z3;
                    b7.a b10 = o.b(aVar5, aVar6, f12, d0Var3, false, z10);
                    aVar3 = aVar5;
                    aVar4 = aVar6;
                    f11 = f12;
                    d0Var2 = d0Var3;
                    z9 = z10;
                    arrayList.add(b10);
                } else {
                    aVar3 = aVar;
                    aVar4 = aVar2;
                    f11 = f10;
                    d0Var2 = d0Var;
                    z9 = z3;
                    while (aVar3.p()) {
                        arrayList.add(o.b(aVar3, aVar4, f11, d0Var2, true, z9));
                    }
                }
                aVar3.k();
                aVar = aVar3;
                aVar2 = aVar4;
                f10 = f11;
                d0Var = d0Var2;
                z3 = z9;
            } else {
                z6.a aVar7 = aVar;
                arrayList.add(o.b(aVar7, aVar2, f10, d0Var, false, z3));
                aVar = aVar7;
            }
        }
        aVar.m();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            i = size - 1;
            if (i10 >= i) {
                break;
            }
            b7.a aVar = (b7.a) arrayList.get(i10);
            i10++;
            b7.a aVar2 = (b7.a) arrayList.get(i10);
            aVar.f1799h = Float.valueOf(aVar2.f1798g);
            if (aVar.f1795c == null && (obj = aVar2.f1794b) != null) {
                aVar.f1795c = obj;
                if (aVar instanceof r6.j) {
                    ((r6.j) aVar).d();
                }
            }
        }
        b7.a aVar3 = (b7.a) arrayList.get(i);
        if ((aVar3.f1794b == null || aVar3.f1795c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
