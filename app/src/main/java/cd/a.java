package cd;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final int f4082b;

    public a(int i) {
        this.f4082b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f4082b == eVar.tag() && d.f4085u.equals(eVar.intEncoding())) {
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
        return (14552422 ^ this.f4082b) + (d.f4085u.hashCode() ^ 2041407134);
    }

    @Override // cd.e
    public final d intEncoding() {
        return d.f4085u;
    }

    @Override // cd.e
    public final int tag() {
        return this.f4082b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f4082b + "intEncoding=" + d.f4085u + ')';
    }
}
