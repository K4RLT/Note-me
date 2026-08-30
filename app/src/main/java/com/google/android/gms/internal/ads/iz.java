package com.google.android.gms.internal.ads;
import ic.c;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class iz implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7257u = 2;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f7258v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f7259w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7260x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7261y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7262z;

    public /* synthetic */ iz(tw twVar, Throwable th, xs0 xs0Var, String str, c cVar) {
        this.f7259w = twVar;
        this.f7260x = th;
        this.f7261y = xs0Var;
        this.f7258v = str;
        this.f7262z = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0145, code lost:
    
        if (r9.equals("noCacheDir") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0150, code lost:
    
        r2 = "io";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        if (r9.equals("expireFailed") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0162, code lost:
    
        if (r9.equals("externalAbort") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016d, code lost:
    
        r2 = "policy";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016b, code lost:
    
        if (r9.equals("sizeExceeded") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017c, code lost:
    
        if (r9.equals("downloadTimeout") != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018a, code lost:
    
        r2 = "network";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0188, code lost:
    
        if (r9.equals("badUrl") != false) goto L65;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.iz.run():void");
    }

    public /* synthetic */ iz(af0 af0Var, String str, xe0 xe0Var, iq0 iq0Var, ArrayList arrayList) {
        this.f7259w = af0Var;
        this.f7258v = str;
        this.f7260x = xe0Var;
        this.f7261y = iq0Var;
        this.f7262z = arrayList;
    }

    public /* synthetic */ iz(c11 c11Var, HashMap hashMap, Context context, View view, Activity activity) {
        this.f7258v = c11Var;
        this.f7259w = hashMap;
        this.f7260x = context;
        this.f7261y = view;
        this.f7262z = activity;
    }

    public /* synthetic */ iz(c11 c11Var, HashMap hashMap, Context context, View view, String str) {
        this.f7259w = c11Var;
        this.f7260x = hashMap;
        this.f7261y = context;
        this.f7262z = view;
        this.f7258v = str;
    }

    public iz(jz jzVar, String str, String str2, String str3, String str4) {
        this.f7258v = str;
        this.f7259w = str2;
        this.f7260x = str3;
        this.f7261y = str4;
        this.f7262z = jzVar;
    }
}
