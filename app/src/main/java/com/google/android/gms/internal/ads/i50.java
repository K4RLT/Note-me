package com.google.android.gms.internal.ads;
import ac.b;
import f9.k;
import g9.r;
import i0.m;
import r.e;

import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i50 {

    /* renamed from: a, reason: collision with root package name */
    public final kg0 f6988a;

    /* renamed from: b, reason: collision with root package name */
    public final aq0 f6989b;

    /* renamed from: c, reason: collision with root package name */
    public final kr0 f6990c;

    /* renamed from: d, reason: collision with root package name */
    public final i0.m f6991d;
    public final uj0 e;

    /* renamed from: f, reason: collision with root package name */
    public final j80 f6992f;

    /* renamed from: g, reason: collision with root package name */
    public wp0 f6993g;

    /* renamed from: h, reason: collision with root package name */
    public final zd1 f6994h;
    public final i60 i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f6995j;

    /* renamed from: k, reason: collision with root package name */
    public final tg0 f6996k;

    /* renamed from: l, reason: collision with root package name */
    public final ii0 f6997l;

    public i50(kg0 kg0Var, aq0 aq0Var, kr0 kr0Var, i0.m mVar, uj0 uj0Var, j80 j80Var, wp0 wp0Var, zd1 zd1Var, i60 i60Var, wx wxVar, tg0 tg0Var, ii0 ii0Var) {
        this.f6988a = kg0Var;
        this.f6989b = aq0Var;
        this.f6990c = kr0Var;
        this.f6991d = mVar;
        this.e = uj0Var;
        this.f6992f = j80Var;
        this.f6993g = wp0Var;
        this.f6994h = zd1Var;
        this.i = i60Var;
        this.f6995j = wxVar;
        this.f6996k = tg0Var;
        this.f6997l = ii0Var;
    }

    public final hr0 a(ac.b bVar) {
        if (this.f6993g != null) {
            kr0 kr0Var = this.f6990c;
            ir0 ir0Var = ir0.SERVER_TRANSACTION;
            Objects.requireNonNull(kr0Var);
            return new k60(kr0Var, ir0Var, null, kr0.f7850d, Collections.EMPTY_LIST, ed1.e(this.f6993g)).j();
        }
        k60 k60Var = f9.k.C.f16818j;
        k60Var.getClass();
        nl nlVar = sl.f10744g5;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            synchronized (k60Var.f7669d) {
                try {
                    k60Var.n();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) k60Var.f7667b;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    k60Var.f7667b = xx.f12654d.schedule((f) k60Var.f7668c, ((Long) rVar.f17698c.a(sl.f10759h5)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.f6990c.a(bVar, ir0.SERVER_TRANSACTION).g(new dq(4, this.f6996k)).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0212 A[Catch: all -> 0x00fb, TryCatch #11 {all -> 0x00fb, blocks: (B:35:0x009a, B:37:0x00b9, B:40:0x00c1, B:42:0x00ce, B:44:0x00e6, B:45:0x0112, B:47:0x011d, B:49:0x0125, B:50:0x012c, B:54:0x0135, B:57:0x016d, B:60:0x0149, B:63:0x0158, B:65:0x0172, B:68:0x00fe, B:70:0x0186, B:74:0x01a5, B:78:0x01ad, B:80:0x01d0, B:82:0x01e6, B:84:0x0208, B:85:0x021f, B:88:0x0233, B:94:0x0246, B:95:0x0247, B:96:0x0254, B:99:0x0259, B:100:0x025a, B:106:0x0270, B:108:0x0281, B:113:0x0274, B:117:0x0277, B:121:0x0279, B:122:0x027a, B:125:0x0280, B:129:0x0294, B:130:0x0212, B:131:0x01f9, B:134:0x01bc, B:137:0x0194, B:138:0x0199, B:124:0x027b, B:102:0x025b, B:104:0x0265, B:90:0x0234, B:92:0x023e), top: B:34:0x009a, inners: #2, #5, #6, #7, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0208 A[Catch: all -> 0x00fb, TryCatch #11 {all -> 0x00fb, blocks: (B:35:0x009a, B:37:0x00b9, B:40:0x00c1, B:42:0x00ce, B:44:0x00e6, B:45:0x0112, B:47:0x011d, B:49:0x0125, B:50:0x012c, B:54:0x0135, B:57:0x016d, B:60:0x0149, B:63:0x0158, B:65:0x0172, B:68:0x00fe, B:70:0x0186, B:74:0x01a5, B:78:0x01ad, B:80:0x01d0, B:82:0x01e6, B:84:0x0208, B:85:0x021f, B:88:0x0233, B:94:0x0246, B:95:0x0247, B:96:0x0254, B:99:0x0259, B:100:0x025a, B:106:0x0270, B:108:0x0281, B:113:0x0274, B:117:0x0277, B:121:0x0279, B:122:0x027a, B:125:0x0280, B:129:0x0294, B:130:0x0212, B:131:0x01f9, B:134:0x01bc, B:137:0x0194, B:138:0x0199, B:124:0x027b, B:102:0x025b, B:104:0x0265, B:90:0x0234, B:92:0x023e), top: B:34:0x009a, inners: #2, #5, #6, #7, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.hr0 b() {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i50.b():com.google.android.gms.internal.ads.hr0");
    }

    public final hr0 c(ac.b bVar) {
        k60 g8 = this.f6990c.a(bVar, ir0.RENDERER).e(new hx0(12, this)).g(this.e);
        if (!((Boolean) g9.r.e.f17698c.a(sl.f11045z6)).booleanValue()) {
            g8 = g8.i(((Integer) r1.f17698c.a(sl.A6)).intValue());
        }
        return g8.j();
    }
}
