package q5;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface b extends Closeable {
    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z3);

    r5.c y();
}
