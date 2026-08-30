package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class sg extends wg {

    /* renamed from: h, reason: collision with root package name */
    public final tf f10608h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f10609j;

    public sg(dg dgVar, wd wdVar, int i, tf tfVar, long j10, long j11) {
        super(dgVar, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", wdVar, i, 11);
        this.f10608h = tfVar;
        this.i = j10;
        this.f10609j = j11;
    }

    @Override // com.google.android.gms.internal.ads.wg
    public final void a() {
        tf tfVar = this.f10608h;
        if (tfVar != null) {
            String str = (String) this.e.invoke(null, (NetworkCapabilities) tfVar.f11339v, Long.valueOf(this.i), Long.valueOf(this.f10609j));
            rf rfVar = new rf();
            HashMap s10 = an1.s(str);
            if (s10 != null) {
                rfVar.P = (Long) s10.get(0);
                rfVar.Q = (Long) s10.get(1);
                rfVar.R = (Long) s10.get(2);
            }
            wd wdVar = this.f12235d;
            synchronized (wdVar) {
                try {
                    long longValue = rfVar.P.longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).I0(longValue);
                    if (((Long) rfVar.Q).longValue() >= 0) {
                        long longValue2 = ((Long) rfVar.Q).longValue();
                        wdVar.b();
                        ((je) wdVar.f4845v).g0(longValue2);
                    }
                    if (((Long) rfVar.R).longValue() >= 0) {
                        long longValue3 = ((Long) rfVar.R).longValue();
                        wdVar.b();
                        ((je) wdVar.f4845v).h0(longValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
