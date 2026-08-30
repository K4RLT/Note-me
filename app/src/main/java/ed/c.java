package ed;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f16481b;

    public /* synthetic */ c(d dVar, int i) {
        this.f16480a = i;
        this.f16481b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f16480a) {
            case 0:
                d dVar = this.f16481b;
                synchronized (dVar) {
                    try {
                        pd.c cVar = (pd.c) dVar.f16482a.get();
                        ArrayList l10 = cVar.l();
                        cVar.k();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < l10.size(); i++) {
                            a aVar = (a) l10.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f16476a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f16477b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                base64OutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return byteArrayOutputStream;
            default:
                d dVar2 = this.f16481b;
                synchronized (dVar2) {
                    ((pd.c) dVar2.f16482a.get()).r(System.currentTimeMillis(), ((pd.b) dVar2.f16484c.get()).a());
                }
                return null;
        }
    }
}
