package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i60 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7023a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7024b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7025c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7026d;
    public final Serializable e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f7027f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7028g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f7029h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f7030j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f7031k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7032l;

    public i60(Context context, com.google.android.gms.internal.mlkit_vision_digital_ink.kw kwVar, com.google.android.gms.internal.mlkit_vision_digital_ink.wv wvVar, com.google.android.gms.internal.mlkit_vision_digital_ink.i iVar, com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar, com.google.android.gms.internal.mlkit_vision_digital_ink.q2 q2Var, com.google.android.gms.internal.mlkit_vision_digital_ink.q2 q2Var2, com.google.android.gms.internal.mlkit_vision_digital_ink.dx dxVar, com.google.android.gms.internal.mlkit_vision_digital_ink.ss ssVar, com.google.android.gms.internal.mlkit_vision_digital_ink.q2 q2Var3, Executor executor, com.google.android.gms.internal.mlkit_vision_digital_ink.jm jmVar) {
        this.f7023a = context;
        this.f7030j = kwVar;
        this.f7024b = wvVar;
        this.f7026d = iVar;
        this.f7025c = lwVar;
        this.e = q2Var;
        this.f7027f = q2Var2;
        this.f7032l = dxVar;
        this.f7028g = ssVar;
        this.f7029h = q2Var3;
        this.i = executor;
        this.f7031k = jmVar;
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.ya a(com.google.android.gms.internal.mlkit_vision_digital_ink.fs fsVar, int i, long j10, String str, com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar, com.google.android.gms.internal.mlkit_vision_digital_ink.ls lsVar, com.google.android.gms.internal.mlkit_vision_digital_ink.vr vrVar, int i10, com.google.android.gms.internal.mlkit_vision_digital_ink.un unVar, com.google.android.gms.internal.mlkit_vision_digital_ink.om omVar) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.cx.c("%s: startDownload called for %s", "SharedFileManager", orVar.F());
        boolean z3 = false;
        if (orVar.F().startsWith("inlinefile")) {
            int i11 = com.google.android.gms.internal.mlkit_vision_digital_ink.jr.f14529v;
            ra.e eVar = new ra.e(21, z3);
            eVar.f24675v = com.google.android.gms.internal.mlkit_vision_digital_ink.vq.INVALID_INLINE_FILE_URL_SCHEME;
            eVar.f24676w = "downloading a file with an inlinefile scheme is not supported, use importFiles instead.";
            return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.l(eVar.C());
        }
        com.google.android.gms.internal.mlkit_vision_digital_ink.w9 f10 = f(lsVar);
        if (com.google.android.gms.internal.mlkit_vision_digital_ink.gn.q((Context) this.f7023a).f14040u >= 2) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.q2 q2Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.q2) this.e;
            if (q2Var.c()) {
                q2Var.a().getClass();
                g5.q.b();
                return null;
            }
        }
        com.google.android.gms.internal.mlkit_vision_digital_ink.va vaVar = com.google.android.gms.internal.mlkit_vision_digital_ink.va.f15125v;
        com.google.android.gms.internal.mlkit_vision_digital_ink.s5 n10 = com.google.android.gms.internal.mlkit_vision_digital_ink.pa.n(f10, vaVar);
        xe xeVar = new xe(f10, orVar);
        c7.f0 f0Var = (c7.f0) n10.f14961v;
        int i12 = com.google.android.gms.internal.mlkit_vision_digital_ink.g2.f14354a;
        xe xeVar2 = new xe(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), 14, xeVar);
        f0Var.getClass();
        com.google.android.gms.internal.mlkit_vision_digital_ink.ha haVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.ha((com.google.android.gms.internal.mlkit_vision_digital_ink.h4) f0Var.f3950v, f0Var.f3949u);
        com.google.android.gms.internal.mlkit_vision_digital_ink.ia iaVar = com.google.android.gms.internal.mlkit_vision_digital_ink.ia.f14473u;
        haVar.H = new com.google.android.gms.internal.mlkit_vision_digital_ink.ga(haVar, xeVar2, iaVar, 1);
        haVar.w();
        com.google.android.gms.internal.mlkit_vision_digital_ink.c1 c1Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.c1(15, this, lsVar, orVar);
        Executor executor = (Executor) this.i;
        com.google.android.gms.internal.mlkit_vision_digital_ink.w9 q10 = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.q(haVar, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), 3, c1Var), executor);
        return com.google.android.gms.internal.mlkit_vision_digital_ink.lx.w(((c7.f0) com.google.android.gms.internal.mlkit_vision_digital_ink.pa.n(f10, vaVar, haVar, q10).f14961v).s(com.google.android.gms.internal.mlkit_vision_digital_ink.g2.a(new com.google.android.gms.internal.mlkit_vision_digital_ink.jm(28)), iaVar)).y(new com.google.android.gms.internal.mlkit_vision_digital_ink.uv(this, f10, haVar, q10, orVar, fsVar, lsVar, i, j10, str, vrVar, i10, unVar, omVar), executor).v(com.google.android.gms.internal.mlkit_vision_digital_ink.vv.class, new com.google.android.gms.internal.mlkit_vision_digital_ink.rv(lsVar, 1), executor);
    }

    public void b(com.google.android.gms.internal.mlkit_vision_digital_ink.fs fsVar, Uri uri) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.q2 q2Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.q2) this.f7027f;
        if (q2Var.c()) {
            try {
                if (((com.google.android.gms.internal.mlkit_vision_digital_ink.i) this.f7026d).a(uri) > 0) {
                    if (q2Var.a() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (IOException unused) {
            }
        }
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.ya c(String str, int i, String str2) {
        Uri j10 = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.j((Context) this.f7023a, i, str, str2, (com.google.android.gms.internal.mlkit_vision_digital_ink.q2) this.f7029h, false);
        if (j10 == null) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.cx.f("%s: Failed to get file uri!", "SharedFileManager");
            int i10 = com.google.android.gms.internal.mlkit_vision_digital_ink.jr.f14529v;
            ra.e eVar = new ra.e(21, false);
            eVar.f24675v = com.google.android.gms.internal.mlkit_vision_digital_ink.vq.UNABLE_TO_CREATE_FILE_URI_ERROR;
            return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.l(eVar.C());
        }
        return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.m(j10);
    }

    public hr0 d(Bundle bundle) {
        ((l80) this.f7032l).l();
        kr0 kr0Var = (kr0) this.f7023a;
        Objects.requireNonNull(kr0Var);
        n81 d2 = ((tw) this.i).d(bundle, new Bundle());
        return new k60(kr0Var, ir0.SIGNALS, null, kr0.f7850d, Collections.EMPTY_LIST, d2).j();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.n81, ac.b, com.google.android.gms.internal.ads.e81] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.n81, ac.b, com.google.android.gms.internal.ads.e81] */
    public hr0 e() {
        Bundle bundle = new Bundle();
        int i = 0;
        if (((Boolean) g9.r.e.f17698c.a(sl.J2)).booleanValue()) {
            Bundle bundle2 = ((aq0) this.f7031k).f4595t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        hr0 d2 = d(bundle);
        kr0 kr0Var = (kr0) this.f7023a;
        ac.b[] bVarArr = {d2, (ac.b) ((pr1) this.f7029h).zzb()};
        kr0Var.getClass();
        List asList = Arrays.asList(bVarArr);
        h60 h60Var = new h60(this, d2, bundle, i);
        b51 b51Var = d51.f5314v;
        asList.getClass();
        d51 u9 = d51.u(asList);
        kl klVar = kl.f7797f;
        wx wxVar = xx.f12657h;
        ?? e81Var = new e81(u9, true, false);
        e81Var.J = new m81(e81Var, klVar, wxVar);
        e81Var.x();
        wx wxVar2 = kr0Var.f7851a;
        ?? e81Var2 = new e81(u9, true, false);
        e81Var2.J = new m81(e81Var2, h60Var, wxVar2);
        e81Var2.x();
        return new k60(kr0Var, ir0.REQUEST_PARCEL, null, e81Var, asList, e81Var2).j();
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.w9 f(com.google.android.gms.internal.mlkit_vision_digital_ink.ls lsVar) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.ya c10 = ((com.google.android.gms.internal.mlkit_vision_digital_ink.wv) this.f7024b).c(lsVar);
        com.google.android.gms.internal.mlkit_vision_digital_ink.rv rvVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.rv(lsVar, 0);
        int i = com.google.android.gms.internal.mlkit_vision_digital_ink.g2.f14354a;
        return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.q(c10, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), 3, rvVar), (Executor) this.i);
    }

    public i60(kr0 kr0Var, l9.a aVar, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, pr1 pr1Var, k9.c0 c0Var, String str2, tw twVar, aq0 aq0Var, l80 l80Var) {
        this.f7023a = kr0Var;
        this.f7024b = aVar;
        this.f7025c = applicationInfo;
        this.f7026d = str;
        this.f7027f = arrayList;
        this.f7028g = packageInfo;
        this.f7029h = pr1Var;
        this.e = str2;
        this.i = twVar;
        this.f7030j = c0Var;
        this.f7031k = aq0Var;
        this.f7032l = l80Var;
    }
}
