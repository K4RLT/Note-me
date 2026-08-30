package com.google.android.gms.internal.ads;
import a5.a;
import f9.k;
import k9.a0;
import l9.i;

import java.util.Map;

/* loaded from: classes.dex */
public final class hp implements mp {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6862u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ hp f6857v = new hp(20);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ hp f6858w = new hp(21);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ hp f6859x = new hp(22);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ hp f6860y = new hp(23);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ hp f6861z = new hp(24);
    public static final /* synthetic */ hp A = new hp(27);

    public /* synthetic */ hp(int i) {
        this.f6862u = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b3, code lost:
    
        if (r3.setExecutable(true, false) == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.internal.ads.kz, com.google.android.gms.internal.ads.jz] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.google.android.gms.internal.ads.jz, com.google.android.gms.internal.ads.oz, com.google.android.gms.internal.ads.my] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(java.lang.Object r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hp.a(java.lang.Object, java.util.Map):void");
    }

    public static final Integer b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            String l10 = a5.a.l(new StringBuilder(str.length() + 39 + String.valueOf(str2).length()), "Precache invalid numeric parameter '", str, "': ", str2);
            int i = k9.a0.f19634b;
            l9.i.f(l10);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:88|89|90)|(12:129|130|131|(10:95|(1:97)|98|(1:100)|101|(1:103)|104|(1:106)|107|(2:109|(1:111)))|112|113|114|(1:116)(1:125)|117|118|120|121)(1:92)|93|(0)|112|113|114|(0)(0)|117|118|120|121|86) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:88|89|90|(12:129|130|131|(10:95|(1:97)|98|(1:100)|101|(1:103)|104|(1:106)|107|(2:109|(1:111)))|112|113|114|(1:116)(1:125)|117|118|120|121)(1:92)|93|(0)|112|113|114|(0)(0)|117|118|120|121|86) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0353, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0354, code lost:
    
        r3 = k9.a0.f19634b;
        l9.i.d("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x033b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x033c, code lost:
    
        f9.k.C.f16817h.d(r3.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ea  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, com.google.android.gms.internal.ads.n21] */
    @Override // com.google.android.gms.internal.ads.mp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r20, java.util.Map r21) {
        /*
            Method dump skipped, instructions count: 2454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hp.d(java.lang.Object, java.util.Map):void");
    }
}
