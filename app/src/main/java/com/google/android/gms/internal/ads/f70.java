package com.google.android.gms.internal.ads;
import g9.c3;
import j9.m;
import k9.a0;
import l9.i;
import w9.a;

import android.os.RemoteException;
import java.util.Collections;

/* loaded from: classes.dex */
public final /* synthetic */ class f70 implements n80 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5959u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ f70 f5954v = new f70(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ f70 f5955w = new f70(1);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ f70 f5956x = new f70(2);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ f70 f5957y = new f70(3);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f70 f5958z = new f70(4);
    public static final /* synthetic */ f70 A = new f70(5);
    public static final /* synthetic */ f70 B = new f70(6);
    public static final /* synthetic */ f70 C = new f70(7);
    public static final /* synthetic */ f70 D = new f70(8);
    public static final /* synthetic */ f70 E = new f70(9);
    public static final /* synthetic */ f70 F = new f70(10);
    public static final /* synthetic */ f70 G = new f70(11);
    public static final /* synthetic */ f70 H = new f70(12);
    public static final /* synthetic */ f70 I = new f70(13);
    public static final /* synthetic */ f70 J = new f70(14);
    public static final /* synthetic */ f70 K = new f70(15);
    public static final /* synthetic */ f70 L = new f70(16);
    public static final /* synthetic */ f70 M = new f70(17);
    public static final /* synthetic */ f70 N = new f70(18);
    public static final /* synthetic */ f70 O = new f70(19);
    public static final /* synthetic */ f70 P = new f70(20);
    public static final /* synthetic */ f70 Q = new f70(21);
    public static final /* synthetic */ f70 R = new f70(22);
    public static final /* synthetic */ f70 S = new f70(23);
    public static final /* synthetic */ f70 T = new f70(24);
    public static final /* synthetic */ f70 U = new f70(25);
    public static final /* synthetic */ f70 V = new f70(27);
    public static final /* synthetic */ f70 W = new f70(28);
    public static final /* synthetic */ f70 X = new f70(29);

    public /* synthetic */ f70(int i) {
        this.f5959u = i;
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public final void mo205l(Object obj) {
        int i;
        int i10;
        switch (this.f5959u) {
            case 0:
                ((s60) obj).C();
                return;
            case 1:
                ((s60) obj).F();
                return;
            case 2:
                ((s60) obj).a();
                return;
            case 3:
                ((s60) obj).b();
                return;
            case 4:
                ((s60) obj).E();
                return;
            case 5:
                ((k70) obj).e();
                return;
            case 6:
                ((w9.a) obj).l();
                return;
            case 7:
                ((p70) obj).h();
                return;
            case 8:
                ((j9.m) obj).z1();
                return;
            case 9:
                ((j9.m) obj).g2();
                return;
            case 10:
                ((j9.m) obj).r0();
                return;
            case 11:
                ((j9.m) obj).u2();
                return;
            case 12:
                ((j9.m) obj).o3();
                return;
            case 13:
                ((j9.m) obj).T1();
                return;
            case 14:
                ((j9.m) obj).v2();
                return;
            case 15:
                ((j9.m) obj).R0();
                return;
            case 16:
                ((j9.m) obj).t1();
                return;
            case 17:
                ((j9.m) obj).d();
                return;
            case 18:
                ((v70) obj).i();
                return;
            case 19:
                wk0 wk0Var = (wk0) obj;
                synchronized (wk0Var) {
                    oo0 oo0Var = wk0Var.f12261v;
                    if (oo0Var.d()) {
                        oo0Var.c();
                        return;
                    }
                    i80 i80Var = oo0Var.f9179j;
                    x70 x70Var = oo0Var.f9178h;
                    synchronized (i80Var) {
                        i = i80Var.f7049v;
                    }
                    x70Var.V1(i);
                    return;
                }
            case 20:
                wk0 wk0Var2 = (wk0) obj;
                synchronized (wk0Var2) {
                    try {
                        if (wk0Var2.f12261v.d()) {
                            zp0 zp0Var = wk0Var2.f12265z;
                            g9.c3 c3Var = zp0Var.f13227b;
                            f40 f40Var = wk0Var2.C;
                            if (f40Var != null && zp0Var.f13240q) {
                                c3Var = xy.t(wk0Var2.f12260u, Collections.singletonList(f40Var.f5923o));
                            }
                            synchronized (wk0Var2) {
                                zp0 zp0Var2 = wk0Var2.f12265z;
                                zp0Var2.f13227b = c3Var;
                                zp0Var2.f13240q = wk0Var2.f12264y.H;
                                zp0Var.f13239p = true;
                                try {
                                    wk0Var2.v4(zp0Var.f13226a);
                                } catch (RemoteException unused) {
                                    int i11 = k9.a0.f19634b;
                                    l9.i.f("Failed to refresh the banner ad.");
                                }
                                wk0Var2.f12265z.f13239p = false;
                            }
                            return;
                        }
                        oo0 oo0Var2 = wk0Var2.f12261v;
                        i80 i80Var2 = oo0Var2.f9179j;
                        x70 x70Var2 = oo0Var2.f9178h;
                        synchronized (i80Var2) {
                            i10 = i80Var2.f7048u;
                        }
                        x70Var2.U1(i10);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
            case gl.zzm /* 21 */:
                ((e80) obj).l();
                return;
            case 22:
                ((g80) obj).w();
                return;
            case 23:
                ((g80) obj).r();
                return;
            case 24:
                ((k80) obj).D();
                return;
            case 25:
                ((m80) obj).l();
                return;
            case 26:
                ((u80) obj).H("MalformedJson");
                return;
            case 27:
                ((u80) obj).a();
                return;
            case 28:
                ((u80) obj).b();
                return;
            default:
                ((w80) obj).e();
                return;
        }
    }
}
