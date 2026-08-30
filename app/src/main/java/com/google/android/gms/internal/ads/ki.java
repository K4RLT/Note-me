package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.a0;
import l9.i;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class ki extends Thread {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final String G;
    public final boolean H;
    public final boolean I;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7755u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7756v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f7757w;

    /* renamed from: x, reason: collision with root package name */
    public final nb f7758x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7759y;

    /* renamed from: z, reason: collision with root package name */
    public final int f7760z;

    public ki() {
        nb nbVar = new nb(4, false);
        this.f7755u = false;
        this.f7756v = false;
        this.f7758x = nbVar;
        this.f7757w = new Object();
        this.f7760z = ((Long) om.f9162d.p()).intValue();
        this.A = ((Long) om.f9159a.p()).intValue();
        this.B = ((Long) om.e.p()).intValue();
        this.C = ((Long) om.f9161c.p()).intValue();
        nl nlVar = sl.C0;
        r rVar = r.e;
        this.D = ((Integer) rVar.f17698c.a(nlVar)).intValue();
        nl nlVar2 = sl.D0;
        ql qlVar = rVar.f17698c;
        this.E = ((Integer) qlVar.a(nlVar2)).intValue();
        this.F = ((Integer) qlVar.a(sl.E0)).intValue();
        this.f7759y = ((Long) om.f9163f.p()).intValue();
        this.G = (String) qlVar.a(sl.G0);
        this.H = ((Boolean) qlVar.a(sl.H0)).booleanValue();
        this.I = ((Boolean) qlVar.a(sl.I0)).booleanValue();
        ((Boolean) qlVar.a(sl.J0)).getClass();
        setName("ContentFetchTask");
    }

    public final com.google.android.filament.k a(View view, fi fiVar) {
        if (view == null) {
            return new com.google.android.filament.k(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (!TextUtils.isEmpty(text)) {
                fiVar.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                return new com.google.android.filament.k(this, 1, 0);
            }
            return new com.google.android.filament.k(this, 0, 0);
        }
        if ((view instanceof WebView) && !(view instanceof h00)) {
            WebView webView = (WebView) view;
            synchronized (fiVar.f6071g) {
                fiVar.f6076m++;
            }
            webView.post(new r1(this, fiVar, webView, globalVisibleRect));
            return new com.google.android.filament.k(this, 0, 1);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                com.google.android.filament.k a10 = a(viewGroup.getChildAt(i11), fiVar);
                i += a10.f4254a;
                i10 += a10.f4255b;
            }
            return new com.google.android.filament.k(this, i, i10);
        }
        return new com.google.android.filament.k(this, 0, 0);
    }

    public final void b() {
        synchronized (this.f7757w) {
            this.f7756v = true;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("ContentFetchThread: paused, pause = true");
            String sb3 = sb2.toString();
            int i = a0.f19634b;
            i.a(sb3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4.importance != 100) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r3.inKeyguardRestrictedInputMode() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r0.isScreenOn() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        r0 = k.C.f16816g.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r0 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        r1 = a0.f19634b;
        i.a("ContentFetchThread: no activity. Sleeping.");
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0086, code lost:
    
        if (r0.getWindow() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0090, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0092, code lost:
    
        r2 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a3, code lost:
    
        k.C.f16817h.d("ContentFetchTask.extractContent", r0);
        r1 = a0.f19634b;
        i.a("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0080, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f1, code lost:
    
        r1 = a0.f19634b;
        i.d("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x007e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e0, code lost:
    
        r1 = a0.f19634b;
        i.d("Error in ContentFetchTask", r0);
        k.C.f16817h.d("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb A[EXC_TOP_SPLITTER, LOOP:2: B:37:0x00fb->B:44:0x00fb, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ki.run():void");
    }
}
