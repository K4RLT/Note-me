package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.ads.iv1;
import java.util.HashMap;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class sl implements ee.c {

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f14972g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final dt f14973a;

    /* renamed from: b, reason: collision with root package name */
    public final ab f14974b;

    /* renamed from: c, reason: collision with root package name */
    public final i f14975c;

    /* renamed from: d, reason: collision with root package name */
    public final j6.n f14976d;
    public final le.a e;

    /* renamed from: f, reason: collision with root package name */
    public final na f14977f;

    public sl(Context context, j6.n nVar, le.a aVar) {
        na oaVar;
        this.f14976d = nVar;
        this.e = aVar;
        ab b10 = f7.b(Executors.newCachedThreadPool());
        this.f14974b = b10;
        kx kxVar = new kx(context);
        i c10 = c(context, kxVar);
        this.f14975c = c10;
        this.f14973a = b(context, "mlkit_digital_ink_recognition", kxVar, c10, d(b10, c10), b10);
        b6.r.b(context);
        Log.i("MddModelManager", "Start initialization");
        ya f10 = f7.b(b10).f(new f1(3, this));
        int i = na.B;
        if (f10 instanceof na) {
            oaVar = (na) f10;
        } else {
            oaVar = new oa(f10);
        }
        w9 q10 = n5.q(oaVar, new p0(2, this), b10);
        q10.g(new ra(q10, 0, new jm(17)), ia.f14473u);
        this.f14977f = q10;
    }

    public static synchronized dt b(Context context, String str, kx kxVar, i iVar, u0 u0Var, ab abVar) {
        dt dtVar;
        synchronized (sl.class) {
            try {
                HashMap hashMap = f14972g;
                if (!hashMap.containsKey(str)) {
                    us usVar = new us();
                    usVar.f15069b = context.getApplicationContext();
                    str.getClass();
                    usVar.f15076k = new s2(str);
                    usVar.f15071d = j2.f14494u;
                    usVar.f15070c = abVar;
                    usVar.i = u0Var;
                    usVar.f15074h = gn.b(new vl(abVar, context, iVar));
                    usVar.e = iVar;
                    usVar.f15072f = kxVar;
                    hashMap.put(str, usVar.a());
                }
                dtVar = (dt) hashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dtVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.b4, com.google.android.gms.internal.mlkit_vision_digital_ink.d4] */
    public static i c(Context context, kx kxVar) {
        e4 e4Var = h4.f14393v;
        com.google.android.gms.internal.mlkit_vision_digital_ink.d4 b4Var = new b4(4);
        b4Var.a(new k(new ew(context, 1)));
        if (Build.VERSION.SDK_INT >= 30) {
            b4Var.a(new q(context));
        }
        return new i(b4Var.d(), h4.u(new Object()), h4.u(kxVar));
    }

    public static u0 d(ab abVar, i iVar) {
        HashMap hashMap = new HashMap();
        pa.q(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
        hashMap.put("singleproc", d1.f14177a);
        return new u0(abVar, iVar, hashMap);
    }

    @Override // ee.c
    public final ib.o a(je.b bVar, ce.b bVar2) {
        le.a aVar = this.e;
        aVar.getClass();
        le.c cVar = new le.c(aVar.f20332a, 314);
        cVar.f(zb.DOWNLOAD_MODEL_STARTED);
        cVar.d(bVar);
        cVar.g();
        Log.i("MddModelManager", "download(): Download for model ".concat(String.valueOf(bVar)));
        y2 b10 = y2.b(i2.f14454a);
        c1 c1Var = new c1(2, this, bVar2, bVar);
        na naVar = this.f14977f;
        ab abVar = this.f14974b;
        w9 q10 = n5.q(naVar, c1Var, abVar);
        ib.h hVar = new ib.h();
        q10.g(new iv1(hVar, 4, q10), ia.f14473u);
        return hVar.f18363a.h(abVar, new ra.e(this, bVar, bVar2, b10));
    }
}
