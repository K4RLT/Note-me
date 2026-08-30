package ba;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import wa.h8;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ib.a, ib.g {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d f3123v = new d(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d f3124w = new d(1);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ d f3125x = new d(2);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3126u;

    public /* synthetic */ d(int i) {
        this.f3126u = i;
    }

    @Override // ib.a
    public Object g(ib.o oVar) {
        switch (this.f3126u) {
            case 0:
                if (oVar.l()) {
                    return (Bundle) oVar.j();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(oVar.i())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", oVar.i());
            default:
                Intent intent = (Intent) ((Bundle) oVar.j()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }

    @Override // ib.g
    public ib.o q(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = b.f3114h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return h8.e(null);
        }
        return h8.e(bundle);
    }
}
