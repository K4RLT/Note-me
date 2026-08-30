package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class em extends v9.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5716a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5718c;

    public em(fm fmVar, String str) {
        this.f5717b = str;
        Objects.requireNonNull(fmVar);
        this.f5718c = fmVar;
    }

    @Override // v9.a
    public final void a(String str) {
        String str2;
        long j10;
        int i = this.f5716a;
        String str3 = this.f5717b;
        Object obj = this.f5718c;
        switch (i) {
            case 0:
                int i10 = k9.a0.f19634b;
                l9.i.f("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    fm fmVar = (fm) obj;
                    fmVar.f6112g.a(fmVar.b(str3, str).toString());
                    return;
                } catch (JSONException e) {
                    l9.i.d("Error creating PACT Error Response JSON: ", e);
                    return;
                }
            default:
                s9.a aVar = (s9.a) obj;
                int i11 = k9.a0.f19634b;
                l9.i.f("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                if (((Boolean) bn.f4838c.p()).booleanValue()) {
                    str2 = ",\"as\":".concat(aVar.f25044k.b().toString());
                } else {
                    str2 = "";
                }
                Locale locale = Locale.getDefault();
                nb nbVar = bn.e;
                if (((Boolean) nbVar.p()).booleanValue()) {
                    j10 = ((Long) bn.f4842h.p()).longValue();
                } else {
                    j10 = 0;
                }
                String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str3, str, Long.valueOf(j10), str2);
                if (((Boolean) nbVar.p()).booleanValue()) {
                    try {
                        aVar.f25042h.execute(new ou1(this, 29, format));
                    } catch (RuntimeException e8) {
                        f9.k.C.f16817h.e("TaggingLibraryJsInterface.getQueryInfo.onFailure", e8);
                    }
                } else {
                    aVar.f25037b.evaluateJavascript(format, null);
                }
                if (((Boolean) bn.f4838c.p()).booleanValue() && ((Boolean) bn.f4839d.p()).booleanValue()) {
                    s9.o oVar = aVar.f25045l;
                    oVar.getClass();
                    oVar.f25091b.execute(new s9.n(oVar, 0));
                    return;
                }
                return;
        }
    }

    @Override // v9.a
    public final void b(u.c cVar) {
        String str;
        String format;
        long j10;
        int i = this.f5716a;
        Object obj = this.f5718c;
        String str2 = this.f5717b;
        switch (i) {
            case 0:
                try {
                    fm fmVar = (fm) obj;
                    fmVar.f6112g.a(fmVar.c(str2, ((c4.s) cVar.f25764v).f3857v).toString());
                    return;
                } catch (JSONException e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.d("Error creating PACT Signal Response JSON: ", e);
                    return;
                }
            default:
                s9.a aVar = (s9.a) obj;
                String str3 = ((c4.s) cVar.f25764v).f3857v;
                long j11 = 0;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str2);
                    if (((Boolean) bn.f4838c.p()).booleanValue()) {
                        jSONObject.put("as", aVar.f25044k.b());
                    }
                    if (((Boolean) bn.e.p()).booleanValue()) {
                        j10 = ((Long) bn.f4842h.p()).longValue();
                    } else {
                        j10 = 0;
                    }
                    jSONObject.put("sdk_ttl_ms", j10);
                    jSONObject.put("signal", str3);
                    format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    if (((Boolean) bn.f4838c.p()).booleanValue()) {
                        str = ",\"as\":".concat(aVar.f25044k.b().toString());
                    } else {
                        str = "";
                    }
                    Locale locale = Locale.getDefault();
                    String str4 = ((c4.s) cVar.f25764v).f3857v;
                    if (((Boolean) bn.e.p()).booleanValue()) {
                        j11 = ((Long) bn.f4842h.p()).longValue();
                    }
                    format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str4, Long.valueOf(j11), str);
                }
                if (((Boolean) bn.e.p()).booleanValue()) {
                    try {
                        aVar.f25042h.execute(new pu1(this, 27, format));
                    } catch (RuntimeException e8) {
                        f9.k.C.f16817h.e("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e8);
                    }
                } else {
                    aVar.f25037b.evaluateJavascript(format, null);
                }
                if (((Boolean) bn.f4838c.p()).booleanValue() && ((Boolean) bn.f4839d.p()).booleanValue()) {
                    s9.o oVar = aVar.f25045l;
                    oVar.getClass();
                    oVar.f25091b.execute(new s9.n(oVar, 0));
                    return;
                }
                return;
        }
    }

    public em(s9.a aVar, String str) {
        this.f5717b = str;
        this.f5718c = aVar;
    }
}
