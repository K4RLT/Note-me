package com.google.android.gms.internal.ads;
import b8.u4;
import g5.q;
import q.b;
import r3.g;

import android.text.TextUtils;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class ha {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f6640a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f6641b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str) {
        return "audio".equals(j(str));
    }

    public static boolean b(String str) {
        return "video".equals(j(str));
    }

    public static boolean c(String str) {
        if (!"image".equals(j(str)) && !"application/x-image-uri".equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00eb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(java.lang.String r3, java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ha.d(java.lang.String, java.lang.String):boolean");
    }

    public static String e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case AdSizeApi.INTERSTITIAL /* 100 */:
            case FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS /* 101 */:
                return "video/mpeg2";
            case FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH /* 102 */:
            case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
            case FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION /* 104 */:
                return "audio/mp4a-latm";
            case FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS /* 105 */:
            case FacebookMediationAdapter.ERROR_NULL_CONTEXT /* 107 */:
                return "audio/mpeg";
            case FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE /* 106 */:
                return "video/mpeg";
            case FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS /* 108 */:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int f(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (a(str)) {
                return 1;
            }
            if (!b(str)) {
                if (!"text".equals(j(str)) && !"application/x-media3-cues".equals(str) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
                    if (c(str)) {
                        return 4;
                    }
                    if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str) && !"application/meta".equals(str) && !"application/x-itut-t35".equals(str)) {
                        if (!"application/x-camera-motion".equals(str)) {
                            ArrayList arrayList = f6640a;
                            if (arrayList.size() <= 0) {
                                return -1;
                            }
                            arrayList.get(0).getClass();
                            g5.q.b();
                            return 0;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = r3.hashCode()
            r1 = 8
            r2 = 0
            switch(r0) {
                case -2123537834: goto L95;
                case -1365340241: goto L8c;
                case -1095064472: goto L82;
                case -53558318: goto L6b;
                case 187078296: goto L61;
                case 187078297: goto L56;
                case 187081724: goto L4b;
                case 550520934: goto L40;
                case 1504578661: goto L36;
                case 1504831518: goto L2b;
                case 1504891608: goto L20;
                case 1505942594: goto L17;
                case 1556697186: goto Lc;
                default: goto La;
            }
        La:
            goto La0
        Lc:
            java.lang.String r4 = "audio/true-hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 14
            return r3
        L17:
            java.lang.String r4 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            return r1
        L20:
            java.lang.String r4 = "audio/opus"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 20
            return r3
        L2b:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 9
            return r3
        L36:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 6
            return r3
        L40:
            java.lang.String r4 = "audio/vnd.dts.uhd;profile=p2"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 30
            return r3
        L4b:
            java.lang.String r4 = "audio/dsd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 31
            return r3
        L56:
            java.lang.String r4 = "audio/ac4"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 17
            return r3
        L61:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 5
            return r3
        L6b:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto La0
            if (r4 != 0) goto L76
            return r2
        L76:
            b8.u4 r3 = i(r4)
            if (r3 != 0) goto L7d
            return r2
        L7d:
            int r3 = r3.g()
            return r3
        L82:
            java.lang.String r4 = "audio/vnd.dts"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 7
            return r3
        L8c:
            java.lang.String r4 = "audio/vnd.dts.hd;profile=lbr"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            return r1
        L95:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 18
            return r3
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ha.g(java.lang.String, java.lang.String):int");
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        String h3 = ed1.h(str);
        switch (h3.hashCode()) {
            case -1833600100:
                if (h3.equals("video/x-mvhevc")) {
                    return "video/mv-hevc";
                }
                return h3;
            case -1007807498:
                if (h3.equals("audio/x-flac")) {
                    return "audio/flac";
                }
                return h3;
            case -979095690:
                if (h3.equals("application/x-mpegurl")) {
                    return "application/x-mpegURL";
                }
                return h3;
            case -586683234:
                if (h3.equals("audio/x-wav")) {
                    return "audio/wav";
                }
                return h3;
            case -432836268:
                if (h3.equals("audio/mpeg-l1")) {
                    return "audio/mpeg-L1";
                }
                return h3;
            case -432836267:
                if (h3.equals("audio/mpeg-l2")) {
                    return "audio/mpeg-L2";
                }
                return h3;
            case 187090231:
                if (h3.equals("audio/mp3")) {
                    return "audio/mpeg";
                }
                return h3;
            default:
                return h3;
        }
    }

    public static b8.u4 i(String str) {
        int i;
        Matcher matcher = f6641b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            try {
                Integer.parseInt(group, 16);
                if (group2 != null) {
                    i = Integer.parseInt(group2);
                } else {
                    i = 0;
                }
                return new b8.u4(i, 1);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String j(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf(47)) != -1) {
            return str.substring(0, indexOf);
        }
        return null;
    }
}
