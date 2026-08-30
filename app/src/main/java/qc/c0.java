package qc;
import x.o;
import q.x;

import java.util.List;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f23721a;

    /* renamed from: b, reason: collision with root package name */
    public String f23722b;

    /* renamed from: c, reason: collision with root package name */
    public int f23723c;

    /* renamed from: d, reason: collision with root package name */
    public int f23724d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f23725f;

    /* renamed from: g, reason: collision with root package name */
    public long f23726g;

    /* renamed from: h, reason: collision with root package name */
    public String f23727h;
    public List i;

    /* renamed from: j, reason: collision with root package name */
    public byte f23728j;

    public final d0 a() {
        String str;
        if (this.f23728j == 63 && (str = this.f23722b) != null) {
            return new d0(this.f23721a, str, this.f23723c, this.f23724d, this.e, this.f23725f, this.f23726g, this.f23727h, this.i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f23728j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f23722b == null) {
            sb2.append(" processName");
        }
        if ((this.f23728j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f23728j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f23728j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f23728j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f23728j & 32) == 0) {
            sb2.append(" timestamp");
        }
        x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }
}
