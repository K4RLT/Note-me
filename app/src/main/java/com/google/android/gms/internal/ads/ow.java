package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ow implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9247a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f9248b;

    /* renamed from: c, reason: collision with root package name */
    public final k9.c0 f9249c;

    /* renamed from: d, reason: collision with root package name */
    public String f9250d = "-1";
    public int e = -1;

    public ow(Context context, k9.c0 c0Var) {
        this.f9248b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f9249c = c0Var;
        this.f9247a = context;
    }

    public final void a(int i, String str) {
        boolean z3;
        Context context;
        nl nlVar = sl.f10771i1;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        boolean booleanValue = ((Boolean) qlVar.a(nlVar)).booleanValue();
        boolean z9 = true;
        if (!booleanValue || this.f9248b.getInt("IABTCF_gdprApplies", -1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!((Boolean) qlVar2.a(sl.f10723f1)).booleanValue() ? !((str.isEmpty() || str.charAt(0) != '1') && z3) : !(i == 0 || ((str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) && z3))) {
            z9 = false;
        }
        this.f9249c.s(z9);
        if (((Boolean) qlVar2.a(sl.f10713e7)).booleanValue() && z9 && (context = this.f9247a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            nl nlVar = sl.f10756h1;
            g9.r rVar = g9.r.e;
            ql qlVar = rVar.f17698c;
            ql qlVar2 = rVar.f17698c;
            if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                boolean equals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f9247a;
                k9.c0 c0Var = this.f9249c;
                if (equals) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    c0Var.i();
                    if (i != c0Var.f19652m) {
                        c0Var.s(true);
                        wa.f9.a(context);
                    }
                    c0Var.b(i);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    c0Var.i();
                    String str2 = c0Var.f19651l;
                    c0Var.a(string);
                    if ((!((Boolean) qlVar2.a(sl.f10771i1)).booleanValue() || sharedPreferences.getInt("IABTCF_gdprApplies", -1) != 0) && !Objects.equals(string, str2)) {
                        c0Var.s(true);
                        wa.f9.a(context);
                        return;
                    }
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode != -2004976699) {
                if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies") && ((Boolean) qlVar2.a(sl.f10723f1)).booleanValue() && i10 != -1 && this.e != i10) {
                    this.e = i10;
                    a(i10, string2);
                    return;
                }
                return;
            }
            if (valueOf.equals("IABTCF_PurposeConsents") && !string2.equals("-1") && !this.f9250d.equals(string2)) {
                this.f9250d = string2;
                a(i10, string2);
            }
        } catch (Throwable th) {
            f9.k.C.f16817h.d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            k9.a0.l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
