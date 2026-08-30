package xa;
import u0.b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public final class j1 implements j0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30436u;

    public /* synthetic */ j1(int i) {
        this.f30436u = i;
    }

    @Override // xa.j0
    public final i0 a(z zVar, k2 k2Var) {
        Type genericComponentType;
        switch (this.f30436u) {
            case 0:
                Type type = k2Var.f30450b;
                if (!(type instanceof GenericArrayType)) {
                    if (type instanceof Class) {
                        Class cls = (Class) type;
                        if (cls.isArray()) {
                            genericComponentType = cls.getComponentType();
                        }
                    }
                    return null;
                }
                genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                return new k1(zVar.a(new k2(genericComponentType)), b(genericComponentType));
            case 1:
                if (k2Var.f30449a == Date.class) {
                    return new k1();
                }
                return null;
            case 2:
                Class cls2 = k2Var.f30449a;
                if (Enum.class.isAssignableFrom(cls2) && cls2 != Enum.class) {
                    if (!cls2.isEnum()) {
                        cls2 = cls2.getSuperclass();
                    }
                    return new n1(cls2);
                }
                return null;
            case 3:
                throw new AssertionError("Factory should not be used");
            case 4:
                if (k2Var.f30449a == java.sql.Date.class) {
                    return new h2(0);
                }
                return null;
            case 5:
                if (k2Var.f30449a == Time.class) {
                    return new h2(1);
                }
                return null;
            default:
                if (k2Var.f30449a == Timestamp.class) {
                    return new i2(zVar.a(new k2(Date.class)), 0);
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f30436u) {
            case 1:
                return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
            default:
                return super.toString();
        }
    }
}
