package d9;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15805a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15806b;

    public a(String str, boolean z3) {
        this.f15805a = str;
        this.f15806b = z3;
    }

    public final String toString() {
        String str = this.f15805a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
        sb2.append("{");
        sb2.append(str);
        sb2.append("}");
        sb2.append(this.f15806b);
        return sb2.toString();
    }
}
