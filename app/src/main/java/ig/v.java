package ig;
import x.n;
import x.o;
import q.d;
import q.x;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public a4.b f18586a;

    /* renamed from: b, reason: collision with root package name */
    public r f18587b;

    /* renamed from: d, reason: collision with root package name */
    public String f18589d;
    public k e;

    /* renamed from: g, reason: collision with root package name */
    public y f18591g;

    /* renamed from: h, reason: collision with root package name */
    public w f18592h;
    public w i;

    /* renamed from: j, reason: collision with root package name */
    public w f18593j;

    /* renamed from: k, reason: collision with root package name */
    public long f18594k;

    /* renamed from: l, reason: collision with root package name */
    public long f18595l;

    /* renamed from: c, reason: collision with root package name */
    public int f18588c = -1;

    /* renamed from: f, reason: collision with root package name */
    public f4.h f18590f = new f4.h(1);

    public static void b(String str, w wVar) {
        if (wVar.A == null) {
            if (wVar.B == null) {
                if (wVar.C == null) {
                    if (wVar.D == null) {
                        return;
                    }
                    x.n(str.concat(".priorResponse != null"));
                    return;
                }
                x.n(str.concat(".cacheResponse != null"));
                return;
            }
            x.n(str.concat(".networkResponse != null"));
            return;
        }
        x.n(str.concat(".body != null"));
    }

    public final w a() {
        if (this.f18586a != null) {
            if (this.f18587b != null) {
                if (this.f18588c >= 0) {
                    if (this.f18589d != null) {
                        return new w(this);
                    }
                    x.o("message == null");
                    return null;
                }
                g5.d(this.f18588c, "code < 0: ");
                return null;
            }
            x.o("protocol == null");
            return null;
        }
        x.o("request == null");
        return null;
    }
}
