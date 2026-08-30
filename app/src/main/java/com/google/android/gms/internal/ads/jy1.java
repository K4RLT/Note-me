package com.google.android.gms.internal.ads;
import b0.a;
import b0.g1;
import r2.k;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class jy1 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7572a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.mlkit_vision_digital_ink.gw f7573b;

    /* renamed from: c, reason: collision with root package name */
    public final zd1 f7574c;

    /* renamed from: d, reason: collision with root package name */
    public final my1 f7575d;
    public final qb0 e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f7577g;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public dj1 f7579j;

    /* renamed from: k, reason: collision with root package name */
    public i3 f7580k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ my1 f7582m;

    /* renamed from: f, reason: collision with root package name */
    public final a f7576f = new a(10);

    /* renamed from: h, reason: collision with root package name */
    public boolean f7578h = true;

    public jy1(my1 my1Var, Uri uri, pf1 pf1Var, zd1 zd1Var, my1 my1Var2, qb0 qb0Var) {
        this.f7582m = my1Var;
        this.f7572a = uri;
        this.f7573b = new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(pf1Var);
        this.f7574c = zd1Var;
        this.f7575d = my1Var2;
        this.e = qb0Var;
        qx1.f10024a.getAndIncrement();
        this.f7579j = b(0L, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x025a, code lost:
    
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025f, code lost:
    
        if (r6 != 1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0261, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0274, code lost:
    
        k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0269, code lost:
    
        if (r9.n() == (-1)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x026b, code lost:
    
        r28.f7576f.f1139v = r9.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0273, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025a A[EDGE_INSN: B:145:0x025a->B:130:0x025a BREAK  A[LOOP:1: B:62:0x0201->B:93:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:162:0x0095, B:164:0x009b, B:21:0x00d9, B:23:0x00e3, B:24:0x00ef, B:26:0x00f9, B:27:0x0105, B:29:0x010f, B:30:0x011b, B:32:0x0125, B:33:0x0137, B:35:0x0141, B:37:0x0147, B:41:0x0180, B:42:0x018a, B:44:0x0194, B:46:0x0199, B:49:0x01a4, B:50:0x01c7, B:52:0x01de, B:55:0x01e5, B:57:0x01e9, B:58:0x01ee, B:60:0x01f2, B:150:0x0151, B:153:0x0171, B:169:0x00a7, B:172:0x00cb), top: B:161:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:162:0x0095, B:164:0x009b, B:21:0x00d9, B:23:0x00e3, B:24:0x00ef, B:26:0x00f9, B:27:0x0105, B:29:0x010f, B:30:0x011b, B:32:0x0125, B:33:0x0137, B:35:0x0141, B:37:0x0147, B:41:0x0180, B:42:0x018a, B:44:0x0194, B:46:0x0199, B:49:0x01a4, B:50:0x01c7, B:52:0x01de, B:55:0x01e5, B:57:0x01e9, B:58:0x01ee, B:60:0x01f2, B:150:0x0151, B:153:0x0171, B:169:0x00a7, B:172:0x00cb), top: B:161:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:162:0x0095, B:164:0x009b, B:21:0x00d9, B:23:0x00e3, B:24:0x00ef, B:26:0x00f9, B:27:0x0105, B:29:0x010f, B:30:0x011b, B:32:0x0125, B:33:0x0137, B:35:0x0141, B:37:0x0147, B:41:0x0180, B:42:0x018a, B:44:0x0194, B:46:0x0199, B:49:0x01a4, B:50:0x01c7, B:52:0x01de, B:55:0x01e5, B:57:0x01e9, B:58:0x01ee, B:60:0x01f2, B:150:0x0151, B:153:0x0171, B:169:0x00a7, B:172:0x00cb), top: B:161:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:162:0x0095, B:164:0x009b, B:21:0x00d9, B:23:0x00e3, B:24:0x00ef, B:26:0x00f9, B:27:0x0105, B:29:0x010f, B:30:0x011b, B:32:0x0125, B:33:0x0137, B:35:0x0141, B:37:0x0147, B:41:0x0180, B:42:0x018a, B:44:0x0194, B:46:0x0199, B:49:0x01a4, B:50:0x01c7, B:52:0x01de, B:55:0x01e5, B:57:0x01e9, B:58:0x01ee, B:60:0x01f2, B:150:0x0151, B:153:0x0171, B:169:0x00a7, B:172:0x00cb), top: B:161:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0141 A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #4 {all -> 0x00c7, blocks: (B:162:0x0095, B:164:0x009b, B:21:0x00d9, B:23:0x00e3, B:24:0x00ef, B:26:0x00f9, B:27:0x0105, B:29:0x010f, B:30:0x011b, B:32:0x0125, B:33:0x0137, B:35:0x0141, B:37:0x0147, B:41:0x0180, B:42:0x018a, B:44:0x0194, B:46:0x0199, B:49:0x01a4, B:50:0x01c7, B:52:0x01de, B:55:0x01e5, B:57:0x01e9, B:58:0x01ee, B:60:0x01f2, B:150:0x0151, B:153:0x0171, B:169:0x00a7, B:172:0x00cb), top: B:161:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:162:0x0095, B:164:0x009b, B:21:0x00d9, B:23:0x00e3, B:24:0x00ef, B:26:0x00f9, B:27:0x0105, B:29:0x010f, B:30:0x011b, B:32:0x0125, B:33:0x0137, B:35:0x0141, B:37:0x0147, B:41:0x0180, B:42:0x018a, B:44:0x0194, B:46:0x0199, B:49:0x01a4, B:50:0x01c7, B:52:0x01de, B:55:0x01e5, B:57:0x01e9, B:58:0x01ee, B:60:0x01f2, B:150:0x0151, B:153:0x0171, B:169:0x00a7, B:172:0x00cb), top: B:161:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0194 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:162:0x0095, B:164:0x009b, B:21:0x00d9, B:23:0x00e3, B:24:0x00ef, B:26:0x00f9, B:27:0x0105, B:29:0x010f, B:30:0x011b, B:32:0x0125, B:33:0x0137, B:35:0x0141, B:37:0x0147, B:41:0x0180, B:42:0x018a, B:44:0x0194, B:46:0x0199, B:49:0x01a4, B:50:0x01c7, B:52:0x01de, B:55:0x01e5, B:57:0x01e9, B:58:0x01ee, B:60:0x01f2, B:150:0x0151, B:153:0x0171, B:169:0x00a7, B:172:0x00cb), top: B:161:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:162:0x0095, B:164:0x009b, B:21:0x00d9, B:23:0x00e3, B:24:0x00ef, B:26:0x00f9, B:27:0x0105, B:29:0x010f, B:30:0x011b, B:32:0x0125, B:33:0x0137, B:35:0x0141, B:37:0x0147, B:41:0x0180, B:42:0x018a, B:44:0x0194, B:46:0x0199, B:49:0x01a4, B:50:0x01c7, B:52:0x01de, B:55:0x01e5, B:57:0x01e9, B:58:0x01ee, B:60:0x01f2, B:150:0x0151, B:153:0x0171, B:169:0x00a7, B:172:0x00cb), top: B:161:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f2 A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #4 {all -> 0x00c7, blocks: (B:162:0x0095, B:164:0x009b, B:21:0x00d9, B:23:0x00e3, B:24:0x00ef, B:26:0x00f9, B:27:0x0105, B:29:0x010f, B:30:0x011b, B:32:0x0125, B:33:0x0137, B:35:0x0141, B:37:0x0147, B:41:0x0180, B:42:0x018a, B:44:0x0194, B:46:0x0199, B:49:0x01a4, B:50:0x01c7, B:52:0x01de, B:55:0x01e5, B:57:0x01e9, B:58:0x01ee, B:60:0x01f2, B:150:0x0151, B:153:0x0171, B:169:0x00a7, B:172:0x00cb), top: B:161:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v6, types: [g1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jy1.a():void");
    }

    public final dj1 b(long j10, String str) {
        Map map = my1.f8482i0;
        if (str != null && !str.startsWith("W/")) {
            nb nbVar = new nb(4);
            nbVar.j(map.entrySet());
            nbVar.e("If-Range", str);
            map = nbVar.q(false);
        }
        Map map2 = Collections.EMPTY_MAP;
        Uri uri = this.f7572a;
        b80.M(uri, "The uri must be set.");
        return new dj1(uri, map, j10, -1L, 6);
    }
}
