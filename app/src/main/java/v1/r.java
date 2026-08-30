package v1;
import x.n;
import b.c;
import q.x;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27337a = new a(AdError.NETWORK_ERROR_CODE);

    /* renamed from: b, reason: collision with root package name */
    public static final a f27338b;

    /* renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f27339c;

    static {
        new a(1007);
        new a(1008);
        f27338b = new a(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
        f27339c = new StackTraceElement[0];
    }

    public static final boolean a(t tVar) {
        if (!tVar.f() && !tVar.f27347h && tVar.f27344d) {
            return true;
        }
        return false;
    }

    public static final boolean b(t tVar) {
        if (!tVar.f27347h && tVar.f27344d) {
            return true;
        }
        return false;
    }

    public static final boolean c(t tVar) {
        if (!tVar.f() && tVar.f27347h && !tVar.f27344d) {
            return true;
        }
        return false;
    }

    public static final boolean d(t tVar) {
        if (tVar.f27347h && !tVar.f27344d) {
            return true;
        }
        return false;
    }

    public static final boolean e(t tVar, long j10, long j11) {
        int i;
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (tVar.i == 1) {
            i = 1;
        } else {
            i = 0;
        }
        long j12 = tVar.f27343c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        float f10 = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32)) * f10;
        float f11 = ((int) (j10 >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f10;
        float f12 = ((int) (j10 & 4294967295L)) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (intBitsToFloat > f11) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = z9 | z3;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z12 | z10;
        if (intBitsToFloat2 > f12) {
            z11 = true;
        }
        return z13 | z11;
    }

    public static d1.r f(d1.r rVar, a aVar) {
        return rVar.d(new PointerHoverIconModifierElement(aVar));
    }

    public static final long g(t tVar, boolean z3) {
        long g8 = j1.b.g(tVar.f27343c, tVar.f27346g);
        if (!z3 && tVar.f()) {
            return 0L;
        }
        return g8;
    }

    public static final boolean h(t tVar) {
        return !j1.c(g(tVar, false), 0L);
    }

    public static final void i(k kVar, long j10, df.l lVar, boolean z3) {
        MotionEvent b10 = kVar.b();
        if (b10 != null) {
            int action = b10.getAction();
            if (z3) {
                b10.setAction(3);
            }
            int i = (int) (j10 >> 32);
            int i10 = (int) (j10 & 4294967295L);
            b10.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i10));
            lVar.invoke(b10);
            b10.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i10));
            b10.setAction(action);
            return;
        }
        x.n("The PointerEvent receiver cannot have a null MotionEvent.");
    }

    public static String j(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "Unknown";
                    }
                    return "Eraser";
                }
                return "Stylus";
            }
            return "Mouse";
        }
        return "Touch";
    }
}
