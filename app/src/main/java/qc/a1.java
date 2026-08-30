package qc;
import x.o;
import q.x;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public Double f23689a;

    /* renamed from: b, reason: collision with root package name */
    public int f23690b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23691c;

    /* renamed from: d, reason: collision with root package name */
    public int f23692d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f23693f;

    /* renamed from: g, reason: collision with root package name */
    public byte f23694g;

    public final b1 a() {
        if (this.f23694g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f23694g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f23694g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f23694g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f23694g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f23694g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            x.o(g3.a.l("Missing required properties:", sb2));
            return null;
        }
        return new b1(this.f23689a, this.f23690b, this.f23691c, this.f23692d, this.e, this.f23693f);
    }
}
