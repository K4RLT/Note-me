package k9;
import f.c;

import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.eb;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.yx;
import java.util.Map;

/* loaded from: classes.dex */
public final class q extends gb {
    public final yx G;
    public final l9.f H;

    public q(String str, yx yxVar) {
        super(0, str, new k6.i(1, yxVar));
        this.G = yxVar;
        l9.f fVar = new l9.f();
        this.H = fVar;
        if (!l9.c()) {
            return;
        }
        fVar.e("onNetworkRequest", new nd.o(str, "GET", null, null));
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final com.google.android.gms.internal.ads.d h(eb ebVar) {
        return new com.google.android.gms.internal.ads.d(ebVar, b80.f(ebVar));
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final void i(Object obj) {
        eb ebVar = (eb) obj;
        Map map = ebVar.f5632c;
        int i = ebVar.f5630a;
        l9.f fVar = this.H;
        fVar.getClass();
        if (l9.c()) {
            fVar.e("onNetworkResponse", new c7.x(i, map));
            if (i < 200 || i >= 300) {
                fVar.e("onNetworkRequestError", new c4.s((String) null, 5));
            }
        }
        byte[] bArr = ebVar.f5631b;
        if (l9.c() && bArr != null) {
            fVar.e("onNetworkResponseBody", new ic.c(9, bArr));
        }
        this.G.b(ebVar);
    }
}
