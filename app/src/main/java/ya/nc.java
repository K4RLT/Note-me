package ya;
import c0.d;
import t.z0;

/* loaded from: classes.dex */
public abstract class nc {
    public static final float a(d dVar) {
        if (dVar.l().e == z0.f25598v) {
            return Float.intBitsToFloat((int) (dVar.p() >> 32));
        }
        return Float.intBitsToFloat((int) (dVar.p() & 4294967295L));
    }

    public static final boolean b(d dVar, float f10) {
        float a10;
        boolean z3;
        dVar.l().getClass();
        if (dVar.q()) {
            a10 = -f10;
        } else {
            a10 = a(dVar);
        }
        if (a10 > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return false;
        }
        return true;
    }
}
