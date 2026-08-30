package s7;
import c.d;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import pe.z;
import qe.l;
import qe.u;
import r0.a1;
import r0.i1;
import sf.n0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24996u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f24997v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f24998w;

    public /* synthetic */ c(Context context, a1 a1Var, int i) {
        this.f24996u = i;
        this.f24997v = context;
        this.f24998w = a1Var;
    }

    @Override // df.a
    public final Object invoke() {
        Set<String> linkedHashSet;
        int i = this.f24996u;
        z zVar = z.f22715a;
        a1 a1Var = this.f24998w;
        Context context = this.f24997v;
        switch (i) {
            case 0:
                i1 i1Var = j.f25029a;
                context.getClass();
                context.getSharedPreferences("apis_promo", 0).edit().putBoolean("dismissed", true).apply();
                f7.d("dismissed_forever");
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 1:
                i1 i1Var2 = j.f25029a;
                context.getClass();
                f7.d("store_opened");
                try {
                    try {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.delta.apis")).addFlags(268435456));
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.delta.apis")).addFlags(268435456));
                }
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            case 2:
                a1Var.setValue(Boolean.FALSE);
                context.getClass();
                context.getSharedPreferences("scraply_notices", 0).edit().putBoolean("welcome_seen", true).apply();
                return zVar;
            case 3:
                a1Var.setValue(Boolean.FALSE);
                n0 n0Var = r7.h.f24629a;
                context.getSharedPreferences("scraply_tips", 0).edit().putBoolean("bubble_off", true).apply();
                return zVar;
            default:
                a1Var.setValue(Boolean.FALSE);
                SharedPreferences sharedPreferences = context.getSharedPreferences("scraply_notices", 0);
                Set<String> stringSet = sharedPreferences.getStringSet("seen_notices", u.f24025u);
                if (stringSet != null) {
                    linkedHashSet = l.T(stringSet);
                } else {
                    linkedHashSet = new LinkedHashSet<>();
                }
                linkedHashSet.add("notice_update_v1_beta");
                sharedPreferences.edit().putStringSet("seen_notices", linkedHashSet).apply();
                return zVar;
        }
    }
}
