package k9;
import r.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.xw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19723a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19724b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f19725c;

    public w(Context context) {
        this.f19725c = context;
    }

    public final void a() {
        SharedPreferences sharedPreferences;
        nl nlVar = sl.Ob;
        g9.r rVar = g9.e;
        if (!((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            return;
        }
        f0 f0Var = f9.k.C.f16813c;
        HashMap P = f0.P((String) rVar.f17698c.a(sl.Tb));
        for (String str : P.keySet()) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f19723a;
                    if (!hashMap.containsKey(str)) {
                        boolean equals = Objects.equals(str, "__default__");
                        Context context = this.f19725c;
                        if (equals) {
                            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        } else {
                            sharedPreferences = context.getSharedPreferences(str, 0);
                        }
                        xw xwVar = new xw(this, str);
                        hashMap.put(str, xwVar);
                        sharedPreferences.registerOnSharedPreferenceChangeListener(xwVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        v vVar = new v(P);
        synchronized (this) {
            this.f19724b.add(vVar);
        }
    }
}
