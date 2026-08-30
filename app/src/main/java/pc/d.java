package pc;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22652a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f22653b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f22654c;

    public d(int i) {
        this.f22654c = i;
    }

    public final synchronized boolean a(String str) {
        boolean equals;
        String str2 = "com.crashlytics.version-control-info";
        synchronized (this) {
            int i = this.f22654c;
            if (36 > i) {
                str2 = "com.crashlytics.version-control-info".substring(0, i);
            }
            if (this.f22652a.size() >= this.f22653b && !this.f22652a.containsKey(str2)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f22653b, null);
                return false;
            }
            int i10 = this.f22654c;
            String trim = str.trim();
            if (trim.length() > i10) {
                trim = trim.substring(0, i10);
            }
            String str3 = (String) this.f22652a.get(str2);
            if (str3 == null) {
                equals = false;
            } else {
                equals = str3.equals(trim);
            }
            if (equals) {
                return false;
            }
            this.f22652a.put(str2, trim);
            return true;
        }
    }

    public final synchronized void b(Map map) {
        String trim;
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    int i10 = this.f22654c;
                    String trim2 = str.trim();
                    if (trim2.length() > i10) {
                        trim2 = trim2.substring(0, i10);
                    }
                    if (this.f22652a.size() >= this.f22653b && !this.f22652a.containsKey(trim2)) {
                        i++;
                    }
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.f22652a;
                    if (str2 == null) {
                        trim = "";
                    } else {
                        int i11 = this.f22654c;
                        trim = str2.trim();
                        if (trim.length() > i11) {
                            trim = trim.substring(0, i11);
                        }
                    }
                    hashMap.put(trim2, trim);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f22653b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
