package nd;
import c.x;
import n.e;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import wa.e7;

/* loaded from: classes.dex */
public final class n extends ga.a {
    public static final Parcelable.Creator<n> CREATOR = new i9.b(8);

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f21267u;

    /* renamed from: v, reason: collision with root package name */
    public e f21268v;

    /* renamed from: w, reason: collision with root package name */
    public com.google.android.gms.internal.consent_sdk.t f21269w;

    public n(Bundle bundle) {
        this.f21267u = bundle;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.consent_sdk.t, java.lang.Object] */
    public final com.google.android.gms.internal.consent_sdk.t a() {
        if (this.f21269w == null) {
            Bundle bundle = this.f21267u;
            if (ic.x(bundle)) {
                ic.c cVar = new ic.c(bundle);
                Object obj = new Object();
                obj.f13569a = cVar.t("gcm.n.title");
                cVar.q("gcm.n.title");
                Object[] p10 = cVar.p("gcm.n.title");
                if (p10 != null) {
                    String[] strArr = new String[p10.length];
                    for (int i = 0; i < p10.length; i++) {
                        strArr[i] = String.valueOf(p10[i]);
                    }
                }
                obj.f13570b = cVar.t("gcm.n.body");
                cVar.q("gcm.n.body");
                Object[] p11 = cVar.p("gcm.n.body");
                if (p11 != null) {
                    String[] strArr2 = new String[p11.length];
                    for (int i10 = 0; i10 < p11.length; i10++) {
                        strArr2[i10] = String.valueOf(p11[i10]);
                    }
                }
                cVar.t("gcm.n.icon");
                if (TextUtils.isEmpty(cVar.t("gcm.n.sound2"))) {
                    cVar.t("gcm.n.sound");
                }
                cVar.t("gcm.n.tag");
                cVar.t("gcm.n.color");
                cVar.t("gcm.n.click_action");
                cVar.t("gcm.n.android_channel_id");
                String t3 = cVar.t("gcm.n.link_android");
                if (TextUtils.isEmpty(t3)) {
                    t3 = cVar.t("gcm.n.link");
                }
                if (!TextUtils.isEmpty(t3)) {
                    Uri.parse(t3);
                }
                obj.f13571c = cVar.t("gcm.n.image");
                cVar.t("gcm.n.ticker");
                cVar.l("gcm.n.notification_priority");
                cVar.l("gcm.n.visibility");
                cVar.l("gcm.n.notification_count");
                cVar.i("gcm.n.sticky");
                cVar.i("gcm.n.local_only");
                cVar.i("gcm.n.default_sound");
                cVar.i("gcm.n.default_vibrate_timings");
                cVar.i("gcm.n.default_light_settings");
                cVar.r();
                cVar.o();
                cVar.u();
                this.f21269w = obj;
            }
        }
        return this.f21269w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.a(parcel, 2, this.f21267u);
        e7.l(parcel, k3);
    }
}