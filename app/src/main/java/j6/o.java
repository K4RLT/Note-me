package j6;
import d.b;
import l.a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f18942a;

    /* renamed from: b, reason: collision with root package name */
    public int f18943b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (!kotlin.jvm.internal.a(this.f18942a, oVar.f18942a) || this.f18943b != oVar.f18943b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return q0.b(this.f18943b) + (this.f18942a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f18942a + ", state=" + a5.a.y(this.f18943b) + ')';
    }
}
