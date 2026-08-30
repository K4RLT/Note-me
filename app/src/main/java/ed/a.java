package ed;

import g5.q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16476a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16477b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16476a = str;
            this.f16477b = arrayList;
        } else {
            q.h("Null userAgent");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16476a.equals(aVar.f16476a) && this.f16477b.equals(aVar.f16477b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16476a.hashCode() ^ 1000003) * 1000003) ^ this.f16477b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16476a + ", usedDates=" + this.f16477b + "}";
    }
}
