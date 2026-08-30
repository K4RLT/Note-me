package com.google.android.gms.internal.ads;

import java.net.URL;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class r7 implements zb0, ie0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10134u;

    /* renamed from: v, reason: collision with root package name */
    public int f10135v;

    /* renamed from: w, reason: collision with root package name */
    public long f10136w;

    /* renamed from: x, reason: collision with root package name */
    public Object f10137x;

    public r7() {
        this.f10134u = 4;
        if (eb.x.f16448v == null) {
            Pattern pattern = hd.k.f18026b;
            eb.x.f16448v = new eb.x(27);
        }
        eb.x xVar = eb.x.f16448v;
        if (hd.k.f18027c == null) {
            hd.k.f18027c = new hd.k(xVar);
        }
        this.f10137x = hd.k.f18027c;
    }

    public synchronized boolean a() {
        boolean z3;
        if (this.f10135v != 0) {
            ((hd.k) this.f10137x).f18028a.getClass();
            if (System.currentTimeMillis() <= this.f10136w) {
                z3 = false;
            }
        }
        z3 = true;
        return z3;
    }

    public synchronized void b(int i) {
        long min;
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            this.f10135v++;
            synchronized (this) {
                if (i != 429 && (i < 500 || i >= 600)) {
                    min = 86400000;
                    ((hd.k) this.f10137x).f18028a.getClass();
                    this.f10136w = System.currentTimeMillis() + min;
                }
                double pow = Math.pow(2.0d, this.f10135v);
                ((hd.k) this.f10137x).getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), 1800000L);
                ((hd.k) this.f10137x).f18028a.getClass();
                this.f10136w = System.currentTimeMillis() + min;
            }
            return;
        }
        synchronized (this) {
            this.f10135v = 0;
        }
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d1  */
    @Override // com.google.android.gms.internal.ads.zb0
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo213l(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r7.mo213l(java.lang.Object):void");
    }

    public /* synthetic */ r7(s7 s7Var, long j10, int i) {
        this.f10134u = 0;
        this.f10137x = s7Var;
        this.f10136w = j10;
        this.f10135v = i;
    }

    public /* synthetic */ r7(gu1 gu1Var, int i, long j10, long j11) {
        this.f10134u = 1;
        this.f10137x = gu1Var;
        this.f10135v = i;
        this.f10136w = j10;
    }

    public /* synthetic */ r7(int i) {
        this.f10134u = i;
    }

    public r7(int i, URL url, long j10) {
        this.f10134u = 5;
        this.f10135v = i;
        this.f10137x = url;
        this.f10136w = j10;
    }
}
