package u7;
import l.a;
import u7.a8;

/* loaded from: classes.dex */
public final class y7 extends a8 {

    /* renamed from: a, reason: collision with root package name */
    public final c f27074a;

    public y7(c cVar) {
        cVar.getClass();
        this.f27074a = cVar;
    }

    @Override // a8
    public final String a() {
        return this.f27074a.f25969a;
    }

    @Override // a8
    public final boolean b() {
        return this.f27074a.f25981o;
    }

    @Override // a8
    public final boolean c() {
        return this.f27074a.f25980n;
    }

    @Override // a8
    public final int d() {
        return this.f27074a.f25979m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y7) && kotlin.jvm.internal.a(this.f27074a, ((y7) obj).f27074a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27074a.hashCode();
    }

    public final String toString() {
        return "Shp(shape=" + this.f27074a + ")";
    }
}
