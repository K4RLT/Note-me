package q;
import l.a;
import q.d1;

/* loaded from: classes.dex */
public final class e1 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22887a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22888b;

    public e1(Object obj, Object obj2) {
        this.f22887a = obj;
        this.f22888b = obj2;
    }

    @Override // d1
    public final Object a() {
        return this.f22887a;
    }

    @Override // d1
    public final Object c() {
        return this.f22888b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d1) {
            d1 d1Var = (d1) obj;
            if (kotlin.jvm.internal.a(this.f22887a, d1Var.a()) && kotlin.jvm.internal.a(this.f22888b, d1Var.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i10 = 0;
        Object obj = this.f22887a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i11 = i * 31;
        Object obj2 = this.f22888b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }
}
