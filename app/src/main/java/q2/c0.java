package q2;
import l.a;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f23336a;

    /* renamed from: b, reason: collision with root package name */
    public final s f23337b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23338c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23339d;
    public final Object e;

    public c0(i iVar, s sVar, int i, int i10, Object obj) {
        this.f23336a = iVar;
        this.f23337b = sVar;
        this.f23338c = i;
        this.f23339d = i10;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (kotlin.jvm.internal.a(this.f23336a, c0Var.f23336a) && kotlin.jvm.internal.a(this.f23337b, c0Var.f23337b) && this.f23338c == c0Var.f23338c && this.f23339d == c0Var.f23339d && kotlin.jvm.internal.a(this.e, c0Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        i iVar = this.f23336a;
        if (iVar == null) {
            hashCode = 0;
        } else {
            hashCode = iVar.hashCode();
        }
        int b10 = a.b(this.f23339d, a.b(this.f23338c, ((hashCode * 31) + this.f23337b.f23369u) * 31, 31), 31);
        Object obj = this.e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return b10 + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f23336a);
        sb2.append(", fontWeight=");
        sb2.append(this.f23337b);
        sb2.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.f23338c;
        if (i == 0) {
            str = "Normal";
        } else if (i != 1) {
            str = "Invalid";
        } else {
            str = "Italic";
        }
        sb2.append((Object) str);
        sb2.append(", fontSynthesis=");
        int i10 = this.f23339d;
        if (i10 == 0) {
            str2 = "None";
        } else if (i10 == 1) {
            str2 = "Weight";
        } else if (i10 == 2) {
            str2 = "Style";
        } else if (i10 == 65535) {
            str2 = "All";
        }
        sb2.append((Object) str2);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.e);
        sb2.append(')');
        return sb2.toString();
    }
}
