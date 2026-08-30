package b0;
import w.a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f1196a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1197b;

    /* renamed from: c, reason: collision with root package name */
    public final r f1198c;

    public i(int i, int i10, r rVar) {
        this.f1196a = i;
        this.f1197b = i10;
        this.f1198c = rVar;
        if (i < 0) {
            a.a("startIndex should be >= 0");
        }
        if (i10 > 0) {
            return;
        }
        a.a("size should be > 0");
    }
}
