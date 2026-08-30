package com.google.android.gms.internal.ads;
import g9.r;
import k9.a0;
import l9.i;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class z00 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f13024a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f13025b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = f13024a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb2.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb2.append(str3);
            }
            sb2.append(str.substring(end));
        } else {
            if (!f13025b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb2.append(str2);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static String b(qp0 qp0Var) {
        nl nlVar = sl.f10807k6;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && qp0Var.T) {
            jk0 jk0Var = qp0Var.V;
            jk0Var.getClass();
            int i = 1;
            if (((JSONObject) jk0Var.f7466v).optBoolean((String) rVar.f17698c.a(sl.f10837m6), true) && qp0Var.f9926b != 4) {
                if (jk0Var.G() == 1) {
                    i = 3;
                }
                String str = qp0Var.l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", wd0.h(i));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e) {
                    int i10 = a0.f19634b;
                    i.g("Unable to build OMID ENV JSON", e);
                }
            }
        }
        return null;
    }
}
