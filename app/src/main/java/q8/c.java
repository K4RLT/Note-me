package q8;

/* loaded from: classes.dex */
public enum c implements cd.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: u, reason: collision with root package name */
    public final int f23596u;

    c(int i) {
        this.f23596u = i;
    }

    @Override // cd.c
    public final int a() {
        return this.f23596u;
    }
}
