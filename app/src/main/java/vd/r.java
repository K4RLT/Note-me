package vd;

/* loaded from: classes.dex */
public enum r implements bd.f {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: u, reason: collision with root package name */
    public final int f27636u;

    r(int i) {
        this.f27636u = i;
    }

    @Override // bd.f
    public final int a() {
        return this.f27636u;
    }
}
