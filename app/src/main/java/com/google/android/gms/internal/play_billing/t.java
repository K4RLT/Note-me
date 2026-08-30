package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.wd0;
import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15532a = Runtime.getRuntime().availableProcessors();

    public static int a(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        h(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(long j10, Bundle bundle, String str, String str2) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j10);
    }

    public static Bundle c(c7.f fVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", fVar.f3946a);
        bundle.putString("DEBUG_MESSAGE", fVar.f3948c);
        bundle.putInt("LOG_REASON", wd0.g(i));
        return bundle;
    }

    public static Bundle d(String str, String str2, ArrayList arrayList, p1 p1Var, long j10) {
        Bundle bundle = new Bundle();
        b(j10, bundle, str, str2);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        p pVar = r.f15518v;
        Object[] objArr = {"subs", "inapp"};
        wa.d0.a(objArr, 2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(r.p(objArr, 2)));
        Object[] objArr2 = {"inapp"};
        wa.d0.a(objArr2, 1);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(r.p(objArr2, 1)));
        Object[] objArr3 = {"inapp"};
        wa.d0.a(objArr3, 1);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(r.p(objArr3, 1)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z3 = false;
        boolean z9 = false;
        for (int i = 0; i < size; i++) {
            c7.m mVar = (c7.m) arrayList.get(i);
            arrayList2.add(null);
            z3 |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z9 |= !TextUtils.isEmpty(null);
            if (mVar.f3973b.equals("first_party")) {
                g5.q.h("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                return null;
            }
        }
        if (z3) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z9) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static c7.f e(Intent intent, String str) {
        if (intent == null) {
            h("BillingHelper", "Got null intent!");
            ba.r a10 = c7.f.a();
            a10.f3161u = 6;
            a10.f3163w = "An internal error occurred.";
            return a10.r();
        }
        ba.r a11 = c7.f.a();
        a11.f3161u = a(str, intent.getExtras());
        a11.f3163w = f(str, intent.getExtras());
        return a11.r();
    }

    public static String f(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        h(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (!str2.isEmpty()) {
                int i = 40000;
                while (!str2.isEmpty() && i > 0) {
                    int min = Math.min(str2.length(), Math.min(4000, i));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i -= min;
                }
                return;
            }
            Log.v(str, str2);
        }
    }

    public static void h(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Purchase j(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e) {
                h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return null;
            }
        }
        g("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
