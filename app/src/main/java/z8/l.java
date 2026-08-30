package z8;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l extends a {
    public final q e;

    public l(int i, String str, String str2, a aVar, q qVar) {
        super(i, str, str2, aVar);
        this.e = qVar;
    }

    @Override // z8.a
    public final JSONObject b() {
        JSONObject b10 = super.b();
        q qVar = this.e;
        if (qVar == null) {
            b10.put("Response Info", "null");
            return b10;
        }
        b10.put("Response Info", qVar.a());
        return b10;
    }

    @Override // z8.a
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
