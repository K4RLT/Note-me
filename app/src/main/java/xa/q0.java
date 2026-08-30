package xa;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q0 implements GenericArrayType, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Type f30504u;

    public q0(Type type) {
        Objects.requireNonNull(type);
        this.f30504u = u0.v(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && u0.I(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f30504u;
    }

    public final int hashCode() {
        return this.f30504u.hashCode();
    }

    public final String toString() {
        return String.valueOf(u0.o(this.f30504u)).concat("[]");
    }
}
