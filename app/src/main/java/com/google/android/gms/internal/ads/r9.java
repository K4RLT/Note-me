package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r9 {

    /* renamed from: a, reason: collision with root package name */
    public final i3 f10148a;

    /* renamed from: b, reason: collision with root package name */
    public long f10149b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10150c;

    /* renamed from: d, reason: collision with root package name */
    public int f10151d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10152f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10153g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10154h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10155j;

    /* renamed from: k, reason: collision with root package name */
    public long f10156k;

    /* renamed from: l, reason: collision with root package name */
    public long f10157l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10158m;

    public r9(i3 i3Var) {
        this.f10148a = i3Var;
    }

    public final void a(int i) {
        long j10 = this.f10157l;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f10149b;
            long j12 = this.f10156k;
            if (j11 != j12) {
                int i10 = (int) (j11 - j12);
                this.f10148a.c(j10, this.f10158m ? 1 : 0, i10, i, null);
            }
        }
    }
}
