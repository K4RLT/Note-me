package u8;

import n8.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f27114a;

    /* renamed from: b, reason: collision with root package name */
    public final i f27115b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.h f27116c;

    public b(long j10, i iVar, n8.h hVar) {
        this.f27114a = j10;
        this.f27115b = iVar;
        this.f27116c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f27114a == bVar.f27114a && this.f27115b.equals(bVar.f27115b) && this.f27116c.equals(bVar.f27116c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f27114a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f27115b.hashCode()) * 1000003) ^ this.f27116c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f27114a + ", transportContext=" + this.f27115b + ", event=" + this.f27116c + "}";
    }
}
