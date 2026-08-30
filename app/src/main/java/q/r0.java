package q;
import l.a;
import q.k;

/* loaded from: classes.dex */
public final class r0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final float f22974a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22975b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22976c;

    public r0(float f10, float f11, Object obj) {
        this.f22974a = f10;
        this.f22975b = f11;
        this.f22976c = obj;
    }

    @Override // k
    public final n1 a(l1 l1Var) {
        q qVar;
        Object obj = this.f22976c;
        if (obj == null) {
            qVar = null;
        } else {
            qVar = (q) l1Var.f22943a.invoke(obj);
        }
        return new k6.i(this.f22974a, this.f22975b, qVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (r0Var.f22974a == this.f22974a && r0Var.f22975b == this.f22975b && kotlin.jvm.internal.a(r0Var.f22976c, this.f22976c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f22976c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return Float.hashCode(this.f22975b) + a.a(i * 31, 31, this.f22974a);
    }

    public /* synthetic */ r0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
