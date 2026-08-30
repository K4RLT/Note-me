package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* loaded from: classes.dex */
public final class gj extends PushbackInputStream {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zd1 f6409u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(zd1 zd1Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f6409u = zd1Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((mf) this.f6409u.f13144x).e();
        super.close();
    }
}
