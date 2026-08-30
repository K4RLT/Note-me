package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8907a;

    /* renamed from: b, reason: collision with root package name */
    public l1 f8908b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8909c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f8910d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f8911f;

    /* renamed from: g, reason: collision with root package name */
    public float f8912g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f8913h = 0;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f8914j;

    /* renamed from: k, reason: collision with root package name */
    public long f8915k;

    /* renamed from: l, reason: collision with root package name */
    public long f8916l;

    /* renamed from: m, reason: collision with root package name */
    public long f8917m;

    /* renamed from: n, reason: collision with root package name */
    public long f8918n;

    /* renamed from: o, reason: collision with root package name */
    public long f8919o;

    /* renamed from: p, reason: collision with root package name */
    public long f8920p;

    public o1(Context context) {
        this.f8907a = context;
    }

    public final void a() {
        this.f8918n = -1L;
        this.f8915k = -1L;
        this.f8917m = -9223372036854775807L;
        this.i = 0L;
        this.f8914j = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L48
            android.view.Surface r0 = r3.f8910d
            if (r0 == 0) goto L48
            int r1 = r3.f8913h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L48
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L17
            goto L48
        L17:
            boolean r0 = r3.f8909c
            r1 = 0
            if (r0 == 0) goto L28
            float r0 = r3.e
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L28
            float r2 = r3.f8912g
            float r0 = r0 * r2
            goto L29
        L28:
            r0 = r1
        L29:
            if (r4 != 0) goto L31
            float r4 = r3.f8911f
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L48
        L31:
            r3.f8911f = r0
            android.view.Surface r4 = r3.f8910d
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L3b
            r1 = 0
            goto L3c
        L3b:
            r1 = 1
        L3c:
            c2.z1.w(r4, r0, r1)     // Catch: java.lang.IllegalStateException -> L40
            return
        L40:
            r4 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            com.google.android.gms.internal.ads.x21.P(r0, r1, r4)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o1.b(boolean):void");
    }

    public final void c() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f8910d) != null && this.f8913h != Integer.MIN_VALUE && this.f8911f != 0.0f && surface.isValid()) {
            this.f8911f = 0.0f;
            try {
                this.f8910d.setFrameRate(0.0f, 0);
            } catch (IllegalStateException e) {
                x21.P("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }
}
