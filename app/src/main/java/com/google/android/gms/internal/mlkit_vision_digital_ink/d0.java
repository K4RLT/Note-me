package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.FilterOutputStream;

/* loaded from: classes.dex */
public abstract class d0 extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i10) {
        ((FilterOutputStream) this).out.write(bArr, i, i10);
    }
}
