package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wu1 extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pu f12336a;

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f12336a.l();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        pu puVar;
        String str = bq0.f4860a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            puVar = this.f12336a;
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], (AudioDeviceInfo) puVar.D)) {
                puVar.D = null;
                break;
            }
            i++;
        }
        puVar.l();
    }
}
