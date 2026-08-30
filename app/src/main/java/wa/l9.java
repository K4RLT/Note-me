package wa;
import k9.a0;
import l9.f;
import l9.i;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.nx;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.x21;
import com.google.android.gms.internal.ads.xx;

/* loaded from: classes.dex */
public abstract class l9 {
    public static void a(Context context) {
        boolean z3;
        Object obj = f.f20042b;
        if (((Boolean) tm.f11386a.p()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (f.f20042b) {
                        z3 = f.f20043c;
                    }
                    if (!z3) {
                        ac.b r8 = new nx(context).r();
                        int i = a0.f19634b;
                        i.e("Updating ad debug logging enablement.");
                        x21.i(r8, "AdDebugLogUpdater.updateEnablement", xx.f12657h);
                    }
                }
            } catch (Exception e) {
                i.g("Fail to determine debug setting.", e);
            }
        }
    }
}
