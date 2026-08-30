package hd;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements gd.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18007b;

    public /* synthetic */ b(int i, Object obj) {
        this.f18006a = i;
        this.f18007b = obj;
    }

    @Override // gd.b
    public final Object get() {
        switch (this.f18006a) {
            case 0:
                return new id.b((bc.g) this.f18007b);
            case 1:
                String str = (String) this.f18007b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(p.a.k("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e8) {
                    throw new RuntimeException(p.a.k("Could not instantiate ", str, "."), e8);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException(g3.a.k("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(g3.a.k("Could not instantiate ", str), e11);
                }
            default:
                return (ComponentRegistrar) this.f18007b;
        }
    }
}
