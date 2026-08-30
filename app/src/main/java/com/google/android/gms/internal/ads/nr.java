package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class nr implements f31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8826c;

    public /* synthetic */ nr(Object obj, int i, Object obj2) {
        this.f8824a = i;
        this.f8825b = obj;
        this.f8826c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.f31
    public final Object apply(Object obj) {
        switch (this.f8824a) {
            case 0:
                er erVar = (er) obj;
                erVar.e((String) this.f8825b, (mp) this.f8826c);
                return erVar;
            case 1:
                ac0 ac0Var = (ac0) this.f8825b;
                JSONObject jSONObject = (JSONObject) this.f8826c;
                List list = (List) obj;
                ac0Var.getClass();
                Integer num = null;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String optString = jSONObject.optString("text");
                Integer c10 = ac0.c("bg_color", jSONObject);
                Integer c11 = ac0.c("text_color", jSONObject);
                int optInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int optInt2 = jSONObject.optInt("animation_ms", AdError.NETWORK_ERROR_CODE);
                int optInt3 = jSONObject.optInt("presentation_ms", 4000);
                if (optInt > 0) {
                    num = Integer.valueOf(optInt);
                }
                return new nn(optString, list, c10, c11, num, optInt3 + optInt2, ac0Var.f4445h.f10252y);
            default:
                s9.i iVar = (s9.i) this.f8825b;
                List<Uri> list2 = (List) this.f8826c;
                String str = (String) obj;
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list2) {
                    if (s9.i.z4(uri, iVar.T, iVar.U) && !TextUtils.isEmpty(str)) {
                        arrayList.add(s9.i.C4(uri, "nas", str));
                    } else {
                        arrayList.add(uri);
                    }
                }
                return arrayList;
        }
    }
}
