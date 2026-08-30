package r7;
import l.a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final n f24624a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24625b;

    /* renamed from: c, reason: collision with root package name */
    public final c7.i f24626c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24627d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24628f;

    public g(n nVar, String str, c7.i iVar, String str2, long j10, String str3) {
        this.f24624a = nVar;
        this.f24625b = str;
        this.f24626c = iVar;
        this.f24627d = str2;
        this.e = j10;
        this.f24628f = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.f24624a != gVar.f24624a || !this.f24625b.equals(gVar.f24625b) || !this.f24626c.equals(gVar.f24626c) || !kotlin.jvm.internal.a(this.f24627d, gVar.f24627d) || this.e != gVar.e || !this.f24628f.equals(gVar.f24628f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int e = g3.a.e(this.f24626c.f3961a, g3.a.e(this.f24625b, this.f24624a.hashCode() * 31, 31), 31);
        String str = this.f24627d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f24628f.hashCode() + p.a.d(this.e, (e + hashCode) * 31, 31);
    }

    public final String toString() {
        return "Tip(tier=" + this.f24624a + ", price=" + this.f24625b + ", details=" + this.f24626c + ", offerToken=" + this.f24627d + ", priceMicros=" + this.e + ", currency=" + this.f24628f + ")";
    }
}
