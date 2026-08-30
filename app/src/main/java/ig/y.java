package ig;

import java.io.Closeable;
import okio.BufferedSource;

/* loaded from: classes.dex */
public abstract class y implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        jg.b.d(j());
    }

    public abstract long f();

    public abstract BufferedSource j();
}
