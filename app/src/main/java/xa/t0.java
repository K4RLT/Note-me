package xa;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t0 implements WildcardType, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Type f30535u;

    /* renamed from: v, reason: collision with root package name */
    public final Type f30536v;

    public t0(Type[] typeArr, Type[] typeArr2) {
        boolean z3;
        boolean z9;
        int length = typeArr2.length;
        if (length <= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        u0.k(z3);
        if (typeArr.length == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        u0.k(z9);
        if (length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            u0.H(typeArr2[0]);
            u0.k(typeArr[0] == Object.class);
            this.f30536v = u0.v(typeArr2[0]);
            this.f30535u = Object.class;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        u0.H(typeArr[0]);
        this.f30536v = null;
        this.f30535u = u0.v(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && u0.I(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f30536v;
        if (type != null) {
            return new Type[]{type};
        }
        return u0.f30685a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f30535u};
    }

    public final int hashCode() {
        int i;
        Type type = this.f30536v;
        if (type != null) {
            i = type.hashCode() + 31;
        } else {
            i = 1;
        }
        return i ^ (this.f30535u.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f30536v;
        if (type != null) {
            return "? super ".concat(String.valueOf(u0.o(type)));
        }
        Type type2 = this.f30535u;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends ".concat(String.valueOf(u0.o(type2)));
    }
}
