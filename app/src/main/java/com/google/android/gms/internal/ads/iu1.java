package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class iu1 implements ie0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7230u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ iu1 f7225v = new iu1(24);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ iu1 f7226w = new iu1(25);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ iu1 f7227x = new iu1(26);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ iu1 f7228y = new iu1(27);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ iu1 f7229z = new iu1(28);
    public static final /* synthetic */ iu1 A = new iu1(29);

    public /* synthetic */ iu1(int i) {
        this.f7230u = i;
    }

    @Override // com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        long j10;
        p pVar;
        switch (this.f7230u) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                return;
            case 8:
                return;
            case 9:
                return;
            case 10:
                return;
            case 11:
                return;
            case 12:
                return;
            case 13:
                return;
            case 14:
                return;
            case 15:
                return;
            case 16:
                return;
            case 17:
                return;
            case 18:
                return;
            case 19:
                return;
            case 20:
                return;
            case gl.zzm /* 21 */:
                return;
            case 22:
                return;
            case 23:
            default:
                lt0 lt0Var = ((aw1) obj).f4620a.f5197l;
                if (lt0Var != null) {
                    ew1 ew1Var = (ew1) lt0Var.f8135v;
                    synchronized (ew1Var.f13312u) {
                        pVar = ew1Var.M;
                    }
                    if (pVar != null) {
                        synchronized (pVar.f9294c) {
                            pVar.e.getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                xv1 xv1Var = (xv1) obj;
                xv1Var.getClass();
                cw1.Y.getAndDecrement();
                lt0 lt0Var2 = xv1Var.f12639b.f5197l;
                if (lt0Var2 != null) {
                    int i = xv1Var.f12638a.f6481a;
                    iu1 iu1Var = new iu1(23);
                    mu muVar = ((ew1) lt0Var2.f8135v).Z0;
                    Handler handler = (Handler) muVar.f8422v;
                    if (handler != null) {
                        handler.post(new hv1(muVar, iu1Var, 1));
                        return;
                    }
                    return;
                }
                return;
            case 25:
                xv1 xv1Var2 = (xv1) obj;
                cw1 cw1Var = xv1Var2.f12639b;
                if (xv1Var2.equals(cw1Var.f5194h) && cw1Var.f5197l != null) {
                    zv1 zv1Var = cw1Var.f5199n;
                    int i10 = zv1Var.f13278b;
                    if (i10 != -1) {
                        long j11 = ((gv1) zv1Var.e).f6484d / i10;
                        tv1 tv1Var = cw1Var.f5203r;
                        tv1Var.getClass();
                        j10 = bq0.v(tv1Var.f11456a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - cw1Var.T;
                    lt0 lt0Var3 = cw1Var.f5197l;
                    int i11 = ((gv1) cw1Var.f5199n.e).f6484d;
                    mu muVar2 = ((ew1) lt0Var3.f8135v).Z0;
                    long t3 = bq0.t(j10);
                    Handler handler2 = (Handler) muVar2.f8422v;
                    if (handler2 != null) {
                        handler2.post(new hv1(muVar2, i11, t3, elapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 26:
                xv1 xv1Var3 = (xv1) obj;
                cw1 cw1Var2 = xv1Var3.f12639b;
                if (xv1Var3.equals(cw1Var2.f5194h) && cw1Var2.L) {
                    cw1Var2.M = true;
                    return;
                }
                return;
            case 27:
                ((xv1) obj).a();
                return;
            case 28:
                ((xv1) obj).a();
                return;
        }
    }
}
