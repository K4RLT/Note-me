package ea;

import com.google.android.gms.internal.ads.mu;
import fa.y;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15997a;

    /* renamed from: b, reason: collision with root package name */
    public final mu f15998b;

    /* renamed from: c, reason: collision with root package name */
    public final da.b f15999c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16000d;

    public a(mu muVar, da.b bVar, String str) {
        this.f15998b = muVar;
        this.f15999c = bVar;
        this.f16000d = str;
        this.f15997a = Arrays.hashCode(new Object[]{muVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (y.l(this.f15998b, aVar.f15998b) && y.l(this.f15999c, aVar.f15999c) && y.l(this.f16000d, aVar.f16000d)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15997a;
    }
}
