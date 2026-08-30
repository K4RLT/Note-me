package xa;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f2 extends u0 {

    /* renamed from: b, reason: collision with root package name */
    public final Method f30413b = Class.class.getMethod("isRecord", null);

    /* renamed from: c, reason: collision with root package name */
    public final Method f30414c = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: d, reason: collision with root package name */
    public final Method f30415d;
    public final Method e;

    public /* synthetic */ f2() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f30415d = cls.getMethod("getName", null);
        this.e = cls.getMethod("getType", null);
    }

    @Override // xa.u0
    public final String[] C(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f30414c.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f30415d.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            l4.a.k("Unexpected ReflectiveOperationException occurred (Gson 2.12.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // xa.u0
    public final Constructor f(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f30414c.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.e.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            l4.a.k("Unexpected ReflectiveOperationException occurred (Gson 2.12.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // xa.u0
    public final Method p(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            l4.a.k("Unexpected ReflectiveOperationException occurred (Gson 2.12.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // xa.u0
    public final boolean z(Class cls) {
        try {
            return ((Boolean) this.f30413b.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            l4.a.k("Unexpected ReflectiveOperationException occurred (Gson 2.12.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }
}
