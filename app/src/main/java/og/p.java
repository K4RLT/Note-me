package og;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class p extends jg.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f22034w = 1;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f22035x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f22036y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, t tVar) {
        super("OkHttp %s", new Object[]{rVar.f22041x});
        this.f22035x = rVar;
        this.f22036y = tVar;
    }

    @Override // jg.a
    public final void b() {
        int i = this.f22034w;
        Object obj = this.f22036y;
        Object obj2 = this.f22035x;
        switch (i) {
            case 0:
                w wVar = (w) obj;
                r rVar = (r) ((p) obj2).f22035x;
                try {
                    rVar.f22039v.b(wVar);
                    return;
                } catch (IOException e) {
                    pg.h.f22833a.l(4, "Http2Connection.Listener failure for " + rVar.f22041x, e);
                    try {
                        wVar.c(2);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            case 1:
                r rVar2 = (r) ((p) obj2).f22035x;
                try {
                    rVar2.L.f((b2.t) obj);
                    return;
                } catch (IOException unused2) {
                    ThreadPoolExecutor threadPoolExecutor = r.O;
                    rVar2.j();
                    return;
                }
            default:
                r rVar3 = (r) obj2;
                t tVar = (t) obj;
                try {
                    try {
                        tVar.k(this);
                        do {
                        } while (tVar.j(false, this));
                        rVar3.f(1, 6);
                    } catch (IOException unused3) {
                    }
                } catch (IOException unused4) {
                    rVar3.f(2, 2);
                } catch (Throwable th) {
                    try {
                        rVar3.f(3, 3);
                    } catch (IOException unused5) {
                    }
                    jg.b.d(tVar);
                    throw th;
                }
                jg.b.d(tVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p pVar, Object[] objArr, w wVar) {
        super("OkHttp %s stream %d", objArr);
        this.f22035x = pVar;
        this.f22036y = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p pVar, Object[] objArr, b2.t tVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.f22035x = pVar;
        this.f22036y = tVar;
    }
}
