package z8;

import g9.y1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f31969a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31970b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31971c;

    /* renamed from: d, reason: collision with root package name */
    public final a f31972d;

    public a(int i, String str, String str2, a aVar) {
        this.f31969a = i;
        this.f31970b = str;
        this.f31971c = str2;
        this.f31972d = aVar;
    }

    public final y1 a() {
        y1 y1Var;
        a aVar = this.f31972d;
        if (aVar == null) {
            y1Var = null;
        } else {
            y1Var = new y1(aVar.f31969a, aVar.f31970b, aVar.f31971c, null, null);
        }
        return new y1(this.f31969a, this.f31970b, this.f31971c, y1Var, null);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f31969a);
        jSONObject.put("Message", this.f31970b);
        jSONObject.put("Domain", this.f31971c);
        a aVar = this.f31972d;
        if (aVar == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", aVar.b());
        return jSONObject;
    }

    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
