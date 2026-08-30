package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class qt implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.hb f14858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f14859c;

    public /* synthetic */ qt(com.google.android.gms.internal.ads.hb hbVar, tr trVar, fs fsVar) {
        this.f14857a = 0;
        this.f14858b = hbVar;
        this.f14859c = trVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        q2 q2Var;
        int i = this.f14857a;
        int i10 = 0;
        tr trVar = this.f14859c;
        com.google.android.gms.internal.ads.hb hbVar = this.f14858b;
        switch (i) {
            case 0:
                q2 q2Var2 = (q2) hbVar.B;
                if (q2Var2.c() && trVar.z() != 1) {
                    ((z2) q2Var2.a()).zza().getClass();
                    g5.q.b();
                    return null;
                }
                return n5.m(Boolean.TRUE);
            case 1:
                zw zwVar = (zw) hbVar.C;
                trVar.getClass();
                zwVar.mo217c();
                return va.f15125v;
            case 2:
                if (f7.q(trVar)) {
                    if (!trVar.w()) {
                        return va.f15125v;
                    }
                    try {
                        Context context = (Context) hbVar.f6649u;
                        q2 q2Var3 = (q2) hbVar.A;
                        i iVar = (i) hbVar.f6652x;
                        Uri h3 = f7.h(context, q2Var3, trVar);
                        if (iVar.g(h3)) {
                        }
                        un T = trVar.T();
                        Iterator<E> it = T.iterator();
                        it.getClass();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((or) next).t() == 2) {
                                    next.getClass();
                                    q2Var = new s2(next);
                                }
                            } else {
                                q2Var = j2.f14494u;
                            }
                        }
                        if (q2Var.c()) {
                            return n5.l(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing"));
                        }
                        e5 y10 = hbVar.y(trVar);
                        lx t3 = hbVar.t(trVar);
                        c1 c1Var = new c1(8, hbVar, T, y10);
                        Executor executor = (Executor) hbVar.f6653y;
                        int i11 = g2.f14354a;
                        w9 q10 = n5.q(t3, new r0(q1.b(), 3, c1Var), executor);
                        q10.g(new ra(q10, i10, new pw(q1.b(), 12, new gw(13, hbVar, trVar, false))), executor);
                        return q10;
                    } catch (IOException e) {
                        int i12 = jr.f14529v;
                        ra.e eVar = new ra.e(21, false);
                        eVar.f24675v = vq.UNABLE_TO_REMOVE_SYMLINK_STRUCTURE;
                        eVar.f24676w = "Unable to cleanup symlink structure";
                        eVar.f24677x = e;
                        return n5.l(eVar.C());
                    }
                }
                return va.f15125v;
            default:
                zw zwVar2 = (zw) hbVar.C;
                trVar.getClass();
                zwVar2.mo217c();
                va vaVar = va.f15125v;
                rl rlVar = new rl(2, (pu) obj);
                int i13 = g2.f14354a;
                return n5.p(vaVar, new f2(q1.b(), i10, rlVar), (Executor) hbVar.f6653y);
        }
    }

    public /* synthetic */ qt(com.google.android.gms.internal.ads.hb hbVar, tr trVar, int i) {
        this.f14857a = i;
        this.f14858b = hbVar;
        this.f14859c = trVar;
    }
}
