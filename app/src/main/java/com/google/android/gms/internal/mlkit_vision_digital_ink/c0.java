package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.FilterInputStream;

/* loaded from: classes.dex */
public abstract class c0 extends FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return ((FilterInputStream) this).in.read(bArr);
    }
}
