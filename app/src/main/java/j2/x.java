package j2;
import n.j;
import n.w;
import x.b;

import a0.k0;
import b8.n3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator[] f18871a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f18872b;

    static {
        e eVar;
        Comparator[] comparatorArr = new Comparator[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                eVar = e.f18780w;
            } else {
                eVar = e.f18779v;
            }
            comparatorArr[i] = new n3(3, new n3(eVar));
        }
        f18871a = comparatorArr;
        f18872b = r.N;
    }

    public static final void a(n nVar, ArrayList arrayList, k0 k0Var, k0 k0Var2, w wVar) {
        j jVar = nVar.f18823d;
        Object g8 = jVar.f18813u.g(s.f18849m);
        if (g8 == null) {
            g8 = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g8).booleanValue();
        if ((booleanValue || ((Boolean) k0Var2.invoke(nVar)).booleanValue()) && ((Boolean) k0Var.invoke(nVar)).booleanValue()) {
            arrayList.add(nVar);
        }
        if (booleanValue) {
            wVar.i(nVar.f18825g, b(nVar, k0Var, k0Var2, j(7, nVar)));
            return;
        }
        List j10 = j(7, nVar);
        int size = j10.size();
        for (int i = 0; i < size; i++) {
            a((n) j10.get(i), arrayList, k0Var, k0Var2, wVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0 A[LOOP:1: B:11:0x0049->B:29:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8 A[EDGE_INSN: B:30:0x00f8->B:31:0x00f8 BREAK  A[LOOP:1: B:11:0x0049->B:29:0x00f0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(j2.n r17, a0.k0 r18, a0.k0 r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.b(j2.n, a0.k0, a0.k0, java.util.List):java.util.ArrayList");
    }
}
