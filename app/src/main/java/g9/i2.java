package g9;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.eq;
import com.google.android.gms.internal.ads.jk0;
import com.google.android.gms.internal.ads.jq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: k, reason: collision with root package name */
    public static i2 f17651k;

    /* renamed from: a, reason: collision with root package name */
    public f2 f17652a;

    /* renamed from: b, reason: collision with root package name */
    public f2 f17653b;

    /* renamed from: c, reason: collision with root package name */
    public f2 f17654c;
    public f1 i;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17655d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f17656f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17657g = false;

    /* renamed from: h, reason: collision with root package name */
    public final Object f17658h = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final z8.p f17659j = new z8.p(new ArrayList());
    public final ArrayList e = new ArrayList();

    static {
        new HashSet(Arrays.asList(z8.b.APP_OPEN_AD, z8.b.INTERSTITIAL, z8.b.REWARDED));
    }

    public static jk0 a(List list) {
        int i;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eq eqVar = (eq) it.next();
            String str = eqVar.f5751u;
            if (eqVar.f5752v) {
                i = 2;
            } else {
                i = 1;
            }
            hashMap.put(str, new jq(i, eqVar.f5754x));
        }
        return new jk0(10, hashMap);
    }

    public static i2 d() {
        i2 i2Var;
        synchronized (i2.class) {
            try {
                if (f17651k == null) {
                    f17651k = new i2();
                }
                i2Var = f17651k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2Var;
    }

    public final void b(Context context) {
        if (this.i == null) {
            this.i = (f1) new l(p.f17688g.f17690b, context).d(context, false);
        }
    }

    public final void c() {
        f1 f1Var = this.i;
        if (f1Var == null) {
            return;
        }
        try {
            f1Var.a();
            this.i.W1(new oa.b(null), null);
        } catch (RemoteException e) {
            l9.i.g("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final e9.b e() {
        boolean z3;
        synchronized (this.f17658h) {
            if (this.i != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            fa.y.j("MobileAds.initialize() must be called prior to getting initialization status.", z3);
            f1 f1Var = this.i;
            if (f1Var == null) {
                return new b3(this);
            }
            try {
                return a(f1Var.j());
            } catch (RemoteException unused) {
                l9.i.c("Unable to get Initialization status.");
                return new b3(this);
            }
        }
    }
}
