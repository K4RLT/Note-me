package com.google.android.gms.internal.ads;
import a5.a;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final /* synthetic */ class fu implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vv f6165a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        vv vvVar = this.f6165a;
        vvVar.getClass();
        if (i != -3 && i != -2) {
            if (i != -1) {
                if (i != 1) {
                    a.t(new StringBuilder(String.valueOf(i).length() + 27), "Unknown focus change type: ", i, "AudioFocusManager");
                    return;
                }
                vvVar.e(2);
                et1 et1Var = vvVar.f12019c;
                if (et1Var != null) {
                    Handler handler = et1Var.A.f7185a;
                    fo0 g8 = io0.g();
                    g8.f6137a = handler.obtainMessage(33, 1, 0);
                    g8.a();
                    return;
                }
                return;
            }
            et1 et1Var2 = vvVar.f12019c;
            if (et1Var2 != null) {
                Handler handler2 = et1Var2.A.f7185a;
                fo0 g10 = io0.g();
                g10.f6137a = handler2.obtainMessage(33, -1, 0);
                g10.a();
            }
            vvVar.d();
            vvVar.e(1);
            return;
        }
        if (i != -2) {
            vvVar.e(4);
            return;
        }
        et1 et1Var3 = vvVar.f12019c;
        if (et1Var3 != null) {
            Handler handler3 = et1Var3.A.f7185a;
            fo0 g11 = io0.g();
            g11.f6137a = handler3.obtainMessage(33, 0, 0);
            g11.a();
        }
        vvVar.e(3);
    }
}
