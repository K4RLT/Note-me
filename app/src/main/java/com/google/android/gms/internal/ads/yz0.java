package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final class yz0 extends c01 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13016f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f13017g;

    public yz0(wd wdVar, pz0 pz0Var, rx0 rx0Var, h21 h21Var) {
        super("Sg9wh/uRZZt11trI0/ArQR457JKvhvXPZq07aU70olp83YOM+BSyiAIXktC8LJHR", "EzsZPxHde//8PaxXqjETRoZ/+tCf60bKZdwrCpNCQLk=", wdVar, pz0Var, h21Var.a(116));
        this.f13017g = rx0Var;
    }

    @Override // com.google.android.gms.internal.ads.c01
    public final void a(Method method, wd wdVar) {
        switch (this.f13016f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", ((rx0) this.f13017g).Q());
                objArr.getClass();
                synchronized (wdVar) {
                    String str = (String) objArr[0];
                    wdVar.b();
                    ((je) wdVar.f4845v).E0(str);
                    String str2 = (String) objArr[1];
                    wdVar.b();
                    ((je) wdVar.f4845v).k0(str2);
                }
                return;
            default:
                Map map = (Map) this.f13017g;
                Object[] objArr2 = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr2.getClass();
                synchronized (wdVar) {
                    long longValue = ((Long) objArr2[0]).longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).I0(longValue);
                    long longValue2 = ((Long) objArr2[1]).longValue();
                    if (longValue2 >= 0) {
                        wdVar.b();
                        ((je) wdVar.f4845v).g0(longValue2);
                    }
                    long longValue3 = ((Long) objArr2[2]).longValue();
                    if (longValue3 >= 0) {
                        wdVar.b();
                        ((je) wdVar.f4845v).h0(longValue3);
                    }
                }
                return;
        }
    }

    public yz0(wd wdVar, pz0 pz0Var, Map map, h21 h21Var) {
        super("lgB22o3+xtO6b1PB1kHO8Agbi+6HbLXaRU20SARWIrq6m129Ofvaya/yhX25r56V", "Rqk2tq5zRAYapYluu1wAppyX64RE9M13E2H+pIaATIY=", wdVar, pz0Var, h21Var.a(118));
        this.f13017g = map;
    }
}
