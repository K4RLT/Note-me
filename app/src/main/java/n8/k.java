package n8;
import q.h;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final k8.c f21190a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f21191b;

    public k(k8.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f21190a = cVar;
                this.f21191b = bArr;
                return;
            } else {
                g5.h("bytes is null");
                throw null;
            }
        }
        g5.h("encoding is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.f21190a.equals(kVar.f21190a)) {
            return false;
        }
        return Arrays.equals(this.f21191b, kVar.f21191b);
    }

    public final int hashCode() {
        return ((this.f21190a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21191b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f21190a + ", bytes=[...]}";
    }
}
