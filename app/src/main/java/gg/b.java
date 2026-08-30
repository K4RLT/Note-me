package gg;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17760a;

    static {
        Object kVar;
        int i;
        Object obj = null;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                kVar = mf.m.k(10, property);
            } else {
                kVar = null;
            }
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        if (!(kVar instanceof pe.k)) {
            obj = kVar;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        f17760a = i;
    }
}
