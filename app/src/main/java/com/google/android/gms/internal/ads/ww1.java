package com.google.android.gms.internal.ads;
import g3.a;
import ha.b;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ww1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12353b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12354c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f12355d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12356f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12357g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12358h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f12359j;

    /* renamed from: k, reason: collision with root package name */
    public int f12360k;

    /* renamed from: l, reason: collision with root package name */
    public float f12361l;

    public ww1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z9, boolean z10, boolean z11) {
        str.getClass();
        this.f12352a = str;
        this.f12353b = str2;
        this.f12354c = str3;
        this.f12355d = codecCapabilities;
        this.f12357g = z3;
        this.e = z9;
        this.f12356f = z10;
        this.f12358h = z11;
        this.i = ha.b(str2);
        this.f12361l = -3.4028235E38f;
        this.f12359j = -1;
        this.f12360k = -1;
    }

    public static ww1 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3) {
        boolean z9;
        boolean z10;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z11;
        boolean z12;
        String str6;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO") && !str7.equals("Fairphone")) {
                str6 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z11 = z3;
                z12 = true;
                str4 = str;
                return new ww1(str4, str6, str5, codecCapabilities2, z11, z9, z10, z12);
            }
        }
        str4 = str;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z11 = z3;
        z12 = false;
        str6 = str2;
        return new ww1(str4, str6, str5, codecCapabilities2, z11, z9, z10, z12);
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10, double d2) {
        Point j10 = j(videoCapabilities, i, i10);
        int i11 = j10.x;
        int i12 = j10.y;
        if (d2 != -1.0d && d2 >= 1.0d) {
            double floor = Math.floor(d2);
            if (videoCapabilities.areSizeAndRateSupported(i11, i12, floor)) {
                Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i11, i12);
                if (achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return videoCapabilities.isSizeSupported(i11, i12);
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = bq0.f4860a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(Context context, mw1 mw1Var) {
        int i;
        int i10;
        String str = mw1Var.f8459o;
        String str2 = this.f12353b;
        if ((!str2.equals(str) && !str2.equals(gx1.d(mw1Var))) || !f(context, mw1Var, true) || !g(mw1Var)) {
            return false;
        }
        if (this.i) {
            int i11 = mw1Var.f8466v;
            if (i11 > 0 && (i10 = mw1Var.f8467w) > 0) {
                return e(i11, i10, mw1Var.f8470z);
            }
        } else {
            int i12 = mw1Var.J;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12355d;
            if (i12 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i12)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 20);
                    sb2.append("sampleRate.support, ");
                    sb2.append(i12);
                    h(sb2.toString());
                    return false;
                }
            }
            int i13 = mw1Var.H;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i = 16;
                    } else {
                        i = 30;
                    }
                    String str3 = this.f12352a;
                    StringBuilder sb3 = new StringBuilder(g3.a.v(String.valueOf(i), String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1));
                    sb3.append("AssumedMaxChannelAdjustment: ");
                    sb3.append(str3);
                    sb3.append(", [");
                    sb3.append(maxInputChannelCount);
                    sb3.append(" to ");
                    sb3.append(i);
                    sb3.append("]");
                    x21.F("MediaCodecInfo", sb3.toString());
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i13) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i13).length() + 22);
                    sb4.append("channelCount.support, ");
                    sb4.append(i13);
                    h(sb4.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(mw1 mw1Var) {
        boolean z3;
        if (this.i) {
            return this.e;
        }
        ia0 c10 = va0.c(mw1Var);
        if (c10 != null && (z3 = c10.f7070b)) {
            b80.K(z3);
            if (c10.f7069a == 42) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final is1 d(mw1 mw1Var, mw1 mw1Var2) {
        int i;
        mw1 mw1Var3;
        mw1 mw1Var4;
        int i10;
        String str = mw1Var.f8459o;
        String str2 = mw1Var2.f8459o;
        mk1 mk1Var = mw1Var2.F;
        boolean z3 = false;
        if (true != Objects.equals(str, str2)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.i) {
            if (mw1Var.A != mw1Var2.A) {
                i |= 1024;
            }
            if (mw1Var.f8466v != mw1Var2.f8466v || mw1Var.f8467w != mw1Var2.f8467w) {
                z3 = true;
            }
            if (!this.e && z3) {
                i |= 512;
            }
            mk1 mk1Var2 = mw1Var.F;
            if ((!mk1.a(mk1Var2) || !mk1.a(mk1Var)) && !Objects.equals(mk1Var2, mk1Var)) {
                i |= 2048;
            }
            boolean startsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.f12352a;
            if (startsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !mw1Var.b(mw1Var2)) {
                i |= 2;
            }
            int i11 = mw1Var.f8468x;
            if (i11 != -1 && (i10 = mw1Var.f8469y) != -1 && i11 == mw1Var2.f8468x && i10 == mw1Var2.f8469y && z3) {
                i |= 2;
            }
            int i12 = 2;
            if (i == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair b10 = va0.b(mw1Var);
                Pair b11 = va0.b(mw1Var2);
                if (b10 == null || b11 == null || !((Integer) b10.first).equals(b11.first)) {
                    i = 2;
                }
            }
            if (i == 0) {
                if (true == mw1Var.b(mw1Var2)) {
                    i12 = 3;
                }
                return new is1(str3, mw1Var, mw1Var2, i12, 0);
            }
            mw1Var3 = mw1Var;
            mw1Var4 = mw1Var2;
        } else {
            mw1Var3 = mw1Var;
            mw1Var4 = mw1Var2;
            if (mw1Var3.H != mw1Var4.H) {
                i |= 4096;
            }
            if (mw1Var3.J != mw1Var4.J) {
                i |= 8192;
            }
            if (mw1Var3.K != mw1Var4.K) {
                i |= 16384;
            }
            String str4 = this.f12353b;
            if (i == 0 && (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4"))) {
                Pair b12 = va0.b(mw1Var3);
                Pair b13 = va0.b(mw1Var4);
                if (b12 != null && b13 != null) {
                    int intValue = ((Integer) b12.first).intValue();
                    int intValue2 = ((Integer) b13.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new is1(this.f12352a, mw1Var3, mw1Var4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && b12.equals(b13)) {
                        return new is1(this.f12352a, mw1Var3, mw1Var4, 3, 0);
                    }
                }
            }
            if (i == 0 && (str4.equals("audio/eac3-joc") || str4.equals("audio/eac3"))) {
                return new is1(this.f12352a, mw1Var3, mw1Var4, 3, 0);
            }
            if (!mw1Var3.b(mw1Var4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str4)) {
                i |= 2;
            }
            if (i == 0) {
                return new is1(this.f12352a, mw1Var3, mw1Var4, 1, 0);
            }
        }
        return new is1(this.f12352a, mw1Var3, mw1Var4, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r12, int r13, double r14) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ww1.e(int, int, double):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r5.equals("video/hevc") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r0 = 0;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r5.equals("video/av01") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.content.Context r13, com.google.android.gms.internal.ads.mw1 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ww1.f(android.content.Context, com.google.android.gms.internal.ads.mw1, boolean):boolean");
    }

    public final boolean g(mw1 mw1Var) {
        if (Objects.equals(mw1Var.f8459o, "audio/flac") && mw1Var.K == 22 && Build.VERSION.SDK_INT < 34 && this.f12352a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final void h(String str) {
        String str2 = bq0.f4860a;
        String str3 = this.f12353b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.f12352a;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        g3.a.t(sb2, "NoSupport [", str, "] [", str4);
        g3.a.t(sb2, ", ", str3, "] [", str2);
        sb2.append("]");
        x21.l("MediaCodecInfo", sb2.toString());
    }

    public final String toString() {
        return this.f12352a;
    }
}
