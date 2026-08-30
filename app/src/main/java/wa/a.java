package wa;
import wa.d;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public final int f29557b;

    public a(int i) {
        this.f29557b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f29557b == dVar.zza() && c.f29579u.equals(dVar.zzb())) {
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
        return (this.f29557b ^ 14552422) + (c.f29579u.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f29557b + "intEncoding=" + c.f29579u + ')';
    }

    @Override // d
    public final int zza() {
        return this.f29557b;
    }

    @Override // d
    public final c zzb() {
        return c.f29579u;
    }
}
