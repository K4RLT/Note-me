package j4;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f18896a;

    /* renamed from: b, reason: collision with root package name */
    public e f18897b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18898c;

    public b(a aVar, boolean z3) {
        this.f18896a = aVar;
        this.f18898c = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!this.f18896a.equals(bVar.f18896a) || !l.a(this.f18897b, bVar.f18897b) || this.f18898c != bVar.f18898c) {
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
        int hashCode2 = this.f18896a.hashCode() * 31;
        e eVar = this.f18897b;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        return Boolean.hashCode(this.f18898c) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "Entry(bufferProvider=" + this.f18896a + ", releaseFence=" + this.f18897b + ", isAvailable=" + this.f18898c + ')';
    }
}
