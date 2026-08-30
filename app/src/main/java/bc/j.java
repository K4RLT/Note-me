package bc;
import c.a;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.x90;
import fa.y;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f3190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3191b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3192c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3193d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3194f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3195g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        y.j("ApplicationId must be set.", !la.a(str));
        this.f3191b = str;
        this.f3190a = str2;
        this.f3192c = str3;
        this.f3193d = str4;
        this.e = str5;
        this.f3194f = str6;
        this.f3195g = str7;
    }

    public static j a(Context context) {
        x90 x90Var = new x90(context, 15);
        String k3 = x90Var.k("google_app_id");
        if (TextUtils.isEmpty(k3)) {
            return null;
        }
        return new j(k3, x90Var.k("google_api_key"), x90Var.k("firebase_database_url"), x90Var.k("ga_trackingId"), x90Var.k("gcm_defaultSenderId"), x90Var.k("google_storage_bucket"), x90Var.k("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!y.l(this.f3191b, jVar.f3191b) || !y.l(this.f3190a, jVar.f3190a) || !y.l(this.f3192c, jVar.f3192c) || !y.l(this.f3193d, jVar.f3193d) || !y.l(this.e, jVar.e) || !y.l(this.f3194f, jVar.f3194f) || !y.l(this.f3195g, jVar.f3195g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3191b, this.f3190a, this.f3192c, this.f3193d, this.e, this.f3194f, this.f3195g});
    }

    public final String toString() {
        mu muVar = new mu(this);
        muVar.f(this.f3191b, "applicationId");
        muVar.f(this.f3190a, "apiKey");
        muVar.f(this.f3192c, "databaseUrl");
        muVar.f(this.e, "gcmSenderId");
        muVar.f(this.f3194f, "storageBucket");
        muVar.f(this.f3195g, "projectId");
        return muVar.toString();
    }
}
