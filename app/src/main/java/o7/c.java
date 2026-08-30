package o7;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f21854a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21855b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21856c;

    public c(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.f21854a = str;
        this.f21855b = str2;
        this.f21856c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (l.a(this.f21854a, cVar.f21854a) && l.a(this.f21855b, cVar.f21855b) && this.f21856c == cVar.f21856c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21856c) + g3.a.e(this.f21855b, this.f21854a.hashCode() * 31, 31);
    }

    public final String toString() {
        return p.a.j(this.f21856c, ")", p.a.q("Stack(id=", this.f21854a, ", title=", this.f21855b, ", orderIndex="));
    }
}
