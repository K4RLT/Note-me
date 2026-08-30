package com.google.android.gms.internal.ads;
import f9.k;
import k9.a0;
import l9.i;

import android.os.SystemClock;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class jy implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7565u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ly f7566v;

    public /* synthetic */ jy(ly lyVar, int i) {
        this.f7565u = i;
        this.f7566v = lyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7565u) {
            case 0:
                this.f7566v.c("surfaceCreated", new String[0]);
                return;
            case 1:
                this.f7566v.c("surfaceDestroyed", new String[0]);
                return;
            case 2:
                this.f7566v.c("firstFrameRendered", new String[0]);
                return;
            default:
                ly lyVar = this.f7566v;
                boolean z3 = lyVar.B;
                ImageView imageView = lyVar.K;
                if (z3 && imageView.getParent() != null) {
                    lyVar.f8180v.removeView(imageView);
                }
                iy iyVar = lyVar.A;
                if (iyVar != null && lyVar.J != null) {
                    k kVar = k.C;
                    kVar.f16819k.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (iyVar.getBitmap(lyVar.J) != null) {
                        lyVar.L = true;
                    }
                    kVar.f16819k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (a0.m()) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 26);
                        sb2.append("Spinner frame grab took ");
                        sb2.append(elapsedRealtime2);
                        sb2.append("ms");
                        a0.k(sb2.toString());
                    }
                    if (elapsedRealtime2 > lyVar.f8184z) {
                        i.f("Spinner frame grab crossed jank threshold! Suspending spinner.");
                        lyVar.E = false;
                        lyVar.J = null;
                        wl wlVar = lyVar.f8182x;
                        if (wlVar != null) {
                            wlVar.c("spinner_jank", Long.toString(elapsedRealtime2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
