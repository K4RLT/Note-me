package kc;

import android.os.Bundle;
import android.util.Log;
import c4.f;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import eb.x;
import j.i0;
import java.util.ArrayList;
import k6.i;
import oc.o;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements nc.a, mc.a, gd.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f19766u;

    public /* synthetic */ a(f fVar) {
        this.f19766u = fVar;
    }

    @Override // nc.a
    public void c(o oVar) {
        f fVar = this.f19766u;
        synchronized (fVar) {
            try {
                if (((nc.a) fVar.f3831b) instanceof nc.b) {
                    ((ArrayList) fVar.f3832c).add(oVar);
                }
                ((nc.a) fVar.f3831b).c(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gd.a
    public void i(gd.b bVar) {
        f fVar = this.f19766u;
        lc.d dVar = lc.d.f20327a;
        dVar.b("AnalyticsConnector now available.");
        fc.b bVar2 = (fc.b) bVar.get();
        ic.c cVar = new ic.c(15, bVar2);
        gw gwVar = new gw(16);
        fc.c cVar2 = (fc.c) bVar2;
        x b10 = cVar2.b("clx", gwVar);
        if (b10 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            b10 = cVar2.b("crash", gwVar);
            if (b10 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (b10 != null) {
            dVar.b("Registered Firebase Analytics listener.");
            i iVar = new i(10, false);
            i0 i0Var = new i0(cVar);
            synchronized (fVar) {
                try {
                    ArrayList arrayList = (ArrayList) fVar.f3832c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        iVar.c((o) obj);
                    }
                    gwVar.f14387w = iVar;
                    gwVar.f14386v = i0Var;
                    fVar.f3831b = iVar;
                    fVar.f3830a = i0Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        dVar.f(null, "Could not register Firebase Analytics listener; a listener is already registered.");
    }

    @Override // mc.a
    public void k(Bundle bundle) {
        ((mc.a) this.f19766u.f3830a).k(bundle);
    }
}
