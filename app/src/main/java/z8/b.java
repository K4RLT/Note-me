package z8;

/* loaded from: classes.dex */
public enum b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: u, reason: collision with root package name */
    public final int f31978u;

    b(int i) {
        this.f31978u = i;
    }

    public static b a(int i) {
        for (b bVar : values()) {
            if (bVar.f31978u == i) {
                return bVar;
            }
        }
        return null;
    }
}
