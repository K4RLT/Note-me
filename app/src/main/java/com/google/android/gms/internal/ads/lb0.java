package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class lb0 {

    /* renamed from: a, reason: collision with root package name */
    public final gd0 f8003a;

    /* renamed from: b, reason: collision with root package name */
    public final rc0 f8004b;

    /* renamed from: c, reason: collision with root package name */
    public kb0 f8005c = null;

    public lb0(gd0 gd0Var, rc0 rc0Var) {
        this.f8003a = gd0Var;
        this.f8004b = rc0Var;
    }

    public static final int b(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        l9.d dVar = g9.p.f17688g.f17689a;
        return l9.d.b(context, i);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        h00 a10 = this.f8003a.a(g9.c3.a(), null, null);
        a10.U().setVisibility(4);
        a10.U().setContentDescription("policy_validator");
        a10.h1("/sendMessageToSdk", new cp(9, this));
        a10.h1("/hideValidatorOverlay", new jb0(this, windowManager, frameLayout));
        a10.h1("/open", new tp(null, null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(a10);
        jb0 jb0Var = new jb0(this, frameLayout, windowManager);
        rc0 rc0Var = this.f8004b;
        rc0Var.b("/loadNativeAdPolicyViolations", new ba0(rc0Var, weakReference, "/loadNativeAdPolicyViolations", jb0Var));
        rc0Var.b("/showValidatorOverlay", new ba0(rc0Var, new WeakReference(a10), "/showValidatorOverlay", hp.A));
        return a10.U();
    }
}
