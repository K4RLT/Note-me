package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class z extends c0 implements v {

    /* renamed from: u, reason: collision with root package name */
    public final File f15318u;

    public z(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f15318u = file;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.v
    public final File zza() {
        return this.f15318u;
    }
}
