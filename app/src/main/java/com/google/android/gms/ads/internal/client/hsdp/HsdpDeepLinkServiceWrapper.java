package com.google.android.gms.ads.internal.client.hsdp;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.pu;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.sl;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import g9.r;
import h9.b;
import h9.e;
import h9.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l9.i;
import oa.a;
import qb.d;
import qb.m;
import qb.q;
import qb.s;
import ya.l0;
import z5.h;
import za.c;

/* loaded from: classes.dex */
public class HsdpDeepLinkServiceWrapper extends b {

    /* renamed from: u, reason: collision with root package name */
    public qu f4258u;

    /* renamed from: v, reason: collision with root package name */
    public qu f4259v;

    /* renamed from: w, reason: collision with root package name */
    public qb.b f4260w;

    public HsdpDeepLinkServiceWrapper() {
        super("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
    }

    @Override // h9.c
    public void endSession(a aVar, String str) {
        Throwable th;
        Context context;
        try {
            context = (Context) oa.b.z1(aVar);
            if (context != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        if (this.f4260w == null) {
                            this.f4260w = HsdpDeepLinkServiceFactory.create(context);
                        }
                        ((o5.b) this.f4260w).a(str);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    v4(context, th, "endSession");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, pd.c] */
    @Override // h9.c
    public void open(a aVar, String str, String str2, Bundle bundle, boolean z3, g gVar) {
        Throwable th;
        Context context;
        try {
            context = (Context) oa.b.z1(aVar);
            if (context != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        if (this.f4260w == null) {
                            this.f4260w = HsdpDeepLinkServiceFactory.create(context);
                        }
                        qb.b bVar = this.f4260w;
                        HashMap b10 = l0.b(bundle);
                        if (str2 == null) {
                            str2 = "";
                        }
                        Object obj = new Object();
                        obj.f22681u = gVar;
                        ((o5.b) bVar).b(str, str2, obj, b10, z3);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    v4(context, th, "open");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }

    @Override // h9.c
    public void prewarm(a aVar, List<Bundle> list, e eVar) {
        Throwable th;
        Context context = null;
        try {
            Context context2 = (Context) oa.b.z1(aVar);
            if (context2 == null) {
                return;
            }
            try {
                if (this.f4260w == null) {
                    this.f4260w = HsdpDeepLinkServiceFactory.create(context2);
                }
                qb.b bVar = this.f4260w;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (Bundle bundle : list) {
                        String string = bundle.getString("targetPackage");
                        if (!TextUtils.isEmpty(string)) {
                            IBinder binder = bundle.getBinder("window_token");
                            String string2 = bundle.getString("referrer");
                            HashMap b10 = l0.b(bundle.getBundle("extra_query_params"));
                            if (Collections.EMPTY_MAP != null) {
                                if (string != null) {
                                    if (string2 == null) {
                                        string2 = null;
                                    }
                                    if (binder == null) {
                                        binder = null;
                                    }
                                    if (string2 != null) {
                                        arrayList.add(new m(string, string2, b10, binder));
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        if (string2 == null) {
                                            sb2.append(" referrer");
                                        }
                                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                                    }
                                } else {
                                    throw new NullPointerException("Null targetAppPackageName");
                                }
                            } else {
                                throw new NullPointerException("Null extraQueryParams");
                            }
                        }
                    }
                }
                h hVar = new h(this, 18, eVar);
                d dVar = (d) ((q) ((c) ((o5.b) bVar).f21781f).zza());
                dVar.getClass();
                dVar.f23627b.a(new s(0, dVar, arrayList, hVar));
            } catch (Throwable th2) {
                th = th2;
                context = context2;
                v4(context, th, "prewarm");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void v4(Context context, Throwable th, String str) {
        if (context == null) {
            i.d("Context is null, unable to report exception for method: ".concat(str), th);
            return;
        }
        if (((Boolean) r.e.f17698c.a(sl.f10958te)).booleanValue()) {
            if (this.f4259v == null) {
                this.f4259v = pu.e(context);
            }
            this.f4259v.c("HsdpDeepLinkServiceWrapperUnsampled.".concat(str), th);
        } else {
            if (this.f4258u == null) {
                this.f4258u = pu.a(context);
            }
            this.f4258u.c("HsdpDeepLinkServiceWrapper.".concat(str), th);
        }
    }
}