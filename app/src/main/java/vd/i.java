package vd;

/* loaded from: classes.dex */
public enum i implements bd.f {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);


    /* renamed from: u, reason: collision with root package name */
    public final int f27602u;

    i(int i) {
        this.f27602u = i;
    }

    @Override // bd.f
    public final int a() {
        return this.f27602u;
    }
}
