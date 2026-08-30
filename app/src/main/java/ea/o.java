package ea;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;

/* loaded from: classes.dex */
public final class o extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f16024a;

    /* renamed from: b, reason: collision with root package name */
    public final gw f16025b;

    public o(gw gwVar) {
        this.f16025b = gwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if (!"com.google.android.gms".equals(str)) {
            return;
        }
        Object obj = this.f16025b.f14387w;
        throw null;
    }
}
