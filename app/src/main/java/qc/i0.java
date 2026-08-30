package qc;
import q.x;

import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public String f23794a;

    /* renamed from: b, reason: collision with root package name */
    public String f23795b;

    /* renamed from: c, reason: collision with root package name */
    public String f23796c;

    /* renamed from: d, reason: collision with root package name */
    public long f23797d;
    public Long e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23798f;

    /* renamed from: g, reason: collision with root package name */
    public t1 f23799g;

    /* renamed from: h, reason: collision with root package name */
    public k2 f23800h;
    public j2 i;

    /* renamed from: j, reason: collision with root package name */
    public u1 f23801j;

    /* renamed from: k, reason: collision with root package name */
    public List f23802k;

    /* renamed from: l, reason: collision with root package name */
    public int f23803l;

    /* renamed from: m, reason: collision with root package name */
    public byte f23804m;

    public final j0 a() {
        String str;
        String str2;
        t1 t1Var;
        if (this.f23804m == 7 && (str = this.f23794a) != null && (str2 = this.f23795b) != null && (t1Var = this.f23799g) != null) {
            return new j0(str, str2, this.f23796c, this.f23797d, this.e, this.f23798f, t1Var, this.f23800h, this.i, this.f23801j, this.f23802k, this.f23803l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f23794a == null) {
            sb2.append(" generator");
        }
        if (this.f23795b == null) {
            sb2.append(" identifier");
        }
        if ((this.f23804m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f23804m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f23799g == null) {
            sb2.append(" app");
        }
        if ((this.f23804m & 4) == 0) {
            sb2.append(" generatorType");
        }
        x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }
}
