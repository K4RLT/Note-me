package eb;

/* loaded from: classes.dex */
public enum m1 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* renamed from: u, reason: collision with root package name */
    public final String f16239u;

    m1(String str) {
        this.f16239u = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f16239u;
    }
}
