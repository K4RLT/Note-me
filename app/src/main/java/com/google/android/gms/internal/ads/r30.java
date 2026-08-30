package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r30 implements hr {

    /* renamed from: u, reason: collision with root package name */
    public final Context f10072u;

    /* renamed from: v, reason: collision with root package name */
    public final yh f10073v;

    /* renamed from: w, reason: collision with root package name */
    public final PowerManager f10074w;

    public r30(Context context, yh yhVar) {
        this.f10072u = context;
        this.f10073v = yhVar;
        this.f10074w = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.hr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject r(t30 t30Var) {
        boolean z3;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zh zhVar = t30Var.e;
        if (zhVar == null) {
            jSONObject = new JSONObject();
        } else {
            yh yhVar = this.f10073v;
            if (yhVar.f12875b != null) {
                boolean z9 = zhVar.f13164a;
                JSONObject jSONObject3 = new JSONObject();
                JSONObject put = jSONObject3.put("afmaVersion", yhVar.f12877d).put("activeViewJSON", yhVar.f12875b).put("timestamp", t30Var.f11235c).put("adFormat", yhVar.f12874a).put("hashCode", yhVar.f12876c).put("isMraid", false).put("isStopped", false).put("isPaused", t30Var.f11234b).put("isNative", yhVar.e).put("isScreenOn", this.f10074w.isInteractive());
                k9.a aVar = f9.k.C.i;
                synchronized (aVar) {
                    z3 = aVar.f19632a;
                }
                JSONObject put2 = put.put("appMuted", z3).put("appVolume", r10.i.a());
                Context context = this.f10072u;
                put2.put("deviceVolume", k9.a.b(context.getApplicationContext()));
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                JSONObject put3 = jSONObject3.put("windowVisibility", zhVar.f13165b).put("isAttachedToWindow", z9);
                JSONObject jSONObject4 = new JSONObject();
                Rect rect = zhVar.f13166c;
                JSONObject put4 = put3.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
                JSONObject jSONObject5 = new JSONObject();
                Rect rect2 = zhVar.f13167d;
                JSONObject put5 = put4.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                JSONObject jSONObject6 = new JSONObject();
                Rect rect3 = zhVar.e;
                JSONObject put6 = put5.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zhVar.f13168f);
                JSONObject jSONObject7 = new JSONObject();
                Rect rect4 = zhVar.f13169g;
                JSONObject put7 = put6.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zhVar.f13170h);
                JSONObject jSONObject8 = new JSONObject();
                Rect rect5 = zhVar.i;
                put7.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
                jSONObject3.put("isVisible", t30Var.f11233a);
                if (((Boolean) g9.r.e.f17698c.a(sl.X1)).booleanValue()) {
                    JSONArray jSONArray2 = new JSONArray();
                    List<Rect> list = zhVar.f13172k;
                    if (list != null) {
                        for (Rect rect6 : list) {
                            jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                        }
                    }
                    jSONObject3.put("scrollableContainerBoxes", jSONArray2);
                }
                if (!TextUtils.isEmpty(t30Var.f11236d)) {
                    jSONObject3.put("doneReasonCode", "u");
                }
                jSONObject = jSONObject3;
            } else {
                throw new JSONException("Active view Info cannot be null.");
            }
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
