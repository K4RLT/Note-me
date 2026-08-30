package wa;
import d.d;
import c.a;
import c7.t;
import na.b;
import pa.d;
import va.o;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ja {

    /* renamed from: j, reason: collision with root package name */
    public static sa f29709j;

    /* renamed from: k, reason: collision with root package name */
    public static final xa f29710k;

    /* renamed from: a, reason: collision with root package name */
    public final String f29711a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29712b;

    /* renamed from: c, reason: collision with root package name */
    public final ia f29713c;

    /* renamed from: d, reason: collision with root package name */
    public final de.k f29714d;
    public final ib.o e;

    /* renamed from: f, reason: collision with root package name */
    public final ib.o f29715f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29716g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29717h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f29710k = new xa(objArr, 0);
    }

    public ja(Context context, de.k kVar, ia iaVar) {
        int i;
        new HashMap();
        this.f29711a = context.getPackageName();
        this.f29712b = de.a(context);
        this.f29714d = kVar;
        this.f29713c = iaVar;
        b();
        this.f29716g = "vision-common";
        de.e a10 = de.e.a();
        t tVar = new t(7, this);
        a10.getClass();
        this.e = de.e.b(tVar);
        de.e a11 = de.e.a();
        kVar.getClass();
        o oVar = new o(kVar, 1);
        a11.getClass();
        this.f29715f = de.e.b(oVar);
        xa xaVar = f29710k;
        if (xaVar.containsKey("vision-common")) {
            i = d.d(context, (String) xaVar.get("vision-common"), false);
        } else {
            i = -1;
        }
        this.f29717h = i;
    }
}
