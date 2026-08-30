package com.google.android.gms.internal.ads;
import i0.m;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d0 extends Handler implements Runnable {
    public volatile boolean A;
    public final /* synthetic */ hq0 B;

    /* renamed from: u, reason: collision with root package name */
    public final jy1 f5233u;

    /* renamed from: v, reason: collision with root package name */
    public my1 f5234v;

    /* renamed from: w, reason: collision with root package name */
    public IOException f5235w;

    /* renamed from: x, reason: collision with root package name */
    public int f5236x;

    /* renamed from: y, reason: collision with root package name */
    public Thread f5237y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5238z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hq0 hq0Var, Looper looper, jy1 jy1Var, my1 my1Var, long j10) {
        super(looper);
        Objects.requireNonNull(hq0Var);
        this.B = hq0Var;
        this.f5233u = jy1Var;
        this.f5234v = my1Var;
    }

    public final void a(boolean z3) {
        this.A = z3;
        this.f5235w = null;
        if (hasMessages(1)) {
            this.f5238z = true;
            removeMessages(1);
            if (!z3) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f5238z = true;
                    this.f5233u.f7577g = true;
                    Thread thread = this.f5237y;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z3) {
            this.B.f6873w = null;
            SystemClock.elapsedRealtime();
            my1 my1Var = this.f5234v;
            my1Var.getClass();
            my1Var.h(this.f5233u, true);
            this.f5234v = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        qx1 obj;
        SystemClock.elapsedRealtime();
        my1 my1Var = this.f5234v;
        my1Var.getClass();
        int i = this.f5236x;
        jy1 jy1Var = this.f5233u;
        com.google.android.gms.internal.mlkit_vision_digital_ink.gw gwVar = jy1Var.f7573b;
        if (i == 0) {
            Uri uri = jy1Var.f7579j.f5444a;
            Map map = Collections.EMPTY_MAP;
            obj = new Object();
        } else {
            Object obj2 = gwVar.f14387w;
            obj = new Object();
        }
        m mVar = my1Var.f8495x;
        mVar.s(new tc(mVar, obj, new vx1(-1, null, bq0.t(jy1Var.i), bq0.t(my1Var.U)), i));
        this.f5235w = null;
        hq0 hq0Var = this.B;
        d0 d0Var = (d0) hq0Var.f6873w;
        d0Var.getClass();
        ((i0) hq0Var.f6872v).execute(d0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long min;
        int i;
        c0 c0Var;
        a3 a3Var;
        int i10;
        boolean z3;
        if (!this.A) {
            int i11 = message.what;
            int i12 = 1;
            if (i11 == 1) {
                b();
                return;
            }
            if (i11 != 4) {
                hq0 hq0Var = this.B;
                hq0Var.f6873w = null;
                SystemClock.elapsedRealtime();
                my1 my1Var = this.f5234v;
                my1Var.getClass();
                if (this.f5238z) {
                    my1Var.h(this.f5233u, false);
                    return;
                }
                int i13 = message.what;
                if (i13 != 2) {
                    if (i13 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f5235w = iOException;
                        int i14 = this.f5236x;
                        this.f5236x = i14 + 1;
                        jy1 jy1Var = this.f5233u;
                        Object obj = jy1Var.f7573b.f14387w;
                        Object obj2 = new Object();
                        String str = bq0.f4860a;
                        for (Throwable th = iOException; th != null; th = th.getCause()) {
                            if ((th instanceof va) || (th instanceof FileNotFoundException) || (th instanceof mn1) || (th instanceof f0) || ((th instanceof pg1) && ((pg1) th).f9520u == 2008)) {
                                min = -9223372036854775807L;
                                break;
                            }
                        }
                        min = Math.min(i14 * AdError.NETWORK_ERROR_CODE, 5000);
                        if (min == -9223372036854775807L) {
                            c0Var = hq0.A;
                        } else {
                            int s10 = my1Var.s();
                            if (s10 > my1Var.f8489f0) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            if (!my1Var.f8485b0 && ((a3Var = my1Var.T) == null || a3Var.zza() == -9223372036854775807L)) {
                                boolean z9 = my1Var.P;
                                if (z9 && !my1Var.o()) {
                                    my1Var.f8488e0 = true;
                                    c0Var = hq0.f6870z;
                                } else {
                                    my1Var.Y = z9;
                                    my1Var.f8486c0 = 0L;
                                    my1Var.f8489f0 = 0;
                                    for (ry1 ry1Var : my1Var.M) {
                                        ry1Var.k(false);
                                    }
                                    jy1Var.f7576f.f1139v = 0L;
                                    jy1Var.i = 0L;
                                    i12 = 1;
                                    jy1Var.f7578h = true;
                                    jy1Var.f7581l = false;
                                }
                            } else {
                                my1Var.f8489f0 = s10;
                            }
                            c0Var = new c0(i, min);
                        }
                        int i15 = c0Var.f4929u;
                        if (i15 != 0 && i15 != i12) {
                            i10 = 0;
                        } else {
                            i10 = i12;
                        }
                        m mVar = my1Var.f8495x;
                        mVar.s(new xv0(mVar, obj2, new vx1(-1, null, bq0.t(jy1Var.i), bq0.t(my1Var.U)), iOException, i10 ^ 1));
                        int i16 = c0Var.f4929u;
                        if (i16 == 3) {
                            hq0Var.f6874x = this.f5235w;
                            return;
                        }
                        if (i16 != 2) {
                            if (i16 == 1) {
                                this.f5236x = 1;
                            }
                            long j10 = c0Var.f4930v;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f5236x - 1) * AdError.NETWORK_ERROR_CODE, 5000);
                            }
                            hq0 hq0Var2 = this.B;
                            if (((d0) hq0Var2.f6873w) == null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            b80.K(z3);
                            hq0Var2.f6873w = this;
                            if (j10 > 0) {
                                sendEmptyMessageDelayed(1, j10);
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                try {
                    my1Var.j(this.f5233u);
                    return;
                } catch (RuntimeException e) {
                    x21.P("LoadTask", "Unexpected exception handling load completed", e);
                    this.B.f6874x = new f0(e);
                    return;
                }
            }
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            synchronized (this) {
                z3 = this.f5238z;
                this.f5237y = Thread.currentThread();
            }
            if (!z3) {
                jy1 jy1Var = this.f5233u;
                String simpleName = jy1Var.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(simpleName.length() + 5);
                sb2.append("load:");
                sb2.append(simpleName);
                Trace.beginSection(sb2.toString());
                try {
                    jy1Var.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f5237y = null;
                Thread.interrupted();
            }
            if (!this.A) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.A) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e8) {
            if (!this.A) {
                x21.P("LoadTask", "Unexpected exception loading stream", e8);
                obtainMessage(3, new f0(e8)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.A) {
                x21.P("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new f0(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.A) {
                x21.P("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
