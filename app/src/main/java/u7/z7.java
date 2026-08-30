package u7;
import l.a;
import u7.a8;

/* loaded from: classes.dex */
public final class z7 extends a8 {

    /* renamed from: a, reason: collision with root package name */
    public final d f27108a;

    public z7(d dVar) {
        dVar.getClass();
        this.f27108a = dVar;
    }

    @Override // a8
    public final String a() {
        return this.f27108a.f26033a;
    }

    @Override // a8
    public final boolean b() {
        return this.f27108a.f26042l;
    }

    @Override // a8
    public final boolean c() {
        return this.f27108a.f26041k;
    }

    @Override // a8
    public final int d() {
        return this.f27108a.f26040j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z7) && kotlin.jvm.internal.a(this.f27108a, ((z7) obj).f27108a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27108a.hashCode();
    }

    public final String toString() {
        return "Txt(text=" + this.f27108a + ")";
    }
}
