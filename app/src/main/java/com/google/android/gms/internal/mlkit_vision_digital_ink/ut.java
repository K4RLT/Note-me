package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class ut implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.hb f15080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nn f15081c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15082d;
    public final /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15083f;

    public /* synthetic */ ut(com.google.android.gms.internal.ads.hb hbVar, nn nnVar, Object obj, Object obj2, Object obj3, int i) {
        this.f15079a = i;
        this.f15080b = hbVar;
        this.f15081c = nnVar;
        this.f15082d = obj;
        this.e = obj2;
        this.f15083f = obj3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        Instant now;
        long epochMilli;
        int i;
        int i10 = this.f15079a;
        Object obj2 = this.f15083f;
        Object obj3 = this.e;
        Object obj4 = this.f15082d;
        nn nnVar = this.f15081c;
        switch (i10) {
            case 0:
                final com.google.android.gms.internal.ads.hb hbVar = this.f15080b;
                Executor executor = (Executor) hbVar.f6653y;
                fs fsVar = (fs) nnVar;
                AtomicReference atomicReference = (AtomicReference) obj4;
                vr vrVar = (vr) obj3;
                ea eaVar = (ea) obj2;
                tr trVar = (tr) obj;
                if (trVar == null) {
                    ya s10 = hbVar.s(fsVar, true);
                    r0 r0Var = new r0(fsVar, 10, atomicReference);
                    int i11 = g2.f14354a;
                    return n5.q(s10, new r0(q1.b(), 3, r0Var), executor);
                }
                atomicReference.set(trVar);
                qr H = trVar.H();
                int t3 = H.t() + 1;
                rr rrVar = (rr) trVar.g();
                pr prVar = (pr) H.g();
                prVar.b();
                qr.y((qr) prVar.f14430v, t3);
                rrVar.b();
                tr.u((tr) rrVar.f14430v, (qr) prVar.i());
                tr trVar2 = (tr) rrVar.i();
                boolean F = H.F();
                final boolean z3 = !F;
                if (!F) {
                    now = Instant.now();
                    epochMilli = now.toEpochMilli();
                    pr prVar2 = (pr) trVar2.H().g();
                    prVar2.b();
                    qr.z((qr) prVar2.f14430v, epochMilli);
                    qr qrVar = (qr) prVar2.i();
                    rr rrVar2 = (rr) trVar2.g();
                    rrVar2.l(qrVar);
                    trVar2 = (tr) rrVar2.i();
                }
                final ya m4 = n5.m(trVar2);
                if (!F) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = trVar2.T().iterator();
                    while (it.hasNext()) {
                        arrayList.add(hbVar.n((or) it.next(), trVar2));
                    }
                    h4 s11 = h4.s(arrayList);
                    f1 f1Var = new f1(4, arrayList);
                    int i12 = g2.f14354a;
                    com.google.android.gms.internal.ads.xe xeVar = new com.google.android.gms.internal.ads.xe(q1.b(), 14, f1Var);
                    ha haVar = new ha(s11, true);
                    haVar.H = new ga(haVar, xeVar, executor, 1);
                    haVar.w();
                    m4 = lx.w(haVar).x(new at(trVar2, 1), executor);
                }
                return lx.w(lx.w(m4).y(new wt(hbVar, fsVar, 0), executor).y(new ea(hbVar, z3, m4) { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.xt

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ boolean f15247a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ya f15248b;

                    {
                        this.f15247a = z3;
                        this.f15248b = m4;
                    }

                    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                    public final ya l(Object obj5) {
                        if (!((Boolean) obj5).booleanValue()) {
                            return n5.l(new IOException("Unable to update file group metadata"));
                        }
                        boolean z9 = this.f15247a;
                        ya yaVar = this.f15248b;
                        if (z9) {
                            ((tr) n5.r(yaVar)).getClass();
                        }
                        return n5.m((tr) n5.r(yaVar));
                    }
                }, executor)).v(IOException.class, new t0(4), executor).y(new du(hbVar, vrVar, fsVar, eaVar, 0), executor);
            case 1:
                final com.google.android.gms.internal.ads.hb hbVar2 = this.f15080b;
                Executor executor2 = (Executor) hbVar2.f6653y;
                final or orVar = (or) nnVar;
                final tr trVar3 = (tr) obj4;
                os osVar = (os) obj3;
                final ls lsVar = (ls) obj2;
                ou ouVar = (ou) obj;
                cx.b("%s: Android sharing CASE: %s for file %s, filegroup %s", "FileGroupManager", ouVar.name(), orVar.D(), trVar3.P());
                int ordinal = ouVar.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            i = 2;
                        } else {
                            if (orVar.t() == 2) {
                                return hbVar2.w(trVar3, orVar, lsVar, osVar, 7);
                            }
                            i = 2;
                        }
                        if (orVar.t() == i) {
                            com.google.android.gms.internal.ads.hb.x(trVar3, orVar, 16);
                        }
                        cx.b("%s: File couldn't be shared after download %s, filegroup %s", "FileGroupManager", orVar.D(), trVar3.P());
                        return hbVar2.q(trVar3, orVar, lsVar, trVar3.E());
                    }
                    final int i13 = 5;
                    ya j10 = hbVar2.j(trVar3, orVar, osVar, lsVar, orVar.A(), trVar3.E(), 5);
                    ea eaVar2 = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.lu
                        @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                        public final ya l(Object obj5) {
                            if (!((Boolean) obj5).booleanValue() && i13 != 4) {
                                tr trVar4 = trVar3;
                                return hbVar2.q(trVar4, orVar, lsVar, trVar4.E());
                            }
                            return va.f15125v;
                        }
                    };
                    int i14 = g2.f14354a;
                    return n5.q(j10, new r0(q1.b(), 3, eaVar2), executor2);
                }
                final long E = trVar3.E();
                if (E > osVar.u()) {
                    cx.b("%s: File already shared after downloaded but lease has to be updated for file %s, filegroup %s", "FileGroupManager", orVar.D(), trVar3.P());
                    ya j11 = hbVar2.j(trVar3, orVar, osVar, lsVar, osVar.z(), E, 27);
                    ea eaVar3 = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.fu
                        @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                        public final ya l(Object obj5) {
                            if (!((Boolean) obj5).booleanValue()) {
                                return com.google.android.gms.internal.ads.hb.this.q(trVar3, orVar, lsVar, E);
                            }
                            return va.f15125v;
                        }
                    };
                    int i15 = g2.f14354a;
                    return n5.q(j11, new r0(q1.b(), 3, eaVar3), executor2);
                }
                return va.f15125v;
            default:
                final com.google.android.gms.internal.ads.hb hbVar3 = this.f15080b;
                Executor executor3 = (Executor) hbVar3.f6653y;
                final or orVar2 = (or) nnVar;
                final tr trVar4 = (tr) obj4;
                final ls lsVar2 = (ls) obj2;
                ou ouVar2 = (ou) obj;
                cx.b("%s: Android sharing CASE: %s for file %s, filegroup %s", "FileGroupManager", ouVar2.name(), orVar2.D(), trVar4.P());
                os osVar2 = (os) n5.r((e9) obj3);
                int ordinal2 = ouVar2.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 4 && osVar2.v() == ds.DOWNLOAD_COMPLETE && orVar2.t() == 2) {
                            return hbVar3.w(trVar4, orVar2, lsVar2, osVar2, 6);
                        }
                        cx.b("%s: File couldn't be shared before download %s, filegroup %s", "FileGroupManager", orVar2.D(), trVar4.P());
                        return va.f15125v;
                    }
                    final int i16 = 4;
                    ya j12 = hbVar3.j(trVar4, orVar2, osVar2, lsVar2, orVar2.A(), trVar4.E(), 4);
                    ea eaVar4 = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.lu
                        @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                        public final ya l(Object obj5) {
                            if (!((Boolean) obj5).booleanValue() && i16 != 4) {
                                tr trVar42 = trVar4;
                                return hbVar3.q(trVar42, orVar2, lsVar2, trVar42.E());
                            }
                            return va.f15125v;
                        }
                    };
                    int i17 = g2.f14354a;
                    return n5.q(j12, new r0(q1.b(), 3, eaVar4), executor3);
                }
                ya j13 = hbVar3.j(trVar4, orVar2, osVar2, lsVar2, osVar2.z(), trVar4.E(), 3);
                t0 t0Var = new t0(5);
                int i18 = g2.f14354a;
                return n5.q(j13, new r0(q1.b(), 3, t0Var), executor3);
        }
    }
}
