package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class sy implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f11193a;

    /* renamed from: b, reason: collision with root package name */
    public final iy f11194b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11195c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11196d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public float f11197f = 1.0f;

    public sy(Context context, iy iyVar) {
        this.f11193a = (AudioManager) context.getSystemService("audio");
        this.f11194b = iyVar;
    }

    public final void a() {
        boolean z3 = this.f11196d;
        iy iyVar = this.f11194b;
        boolean z9 = false;
        AudioManager audioManager = this.f11193a;
        if (z3 && !this.e && this.f11197f > 0.0f) {
            if (!this.f11195c) {
                if (audioManager != null) {
                    if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                        z9 = true;
                    }
                    this.f11195c = z9;
                }
                iyVar.t();
                return;
            }
            return;
        }
        if (this.f11195c) {
            if (audioManager != null) {
                if (audioManager.abandonAudioFocus(this) == 0) {
                    z9 = true;
                }
                this.f11195c = z9;
            }
            iyVar.t();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        boolean z3;
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f11195c = z3;
        this.f11194b.t();
    }
}
