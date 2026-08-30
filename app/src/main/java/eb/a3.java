package eb;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f16057b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16058a;

    public a3(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f16058a = hashMap2;
        hashMap2.putAll(hashMap);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            String str = f16057b[i];
            HashMap hashMap = this.f16058a;
            if (hashMap.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) hashMap.get(str));
            }
        }
        return sb2.toString();
    }

    public final int b() {
        try {
            String str = (String) this.f16058a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a3)) {
            return false;
        }
        return a().equalsIgnoreCase(((a3) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
