package r;
import k1.a;
import k1.f;
import k1.h;
import m1.b;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public f f24096a = null;

    /* renamed from: b, reason: collision with root package name */
    public a f24097b = null;

    /* renamed from: c, reason: collision with root package name */
    public b f24098c = null;

    /* renamed from: d, reason: collision with root package name */
    public h f24099d = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (!kotlin.jvm.internal.a(this.f24096a, jVar.f24096a) || !kotlin.jvm.internal.a(this.f24097b, jVar.f24097b) || !kotlin.jvm.internal.a(this.f24098c, jVar.f24098c) || !kotlin.jvm.internal.a(this.f24099d, jVar.f24099d)) {
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
        int hashCode2;
        int hashCode3;
        f fVar = this.f24096a;
        int i = 0;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        int i10 = hashCode * 31;
        a aVar = this.f24097b;
        if (aVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        b bVar = this.f24098c;
        if (bVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bVar.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        h hVar = this.f24099d;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return i12 + i;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f24096a + ", canvas=" + this.f24097b + ", canvasDrawScope=" + this.f24098c + ", borderPath=" + this.f24099d + ')';
    }
}
