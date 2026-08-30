package ig;

import okio.BufferedSource;

/* loaded from: classes.dex */
public final class x extends y {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18602u;

    /* renamed from: v, reason: collision with root package name */
    public final long f18603v;

    /* renamed from: w, reason: collision with root package name */
    public final BufferedSource f18604w;

    public /* synthetic */ x(long j10, BufferedSource bufferedSource, int i) {
        this.f18602u = i;
        this.f18603v = j10;
        this.f18604w = bufferedSource;
    }

    @Override // ig.y
    public final long f() {
        switch (this.f18602u) {
            case 0:
                return this.f18603v;
            default:
                return this.f18603v;
        }
    }

    @Override // ig.y
    public final BufferedSource j() {
        switch (this.f18602u) {
            case 0:
                return (sg.f) this.f18604w;
            default:
                return (sg.n) this.f18604w;
        }
    }
}
