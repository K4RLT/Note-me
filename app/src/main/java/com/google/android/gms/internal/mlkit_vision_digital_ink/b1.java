package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements da, uq {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14048u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f14049v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f14050w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f14051x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f14052y;

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f14048u = i;
        this.f14051x = obj;
        this.f14052y = obj2;
        this.f14049v = obj3;
        this.f14050w = obj4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public zv c() {
        return new zv(((s5) this.f14051x).e(), (kw) ((tq) this.f14052y).c(), (q2) ((tq) this.f14049v).c(), (ss) ((tq) this.f14050w).c());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        int i = this.f14048u;
        ia iaVar = ia.f14473u;
        int i10 = 3;
        Object obj = this.f14050w;
        Object obj2 = this.f14049v;
        Object obj3 = this.f14052y;
        Object obj4 = this.f14051x;
        int i11 = 1;
        int i12 = 0;
        switch (i) {
            case 0:
                com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) obj4;
                w9 q10 = n5.q((ya) obj3, new y0(cVar, i11), iaVar);
                w9 q11 = n5.q(q10, (r0) obj2, (Executor) obj);
                c1 c1Var = new c1(i12, cVar, q10, q11);
                int i13 = g2.f14354a;
                return n5.q(q11, new r0(b(), i10, c1Var), iaVar);
            case 1:
                c1 c1Var2 = new c1(i11, (s0) obj4, (r0) obj2, (Executor) obj);
                int i14 = g2.f14354a;
                return n5.q((n9) obj3, new r0(b(), i10, c1Var2), iaVar);
            default:
                yu yuVar = (yu) obj4;
                Executor executor = yuVar.f15311h;
                List list = (List) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Boolean bool = (Boolean) obj;
                ya m4 = n5.m(Boolean.TRUE);
                for (int i15 = 0; i15 < list.size(); i15++) {
                    xu xuVar = new xu(yuVar, (ls) list.get(i15), (os) n5.r((Future) arrayList.get(i15)), i12);
                    int i16 = g2.f14354a;
                    m4 = n5.q(m4, new r0(b(), i10, xuVar), executor);
                }
                vu vuVar = new vu(bool, 1);
                int i17 = g2.f14354a;
                return n5.p(m4, new f2(b(), i12, vuVar), executor);
        }
    }
}
