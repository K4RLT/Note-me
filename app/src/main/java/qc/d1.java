package qc;
import q.x;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public f1 f23748a;

    /* renamed from: b, reason: collision with root package name */
    public String f23749b;

    /* renamed from: c, reason: collision with root package name */
    public String f23750c;

    /* renamed from: d, reason: collision with root package name */
    public long f23751d;
    public byte e;

    public final e1 a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.e == 1 && (f1Var = this.f23748a) != null && (str = this.f23749b) != null && (str2 = this.f23750c) != null) {
            return new e1(f1Var, str, str2, this.f23751d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f23748a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f23749b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f23750c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb2.append(" templateVersion");
        }
        x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }
}
