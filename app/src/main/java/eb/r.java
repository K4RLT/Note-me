package eb;
import d1.b;
import d1.d;
import k0.y;
import p.a;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f16336a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16337b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16338c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16339d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final t f16340f;

    public r(d1 d1Var, String str, String str2, String str3, long j10, Bundle bundle) {
        t tVar;
        fa.y.e(str2);
        fa.y.e(str3);
        this.f16336a = str2;
        this.f16337b = str3;
        this.f16338c = TextUtils.isEmpty(str) ? null : str;
        this.f16339d = j10;
        this.e = 0L;
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    k0 k0Var = d1Var.C;
                    d(k0Var);
                    k0Var.A.g("Param name can't be null");
                    it.remove();
                } else {
                    l3 l3Var = d1Var.F;
                    b(l3Var);
                    Object r02 = l3Var.r0(bundle2.get(next), next);
                    if (r02 == null) {
                        k0 k0Var2 = d1Var.C;
                        d(k0Var2);
                        k0Var2.D.f(d1Var.G.f(next), "Param value can't be null");
                        it.remove();
                    } else {
                        l3 l3Var2 = d1Var.F;
                        b(l3Var2);
                        l3Var2.P(bundle2, next, r02);
                    }
                }
            }
            tVar = new t(bundle2);
        } else {
            tVar = new t(new Bundle());
        }
        this.f16340f = tVar;
    }

    public final r a(d1 d1Var, long j10) {
        return new r(d1Var, this.f16338c, this.f16336a, this.f16337b, this.f16339d, j10, this.f16340f);
    }

    public final String toString() {
        return a5.a.k(a.q("Event{appId='", this.f16336a, "', name='", this.f16337b, "', params="), String.valueOf(this.f16340f), "}");
    }

    public r(d1 d1Var, String str, String str2, String str3, long j10, long j11, t tVar) {
        fa.y.e(str2);
        fa.y.e(str3);
        fa.y.h(tVar);
        this.f16336a = str2;
        this.f16337b = str3;
        this.f16338c = TextUtils.isEmpty(str) ? null : str;
        this.f16339d = j10;
        this.e = j11;
        if (j11 != 0 && j11 > j10) {
            k0 k0Var = d1Var.C;
            d(k0Var);
            k0Var.D.h("Event created with reverse previous/current timestamps. appId, name", y(str2), y(str3));
        }
        this.f16340f = tVar;
    }
}
