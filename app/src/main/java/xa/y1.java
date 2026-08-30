package xa;
import p.a;
import q.b;
import y1.b;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class y1 implements j0 {

    /* renamed from: u, reason: collision with root package name */
    public final n0 f30716u;

    /* renamed from: v, reason: collision with root package name */
    public final p0 f30717v;

    /* renamed from: w, reason: collision with root package name */
    public final z1 f30718w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f30719x;

    /* renamed from: y, reason: collision with root package name */
    public final int f30720y;

    public y1(n0 n0Var, int i, p0 p0Var, z1 z1Var, ArrayList arrayList) {
        this.f30716u = n0Var;
        this.f30720y = i;
        this.f30717v = p0Var;
        this.f30718w = z1Var;
        this.f30719x = arrayList;
    }

    public static void c(Class cls, String str, Field field, Field field2) {
        String name = cls.getName();
        throw new IllegalArgumentException(a5.a.l(a.q("Class ", name, " declares multiple JSON fields named '", str, "'; conflict is caused by fields "), g2.b(field), " and ", g2.b(field2), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#duplicate-fields"));
    }

    @Override // xa.j0
    public final i0 a(z zVar, k2 k2Var) {
        Class cls = k2Var.f30449a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        u0 u0Var = g2.f30419a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new o1(3);
        }
        u0.s(this.f30719x);
        if (g2.f30419a.z(cls)) {
            return new x1(cls, b(zVar, k2Var, cls, true));
        }
        return new v1(this.f30716u.a(k2Var, true), b(zVar, k2Var, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d9 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xa.w1 b(xa.z r25, xa.k2 r26, java.lang.Class r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.b(xa.z, xa.k2, java.lang.Class, boolean):xa.w1");
    }

    public final boolean d(Field field, boolean z3) {
        List list;
        p0 p0Var = this.f30717v;
        p0Var.getClass();
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || p0Var.b(field.getType(), z3)) {
            return false;
        }
        if (z3) {
            list = p0Var.f30495u;
        } else {
            list = p0Var.f30496v;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                g5.b();
                return false;
            }
            return true;
        }
        return true;
    }
}
