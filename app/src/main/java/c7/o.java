package c7;
import p.a;
import x.n;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f3975a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3976b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3978d;

    public o(String str) {
        int i;
        this.f3975a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3976b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f3977c = optString;
        if (jSONObject.has("statusCode")) {
            i = jSONObject.optInt("statusCode");
        } else {
            i = 0;
        }
        this.f3978d = i;
        if (!TextUtils.isEmpty(optString)) {
            jSONObject.optString("serializedDocid");
        } else {
            q.n("Product type cannot be empty.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return TextUtils.equals(this.f3975a, ((o) obj).f3975a);
    }

    public final int hashCode() {
        return this.f3975a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f3976b);
        sb2.append("', productType='");
        sb2.append(this.f3977c);
        sb2.append("', statusCode=");
        return a.j(this.f3978d, "}", sb2);
    }
}
