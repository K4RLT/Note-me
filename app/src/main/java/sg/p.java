package sg;

import q.x;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static o f25304a;

    /* renamed from: b, reason: collision with root package name */
    public static long f25305b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f25306c = new Object();

    public static final void a(o oVar) {
        oVar.getClass();
        if (oVar.f25302f == null && oVar.f25303g == null) {
            if (oVar.f25301d) {
                return;
            }
            synchronized (f25306c) {
                long j10 = f25305b + 8192;
                if (j10 > 65536) {
                    return;
                }
                f25305b = j10;
                oVar.f25302f = f25304a;
                oVar.f25300c = 0;
                oVar.f25299b = 0;
                f25304a = oVar;
                return;
            }
        }
        x.n("Failed requirement.");
    }

    public static final o b() {
        synchronized (f25306c) {
            o oVar = f25304a;
            if (oVar != null) {
                f25304a = oVar.f25302f;
                oVar.f25302f = null;
                f25305b -= 8192;
                return oVar;
            }
            return new o();
        }
    }
}
