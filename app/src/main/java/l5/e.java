package l5;

/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final int f19918u;

    /* renamed from: v, reason: collision with root package name */
    public final int f19919v;

    /* renamed from: w, reason: collision with root package name */
    public final String f19920w;

    /* renamed from: x, reason: collision with root package name */
    public final String f19921x;

    public e(String str, int i, int i10, String str2) {
        str.getClass();
        str2.getClass();
        this.f19918u = i;
        this.f19919v = i10;
        this.f19920w = str;
        this.f19921x = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        eVar.getClass();
        int i = this.f19918u - eVar.f19918u;
        if (i == 0) {
            return this.f19919v - eVar.f19919v;
        }
        return i;
    }
}
