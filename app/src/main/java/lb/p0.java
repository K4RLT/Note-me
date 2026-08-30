package lb;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static j6.c f20229a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f20230b = new t(4);

    /* renamed from: c, reason: collision with root package name */
    public static final t f20231c = new t(6);

    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static synchronized j6.c b(Context context) {
        j6.c cVar;
        synchronized (p0.class) {
            try {
                if (f20229a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    f20229a = new j6.c(new c4.n(context, (byte) 0));
                }
                cVar = f20229a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
