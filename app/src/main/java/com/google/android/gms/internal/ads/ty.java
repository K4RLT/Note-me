package com.google.android.gms.internal.ads;
import k9.a0;
import k9.b0;
import k9.f0;
import l9.i;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class ty implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11486u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ vy f11487v;

    public /* synthetic */ ty(vy vyVar, int i) {
        this.f11486u = i;
        this.f11487v = vyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        int i = this.f11486u;
        vy vyVar = this.f11487v;
        switch (i) {
            case 0:
                ly lyVar = vyVar.A;
                if (lyVar != null) {
                    lyVar.e();
                    return;
                }
                return;
            case 1:
                ly lyVar2 = vyVar.A;
                if (lyVar2 != null) {
                    lyVar2.k();
                    return;
                }
                return;
            case 2:
                ly lyVar3 = vyVar.A;
                if (lyVar3 != null) {
                    lyVar3.h();
                    return;
                }
                return;
            case 3:
                ly lyVar4 = vyVar.A;
                if (lyVar4 != null) {
                    lyVar4.f();
                    return;
                }
                return;
            case 4:
                ly lyVar5 = vyVar.A;
                if (lyVar5 != null) {
                    lyVar5.g();
                    return;
                }
                return;
            case 5:
                ly lyVar6 = vyVar.A;
                if (lyVar6 != null) {
                    ky kyVar = lyVar6.f8183y;
                    kyVar.f7902w = false;
                    b0 b0Var = f0.f19676l;
                    b0Var.removeCallbacks(kyVar);
                    b0Var.postDelayed(kyVar, 250L);
                    b0Var.post(new jy(lyVar6, 0));
                    return;
                }
                return;
            case 6:
                ly lyVar7 = vyVar.A;
                if (lyVar7 != null) {
                    lyVar7.i();
                    return;
                }
                return;
            default:
                sy syVar = vyVar.f7252v;
                float f11 = 0.0f;
                if (syVar.e) {
                    f10 = 0.0f;
                } else {
                    f10 = syVar.f11197f;
                }
                if (syVar.f11195c) {
                    f11 = f10;
                }
                wz wzVar = vyVar.C;
                if (wzVar != null) {
                    try {
                        eu1 eu1Var = wzVar.A;
                        if (eu1Var != null) {
                            eu1Var.f5814x.b();
                            eu1Var.f5813w.U1(f11);
                            return;
                        }
                        return;
                    } catch (IOException e) {
                        int i10 = a0.f19634b;
                        i.g("", e);
                        return;
                    }
                }
                int i11 = a0.f19634b;
                i.f("Trying to set volume before player is initialized.");
                return;
        }
    }
}
