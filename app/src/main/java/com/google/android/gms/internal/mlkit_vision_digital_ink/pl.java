package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;

/* loaded from: classes.dex */
public final class pl implements jl {

    /* renamed from: a, reason: collision with root package name */
    public final ic.n f14795a;

    /* renamed from: b, reason: collision with root package name */
    public final il f14796b;

    public pl(Context context, il ilVar) {
        this.f14796b = ilVar;
        l8.a aVar = l8.a.e;
        n8.q.b(context);
        final n8.o c10 = n8.q.a().c(aVar);
        if (l8.a.f20019d.contains(new k8.c("json"))) {
            final int i = 0;
            new ic.n(new gd.b() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.ol
                @Override // gd.b
                public final Object get() {
                    switch (i) {
                        case 0:
                            return c10.a("FIREBASE_ML_SDK", new k8.c("json"), new jm(15));
                        default:
                            return c10.a("FIREBASE_ML_SDK", new k8.c("proto"), new jm(16));
                    }
                }
            });
        }
        final int i10 = 1;
        this.f14795a = new ic.n(new gd.b() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.ol
            @Override // gd.b
            public final Object get() {
                switch (i10) {
                    case 0:
                        return c10.a("FIREBASE_ML_SDK", new k8.c("json"), new jm(15));
                    default:
                        return c10.a("FIREBASE_ML_SDK", new k8.c("proto"), new jm(16));
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.jl
    public final void a(s5 s5Var) {
        n8.p pVar = (n8.p) this.f14795a.get();
        lf lfVar = (lf) s5Var.f14961v;
        yk ykVar = (yk) ((mf) lfVar.f14430v).w().g();
        ykVar.b();
        zk.D((zk) ykVar.f14430v, false);
        lfVar.b();
        mf.x((mf) lfVar.f14430v, (zk) ykVar.i());
        pVar.a(new k8.a(((mf) lfVar.i()).d(), k8.d.f19627v, null), new l4.a(17));
    }
}
