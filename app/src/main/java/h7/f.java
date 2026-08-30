package h7;
import l.a;

import eg.p0;
import fg.o;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final pe.g[] f17882c = {null, pe.a.c(pe.h.f22690u, new o(5))};

    /* renamed from: a, reason: collision with root package name */
    public final k7.f f17883a;

    /* renamed from: b, reason: collision with root package name */
    public final List f17884b;

    public /* synthetic */ f(int i, k7.f fVar, List list) {
        if (3 == (i & 3)) {
            this.f17883a = fVar;
            this.f17884b = list;
        } else {
            p0.e(i, 3, d.f17881a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (kotlin.jvm.internal.a(this.f17883a, fVar.f17883a) && kotlin.jvm.internal.a(this.f17884b, fVar.f17884b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17884b.hashCode() + (this.f17883a.hashCode() * 31);
    }

    public final String toString() {
        return "ScrapDataDump(notebook=" + this.f17883a + ", elements=" + this.f17884b + ")";
    }

    public f(k7.f fVar, List list) {
        this.f17883a = fVar;
        this.f17884b = list;
    }
}
