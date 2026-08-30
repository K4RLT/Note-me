package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.b0;
import k9.f0;
import l9.a;
import r.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ag0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4492a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.a f4493b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f4494c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f4495d = new AtomicReference("");

    public ag0(Context context, l9.a aVar, wx wxVar) {
        this.f4492a = context;
        this.f4493b = aVar;
        this.f4494c = wxVar;
    }

    public static final String c(String str) {
        String str2 = new String(Base64.decode((String) g9.r.e.f17698c.a(sl.Uf), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        k9.b0 b0Var = k9.f0.f19676l;
        char[] charArray = str3.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public final String a() {
        nl nlVar = sl.Qf;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (!((Boolean) qlVar.a(nlVar)).booleanValue() || ((String) qlVar2.a(sl.Sf)).isEmpty() || ((String) qlVar2.a(sl.Tf)).isEmpty() || ((String) qlVar2.a(sl.Uf)).isEmpty()) {
            return null;
        }
        String str = (String) this.f4495d.get();
        if (str.isEmpty()) {
            this.f4494c.execute(new e40(11, this));
            return null;
        }
        return str;
    }

    public final String b() {
        String str;
        l9.a aVar = this.f4493b;
        String str2 = null;
        if (aVar.f20032x) {
            str = x00.class.getName();
        } else {
            try {
                str = (String) new JSONObject(c((String) g9.r.e.f17698c.a(sl.Sf))).get(Integer.toString(aVar.f20031w));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e) {
                if (((Boolean) g9.r.e.f17698c.a(sl.Rf)).booleanValue()) {
                    f9.k.C.f16817h.d("SdkIE", e);
                }
                str = null;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                str2 = c((String) g9.r.e.f17698c.a(sl.Tf));
            } catch (IllegalArgumentException e8) {
                if (((Boolean) g9.r.e.f17698c.a(sl.Rf)).booleanValue()) {
                    f9.k.C.f16817h.d("SdkIE", e8);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return "3";
            }
            try {
                for (Method method : this.f4492a.getClassLoader().loadClass(str).getDeclaredMethods()) {
                    if (method.getName().matches(str2)) {
                        return "1";
                    }
                }
                return "0";
            } catch (ClassNotFoundException unused) {
                return "4";
            } catch (NoClassDefFoundError unused2) {
                return "6";
            } catch (SecurityException unused3) {
                return "7";
            } catch (PatternSyntaxException unused4) {
                return "5";
            }
        }
        return "2";
    }
}
