package xa;
import x.n;
import q.x;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r0 implements ParameterizedType, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Type f30511u;

    /* renamed from: v, reason: collision with root package name */
    public final Type f30512v;

    /* renamed from: w, reason: collision with root package name */
    public final Type[] f30513w;

    public r0(Type type, Class cls, Type... typeArr) {
        Type v2;
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            x.n("Must specify owner type for ".concat(String.valueOf(cls)));
            throw null;
        }
        if (type == null) {
            v2 = null;
        } else {
            v2 = u0.v(type);
        }
        this.f30511u = v2;
        this.f30512v = u0.v(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f30513w = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f30513w[i]);
            u0.H(this.f30513w[i]);
            Type[] typeArr3 = this.f30513w;
            typeArr3[i] = u0.v(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && u0.I(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f30513w.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f30511u;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f30512v;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.f30513w) ^ this.f30512v.hashCode();
        Type type = this.f30511u;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        Type[] typeArr = this.f30513w;
        int length = typeArr.length;
        Type type = this.f30512v;
        if (length == 0) {
            return u0.o(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(u0.o(type));
        sb2.append("<");
        sb2.append(u0.o(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb2.append(", ");
            sb2.append(u0.o(typeArr[i]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
