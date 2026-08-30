package t8;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final w8.a f25663a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f25664b;

    public a(w8.a aVar, HashMap hashMap) {
        this.f25663a = aVar;
        this.f25664b = hashMap;
    }

    public final long a(k8.d dVar, long j10, int i) {
        long j11;
        long e = j10 - this.f25663a.e();
        b bVar = (b) this.f25664b.get(dVar);
        long j12 = bVar.f25665a;
        int i10 = i - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i10))), e), bVar.f25666b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f25663a.equals(aVar.f25663a) && this.f25664b.equals(aVar.f25664b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f25663a.hashCode() ^ 1000003) * 1000003) ^ this.f25664b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f25663a + ", values=" + this.f25664b + "}";
    }
}
