package na;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f21220a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f21221b;

    public static final long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    public static synchronized boolean c(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f21220a;
            if (context2 != null && (bool = f21221b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f21221b = null;
            if (la.b.h()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f21221b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f21221b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f21221b = Boolean.FALSE;
                }
            }
            f21220a = applicationContext;
            return f21221b.booleanValue();
        }
    }

    public static final byte[] d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        a(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
}
