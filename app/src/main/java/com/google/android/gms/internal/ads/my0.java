package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class my0 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f8481a;

    public my0(ExecutorService executorService) {
        this.f8481a = executorService;
    }

    public final ly0 a(File file, byte[] bArr, f31 f31Var) {
        return new ly0(file, this.f8481a, new uz(bArr), f31Var);
    }
}
