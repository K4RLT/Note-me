package com.google.android.gms.internal.ads;
import ac.b;
import f9.k;
import g9.r;
import la.a;
import r.e;
import y3.f;

import android.webkit.CookieManager;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g10 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6252a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f6253b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f6254c;

    public /* synthetic */ g10(rr1 rr1Var, rr1 rr1Var2, int i) {
        this.f6252a = i;
        this.f6253b = rr1Var;
        this.f6254c = rr1Var2;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        wx wxVar;
        Set singleton;
        Set singleton2;
        Set singleton3;
        Set singleton4;
        switch (this.f6252a) {
            case 0:
                return new f10((c10) this.f6253b.zzb(), (be0) this.f6254c.zzb());
            case 1:
                return new h10((ScheduledExecutorService) this.f6254c.zzb());
            case 2:
                if (((Boolean) g9.r.e.f17698c.a(sl.E3)).booleanValue()) {
                    return new of((lf) this.f6254c.zzb());
                }
                return new of((lf) this.f6253b.zzb());
            case 3:
                yh yhVar = (yh) this.f6253b.zzb();
                pr prVar = (pr) this.f6254c.zzb();
                nl nlVar = sl.H6;
                g9.r rVar = g9.r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    wxVar = xx.f12653c;
                } else {
                    if (((Boolean) rVar.f17698c.a(sl.G6)).booleanValue()) {
                        wxVar = xx.f12651a;
                    } else {
                        wxVar = xx.f12655f;
                    }
                }
                lo1.b(wxVar);
                return new q30(yhVar.f12876c, prVar, wxVar);
            case 4:
                u30 u30Var = (u30) this.f6253b.zzb();
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                if (((JSONObject) this.f6254c.zzb()) == null) {
                    singleton = Collections.EMPTY_SET;
                } else {
                    singleton = Collections.singleton(new c90(u30Var, wxVar2));
                }
                lo1.b(singleton);
                return singleton;
            case 5:
                u30 u30Var2 = (u30) this.f6253b.zzb();
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                if (((JSONObject) this.f6254c.zzb()) == null) {
                    singleton2 = Collections.EMPTY_SET;
                } else {
                    singleton2 = Collections.singleton(new c90(u30Var2, wxVar3));
                }
                lo1.b(singleton2);
                return singleton2;
            case 6:
                u30 u30Var3 = (u30) this.f6253b.zzb();
                wx wxVar4 = xx.f12651a;
                lo1.b(wxVar4);
                if (((JSONObject) this.f6254c.zzb()) == null) {
                    singleton3 = Collections.EMPTY_SET;
                } else {
                    singleton3 = Collections.singleton(new c90(u30Var3, wxVar4));
                }
                lo1.b(singleton3);
                return singleton3;
            case 7:
                u30 u30Var4 = (u30) this.f6253b.zzb();
                wx wxVar5 = xx.f12651a;
                lo1.b(wxVar5);
                if (((JSONObject) this.f6254c.zzb()) == null) {
                    singleton4 = Collections.EMPTY_SET;
                } else {
                    singleton4 = Collections.singleton(new c90(u30Var4, wxVar5));
                }
                lo1.b(singleton4);
                return singleton4;
            case 8:
                return new p90((r70) this.f6253b.zzb(), (z80) this.f6254c.zzb());
            case 9:
                return new ge0((fe0) this.f6254c.zzb(), (String) this.f6253b.zzb());
            case 10:
                return new jf0((af0) this.f6253b.zzb(), (nd0) this.f6254c.zzb());
            case 11:
                kr0 kr0Var = (kr0) this.f6253b.zzb();
                CookieManager b10 = f9.k.C.f16815f.b();
                Objects.requireNonNull(kr0Var);
                qf qfVar = new qf(4, b10);
                wx wxVar6 = kr0Var.f7851a;
                k60 k60Var = new k60(kr0Var, ir0.WEBVIEW_COOKIE, null, kr0.f7850d, Collections.EMPTY_LIST, ed1.Y(wxVar6.j(qfVar), 1L, TimeUnit.SECONDS, kr0Var.f7852b));
                x20 x20Var = new x20(14);
                kr0 kr0Var2 = (kr0) k60Var.f7670f;
                wx wxVar7 = kr0Var2.f7851a;
                return new k60(kr0Var2, k60Var.f7666a, (String) k60Var.f7667b, (ac.b) k60Var.f7668c, (List) k60Var.f7669d, ed1.U((ac.b) k60Var.e, Exception.class, x20Var, wxVar7)).j();
            case 12:
                wx wxVar8 = xx.f12651a;
                lo1.b(wxVar8);
                om0 om0Var = new om0(wxVar8, 2);
                la.a aVar = (la.a) this.f6253b.zzb();
                lo1.b(wxVar8);
                return new nm0(om0Var, ((Long) nm.f8761f.p()).longValue(), aVar, wxVar8, (be0) this.f6254c.zzb());
            case 13:
                return new pp0((la.a) this.f6253b.zzb(), (be0) this.f6254c.zzb());
            case 14:
                return new ht0((it0) this.f6253b.zzb(), (ct0) this.f6254c.zzb());
            case 15:
                y3.f fVar = (y3.f) this.f6253b.zzb();
                ExecutorService executorService = xx.f12656g;
                lo1.b(executorService);
                return new gx0(fVar, new to0(3, executorService), (ld0) this.f6254c.zzb(), new ho0(9, (byte) 0));
            case 16:
                Executor executor = (Executor) this.f6253b.zzb();
                return new fy0(executor);
            default:
                return new h21((mx0) this.f6253b.zzb(), (ry0) this.f6254c.zzb());
        }
    }
}
