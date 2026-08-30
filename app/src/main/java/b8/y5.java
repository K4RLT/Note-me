package b8;
import e7.c;
import g.b;
import ib.a;
import ib.g;
import ib.o;
import j6.n;

import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements c, g, a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ qd.a f3035u;

    public /* synthetic */ y5(qd.a aVar) {
        this.f3035u = aVar;
    }

    @Override // c
    public void f(o oVar) {
        oVar.getClass();
        if (oVar.l()) {
            rd.g gVar = this.f3035u.f23985f;
            Pattern pattern = rd.g.f24711f;
            Pattern pattern2 = rd.g.e;
            rd.b bVar = gVar.f24714c;
            String b10 = rd.b(bVar, "universe_enabled");
            if (b10 != null) {
                if (pattern2.matcher(b10).matches()) {
                    gVar.a("universe_enabled", bVar.c());
                    Log.d("Universe", "Universo ENCENDIDO por Remote Config");
                    sf.n0 n0Var = z5.f3079f;
                    Boolean bool = Boolean.TRUE;
                    n0Var.getClass();
                    n0Var.k(null, bool);
                    return;
                }
                if (pattern.matcher(b10).matches()) {
                    gVar.a("universe_enabled", bVar.c());
                    return;
                }
            }
            String b11 = rd.b(gVar.f24715d, "universe_enabled");
            if (b11 != null) {
                if (!pattern2.matcher(b11).matches()) {
                    if (pattern.matcher(b11).matches()) {
                        return;
                    }
                }
                Log.d("Universe", "Universo ENCENDIDO por Remote Config");
                sf.n0 n0Var2 = z5.f3079f;
                Boolean bool2 = Boolean.TRUE;
                n0Var2.getClass();
                n0Var2.k(null, bool2);
                return;
            }
            rd.g.c("universe_enabled", "Boolean");
        }
    }

    @Override // a
    public Object g(o oVar) {
        boolean z3;
        qd.a aVar = this.f3035u;
        if (oVar.l()) {
            rd.b bVar = aVar.f23983c;
            synchronized (bVar) {
                bVar.f24688c = wa.h8.e(null);
            }
            rd.l lVar = bVar.f24687b;
            synchronized (lVar) {
                lVar.f24740a.deleteFile(lVar.f24741b);
            }
            rd.c cVar = (rd.c) oVar.j();
            if (cVar != null) {
                JSONArray jSONArray = cVar.f24693d;
                cc.c cVar2 = aVar.f23981a;
                if (cVar2 != null) {
                    try {
                        cVar2.c(qd.a.e(jSONArray));
                    } catch (cc.a e) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e8) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e8);
                    }
                }
                n nVar = aVar.i;
                try {
                    ud.d i = ((gw) nVar.f18939w).i(cVar);
                    Iterator it = ((Set) nVar.f18941y).iterator();
                    while (it.hasNext()) {
                        ((Executor) nVar.f18940x).execute(new sd.a((lc.c) it.next(), i, 1));
                    }
                } catch (qd.c e10) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }

    @Override // g
    public o q(Object obj) {
        qd.a aVar = this.f3035u;
        o b10 = aVar.f23983c.b();
        o b11 = aVar.f23984d.b();
        return wa.h8.g(b10, b11).h(aVar.f23982b, new c(2, aVar, b10, b11));
    }
}
