package p;

import java.util.Comparator;
import ya.ac;

/* loaded from: classes.dex */
public final class g1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float h3;
        b1 b1Var = (b1) obj;
        float f10 = -1.0f;
        if (b1Var.f22107v.h() == 0.0f && b1Var.F == null) {
            h3 = -1.0f;
        } else {
            h3 = b1Var.f22107v.h();
        }
        Float valueOf = Float.valueOf(h3);
        b1 b1Var2 = (b1) obj2;
        if (b1Var2.f22107v.h() != 0.0f || b1Var2.F != null) {
            f10 = b1Var2.f22107v.h();
        }
        return ac.a(valueOf, Float.valueOf(f10));
    }
}
