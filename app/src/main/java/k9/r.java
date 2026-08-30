package k9;
import f.c;
import i0.m;
import r.e;

import android.content.Context;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.wa;
import com.google.android.gms.internal.ads.yx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static hb f19717a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f19718b = new Object();

    public r(Context context) {
        hb hbVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f19718b) {
            try {
                if (f19717a == null) {
                    sl.a(context);
                    if (((Boolean) g9.e.f17698c.a(sl.f10887p5)).booleanValue()) {
                        hbVar = k.u(context);
                    } else {
                        hbVar = new hb(new rb(new j6.c(context.getApplicationContext())), new m(new s6(20)));
                        hbVar.h();
                    }
                    f19717a = hbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [k9.p, com.google.android.gms.internal.ads.yx] */
    public final p a(int i, String str, HashMap hashMap, byte[] bArr) {
        byte[] bArr2;
        yx yxVar = new yx();
        mu muVar = new mu(this, str, (p) yxVar);
        l9.f fVar = new l9.f();
        o oVar = new o(this, i, str, yxVar, muVar, bArr, hashMap, fVar);
        if (l9.c()) {
            try {
                Map e = oVar.e();
                if (bArr == null) {
                    bArr2 = null;
                } else {
                    bArr2 = bArr;
                }
                if (l9.c()) {
                    fVar.e("onNetworkRequest", new nd.o(str, "GET", e, bArr2));
                }
            } catch (wa e8) {
                String message = e8.getMessage();
                int i10 = a0.f19634b;
                l9.i.f(message);
            }
        }
        f19717a.u(oVar);
        return yxVar;
    }
}