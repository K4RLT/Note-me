package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class gp implements mp {

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f6440u = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f6441v = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        h00 h00Var = (h00) obj;
        String str = (String) map.get("action");
        boolean equals = "tick".equals(str);
        Pattern pattern = f6440u;
        if (equals) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                int i = k9.a0.f19634b;
                l9.i.f("No label given for CSI tick.");
                return;
            }
            nl nlVar = sl.H2;
            g9.r rVar = g9.r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && !pattern.matcher(str2).matches()) {
                int i10 = k9.a0.f19634b;
                l9.i.a("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                int i11 = k9.a0.f19634b;
                l9.i.f("No timestamp given for CSI tick.");
                return;
            }
            try {
                long parseLong = Long.parseLong(str4);
                f9.k kVar = f9.k.C;
                kVar.f16819k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                kVar.f16819k.getClass();
                long elapsedRealtime = (parseLong - currentTimeMillis) + SystemClock.elapsedRealtime();
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && !pattern.matcher(str3).matches()) {
                    int i12 = k9.a0.f19634b;
                    l9.i.a("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
                j6.l j10 = h00Var.j();
                HashMap hashMap = (HashMap) j10.f18933v;
                ul ulVar = (ul) hashMap.get(str3);
                String[] strArr = {str2};
                if (ulVar != null) {
                    ((wl) j10.f18934w).a(ulVar, elapsedRealtime, strArr);
                }
                hashMap.put(str2, new ul(elapsedRealtime, null, null));
                return;
            } catch (NumberFormatException e) {
                int i13 = k9.a0.f19634b;
                l9.i.g("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                int i14 = k9.a0.f19634b;
                l9.i.f("No value given for CSI experiment.");
                return;
            }
            if (((Boolean) g9.r.e.f17698c.a(sl.H2)).booleanValue() && !f6441v.matcher(str5).matches()) {
                int i15 = k9.a0.f19634b;
                l9.i.a("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                return;
            } else {
                ((wl) h00Var.j().f18934w).c("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                int i16 = k9.a0.f19634b;
                l9.i.f("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                int i17 = k9.a0.f19634b;
                l9.i.f("No name given for CSI extra.");
                return;
            }
            if (((Boolean) g9.r.e.f17698c.a(sl.H2)).booleanValue() && !pattern.matcher(str6).matches()) {
                int i18 = k9.a0.f19634b;
                l9.i.a("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            } else {
                ((wl) h00Var.j().f18934w).c(str6, str7);
            }
        }
    }
}
