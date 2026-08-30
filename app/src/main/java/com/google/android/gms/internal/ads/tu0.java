package com.google.android.gms.internal.ads;
import l9.f;
import l9.i;
import wa.l9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class tu0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11449a;

    public /* synthetic */ tu0(int i) {
        this.f11449a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f11449a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        b80.M = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            b80.M = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                synchronized (f.f20042b) {
                    f.f20043c = false;
                    f.f20044d = false;
                    i.f("Ad debug logging enablement is out of date.");
                }
                l9.a(context);
                return;
        }
    }
}
