package com.google.android.gms.internal.ads;
import k6.i;
import k9.a0;
import l9.i;
import p.a;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
public final class xq implements mp {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12602u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f12603v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f12604w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f12605x;

    public xq(wa0 wa0Var, ra0 ra0Var, rc0 rc0Var, pr1 pr1Var) {
        this.f12603v = (oo) wa0Var.f12203g.get(ra0Var.g());
        this.f12604w = rc0Var;
        this.f12605x = pr1Var;
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        switch (this.f12602u) {
            case 0:
                a0.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                dr drVar = (dr) this.f12605x;
                synchronized (drVar.f5484c) {
                    try {
                        a0.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        i.e("JS Engine is requesting an update");
                        if (drVar.f5483b == 0) {
                            i.e("Starting reload.");
                            drVar.f5483b = 2;
                            drVar.c();
                        }
                        ((uq) this.f12603v).e("/requestReload", (xq) ((i) this.f12604w).f19569v);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                a0.k("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((oo) this.f12603v).M3((ko) ((pr1) this.f12605x).zzb(), str);
                    return;
                } catch (RemoteException e) {
                    String o10 = a.o(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, ".");
                    int i = a0.f19634b;
                    i.g(o10, e);
                    return;
                }
        }
    }

    public xq(dr drVar, uq uqVar, i iVar) {
        this.f12603v = uqVar;
        this.f12604w = iVar;
        this.f12605x = drVar;
    }
}
