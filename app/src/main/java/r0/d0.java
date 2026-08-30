package r0;
import r0.q2;
import z0.g;

/* loaded from: classes.dex */
public final class d0 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f24205a;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(df.l lVar) {
        this.f24205a = (kotlin.jvm.internal.m) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, df.l] */
    @Override // q2
    public final Object a(g gVar) {
        return this.f24205a.invoke(gVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof d0) || !this.f24205a.equals(((d0) obj).f24205a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f24205a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f24205a + ')';
    }
}
