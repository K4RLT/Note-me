package u6;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25873a;

    /* renamed from: b, reason: collision with root package name */
    public final char f25874b;

    /* renamed from: c, reason: collision with root package name */
    public final double f25875c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25876d;
    public final String e;

    public d(ArrayList arrayList, char c10, double d2, String str, String str2) {
        this.f25873a = arrayList;
        this.f25874b = c10;
        this.f25875c = d2;
        this.f25876d = str;
        this.e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + g3.a.e(str, c10 * 31, 31);
    }

    public final int hashCode() {
        return a(this.f25874b, this.e, this.f25876d);
    }
}
