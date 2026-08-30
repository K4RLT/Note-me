package b8;
import m.h;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2344a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2346c;

    public l1(String str) {
        str.getClass();
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.f2344a = upperCase;
        int abs = Math.abs(str.hashCode());
        this.f2345b = "15 mm × " + qe.h(5, 8, 10).get(abs % 3) + " m";
        this.f2346c = String.format("N.º %02d", Arrays.copyOf(new Object[]{Integer.valueOf((abs % 90) + 10)}, 1));
    }
}
