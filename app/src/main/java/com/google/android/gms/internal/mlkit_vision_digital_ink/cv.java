package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b6.u;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class cv implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6.u f14170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs f14171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea f14172d;

    public /* synthetic */ cv(b6.u uVar, fs fsVar, ea eaVar, int i) {
        this.f14169a = i;
        this.f14170b = uVar;
        this.f14171c = fsVar;
        this.f14172d = eaVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        switch (this.f14169a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    b6.u uVar = this.f14170b;
                    com.google.android.gms.internal.ads.hb hbVar = (com.google.android.gms.internal.ads.hb) uVar.f1782v;
                    fs fsVar = this.f14171c;
                    ya s10 = hbVar.s(fsVar, false);
                    lx w10 = lx.w(s10);
                    cv cvVar = new cv(uVar, fsVar, this.f14172d, 1);
                    Executor executor = (Executor) uVar.A;
                    return w10.y(cvVar, executor).y(new p0(4, s10), executor);
                }
                return va.f15125v;
            default:
                tr trVar = (tr) obj;
                if (trVar == null) {
                    return n5.m(pu.f14812u);
                }
                return ((com.google.android.gms.internal.ads.hb) this.f14170b.f1782v).i(this.f14171c, trVar, this.f14172d, new ow(2));
        }
    }
}
