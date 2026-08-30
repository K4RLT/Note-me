package x;
import k0.w;
import r0.l;
import r0.m;
import r0.r;
import r0.y;
import x.d;
import y.a;

import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q0 implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f29995b = new q0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29996a;

    public /* synthetic */ q0(int i) {
        this.f29996a = i;
    }

    public static final a b(int i, String str) {
        WeakHashMap weakHashMap = w0.f30011u;
        return new a(i, str);
    }

    public static final u0 d(int i, String str) {
        WeakHashMap weakHashMap = w0.f30011u;
        return new u0(new c0(0, 0, 0, 0), str);
    }

    public static w0 e(m mVar) {
        w0 w0Var;
        r rVar = (r) mVar;
        View view = (View) rVar.j(AndroidCompositionLocals_androidKt.f645f);
        WeakHashMap weakHashMap = w0.f30011u;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new w0(view);
                    weakHashMap.put(view, obj);
                }
                w0Var = (w0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean h3 = rVar.h(w0Var) | rVar.h(view);
        Object O = rVar.O();
        if (h3 || O == l.f24285a) {
            O = new w(w0Var, 28, view);
            rVar.k0(O);
        }
        y.c(w0Var, (df.l) O, rVar);
        return w0Var;
    }

    public static d1.r g(float f10) {
        if (f10 <= 0.0d) {
            a.a("invalid weight; must be greater than zero");
        }
        if (f10 > Float.MAX_VALUE) {
            f10 = Float.MAX_VALUE;
        }
        return new LayoutWeightElement(f10, true);
    }

    @Override // d
    public void c(y2.c cVar, int i, int[] iArr, y2.m mVar, int[] iArr2) {
        switch (this.f29996a) {
            case 1:
                h.d(iArr, iArr2, false);
                return;
            case 2:
                h.e(i, iArr, iArr2, false);
                return;
            case 3:
                if (mVar == y2.m.f30814u) {
                    h.e(i, iArr, iArr2, false);
                    return;
                } else {
                    h.d(iArr, iArr2, true);
                    return;
                }
            default:
                if (mVar == y2.m.f30814u) {
                    h.d(iArr, iArr2, false);
                    return;
                } else {
                    h.e(i, iArr, iArr2, true);
                    return;
                }
        }
    }

    public d1.r f(float f10, boolean z3) {
        if (f10 <= 0.0d) {
            a.a("invalid weight; must be greater than zero");
        }
        if (f10 > Float.MAX_VALUE) {
            f10 = Float.MAX_VALUE;
        }
        return new LayoutWeightElement(f10, z3);
    }

    public String toString() {
        switch (this.f29996a) {
            case 1:
                return "AbsoluteArrangement#Left";
            case 2:
                return "AbsoluteArrangement#Right";
            case 3:
                return "Arrangement#End";
            case 4:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
