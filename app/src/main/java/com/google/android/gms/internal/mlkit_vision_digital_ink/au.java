package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import q1.b;

import com.google.android.gms.internal.ads.wd0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class au implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.hb f14033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f14034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fs f14035d;

    public /* synthetic */ au(com.google.android.gms.internal.ads.hb hbVar, tr trVar, fs fsVar) {
        this.f14032a = 3;
        this.f14033b = hbVar;
        this.f14034c = trVar;
        this.f14035d = fsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        int i = this.f14032a;
        int i10 = 8;
        int i11 = 1;
        int i12 = 0;
        int i13 = 3;
        tr trVar = this.f14034c;
        fs fsVar = this.f14035d;
        com.google.android.gms.internal.ads.hb hbVar = this.f14033b;
        switch (i) {
            case 0:
                return ((qu) hbVar.f6650v).e(fsVar, trVar);
            case 1:
                ce ceVar = (ce) obj;
                if (ceVar == ce.f14159u) {
                    return va.f15125v;
                }
                trVar.getClass();
                ya m4 = n5.m(Boolean.TRUE);
                if (ceVar != ce.f14160v) {
                    m4 = ((qu) hbVar.f6650v).d(fsVar);
                }
                ju juVar = new ju(fsVar);
                Executor executor = (Executor) hbVar.f6653y;
                int i14 = g2.f14354a;
                return n5.q(m4, new r0(b(), i13, juVar), executor);
            case 2:
                lx w10 = lx.w(((qu) hbVar.f6650v).a(fsVar));
                ys ysVar = new ys(6);
                Executor executor2 = (Executor) hbVar.f6653y;
                lx x9 = w10.x(ysVar, executor2);
                return x9.y(new au(hbVar, fsVar, trVar, 7), executor2).y(new r0(fsVar, i10, x9), executor2);
            case 3:
                tr trVar2 = (tr) obj;
                if (trVar2 != null) {
                    return n5.m(com.google.android.gms.internal.ads.hb.k(trVar, trVar2));
                }
                es esVar = (es) fsVar.g();
                esVar.l(true);
                ya a10 = ((qu) hbVar.f6650v).a((fs) esVar.i());
                ot otVar = new ot(trVar, 2);
                Executor executor3 = (Executor) hbVar.f6653y;
                int i15 = g2.f14354a;
                return n5.q(a10, new r0(b(), i13, otVar), executor3);
            case 4:
                es esVar2 = (es) fsVar.g();
                esVar2.l(false);
                ya a11 = ((qu) hbVar.f6650v).a((fs) esVar2.i());
                au auVar = new au(hbVar, trVar, fsVar);
                int i16 = g2.f14354a;
                return n5.q(a11, new r0(b(), i13, auVar), (Executor) hbVar.f6653y);
            case 5:
                q2 q2Var = (q2) obj;
                if (!q2Var.c()) {
                    cx.c("%s: Received duplicate config for group: %s", "FileGroupManager", fsVar.w());
                    return n5.m(Boolean.FALSE);
                }
                if (f7.q(trVar)) {
                    int i17 = h8.f14398a;
                    i8 t3 = g8.f14365a.t();
                    t3.b(trVar.S());
                    t3.b("|");
                    t3.b(fsVar.v());
                    t3.b("|");
                    ((ByteBuffer) t3.f14470d).putLong(trVar.D());
                    t3.d(8);
                    String n10 = wd0.n(trVar.P(), "_", t3.c().toString());
                    rr rrVar = (rr) trVar.g();
                    rrVar.b();
                    tr.v((tr) rrVar.f14430v, n10);
                    trVar = (tr) rrVar.i();
                }
                es esVar3 = (es) fsVar.g();
                esVar3.l(false);
                ya a12 = ((qu) hbVar.f6650v).a((fs) esVar3.i());
                ot otVar2 = new ot(hbVar, trVar);
                Executor executor4 = (Executor) hbVar.f6653y;
                int i18 = g2.f14354a;
                return n5.q(n5.q(a12, new r0(b(), i13, otVar2), executor4), new r0(b(), i13, new c1(11, hbVar, fsVar, q2Var)), executor4);
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    es esVar4 = (es) fsVar.g();
                    esVar4.l(false);
                    fs fsVar2 = (fs) esVar4.i();
                    ya a13 = ((qu) hbVar.f6650v).a(fsVar2);
                    lx w11 = lx.w(a13);
                    au auVar2 = new au(hbVar, fsVar2, trVar, i12);
                    Executor executor5 = (Executor) hbVar.f6653y;
                    lx y10 = w11.y(auVar2, executor5).y(new t0(i13), executor5).y(new qt(hbVar, trVar, i11), executor5).y(new r0(hbVar, 9, a13), executor5);
                    qt qtVar = new qt(hbVar, trVar, fsVar);
                    int i19 = g2.f14354a;
                    return n5.q(y10, new r0(b(), i13, qtVar), executor5);
                }
                x.p("Subscribing to group failed");
                return null;
            default:
                return ((qu) hbVar.f6650v).e(fsVar, trVar);
        }
    }

    public /* synthetic */ au(com.google.android.gms.internal.ads.hb hbVar, fs fsVar, tr trVar, int i) {
        this.f14032a = i;
        this.f14033b = hbVar;
        this.f14035d = fsVar;
        this.f14034c = trVar;
    }

    public /* synthetic */ au(com.google.android.gms.internal.ads.hb hbVar, ow owVar, tr trVar, fs fsVar) {
        this.f14032a = 1;
        this.f14033b = hbVar;
        this.f14034c = trVar;
        this.f14035d = fsVar;
    }
}
