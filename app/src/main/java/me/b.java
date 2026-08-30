package me;

import androidx.lifecycle.e0;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import da.j;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface b extends Closeable, v, j {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @e0(o.ON_DESTROY)
    void close();
}
