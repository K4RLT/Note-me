package wa;
import d1.r;
import k1.p0;
import k1.z;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* loaded from: classes.dex */
public abstract class m7 {
    public static r a(r rVar, float f10, p0 p0Var, long j10, long j11, int i) {
        boolean z3;
        long j12;
        long j13;
        if (Float.compare(f10, 0) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 8) != 0) {
            j12 = z.f19535a;
        } else {
            j12 = j10;
        }
        if ((i & 16) != 0) {
            j13 = z.f19535a;
        } else {
            j13 = j11;
        }
        if (Float.compare(f10, 0) <= 0 && !z3) {
            return rVar;
        }
        return rVar.d(new ShadowGraphicsLayerElement(f10, p0Var, z3, j12, j13));
    }
}
