package com.google.android.gms.internal.ads;
import ac.b;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class eg0 implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv f5684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5686d;

    public /* synthetic */ eg0(Object obj, dv dvVar, int i, int i10) {
        this.f5683a = i10;
        this.f5686d = obj;
        this.f5684b = dvVar;
        this.f5685c = i;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final /* synthetic */ ac.b l(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f5683a) {
            case 0:
                tw twVar = (tw) this.f5686d;
                dv dvVar = this.f5684b;
                if (dvVar != null && (bundle = dvVar.G) != null) {
                    bundle.putBoolean("ls", true);
                }
                return ed1.c0(((eh0) ((pr1) twVar.f11473y).zzb()).v4(dvVar, this.f5685c), new fg0(dvVar, 0), (wx) twVar.f11471w);
            default:
                p8 p8Var = (p8) this.f5686d;
                dv dvVar2 = this.f5684b;
                if (dvVar2 != null && (bundle2 = dvVar2.G) != null) {
                    bundle2.putBoolean("ls", true);
                }
                return ed1.c0(((eh0) ((pr1) p8Var.f9423z).zzb()).y4(dvVar2, this.f5685c), new fg0(dvVar2, 1), (wx) p8Var.f9420w);
        }
    }
}
