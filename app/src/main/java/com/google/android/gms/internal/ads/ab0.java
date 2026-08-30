package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ab0 {

    /* renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f4430k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    public final k9.c0 f4431a;

    /* renamed from: b, reason: collision with root package name */
    public final aq0 f4432b;

    /* renamed from: c, reason: collision with root package name */
    public final ta0 f4433c;

    /* renamed from: d, reason: collision with root package name */
    public final ra0 f4434d;
    public final ib0 e;

    /* renamed from: f, reason: collision with root package name */
    public final lb0 f4435f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f4436g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f4437h;
    public final rn i;

    /* renamed from: j, reason: collision with root package name */
    public final pa0 f4438j;

    public ab0(k9.c0 c0Var, aq0 aq0Var, ta0 ta0Var, ra0 ra0Var, ib0 ib0Var, lb0 lb0Var, Executor executor, wx wxVar, pa0 pa0Var) {
        this.f4431a = c0Var;
        this.f4432b = aq0Var;
        this.i = aq0Var.f4585j;
        this.f4433c = ta0Var;
        this.f4434d = ra0Var;
        this.e = ib0Var;
        this.f4435f = lb0Var;
        this.f4436g = executor;
        this.f4437h = wxVar;
        this.f4438j = pa0Var;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    return;
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                    return;
                }
            }
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            return;
        }
        layoutParams.addRule(10);
        layoutParams.addRule(9);
    }

    public final void a(mb0 mb0Var) {
        if (mb0Var != null) {
            Context context = mb0Var.M0().getContext();
            if (wa.h9.g(context, this.f4433c.f11300a)) {
                if (!(context instanceof Activity)) {
                    int i = k9.a0.f19634b;
                    l9.i.a("Activity context is needed for policy validator.");
                    return;
                }
                lb0 lb0Var = this.f4435f;
                if (lb0Var != null && mb0Var.b4() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(lb0Var.a(mb0Var.b4(), windowManager), wa.h9.i());
                    } catch (o00 e) {
                        k9.a0.l("web view can not be obtained", e);
                    }
                }
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z3) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        ra0 ra0Var = this.f4434d;
        if (z3) {
            synchronized (ra0Var) {
                view = ra0Var.f10177o;
            }
        } else {
            synchronized (ra0Var) {
                view = ra0Var.f10178p;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (((Boolean) g9.r.e.f17698c.a(sl.J4)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(view, layoutParams);
        return true;
    }
}
