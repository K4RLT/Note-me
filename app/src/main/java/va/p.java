package va;
import c.a;
import d.d;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final l f27503b = a(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);

    /* renamed from: a, reason: collision with root package name */
    public final String f27504a;

    public p(Context context, de.k kVar, mc.c cVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        de.a(context);
        synchronized (t.class) {
            if (t.f27509v == null) {
                t.f27509v = new t(0);
            }
        }
        this.f27504a = "common";
        de.e a10 = de.e.a();
        c7.t tVar = new c7.t(6, this);
        a10.getClass();
        de.e.b(tVar);
        de.e a11 = de.e.a();
        Objects.requireNonNull(kVar);
        o oVar = new o(kVar, 0);
        a11.getClass();
        de.e.b(oVar);
        l lVar = f27503b;
        if (lVar.containsKey("common")) {
            pa.d(context, (String) lVar.get("common"), false);
        }
    }
}
