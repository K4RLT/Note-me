package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class hv1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6901u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ mu f6902v;

    public /* synthetic */ hv1(mu muVar, int i, long j10, long j11) {
        this.f6901u = 3;
        this.f6902v = muVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6901u;
        int i10 = 17;
        byte b10 = 0;
        mu muVar = this.f6902v;
        muVar.getClass();
        switch (i) {
            case 0:
                String str = bq0.f4860a;
                ku1 ku1Var = ((rs1) muVar.f8423w).f10282u.L;
                ku1Var.p(ku1Var.u(), 1008, new iu1(i10));
                return;
            case 1:
                String str2 = bq0.f4860a;
                ku1 ku1Var2 = ((rs1) muVar.f8423w).f10282u.L;
                ku1Var2.p(ku1Var2.u(), 1032, new tn1(18, b10));
                return;
            case 2:
                String str3 = bq0.f4860a;
                ku1 ku1Var3 = ((rs1) muVar.f8423w).f10282u.L;
                ku1Var3.p(ku1Var3.u(), 1010, new iu1(19));
                return;
            case 3:
                String str4 = bq0.f4860a;
                ku1 ku1Var4 = ((rs1) muVar.f8423w).f10282u.L;
                ku1Var4.p(ku1Var4.u(), 1011, new iu1(20));
                return;
            case 4:
                String str5 = bq0.f4860a;
                ku1 ku1Var5 = ((rs1) muVar.f8423w).f10282u.L;
                ku1Var5.p(ku1Var5.u(), 1012, new iu1(21));
                return;
            case 5:
                String str6 = bq0.f4860a;
                ku1 ku1Var6 = ((rs1) muVar.f8423w).f10282u.L;
                ku1Var6.p(ku1Var6.u(), 1014, new tn1(15, b10));
                return;
            case 6:
                String str7 = bq0.f4860a;
                ku1 ku1Var7 = ((rs1) muVar.f8423w).f10282u.L;
                ku1Var7.p(ku1Var7.u(), 1029, new tn1(16, b10));
                return;
            case 7:
                String str8 = bq0.f4860a;
                ku1 ku1Var8 = ((rs1) muVar.f8423w).f10282u.L;
                ku1Var8.p(ku1Var8.u(), 1031, new tn1(i10, b10));
                return;
            default:
                String str9 = bq0.f4860a;
                ku1 ku1Var9 = ((rs1) muVar.f8423w).f10282u.L;
                ku1Var9.p(ku1Var9.u(), 1007, new iu1(10));
                return;
        }
    }

    public /* synthetic */ hv1(mu muVar, long j10) {
        this.f6901u = 2;
        this.f6902v = muVar;
    }

    public /* synthetic */ hv1(mu muVar, Object obj, int i) {
        this.f6901u = i;
        this.f6902v = muVar;
    }

    public /* synthetic */ hv1(mu muVar, String str, long j10, long j11) {
        this.f6901u = 0;
        this.f6902v = muVar;
    }
}
