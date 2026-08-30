package qc;
import x.o;
import q.x;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public String f23971a;

    /* renamed from: b, reason: collision with root package name */
    public int f23972b;

    /* renamed from: c, reason: collision with root package name */
    public int f23973c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23974d;
    public byte e;

    public final z0 a() {
        String str;
        if (this.e == 7 && (str = this.f23971a) != null) {
            return new z0(str, this.f23974d, this.f23972b, this.f23973c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f23971a == null) {
            sb2.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }
}
