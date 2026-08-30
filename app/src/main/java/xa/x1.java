package xa;
import x.o;
import g2.a;
import q.x;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class x1 extends t1 {
    public static final HashMap e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f30703b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f30704c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f30705d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        e = hashMap;
    }

    public x1(Class cls, w1 w1Var) {
        super(w1Var);
        this.f30705d = new HashMap();
        u0 u0Var = g2.f30419a;
        Constructor f10 = u0Var.f(cls);
        this.f30703b = f10;
        g2.d(f10);
        String[] C = u0Var.C(cls);
        for (int i = 0; i < C.length; i++) {
            this.f30705d.put(C[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f30703b.getParameterTypes();
        this.f30704c = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            this.f30704c[i10] = e.get(parameterTypes[i10]);
        }
    }

    @Override // xa.t1
    public final /* bridge */ /* synthetic */ Object c() {
        return (Object[]) this.f30704c.clone();
    }

    @Override // xa.t1
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f30703b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e8) {
            u0 u0Var = g2.f30419a;
            l4.a.k("Unexpected IllegalAccessException occurred (Gson 2.12.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e8);
            return null;
        } catch (IllegalArgumentException e10) {
            e = e10;
            l4.a.k(a.l("Failed to invoke constructor '", a(constructor), "' with args ", Arrays.toString(objArr)), e);
            return null;
        } catch (InstantiationException e11) {
            e = e11;
            l4.a.k(a.l("Failed to invoke constructor '", a(constructor), "' with args ", Arrays.toString(objArr)), e);
            return null;
        } catch (InvocationTargetException e12) {
            l4.a.k(a.l("Failed to invoke constructor '", a(constructor), "' with args ", Arrays.toString(objArr)), e12.getCause());
            return null;
        }
    }

    @Override // xa.t1
    public final void e(Object obj, l2 l2Var, s1 s1Var) {
        String str = s1Var.f30520b;
        Object[] objArr = (Object[]) obj;
        Integer num = (Integer) this.f30705d.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object a10 = s1Var.f30521c.a(l2Var);
            if (a10 == null && s1Var.f30522d) {
                throw new ab.b(a.l("null is not allowed as value for record component '", str, "' of primitive type; at path ", l2Var.h0(false)), 21);
            }
            objArr[intValue] = a10;
            return;
        }
        x.o(a5.a.h("Could not find the index in the constructor '", a(this.f30703b), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
    }
}
