package ya;

/* loaded from: classes.dex */
public abstract class de {
    public static androidx.lifecycle.u0 a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (androidx.lifecycle.u0) newInstance;
        } catch (IllegalAccessException e) {
            androidx.datastore.preferences.protobuf.s1.m("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e8) {
            androidx.datastore.preferences.protobuf.s1.m("Cannot create an instance of ", cls, e8);
            return null;
        } catch (NoSuchMethodException e10) {
            androidx.datastore.preferences.protobuf.s1.m("Cannot create an instance of ", cls, e10);
            return null;
        }
    }
}
