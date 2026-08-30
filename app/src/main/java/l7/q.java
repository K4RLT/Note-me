package l7;
import l.a;
import p.a;

import eg.p0;
import java.util.List;

/* loaded from: classes.dex */
public final class q {
    public static final p Companion = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final pe.g[] f20001d = {pe.a.c(pe.h.f22690u, new fg.o(10)), null, null};

    /* renamed from: a, reason: collision with root package name */
    public final List f20002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20003b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20004c;

    public /* synthetic */ q(int i, List list, int i10, float f10) {
        if (7 == (i & 7)) {
            this.f20002a = list;
            this.f20003b = i10;
            this.f20004c = f10;
            return;
        }
        p0.e(i, 7, o.f20000a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (kotlin.jvm.internal.a(this.f20002a, qVar.f20002a) && this.f20003b == qVar.f20003b && Float.compare(this.f20004c, qVar.f20004c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20004c) + a.b(this.f20003b, this.f20002a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "StrokePayload(pts=" + this.f20002a + ", color=" + this.f20003b + ", width=" + this.f20004c + ")";
    }
}
