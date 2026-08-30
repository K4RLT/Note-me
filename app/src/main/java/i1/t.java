package i1;
import l.a;
import l.b;

import b2.i0;
import java.util.Comparator;
import q.x;

/* loaded from: classes.dex */
public final class t implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public static final t f18135u = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object[], java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        int i = 0;
        if (f.r(sVar) && f.r(sVar2)) {
            i0 u9 = b2.l.u(sVar);
            i0 u10 = b2.l.u(sVar2);
            if (!kotlin.jvm.internal.a(u9, u10)) {
                i0[] i0VarArr = new i0[16];
                int i10 = 0;
                while (u9 != null) {
                    int i11 = i10 + 1;
                    if (i0VarArr.length < i11) {
                        int length = i0VarArr.length;
                        Object r52 = new Object[Math.max(i11, length * 2)];
                        System.arraycopy(i0VarArr, 0, r52, 0, length);
                        i0VarArr = r52;
                    }
                    if (i10 != 0) {
                        System.arraycopy(i0VarArr, 0, i0VarArr, 0 + 1, i10 + 0);
                    }
                    i0VarArr[0] = u9;
                    i10++;
                    u9 = u9.v();
                }
                i0[] i0VarArr2 = new i0[16];
                int i12 = 0;
                while (u10 != null) {
                    int i13 = i12 + 1;
                    if (i0VarArr2.length < i13) {
                        int length2 = i0VarArr2.length;
                        Object r53 = new Object[Math.max(i13, length2 * 2)];
                        System.arraycopy(i0VarArr2, 0, r53, 0, length2);
                        i0VarArr2 = r53;
                    }
                    if (i12 != 0) {
                        System.arraycopy(i0VarArr2, 0, i0VarArr2, 0 + 1, i12 + 0);
                    }
                    i0VarArr2[0] = u10;
                    i12++;
                    u10 = u10.v();
                }
                int min = Math.min(i10 - 1, i12 - 1);
                if (min >= 0) {
                    while (kotlin.jvm.internal.a(i0VarArr[i], i0VarArr2[i])) {
                        if (i != min) {
                            i++;
                        }
                    }
                    return kotlin.jvm.internal.b(i0VarArr[i].w(), i0VarArr2[i].w());
                }
                x.o("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (f.r(sVar)) {
                return -1;
            }
            if (f.r(sVar2)) {
                return 1;
            }
        }
        return 0;
    }
}