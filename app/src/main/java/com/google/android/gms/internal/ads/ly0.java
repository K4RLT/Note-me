package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ly0 {

    /* renamed from: a, reason: collision with root package name */
    public final File f8185a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f8186b;

    /* renamed from: c, reason: collision with root package name */
    public final ky0 f8187c;

    /* renamed from: d, reason: collision with root package name */
    public final f31 f8188d;

    public ly0(File file, ExecutorService executorService, ky0 ky0Var, f31 f31Var) {
        this.f8185a = file;
        this.f8186b = executorService;
        this.f8187c = ky0Var;
        this.f8188d = f31Var;
    }

    public final h91 a(Object obj) {
        return ed1.E(new xe(this, 10, obj), this.f8186b);
    }
}
