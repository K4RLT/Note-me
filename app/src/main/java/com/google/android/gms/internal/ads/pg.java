package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pg extends wg {

    /* renamed from: h, reason: collision with root package name */
    public final long f9513h;

    public pg(dg dgVar, wd wdVar, long j10, int i) {
        super(dgVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", wdVar, i, 25);
        this.f9513h = j10;
    }

    @Override // com.google.android.gms.internal.ads.wg
    public final void a() {
        long longValue = ((Long) this.e.invoke(null, null)).longValue();
        wd wdVar = this.f12235d;
        synchronized (wdVar) {
            wdVar.b();
            ((je) wdVar.f4845v).m0(longValue);
            long j10 = this.f9513h;
            if (j10 != 0) {
                wdVar.b();
                ((je) wdVar.f4845v).N0(longValue - j10);
                wdVar.b();
                ((je) wdVar.f4845v).Q0(j10);
            }
        }
    }
}
