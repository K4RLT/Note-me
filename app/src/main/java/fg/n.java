package fg;
import p.a;

import a0.f0;
import eg.b1;
import eg.p0;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final eg.z f16990a = p0.a(b1.f16494a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final void a(m mVar, String str) {
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.a(mVar.getClass()) + " is not a " + str);
    }

    public static final z b(m mVar) {
        z zVar;
        mVar.getClass();
        if (mVar instanceof z) {
            zVar = (z) mVar;
        } else {
            zVar = null;
        }
        if (zVar != null) {
            return zVar;
        }
        a(mVar, "JsonObject");
        throw null;
    }

    public static final d0 c(m mVar) {
        d0 d0Var;
        if (mVar instanceof d0) {
            d0Var = (d0) mVar;
        } else {
            d0Var = null;
        }
        if (d0Var != null) {
            return d0Var;
        }
        a(mVar, "JsonPrimitive");
        throw null;
    }

    public static final long d(d0 d0Var) {
        String str;
        String a10 = d0Var.a();
        f0 f0Var = new f0(a10);
        long h3 = f0Var.h();
        if (f0Var.e() != 10) {
            int i = f0Var.f47b;
            int i10 = i - 1;
            if (i != a10.length() && i10 >= 0) {
                str = String.valueOf(a10.charAt(i10));
            } else {
                str = "EOF";
            }
            f0.u(f0Var, a.k("Expected input to contain a single valid number, but got '", str, "' after it"), i10, 4);
            throw null;
        }
        return h3;
    }
}
