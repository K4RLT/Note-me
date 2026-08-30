package lb;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20211a = new HashMap();

    public final synchronized double a(String str) {
        Double d2 = (Double) this.f20211a.get(str);
        if (d2 == null) {
            return 0.0d;
        }
        return d2.doubleValue();
    }

    public final synchronized void b(String str) {
        this.f20211a.put(str, Double.valueOf(0.0d));
    }
}
