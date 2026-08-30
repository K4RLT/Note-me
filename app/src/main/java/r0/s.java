package r0;
import b0.e0;
import l.b;
import p.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f24367a = new c1("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f24368b = new c1("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final c1 f24369c = new c1("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final c1 f24370d = new c1("providers");
    public static final c1 e = new c1("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f24371f = new e0(8);

    public static final void a(int i, int i10, List list) {
        int e8 = e(i, list);
        if (e8 < 0) {
            e8 = -(e8 + 1);
        }
        while (e8 < list.size() && ((p0) list.get(e8)).f24318b < i10) {
        }
    }

    public static final void b(a2 a2Var, ArrayList arrayList, int i) {
        boolean l10 = a2Var.l(i);
        int[] iArr = a2Var.f24179b;
        if (l10) {
            arrayList.add(a2Var.n(i));
            return;
        }
        int i10 = iArr[(i * 5) + 3] + i;
        for (int i11 = i + 1; i11 < i10; i11 += iArr[(i11 * 5) + 3]) {
            b(a2Var, arrayList, i11);
        }
    }

    public static final void c(String str) {
        throw new k(a.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new k(a.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int e(int i, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int b10 = kotlin.jvm.internal.b(((p0) list.get(i11)).f24318b, i);
            if (b10 < 0) {
                i10 = i11 + 1;
            } else if (b10 > 0) {
                size = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public static final void f(e2 e2Var, int i, Object obj) {
        int h3 = e2Var.h(i);
        Object[] objArr = e2Var.f24219c;
        Object obj2 = objArr[h3];
        objArr[h3] = l.f24285a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
