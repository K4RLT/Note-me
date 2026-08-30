package b8;
import a1.m;
import b8.o0;
import l.a;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p0 {
    public static final o0 Companion = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final pe.g[] f2505c;

    /* renamed from: a, reason: collision with root package name */
    public final List f2506a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2507b;

    /* JADX WARN: Type inference failed for: r0v0, types: [o0, java.lang.Object] */
    static {
        m mVar = new m(19);
        pe.h hVar = pe.h.f22690u;
        f2505c = new pe.g[]{pe.a.c(hVar, mVar), pe.a.c(hVar, new m(20))};
    }

    public /* synthetic */ p0(int i, List list, Map map) {
        this.f2506a = (i & 1) == 0 ? qe.s.f24023u : list;
        if ((i & 2) == 0) {
            this.f2507b = qe.t.f24024u;
        } else {
            this.f2507b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (kotlin.jvm.internal.a(this.f2506a, p0Var.f2506a) && kotlin.jvm.internal.a(this.f2507b, p0Var.f2507b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2507b.hashCode() + (this.f2506a.hashCode() * 31);
    }

    public final String toString() {
        return "Store(pending=" + this.f2506a + ", issued=" + this.f2507b + ")";
    }

    public p0(List list, Map map) {
        list.getClass();
        map.getClass();
        this.f2506a = list;
        this.f2507b = map;
    }

    public /* synthetic */ p0() {
        this(qe.s.f24023u, qe.t.f24024u);
    }
}
