package he;

import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f18029a;

    public a(List list) {
        this.f18029a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f18029a.equals(((a) obj).f18029a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18029a.hashCode();
    }

    public final String toString() {
        return "RecognitionResult: ".concat(String.valueOf(this.f18029a.toString()));
    }
}
