package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pt extends mu implements mp {
    public final WindowManager A;
    public final ll B;
    public DisplayMetrics C;
    public float D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;

    /* renamed from: y, reason: collision with root package name */
    public final q00 f9592y;

    /* renamed from: z, reason: collision with root package name */
    public final Context f9593z;

    public pt(q00 q00Var, Context context, ll llVar) {
        super(q00Var, 5, "");
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.f9592y = q00Var;
        this.f9593z = context;
        this.B = llVar;
        this.A = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        boolean z3;
        JSONObject jSONObject;
        this.C = new DisplayMetrics();
        Display defaultDisplay = this.A.getDefaultDisplay();
        defaultDisplay.getMetrics(this.C);
        this.D = this.C.density;
        this.G = defaultDisplay.getRotation();
        l9.d dVar = g9.p.f17688g.f17689a;
        this.E = Math.round(r11.widthPixels / this.C.density);
        this.F = Math.round(r11.heightPixels / this.C.density);
        q00 q00Var = this.f9592y;
        s00 s00Var = q00Var.f9696u;
        Activity f10 = q00Var.f();
        if (f10 != null && f10.getWindow() != null) {
            k9.f0 f0Var = f9.k.C.f16813c;
            int[] p10 = k9.f0.p(f10);
            this.H = Math.round(p10[0] / this.C.density);
            this.I = Math.round(p10[1] / this.C.density);
        } else {
            this.H = this.E;
            this.I = this.F;
        }
        if (s00Var.l0().b()) {
            this.J = this.E;
            this.K = this.F;
        } else {
            q00Var.measure(0, 0);
        }
        s(this.E, this.F, this.H, this.I, this.D, this.G);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        ll llVar = this.B;
        boolean a10 = llVar.a(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean a11 = llVar.a(intent2);
        boolean a12 = llVar.a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        Context context = llVar.f8056v;
        if (((Boolean) wa.k9.a(context, kl.f7794b)).booleanValue() && na.b.a(context).f3851u.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        try {
            jSONObject = new JSONObject().put("sms", a11).put("tel", a10).put("calendar", a12).put("storePicture", z3).put("inlineVideo", true);
        } catch (JSONException e) {
            int i = k9.a0.f19634b;
            l9.i.d("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        q00Var.c("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        q00Var.getLocationOnScreen(iArr);
        g9.p pVar = g9.p.f17688g;
        l9.d dVar2 = pVar.f17689a;
        int i10 = iArr[0];
        Context context2 = this.f9593z;
        u(dVar2.h(context2, i10), pVar.f17689a.h(context2, iArr[1]));
        if (l9.i.j(2)) {
            l9.i.e("Dispatching Ready Event.");
        }
        try {
            ((h00) this.f8422v).c("onReadyEventReceived", new JSONObject().put("js", s00Var.f10440y.f20029u));
        } catch (JSONException e8) {
            int i11 = k9.a0.f19634b;
            l9.i.d("Error occurred while dispatching ready Event.", e8);
        }
    }

    public final void u(int i, int i10) {
        int i11;
        Context context = this.f9593z;
        int i12 = 0;
        if (context instanceof Activity) {
            k9.f0 f0Var = f9.k.C.f16813c;
            i11 = k9.f0.q((Activity) context)[0];
        } else {
            i11 = 0;
        }
        q00 q00Var = this.f9592y;
        s00 s00Var = q00Var.f9696u;
        if (s00Var.l0() == null || !s00Var.l0().b()) {
            int width = q00Var.getWidth();
            int height = q00Var.getHeight();
            if (((Boolean) g9.r.e.f17698c.a(sl.A0)).booleanValue()) {
                if (width == 0) {
                    if (s00Var.l0() != null) {
                        width = s00Var.l0().f12386c;
                    } else {
                        width = 0;
                    }
                }
                if (height == 0) {
                    if (s00Var.l0() != null) {
                        i12 = s00Var.l0().f12385b;
                    }
                    g9.p pVar = g9.p.f17688g;
                    this.J = pVar.f17689a.h(context, width);
                    this.K = pVar.f17689a.h(context, i12);
                }
            }
            i12 = height;
            g9.p pVar2 = g9.p.f17688g;
            this.J = pVar2.f17689a.h(context, width);
            this.K = pVar2.f17689a.h(context, i12);
        }
        int i13 = i10 - i11;
        try {
            ((h00) this.f8422v).c("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i13).put("width", this.J).put("height", this.K));
        } catch (JSONException e) {
            int i14 = k9.a0.f19634b;
            l9.i.d("Error occurred while dispatching default position.", e);
        }
        mt mtVar = s00Var.H.R;
        if (mtVar != null) {
            mtVar.A = i;
            mtVar.B = i10;
        }
    }
}
