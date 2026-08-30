package com.google.android.gms.internal.ads;
import a5.a;

import android.util.Pair;
import androidx.ink.storage.DecompressedBytes;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class va0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f11866a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f11867b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f11868c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z3, int i10, int i11, int[] iArr, int i12) {
        char c10;
        int i13;
        String str = f11867b[i];
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i11);
        if (true != z3) {
            c10 = 'L';
        } else {
            c10 = 'H';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c10), Integer.valueOf(i12)};
        String str2 = bq0.f4860a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (true) {
            if (i14 <= 0) {
                break;
            }
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (i13 = 0; i13 < i14; i13++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb2.toString();
    }

    public static Pair b(mw1 mw1Var) {
        boolean z3;
        ia0 c10 = c(mw1Var);
        if (c10 != null && (z3 = c10.f7070b)) {
            b80.K(z3);
            Integer valueOf = Integer.valueOf(c10.f7069a);
            b80.K(z3);
            return new Pair(valueOf, Integer.valueOf(c10.f7071c));
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f9, code lost:
    
        if (r2.equals("vvi1") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0207, code lost:
    
        if (r5.length >= 3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0209, code lost:
    
        a.r(r13, "Ignoring malformed VVC codec string: ", "CodecSpecificDataUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020e, code lost:
    
        r1 = java.lang.Integer.parseInt(r5[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0214, code lost:
    
        if (r1 != 1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0216, code lost:
    
        if (r15 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021a, code lost:
    
        if (r15.f8365c != 6) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021c, code lost:
    
        r11 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0231, code lost:
    
        r0 = r5[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0237, code lost:
    
        switch(r0.hashCode()) {
            case 70918: goto L199;
            case 70921: goto L196;
            case 70976: goto L193;
            case 70979: goto L190;
            case 70982: goto L187;
            case 71013: goto L184;
            case 74609: goto L181;
            case 74667: goto L178;
            case 74670: goto L175;
            case 74704: goto L172;
            case 74728: goto L169;
            case 74762: goto L166;
            case 74765: goto L163;
            case 74820: goto L160;
            case 74823: goto L157;
            case 74826: goto L154;
            case 74857: goto L151;
            case 2193610: goto L148;
            case 2193647: goto L145;
            case 2193705: goto L142;
            case 2312774: goto L139;
            case 2312811: goto L136;
            case 2312869: goto L133;
            default: goto L202;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0242, code lost:
    
        if (r0.equals("L144") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0244, code lost:
    
        r2 = 2097152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0364, code lost:
    
        if (r2 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0366, code lost:
    
        com.google.android.gms.internal.ads.x21.F("CodecSpecificDataUtil", "Unknown VVC level string: ".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x036f, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x037a, code lost:
    
        return new com.google.android.gms.internal.ads.ia0(r11, r2.intValue(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0252, code lost:
    
        if (r0.equals("L128") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
    
        r2 = 524288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0262, code lost:
    
        if (r0.equals("L112") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0264, code lost:
    
        r2 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0272, code lost:
    
        if (r0.equals("H144") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0274, code lost:
    
        r2 = 4194304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0282, code lost:
    
        if (r0.equals("H128") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0284, code lost:
    
        r2 = 1048576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0292, code lost:
    
        if (r0.equals("H112") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0294, code lost:
    
        r2 = 262144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02a2, code lost:
    
        if (r0.equals("L96") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02a4, code lost:
    
        r2 = java.lang.Integer.valueOf(androidx.ink.storage.DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b0, code lost:
    
        if (r0.equals("L86") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b2, code lost:
    
        r2 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02be, code lost:
    
        if (r0.equals("L83") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02c0, code lost:
    
        r2 = 2048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ca, code lost:
    
        if (r0.equals("L80") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02cc, code lost:
    
        r2 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02d5, code lost:
    
        if (r0.equals("L67") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02d7, code lost:
    
        r2 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e0, code lost:
    
        if (r0.equals("L64") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02e2, code lost:
    
        r2 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02ec, code lost:
    
        if (r0.equals("L51") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ee, code lost:
    
        r2 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02f8, code lost:
    
        if (r0.equals("L48") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02fa, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0304, code lost:
    
        if (r0.equals("L35") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0306, code lost:
    
        r2 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0310, code lost:
    
        if (r0.equals("L32") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0312, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x031b, code lost:
    
        if (r0.equals("L16") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x031d, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0326, code lost:
    
        if (r0.equals("H96") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0328, code lost:
    
        r2 = 65536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0333, code lost:
    
        if (r0.equals("H86") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0335, code lost:
    
        r2 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0340, code lost:
    
        if (r0.equals("H83") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0342, code lost:
    
        r2 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x034a, code lost:
    
        if (r0.equals("H80") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x034c, code lost:
    
        r2 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0354, code lost:
    
        if (r0.equals("H67") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0356, code lost:
    
        r2 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x035e, code lost:
    
        if (r0.equals("H64") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0360, code lost:
    
        r2 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0362, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x021f, code lost:
    
        if (r15 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0225, code lost:
    
        if (r15.e != 8) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0227, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0229, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x022e, code lost:
    
        if (r1 != 65) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0230, code lost:
    
        r11 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x037b, code lost:
    
        a.r(r5[1], "Unknown VVC profile IDC: ", "CodecSpecificDataUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0383, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0384, code lost:
    
        a.r(r13, "Ignoring malformed VVC codec string: ", "CodecSpecificDataUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0202, code lost:
    
        if (r2.equals("vvc1") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x067e, code lost:
    
        if (r2.equals("hvc1") != false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x068d, code lost:
    
        return d(r13, r5, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0687, code lost:
    
        if (r2.equals("hev1") != false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0696, code lost:
    
        if (r2.equals("avc2") != false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x06a3, code lost:
    
        r2 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x06a7, code lost:
    
        if (r2 >= 2) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x06a9, code lost:
    
        a.r(r13, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x06ac, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x06b5, code lost:
    
        if (r5[1].length() != 6) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x06b7, code lost:
    
        r8 = 16;
        r0 = java.lang.Integer.parseInt(r5[1].substring(0, 2), 16);
        r2 = java.lang.Integer.parseInt(r5[1].substring(4), 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x06e6, code lost:
    
        if (r0 == 66) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x06ea, code lost:
    
        if (r0 == 77) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x06ee, code lost:
    
        if (r0 == 88) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x06f2, code lost:
    
        if (r0 == 100) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x06f6, code lost:
    
        if (r0 == 110) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x06fa, code lost:
    
        if (r0 == 122) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x06fe, code lost:
    
        if (r0 == 244) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0700, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0711, code lost:
    
        if (r3 != (-1)) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0713, code lost:
    
        a.t(new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 21), "Unknown AVC profile: ", r0, "CodecSpecificDataUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0729, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x072a, code lost:
    
        switch(r2) {
            case 10: goto L501;
            case 11: goto L500;
            case 12: goto L499;
            case 13: goto L498;
            default: goto L482;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x072d, code lost:
    
        switch(r2) {
            case 20: goto L502;
            case 21: goto L497;
            case 22: goto L496;
            default: goto L483;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0730, code lost:
    
        switch(r2) {
            case 30: goto L495;
            case 31: goto L494;
            case 32: goto L493;
            default: goto L484;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0733, code lost:
    
        switch(r2) {
            case 40: goto L492;
            case 41: goto L491;
            case 42: goto L490;
            default: goto L485;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0736, code lost:
    
        switch(r2) {
            case 50: goto L489;
            case 51: goto L488;
            case 52: goto L487;
            default: goto L486;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0739, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x073b, code lost:
    
        r4 = 65536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x073e, code lost:
    
        r4 = 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0741, code lost:
    
        r4 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0744, code lost:
    
        r4 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0747, code lost:
    
        r4 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x074a, code lost:
    
        r4 = 2048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x074d, code lost:
    
        r4 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0750, code lost:
    
        r4 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0753, code lost:
    
        r4 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0756, code lost:
    
        r4 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0759, code lost:
    
        r4 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0764, code lost:
    
        if (r4 != (-1)) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0766, code lost:
    
        a.t(new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 19), "Unknown AVC level: ", r2, "CodecSpecificDataUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x077a, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0781, code lost:
    
        return new com.google.android.gms.internal.ads.ia0(r3, r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x075c, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x075e, code lost:
    
        r4 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0761, code lost:
    
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0763, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0702, code lost:
    
        r3 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0705, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0707, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0709, code lost:
    
        r3 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x070c, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x070e, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0710, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06d0, code lost:
    
        r8 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x06d2, code lost:
    
        if (r2 < 3) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x06d4, code lost:
    
        r0 = java.lang.Integer.parseInt(r5[1]);
        r2 = java.lang.Integer.parseInt(r5[2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0782, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r13).length() + 37);
        r1.append("Ignoring malformed AVC codec string: ");
        r1.append(r13);
        com.google.android.gms.internal.ads.x21.F("CodecSpecificDataUtil", r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x079e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x079f, code lost:
    
        a.r(r13, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x06a1, code lost:
    
        if (r2.equals("avc1") != false) goto L445;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x01ee. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0b99  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.ia0 c(com.google.android.gms.internal.ads.mw1 r35) {
        /*
            Method dump skipped, instructions count: 3464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.va0.c(com.google.android.gms.internal.ads.mw1):com.google.android.gms.internal.ads.ia0");
    }

    public static ia0 d(String str, String[] strArr, mk1 mk1Var) {
        int i;
        Integer num = null;
        if (strArr.length < 4) {
            a.r(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f11868c.matcher(strArr[1]);
        if (!matcher.matches()) {
            a.r(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        boolean equals = "1".equals(group);
        ia0 ia0Var = ia0.f7068d;
        if (equals) {
            i = 1;
        } else if ("2".equals(group)) {
            if (mk1Var != null && mk1Var.f8365c == 6) {
                i = 4096;
            } else {
                i = 2;
            }
        } else {
            a.r(group, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
            return ia0Var;
        }
        String str2 = strArr[3];
        switch (str2.hashCode()) {
            case 70821:
                if (str2.equals("H30")) {
                    num = 2;
                    break;
                }
                break;
            case 70914:
                if (str2.equals("H60")) {
                    num = 8;
                    break;
                }
                break;
            case 70917:
                if (str2.equals("H63")) {
                    num = 32;
                    break;
                }
                break;
            case 71007:
                if (str2.equals("H90")) {
                    num = 128;
                    break;
                }
                break;
            case 71010:
                if (str2.equals("H93")) {
                    num = 512;
                    break;
                }
                break;
            case 74665:
                if (str2.equals("L30")) {
                    num = 1;
                    break;
                }
                break;
            case 74758:
                if (str2.equals("L60")) {
                    num = 4;
                    break;
                }
                break;
            case 74761:
                if (str2.equals("L63")) {
                    num = 16;
                    break;
                }
                break;
            case 74851:
                if (str2.equals("L90")) {
                    num = 64;
                    break;
                }
                break;
            case 74854:
                if (str2.equals("L93")) {
                    num = 256;
                    break;
                }
                break;
            case 2193639:
                if (str2.equals("H120")) {
                    num = 2048;
                    break;
                }
                break;
            case 2193642:
                if (str2.equals("H123")) {
                    num = 8192;
                    break;
                }
                break;
            case 2193732:
                if (str2.equals("H150")) {
                    num = Integer.valueOf(DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY);
                    break;
                }
                break;
            case 2193735:
                if (str2.equals("H153")) {
                    num = 131072;
                    break;
                }
                break;
            case 2193738:
                if (str2.equals("H156")) {
                    num = 524288;
                    break;
                }
                break;
            case 2193825:
                if (str2.equals("H180")) {
                    num = 2097152;
                    break;
                }
                break;
            case 2193828:
                if (str2.equals("H183")) {
                    num = 8388608;
                    break;
                }
                break;
            case 2193831:
                if (str2.equals("H186")) {
                    num = 33554432;
                    break;
                }
                break;
            case 2312803:
                if (str2.equals("L120")) {
                    num = 1024;
                    break;
                }
                break;
            case 2312806:
                if (str2.equals("L123")) {
                    num = 4096;
                    break;
                }
                break;
            case 2312896:
                if (str2.equals("L150")) {
                    num = 16384;
                    break;
                }
                break;
            case 2312899:
                if (str2.equals("L153")) {
                    num = 65536;
                    break;
                }
                break;
            case 2312902:
                if (str2.equals("L156")) {
                    num = 262144;
                    break;
                }
                break;
            case 2312989:
                if (str2.equals("L180")) {
                    num = 1048576;
                    break;
                }
                break;
            case 2312992:
                if (str2.equals("L183")) {
                    num = 4194304;
                    break;
                }
                break;
            case 2312995:
                if (str2.equals("L186")) {
                    num = 16777216;
                    break;
                }
                break;
        }
        if (num == null) {
            x21.F("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(str2));
            return ia0Var;
        }
        return new ia0(i, num.intValue(), true);
    }
}
