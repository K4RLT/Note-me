package com.google.android.gms.internal.ads;
import a7.a;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vv {

    /* renamed from: a, reason: collision with root package name */
    public final r31 f12017a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f12018b;

    /* renamed from: c, reason: collision with root package name */
    public et1 f12019c;

    /* renamed from: d, reason: collision with root package name */
    public l50 f12020d;

    /* renamed from: f, reason: collision with root package name */
    public int f12021f;

    /* renamed from: h, reason: collision with root package name */
    public ey f12023h;

    /* renamed from: g, reason: collision with root package name */
    public float f12022g = 1.0f;
    public int e = 0;

    public vv(Context context, Looper looper, et1 et1Var) {
        this.f12017a = x21.f(new ll(context, 1));
        this.f12019c = et1Var;
        this.f12018b = new Handler(looper);
    }

    public final void a(l50 l50Var) {
        int i;
        if (!Objects.equals(this.f12020d, l50Var)) {
            this.f12020d = l50Var;
            if (l50Var == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f12021f = i;
        }
    }

    public final int b(int i, boolean z3) {
        int volumeControlStream;
        int requestAudioFocus;
        if (i != 1 && this.f12021f == 1) {
            int i10 = this.e;
            int i11 = 3;
            if (z3) {
                if (i10 != 2) {
                    if (this.f12023h == null) {
                        l50 l50Var = l50.f7948b;
                        l50 l50Var2 = this.f12020d;
                        l50Var2.getClass();
                        fu fuVar = new fu(this);
                        Handler handler = this.f12018b;
                        handler.getClass();
                        this.f12023h = new ey(fuVar, handler, l50Var2);
                    }
                    AudioManager audioManager = (AudioManager) this.f12017a.zza();
                    ey eyVar = this.f12023h;
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 26) {
                        Object obj = eyVar.f5858d;
                        obj.getClass();
                        requestAudioFocus = audioManager.requestAudioFocus(a7.a.n(obj));
                    } else {
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = eyVar.f5855a;
                        l50 l50Var3 = eyVar.f5857c;
                        if (i12 >= 26) {
                            try {
                                volumeControlStream = l50Var3.a().getVolumeControlStream();
                                if (volumeControlStream != Integer.MIN_VALUE) {
                                    i11 = volumeControlStream;
                                }
                            } catch (RuntimeException unused) {
                            }
                        }
                        requestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener, i11, 1);
                    }
                    if (requestAudioFocus != 1 && requestAudioFocus != 2) {
                        e(1);
                        return -1;
                    }
                    e(2);
                    return 1;
                }
            } else {
                if (i10 == 1) {
                    return -1;
                }
                if (i10 == 3) {
                    return 0;
                }
            }
            return 1;
        }
        d();
        e(0);
        return 1;
    }

    public final void c() {
        this.f12019c = null;
        d();
        e(0);
    }

    public final void d() {
        int i = this.e;
        if (i != 1 && i != 0 && this.f12023h != null) {
            AudioManager audioManager = (AudioManager) this.f12017a.zza();
            ey eyVar = this.f12023h;
            if (Build.VERSION.SDK_INT >= 26) {
                Object obj = eyVar.f5858d;
                obj.getClass();
                audioManager.abandonAudioFocusRequest(a7.a.n(obj));
                return;
            }
            audioManager.abandonAudioFocus(eyVar.f5855a);
        }
    }

    public final void e(int i) {
        float f10;
        if (this.e != i) {
            this.e = i;
            if (i == 4) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.f12022g != f10) {
                this.f12022g = f10;
                et1 et1Var = this.f12019c;
                if (et1Var != null) {
                    et1Var.A.c(34);
                }
            }
        }
    }
}
