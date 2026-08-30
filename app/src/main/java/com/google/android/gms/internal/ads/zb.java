package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public final class zb extends jr1 {
    public int C;
    public Date D;
    public Date E;
    public long F;
    public long G;
    public double H;
    public float I;
    public or1 J;
    public long K;

    @Override // com.google.android.gms.internal.ads.jr1
    public final void b(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.C = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f7515v) {
            c();
        }
        if (this.C == 1) {
            this.D = xl1.b(ay0.y(byteBuffer));
            this.E = xl1.b(ay0.y(byteBuffer));
            this.F = ay0.c(byteBuffer);
            this.G = ay0.y(byteBuffer);
        } else {
            this.D = xl1.b(ay0.c(byteBuffer));
            this.E = xl1.b(ay0.c(byteBuffer));
            this.F = ay0.c(byteBuffer);
            this.G = ay0.c(byteBuffer);
        }
        this.H = ay0.E(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.I = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        ay0.c(byteBuffer);
        ay0.c(byteBuffer);
        this.J = new or1(ay0.E(byteBuffer), ay0.E(byteBuffer), ay0.E(byteBuffer), ay0.E(byteBuffer), ay0.L(byteBuffer), ay0.L(byteBuffer), ay0.L(byteBuffer), ay0.E(byteBuffer), ay0.E(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.K = ay0.c(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.D + ";modificationTime=" + this.E + ";timescale=" + this.F + ";duration=" + this.G + ";rate=" + this.H + ";volume=" + this.I + ";matrix=" + this.J + ";nextTrackId=" + this.K + "]";
    }
}
