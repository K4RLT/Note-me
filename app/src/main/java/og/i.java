package og;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends jg.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f22016w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f22017x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f22018y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Object[] objArr, int i, int i10) {
        super("OkHttp %s stream %d", objArr);
        this.f22018y = rVar;
        this.f22016w = i;
        this.f22017x = i10;
    }

    @Override // jg.a
    public final void b() {
        r rVar = this.f22018y;
        try {
            rVar.L.r(this.f22016w, this.f22017x);
        } catch (IOException unused) {
            rVar.j();
        }
    }
}
