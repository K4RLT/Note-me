package ud;

import q.x;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f27181a;

    /* renamed from: b, reason: collision with root package name */
    public String f27182b;

    /* renamed from: c, reason: collision with root package name */
    public String f27183c;

    /* renamed from: d, reason: collision with root package name */
    public String f27184d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public byte f27185f;

    public final c a() {
        if (this.f27185f == 1 && this.f27181a != null && this.f27182b != null && this.f27183c != null && this.f27184d != null) {
            return new c(this.f27181a, this.f27182b, this.f27183c, this.f27184d, this.e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f27181a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f27182b == null) {
            sb2.append(" variantId");
        }
        if (this.f27183c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f27184d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f27185f) == 0) {
            sb2.append(" templateVersion");
        }
        x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }
}
