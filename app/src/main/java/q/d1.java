package q;

/* loaded from: classes.dex */
public interface d1 {
    Object a();

    default boolean b(Object obj, Object obj2) {
        if (obj.equals(a()) && obj2.equals(c())) {
            return true;
        }
        return false;
    }

    Object c();
}
