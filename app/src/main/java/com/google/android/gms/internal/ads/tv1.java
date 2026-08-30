package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class tv1 {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f11453o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f11454p;

    /* renamed from: q, reason: collision with root package name */
    public static int f11455q;

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f11456a;

    /* renamed from: b, reason: collision with root package name */
    public final gv1 f11457b;

    /* renamed from: c, reason: collision with root package name */
    public final bl0 f11458c;

    /* renamed from: d, reason: collision with root package name */
    public na1 f11459d;
    public final vv1 e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11460f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11461g;

    /* renamed from: h, reason: collision with root package name */
    public final hq0 f11462h;
    public final ig0 i = new ig0(Thread.currentThread());

    /* renamed from: j, reason: collision with root package name */
    public boolean f11463j;

    /* renamed from: k, reason: collision with root package name */
    public long f11464k;

    /* renamed from: l, reason: collision with root package name */
    public long f11465l;

    /* renamed from: m, reason: collision with root package name */
    public int f11466m;

    /* renamed from: n, reason: collision with root package name */
    public int f11467n;

    public tv1(AudioTrack audioTrack, gv1 gv1Var, bl0 bl0Var, s6 s6Var) {
        hq0 hq0Var;
        this.f11456a = audioTrack;
        this.f11457b = gv1Var;
        this.f11458c = bl0Var;
        int i = gv1Var.f6481a;
        boolean d2 = bq0.d(i);
        this.f11460f = d2;
        if (d2) {
            this.f11461g = bq0.f(i) * Integer.bitCount(gv1Var.f6483c);
        } else {
            this.f11461g = -1;
        }
        this.e = new vv1(new zq0(14, this), s6Var, audioTrack, gv1Var.f6481a, this.f11461g, gv1Var.f6484d);
        if (bl0Var != null) {
            this.f11459d = new na1(audioTrack, bl0Var);
        }
        if (b()) {
            hq0Var = new hq0(this);
        } else {
            hq0Var = null;
        }
        this.f11462h = hq0Var;
    }

    public final boolean a(int i, ByteBuffer byteBuffer) {
        bl0 bl0Var;
        boolean z3 = this.f11460f;
        if (!z3 && this.f11466m == 0) {
            this.f11466m = cw1.c(this.f11457b.f6481a, byteBuffer);
        }
        ig0 ig0Var = this.i;
        ig0Var.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = ig0Var.f7131a;
        AudioTrack audioTrack = this.f11456a;
        if (currentThread == thread) {
            d();
            int underrunCount = audioTrack.getUnderrunCount();
            int i10 = this.f11467n;
            this.f11467n = underrunCount;
            if (underrunCount > i10) {
                ig0Var.c(-1, iu1.f7226w);
                ig0Var.d();
            }
        }
        int remaining = byteBuffer.remaining();
        boolean z9 = true;
        int write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        if (write < 0) {
            if (write != -6 && write != -32) {
                z9 = false;
            }
            if (z9 && (bl0Var = this.f11458c) != null) {
                com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.lw) bl0Var.f4819v;
                pu puVar = (pu) lwVar.f14648z;
                if (puVar != null) {
                    vu1 vu1Var = vu1.f12010f;
                    lwVar.f14647y = vu1Var;
                    puVar.k(vu1Var);
                }
            }
            throw new av1(write, z9);
        }
        if (write != remaining) {
            z9 = false;
        }
        if (z3) {
            this.f11464k += write;
            return z9;
        }
        if (z9) {
            this.f11465l = (this.f11466m * i) + this.f11465l;
        }
        return z9;
    }

    public final boolean b() {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT >= 29) {
            isOffloadedPlayback = this.f11456a.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c() {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tv1.c():long");
    }

    public final long d() {
        if (this.f11460f) {
            long j10 = this.f11464k;
            String str = bq0.f4860a;
            return ((j10 + r2) - 1) / this.f11461g;
        }
        return this.f11465l;
    }
}
