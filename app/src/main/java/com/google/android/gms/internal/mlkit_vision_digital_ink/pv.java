package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import com.google.android.gms.internal.ads.wd0;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pv implements wv {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14816a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f14817b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f14818c;

    /* renamed from: d, reason: collision with root package name */
    public final ss f14819d;

    public pv(Context context, kw kwVar, s0 s0Var, Executor executor, ss ssVar) {
        this.f14816a = context;
        this.f14817b = s0Var;
        this.f14818c = executor;
        this.f14819d = ssVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya a(ls lsVar, os osVar) {
        f2 f2Var = new f2(gn.s(lsVar, this.f14816a), 4, osVar);
        s0 s0Var = this.f14817b;
        Executor executor = this.f14818c;
        return lx.w(s0Var.b(f2Var, executor)).x(new ys(22), executor).u(IOException.class, new ys(23), executor);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya b(n4 n4Var) {
        ya a10 = this.f14817b.a();
        f2 f2Var = new f2(this, 3, n4Var);
        int i = g2.f14354a;
        return n5.p(a10, new f2(q1.b(), 0, f2Var), ia.f14473u);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya c(ls lsVar) {
        int i = n4.f14693w;
        ya b10 = b(new h5(lsVar));
        mv mvVar = new mv(lsVar, 0);
        int i10 = g2.f14354a;
        return n5.p(b10, new f2(q1.b(), 0, mvVar), ia.f14473u);
    }

    public final ya d(av avVar, int i) {
        ya u9;
        if (i <= avVar.f14040u) {
            av a10 = av.a(i);
            int ordinal = a10.ordinal();
            int i10 = 2;
            final int i11 = 1;
            s0 s0Var = this.f14817b;
            Executor executor = this.f14818c;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    u9 = n5.l(new UnsupportedOperationException(p.a.k("Upgrade to version ", a10.name(), "not supported!")));
                } else {
                    final int i12 = 0;
                    u9 = lx.w(s0Var.b(new m2(this) { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.ov

                        /* renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ pv f14767v;

                        {
                            this.f14767v = this;
                        }

                        @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.m2
                        public final Object l(Object obj) {
                            switch (i12) {
                                case 0:
                                    pv pvVar = this.f14767v;
                                    rs rsVar = (rs) obj;
                                    cx.a("%s: Starting migration to dedup on checksum onlu", "ProtoDataStoreSharedFilesMetadata");
                                    ps psVar = (ps) rsVar.g();
                                    for (String str : rsVar.x().keySet()) {
                                        try {
                                            ls m4 = gn.m(pvVar.f14816a, str);
                                            os t3 = rsVar.t(str);
                                            psVar.m(str);
                                            if (t3 == null) {
                                                cx.f("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                            } else {
                                                psVar.l(t3, gn.d(m4));
                                            }
                                        } catch (jx unused) {
                                            cx.i("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                                            psVar.m(str);
                                        }
                                    }
                                    return (rs) psVar.i();
                                default:
                                    pv pvVar2 = this.f14767v;
                                    rs rsVar2 = (rs) obj;
                                    cx.a("%s: Starting migration to add download transform", "ProtoDataStoreSharedFilesMetadata");
                                    ps psVar2 = (ps) rsVar2.g();
                                    for (String str2 : rsVar2.x().keySet()) {
                                        try {
                                            ls m10 = gn.m(pvVar2.f14816a, str2);
                                            os t10 = rsVar2.t(str2);
                                            psVar2.m(str2);
                                            if (t10 == null) {
                                                cx.f("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                            } else {
                                                psVar2.l(t10, gn.l(m10));
                                            }
                                        } catch (jx unused2) {
                                            cx.i("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str2);
                                            psVar2.m(str2);
                                        }
                                    }
                                    return (rs) psVar2.i();
                            }
                        }
                    }, executor)).x(new ys(24), executor).u(IOException.class, new ys(25), executor);
                }
            } else {
                u9 = lx.w(s0Var.b(new m2(this) { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.ov

                    /* renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ pv f14767v;

                    {
                        this.f14767v = this;
                    }

                    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.m2
                    public final Object l(Object obj) {
                        switch (i11) {
                            case 0:
                                pv pvVar = this.f14767v;
                                rs rsVar = (rs) obj;
                                cx.a("%s: Starting migration to dedup on checksum onlu", "ProtoDataStoreSharedFilesMetadata");
                                ps psVar = (ps) rsVar.g();
                                for (String str : rsVar.x().keySet()) {
                                    try {
                                        ls m4 = gn.m(pvVar.f14816a, str);
                                        os t3 = rsVar.t(str);
                                        psVar.m(str);
                                        if (t3 == null) {
                                            cx.f("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                        } else {
                                            psVar.l(t3, gn.d(m4));
                                        }
                                    } catch (jx unused) {
                                        cx.i("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                                        psVar.m(str);
                                    }
                                }
                                return (rs) psVar.i();
                            default:
                                pv pvVar2 = this.f14767v;
                                rs rsVar2 = (rs) obj;
                                cx.a("%s: Starting migration to add download transform", "ProtoDataStoreSharedFilesMetadata");
                                ps psVar2 = (ps) rsVar2.g();
                                for (String str2 : rsVar2.x().keySet()) {
                                    try {
                                        ls m10 = gn.m(pvVar2.f14816a, str2);
                                        os t10 = rsVar2.t(str2);
                                        psVar2.m(str2);
                                        if (t10 == null) {
                                            cx.f("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                        } else {
                                            psVar2.l(t10, gn.l(m10));
                                        }
                                    } catch (jx unused2) {
                                        cx.i("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str2);
                                        psVar2.m(str2);
                                    }
                                }
                                return (rs) psVar2.i();
                        }
                    }
                }, executor)).x(new ys(27), executor).u(IOException.class, new ys(21), executor);
            }
            q0 q0Var = new q0(this, i, avVar, i10);
            int i13 = g2.f14354a;
            return n5.q(u9, new r0(q1.b(), 3, q0Var), executor);
        }
        return n5.m(Boolean.TRUE);
    }

    public final void e(av avVar) {
        String n10;
        String n11;
        Context context = this.f14816a;
        if (gn.q(context).f14040u != avVar.f14040u && !gn.p(context, avVar)) {
            n10 = wd0.n("Failed to commit migration version to disk. Fail to set target version to ", String.valueOf(avVar), ".");
            cx.e(n10);
            n11 = wd0.n("Fail to set target version ", String.valueOf(avVar), ".");
            new Exception(n11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya j() {
        Context context = this.f14816a;
        boolean z3 = context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
        ss ssVar = this.f14819d;
        if (z3) {
            ssVar.getClass();
            final av a10 = av.a(2);
            av q10 = gn.q(context);
            int i = a10.f14040u;
            int i10 = q10.f14040u;
            if (i == i10) {
                return n5.m(Boolean.TRUE);
            }
            if (i < i10) {
                cx.g("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", q10, a10);
                new Exception(a5.a.h("Downgraded file key from ", String.valueOf(q10), " to ", String.valueOf(a10), "."));
                gn.p(context, a10);
                return n5.m(Boolean.FALSE);
            }
            lx w10 = lx.w(d(a10, i10 + 1));
            final int i11 = 0;
            ea eaVar = new ea(this) { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.lv

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ pv f14641b;

                {
                    this.f14641b = this;
                }

                @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                public final ya l(Object obj) {
                    switch (i11) {
                        case 0:
                            this.f14641b.e(a10);
                            return n5.l((Exception) obj);
                        default:
                            this.f14641b.e(a10);
                            return n5.m((Boolean) obj);
                    }
                }
            };
            Executor executor = this.f14818c;
            final int i12 = 1;
            return w10.v(Exception.class, eaVar, executor).y(new ea(this) { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.lv

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ pv f14641b;

                {
                    this.f14641b = this;
                }

                @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                public final ya l(Object obj) {
                    switch (i12) {
                        case 0:
                            this.f14641b.e(a10);
                            return n5.l((Exception) obj);
                        default:
                            this.f14641b.e(a10);
                            return n5.m((Boolean) obj);
                    }
                }
            }, executor);
        }
        cx.a("%s Device isn't migrated to new file key, clear and set migration.", "ProtoDataStoreSharedFilesMetadata");
        gn.e(context);
        ssVar.getClass();
        gn.p(context, av.a(2));
        return n5.m(Boolean.FALSE);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya p() {
        return this.f14817b.b(new ys(26), this.f14818c);
    }
}
