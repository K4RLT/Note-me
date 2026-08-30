package qc;
import q.x;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public String f23678a;

    /* renamed from: b, reason: collision with root package name */
    public String f23679b;

    /* renamed from: c, reason: collision with root package name */
    public int f23680c;

    /* renamed from: d, reason: collision with root package name */
    public String f23681d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public String f23682f;

    /* renamed from: g, reason: collision with root package name */
    public String f23683g;

    /* renamed from: h, reason: collision with root package name */
    public String f23684h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public l2 f23685j;

    /* renamed from: k, reason: collision with root package name */
    public r1 f23686k;

    /* renamed from: l, reason: collision with root package name */
    public o1 f23687l;

    /* renamed from: m, reason: collision with root package name */
    public byte f23688m;

    public final b0 a() {
        if (this.f23688m == 1 && this.f23678a != null && this.f23679b != null && this.f23681d != null && this.f23684h != null && this.i != null) {
            return new b0(this.f23678a, this.f23679b, this.f23680c, this.f23681d, this.e, this.f23682f, this.f23683g, this.f23684h, this.i, this.f23685j, this.f23686k, this.f23687l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f23678a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f23679b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f23688m) == 0) {
            sb2.append(" platform");
        }
        if (this.f23681d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f23684h == null) {
            sb2.append(" buildVersion");
        }
        if (this.i == null) {
            sb2.append(" displayVersion");
        }
        x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }
}
