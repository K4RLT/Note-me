package b2;
import l.b;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class s1 implements Comparator {

    /* renamed from: v, reason: collision with root package name */
    public static final s1 f1590v = new s1(0);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1591u;

    public /* synthetic */ s1(int i) {
        this.f1591u = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1591u) {
            case 0:
                i0 i0Var = (i0) obj;
                i0 i0Var2 = (i0) obj2;
                int b10 = kotlin.jvm.internal.b(i0Var2.J, i0Var.J);
                if (b10 == 0) {
                    return kotlin.jvm.internal.b(i0Var.hashCode(), i0Var2.hashCode());
                }
                return b10;
            default:
                i0 i0Var3 = (i0) obj;
                i0 i0Var4 = (i0) obj2;
                int b11 = kotlin.jvm.internal.b(i0Var3.J, i0Var4.J);
                if (b11 == 0) {
                    return kotlin.jvm.internal.b(i0Var3.hashCode(), i0Var4.hashCode());
                }
                return b11;
        }
    }
}
