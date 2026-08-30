package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import x.n;

import java.util.Iterator;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class ix implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr f14492b;

    public /* synthetic */ ix(tr trVar, int i) {
        this.f14491a = i;
        this.f14492b = trVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f14491a) {
            case 0:
                fh fhVar = (fh) obj;
                Iterator it = this.f14492b.T().iterator();
                while (true) {
                    if (it.hasNext()) {
                        or orVar = (or) it.next();
                        if (orVar.D().equals(fhVar.w())) {
                            mn mnVar = ip.zza;
                            if (mnVar.f14671a == ((nn) fhVar.q(6, null))) {
                                ln lnVar = mnVar.f14674d;
                                if (fhVar.zza.f14195a.get(lnVar) != null) {
                                    if (mnVar.f14671a == ((nn) fhVar.q(6, null))) {
                                        Object obj2 = fhVar.zza.f14195a.get(lnVar);
                                        if (obj2 == null) {
                                            obj2 = mnVar.f14672b;
                                        } else if (lnVar.f14605v.f14377u == hp.B) {
                                            throw null;
                                        }
                                        ip ipVar = (ip) obj2;
                                        nr nrVar = (nr) orVar.g();
                                        long t3 = ipVar.t();
                                        nrVar.b();
                                        or.H((or) nrVar.f14430v, t3);
                                        long u9 = ipVar.u();
                                        nrVar.b();
                                        or.J((or) nrVar.f14430v, u9);
                                        return (or) nrVar.i();
                                    }
                                    q.x.n("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                } else {
                                    return orVar;
                                }
                            } else {
                                q.x.n("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                            }
                        }
                    } else {
                        q.x.n("DataFileGroupInternal does not contain DataFile with fileId: ".concat(String.valueOf(fhVar.w())));
                    }
                }
                return null;
            default:
                return nw.e((or) obj, this.f14492b.y());
        }
    }
}
