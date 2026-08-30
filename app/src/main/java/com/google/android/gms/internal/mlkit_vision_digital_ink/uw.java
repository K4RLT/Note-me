package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class uw implements yw {

    /* renamed from: a, reason: collision with root package name */
    public final int f15099a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15100b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15101c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15102d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15103f;

    /* renamed from: g, reason: collision with root package name */
    public final Serializable f15104g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f15105h;
    public final Object i;

    public uw(Context context, wv wvVar, i iVar, kw kwVar, or orVar, int i, ur urVar, dx dxVar, fs fsVar, int i10, long j10, String str, q2 q2Var, ss ssVar, Executor executor) {
        this.f15100b = context;
        this.f15101c = wvVar;
        this.f15102d = iVar;
        this.e = orVar;
        this.f15099a = i;
        this.f15103f = urVar;
        this.f15104g = q2Var;
        this.f15105h = ssVar;
        this.i = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.yw
    public ya a(Uri uri) {
        Executor executor = (Executor) this.i;
        wv wvVar = (wv) this.f15101c;
        cx.c("%s: Successfully downloaded delta file %s", "DeltaFileDownloaderCallbackImpl", uri);
        i iVar = (i) this.f15102d;
        ur urVar = (ur) this.f15103f;
        boolean equals = tl.m(iVar, uri).equals(urVar.v());
        int i = 3;
        boolean z3 = false;
        Object[] objArr = 0;
        int i10 = this.f15099a;
        if (!equals) {
            cx.g("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, urVar.v());
            int i11 = jr.f14529v;
            ra.e eVar = new ra.e(21, z3);
            eVar.f24675v = vq.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            jr C = eVar.C();
            or orVar = (or) this.e;
            String v2 = urVar.v();
            ss ssVar = (ss) this.f15105h;
            ls e = nw.e(orVar, i10);
            ya c10 = wvVar.c(e);
            rv rvVar = new rv(e, 4);
            int i12 = g2.f14354a;
            return lx.w(lx.w(n5.q(c10, new r0(q1.b(), i, rvVar), executor)).y(new du(ssVar, v2, iVar, uri, 4), executor)).v(IOException.class, new sw(C, objArr == true ? 1 : 0), executor).y(new sw(C, 1), executor);
        }
        String uri2 = uri.toString();
        Uri parse = Uri.parse(uri2.substring(0, uri2.lastIndexOf("_")));
        ks u9 = ls.u();
        u9.l(urVar.u().u());
        u9.m(i10);
        ls lsVar = (ls) u9.i();
        ya c11 = wvVar.c(lsVar);
        c1 c1Var = new c1(this, lsVar, parse, uri, 16);
        int i13 = g2.f14354a;
        return n5.q(n5.q(c11, new r0(q1.b(), i, c1Var), executor), new r0(q1.b(), i, new r0(this, 18, parse)), executor);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.yw
    public lx b(jr jrVar) {
        Executor executor = (Executor) this.i;
        wv wvVar = (wv) this.f15101c;
        or orVar = (or) this.e;
        cx.c("%s: Failed to download file(delta) %s", "DeltaFileDownloaderCallbackImpl", orVar.B());
        boolean equals = jrVar.f14530u.equals(vq.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR);
        int i = this.f15099a;
        if (equals) {
            return vw.c(ds.CORRUPTED, orVar, i, wvVar, executor);
        }
        return vw.c(ds.DOWNLOAD_FAILED, orVar, i, wvVar, executor);
    }

    public uw(String str, String str2, String str3, String str4, oc.w wVar, String str5, String str6, String str7, int i) {
        this.f15100b = str;
        this.f15101c = str2;
        this.f15102d = str3;
        this.e = str4;
        this.f15103f = wVar;
        this.f15104g = str5;
        this.f15105h = str6;
        this.i = str7;
        this.f15099a = i;
    }
}
