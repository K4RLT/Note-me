package com.google.android.gms.internal.ads;
import g9.r;
import k9.a0;
import k9.f0;
import l9.i;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v00 {

    /* renamed from: a, reason: collision with root package name */
    public final lx0 f11765a;

    /* renamed from: b, reason: collision with root package name */
    public final s00 f11766b;

    public v00(s00 s00Var, lx0 lx0Var) {
        this.f11765a = lx0Var;
        this.f11766b = s00Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            a0.k("Click string is empty, not proceeding.");
            return "";
        }
        s00 s00Var = this.f11766b;
        of ofVar = s00Var.f10436v;
        if (ofVar == null) {
            a0.k("Signal utils is empty, ignoring.");
            return "";
        }
        lf lfVar = ofVar.f9103b;
        if (lfVar == null) {
            a0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (s00Var.getContext() == null) {
            a0.k("Context is null, ignoring.");
            return "";
        }
        return lfVar.c(s00Var.getContext(), str, s00Var, s00Var.f10434u.f5247a);
    }

    @JavascriptInterface
    public String getViewSignals() {
        s00 s00Var = this.f11766b;
        of ofVar = s00Var.f10436v;
        if (ofVar == null) {
            a0.k("Signal utils is empty, ignoring.");
            return "";
        }
        lf lfVar = ofVar.f9103b;
        if (lfVar == null) {
            a0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (s00Var.getContext() == null) {
            a0.k("Context is null, ignoring.");
            return "";
        }
        return lfVar.i(s00Var.getContext(), s00Var, s00Var.f10434u.f5247a);
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        c60 c60Var;
        s00 s00Var = this.f11766b;
        sl.a(s00Var.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) r.e.f17698c.a(sl.f10897pf)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            x00 x00Var = s00Var.H;
            if (x00Var != null) {
                c60Var = x00Var.U;
            } else {
                c60Var = null;
            }
            if (c60Var != null) {
                long j10 = c60Var.f5014a.get();
                if (j10 > 0) {
                    jSONObject.put("plcmtid", j10);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            a0.l("Error constructing JSON.", e);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            int i = a0.f19634b;
            i.f("URL is empty, ignoring message");
        } else {
            f0.f19676l.post(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 12, str));
        }
    }
}
