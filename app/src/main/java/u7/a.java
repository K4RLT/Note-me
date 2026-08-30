package u7;

import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f25881a = qe.m.g(new q1(0, 0, 31));

    public static final int a(int i) {
        return i * 2;
    }

    public static final int b(int i) {
        return (i * 2) + 1;
    }

    public static final Integer c(String str) {
        str.getClass();
        if (str.equals("ink")) {
            return 0;
        }
        if (str.startsWith("ink:")) {
            return mf.m.k(10, mf.f.z(str, "ink:"));
        }
        return null;
    }
}
