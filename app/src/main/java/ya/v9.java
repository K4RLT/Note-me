package ya;
import q2.s;

/* loaded from: classes.dex */
public abstract class v9 {
    public static final int a(int i, s sVar) {
        boolean z3;
        boolean z9;
        if (sVar.compareTo(s.f23366x) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && z3) {
            return 3;
        }
        if (z3) {
            return 1;
        }
        if (!z9) {
            return 0;
        }
        return 2;
    }
}
