package com.google.android.gms.internal.ads;
import j6.s;

/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9700u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j6.s f9701v;

    public /* synthetic */ q1(j6.s sVar, long j10, int i) {
        this.f9700u = 1;
        this.f9701v = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9700u;
        j6.s sVar = this.f9701v;
        sVar.getClass();
        switch (i) {
            case 0:
                String str = bq0.f4860a;
                ku1 ku1Var = ((rs1) sVar.f18982w).f10282u.L;
                ku1Var.p(ku1Var.u(), 1016, new tn1(21, (byte) 0));
                return;
            case 1:
                String str2 = bq0.f4860a;
                ku1 ku1Var2 = ((rs1) sVar.f18982w).f10282u.L;
                ku1Var2.p(ku1Var2.t((yx1) ku1Var2.f7884d.e), 1021, new tn1(24, (byte) 0));
                return;
            case 2:
                String str3 = bq0.f4860a;
                ku1 ku1Var3 = ((rs1) sVar.f18982w).f10282u.L;
                ku1Var3.p(ku1Var3.u(), 1019, new tn1(22, (byte) 0));
                return;
            case 3:
                String str4 = bq0.f4860a;
                ku1 ku1Var4 = ((rs1) sVar.f18982w).f10282u.L;
                ku1Var4.p(ku1Var4.u(), 1030, new tn1(25, (byte) 0));
                return;
            default:
                String str5 = bq0.f4860a;
                ku1 ku1Var5 = ((rs1) sVar.f18982w).f10282u.L;
                ku1Var5.p(ku1Var5.u(), 1015, new tn1(20, (byte) 0));
                return;
        }
    }

    public /* synthetic */ q1(j6.s sVar, Object obj, int i) {
        this.f9700u = i;
        this.f9701v = sVar;
    }

    public /* synthetic */ q1(j6.s sVar, String str, long j10, long j11) {
        this.f9700u = 0;
        this.f9701v = sVar;
    }
}
