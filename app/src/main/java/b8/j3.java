package b8;
import a1.m;
import l.a;

import java.util.List;

/* loaded from: classes.dex */
public final class j3 {
    public static final i3 Companion = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final pe.g[] f2245b = {pe.a.c(pe.h.f22690u, new m(21))};

    /* renamed from: a, reason: collision with root package name */
    public final List f2246a;

    public /* synthetic */ j3(int i, List list) {
        if ((i & 1) == 0) {
            this.f2246a = qe.s.f24023u;
        } else {
            this.f2246a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j3) && kotlin.jvm.internal.a(this.f2246a, ((j3) obj).f2246a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2246a.hashCode();
    }

    public final String toString() {
        return "LocalCatalog(listings=" + this.f2246a + ")";
    }

    public j3(List list) {
        this.f2246a = list;
    }

    public /* synthetic */ j3() {
        this(qe.s.f24023u);
    }
}
