package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vw implements yw {

    /* renamed from: a, reason: collision with root package name */
    public final wv f15157a;

    /* renamed from: b, reason: collision with root package name */
    public final i f15158b;

    /* renamed from: c, reason: collision with root package name */
    public final or f15159c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15160d;
    public final fs e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15161f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15162g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15163h;
    public final ss i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f15164j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15165k;

    public vw(wv wvVar, i iVar, or orVar, int i, dx dxVar, fs fsVar, int i10, long j10, String str, ss ssVar, Executor executor, jm jmVar) {
        this.f15157a = wvVar;
        this.f15158b = iVar;
        this.f15159c = orVar;
        this.f15165k = i;
        this.f15160d = f7.m(orVar);
        this.e = fsVar;
        this.f15161f = i10;
        this.f15162g = j10;
        this.f15163h = str;
        this.i = ssVar;
        this.f15164j = executor;
    }

    public static lx c(ds dsVar, or orVar, int i, wv wvVar, Executor executor) {
        ls e = nw.e(orVar, i);
        ya c10 = wvVar.c(e);
        rv rvVar = new rv(e, 4);
        int i10 = g2.f14354a;
        return lx.w(n5.q(c10, new r0(q1.b(), 3, rvVar), executor)).y(new c1(17, dsVar, wvVar, e), executor).y(new rv(e, 3), executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cf  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.h, com.google.android.gms.internal.mlkit_vision_digital_ink.h0] */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.yw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.mlkit_vision_digital_ink.ya a(android.net.Uri r23) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.vw.a(android.net.Uri):com.google.android.gms.internal.mlkit_vision_digital_ink.ya");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.yw
    public final lx b(jr jrVar) {
        cx.c("%s: Failed to download file %s", "DownloaderCallbackImpl", this.f15160d);
        boolean equals = jrVar.f14530u.equals(vq.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR);
        Executor executor = this.f15164j;
        wv wvVar = this.f15157a;
        int i = this.f15165k;
        or orVar = this.f15159c;
        if (equals) {
            return c(ds.CORRUPTED, orVar, i, wvVar, executor);
        }
        return c(ds.DOWNLOAD_FAILED, orVar, i, wvVar, executor);
    }
}
