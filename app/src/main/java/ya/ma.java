package ya;

import android.content.Intent;
import android.net.Uri;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ma {
    public static Intent a(String str, String str2, Map map) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").appendQueryParameter(FacebookMediationAdapter.KEY_ID, str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals(FacebookMediationAdapter.KEY_ID) && !str3.equals("referrer")) {
                    appendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    public static Intent b(String str, String str2, String str3, HashMap hashMap) {
        Intent intent = new Intent("android.intent.action.VIEW", c(str, str2, hashMap));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    public static Uri c(String str, String str2, HashMap hashMap) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("d").appendQueryParameter(FacebookMediationAdapter.KEY_ID, str).appendQueryParameter("referrer", str2);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            if (!str3.equals(FacebookMediationAdapter.KEY_ID) && !str3.equals("referrer")) {
                appendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
            }
        }
        return appendQueryParameter.build();
    }
}
