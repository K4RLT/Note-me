package rd;

import com.google.android.gms.internal.ads.py1;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f24689h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f24690a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f24691b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f24692c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f24693d;
    public final JSONObject e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24694f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f24695g;

    public c(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f24691b = jSONObject;
        this.f24692c = date;
        this.f24693d = jSONArray;
        this.e = jSONObject2;
        this.f24694f = j10;
        this.f24695g = jSONArray2;
        this.f24690a = jSONObject3;
    }

    public static c a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new c(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.py1, java.lang.Object] */
    public static py1 c() {
        Object obj = new Object();
        obj.f9668v = new JSONObject();
        obj.f9669w = f24689h;
        obj.f9670x = new JSONArray();
        obj.f9671y = new JSONObject();
        obj.f9667u = 0L;
        obj.f9672z = new JSONArray();
        return obj;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f24695g;
            if (i < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("rolloutId");
                String string2 = jSONObject.getString("variantId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                    String string3 = jSONArray2.getString(i10);
                    if (!hashMap.containsKey(string3)) {
                        hashMap.put(string3, new HashMap());
                    }
                    Map map = (Map) hashMap.get(string3);
                    if (map != null) {
                        map.put(string, string2);
                    }
                }
                i++;
            } else {
                return hashMap;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f24690a.toString().equals(((c) obj).f24690a.toString());
    }

    public final int hashCode() {
        return this.f24690a.hashCode();
    }

    public final String toString() {
        return this.f24690a.toString();
    }
}