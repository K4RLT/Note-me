package f1;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f16643a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16644b;

    /* renamed from: c, reason: collision with root package name */
    public final f f16645c;

    /* renamed from: d, reason: collision with root package name */
    public final pd.c f16646d;

    public e(int i, long j10, f fVar, pd.c cVar) {
        this.f16643a = i;
        this.f16644b = j10;
        this.f16645c = fVar;
        this.f16646d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f16643a != eVar.f16643a || this.f16644b != eVar.f16644b || this.f16645c != eVar.f16645c || !l.a(this.f16646d, eVar.f16646d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f16645c.hashCode() + p.a.d(this.f16644b, Integer.hashCode(this.f16643a) * 31, 31)) * 31;
        pd.c cVar = this.f16646d;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f16643a + ", timestamp=" + this.f16644b + ", type=" + this.f16645c + ", structureCompat=" + this.f16646d + ')';
    }
}
