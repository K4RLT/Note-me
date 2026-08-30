package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p40 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u, reason: collision with root package name */
    public final Context f9359u;

    /* renamed from: v, reason: collision with root package name */
    public View f9360v;

    public p40(Context context) {
        super(context);
        this.f9359u = context;
    }

    public static p40 a(Context context, View view, qp0 qp0Var) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        p40 p40Var = new p40(context);
        List list = qp0Var.f9960u;
        boolean isEmpty = list.isEmpty();
        Context context2 = p40Var.f9359u;
        if (!isEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((rp0) list.get(0)).f10269a;
            float f11 = displayMetrics.density;
            p40Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r5.f10270b * f11)));
        }
        p40Var.f9360v = view;
        p40Var.addView(view);
        fp fpVar = f9.k.C.B;
        dy dyVar = new dy(p40Var, p40Var);
        View view2 = (View) ((WeakReference) dyVar.f11688u).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            dyVar.U1(viewTreeObserver);
        }
        cy cyVar = new cy(p40Var, p40Var);
        View view3 = (View) ((WeakReference) cyVar.f11688u).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            cyVar.U1(viewTreeObserver3);
        }
        JSONObject jSONObject = qp0Var.f9938h0;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            p40Var.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            p40Var.b(optJSONObject2, relativeLayout, 12);
        }
        p40Var.addView(relativeLayout);
        return p40Var;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.f9359u;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double optDouble = jSONObject.optDouble("padding", 0.0d);
        g9.p pVar = g9.p.f17688g;
        l9.d dVar = pVar.f17689a;
        int b10 = l9.d.b(context, (int) optDouble);
        textView.setPadding(0, b10, 0, b10);
        double optDouble2 = jSONObject.optDouble("height", 15.0d);
        l9.d dVar2 = pVar.f17689a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, l9.d.b(context, (int) optDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f9360v.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f9360v.setY(-r0[1]);
    }
}
