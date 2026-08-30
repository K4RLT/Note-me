package c7;
import x.n;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3961a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f3962b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3963c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3964d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3965f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3966g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3967h;
    public final ArrayList i;

    public i(String str) {
        ArrayList arrayList;
        this.f3961a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3962b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f3963c = optString;
        String optString2 = jSONObject.optString("type");
        this.f3964d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f3965f = jSONObject.optString("skuDetailsToken");
                this.f3966g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        ed.e eVar = new ed.e(10);
                        jSONObject2.optString("basePlanId");
                        jSONObject2.optString("offerId").getClass();
                        jSONObject2.getString("offerIdToken");
                        JSONArray jSONArray = jSONObject2.getJSONArray("pricingPhases");
                        ArrayList arrayList3 = new ArrayList();
                        if (jSONArray != null) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                                if (optJSONObject != null) {
                                    arrayList3.add(new de.b(optJSONObject));
                                }
                            }
                        }
                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("installmentPlanDetails");
                        if (optJSONObject2 != null) {
                            optJSONObject2.getInt("commitmentPaymentsCount");
                            optJSONObject2.optInt("subsequentCommitmentPaymentsCount");
                        }
                        JSONObject optJSONObject3 = jSONObject2.optJSONObject("transitionPlanDetails");
                        if (optJSONObject3 != null) {
                            optJSONObject3.getString("productId");
                            optJSONObject3.optString("title");
                            optJSONObject3.optString("name");
                            optJSONObject3.optString("description");
                            optJSONObject3.optString("basePlanId");
                            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("pricingPhase");
                            if (optJSONObject4 != null) {
                                optJSONObject4.optString("billingPeriod");
                                optJSONObject4.optString("priceCurrencyCode");
                                optJSONObject4.optString("formattedPrice");
                                optJSONObject4.optLong("priceAmountMicros");
                                optJSONObject4.optInt("recurrenceMode");
                                optJSONObject4.optInt("billingCycleCount");
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("offerTags");
                        if (optJSONArray2 != null) {
                            for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                                arrayList4.add(optJSONArray2.getString(i11));
                            }
                        }
                        arrayList2.add(eVar);
                    }
                    this.f3967h = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.f3967h = arrayList;
                }
                JSONObject optJSONObject5 = this.f3962b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray3 = this.f3962b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList5 = new ArrayList();
                if (optJSONArray3 != null) {
                    for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                        arrayList5.add(new h(optJSONArray3.getJSONObject(i12)));
                    }
                    this.i = arrayList5;
                    return;
                }
                if (optJSONObject5 != null) {
                    arrayList5.add(new h(optJSONObject5));
                    this.i = arrayList5;
                    return;
                } else {
                    this.i = null;
                    return;
                }
            }
            q.n("Product type cannot be empty.");
            throw null;
        }
        q.n("Product id cannot be empty.");
        throw null;
    }

    public final h a() {
        ArrayList arrayList = this.i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (h) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return TextUtils.equals(this.f3961a, ((i) obj).f3961a);
    }

    public final int hashCode() {
        return this.f3961a.hashCode();
    }

    public final String toString() {
        String obj = this.f3962b.toString();
        String valueOf = String.valueOf(this.f3967h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        g3.a.t(sb2, this.f3961a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f3963c);
        sb2.append("', productType='");
        sb2.append(this.f3964d);
        sb2.append("', title='");
        sb2.append(this.e);
        sb2.append("', productDetailsToken='");
        return a5.a.l(sb2, this.f3965f, "', subscriptionOfferDetails=", valueOf, "}");
    }
}
