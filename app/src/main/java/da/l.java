package da;

/* loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* renamed from: u, reason: collision with root package name */
    public final ca.d f15828u;

    public l(ca.d dVar) {
        this.f15828u = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f15828u));
    }
}
