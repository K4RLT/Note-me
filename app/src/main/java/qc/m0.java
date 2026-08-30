package qc;
import x.o;
import q.x;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f23861a;

    /* renamed from: b, reason: collision with root package name */
    public String f23862b;

    /* renamed from: c, reason: collision with root package name */
    public int f23863c;

    /* renamed from: d, reason: collision with root package name */
    public long f23864d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23865f;

    /* renamed from: g, reason: collision with root package name */
    public int f23866g;

    /* renamed from: h, reason: collision with root package name */
    public String f23867h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public byte f23868j;

    public final n0 a() {
        String str;
        String str2;
        String str3;
        if (this.f23868j == 63 && (str = this.f23862b) != null && (str2 = this.f23867h) != null && (str3 = this.i) != null) {
            return new n0(this.f23861a, str, this.f23863c, this.f23864d, this.e, this.f23865f, this.f23866g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f23868j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f23862b == null) {
            sb2.append(" model");
        }
        if ((this.f23868j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f23868j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f23868j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f23868j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f23868j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f23867h == null) {
            sb2.append(" manufacturer");
        }
        if (this.i == null) {
            sb2.append(" modelClass");
        }
        x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }
}
