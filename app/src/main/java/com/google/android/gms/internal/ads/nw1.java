package com.google.android.gms.internal.ads;
import b8.e0;
import pf.b0;
import te.g;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class nw1 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8884a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8885b;

    public nw1(g gVar) {
        super(Looper.getMainLooper());
        this.f8885b = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        switch (this.f8884a) {
            case 0:
                pw1 pw1Var = (pw1) this.f8885b;
                pw1Var.getClass();
                int i = message.what;
                ow1 ow1Var = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                AtomicReference atomicReference = pw1Var.f9629x;
                                IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                                while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                                }
                            } else {
                                try {
                                    pw1Var.f9626u.setParameters((Bundle) message.obj);
                                } catch (RuntimeException e) {
                                    AtomicReference atomicReference2 = pw1Var.f9629x;
                                    while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                                    }
                                }
                            }
                        } else {
                            pw1Var.f9630y.a();
                        }
                    } else {
                        ow1 ow1Var2 = (ow1) message.obj;
                        int i10 = ow1Var2.f9252a;
                        MediaCodec.CryptoInfo cryptoInfo = ow1Var2.f9254c;
                        long j10 = ow1Var2.f9255d;
                        int i11 = ow1Var2.e;
                        try {
                            if (Build.VERSION.SDK_INT >= 31) {
                                pw1Var.f9626u.queueSecureInputBuffer(i10, 0, cryptoInfo, j10, i11);
                            } else {
                                synchronized (pw1.B) {
                                    pw1Var.f9626u.queueSecureInputBuffer(i10, 0, cryptoInfo, j10, i11);
                                }
                            }
                        } catch (RuntimeException e8) {
                            AtomicReference atomicReference3 = pw1Var.f9629x;
                            while (!atomicReference3.compareAndSet(null, e8) && atomicReference3.get() == null) {
                            }
                        }
                        ow1Var = ow1Var2;
                    }
                } else {
                    ow1 ow1Var3 = (ow1) message.obj;
                    try {
                        pw1Var.f9626u.queueInputBuffer(ow1Var3.f9252a, 0, ow1Var3.f9253b, ow1Var3.f9255d, ow1Var3.e);
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference4 = pw1Var.f9629x;
                        while (!atomicReference4.compareAndSet(null, e10) && atomicReference4.get() == null) {
                        }
                    }
                    ow1Var = ow1Var3;
                }
                if (ow1Var != null) {
                    ArrayDeque arrayDeque = pw1.A;
                    synchronized (arrayDeque) {
                        arrayDeque.add(ow1Var);
                    }
                    return;
                }
                return;
            default:
                message.getClass();
                if (message.what == 3) {
                    Bundle data = message.getData();
                    if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                        str = "";
                    }
                    Log.d("SessionLifecycleClient", "Session update received: ".concat(str));
                    b0.x(b0.b((g) this.f8885b), null, new e0(3, str, null), 3);
                    return;
                }
                Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(pw1 pw1Var, Looper looper) {
        super(looper);
        this.f8885b = pw1Var;
    }
}
