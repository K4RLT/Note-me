package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14828c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f14829d;

    public /* synthetic */ q0(r0 r0Var, ArrayList arrayList, int i) {
        this.f14826a = 0;
        this.f14827b = r0Var;
        this.f14829d = arrayList;
        this.f14828c = i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.da, java.lang.Object, ba.q] */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        Future future;
        switch (this.f14826a) {
            case 0:
                r0 r0Var = (r0) this.f14827b;
                ArrayList arrayList = (ArrayList) this.f14829d;
                h4 s10 = h4.s(arrayList);
                ?? obj2 = new Object();
                obj2.f3158v = r0Var;
                obj2.f3159w = (km) obj;
                obj2.f3157u = this.f14828c;
                obj2.f3160x = arrayList;
                iw a10 = g2.a(obj2);
                Executor executor = (Executor) r0Var.f14884c;
                ha haVar = new ha(s10, false);
                haVar.H = new ga(haVar, a10, executor, 0);
                haVar.w();
                return haVar;
            case 1:
                r0 r0Var2 = (r0) this.f14827b;
                ArrayList arrayList2 = (ArrayList) this.f14829d;
                int i = this.f14828c;
                ArrayList arrayList3 = new ArrayList(i);
                for (int i10 = 0; i10 < i; i10++) {
                    if (((Boolean) n5.r((Future) arrayList2.get(i10))).booleanValue()) {
                        x0 x0Var = (x0) ((List) r0Var2.f14883b).get(i10);
                        if (((Boolean) x0Var.f15219d.zza()).booleanValue()) {
                            future = va.f15125v;
                        } else {
                            v0 v0Var = new v0(x0Var, 0);
                            Executor executor2 = x0Var.f15217b;
                            hb hbVar = new hb(v0Var);
                            executor2.execute(hbVar);
                            future = hbVar;
                        }
                        arrayList3.add(future);
                    }
                }
                h4 s11 = h4.s(arrayList3);
                fa faVar = new fa(0);
                ha haVar2 = new ha(s11, true);
                haVar2.H = new ga(haVar2, faVar, ia.f14473u, 1);
                haVar2.w();
                return haVar2;
            default:
                pv pvVar = (pv) this.f14827b;
                av avVar = (av) this.f14829d;
                if (((Boolean) obj).booleanValue()) {
                    Context context = pvVar.f14816a;
                    int i11 = this.f14828c;
                    gn.p(context, av.a(i11));
                    return pvVar.d(avVar, i11 + 1);
                }
                return n5.m(Boolean.FALSE);
        }
    }

    public /* synthetic */ q0(Object obj, int i, Serializable serializable, int i10) {
        this.f14826a = i10;
        this.f14827b = obj;
        this.f14828c = i;
        this.f14829d = serializable;
    }
}
