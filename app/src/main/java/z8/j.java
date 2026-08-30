package z8;

import android.os.Bundle;
import g9.e3;
import g9.y1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f31992a;

    /* renamed from: b, reason: collision with root package name */
    public final a f31993b;

    public j(e3 e3Var) {
        a a10;
        this.f31992a = e3Var;
        y1 y1Var = e3Var.f17629w;
        if (y1Var == null) {
            a10 = null;
        } else {
            a10 = y1Var.a();
        }
        this.f31993b = a10;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        e3 e3Var = this.f31992a;
        jSONObject.put("Adapter", e3Var.f17627u);
        jSONObject.put("Latency", e3Var.f17628v);
        String str = e3Var.f17631y;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = e3Var.f17632z;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = e3Var.A;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = e3Var.B;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = e3Var.f17630x;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f31993b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", aVar.b());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
