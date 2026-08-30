package og;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends jg.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f22022w = 2;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f22023x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f22024y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f22024y = rVar;
        this.f22023x = i;
    }

    @Override // jg.a
    public final void b() {
        switch (this.f22022w) {
            case 0:
                this.f22024y.D.getClass();
                try {
                    this.f22024y.L.r(this.f22023x, 6);
                    synchronized (this.f22024y) {
                        this.f22024y.N.remove(Integer.valueOf(this.f22023x));
                    }
                    return;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                this.f22024y.D.getClass();
                try {
                    this.f22024y.L.r(this.f22023x, 6);
                    synchronized (this.f22024y) {
                        this.f22024y.N.remove(Integer.valueOf(this.f22023x));
                    }
                    return;
                } catch (IOException unused2) {
                    return;
                }
            default:
                this.f22024y.D.getClass();
                synchronized (this.f22024y) {
                    this.f22024y.N.remove(Integer.valueOf(this.f22023x));
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, Object[] objArr, int i, ArrayList arrayList, boolean z3) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f22024y = rVar;
        this.f22023x = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, Object[] objArr, int i, int i10) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f22024y = rVar;
        this.f22023x = i;
    }
}
