package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13519u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b6.u f13520v;

    public /* synthetic */ p(b6.u uVar, int i) {
        this.f13519u = i;
        this.f13520v = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13519u) {
            case 0:
                b6.u uVar = this.f13520v;
                uVar.getClass();
                ((Executor) uVar.f1784x).execute(new p(uVar, 1));
                return;
            default:
                JSONObject jSONObject = new JSONObject();
                b6.u uVar2 = this.f13520v;
                Application application = (Application) uVar2.f1781u;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    String str = null;
                    if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        str = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", str);
                    JSONObject jSONObject2 = new JSONObject();
                    g gVar = (g) uVar2.B;
                    for (String str2 : gVar.a().keySet()) {
                        jSONObject2.put(str2, gVar.a().get(str2));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                } catch (JSONException unused) {
                }
                ((k) uVar2.A).f13467h.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                return;
        }
    }
}
