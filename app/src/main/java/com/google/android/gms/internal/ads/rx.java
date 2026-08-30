package com.google.android.gms.internal.ads;
import c4.i;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class rx implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10328a;

    /* renamed from: b, reason: collision with root package name */
    public final fu f10329b;

    public rx(fu fuVar, Handler handler) {
        this.f10329b = fuVar;
        Looper looper = handler.getLooper();
        String str = bq0.f4860a;
        this.f10328a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        c4.i iVar = new c4.i(this, i, 3);
        String str = bq0.f4860a;
        Handler handler = this.f10328a;
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return;
        }
        if (looper == Looper.myLooper()) {
            iVar.run();
        } else {
            handler.post(iVar);
        }
    }
}
