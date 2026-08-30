package na;

import android.content.Context;
import c4.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f21222b;

    /* renamed from: a, reason: collision with root package name */
    public n f21223a;

    /* JADX WARN: Type inference failed for: r0v0, types: [na.b, java.lang.Object] */
    static {
        Object obj = new Object();
        obj.f21223a = null;
        f21222b = obj;
    }

    public static n a(Context context) {
        n nVar;
        b bVar = f21222b;
        synchronized (bVar) {
            try {
                if (bVar.f21223a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f21223a = new n(context, (byte) 0);
                }
                nVar = bVar.f21223a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }
}