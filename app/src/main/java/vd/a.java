package vd;
import l.a;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f27538a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27539b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27540c;

    /* renamed from: d, reason: collision with root package name */
    public final s f27541d;
    public final ArrayList e;

    public a(String str, String str2, String str3, s sVar, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f27538a = str;
        this.f27539b = str2;
        this.f27540c = str3;
        this.f27541d = sVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f27538a.equals(aVar.f27538a) && kotlin.jvm.internal.l.a(this.f27539b, aVar.f27539b) && kotlin.jvm.internal.l.a(this.f27540c, aVar.f27540c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.l.a(str, str) || !this.f27541d.equals(aVar.f27541d) || !this.e.equals(aVar.e)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.f27541d.hashCode() + g3.a.e(Build.MANUFACTURER, g3.a.e(this.f27540c, g3.a.e(this.f27539b, this.f27538a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f27538a + ", versionName=" + this.f27539b + ", appBuildVersion=" + this.f27540c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f27541d + ", appProcessDetails=" + this.e + ')';
    }
}
