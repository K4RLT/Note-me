package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class pp implements mp {

    /* renamed from: x, reason: collision with root package name */
    public static final Map f9573x;

    /* renamed from: u, reason: collision with root package name */
    public final f9.a f9574u;

    /* renamed from: v, reason: collision with root package name */
    public final mt f9575v;

    /* renamed from: w, reason: collision with root package name */
    public final hx0 f9576w;

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, n.r0] */
    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        n.r0 r0Var = new n.r0(7);
        for (int i = 0; i < 7; i++) {
            r0Var.put(strArr[i], numArr[i]);
        }
        f9573x = Collections.unmodifiableMap(r0Var);
    }

    public pp(f9.a aVar, mt mtVar, hx0 hx0Var) {
        this.f9574u = aVar;
        this.f9575v = mtVar;
        this.f9576w = hx0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0447 A[Catch: all -> 0x01cb, TryCatch #0 {all -> 0x01cb, blocks: (B:93:0x01c0, B:95:0x01c4, B:96:0x01c9, B:98:0x01ce, B:100:0x01d6, B:101:0x01db, B:103:0x01dd, B:105:0x01e7, B:106:0x01ec, B:108:0x01ee, B:110:0x01f4, B:111:0x01f9, B:113:0x01fb, B:115:0x0209, B:116:0x021b, B:118:0x0229, B:119:0x023b, B:121:0x0249, B:122:0x025b, B:124:0x0269, B:125:0x027b, B:127:0x0289, B:128:0x0297, B:130:0x02a5, B:131:0x02a7, B:133:0x02ab, B:135:0x02af, B:137:0x02b5, B:140:0x02bd, B:143:0x02f1, B:148:0x0301, B:151:0x0447, B:152:0x044c, B:154:0x044e, B:156:0x0477, B:158:0x0483, B:159:0x04b9, B:164:0x0532, B:165:0x058d, B:167:0x05a5, B:168:0x05cd, B:170:0x05d5, B:171:0x05e0, B:172:0x0607, B:176:0x060a, B:178:0x0638, B:179:0x064a, B:183:0x0543, B:186:0x0554, B:189:0x0563, B:192:0x0572, B:196:0x0583, B:197:0x0587, B:198:0x04b6, B:199:0x064c, B:200:0x0651, B:202:0x030f, B:204:0x0313, B:207:0x03b6, B:208:0x0395, B:211:0x03c3, B:213:0x03c7, B:215:0x03cb, B:219:0x03d9, B:220:0x03e8, B:223:0x041e, B:226:0x042e, B:227:0x0424, B:229:0x042c, B:230:0x0415, B:232:0x041b, B:236:0x032a, B:240:0x0346, B:241:0x0351, B:246:0x0367, B:249:0x037c, B:252:0x038e, B:255:0x03a3, B:258:0x0433, B:260:0x043c, B:261:0x0653, B:262:0x0658, B:264:0x065a, B:265:0x065f), top: B:92:0x01c0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x044e A[Catch: all -> 0x01cb, TryCatch #0 {all -> 0x01cb, blocks: (B:93:0x01c0, B:95:0x01c4, B:96:0x01c9, B:98:0x01ce, B:100:0x01d6, B:101:0x01db, B:103:0x01dd, B:105:0x01e7, B:106:0x01ec, B:108:0x01ee, B:110:0x01f4, B:111:0x01f9, B:113:0x01fb, B:115:0x0209, B:116:0x021b, B:118:0x0229, B:119:0x023b, B:121:0x0249, B:122:0x025b, B:124:0x0269, B:125:0x027b, B:127:0x0289, B:128:0x0297, B:130:0x02a5, B:131:0x02a7, B:133:0x02ab, B:135:0x02af, B:137:0x02b5, B:140:0x02bd, B:143:0x02f1, B:148:0x0301, B:151:0x0447, B:152:0x044c, B:154:0x044e, B:156:0x0477, B:158:0x0483, B:159:0x04b9, B:164:0x0532, B:165:0x058d, B:167:0x05a5, B:168:0x05cd, B:170:0x05d5, B:171:0x05e0, B:172:0x0607, B:176:0x060a, B:178:0x0638, B:179:0x064a, B:183:0x0543, B:186:0x0554, B:189:0x0563, B:192:0x0572, B:196:0x0583, B:197:0x0587, B:198:0x04b6, B:199:0x064c, B:200:0x0651, B:202:0x030f, B:204:0x0313, B:207:0x03b6, B:208:0x0395, B:211:0x03c3, B:213:0x03c7, B:215:0x03cb, B:219:0x03d9, B:220:0x03e8, B:223:0x041e, B:226:0x042e, B:227:0x0424, B:229:0x042c, B:230:0x0415, B:232:0x041b, B:236:0x032a, B:240:0x0346, B:241:0x0351, B:246:0x0367, B:249:0x037c, B:252:0x038e, B:255:0x03a3, B:258:0x0433, B:260:0x043c, B:261:0x0653, B:262:0x0658, B:264:0x065a, B:265:0x065f), top: B:92:0x01c0, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.mp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pp.d(java.lang.Object, java.util.Map):void");
    }
}
