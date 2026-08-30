package q1;
import l.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends b0 implements Iterable, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final List f23321u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f23322v;

    public z(List list, ArrayList arrayList) {
        this.f23321u = list;
        this.f23322v = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof z)) {
                z zVar = (z) obj;
                if (kotlin.jvm.internal.a(this.f23321u, zVar.f23321u) && this.f23322v.equals(zVar.f23322v)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f23322v.hashCode() + ((this.f23321u.hashCode() + a.a(a.a(a.a(a.a(a.a(a.a(Float.hashCode(0.0f) * 31, 31, 0.0f), 31, 0.0f), 31, 1.0f), 31, 1.0f), 31, 0.0f), 31, 0.0f)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y(this);
    }
}
