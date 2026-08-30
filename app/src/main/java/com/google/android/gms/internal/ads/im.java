package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class im implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7164a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f7165b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f7166c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f7167d;

    public /* synthetic */ im(rr1 rr1Var, Object obj, wr1 wr1Var, int i) {
        this.f7164a = i;
        this.f7165b = rr1Var;
        this.f7166c = (wr1) obj;
        this.f7167d = wr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f7164a) {
            case 0:
                ((o10) this.f7166c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f7167d.zzb();
                return new hm(scheduledExecutorService);
            case 1:
                return new vd0((zd0) this.f7165b.zzb(), (fe0) this.f7166c.zzb(), ((o10) this.f7167d).a());
            case 2:
                Context context = (Context) this.f7166c.zzb();
                return new u01(context, context.getSharedPreferences("pcvmspf2", 0), rr1.b(this.f7165b), (h21) this.f7167d.zzb());
            case 3:
                File file = (File) this.f7165b.zzb();
                my0 my0Var = (my0) this.f7166c.zzb();
                final h21 h21Var = (h21) this.f7167d.zzb();
                vy0 F = vy0.F();
                final int i = 0;
                f31 f31Var = new f31() { // from class: com.google.android.gms.internal.ads.o11
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i) {
                            case 0:
                                h21Var.d(15308, th);
                                return vy0.F();
                            case 1:
                                h21Var.d(15310, th);
                                return new byte[0];
                            case 2:
                                h21Var.d(15310, th);
                                return new byte[0];
                            case 3:
                                h21Var.d(15309, th);
                                return new byte[0];
                            case 4:
                                h21Var.d(15309, th);
                                return new byte[0];
                            case 5:
                                h21Var.d(15308, th);
                                return vy0.F();
                            case 6:
                                h21Var.d(20310, th);
                                return new byte[0];
                            case 7:
                                h21Var.d(20309, th);
                                return new byte[0];
                            default:
                                h21Var.d(20308, th);
                                return vy0.F();
                        }
                    }
                };
                my0Var.getClass();
                return new ly0(file, my0Var.f8481a, new zq0(5, F), f31Var);
            case 4:
                File file2 = (File) this.f7165b.zzb();
                my0 my0Var2 = (my0) this.f7166c.zzb();
                final h21 h21Var2 = (h21) this.f7167d.zzb();
                final int i10 = 2;
                return my0Var2.a(file2, new byte[0], new f31() { // from class: com.google.android.gms.internal.ads.o11
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i10) {
                            case 0:
                                h21Var2.d(15308, th);
                                return vy0.F();
                            case 1:
                                h21Var2.d(15310, th);
                                return new byte[0];
                            case 2:
                                h21Var2.d(15310, th);
                                return new byte[0];
                            case 3:
                                h21Var2.d(15309, th);
                                return new byte[0];
                            case 4:
                                h21Var2.d(15309, th);
                                return new byte[0];
                            case 5:
                                h21Var2.d(15308, th);
                                return vy0.F();
                            case 6:
                                h21Var2.d(20310, th);
                                return new byte[0];
                            case 7:
                                h21Var2.d(20309, th);
                                return new byte[0];
                            default:
                                h21Var2.d(20308, th);
                                return vy0.F();
                        }
                    }
                });
            case 5:
                File file3 = (File) this.f7165b.zzb();
                my0 my0Var3 = (my0) this.f7166c.zzb();
                final h21 h21Var3 = (h21) this.f7167d.zzb();
                final int i11 = 4;
                return my0Var3.a(file3, new byte[0], new f31() { // from class: com.google.android.gms.internal.ads.o11
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i11) {
                            case 0:
                                h21Var3.d(15308, th);
                                return vy0.F();
                            case 1:
                                h21Var3.d(15310, th);
                                return new byte[0];
                            case 2:
                                h21Var3.d(15310, th);
                                return new byte[0];
                            case 3:
                                h21Var3.d(15309, th);
                                return new byte[0];
                            case 4:
                                h21Var3.d(15309, th);
                                return new byte[0];
                            case 5:
                                h21Var3.d(15308, th);
                                return vy0.F();
                            case 6:
                                h21Var3.d(20310, th);
                                return new byte[0];
                            case 7:
                                h21Var3.d(20309, th);
                                return new byte[0];
                            default:
                                h21Var3.d(20308, th);
                                return vy0.F();
                        }
                    }
                });
            case 6:
                File file4 = (File) this.f7165b.zzb();
                my0 my0Var4 = (my0) this.f7166c.zzb();
                final h21 h21Var4 = (h21) this.f7167d.zzb();
                vy0 F2 = vy0.F();
                final int i12 = 5;
                f31 f31Var2 = new f31() { // from class: com.google.android.gms.internal.ads.o11
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i12) {
                            case 0:
                                h21Var4.d(15308, th);
                                return vy0.F();
                            case 1:
                                h21Var4.d(15310, th);
                                return new byte[0];
                            case 2:
                                h21Var4.d(15310, th);
                                return new byte[0];
                            case 3:
                                h21Var4.d(15309, th);
                                return new byte[0];
                            case 4:
                                h21Var4.d(15309, th);
                                return new byte[0];
                            case 5:
                                h21Var4.d(15308, th);
                                return vy0.F();
                            case 6:
                                h21Var4.d(20310, th);
                                return new byte[0];
                            case 7:
                                h21Var4.d(20309, th);
                                return new byte[0];
                            default:
                                h21Var4.d(20308, th);
                                return vy0.F();
                        }
                    }
                };
                my0Var4.getClass();
                return new ly0(file4, my0Var4.f8481a, new zq0(5, F2), f31Var2);
            case 7:
                File file5 = (File) this.f7165b.zzb();
                my0 my0Var5 = (my0) this.f7166c.zzb();
                final h21 h21Var5 = (h21) this.f7167d.zzb();
                final int i13 = 1;
                return my0Var5.a(file5, new byte[0], new f31() { // from class: com.google.android.gms.internal.ads.o11
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i13) {
                            case 0:
                                h21Var5.d(15308, th);
                                return vy0.F();
                            case 1:
                                h21Var5.d(15310, th);
                                return new byte[0];
                            case 2:
                                h21Var5.d(15310, th);
                                return new byte[0];
                            case 3:
                                h21Var5.d(15309, th);
                                return new byte[0];
                            case 4:
                                h21Var5.d(15309, th);
                                return new byte[0];
                            case 5:
                                h21Var5.d(15308, th);
                                return vy0.F();
                            case 6:
                                h21Var5.d(20310, th);
                                return new byte[0];
                            case 7:
                                h21Var5.d(20309, th);
                                return new byte[0];
                            default:
                                h21Var5.d(20308, th);
                                return vy0.F();
                        }
                    }
                });
            case 8:
                File file6 = (File) this.f7165b.zzb();
                my0 my0Var6 = (my0) this.f7166c.zzb();
                final h21 h21Var6 = (h21) this.f7167d.zzb();
                final int i14 = 3;
                return my0Var6.a(file6, new byte[0], new f31() { // from class: com.google.android.gms.internal.ads.o11
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i14) {
                            case 0:
                                h21Var6.d(15308, th);
                                return vy0.F();
                            case 1:
                                h21Var6.d(15310, th);
                                return new byte[0];
                            case 2:
                                h21Var6.d(15310, th);
                                return new byte[0];
                            case 3:
                                h21Var6.d(15309, th);
                                return new byte[0];
                            case 4:
                                h21Var6.d(15309, th);
                                return new byte[0];
                            case 5:
                                h21Var6.d(15308, th);
                                return vy0.F();
                            case 6:
                                h21Var6.d(20310, th);
                                return new byte[0];
                            case 7:
                                h21Var6.d(20309, th);
                                return new byte[0];
                            default:
                                h21Var6.d(20308, th);
                                return vy0.F();
                        }
                    }
                });
            case 9:
                return new q11((u01) this.f7165b.zzb(), (ExecutorService) this.f7166c.zzb(), (h21) this.f7167d.zzb());
            case 10:
                File file7 = (File) this.f7165b.zzb();
                my0 my0Var7 = (my0) this.f7166c.zzb();
                final h21 h21Var7 = (h21) this.f7167d.zzb();
                vy0 F3 = vy0.F();
                final int i15 = 8;
                f31 f31Var3 = new f31() { // from class: com.google.android.gms.internal.ads.o11
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i15) {
                            case 0:
                                h21Var7.d(15308, th);
                                return vy0.F();
                            case 1:
                                h21Var7.d(15310, th);
                                return new byte[0];
                            case 2:
                                h21Var7.d(15310, th);
                                return new byte[0];
                            case 3:
                                h21Var7.d(15309, th);
                                return new byte[0];
                            case 4:
                                h21Var7.d(15309, th);
                                return new byte[0];
                            case 5:
                                h21Var7.d(15308, th);
                                return vy0.F();
                            case 6:
                                h21Var7.d(20310, th);
                                return new byte[0];
                            case 7:
                                h21Var7.d(20309, th);
                                return new byte[0];
                            default:
                                h21Var7.d(20308, th);
                                return vy0.F();
                        }
                    }
                };
                my0Var7.getClass();
                return new ly0(file7, my0Var7.f8481a, new zq0(5, F3), f31Var3);
            case 11:
                File file8 = (File) this.f7165b.zzb();
                my0 my0Var8 = (my0) this.f7166c.zzb();
                final h21 h21Var8 = (h21) this.f7167d.zzb();
                final int i16 = 6;
                return my0Var8.a(file8, new byte[0], new f31() { // from class: com.google.android.gms.internal.ads.o11
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i16) {
                            case 0:
                                h21Var8.d(15308, th);
                                return vy0.F();
                            case 1:
                                h21Var8.d(15310, th);
                                return new byte[0];
                            case 2:
                                h21Var8.d(15310, th);
                                return new byte[0];
                            case 3:
                                h21Var8.d(15309, th);
                                return new byte[0];
                            case 4:
                                h21Var8.d(15309, th);
                                return new byte[0];
                            case 5:
                                h21Var8.d(15308, th);
                                return vy0.F();
                            case 6:
                                h21Var8.d(20310, th);
                                return new byte[0];
                            case 7:
                                h21Var8.d(20309, th);
                                return new byte[0];
                            default:
                                h21Var8.d(20308, th);
                                return vy0.F();
                        }
                    }
                });
            default:
                File file9 = (File) this.f7165b.zzb();
                my0 my0Var9 = (my0) this.f7166c.zzb();
                final h21 h21Var9 = (h21) this.f7167d.zzb();
                final int i17 = 7;
                return my0Var9.a(file9, new byte[0], new f31() { // from class: com.google.android.gms.internal.ads.o11
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i17) {
                            case 0:
                                h21Var9.d(15308, th);
                                return vy0.F();
                            case 1:
                                h21Var9.d(15310, th);
                                return new byte[0];
                            case 2:
                                h21Var9.d(15310, th);
                                return new byte[0];
                            case 3:
                                h21Var9.d(15309, th);
                                return new byte[0];
                            case 4:
                                h21Var9.d(15309, th);
                                return new byte[0];
                            case 5:
                                h21Var9.d(15308, th);
                                return vy0.F();
                            case 6:
                                h21Var9.d(20310, th);
                                return new byte[0];
                            case 7:
                                h21Var9.d(20309, th);
                                return new byte[0];
                            default:
                                h21Var9.d(20308, th);
                                return vy0.F();
                        }
                    }
                });
        }
    }

    public im(rr1 rr1Var, rr1 rr1Var2, tr1 tr1Var) {
        this.f7164a = 2;
        this.f7166c = tr1Var;
        this.f7165b = rr1Var;
        this.f7167d = rr1Var2;
    }

    public im(wr1 wr1Var, wr1 wr1Var2, rr1 rr1Var) {
        this.f7164a = 0;
        this.f7166c = wr1Var;
        this.f7167d = wr1Var2;
        this.f7165b = rr1Var;
    }
}
