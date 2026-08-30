package xa;
import u0.b;

import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f30449a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f30450b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30451c;

    public k2(Type type) {
        Objects.requireNonNull(type);
        Type v2 = u0.v(type);
        this.f30450b = v2;
        this.f30449a = b(v2);
        this.f30451c = v2.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k2) {
            if (u0.I(this.f30450b, ((k2) obj).f30450b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30451c;
    }

    public final String toString() {
        return u0.o(this.f30450b);
    }
}
