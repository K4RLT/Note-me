package k8;

import g5.q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19621a;

    /* renamed from: b, reason: collision with root package name */
    public final d f19622b;

    /* renamed from: c, reason: collision with root package name */
    public final b f19623c;

    public a(Object obj, d dVar, b bVar) {
        if (obj != null) {
            this.f19621a = obj;
            this.f19622b = dVar;
            this.f19623c = bVar;
            return;
        }
        q.h("Null payload");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f19621a.equals(aVar.f19621a) && this.f19622b.equals(aVar.f19622b)) {
                    b bVar = aVar.f19623c;
                    b bVar2 = this.f19623c;
                    if (bVar2 == null) {
                        if (bVar == null) {
                            return true;
                        }
                        return false;
                    }
                    if (bVar2.equals(bVar)) {
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
        int hashCode2 = ((((1000003 * 1000003) ^ this.f19621a.hashCode()) * 1000003) ^ this.f19622b.hashCode()) * 1000003;
        b bVar = this.f19623c;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return (hashCode2 ^ hashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f19621a + ", priority=" + this.f19622b + ", productData=" + this.f19623c + ", eventContext=null}";
    }
}
