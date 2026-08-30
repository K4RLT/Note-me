package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
public final class sv1 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq0 f11178a;

    public sv1(hq0 hq0Var) {
        this.f11178a = hq0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ig0 ig0Var = ((tv1) this.f11178a.f6874x).i;
        ig0Var.c(-1, iu1.f7229z);
        ig0Var.d();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        ig0 ig0Var = ((tv1) this.f11178a.f6874x).i;
        ig0Var.c(-1, iu1.f7227x);
        ig0Var.d();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        ig0 ig0Var = ((tv1) this.f11178a.f6874x).i;
        ig0Var.c(-1, iu1.f7228y);
        ig0Var.d();
    }
}
