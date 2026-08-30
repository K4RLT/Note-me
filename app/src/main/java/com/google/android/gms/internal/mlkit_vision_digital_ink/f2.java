package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.a;
import q1.c;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class f2 implements m2 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14291u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f14292v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f14293w;

    public /* synthetic */ f2(Object obj, int i, Object obj2) {
        this.f14291u = i;
        this.f14292v = obj;
        this.f14293w = obj2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.m2
    public final Object l(Object obj) {
        switch (this.f14291u) {
            case 0:
                e2 c10 = c(a(), (e2) this.f14292v);
                try {
                    return ((m2) this.f14293w).l(obj);
                } finally {
                }
            case 1:
                e5 e5Var = (e5) obj;
                k5 k3 = ((e5) this.f14292v).entrySet().k();
                while (true) {
                    j4 j4Var = (j4) this.f14293w;
                    if (k3.hasNext()) {
                        Map.Entry entry = (Map.Entry) k3.next();
                        ls lsVar = (ls) entry.getValue();
                        if (lsVar != null && e5Var.containsKey(lsVar)) {
                            j4Var.a((or) entry.getKey(), (Uri) e5Var.get(lsVar));
                        }
                    } else {
                        return j4Var.c(false);
                    }
                }
                break;
            case 2:
                zr zrVar = (zr) ((cs) obj).g();
                String str = (String) this.f14292v;
                tr trVar = (tr) this.f14293w;
                str.getClass();
                trVar.getClass();
                zrVar.b();
                cs.v((cs) zrVar.f14430v).put(str, trVar);
                return (cs) zrVar.i();
            case 3:
                pv pvVar = (pv) this.f14292v;
                n4 n4Var = (n4) this.f14293w;
                rs rsVar = (rs) obj;
                j4 j4Var2 = new j4(4);
                k5 k4 = n4Var.k();
                while (k4.hasNext()) {
                    ls lsVar2 = (ls) k4.next();
                    os osVar = (os) rsVar.x().get(gn.s(lsVar2, pvVar.f14816a));
                    if (osVar != null) {
                        j4Var2.a(lsVar2, osVar);
                    }
                }
                return j4Var2.c(false);
            default:
                ps psVar = (ps) ((rs) obj).g();
                psVar.l((os) this.f14293w, (String) this.f14292v);
                return (rs) psVar.i();
        }
    }

    public String toString() {
        switch (this.f14291u) {
            case 0:
                return "propagating=[" + ((m2) this.f14293w) + "]";
            default:
                return super.toString();
        }
    }
}
