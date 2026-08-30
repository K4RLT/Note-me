package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.time.Instant;

/* loaded from: classes.dex */
public final /* synthetic */ class ot implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr f14760b;

    public /* synthetic */ ot(com.google.android.gms.internal.ads.hb hbVar, tr trVar) {
        this.f14759a = 0;
        this.f14760b = trVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        Instant now;
        long epochMilli;
        Object k3;
        switch (this.f14759a) {
            case 0:
                tr trVar = (tr) obj;
                tr trVar2 = this.f14760b;
                if (trVar == null || !trVar2.T().equals(trVar.T())) {
                    now = Instant.now();
                    epochMilli = now.toEpochMilli();
                } else {
                    epochMilli = trVar.H().w();
                }
                pr prVar = (pr) trVar2.H().g();
                prVar.b();
                qr.B((qr) prVar.f14430v, epochMilli);
                qr qrVar = (qr) prVar.i();
                rr rrVar = (rr) trVar2.g();
                rrVar.l(qrVar);
                return n5.m((tr) rrVar.i());
            case 1:
                cx.i("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", this.f14760b.P());
                return n5.m(ds.NONE);
            default:
                tr trVar3 = (tr) obj;
                if (trVar3 == null) {
                    k3 = new s2(c9.GROUP_NOT_FOUND);
                } else {
                    k3 = com.google.android.gms.internal.ads.hb.k(this.f14760b, trVar3);
                }
                return n5.m(k3);
        }
    }

    public /* synthetic */ ot(tr trVar, int i) {
        this.f14759a = i;
        this.f14760b = trVar;
    }
}
