package qc;
import q.x;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public long f23956a;

    /* renamed from: b, reason: collision with root package name */
    public String f23957b;

    /* renamed from: c, reason: collision with root package name */
    public String f23958c;

    /* renamed from: d, reason: collision with root package name */
    public long f23959d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public byte f23960f;

    public final x0 a() {
        String str;
        if (this.f23960f == 7 && (str = this.f23957b) != null) {
            return new x0(this.e, this.f23956a, this.f23959d, str, this.f23958c);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f23960f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f23957b == null) {
            sb2.append(" symbol");
        }
        if ((this.f23960f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f23960f & 4) == 0) {
            sb2.append(" importance");
        }
        x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }
}
