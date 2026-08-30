package com.google.android.gms.internal.ads;
import k2.b;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k2 implements q2 {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f7602w = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: x, reason: collision with root package name */
    public static final mu f7603x = new mu(s6.H);

    /* renamed from: y, reason: collision with root package name */
    public static final mu f7604y = new mu(s6.G);

    /* renamed from: u, reason: collision with root package name */
    public y51 f7605u;

    /* renamed from: v, reason: collision with root package name */
    public final s6 f7606v = new s6(18);

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.g9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [com.google.android.gms.internal.ads.la, java.lang.Object] */
    public final void a(int i, ArrayList arrayList) {
        s6 s6Var = this.f7606v;
        switch (i) {
            case 0:
                arrayList.add(new b9());
                return;
            case 1:
                arrayList.add(new d9());
                return;
            case 2:
                arrayList.add(new e9());
                return;
            case 3:
                arrayList.add(new m3());
                return;
            case 4:
                n2 i10 = f7603x.i(0);
                if (i10 != null) {
                    arrayList.add(i10);
                    return;
                } else {
                    arrayList.add(new a4());
                    return;
                }
            case 5:
                arrayList.add(new c4());
                return;
            case 6:
                arrayList.add(new p5(new k5(), 0, s6Var));
                return;
            case 7:
                arrayList.add(new u5());
                return;
            case 8:
                arrayList.add(new n6(s6Var, 704, y51.f12781y));
                arrayList.add(new r6(s6Var, 160));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new aa());
                return;
            case 11:
                if (this.f7605u == null) {
                    b51 b51Var = d51.f5314v;
                    this.f7605u = y51.f12781y;
                }
                dp0 dp0Var = new dp0();
                y51 y51Var = this.f7605u;
                Object obj = new Object();
                obj.f6330a = y51Var;
                arrayList.add(new da(s6Var, dp0Var, obj));
                return;
            case 12:
                Object obj2 = new Object();
                obj2.f7994c = 0;
                obj2.f7995d = -1L;
                obj2.f7996f = -1;
                obj2.f7997g = -1L;
                arrayList.add(obj2);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new h4(1));
                return;
            case 15:
                n2 i11 = f7604y.i(new Object[0]);
                if (i11 != null) {
                    arrayList.add(i11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new p3(s6Var));
                return;
            case 17:
                arrayList.add(new x3(1));
                return;
            case 18:
                arrayList.add(new w3(1));
                return;
            case 19:
                arrayList.add(new x3(0));
                return;
            case 20:
                arrayList.add(new h4(0));
                return;
            case gl.zzm /* 21 */:
                arrayList.add(new w3(0));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0364, code lost:
    
        if (r12 == r4) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0366, code lost:
    
        a(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0142, code lost:
    
        if (r4.equals("application/mp4") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x016d, code lost:
    
        if (r4.equals("image/heic") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0181, code lost:
    
        if (r4.equals("audio/amr-wb") != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x018b, code lost:
    
        if (r4.equals("video/webm") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01aa, code lost:
    
        if (r4.equals("audio/eac3-joc") != false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01af A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01af, B:15:0x01b2, B:20:0x0366, B:21:0x0369, B:23:0x036e, B:26:0x0374, B:28:0x0377, B:32:0x037a, B:37:0x01bb, B:39:0x01c3, B:41:0x01ce, B:44:0x01da, B:46:0x01e4, B:49:0x01ed, B:52:0x01f8, B:55:0x0203, B:58:0x020e, B:60:0x0216, B:62:0x021e, B:64:0x022a, B:66:0x0238, B:69:0x0242, B:72:0x024d, B:74:0x0255, B:76:0x0263, B:78:0x0271, B:80:0x0283, B:82:0x0291, B:84:0x029d, B:86:0x02a5, B:88:0x02ad, B:90:0x02b5, B:92:0x02c1, B:94:0x02c9, B:96:0x02da, B:98:0x02e2, B:100:0x02ee, B:102:0x02f6, B:104:0x0302, B:106:0x030a, B:108:0x0314, B:111:0x031f, B:114:0x0329, B:117:0x0334, B:119:0x033c, B:121:0x0347, B:123:0x034f, B:125:0x0359, B:139:0x004c, B:140:0x0054, B:142:0x0058, B:146:0x0062, B:149:0x006c, B:152:0x0077, B:155:0x0083, B:158:0x008e, B:162:0x0098, B:166:0x00a2, B:170:0x00ac, B:173:0x00b8, B:176:0x00c4, B:179:0x00ce, B:182:0x00d8, B:185:0x00e4, B:188:0x00ee, B:191:0x00f9, B:194:0x0103, B:197:0x010d, B:200:0x0118, B:203:0x0124, B:206:0x0130, B:209:0x013c, B:211:0x0148, B:214:0x0154, B:217:0x015e, B:221:0x0167, B:223:0x0171, B:226:0x017b, B:228:0x0185, B:230:0x018f, B:233:0x0199, B:236:0x01a4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x036e A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01af, B:15:0x01b2, B:20:0x0366, B:21:0x0369, B:23:0x036e, B:26:0x0374, B:28:0x0377, B:32:0x037a, B:37:0x01bb, B:39:0x01c3, B:41:0x01ce, B:44:0x01da, B:46:0x01e4, B:49:0x01ed, B:52:0x01f8, B:55:0x0203, B:58:0x020e, B:60:0x0216, B:62:0x021e, B:64:0x022a, B:66:0x0238, B:69:0x0242, B:72:0x024d, B:74:0x0255, B:76:0x0263, B:78:0x0271, B:80:0x0283, B:82:0x0291, B:84:0x029d, B:86:0x02a5, B:88:0x02ad, B:90:0x02b5, B:92:0x02c1, B:94:0x02c9, B:96:0x02da, B:98:0x02e2, B:100:0x02ee, B:102:0x02f6, B:104:0x0302, B:106:0x030a, B:108:0x0314, B:111:0x031f, B:114:0x0329, B:117:0x0334, B:119:0x033c, B:121:0x0347, B:123:0x034f, B:125:0x0359, B:139:0x004c, B:140:0x0054, B:142:0x0058, B:146:0x0062, B:149:0x006c, B:152:0x0077, B:155:0x0083, B:158:0x008e, B:162:0x0098, B:166:0x00a2, B:170:0x00ac, B:173:0x00b8, B:176:0x00c4, B:179:0x00ce, B:182:0x00d8, B:185:0x00e4, B:188:0x00ee, B:191:0x00f9, B:194:0x0103, B:197:0x010d, B:200:0x0118, B:203:0x0124, B:206:0x0130, B:209:0x013c, B:211:0x0148, B:214:0x0154, B:217:0x015e, B:221:0x0167, B:223:0x0171, B:226:0x017b, B:228:0x0185, B:230:0x018f, B:233:0x0199, B:236:0x01a4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bb A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01af, B:15:0x01b2, B:20:0x0366, B:21:0x0369, B:23:0x036e, B:26:0x0374, B:28:0x0377, B:32:0x037a, B:37:0x01bb, B:39:0x01c3, B:41:0x01ce, B:44:0x01da, B:46:0x01e4, B:49:0x01ed, B:52:0x01f8, B:55:0x0203, B:58:0x020e, B:60:0x0216, B:62:0x021e, B:64:0x022a, B:66:0x0238, B:69:0x0242, B:72:0x024d, B:74:0x0255, B:76:0x0263, B:78:0x0271, B:80:0x0283, B:82:0x0291, B:84:0x029d, B:86:0x02a5, B:88:0x02ad, B:90:0x02b5, B:92:0x02c1, B:94:0x02c9, B:96:0x02da, B:98:0x02e2, B:100:0x02ee, B:102:0x02f6, B:104:0x0302, B:106:0x030a, B:108:0x0314, B:111:0x031f, B:114:0x0329, B:117:0x0334, B:119:0x033c, B:121:0x0347, B:123:0x034f, B:125:0x0359, B:139:0x004c, B:140:0x0054, B:142:0x0058, B:146:0x0062, B:149:0x006c, B:152:0x0077, B:155:0x0083, B:158:0x008e, B:162:0x0098, B:166:0x00a2, B:170:0x00ac, B:173:0x00b8, B:176:0x00c4, B:179:0x00ce, B:182:0x00d8, B:185:0x00e4, B:188:0x00ee, B:191:0x00f9, B:194:0x0103, B:197:0x010d, B:200:0x0118, B:203:0x0124, B:206:0x0130, B:209:0x013c, B:211:0x0148, B:214:0x0154, B:217:0x015e, B:221:0x0167, B:223:0x0171, B:226:0x017b, B:228:0x0185, B:230:0x018f, B:233:0x0199, B:236:0x01a4), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.n2[] b(android.net.Uri r26, java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k2.b(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.n2[]");
    }

    @Override // com.google.android.gms.internal.ads.q2
    /* renamed from: zza */
    public final synchronized n2[] mo203zza() {
        return b(Uri.EMPTY, new HashMap());
    }
}
