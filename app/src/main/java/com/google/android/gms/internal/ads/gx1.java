package com.google.android.gms.internal.ads;
import c7.x;
import ha.a;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class gx1 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f6499a = new HashMap();

    public static synchronized List a(String str, boolean z3, boolean z9) {
        synchronized (gx1.class) {
            try {
                cx1 cx1Var = new cx1(str, z3, z9);
                HashMap hashMap = f6499a;
                List list = (List) hashMap.get(cx1Var);
                if (list != null) {
                    return list;
                }
                ArrayList e = e(cx1Var, new x(z3, z9, str.equals("video/mv-hevc")));
                if (z3) {
                    e.isEmpty();
                }
                if ("audio/raw".equals(str)) {
                    if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && e.size() == 1 && ((ww1) e.get(0)).f12352a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        e.add(ww1.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false));
                    }
                    Collections.sort(e, new ex1(bx1.f4904v));
                }
                if (Build.VERSION.SDK_INT < 32 && e.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((ww1) e.get(0)).f12352a)) {
                    e.add((ww1) e.remove(0));
                }
                d51 u9 = d51.u(e);
                hashMap.put(cx1Var, u9);
                return u9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.y41, com.google.android.gms.internal.ads.a51] */
    public static y51 b(bx1 bx1Var, mw1 mw1Var, boolean z3, boolean z9) {
        Iterable a10;
        String str = mw1Var.f8459o;
        bx1Var.getClass();
        List a11 = a(str, z3, z9);
        String d2 = d(mw1Var);
        if (d2 == null) {
            a10 = y51.f12781y;
        } else {
            bx1Var.getClass();
            a10 = a(d2, z3, z9);
        }
        b51 b51Var = d51.f5314v;
        y41 y41Var = new y41(4);
        y41Var.b(a11);
        y41Var.b(a10);
        return y41Var.f();
    }

    public static MediaCodecInfo.CodecProfileLevel c(int i, int i10) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i10;
        return codecProfileLevel;
    }

    public static String d(mw1 mw1Var) {
        ia0 c10;
        boolean z3;
        String str = mw1Var.f8459o;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if (!"audio/vnd.dts.hd".equals(str) && !"audio/vnd.dts.uhd;profile=p2".equals(str)) {
            if ("video/dolby-vision".equals(str) && (c10 = va0.c(mw1Var)) != null && (z3 = c10.f7070b)) {
                b80.K(z3);
                int i = c10.f7069a;
                if (i != 16 && i != 256) {
                    if (i == 512) {
                        return "video/avc";
                    }
                    if (i == 1024) {
                        mk1 mk1Var = mw1Var.F;
                        if (mk1Var == null || mk1Var.f8365c != 6 || mk1Var.f8364b != 1) {
                            return "video/av01";
                        }
                        return null;
                    }
                } else {
                    return "video/hevc";
                }
            }
            if ("video/mv-hevc".equals(str)) {
                return "video/hevc";
            }
            return null;
        }
        return "audio/vnd.dts";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r14 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133 A[Catch: Exception -> 0x0138, TryCatch #2 {Exception -> 0x0138, blocks: (B:33:0x010a, B:37:0x0115, B:43:0x012b, B:45:0x0133, B:46:0x0144, B:48:0x014d, B:52:0x0171, B:54:0x0151, B:56:0x0161, B:58:0x0169, B:59:0x013a), top: B:32:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d A[Catch: Exception -> 0x0138, TryCatch #2 {Exception -> 0x0138, blocks: (B:33:0x010a, B:37:0x0115, B:43:0x012b, B:45:0x0133, B:46:0x0144, B:48:0x014d, B:52:0x0171, B:54:0x0151, B:56:0x0161, B:58:0x0169, B:59:0x013a), top: B:32:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171 A[Catch: Exception -> 0x0138, TRY_LEAVE, TryCatch #2 {Exception -> 0x0138, blocks: (B:33:0x010a, B:37:0x0115, B:43:0x012b, B:45:0x0133, B:46:0x0144, B:48:0x014d, B:52:0x0171, B:54:0x0151, B:56:0x0161, B:58:0x0169, B:59:0x013a), top: B:32:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151 A[Catch: Exception -> 0x0138, TryCatch #2 {Exception -> 0x0138, blocks: (B:33:0x010a, B:37:0x0115, B:43:0x012b, B:45:0x0133, B:46:0x0144, B:48:0x014d, B:52:0x0171, B:54:0x0151, B:56:0x0161, B:58:0x0169, B:59:0x013a), top: B:32:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a A[Catch: Exception -> 0x0138, TryCatch #2 {Exception -> 0x0138, blocks: (B:33:0x010a, B:37:0x0115, B:43:0x012b, B:45:0x0133, B:46:0x0144, B:48:0x014d, B:52:0x0171, B:54:0x0151, B:56:0x0161, B:58:0x0169, B:59:0x013a), top: B:32:0x010a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e(com.google.android.gms.internal.ads.cx1 r21, x r22) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx1.e(com.google.android.gms.internal.ads.cx1, x):java.util.ArrayList");
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (!a(str)) {
            String h3 = ed1.h(mediaCodecInfo.getName());
            if (!h3.startsWith("arc.")) {
                if (!h3.startsWith("omx.google.") && !h3.startsWith("omx.ffmpeg.")) {
                    if ((!h3.startsWith("omx.sec.") || !h3.contains(".sw.")) && !h3.equals("omx.qcom.video.decoder.hevcswvdec") && !h3.startsWith("c2.android.") && !h3.startsWith("c2.google.")) {
                        if (h3.startsWith("omx.") || h3.startsWith("c2.")) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}