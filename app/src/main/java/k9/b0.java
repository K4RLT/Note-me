package k9;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.fn;

/* loaded from: classes.dex */
public final class b0 extends bb.a {
    @Override // bb.a
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            f9.k kVar = f9.k.C;
            f0 f0Var = kVar.f16813c;
            Context context = kVar.f16817h.e;
            if (context != null) {
                try {
                    if (((Boolean) fn.f6128b.p()).booleanValue()) {
                        la.b.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            f9.k.C.f16817h.d("AdMobHandler.handleMessage", e);
        }
    }
}
