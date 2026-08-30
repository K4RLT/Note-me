package com.google.android.gms.internal.ads;
import g3.a;
import q.x;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class bq0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4860a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4861b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4862c;

    /* renamed from: d, reason: collision with root package name */
    public static HashMap f4863d;
    public static final String[] e;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f4864f;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f4865g;

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f4866h;
    public static final int[] i;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i10 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i10).length());
        g3.a.t(sb2, str, ", ", str2, ", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(i10);
        f4860a = sb2.toString();
        f4861b = new byte[0];
        f4862c = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        e = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", FacebookMediationAdapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f4864f = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f4865g = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f4866h = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        i = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, FacebookMediationAdapter.ERROR_NULL_CONTEXT, 98, FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION, 97, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 96, ModuleDescriptor.MODULE_VERSION, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String a(int i10) {
        return new String(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10}, StandardCharsets.US_ASCII);
    }

    public static int b(int i10, ByteOrder byteOrder) {
        if (i10 != 8) {
            if (i10 != 16) {
                if (i10 != 24) {
                    if (i10 != 32) {
                        return 0;
                    }
                    if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                        return 22;
                    }
                    return 1610612736;
                }
                if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                    return 21;
                }
                return 1342177280;
            }
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 2;
            }
            return 268435456;
        }
        return 3;
    }

    public static int c(int i10, ByteOrder byteOrder) {
        if (i10 != 32) {
            if (i10 != 64) {
                return 0;
            }
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 1879048192;
            }
            return 1912602624;
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return 4;
        }
        return 1895825408;
    }

    public static boolean d(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4 || i10 == 1895825408 || i10 == 1879048192 || i10 == 1912602624;
    }

    public static int e(int i10) {
        int i11;
        int i12 = 6396;
        if (i10 != 10) {
            if (i10 == 16) {
                i11 = 205215996;
            } else if (i10 != 24) {
                switch (i10) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i10) {
                            case 12:
                                return 743676;
                            case 13:
                                i11 = 30136348;
                                break;
                            case 14:
                                i11 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                }
            } else {
                i11 = 67108860;
            }
            i12 = 0;
        } else {
            i11 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i11 : i12;
    }

    public static int f(int i10) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 21) {
                        if (i10 != 22) {
                            if (i10 != 268435456) {
                                if (i10 != 1342177280) {
                                    if (i10 != 1610612736) {
                                        if (i10 != 1879048192) {
                                            if (i10 != 1895825408) {
                                                if (i10 != 1912602624) {
                                                    q.x.m();
                                                    return 0;
                                                }
                                                return 8;
                                            }
                                        } else {
                                            return 8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return 3;
                }
                return 4;
            }
            return 1;
        }
        return 2;
    }

    public static int g(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case gl.zzm /* 21 */:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static int h(int i10, int i11, int i12, byte[] bArr) {
        while (i10 < i11) {
            i12 = f4865g[(i12 >>> 24) ^ (bArr[i10] & 255)] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004b, code lost:
    
        r5.C(r4);
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(com.google.android.gms.internal.ads.xk0 r4, com.google.android.gms.internal.ads.xk0 r5, java.util.zip.Inflater r6) {
        /*
            int r0 = r4.B()
            r1 = 0
            if (r0 <= 0) goto L75
            int r0 = r4.I()
            r2 = 120(0x78, float:1.68E-43)
            if (r0 != r2) goto L75
            int r0 = r4.B()
            r2 = 1
            if (r0 != 0) goto L18
            r4 = r1
            goto L72
        L18:
            byte[] r0 = r5.f12580a
            int r0 = r0.length
            int r3 = r4.B()
            if (r0 >= r3) goto L29
            int r0 = r4.B()
            int r0 = r0 + r0
            r5.A(r0)
        L29:
            if (r6 != 0) goto L30
            java.util.zip.Inflater r6 = new java.util.zip.Inflater
            r6.<init>()
        L30:
            byte[] r0 = r4.f12580a
            int r3 = r4.f12581b
            int r4 = r4.B()
            r6.setInput(r0, r3, r4)
            r4 = r1
        L3c:
            byte[] r0 = r5.f12580a     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            int r3 = r0.length     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            int r3 = r3 - r4
            int r0 = r6.inflate(r0, r4, r3)     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            int r4 = r4 + r0
            boolean r0 = r6.finished()     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            if (r0 == 0) goto L52
            r5.C(r4)     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            r4 = r2
            goto L6f
        L50:
            r4 = move-exception
            goto L6b
        L52:
            boolean r0 = r6.needsDictionary()     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            if (r0 != 0) goto L5e
            boolean r0 = r6.needsInput()     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            if (r0 == 0) goto L60
        L5e:
            r4 = r1
            goto L6f
        L60:
            byte[] r0 = r5.f12580a     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            int r3 = r0.length     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            if (r4 != r3) goto L3c
            int r0 = r0.length     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            int r0 = r0 + r0
            r5.A(r0)     // Catch: java.lang.Throwable -> L50 java.util.zip.DataFormatException -> L5e
            goto L3c
        L6b:
            r6.reset()
            throw r4
        L6f:
            r6.reset()
        L72:
            if (r4 == 0) goto L75
            return r2
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bq0.i(com.google.android.gms.internal.ads.xk0, com.google.android.gms.internal.ads.xk0, java.util.zip.Inflater):boolean");
    }

    public static boolean j(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static int k(String str) {
        String[] split;
        int length;
        boolean z3;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z3 = true;
        } else {
            z3 = false;
        }
        try {
            if (str2 != null) {
                int parseInt = Integer.parseInt(str2);
                if (z3) {
                    return -parseInt;
                }
                return parseInt;
            }
            throw null;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean l(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i10 == 30) {
                String str = Build.MODEL;
                if (ed1.L("moto g(20)", str) || ed1.L("rmx3231", str)) {
                    return true;
                }
            }
            if (i10 != 34 || !ed1.L("sm-x200", Build.MODEL)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (java.lang.Math.abs(r11 - r2) == 0.5d) goto L57;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x007d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bq0.m(long, long, long, java.math.RoundingMode):long");
    }

    public static String n(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e8) {
            x21.P("Util", "Failed to read system property ".concat(str), e8);
            return null;
        }
    }

    public static Object[] o(Object[] objArr, int i10) {
        boolean z3;
        if (i10 <= objArr.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        return Arrays.copyOf(objArr, i10);
    }

    public static Handler p() {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, null);
    }

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String h3 = ed1.h(str);
        int i10 = 0;
        String str2 = h3.split("-", 2)[0];
        if (f4863d == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = e;
            int length2 = strArr.length;
            HashMap hashMap = new HashMap(length + 88);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < 88; i11 += 2) {
                hashMap.put(strArr[i11], strArr[i11 + 1]);
            }
            f4863d = hashMap;
        }
        String str4 = (String) f4863d.get(str2);
        if (str4 != null) {
            h3 = str4.concat(h3.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return h3;
        }
        while (true) {
            String[] strArr2 = f4864f;
            int length3 = strArr2.length;
            if (i10 < 18) {
                if (h3.startsWith(strArr2[i10])) {
                    return String.valueOf(strArr2[i10 + 1]).concat(h3.substring(strArr2[i10].length()));
                }
                i10 += 2;
            } else {
                return h3;
            }
        }
    }

    public static int r(int[] iArr, int i10, boolean z3, boolean z9) {
        int i11;
        int i12;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i12 = -(binarySearch + 2);
        } else {
            while (true) {
                i11 = binarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                binarySearch = i11;
            }
            if (z3) {
                i12 = binarySearch;
            } else {
                i12 = i11;
            }
        }
        if (z9) {
            return Math.max(0, i12);
        }
        return i12;
    }

    public static int s(long[] jArr, long j10, boolean z3) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                int i11 = binarySearch - 1;
                if (i11 < 0 || jArr[i11] != j10) {
                    break;
                }
                binarySearch = i11;
            }
            i10 = binarySearch;
        }
        if (z3) {
            return Math.max(0, i10);
        }
        return i10;
    }

    public static long t(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static long u(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long v(int i10, long j10) {
        return w(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static long w(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        if (j12 >= j11 && j12 % j11 == 0) {
            return ed1.c(j10, ed1.c(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return ed1.z(j10, ed1.c(j11, j12, RoundingMode.UNNECESSARY));
        }
        if (j12 >= j10 && j12 % j10 == 0) {
            return ed1.c(j11, ed1.c(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j10 && j10 % j12 == 0) {
            return ed1.z(j11, ed1.c(j10, j12, RoundingMode.UNNECESSARY));
        }
        return m(j10, j11, j12, roundingMode);
    }

    public static void x(long j10, long[] jArr) {
        long j11;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long c10 = ed1.c(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = ed1.c(jArr[i10], c10, roundingMode);
                i10++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long c11 = ed1.c(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = ed1.z(jArr[i10], c11);
                i10++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < jArr.length) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j10 >= j12 && j10 % j12 == 0) {
                    jArr[i11] = ed1.c(1000000L, ed1.c(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 < j12 && j12 % j10 == 0) {
                    jArr[i11] = ed1.z(1000000L, ed1.c(j12, j10, RoundingMode.UNNECESSARY));
                } else {
                    j11 = j10;
                    jArr[i11] = m(j12, 1000000L, j11, roundingMode);
                    i11++;
                    j10 = j11;
                }
            }
            j11 = j10;
            i11++;
            j10 = j11;
        }
    }

    public static long y(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(j10 * f10);
    }
}
