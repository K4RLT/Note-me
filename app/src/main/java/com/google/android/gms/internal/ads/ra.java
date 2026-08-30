package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class ra implements qa {

    /* renamed from: u, reason: collision with root package name */
    public long f10162u;

    /* renamed from: v, reason: collision with root package name */
    public long f10163v;

    /* renamed from: w, reason: collision with root package name */
    public Object f10164w;

    public ra() {
        this.f10162u = -9223372036854775807L;
        this.f10163v = -9223372036854775807L;
    }

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f10164w) == null) {
            this.f10164w = exc;
        }
        if (this.f10162u == -9223372036854775807L && cw1.Y.get() <= 0) {
            this.f10162u = 200 + elapsedRealtime;
        }
        long j10 = this.f10162u;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = (Exception) this.f10164w;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f10164w;
            this.f10164w = null;
            this.f10162u = -9223372036854775807L;
            this.f10163v = -9223372036854775807L;
            throw exc3;
        }
        this.f10163v = elapsedRealtime + 50;
    }

    @Override // com.google.android.gms.internal.ads.qa
    public void b(MessageDigest[] messageDigestArr, long j10, int i) {
        MappedByteBuffer map = ((FileChannel) this.f10164w).map(FileChannel.MapMode.READ_ONLY, this.f10162u + j10, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa, com.google.android.gms.internal.ads.b10, com.google.android.gms.internal.ads.zx
    /* renamed from: zza */
    public long mo212zza() {
        return this.f10163v;
    }

    public ra(FileChannel fileChannel, long j10, long j11) {
        this.f10164w = fileChannel;
        this.f10162u = j10;
        this.f10163v = j11;
    }
}
