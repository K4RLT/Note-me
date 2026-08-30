package qb;

import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f23656a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23657b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23658c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f23659d;

    public m(String str, String str2, HashMap hashMap, IBinder iBinder) {
        this.f23656a = str;
        this.f23657b = str2;
        this.f23658c = hashMap;
        this.f23659d = iBinder;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (this.f23656a.equals(mVar.f23656a) && this.f23657b.equals(mVar.f23657b) && this.f23658c.equals(mVar.f23658c)) {
                    IBinder iBinder = mVar.f23659d;
                    IBinder iBinder2 = this.f23659d;
                    if (iBinder2 == null) {
                        if (iBinder == null) {
                            return true;
                        }
                        return false;
                    }
                    if (iBinder2.equals(iBinder)) {
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
        int hashCode;
        int hashCode2 = ((((this.f23656a.hashCode() ^ 1000003) * 1000003) ^ this.f23657b.hashCode()) * 1000003) ^ this.f23658c.hashCode();
        IBinder iBinder = this.f23659d;
        if (iBinder == null) {
            hashCode = 0;
        } else {
            hashCode = iBinder.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        String obj = this.f23658c.toString();
        String valueOf = String.valueOf(this.f23659d);
        StringBuilder sb2 = new StringBuilder("HsdpPrewarmRequest{targetAppPackageName=");
        sb2.append(this.f23656a);
        sb2.append(", referrer=");
        g3.a.t(sb2, this.f23657b, ", extraQueryParams=", obj, ", windowToken=");
        return a5.a.k(sb2, valueOf, "}");
    }
}
