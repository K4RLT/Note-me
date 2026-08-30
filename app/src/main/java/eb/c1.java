package eb;
import d1.b;
import d1.c;
import d1.d;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16083u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ t1 f16084v;

    public c1(t1 t1Var) {
        this.f16083u = 2;
        this.f16084v = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f16083u) {
            case 0:
                this.f16084v.V();
                return;
            case 1:
                t1 t1Var = this.f16084v;
                t1Var.u();
                if (t1Var.s().P.b()) {
                    t1Var.f().H.g("Deferred Deep Link already retrieved. Not fetching again.");
                    return;
                }
                long a10 = t1Var.s().Q.a();
                t1Var.s().Q.b(1 + a10);
                if (a10 >= 5) {
                    t1Var.f().D.g("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                    t1Var.s().P.a(true);
                    return;
                } else {
                    if (t1Var.M == null) {
                        t1Var.M = new a2(t1Var, (d1) t1Var.f3443v, 2);
                    }
                    t1Var.M.b(0L);
                    return;
                }
            case 2:
                t0 t0Var = this.f16084v.K;
                d1 d1Var = t0Var.f16373b;
                y0 y0Var = d1Var.D;
                t1 t1Var2 = d1Var.J;
                q0 q0Var = d1Var.B;
                d(y0Var);
                y0Var.u();
                if (t0Var.c()) {
                    if (t0Var.d()) {
                        b(q0Var);
                        q0Var.S.j(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        c(t1Var2);
                        t1Var2.c0("auto", bundle, "_cmpx");
                    } else {
                        b(q0Var);
                        com.google.android.gms.internal.ads.d dVar = q0Var.S;
                        String i = dVar.i();
                        if (TextUtils.isEmpty(i)) {
                            k0 k0Var = d1Var.C;
                            d(k0Var);
                            k0Var.B.g("Cache still valid but referrer not found");
                        } else {
                            long a11 = ((q0Var.T.a() / 3600000) - 1) * 3600000;
                            Uri parse = Uri.parse(i);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str2 : parse.getQueryParameterNames()) {
                                bundle2.putString(str2, parse.getQueryParameter(str2));
                            }
                            ((Bundle) pair.second).putLong("_cc", a11);
                            Object obj = pair.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            c(t1Var2);
                            t1Var2.c0(str, (Bundle) pair.second, "_cmp");
                        }
                        dVar.j(null);
                    }
                    b(q0Var);
                    q0Var.T.b(0L);
                    return;
                }
                return;
            default:
                this.f16084v.V();
                return;
        }
    }

    public /* synthetic */ c1(int i) {
        this.f16083u = i;
    }
}
