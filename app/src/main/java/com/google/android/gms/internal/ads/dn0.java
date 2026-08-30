package com.google.android.gms.internal.ads;
import g9.p;
import g9.r;
import k9.a0;

import android.os.Bundle;
import android.util.Base64;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5465a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5466b;

    public /* synthetic */ dn0(HashMap hashMap, int i) {
        this.f5465a = i;
        this.f5466b = hashMap;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        switch (this.f5465a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                HashMap hashMap = this.f5466b;
                if (!hashMap.isEmpty()) {
                    if (((Boolean) r.e.f17698c.a(sl.K8)).booleanValue()) {
                        k91 A = n91.A();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                            if (!arrayDeque.isEmpty()) {
                                le0 le0Var = (le0) entry.getKey();
                                int i = le0Var.f8017b;
                                int i10 = 1;
                                if (i != 0) {
                                    if (i != 1) {
                                        i10 = 3;
                                        if (i != 2) {
                                            if (i != 3) {
                                                i10 = 0;
                                            } else {
                                                i10 = 4;
                                            }
                                        }
                                    } else {
                                        i10 = 2;
                                    }
                                }
                                if (i10 != 0) {
                                    i91 z3 = j91.z();
                                    long j10 = le0Var.f8016a;
                                    z3.b();
                                    ((j91) z3.f4845v).A(j10);
                                    z3.b();
                                    ((j91) z3.f4845v).B(i10);
                                    j91 j91Var = (j91) z3.c();
                                    l91 z9 = m91.z();
                                    z9.b();
                                    ((m91) z9.f4845v).A(j91Var);
                                    z9.b();
                                    ((m91) z9.f4845v).B(arrayDeque);
                                    A.b();
                                    ((n91) A.f4845v).B((m91) z9.c());
                                }
                            }
                        }
                        n91 n91Var = (n91) A.c();
                        if (n91Var.z() > 0) {
                            bundle.putString("ods", Base64.encodeToString(n91Var.b(), 11));
                            return;
                        }
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        ArrayDeque arrayDeque2 = (ArrayDeque) entry2.getValue();
                        if (!arrayDeque2.isEmpty()) {
                            le0 le0Var2 = (le0) entry2.getKey();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(FacebookMediationAdapter.KEY_ID, le0Var2.f8016a);
                                jSONObject.put("event_type", le0Var2.f8017b);
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it = arrayDeque2.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put((Long) it.next());
                                }
                                jSONObject.put("timestamps", jSONArray2);
                                jSONArray.put(jSONObject);
                            } catch (JSONException e) {
                                a0.l("Failed putting the on-device storage record.", e);
                            }
                        }
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("on_device_storage_records", jSONArray.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", p.f17688g.f17689a.k(this.f5466b));
                    return;
                } catch (JSONException e8) {
                    a0.k("Could not encode video decoder properties: ".concat(String.valueOf(e8.getMessage())));
                    return;
                }
        }
    }
}
