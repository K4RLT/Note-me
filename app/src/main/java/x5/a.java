package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.e;
import w7.i1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f30081a;

    /* renamed from: b, reason: collision with root package name */
    public final e f30082b;

    /* renamed from: c, reason: collision with root package name */
    public final e f30083c;

    public a(e eVar, e eVar2, e eVar3) {
        this.f30081a = eVar;
        this.f30082b = eVar2;
        this.f30083c = eVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f30083c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(i1.d(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
            eVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        e eVar = this.f30081a;
        Method method = (Method) eVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            eVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f30082b;
        Method method = (Method) eVar.get(name);
        if (method == null) {
            Class b10 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b10.getDeclaredMethod("write", cls, a.class);
            eVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((b) this).e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            l4.a.k("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e8) {
            l4.a.k("VersionedParcel encountered IllegalAccessException", e8);
            return null;
        } catch (NoSuchMethodException e10) {
            l4.a.k("VersionedParcel encountered NoSuchMethodException", e10);
            return null;
        } catch (InvocationTargetException e11) {
            if (!(e11.getCause() instanceof RuntimeException)) {
                l4.a.k("VersionedParcel encountered InvocationTargetException", e11);
                return null;
            }
            throw ((RuntimeException) e11.getCause());
        }
    }

    public abstract void h(int i);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).e.writeString(null);
            return;
        }
        try {
            ((b) this).e.writeString(b(cVar.getClass()).getName());
            b a10 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a10);
                Parcel parcel = a10.e;
                int i = a10.i;
                if (i >= 0) {
                    int i10 = a10.f30084d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(dataPosition - i10);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                l4.a.k("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e8) {
                l4.a.k("VersionedParcel encountered IllegalAccessException", e8);
            } catch (NoSuchMethodException e10) {
                l4.a.k("VersionedParcel encountered NoSuchMethodException", e10);
            } catch (InvocationTargetException e11) {
                if (!(e11.getCause() instanceof RuntimeException)) {
                    l4.a.k("VersionedParcel encountered InvocationTargetException", e11);
                    return;
                }
                throw ((RuntimeException) e11.getCause());
            }
        } catch (ClassNotFoundException e12) {
            l4.a.k(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e12);
        }
    }
}
