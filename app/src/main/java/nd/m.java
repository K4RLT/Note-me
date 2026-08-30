package nd;
import p.a;
import v.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements ib.e, ib.c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f21265u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f21266v;

    public /* synthetic */ m(Context context, boolean z3) {
        this.f21266v = context;
        this.f21265u = z3;
    }

    @Override // ib.e
    public void d(Object obj) {
        SharedPreferences.Editor edit = e((Context) this.f21266v).edit();
        edit.putBoolean("proxy_retention", this.f21265u);
        edit.apply();
    }

    @Override // ib.c
    public void f(ib.o oVar) {
        String str;
        String str2;
        String k3;
        String str3 = (String) this.f21266v;
        oVar.getClass();
        if (this.f21265u) {
            str = "Alta";
        } else {
            str = "Baja";
        }
        if (oVar.l()) {
            k3 = "ok";
        } else {
            Exception i = oVar.i();
            if (i != null) {
                str2 = i.getMessage();
            } else {
                str2 = null;
            }
            k3 = a.k("falló (", str2, ")");
        }
        Log.d("ScraplyFCM", str + " en «" + str3 + "»: " + k3);
    }

    public /* synthetic */ m(boolean z3, String str) {
        this.f21265u = z3;
        this.f21266v = str;
    }
}
