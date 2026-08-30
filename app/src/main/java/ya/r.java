package ya;
import ya.v;

/* loaded from: classes.dex */
public final class r implements v {

    /* renamed from: b, reason: collision with root package name */
    public final int f31469b;

    public r(int i) {
        this.f31469b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return v.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (this.f31469b == vVar.zza() && u.f31520u.equals(vVar.zzb())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f31469b ^ 14552422) + (u.f31520u.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f31469b + "intEncoding=" + u.f31520u + ')';
    }

    @Override // v
    public final int zza() {
        return this.f31469b;
    }

    @Override // v
    public final u zzb() {
        return u.f31520u;
    }
}
