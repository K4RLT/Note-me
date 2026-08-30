package eg;
import a1.f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import wa.b9;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cg.d[] f16559a = new cg.d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final ag.a[] f16560b = new ag.a[0];

    public static final z a(ag.a aVar, String str) {
        return new z(str, new a0(aVar));
    }

    public static final Set b(cg.d dVar) {
        dVar.getClass();
        if (dVar instanceof j) {
            return ((j) dVar).b();
        }
        HashSet hashSet = new HashSet(dVar.f());
        int f10 = dVar.f();
        for (int i = 0; i < f10; i++) {
            hashSet.add(dVar.g(i));
        }
        return hashSet;
    }

    public static final cg.d[] c(List list) {
        cg.d[] dVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list != null && (dVarArr = (cg.d[]) list.toArray(new cg.d[0])) != null) {
            return dVarArr;
        }
        return f16559a;
    }

    public static final int d(cg.d dVar, cg.d[] dVarArr) {
        int i;
        dVarArr.getClass();
        int hashCode = (dVar.a().hashCode() * 31) + Arrays.hashCode(dVarArr);
        cg.f fVar = new cg.f(dVar);
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int i12 = 0;
            if (!fVar.hasNext()) {
                break;
            }
            int i13 = i11 * 31;
            String a10 = ((cg.d) fVar.next()).a();
            if (a10 != null) {
                i12 = a10.hashCode();
            }
            i11 = i13 + i12;
        }
        cg.f fVar2 = new cg.f(dVar);
        while (fVar2.hasNext()) {
            int i14 = i10 * 31;
            wa.z e = ((cg.d) fVar2.next()).e();
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i10 = i14 + i;
        }
        return (((hashCode * 31) + i11) * 31) + i10;
    }

    public static final void e(int i, int i10, cg.d dVar) {
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i11 = (~i) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(dVar.g(i12));
            }
            i11 >>>= 1;
        }
        throw new ag.b(dVar.a(), arrayList);
    }

    public static final String f(cg.d dVar) {
        return qe.l.B(b9.i(0, dVar.f()), ", ", dVar.a() + '(', ")", new f(10, dVar), 24);
    }
}
