package nd;
import q.x;
import v.k;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.internal.ads.pb;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class j implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    public final URL f21258u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Future f21259v;

    /* renamed from: w, reason: collision with root package name */
    public ib.o f21260w;

    public j(URL url) {
        this.f21258u = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21259v.cancel(true);
    }

    public final Bitmap f() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f21258u;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] k3 = k(new pb(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + k3.length + " bytes from " + url);
                }
                if (k3.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(k3, 0, k3.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                        }
                        return decodeByteArray;
                    }
                    throw new IOException("Failed to decode image: " + url);
                }
                x.p("Image exceeds max size of 1048576");
                return null;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        x.p("Content-Length exceeds max size of 1048576");
        return null;
    }
}
