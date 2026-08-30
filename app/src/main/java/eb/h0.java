package eb;
import p.a;
import q1.e;
import q1.i;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f16158b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f16159c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f16160d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final t0 f16161a;

    public h0(t0 t0Var) {
        this.f16161a = t0Var;
    }

    public static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z3;
        String str2;
        fa.y.h(atomicReference);
        if (strArr.length == strArr2.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        fa.y.b(z3);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f16161a.b()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(f(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = e((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = e(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb2.append(valueOf);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public final String b(u uVar) {
        String a10;
        t0 t0Var = this.f16161a;
        if (!t0Var.b()) {
            return uVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(uVar.f16382w);
        sb2.append(",name=");
        sb2.append(c(uVar.f16380u));
        sb2.append(",params=");
        t tVar = uVar.f16381v;
        if (tVar == null) {
            a10 = null;
        } else if (!t0Var.b()) {
            a10 = tVar.f16371u.toString();
        } else {
            a10 = a(tVar.b());
        }
        sb2.append(a10);
        return sb2.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f16161a.b()) {
            return str;
        }
        return d(str, q1.f16327g, e, f16158b);
    }

    public final String e(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = a((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(valueOf);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f16161a.b()) {
            return str;
        }
        return d(str, q1.f16323b, q1.f16322a, f16159c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f16161a.b()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return a.k("experiment_id(", str, ")");
        }
        return d(str, q1.f16329j, i, f16160d);
    }
}
