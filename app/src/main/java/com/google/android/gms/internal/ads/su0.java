package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class su0 {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f11166a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f11167b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f11168c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i10, int i11, int i12) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f11168c);
            jSONObject.put("y", i10 / f11168c);
            jSONObject.put("width", i11 / f11168c);
            jSONObject.put("height", i12 / f11168c);
            return jSONObject;
        } catch (JSONException e) {
            xy.v(e, "Error with creating viewStateObject");
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            StringBuilder sb2 = new StringBuilder(str.length() + 47);
            sb2.append("JSONException during JSONObject.put for name [");
            sb2.append(str);
            sb2.append("]");
            xy.v(e, sb2.toString());
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void d(JSONObject jSONObject) {
        float f10;
        float f11;
        if (f11166a != null) {
            Point point = new Point(0, 0);
            f11166a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f11168c;
            f10 = f12 / f13;
            f11 = point.y / f13;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null || jSONObject2 != null) {
            if (jSONObject != null && jSONObject2 != null) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        String str = f11167b[i];
                        if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                            break;
                        }
                        i++;
                    } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                        if (optJSONArray != null || optJSONArray2 != null) {
                            if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                    if (!optJSONArray.optString(i10, "").equals(optJSONArray2.optString(i10, ""))) {
                                        break;
                                    }
                                }
                            }
                        }
                        JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                        JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                        if (optJSONArray3 != null || optJSONArray4 != null) {
                            if ((optJSONArray3 == null && optJSONArray4 == null) || (optJSONArray3 != null && optJSONArray4 != null && optJSONArray3.length() == optJSONArray4.length())) {
                                for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                                    if (e(optJSONArray3.optJSONObject(i11), optJSONArray4.optJSONObject(i11))) {
                                    }
                                }
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
