package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import qb.b;
import qb.n;
import qb.p;

/* loaded from: classes.dex */
public final class HsdpDeepLinkServiceFactory {
    private static final String HPOA_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hpoa.service.HpoaService";
    private static final String HPOA_SERVICE_CLASS_NAME_FOR_TESTING = "com.google.android.play.core.hsdp.testapp.FakeHpoaService";
    private static final String HSDP_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hsdp.service.HsdpService";

    private HsdpDeepLinkServiceFactory() {
    }

    public static b create(Context context) {
        return createInternal(context, false, true);
    }

    private static Intent createHpoaServiceIntent(Context context, boolean z3) {
        if (z3) {
            return new Intent().setClassName(context.getPackageName(), HPOA_SERVICE_CLASS_NAME_FOR_TESTING);
        }
        return new Intent().setClassName("com.android.vending", HPOA_SERVICE_CLASS_NAME);
    }

    public static Intent createHsdpServiceIntent() {
        return new Intent().setClassName("com.android.vending", HSDP_SERVICE_CLASS_NAME);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r0 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static qb.b createInternal(android.content.Context r11, boolean r12, boolean r13) {
        /*
            if (r13 != 0) goto Le
            boolean r0 = r11 instanceof android.app.Activity
            if (r0 == 0) goto L7
            goto Le
        L7:
            java.lang.String r11 = "Context must be an Activity when using activity-based HSDP."
            q.x.n(r11)
        Lc:
            r11 = 0
            return r11
        Le:
            if (r12 == 0) goto L1b
            boolean r0 = r11 instanceof android.app.Activity
            if (r0 == 0) goto L15
            goto L1b
        L15:
            java.lang.String r11 = "Context must be an Activity when enabling loading panel."
            q.x.n(r11)
            goto Lc
        L1b:
            boolean r0 = android.app.ActivityManager.isRunningInTestHarness()
            r1 = 1
            if (r0 != 0) goto L2f
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 0
            if (r0 < r2) goto L31
            boolean r0 = q3.c0.p()
            if (r0 == 0) goto L31
        L2f:
            r8 = r1
            goto L32
        L31:
            r8 = r3
        L32:
            o5.b r4 = new o5.b
            c7.f0 r0 = new c7.f0
            r0.<init>(r11, r8)
            za.c r6 = ya.af.a(r0)
            c4.n r0 = new c4.n
            r1 = 0
            r0.<init>(r11, r1)
            za.c r7 = ya.af.a(r0)
            r5 = r11
            r10 = r12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createInternal(android.content.Context, boolean, boolean):qb.b");
    }

    public static /* synthetic */ n lambda$createInternal$0(Context context, boolean z3) {
        return new p(createHpoaServiceIntent(context, z3), (Activity) context);
    }

    public static b create(Activity activity, boolean z3) {
        return create(activity, z3, false);
    }

    public static b create(Activity activity, boolean z3, boolean z9) {
        return createInternal(activity, z3, z9);
    }

    public static b create(Activity activity) {
        return create(activity, false);
    }
}
