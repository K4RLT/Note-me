package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class lr1 {

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f8112c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8113a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8114b;

    public lr1(String str, int i) {
        this.f8113a = i;
        switch (i) {
            case 1:
                this.f8114b = Logger.getLogger(str);
                return;
            default:
                this.f8114b = str;
                return;
        }
    }

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static lr1 c(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new lr1(cls.getSimpleName(), 0);
        }
        return new lr1(cls.getSimpleName(), 1);
    }

    public final void b(String str) {
        switch (this.f8113a) {
            case 0:
                String str2 = (String) this.f8114b;
                StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 1);
                sb2.append(str2);
                sb2.append(":");
                sb2.append(str);
                Log.d("isoparser", sb2.toString());
                return;
            default:
                ((Logger) this.f8114b).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                return;
        }
    }
}
