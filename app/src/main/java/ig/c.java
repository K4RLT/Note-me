package ig;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18464a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18465b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18466c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18467d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18468f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18469g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18470h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f18471j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f18472k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18473l;

    /* renamed from: m, reason: collision with root package name */
    public String f18474m;

    public c(boolean z3, boolean z9, int i, int i10, boolean z10, boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, String str) {
        this.f18464a = z3;
        this.f18465b = z9;
        this.f18466c = i;
        this.f18467d = i10;
        this.e = z10;
        this.f18468f = z11;
        this.f18469g = z12;
        this.f18470h = i11;
        this.i = i12;
        this.f18471j = z13;
        this.f18472k = z14;
        this.f18473l = z15;
        this.f18474m = str;
    }

    public final String toString() {
        String sb2;
        String str = this.f18474m;
        if (str != null) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.f18464a) {
            sb3.append("no-cache, ");
        }
        if (this.f18465b) {
            sb3.append("no-store, ");
        }
        int i = this.f18466c;
        if (i != -1) {
            sb3.append("max-age=");
            sb3.append(i);
            sb3.append(", ");
        }
        int i10 = this.f18467d;
        if (i10 != -1) {
            sb3.append("s-maxage=");
            sb3.append(i10);
            sb3.append(", ");
        }
        if (this.e) {
            sb3.append("private, ");
        }
        if (this.f18468f) {
            sb3.append("public, ");
        }
        if (this.f18469g) {
            sb3.append("must-revalidate, ");
        }
        int i11 = this.f18470h;
        if (i11 != -1) {
            sb3.append("max-stale=");
            sb3.append(i11);
            sb3.append(", ");
        }
        int i12 = this.i;
        if (i12 != -1) {
            sb3.append("min-fresh=");
            sb3.append(i12);
            sb3.append(", ");
        }
        if (this.f18471j) {
            sb3.append("only-if-cached, ");
        }
        if (this.f18472k) {
            sb3.append("no-transform, ");
        }
        if (this.f18473l) {
            sb3.append("immutable, ");
        }
        if (sb3.length() == 0) {
            sb2 = "";
        } else {
            sb3.delete(sb3.length() - 2, sb3.length());
            sb2 = sb3.toString();
        }
        this.f18474m = sb2;
        return sb2;
    }
}
