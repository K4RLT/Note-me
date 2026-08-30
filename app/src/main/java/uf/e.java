package uf;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: u, reason: collision with root package name */
    public final transient te.g f27212u;

    public e(te.g gVar) {
        this.f27212u = gVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f27212u.toString();
    }
}
