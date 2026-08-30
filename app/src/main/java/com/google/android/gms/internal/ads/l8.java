package com.google.android.gms.internal.ads;
import l4.a;
import l8.a;
import l8.b;

import android.text.Layout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class l8 implements p7 {

    /* renamed from: u, reason: collision with root package name */
    public final XmlPullParserFactory f7973u;

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f7968v = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f7969w = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f7970x = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f7971y = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f7972z = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern A = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern B = Pattern.compile("^(\\d+) (\\d+)$");
    public static final k8 C = new k8(1, 1, 30.0f);

    public l8() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f7973u = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            a.k("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x033f, code lost:
    
        if (r3.equals("text") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0353, code lost:
    
        r0 = c(r0);
        r0.f9010m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0348, code lost:
    
        if (r3.equals("base") != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0385, code lost:
    
        r0 = c(r0);
        r0.f9010m = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0351, code lost:
    
        if (r3.equals("textContainer") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0383, code lost:
    
        if (r3.equals("baseContainer") != false) goto L182;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:183:0x0334. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0212 A[Catch: n7 -> 0x027a, TryCatch #1 {n7 -> 0x027a, blocks: (B:97:0x01a1, B:100:0x01bc, B:101:0x01ce, B:103:0x01d4, B:105:0x01db, B:114:0x01f3, B:115:0x020c, B:117:0x0212, B:119:0x021a, B:122:0x021b, B:123:0x0238, B:127:0x01fe, B:132:0x020a, B:135:0x0239, B:137:0x023a, B:138:0x0257, B:140:0x01c3, B:142:0x0258, B:143:0x0279), top: B:96:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.o8 b(org.xmlpull.v1.XmlPullParser r16, com.google.android.gms.internal.ads.o8 r17) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.o8):com.google.android.gms.internal.ads.o8");
    }

    public static o8 c(o8 o8Var) {
        return o8Var == null ? new o8() : o8Var;
    }

    public static Layout.Alignment d(String str) {
        String h3 = ed1.h(str);
        switch (h3.hashCode()) {
            case -1364013995:
                if (h3.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!h3.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!h3.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!h3.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!h3.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static long e(String str, k8 k8Var) {
        double d2;
        double d10;
        double d11;
        double d12;
        Matcher matcher = f7968v.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d13 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double d14 = 0.0d;
            if (group4 != null) {
                d11 = Double.parseDouble(group4);
            } else {
                d11 = 0.0d;
            }
            double d15 = d13 + parseLong3;
            String group5 = matcher.group(5);
            if (group5 != null) {
                d12 = ((float) Long.parseLong(group5)) / k8Var.f7681a;
            } else {
                d12 = 0.0d;
            }
            double d16 = d15 + d11;
            if (matcher.group(6) != null) {
                d14 = (Long.parseLong(r12) / k8Var.f7682b) / k8Var.f7681a;
            }
            return (long) ((d16 + d12 + d14) * 1000000.0d);
        }
        Matcher matcher2 = f7969w.matcher(str);
        if (matcher2.matches()) {
            String group6 = matcher2.group(1);
            group6.getClass();
            double parseDouble = Double.parseDouble(group6);
            String group7 = matcher2.group(2);
            group7.getClass();
            int hashCode = group7.hashCode();
            if (hashCode != 102) {
                if (hashCode != 104) {
                    if (hashCode != 109) {
                        if (hashCode != 3494) {
                            if (hashCode != 115) {
                                if (hashCode == 116 && group7.equals("t")) {
                                    d2 = k8Var.f7683c;
                                    parseDouble /= d2;
                                }
                            } else {
                                group7.equals("s");
                            }
                        } else if (group7.equals("ms")) {
                            d2 = 1000.0d;
                            parseDouble /= d2;
                        }
                    } else if (group7.equals("m")) {
                        d10 = 60.0d;
                        parseDouble *= d10;
                    }
                } else if (group7.equals("h")) {
                    d10 = 3600.0d;
                    parseDouble *= d10;
                }
                return (long) (parseDouble * 1000000.0d);
            }
            if (group7.equals("f")) {
                d2 = k8Var.f7681a;
                parseDouble /= d2;
            }
            return (long) (parseDouble * 1000000.0d);
        }
        throw new Exception("Malformed time expression: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0528, code lost:
    
        if (r0.equals("tblr") != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0533, code lost:
    
        r44 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0531, code lost:
    
        if (r0.equals("tb") != false) goto L266;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:262:0x05ea. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0400 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:18:0x009f, B:20:0x00a7, B:23:0x00bd, B:24:0x00d8, B:26:0x00e2, B:27:0x00e6, B:29:0x00f2, B:30:0x00f6, B:34:0x018d, B:39:0x01e6, B:42:0x01fa, B:44:0x0200, B:46:0x0208, B:48:0x0210, B:50:0x0218, B:52:0x0220, B:54:0x0228, B:56:0x022e, B:58:0x0236, B:60:0x023e, B:62:0x0244, B:64:0x024a, B:66:0x0250, B:68:0x0258, B:71:0x0261, B:74:0x07cf, B:75:0x0294, B:78:0x029c, B:80:0x02a5, B:82:0x02b6, B:84:0x02c0, B:85:0x02d0, B:87:0x02d6, B:89:0x02ec, B:91:0x02f2, B:93:0x0595, B:101:0x02c7, B:103:0x0301, B:106:0x030f, B:110:0x0545, B:113:0x032c, B:115:0x0334, B:117:0x033c, B:119:0x0344, B:124:0x0358, B:128:0x036b, B:130:0x0371, B:132:0x037e, B:134:0x03e6, B:136:0x03ec, B:138:0x03f2, B:140:0x03fa, B:142:0x0400, B:146:0x040f, B:148:0x0415, B:150:0x0422, B:151:0x0499, B:153:0x04a1, B:155:0x04a7, B:157:0x04af, B:159:0x04b5, B:168:0x04f6, B:170:0x0500, B:180:0x0538, B:192:0x042d, B:195:0x042e, B:196:0x042f, B:198:0x043c, B:201:0x0444, B:204:0x0452, B:206:0x0458, B:208:0x0463, B:210:0x0477, B:212:0x0478, B:213:0x0479, B:214:0x0486, B:217:0x0387, B:219:0x0388, B:220:0x0389, B:221:0x0396, B:224:0x03a0, B:227:0x03a9, B:229:0x03af, B:231:0x03ba, B:233:0x03ca, B:235:0x03cb, B:236:0x03cc, B:237:0x03d4, B:241:0x0558, B:243:0x0565, B:245:0x0570, B:247:0x0576, B:248:0x0582, B:257:0x05bc, B:261:0x05de, B:266:0x05f6, B:269:0x05ff, B:275:0x074e, B:289:0x0625, B:300:0x0630, B:293:0x0649, B:283:0x06ca, B:292:0x063b, B:307:0x067b, B:310:0x0694, B:313:0x06ab, B:316:0x06c2, B:326:0x06e4, B:330:0x06f0, B:333:0x06f9, B:339:0x070c, B:342:0x0722, B:345:0x072e, B:347:0x0733, B:349:0x0737, B:350:0x073e, B:354:0x0715, B:364:0x019a, B:366:0x01a4, B:369:0x01ad, B:371:0x01b3, B:373:0x01be, B:375:0x01c8, B:377:0x01c9, B:378:0x01ca, B:379:0x0112, B:381:0x011e, B:384:0x012a, B:387:0x0130, B:389:0x013d, B:398:0x015e, B:402:0x0162, B:403:0x0175, B:406:0x0185, B:411:0x017f, B:414:0x0184, B:425:0x0772, B:427:0x077e, B:428:0x0785, B:431:0x078c, B:434:0x0790, B:436:0x079a, B:438:0x07a4, B:439:0x07ac, B:443:0x07a9, B:447:0x07c4, B:451:0x07cc, B:457:0x07ee), top: B:2:0x0008, inners: #4, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04b5 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:18:0x009f, B:20:0x00a7, B:23:0x00bd, B:24:0x00d8, B:26:0x00e2, B:27:0x00e6, B:29:0x00f2, B:30:0x00f6, B:34:0x018d, B:39:0x01e6, B:42:0x01fa, B:44:0x0200, B:46:0x0208, B:48:0x0210, B:50:0x0218, B:52:0x0220, B:54:0x0228, B:56:0x022e, B:58:0x0236, B:60:0x023e, B:62:0x0244, B:64:0x024a, B:66:0x0250, B:68:0x0258, B:71:0x0261, B:74:0x07cf, B:75:0x0294, B:78:0x029c, B:80:0x02a5, B:82:0x02b6, B:84:0x02c0, B:85:0x02d0, B:87:0x02d6, B:89:0x02ec, B:91:0x02f2, B:93:0x0595, B:101:0x02c7, B:103:0x0301, B:106:0x030f, B:110:0x0545, B:113:0x032c, B:115:0x0334, B:117:0x033c, B:119:0x0344, B:124:0x0358, B:128:0x036b, B:130:0x0371, B:132:0x037e, B:134:0x03e6, B:136:0x03ec, B:138:0x03f2, B:140:0x03fa, B:142:0x0400, B:146:0x040f, B:148:0x0415, B:150:0x0422, B:151:0x0499, B:153:0x04a1, B:155:0x04a7, B:157:0x04af, B:159:0x04b5, B:168:0x04f6, B:170:0x0500, B:180:0x0538, B:192:0x042d, B:195:0x042e, B:196:0x042f, B:198:0x043c, B:201:0x0444, B:204:0x0452, B:206:0x0458, B:208:0x0463, B:210:0x0477, B:212:0x0478, B:213:0x0479, B:214:0x0486, B:217:0x0387, B:219:0x0388, B:220:0x0389, B:221:0x0396, B:224:0x03a0, B:227:0x03a9, B:229:0x03af, B:231:0x03ba, B:233:0x03ca, B:235:0x03cb, B:236:0x03cc, B:237:0x03d4, B:241:0x0558, B:243:0x0565, B:245:0x0570, B:247:0x0576, B:248:0x0582, B:257:0x05bc, B:261:0x05de, B:266:0x05f6, B:269:0x05ff, B:275:0x074e, B:289:0x0625, B:300:0x0630, B:293:0x0649, B:283:0x06ca, B:292:0x063b, B:307:0x067b, B:310:0x0694, B:313:0x06ab, B:316:0x06c2, B:326:0x06e4, B:330:0x06f0, B:333:0x06f9, B:339:0x070c, B:342:0x0722, B:345:0x072e, B:347:0x0733, B:349:0x0737, B:350:0x073e, B:354:0x0715, B:364:0x019a, B:366:0x01a4, B:369:0x01ad, B:371:0x01b3, B:373:0x01be, B:375:0x01c8, B:377:0x01c9, B:378:0x01ca, B:379:0x0112, B:381:0x011e, B:384:0x012a, B:387:0x0130, B:389:0x013d, B:398:0x015e, B:402:0x0162, B:403:0x0175, B:406:0x0185, B:411:0x017f, B:414:0x0184, B:425:0x0772, B:427:0x077e, B:428:0x0785, B:431:0x078c, B:434:0x0790, B:436:0x079a, B:438:0x07a4, B:439:0x07ac, B:443:0x07a9, B:447:0x07c4, B:451:0x07cc, B:457:0x07ee), top: B:2:0x0008, inners: #4, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0500 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:18:0x009f, B:20:0x00a7, B:23:0x00bd, B:24:0x00d8, B:26:0x00e2, B:27:0x00e6, B:29:0x00f2, B:30:0x00f6, B:34:0x018d, B:39:0x01e6, B:42:0x01fa, B:44:0x0200, B:46:0x0208, B:48:0x0210, B:50:0x0218, B:52:0x0220, B:54:0x0228, B:56:0x022e, B:58:0x0236, B:60:0x023e, B:62:0x0244, B:64:0x024a, B:66:0x0250, B:68:0x0258, B:71:0x0261, B:74:0x07cf, B:75:0x0294, B:78:0x029c, B:80:0x02a5, B:82:0x02b6, B:84:0x02c0, B:85:0x02d0, B:87:0x02d6, B:89:0x02ec, B:91:0x02f2, B:93:0x0595, B:101:0x02c7, B:103:0x0301, B:106:0x030f, B:110:0x0545, B:113:0x032c, B:115:0x0334, B:117:0x033c, B:119:0x0344, B:124:0x0358, B:128:0x036b, B:130:0x0371, B:132:0x037e, B:134:0x03e6, B:136:0x03ec, B:138:0x03f2, B:140:0x03fa, B:142:0x0400, B:146:0x040f, B:148:0x0415, B:150:0x0422, B:151:0x0499, B:153:0x04a1, B:155:0x04a7, B:157:0x04af, B:159:0x04b5, B:168:0x04f6, B:170:0x0500, B:180:0x0538, B:192:0x042d, B:195:0x042e, B:196:0x042f, B:198:0x043c, B:201:0x0444, B:204:0x0452, B:206:0x0458, B:208:0x0463, B:210:0x0477, B:212:0x0478, B:213:0x0479, B:214:0x0486, B:217:0x0387, B:219:0x0388, B:220:0x0389, B:221:0x0396, B:224:0x03a0, B:227:0x03a9, B:229:0x03af, B:231:0x03ba, B:233:0x03ca, B:235:0x03cb, B:236:0x03cc, B:237:0x03d4, B:241:0x0558, B:243:0x0565, B:245:0x0570, B:247:0x0576, B:248:0x0582, B:257:0x05bc, B:261:0x05de, B:266:0x05f6, B:269:0x05ff, B:275:0x074e, B:289:0x0625, B:300:0x0630, B:293:0x0649, B:283:0x06ca, B:292:0x063b, B:307:0x067b, B:310:0x0694, B:313:0x06ab, B:316:0x06c2, B:326:0x06e4, B:330:0x06f0, B:333:0x06f9, B:339:0x070c, B:342:0x0722, B:345:0x072e, B:347:0x0733, B:349:0x0737, B:350:0x073e, B:354:0x0715, B:364:0x019a, B:366:0x01a4, B:369:0x01ad, B:371:0x01b3, B:373:0x01be, B:375:0x01c8, B:377:0x01c9, B:378:0x01ca, B:379:0x0112, B:381:0x011e, B:384:0x012a, B:387:0x0130, B:389:0x013d, B:398:0x015e, B:402:0x0162, B:403:0x0175, B:406:0x0185, B:411:0x017f, B:414:0x0184, B:425:0x0772, B:427:0x077e, B:428:0x0785, B:431:0x078c, B:434:0x0790, B:436:0x079a, B:438:0x07a4, B:439:0x07ac, B:443:0x07a9, B:447:0x07c4, B:451:0x07cc, B:457:0x07ee), top: B:2:0x0008, inners: #4, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x019a A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:18:0x009f, B:20:0x00a7, B:23:0x00bd, B:24:0x00d8, B:26:0x00e2, B:27:0x00e6, B:29:0x00f2, B:30:0x00f6, B:34:0x018d, B:39:0x01e6, B:42:0x01fa, B:44:0x0200, B:46:0x0208, B:48:0x0210, B:50:0x0218, B:52:0x0220, B:54:0x0228, B:56:0x022e, B:58:0x0236, B:60:0x023e, B:62:0x0244, B:64:0x024a, B:66:0x0250, B:68:0x0258, B:71:0x0261, B:74:0x07cf, B:75:0x0294, B:78:0x029c, B:80:0x02a5, B:82:0x02b6, B:84:0x02c0, B:85:0x02d0, B:87:0x02d6, B:89:0x02ec, B:91:0x02f2, B:93:0x0595, B:101:0x02c7, B:103:0x0301, B:106:0x030f, B:110:0x0545, B:113:0x032c, B:115:0x0334, B:117:0x033c, B:119:0x0344, B:124:0x0358, B:128:0x036b, B:130:0x0371, B:132:0x037e, B:134:0x03e6, B:136:0x03ec, B:138:0x03f2, B:140:0x03fa, B:142:0x0400, B:146:0x040f, B:148:0x0415, B:150:0x0422, B:151:0x0499, B:153:0x04a1, B:155:0x04a7, B:157:0x04af, B:159:0x04b5, B:168:0x04f6, B:170:0x0500, B:180:0x0538, B:192:0x042d, B:195:0x042e, B:196:0x042f, B:198:0x043c, B:201:0x0444, B:204:0x0452, B:206:0x0458, B:208:0x0463, B:210:0x0477, B:212:0x0478, B:213:0x0479, B:214:0x0486, B:217:0x0387, B:219:0x0388, B:220:0x0389, B:221:0x0396, B:224:0x03a0, B:227:0x03a9, B:229:0x03af, B:231:0x03ba, B:233:0x03ca, B:235:0x03cb, B:236:0x03cc, B:237:0x03d4, B:241:0x0558, B:243:0x0565, B:245:0x0570, B:247:0x0576, B:248:0x0582, B:257:0x05bc, B:261:0x05de, B:266:0x05f6, B:269:0x05ff, B:275:0x074e, B:289:0x0625, B:300:0x0630, B:293:0x0649, B:283:0x06ca, B:292:0x063b, B:307:0x067b, B:310:0x0694, B:313:0x06ab, B:316:0x06c2, B:326:0x06e4, B:330:0x06f0, B:333:0x06f9, B:339:0x070c, B:342:0x0722, B:345:0x072e, B:347:0x0733, B:349:0x0737, B:350:0x073e, B:354:0x0715, B:364:0x019a, B:366:0x01a4, B:369:0x01ad, B:371:0x01b3, B:373:0x01be, B:375:0x01c8, B:377:0x01c9, B:378:0x01ca, B:379:0x0112, B:381:0x011e, B:384:0x012a, B:387:0x0130, B:389:0x013d, B:398:0x015e, B:402:0x0162, B:403:0x0175, B:406:0x0185, B:411:0x017f, B:414:0x0184, B:425:0x0772, B:427:0x077e, B:428:0x0785, B:431:0x078c, B:434:0x0790, B:436:0x079a, B:438:0x07a4, B:439:0x07ac, B:443:0x07a9, B:447:0x07c4, B:451:0x07cc, B:457:0x07ee), top: B:2:0x0008, inners: #4, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01fa A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_ENTER, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:18:0x009f, B:20:0x00a7, B:23:0x00bd, B:24:0x00d8, B:26:0x00e2, B:27:0x00e6, B:29:0x00f2, B:30:0x00f6, B:34:0x018d, B:39:0x01e6, B:42:0x01fa, B:44:0x0200, B:46:0x0208, B:48:0x0210, B:50:0x0218, B:52:0x0220, B:54:0x0228, B:56:0x022e, B:58:0x0236, B:60:0x023e, B:62:0x0244, B:64:0x024a, B:66:0x0250, B:68:0x0258, B:71:0x0261, B:74:0x07cf, B:75:0x0294, B:78:0x029c, B:80:0x02a5, B:82:0x02b6, B:84:0x02c0, B:85:0x02d0, B:87:0x02d6, B:89:0x02ec, B:91:0x02f2, B:93:0x0595, B:101:0x02c7, B:103:0x0301, B:106:0x030f, B:110:0x0545, B:113:0x032c, B:115:0x0334, B:117:0x033c, B:119:0x0344, B:124:0x0358, B:128:0x036b, B:130:0x0371, B:132:0x037e, B:134:0x03e6, B:136:0x03ec, B:138:0x03f2, B:140:0x03fa, B:142:0x0400, B:146:0x040f, B:148:0x0415, B:150:0x0422, B:151:0x0499, B:153:0x04a1, B:155:0x04a7, B:157:0x04af, B:159:0x04b5, B:168:0x04f6, B:170:0x0500, B:180:0x0538, B:192:0x042d, B:195:0x042e, B:196:0x042f, B:198:0x043c, B:201:0x0444, B:204:0x0452, B:206:0x0458, B:208:0x0463, B:210:0x0477, B:212:0x0478, B:213:0x0479, B:214:0x0486, B:217:0x0387, B:219:0x0388, B:220:0x0389, B:221:0x0396, B:224:0x03a0, B:227:0x03a9, B:229:0x03af, B:231:0x03ba, B:233:0x03ca, B:235:0x03cb, B:236:0x03cc, B:237:0x03d4, B:241:0x0558, B:243:0x0565, B:245:0x0570, B:247:0x0576, B:248:0x0582, B:257:0x05bc, B:261:0x05de, B:266:0x05f6, B:269:0x05ff, B:275:0x074e, B:289:0x0625, B:300:0x0630, B:293:0x0649, B:283:0x06ca, B:292:0x063b, B:307:0x067b, B:310:0x0694, B:313:0x06ab, B:316:0x06c2, B:326:0x06e4, B:330:0x06f0, B:333:0x06f9, B:339:0x070c, B:342:0x0722, B:345:0x072e, B:347:0x0733, B:349:0x0737, B:350:0x073e, B:354:0x0715, B:364:0x019a, B:366:0x01a4, B:369:0x01ad, B:371:0x01b3, B:373:0x01be, B:375:0x01c8, B:377:0x01c9, B:378:0x01ca, B:379:0x0112, B:381:0x011e, B:384:0x012a, B:387:0x0130, B:389:0x013d, B:398:0x015e, B:402:0x0162, B:403:0x0175, B:406:0x0185, B:411:0x017f, B:414:0x0184, B:425:0x0772, B:427:0x077e, B:428:0x0785, B:431:0x078c, B:434:0x0790, B:436:0x079a, B:438:0x07a4, B:439:0x07ac, B:443:0x07a9, B:447:0x07c4, B:451:0x07cc, B:457:0x07ee), top: B:2:0x0008, inners: #4, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029c A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, LOOP:1: B:78:0x029c->B:95:0x05a2, LOOP_START, PHI: r1 r2 r3 r7 r9 r10 r12 r15 r30 r51
      0x029c: PHI (r1v12 java.lang.String) = (r1v9 java.lang.String), (r1v53 java.lang.String) binds: [B:77:0x029a, B:95:0x05a2] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r2v24 java.lang.String) = (r2v14 java.lang.String), (r2v52 java.lang.String) binds: [B:77:0x029a, B:95:0x05a2] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r3v9 java.lang.String) = (r3v1 java.lang.String), (r3v21 java.lang.String) binds: [B:77:0x029a, B:95:0x05a2] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r7v18 java.util.HashMap) = (r7v1 java.util.HashMap), (r7v41 java.util.HashMap) binds: [B:77:0x029a, B:95:0x05a2] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r9v26 int) = (r9v7 int), (r9v43 int) binds: [B:77:0x029a, B:95:0x05a2] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r10v16 java.lang.String) = (r10v5 java.lang.String), (r10v19 java.lang.String) binds: [B:77:0x029a, B:95:0x05a2] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r12v10 java.lang.String) = (r12v7 java.lang.String), (r12v19 java.lang.String) binds: [B:77:0x029a, B:95:0x05a2] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r15v18 java.lang.String) = (r15v6 java.lang.String), (r15v24 java.lang.String) binds: [B:77:0x029a, B:95:0x05a2] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r30v1 java.util.HashMap) = (r30v0 java.util.HashMap), (r30v4 java.util.HashMap) binds: [B:77:0x029a, B:95:0x05a2] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r51v2 int) = (r51v1 int), (r51v3 int) binds: [B:77:0x029a, B:95:0x05a2] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:18:0x009f, B:20:0x00a7, B:23:0x00bd, B:24:0x00d8, B:26:0x00e2, B:27:0x00e6, B:29:0x00f2, B:30:0x00f6, B:34:0x018d, B:39:0x01e6, B:42:0x01fa, B:44:0x0200, B:46:0x0208, B:48:0x0210, B:50:0x0218, B:52:0x0220, B:54:0x0228, B:56:0x022e, B:58:0x0236, B:60:0x023e, B:62:0x0244, B:64:0x024a, B:66:0x0250, B:68:0x0258, B:71:0x0261, B:74:0x07cf, B:75:0x0294, B:78:0x029c, B:80:0x02a5, B:82:0x02b6, B:84:0x02c0, B:85:0x02d0, B:87:0x02d6, B:89:0x02ec, B:91:0x02f2, B:93:0x0595, B:101:0x02c7, B:103:0x0301, B:106:0x030f, B:110:0x0545, B:113:0x032c, B:115:0x0334, B:117:0x033c, B:119:0x0344, B:124:0x0358, B:128:0x036b, B:130:0x0371, B:132:0x037e, B:134:0x03e6, B:136:0x03ec, B:138:0x03f2, B:140:0x03fa, B:142:0x0400, B:146:0x040f, B:148:0x0415, B:150:0x0422, B:151:0x0499, B:153:0x04a1, B:155:0x04a7, B:157:0x04af, B:159:0x04b5, B:168:0x04f6, B:170:0x0500, B:180:0x0538, B:192:0x042d, B:195:0x042e, B:196:0x042f, B:198:0x043c, B:201:0x0444, B:204:0x0452, B:206:0x0458, B:208:0x0463, B:210:0x0477, B:212:0x0478, B:213:0x0479, B:214:0x0486, B:217:0x0387, B:219:0x0388, B:220:0x0389, B:221:0x0396, B:224:0x03a0, B:227:0x03a9, B:229:0x03af, B:231:0x03ba, B:233:0x03ca, B:235:0x03cb, B:236:0x03cc, B:237:0x03d4, B:241:0x0558, B:243:0x0565, B:245:0x0570, B:247:0x0576, B:248:0x0582, B:257:0x05bc, B:261:0x05de, B:266:0x05f6, B:269:0x05ff, B:275:0x074e, B:289:0x0625, B:300:0x0630, B:293:0x0649, B:283:0x06ca, B:292:0x063b, B:307:0x067b, B:310:0x0694, B:313:0x06ab, B:316:0x06c2, B:326:0x06e4, B:330:0x06f0, B:333:0x06f9, B:339:0x070c, B:342:0x0722, B:345:0x072e, B:347:0x0733, B:349:0x0737, B:350:0x073e, B:354:0x0715, B:364:0x019a, B:366:0x01a4, B:369:0x01ad, B:371:0x01b3, B:373:0x01be, B:375:0x01c8, B:377:0x01c9, B:378:0x01ca, B:379:0x0112, B:381:0x011e, B:384:0x012a, B:387:0x0130, B:389:0x013d, B:398:0x015e, B:402:0x0162, B:403:0x0175, B:406:0x0185, B:411:0x017f, B:414:0x0184, B:425:0x0772, B:427:0x077e, B:428:0x0785, B:431:0x078c, B:434:0x0790, B:436:0x079a, B:438:0x07a4, B:439:0x07ac, B:443:0x07a9, B:447:0x07c4, B:451:0x07cc, B:457:0x07ee), top: B:2:0x0008, inners: #4, #13, #14, #15, #16 }] */
    /* JADX WARN: Type inference failed for: r50v1, types: [java.lang.Throwable, com.google.android.gms.internal.ads.o8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.p8 a(byte[] r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 2074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a(byte[], int, int):com.google.android.gms.internal.ads.p8");
    }

    @Override // com.google.android.gms.internal.ads.p7
    public final void w(int i, int i10, r7 r7Var, byte[] bArr) {
        b80.i(a(bArr, i, i10), r7Var);
    }
}
