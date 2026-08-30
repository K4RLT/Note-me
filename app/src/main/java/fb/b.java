package fb;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import da.g;
import da.h;
import ea.l;
import fa.o;
import g9.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16933a;

    public da.c a(Context context, Looper looper, n nVar, Object obj, g gVar, h hVar) {
        switch (this.f16933a) {
            case 0:
                nVar.getClass();
                Integer num = (Integer) nVar.A;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new gb.a(context, looper, nVar, bundle, gVar, hVar);
            case 1:
                throw p.a.f(obj);
            default:
                l lVar = (l) gVar;
                l lVar2 = (l) hVar;
                switch (this.f16933a) {
                    case 2:
                        return new ha.c(context, looper, nVar, (o) obj, lVar, lVar2);
                    case 3:
                        return new fa.h(context, looper, 308, nVar, lVar, lVar2);
                    case 4:
                        return new fa.h(context, looper, 300, nVar, lVar, lVar2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
