package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public final class az implements mp {

    /* renamed from: u, reason: collision with root package name */
    public boolean f4637u;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                l9.d dVar = g9.p.f17688g.f17689a;
                i = l9.d.b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String l10 = a5.a.l(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i10 = k9.a0.f19634b;
                l9.i.f(l10);
            }
        }
        if (k9.a0.m()) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            g3.a.t(sb2, "Parse pixels for ", str, ", got string ", str2);
            sb2.append(", int ");
            sb2.append(i);
            sb2.append(".");
            k9.a0.k(sb2.toString());
        }
        return i;
    }

    public static void b(ly lyVar, Map map) {
        iy iyVar = lyVar.A;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (iyVar != null) {
                    iyVar.B(parseInt);
                }
            } catch (NumberFormatException unused) {
                String h3 = a5.a.h("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i = k9.a0.f19634b;
                l9.i.f(h3);
                return;
            }
        }
        if (str2 != null) {
            int parseInt2 = Integer.parseInt(str2);
            if (iyVar != null) {
                iyVar.C(parseInt2);
            }
        }
        if (str3 != null) {
            int parseInt3 = Integer.parseInt(str3);
            if (iyVar != null) {
                iyVar.a(parseInt3);
            }
        }
        if (str4 != null) {
            int parseInt4 = Integer.parseInt(str4);
            if (iyVar != null) {
                iyVar.b(parseInt4);
            }
        }
        if (str5 != null) {
            int parseInt5 = Integer.parseInt(str5);
            if (iyVar != null) {
                iyVar.c(parseInt5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0393 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.mp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r26, java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.az.d(java.lang.Object, java.util.Map):void");
    }
}
