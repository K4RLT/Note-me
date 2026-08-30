package l7;
import l.a;

import eg.p0;

/* loaded from: classes.dex */
public final class k {
    public static final j Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f19989a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19990b;

    public /* synthetic */ k(String str, int i, String str2) {
        if (3 == (i & 3)) {
            this.f19989a = str;
            this.f19990b = str2;
        } else {
            p0.e(i, 3, i.f19988a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kotlin.jvm.internal.a(this.f19989a, kVar.f19989a) && kotlin.jvm.internal.a(this.f19990b, kVar.f19990b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19990b.hashCode() + (this.f19989a.hashCode() * 31);
    }

    public final String toString() {
        return a5.a.h("PaperPayload(left=", this.f19989a, ", right=", this.f19990b, ")");
    }

    public k(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19989a = str;
        this.f19990b = str2;
    }
}
