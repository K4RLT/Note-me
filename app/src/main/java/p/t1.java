package p;
import q.z;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f22260a;

    /* renamed from: b, reason: collision with root package name */
    public final z f22261b;

    /* JADX WARN: Multi-variable type inference failed */
    public t1(df.l lVar, z zVar) {
        this.f22260a = (kotlin.jvm.internal.m) lVar;
        this.f22261b = zVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t1) {
                t1 t1Var = (t1) obj;
                if (!this.f22260a.equals(t1Var.f22260a) || !this.f22261b.equals(t1Var.f22261b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22261b.hashCode() + (this.f22260a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f22260a + ", animationSpec=" + this.f22261b + ')';
    }
}
