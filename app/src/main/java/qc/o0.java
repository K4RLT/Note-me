package qc;
import x.o;
import q.x;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public long f23887a;

    /* renamed from: b, reason: collision with root package name */
    public String f23888b;

    /* renamed from: c, reason: collision with root package name */
    public c2 f23889c;

    /* renamed from: d, reason: collision with root package name */
    public d2 f23890d;
    public e2 e;

    /* renamed from: f, reason: collision with root package name */
    public h2 f23891f;

    /* renamed from: g, reason: collision with root package name */
    public byte f23892g;

    public final p0 a() {
        String str;
        c2 c2Var;
        d2 d2Var;
        if (this.f23892g == 1 && (str = this.f23888b) != null && (c2Var = this.f23889c) != null && (d2Var = this.f23890d) != null) {
            return new p0(this.f23887a, str, c2Var, d2Var, this.e, this.f23891f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f23892g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f23888b == null) {
            sb2.append(" type");
        }
        if (this.f23889c == null) {
            sb2.append(" app");
        }
        if (this.f23890d == null) {
            sb2.append(" device");
        }
        x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }
}
