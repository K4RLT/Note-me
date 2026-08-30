package c7;
import t.i;
import x.n;

import android.content.Context;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public volatile va.t f3899a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3900b;

    /* renamed from: c, reason: collision with root package name */
    public volatile l f3901c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f3902d;

    public /* synthetic */ b(Context context) {
        this.f3900b = context;
    }

    public final c a() {
        Context context = this.f3900b;
        if (context != null) {
            if (this.f3901c != null) {
                if (this.f3899a != null) {
                    this.f3899a.getClass();
                    l lVar = this.f3901c;
                    va.t tVar = this.f3899a;
                    if (lVar != null) {
                        l lVar2 = this.f3901c;
                        if (b()) {
                            return new b0(tVar, context, lVar2, this);
                        }
                        return new c(tVar, context, lVar2, this);
                    }
                    if (b()) {
                        return new b0(tVar, context, this);
                    }
                    return new c(tVar, context, this);
                }
                q.n("Pending purchases for one-time products must be supported.");
                return null;
            }
            q.n("Please provide a valid listener for purchases updates.");
            return null;
        }
        q.n("Please provide a valid Context.");
        return null;
    }

    public final boolean b() {
        try {
            Context context = this.f3900b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }
}
