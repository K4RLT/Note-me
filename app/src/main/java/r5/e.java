package r5;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: u, reason: collision with root package name */
    public final f f24557u;

    /* renamed from: v, reason: collision with root package name */
    public final Throwable f24558v;

    public e(f fVar, Throwable th) {
        super(th);
        this.f24557u = fVar;
        this.f24558v = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f24558v;
    }
}
