package p7;
import l.a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f22431a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22432b;

    /* renamed from: c, reason: collision with root package name */
    public final b f22433c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22434d;

    public c(String str, String str2, b bVar, String str3, int i) {
        str3 = (i & 8) != 0 ? null : str3;
        bVar.getClass();
        this.f22431a = str;
        this.f22432b = str2;
        this.f22433c = bVar;
        this.f22434d = str3;
    }

    public final String a() {
        return this.f22434d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!kotlin.jvm.internal.a(this.f22431a, cVar.f22431a) || !kotlin.jvm.internal.a(this.f22432b, cVar.f22432b) || this.f22433c != cVar.f22433c || !kotlin.jvm.internal.a(this.f22434d, cVar.f22434d)) {
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
        int hashCode2 = (this.f22433c.hashCode() + g3.a.e(this.f22432b, this.f22431a.hashCode() * 31, 31)) * 31;
        String str = this.f22434d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode2 + hashCode) * 31;
    }

    public final String toString() {
        StringBuilder q10 = a.q("FontOption(id=", this.f22431a, ", displayName=", this.f22432b, ", category=");
        q10.append(this.f22433c);
        q10.append(", googleQuery=");
        q10.append(this.f22434d);
        q10.append(", asset=null)");
        return q10.toString();
    }
}
