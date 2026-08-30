package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class jb0 implements mp {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7391u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ lb0 f7392v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ View f7393w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ WindowManager f7394x;

    public /* synthetic */ jb0(lb0 lb0Var, View view, WindowManager windowManager) {
        this.f7392v = lb0Var;
        this.f7393w = view;
        this.f7394x = windowManager;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.gms.internal.ads.kb0] */
    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        int i;
        int i10 = this.f7391u;
        lb0 lb0Var = this.f7392v;
        switch (i10) {
            case 0:
                h00 h00Var = (h00) obj;
                int i11 = k9.a0.f19634b;
                l9.i.a("Hide native ad policy validator overlay.");
                h00Var.U().setVisibility(8);
                if (h00Var.U().getWindowToken() != null) {
                    this.f7394x.removeView(h00Var.U());
                }
                h00Var.destroy();
                ViewTreeObserver viewTreeObserver = this.f7393w.getViewTreeObserver();
                if (lb0Var.f8005c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(lb0Var.f8005c);
                    return;
                }
                return;
            default:
                final h00 h00Var2 = (h00) obj;
                h00Var2.j0().A = new i0.m(6, lb0Var, map, false);
                if (map != null) {
                    final View view = this.f7393w;
                    Context context = view.getContext();
                    String str = (String) map.get("validator_width");
                    nl nlVar = sl.f10825l9;
                    ql qlVar = g9.r.e.f17698c;
                    int b10 = lb0.b(context, str, ((Integer) qlVar.a(nlVar)).intValue());
                    int b11 = lb0.b(context, (String) map.get("validator_height"), ((Integer) qlVar.a(sl.f10840m9)).intValue());
                    int b12 = lb0.b(context, (String) map.get("validator_x"), 0);
                    int b13 = lb0.b(context, (String) map.get("validator_y"), 0);
                    h00Var2.C0(new x0(1, b10, b11));
                    try {
                        h00Var2.u().getSettings().setUseWideViewPort(((Boolean) qlVar.a(sl.f10857n9)).booleanValue());
                        h00Var2.u().getSettings().setLoadWithOverviewMode(((Boolean) qlVar.a(sl.f10874o9)).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams i12 = wa.h9.i();
                    i12.x = b12;
                    i12.y = b13;
                    View U = h00Var2.U();
                    final WindowManager windowManager = this.f7394x;
                    windowManager.updateViewLayout(U, i12);
                    final String str2 = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        if (!"1".equals(str2) && !"2".equals(str2)) {
                            i = rect.top;
                        } else {
                            i = rect.bottom;
                        }
                        final int i13 = i - b13;
                        lb0Var.f8005c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.kb0
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final /* synthetic */ void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (view.getGlobalVisibleRect(rect2)) {
                                    h00 h00Var3 = h00Var2;
                                    if (h00Var3.U().getWindowToken() != null) {
                                        String str3 = str2;
                                        boolean equals = "1".equals(str3);
                                        int i14 = i13;
                                        WindowManager.LayoutParams layoutParams = i12;
                                        if (!equals && !"2".equals(str3)) {
                                            layoutParams.y = rect2.top - i14;
                                        } else {
                                            layoutParams.y = rect2.bottom - i14;
                                        }
                                        windowManager.updateViewLayout(h00Var3.U(), layoutParams);
                                    }
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(lb0Var.f8005c);
                        }
                    }
                    String str3 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str3)) {
                        h00Var2.loadUrl(str3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jb0(lb0 lb0Var, WindowManager windowManager, View view) {
        this.f7392v = lb0Var;
        this.f7394x = windowManager;
        this.f7393w = view;
    }
}
