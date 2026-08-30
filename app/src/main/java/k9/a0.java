package k9;

import android.util.Log;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.o31;
import com.google.android.gms.internal.ads.p31;
import com.google.android.gms.internal.ads.ym;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a0 extends l9.i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19634b = 0;

    public static void k(String str) {
        if (m()) {
            if (str != null && str.length() > 4000) {
                mf mfVar = l9.i.f20053a;
                Iterator f10 = ((p31) mfVar.f8338w).f(mfVar, str);
                boolean z3 = true;
                while (true) {
                    o31 o31Var = (o31) f10;
                    if (o31Var.hasNext()) {
                        String str2 = (String) o31Var.next();
                        if (z3) {
                            Log.v("Ads", str2);
                        } else {
                            Log.v("Ads-cont", str2);
                        }
                        z3 = false;
                    } else {
                        return;
                    }
                }
            } else {
                Log.v("Ads", str);
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        if (l9.i.j(2) && ((Boolean) ym.f12911a.p()).booleanValue()) {
            return true;
        }
        return false;
    }
}
