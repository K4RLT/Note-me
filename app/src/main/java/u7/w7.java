package u7;
import l.a;
import u7.a8;

/* loaded from: classes.dex */
public final class w7 extends a8 {

    /* renamed from: a, reason: collision with root package name */
    public final b f27004a;

    public w7(b bVar) {
        bVar.getClass();
        this.f27004a = bVar;
    }

    @Override // a8
    public final String a() {
        return this.f27004a.f25917a;
    }

    @Override // a8
    public final boolean b() {
        return this.f27004a.f25924j;
    }

    @Override // a8
    public final boolean c() {
        return this.f27004a.i;
    }

    @Override // a8
    public final int d() {
        return this.f27004a.f25923h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w7) && kotlin.jvm.internal.a(this.f27004a, ((w7) obj).f27004a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27004a.hashCode();
    }

    public final String toString() {
        return "Img(image=" + this.f27004a + ")";
    }
}
