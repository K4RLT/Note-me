package com.google.android.gms.internal.ads;
import f9.k;
import k9.a0;
import l9.i;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cp implements mp {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5138u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f5139v;

    public /* synthetic */ cp(int i, Object obj) {
        this.f5138u = i;
        this.f5139v = obj;
    }

    private final /* synthetic */ void a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    s00 s00Var = (s00) this.f5139v;
                    synchronized (s00Var) {
                        try {
                            if (s00Var.f10420e0 != parseInt) {
                                s00Var.f10420e0 = parseInt;
                                s00Var.requestLayout();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    int i = k9.a0.f19634b;
                    l9.i.g("Exception occurred while getting webview content height", e);
                }
            }
        }
    }

    public static final Bundle b(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e) {
                f9.k.C.f16817h.d("OutOfContextTestingGmsgHandler.generateNetworkExtras", e);
            }
        }
        return bundle;
    }

    public static final ArrayList c(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            f9.k.C.f16817h.d("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e);
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:153:0x0544. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06cd A[Catch: all -> 0x06bb, TRY_LEAVE, TryCatch #15 {all -> 0x06bb, blocks: (B:222:0x0679, B:224:0x067f, B:227:0x0686, B:232:0x0690, B:234:0x0698, B:236:0x06aa, B:238:0x06ae, B:240:0x06b2, B:242:0x06b6, B:245:0x06c2, B:247:0x06cd, B:249:0x06cf, B:255:0x06de, B:256:0x06e6, B:258:0x06ea, B:261:0x06f1, B:263:0x06f5, B:266:0x06fe, B:268:0x0702, B:270:0x070a, B:272:0x070e, B:278:0x071c, B:279:0x0723, B:281:0x0731, B:283:0x0735, B:285:0x0739, B:288:0x06bf), top: B:221:0x0679, inners: #3, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06e6 A[Catch: all -> 0x06bb, TRY_ENTER, TryCatch #15 {all -> 0x06bb, blocks: (B:222:0x0679, B:224:0x067f, B:227:0x0686, B:232:0x0690, B:234:0x0698, B:236:0x06aa, B:238:0x06ae, B:240:0x06b2, B:242:0x06b6, B:245:0x06c2, B:247:0x06cd, B:249:0x06cf, B:255:0x06de, B:256:0x06e6, B:258:0x06ea, B:261:0x06f1, B:263:0x06f5, B:266:0x06fe, B:268:0x0702, B:270:0x070a, B:272:0x070e, B:278:0x071c, B:279:0x0723, B:281:0x0731, B:283:0x0735, B:285:0x0739, B:288:0x06bf), top: B:221:0x0679, inners: #3, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x041d  */
    /* JADX WARN: Type inference failed for: r0v105, types: [com.google.android.gms.internal.ads.f6, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.mp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r14, java.util.Map r15) {
        /*
            Method dump skipped, instructions count: 2226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cp.d(java.lang.Object, java.util.Map):void");
    }
}
