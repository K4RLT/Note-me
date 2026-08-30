package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class s61 extends OutputStream {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10536u;

    public final String toString() {
        switch (this.f10536u) {
            case 0:
                return "ByteStreams.nullOutputStream()";
            default:
                return "ByteStreams.nullOutputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        switch (this.f10536u) {
            case 0:
                bArr.getClass();
                b80.P(i, i10 + i, bArr.length);
                return;
            default:
                bArr.getClass();
                com.google.android.gms.internal.mlkit_vision_digital_ink.pa.r(i, i10 + i, bArr.length);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f10536u) {
            case 0:
                bArr.getClass();
                return;
            default:
                bArr.getClass();
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i10 = this.f10536u;
    }

    private final void f(int i) {
    }

    private final void j(int i) {
    }
}
