package com.google.android.gms.internal.mlkit_vision_digital_ink;
import gd.b;
import ic.n;
import k8.a;
import k8.c;
import k8.d;
import l4.a;
import l8.a;
import n8.o;
import n8.p;
import n8.q;

import android.content.Context;

/* loaded from: classes.dex */
public final class pl implements jl {

    /* renamed from: a, reason: collision with root package name */
    public final n f14795a;

    /* renamed from: b, reason: collision with root package name */
    public final il f14796b;

    public pl(Context context, il ilVar) {
        this.f14796b = ilVar;
        a aVar = a.e;
        q.b(context);
        final o c10 = q.a().c(aVar);
        if (a.f20019d.contains(new c("json"))) {
            final int i = 0;
            new n(new b() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.ol
                @Override // b
                public final Object get() {
                    switch (i) {
                        case 0:
                            return c10.a("FIREBASE_ML_SDK", new c("json"), new jm(15));
                        default:
                            return c10.a("FIREBASE_ML_SDK", new c("proto"), new jm(16));
                    }
                }
            });
        }
        final int i10 = 1;
        this.f14795a = new n(new b() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.ol
            @Override // b
            public final Object get() {
                switch (i10) {
                    case 0:
                        return c10.a("FIREBASE_ML_SDK", new c("json"), new jm(15));
                    default:
                        return c10.a("FIREBASE_ML_SDK", new c("proto"), new jm(16));
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.jl
    public final void a(s5 s5Var) {
        p pVar = (p) this.f14795a.get();
        lf lfVar = (lf) s5Var.f14961v;
        yk ykVar = (yk) ((mf) lfVar.f14430v).w().g();
        ykVar.b();
        zk.D((zk) ykVar.f14430v, false);
        lfVar.b();
        mf.x((mf) lfVar.f14430v, (zk) ykVar.i());
        pVar.a(new a(((mf) lfVar.i()).d(), d.f19627v, null), new a(17));
    }
}
