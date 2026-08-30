package sg;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface r extends Closeable, Flushable {
    void G(f fVar, long j10);

    v a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
