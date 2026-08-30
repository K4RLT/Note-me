package l7;
import l.a;

/* loaded from: classes.dex */
public final class h {
    public static final g Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19984a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19985b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19986c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19987d;

    public /* synthetic */ h(int i, int i10, String str, boolean z3, boolean z9) {
        this.f19984a = (i & 1) == 0 ? true : z3;
        if ((i & 2) == 0) {
            this.f19985b = false;
        } else {
            this.f19985b = z9;
        }
        this.f19986c = (i & 4) == 0 ? null : str;
        if ((i & 8) == 0) {
            this.f19987d = 0;
        } else {
            this.f19987d = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f19984a == hVar.f19984a && this.f19985b == hVar.f19985b && kotlin.jvm.internal.a(this.f19986c, hVar.f19986c) && this.f19987d == hVar.f19987d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c10 = a.c(Boolean.hashCode(this.f19984a) * 31, 31, this.f19985b);
        String str = this.f19986c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.f19987d) + ((c10 + hashCode) * 31);
    }

    public final String toString() {
        return "InkMetaPayload(visible=" + this.f19984a + ", locked=" + this.f19985b + ", name=" + this.f19986c + ", slot=" + this.f19987d + ")";
    }

    public h(boolean z3, boolean z9, String str, int i) {
        this.f19984a = z3;
        this.f19985b = z9;
        this.f19986c = str;
        this.f19987d = i;
    }
}
