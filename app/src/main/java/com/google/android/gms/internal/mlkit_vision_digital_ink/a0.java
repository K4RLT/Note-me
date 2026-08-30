package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class a0 extends d0 implements v {

    /* renamed from: u, reason: collision with root package name */
    public final FileOutputStream f14001u;

    /* renamed from: v, reason: collision with root package name */
    public final File f14002v;

    public a0(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f14001u = fileOutputStream;
        this.f14002v = file;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.v
    public final File zza() {
        return this.f14002v;
    }
}
