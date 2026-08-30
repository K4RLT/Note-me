package je;

import androidx.lifecycle.e0;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface d extends Closeable, v {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @e0(o.ON_DESTROY)
    void close();
}
