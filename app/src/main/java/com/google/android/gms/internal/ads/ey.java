package com.google.android.gms.internal.ads;
import a7.a;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ey {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f5855a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5856b;

    /* renamed from: c, reason: collision with root package name */
    public final l50 f5857c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5858d;

    public ey(fu fuVar, Handler handler, l50 l50Var) {
        AudioFocusRequest audioFocusRequest;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        this.f5856b = handler;
        this.f5857c = l50Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            this.f5855a = new rx(fuVar, handler);
        } else {
            this.f5855a = fuVar;
        }
        if (i >= 26) {
            audioAttributes = a.i().setAudioAttributes(l50Var.a());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(false);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(fuVar, handler);
            acceptsDelayedFocusGain = onAudioFocusChangeListener.setAcceptsDelayedFocusGain(true);
            audioFocusRequest = acceptsDelayedFocusGain.build();
        } else {
            audioFocusRequest = null;
        }
        this.f5858d = audioFocusRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey)) {
            return false;
        }
        ey eyVar = (ey) obj;
        if (Objects.equals(this.f5855a, eyVar.f5855a) && Objects.equals(this.f5856b, eyVar.f5856b) && Objects.equals(this.f5857c, eyVar.f5857c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(1, this.f5855a, this.f5856b, this.f5857c, Boolean.FALSE);
    }
}
