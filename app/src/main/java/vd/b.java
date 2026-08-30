package vd;
import l.a;

import android.os.Build;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f27546a;

    /* renamed from: b, reason: collision with root package name */
    public final a f27547b;

    public b(String str, a aVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f27546a = str;
        this.f27547b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.a(this.f27546a, bVar.f27546a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!kotlin.jvm.internal.a(str2, str2) || !this.f27547b.equals(bVar.f27547b)) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f27547b.hashCode() + ((r.LOG_ENVIRONMENT_PROD.hashCode() + g3.a.e(Build.VERSION.RELEASE, (((Build.MODEL.hashCode() + (this.f27546a.hashCode() * 31)) * 31) + 47594041) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f27546a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.0.3, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + r.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f27547b + ')';
    }
}
