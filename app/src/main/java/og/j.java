package og;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends jg.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f22019w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f22020x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f22021y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, Object[] objArr, int i, long j10) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f22021y = rVar;
        this.f22019w = i;
        this.f22020x = j10;
    }

    @Override // jg.a
    public final void b() {
        r rVar = this.f22021y;
        try {
            rVar.L.w(this.f22019w, this.f22020x);
        } catch (IOException unused) {
            rVar.j();
        }
    }
}
