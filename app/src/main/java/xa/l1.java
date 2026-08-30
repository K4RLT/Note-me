package xa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes.dex */
public final class l1 implements j0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30454u;

    /* renamed from: v, reason: collision with root package name */
    public final n0 f30455v;

    public /* synthetic */ l1(n0 n0Var, int i) {
        this.f30454u = i;
        this.f30455v = n0Var;
    }

    @Override // xa.j0
    public final i0 a(z zVar, k2 k2Var) {
        Type[] typeArr;
        i0 i0Var;
        int i = this.f30454u;
        n0 n0Var = this.f30455v;
        Type type = Object.class;
        switch (i) {
            case 0:
                Type type2 = k2Var.f30450b;
                Class cls = k2Var.f30449a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                u0.k(Collection.class.isAssignableFrom(cls));
                Type K = u0.K(type2, cls, u0.J(type2, cls, Collection.class), new HashMap());
                if (K instanceof ParameterizedType) {
                    type = ((ParameterizedType) K).getActualTypeArguments()[0];
                }
                return new k1(new i2(zVar.a(new k2(type)), 4), n0Var.a(k2Var, false));
            default:
                Type type3 = k2Var.f30450b;
                Class cls2 = k2Var.f30449a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    typeArr = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    u0.k(Map.class.isAssignableFrom(cls2));
                    Type K2 = u0.K(type3, cls2, u0.J(type3, cls2, Map.class), new HashMap());
                    if (K2 instanceof ParameterizedType) {
                        typeArr = ((ParameterizedType) K2).getActualTypeArguments();
                    } else {
                        typeArr = new Type[]{type, type};
                    }
                }
                Type type4 = typeArr[0];
                Type type5 = typeArr[1];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    i0Var = zVar.a(new k2(type4));
                } else {
                    i0Var = c2.f30374c;
                }
                return new n1(this, new i2(i0Var, 4), new i2(zVar.a(new k2(type5)), 4), n0Var.a(k2Var, false));
        }
    }
}
