package m3;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f20585a;

    /* renamed from: b, reason: collision with root package name */
    public String f20586b;

    /* renamed from: c, reason: collision with root package name */
    public List f20587c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Objects.equals(this.f20585a, aVar.f20585a) && Objects.equals(this.f20586b, aVar.f20586b) && Objects.equals(this.f20587c, aVar.f20587c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20585a, this.f20586b, this.f20587c);
    }
}
