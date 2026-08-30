package w6;
import d.a;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f27734a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27735b;

    public g(int i, String str, boolean z3) {
        this.f27734a = i;
        this.f27735b = z3;
    }

    @Override // w6.b
    public final q6.c a(o6.j jVar, o6.a aVar, x6.b bVar) {
        if (!((HashSet) jVar.A.f19569v).contains(o6.k.f21825u)) {
            a7.a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new q6.k(this);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MergePaths{mode=");
        int i = this.f27734a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "null";
                        } else {
                            str = "EXCLUDE_INTERSECTIONS";
                        }
                    } else {
                        str = "INTERSECT";
                    }
                } else {
                    str = "SUBTRACT";
                }
            } else {
                str = "ADD";
            }
        } else {
            str = "MERGE";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
