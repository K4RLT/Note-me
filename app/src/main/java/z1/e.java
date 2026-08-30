package z1;

import java.util.Map;

/* loaded from: classes.dex */
public final class e implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31799c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f31800d;
    public final /* synthetic */ df.l e;

    public /* synthetic */ e(int i, int i10, Map map, df.l lVar, int i11) {
        this.f31797a = i11;
        this.f31798b = i;
        this.f31799c = i10;
        this.f31800d = map;
        this.e = lVar;
    }

    @Override // z1.q0
    public final void a() {
        int i = this.f31797a;
    }

    @Override // z1.q0
    public final Map b() {
        switch (this.f31797a) {
            case 0:
                return this.f31800d;
            default:
                return this.f31800d;
        }
    }

    @Override // z1.q0
    public final df.l c() {
        switch (this.f31797a) {
            case 0:
                return this.e;
            default:
                return this.e;
        }
    }

    @Override // z1.q0
    public final int getHeight() {
        switch (this.f31797a) {
            case 0:
                return this.f31799c;
            default:
                return this.f31799c;
        }
    }

    @Override // z1.q0
    public final int getWidth() {
        switch (this.f31797a) {
            case 0:
                return this.f31798b;
            default:
                return this.f31798b;
        }
    }

    private final void d() {
    }

    private final void e() {
    }
}
