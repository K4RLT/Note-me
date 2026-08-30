package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.facebook.ads.AdError;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class y0 extends zw1 {
    public static final int[] O1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean P1;
    public static boolean Q1;
    public cu1 A1;
    public long B1;
    public boolean C1;
    public long D1;
    public int E1;
    public long F1;
    public ir G1;
    public ir H1;
    public int I1;
    public int J1;
    public h1 K1;
    public long L1;
    public boolean M1;
    public int N1;
    public final Context Y0;
    public final boolean Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final j6.s f12676a1;

    /* renamed from: b1, reason: collision with root package name */
    public final boolean f12677b1;

    /* renamed from: c1, reason: collision with root package name */
    public final j1 f12678c1;

    /* renamed from: d1, reason: collision with root package name */
    public final i1 f12679d1;

    /* renamed from: e1, reason: collision with root package name */
    public final t0 f12680e1;

    /* renamed from: f1, reason: collision with root package name */
    public final j6.e f12681f1;

    /* renamed from: g1, reason: collision with root package name */
    public final long f12682g1;

    /* renamed from: h1, reason: collision with root package name */
    public final k1 f12683h1;

    /* renamed from: i1, reason: collision with root package name */
    public final PriorityQueue f12684i1;

    /* renamed from: j1, reason: collision with root package name */
    public x0 f12685j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f12686k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f12687l1;

    /* renamed from: m1, reason: collision with root package name */
    public y1 f12688m1;

    /* renamed from: n1, reason: collision with root package name */
    public boolean f12689n1;

    /* renamed from: o1, reason: collision with root package name */
    public int f12690o1;

    /* renamed from: p1, reason: collision with root package name */
    public List f12691p1;

    /* renamed from: q1, reason: collision with root package name */
    public Surface f12692q1;

    /* renamed from: r1, reason: collision with root package name */
    public a1 f12693r1;

    /* renamed from: s1, reason: collision with root package name */
    public jl0 f12694s1;

    /* renamed from: t1, reason: collision with root package name */
    public boolean f12695t1;

    /* renamed from: u1, reason: collision with root package name */
    public int f12696u1;

    /* renamed from: v1, reason: collision with root package name */
    public int f12697v1;

    /* renamed from: w1, reason: collision with root package name */
    public long f12698w1;

    /* renamed from: x1, reason: collision with root package name */
    public int f12699x1;

    /* renamed from: y1, reason: collision with root package name */
    public int f12700y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f12701z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y0(c0.z r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.f3439x
            com.google.android.gms.internal.ads.rl r0 = (com.google.android.gms.internal.ads.rl) r0
            java.lang.Object r1 = r6.f3438w
            com.google.android.gms.internal.ads.bx1 r1 = (com.google.android.gms.internal.ads.bx1) r1
            java.lang.Object r2 = r6.f3437v
            android.content.Context r2 = (android.content.Context) r2
            android.content.Context r3 = r2.getApplicationContext()
            r4 = 2
            r5.<init>(r3, r4, r0, r1)
            android.content.Context r0 = r2.getApplicationContext()
            r5.Y0 = r0
            r1 = 0
            r5.f12688m1 = r1
            j6.s r2 = new j6.s
            java.lang.Object r3 = r6.f3440y
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r6 = r6.f3441z
            com.google.android.gms.internal.ads.rs1 r6 = (com.google.android.gms.internal.ads.rs1) r6
            r2.<init>(r3, r6)
            r5.f12676a1 = r2
            com.google.android.gms.internal.ads.y1 r6 = r5.f12688m1
            r2 = 1
            r3 = 0
            if (r6 != 0) goto L34
            r6 = r2
            goto L35
        L34:
            r6 = r3
        L35:
            r5.Z0 = r6
            com.google.android.gms.internal.ads.j1 r6 = new com.google.android.gms.internal.ads.j1
            r6.<init>(r0, r5)
            r5.f12678c1 = r6
            com.google.android.gms.internal.ads.i1 r6 = new com.google.android.gms.internal.ads.i1
            r6.<init>()
            r5.f12679d1 = r6
            com.google.android.gms.internal.ads.t0 r6 = new com.google.android.gms.internal.ads.t0
            com.google.android.gms.internal.ads.tf r0 = new com.google.android.gms.internal.ads.tf
            r4 = 2
            r0.<init>(r4, r5)
            r6.<init>(r0)
            r5.f12680e1 = r6
            java.lang.String r6 = "NVIDIA"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r6 = r6.equals(r0)
            r5.f12677b1 = r6
            com.google.android.gms.internal.ads.jl0 r6 = com.google.android.gms.internal.ads.jl0.f7473c
            r5.f12694s1 = r6
            r5.f12696u1 = r2
            r5.f12697v1 = r3
            com.google.android.gms.internal.ads.ir r6 = com.google.android.gms.internal.ads.ir.f7193d
            r5.G1 = r6
            r5.J1 = r3
            r5.H1 = r1
            r6 = -1000(0xfffffffffffffc18, float:NaN)
            r5.I1 = r6
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.L1 = r2
            j6.e r6 = new j6.e
            r0 = 2
            r6.<init>(r0)
            r5.f12681f1 = r6
            java.util.PriorityQueue r6 = new java.util.PriorityQueue
            r6.<init>()
            r5.f12684i1 = r6
            r2 = -15000(0xffffffffffffc568, double:NaN)
            r5.f12682g1 = r2
            com.google.android.gms.internal.ads.k1 r6 = new com.google.android.gms.internal.ads.k1
            r6.<init>()
            r5.f12683h1 = r6
            r5.A1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y0.<init>(c0.z):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0045. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0(com.google.android.gms.internal.ads.ww1 r8, com.google.android.gms.internal.ads.mw1 r9) {
        /*
            int r0 = r9.f8466v
            int r1 = r9.f8467w
            r2 = -1
            if (r0 == r2) goto Lca
            if (r1 != r2) goto Lb
            goto Lca
        Lb:
            java.lang.String r3 = r9.f8459o
            r3.getClass()
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/av01"
            java.lang.String r7 = "video/hevc"
            if (r4 == 0) goto L40
            android.util.Pair r9 = com.google.android.gms.internal.ads.va0.b(r9)
            if (r9 == 0) goto L3f
            java.lang.Object r9 = r9.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r9 == r3) goto L3d
            r3 = 1
            if (r9 == r3) goto L3d
            r3 = 2
            if (r9 != r3) goto L37
            goto L3d
        L37:
            r3 = 1024(0x400, float:1.435E-42)
            if (r9 != r3) goto L3f
            r3 = r6
            goto L40
        L3d:
            r3 = r5
            goto L40
        L3f:
            r3 = r7
        L40:
            int r9 = r3.hashCode()
            r4 = 4
            switch(r9) {
                case -1664118616: goto Lbd;
                case -1662735862: goto Lb6;
                case -1662541442: goto La5;
                case 1187890754: goto L9c;
                case 1331836730: goto L5f;
                case 1599127256: goto L56;
                case 1599127257: goto L4a;
                default: goto L48;
            }
        L48:
            goto Lca
        L4a:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lca
            r4 = 8
            goto Lc5
        L56:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lca
            goto Lc5
        L5f:
            boolean r9 = r3.equals(r5)
            if (r9 == 0) goto Lca
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lca
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = android.os.Build.MANUFACTURER
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8d
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lca
            java.lang.String r3 = "AFTS"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L8d
            boolean r8 = r8.f12356f
            if (r8 != 0) goto Lca
        L8d:
            java.lang.String r8 = com.google.android.gms.internal.ads.bq0.f4860a
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r1 = r1 * r0
            int r1 = r1 * 768
            int r1 = r1 / r4
            return r1
        L9c:
            java.lang.String r8 = "video/mp4v-es"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lca
            goto Lc5
        La5:
            boolean r8 = r3.equals(r7)
            if (r8 == 0) goto Lca
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            r8 = 2097152(0x200000, float:2.938736E-39)
            int r8 = java.lang.Math.max(r8, r0)
            return r8
        Lb6:
            boolean r8 = r3.equals(r6)
            if (r8 == 0) goto Lca
            goto Lc5
        Lbd:
            java.lang.String r8 = "video/3gpp"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lca
        Lc5:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            return r0
        Lca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y0.A0(com.google.android.gms.internal.ads.ww1, com.google.android.gms.internal.ads.mw1):int");
    }

    public static int E0(ww1 ww1Var, mw1 mw1Var) {
        int i = mw1Var.f8460p;
        if (i != -1) {
            List list = mw1Var.f8462r;
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) list.get(i11)).length;
            }
            return i + i10;
        }
        return A0(ww1Var, mw1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019a, code lost:
    
        if (r1.equals("EverStar_S") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a4, code lost:
    
        if (r1.equals("hwALE-H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r1.equals("itel_S41") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b8, code lost:
    
        if (r1.equals("LS-5017") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c2, code lost:
    
        if (r1.equals("panell_d") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cc, code lost:
    
        if (r1.equals("j2xlteins") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d6, code lost:
    
        if (r1.equals("A7000plus") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e0, code lost:
    
        if (r1.equals("manning") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ea, code lost:
    
        if (r1.equals("GIONEE_WBL7519") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f4, code lost:
    
        if (r1.equals("GIONEE_WBL7365") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01fe, code lost:
    
        if (r1.equals("GIONEE_WBL5708") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0208, code lost:
    
        if (r1.equals("QM16XE_U") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0212, code lost:
    
        if (r1.equals("Pixi5-10_4G") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021c, code lost:
    
        if (r1.equals("TB3-850M") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0226, code lost:
    
        if (r1.equals("TB3-850F") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0230, code lost:
    
        if (r1.equals("TB3-730X") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x023a, code lost:
    
        if (r1.equals("TB3-730F") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0244, code lost:
    
        if (r1.equals("A7020a48") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x024e, code lost:
    
        if (r1.equals("A7010a48") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0258, code lost:
    
        if (r1.equals("griffin") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0262, code lost:
    
        if (r1.equals("marino_f") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026c, code lost:
    
        if (r1.equals("CPY83_I00") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0276, code lost:
    
        if (r1.equals("A2016a40") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0280, code lost:
    
        if (r1.equals("le_x6") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x028a, code lost:
    
        if (r1.equals("l5460") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0294, code lost:
    
        if (r1.equals("i9031") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029e, code lost:
    
        if (r1.equals("X3_HK") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a8, code lost:
    
        if (r1.equals("V23GB") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b2, code lost:
    
        if (r1.equals("Q4310") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02bc, code lost:
    
        if (r1.equals("Q4260") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02c6, code lost:
    
        if (r1.equals("PRO7S") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d0, code lost:
    
        if (r1.equals("F3311") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02da, code lost:
    
        if (r1.equals("F3215") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e4, code lost:
    
        if (r1.equals("F3213") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02ee, code lost:
    
        if (r1.equals("F3211") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02f8, code lost:
    
        if (r1.equals("F3116") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0302, code lost:
    
        if (r1.equals("F3113") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x030c, code lost:
    
        if (r1.equals("F3111") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0316, code lost:
    
        if (r1.equals("E5643") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0320, code lost:
    
        if (r1.equals("A1601") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x032a, code lost:
    
        if (r1.equals("Aura_Note_2") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0334, code lost:
    
        if (r1.equals("602LV") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x033e, code lost:
    
        if (r1.equals("601LV") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0348, code lost:
    
        if (r1.equals("MEIZU_M5") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0352, code lost:
    
        if (r1.equals("p212") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x035c, code lost:
    
        if (r1.equals("mido") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0366, code lost:
    
        if (r1.equals("kate") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0370, code lost:
    
        if (r1.equals("fugu") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x037a, code lost:
    
        if (r1.equals("XE2X") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0384, code lost:
    
        if (r1.equals("Q427") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x038e, code lost:
    
        if (r1.equals("Q350") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0398, code lost:
    
        if (r1.equals("P681") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03a2, code lost:
    
        if (r1.equals("F04J") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03ac, code lost:
    
        if (r1.equals("F04H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b6, code lost:
    
        if (r1.equals("F03H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r2.equals("machuca") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03c0, code lost:
    
        if (r1.equals("F02H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03ca, code lost:
    
        if (r1.equals("F01J") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03d4, code lost:
    
        if (r1.equals("F01H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03de, code lost:
    
        if (r1.equals("1714") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03e8, code lost:
    
        if (r1.equals("1713") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03f2, code lost:
    
        if (r1.equals("1601") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03fc, code lost:
    
        if (r1.equals("flo") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0406, code lost:
    
        if (r1.equals("deb") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0410, code lost:
    
        if (r1.equals("cv3") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x041a, code lost:
    
        if (r1.equals("cv1") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0424, code lost:
    
        if (r1.equals("Z80") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x042e, code lost:
    
        if (r1.equals("QX1") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0438, code lost:
    
        if (r1.equals("PLE") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0442, code lost:
    
        if (r1.equals("P85") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x044c, code lost:
    
        if (r1.equals("MX6") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0456, code lost:
    
        if (r1.equals("M5c") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0460, code lost:
    
        if (r1.equals("M04") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x046a, code lost:
    
        if (r1.equals("JGZ") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0474, code lost:
    
        if (r1.equals("mh") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x047e, code lost:
    
        if (r1.equals("b5") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        if (r2.equals("once") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0488, code lost:
    
        if (r1.equals("V5") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0492, code lost:
    
        if (r1.equals("V1") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x049c, code lost:
    
        if (r1.equals("Q5") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04a6, code lost:
    
        if (r1.equals("C1") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04b0, code lost:
    
        if (r1.equals("woods_fn") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04ba, code lost:
    
        if (r1.equals("ELUGA_A3_Pro") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04c4, code lost:
    
        if (r1.equals("Z12_PRO") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04ce, code lost:
    
        if (r1.equals("BLACK-1X") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04d8, code lost:
    
        if (r1.equals("taido_row") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04e2, code lost:
    
        if (r1.equals("Pixi4-7_3G") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (r2.equals("magnolia") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04ec, code lost:
    
        if (r1.equals("GIONEE_GBL7360") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04f6, code lost:
    
        if (r1.equals("GiONEE_CBL7513") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0500, code lost:
    
        if (r1.equals("OnePlus5T") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x050a, code lost:
    
        if (r1.equals("whyred") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0514, code lost:
    
        if (r1.equals("watson") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x051e, code lost:
    
        if (r1.equals("SVP-DTV15") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0528, code lost:
    
        if (r1.equals("A7000-a") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0532, code lost:
    
        if (r1.equals("nicklaus_f") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x053c, code lost:
    
        if (r1.equals("tcl_eu") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0546, code lost:
    
        if (r1.equals("ELUGA_Ray_X") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r2.equals("aquaman") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0550, code lost:
    
        if (r1.equals("s905x018") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x055a, code lost:
    
        if (r1.equals("A10-70L") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0564, code lost:
    
        if (r1.equals("A10-70F") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x056e, code lost:
    
        if (r1.equals("namath") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0578, code lost:
    
        if (r1.equals("Slate_Pro") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0582, code lost:
    
        if (r1.equals("iris60") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x058c, code lost:
    
        if (r1.equals("BRAVIA_ATV2") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0596, code lost:
    
        if (r1.equals("GiONEE_GBL7319") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x05a0, code lost:
    
        if (r1.equals("panell_dt") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x05aa, code lost:
    
        if (r1.equals("panell_ds") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r2.equals("oneday") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05b4, code lost:
    
        if (r1.equals("panell_dl") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05be, code lost:
    
        if (r1.equals("vernee_M5") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05c8, code lost:
    
        if (r1.equals("pacificrim") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05d2, code lost:
    
        if (r1.equals("Phantom6") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05dc, code lost:
    
        if (r1.equals("ComioS1") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x05e6, code lost:
    
        if (r1.equals("XT1663") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x05f0, code lost:
    
        if (r1.equals("RAIJIN") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05fa, code lost:
    
        if (r1.equals("AquaPowerM") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0603, code lost:
    
        if (r1.equals("PGN611") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x060c, code lost:
    
        if (r1.equals("PGN610") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r2.equals("dangalUHD") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0615, code lost:
    
        if (r1.equals("PGN528") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x061e, code lost:
    
        if (r1.equals("NX573J") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0627, code lost:
    
        if (r1.equals("NX541J") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0630, code lost:
    
        if (r1.equals("CP8676_I02") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0639, code lost:
    
        if (r1.equals("K50a40") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0642, code lost:
    
        if (r1.equals("GIONEE_SWW1631") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x064b, code lost:
    
        if (r1.equals("GIONEE_SWW1627") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0654, code lost:
    
        if (r1.equals("GIONEE_SWW1609") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r2.equals("dangalFHD") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0668, code lost:
    
        if (r2.equals("JSN-L21") == false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        if (r2.equals("dangal") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        if (r2.equals("AFTEUFF014") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r2.equals("AFTSO001") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        if (r2.equals("AFTEU014") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        if (r2.equals("AFTEU011") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        if (r2.equals("AFTR") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        if (r2.equals("AFTN") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        if (r2.equals("AFTA") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cf, code lost:
    
        if (r2.equals("AFTKMST12") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        if (r2.equals("AFTJMST12") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f0, code lost:
    
        if (r1.equals("HWWAS-H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
    
        if (r1.equals("HWVNS-H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        if (r1.equals("ELUGA_Prim") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010e, code lost:
    
        if (r1.equals("ELUGA_Note") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0118, code lost:
    
        if (r1.equals("ASUS_X00AD_2") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        if (r1.equals("HWCAM-H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
    
        if (r1.equals("HWBLN-H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0136, code lost:
    
        if (r1.equals("DM-01K") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0140, code lost:
    
        if (r1.equals("BRAVIA_ATV3_4K") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014a, code lost:
    
        if (r1.equals("Infinix-X572") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0154, code lost:
    
        if (r1.equals("PB2-670M") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015e, code lost:
    
        if (r1.equals("santoni") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0168, code lost:
    
        if (r1.equals("iball8735_9806") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0172, code lost:
    
        if (r1.equals("CPH1715") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017c, code lost:
    
        if (r1.equals("CPH1609") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r1.equals("woods_f") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0190, code lost:
    
        if (r1.equals("htc_e56ml_dtul") != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean F0(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 2288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y0.F0(java.lang.String):boolean");
    }

    public static List G0(Context context, bx1 bx1Var, mw1 mw1Var, boolean z3, boolean z9) {
        List a10;
        String str = mw1Var.f8459o;
        if (str == null) {
            return y51.f12781y;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !b80.m(context)) {
            String d2 = gx1.d(mw1Var);
            if (d2 == null) {
                a10 = y51.f12781y;
            } else {
                bx1Var.getClass();
                a10 = gx1.a(d2, z3, z9);
            }
            if (!a10.isEmpty()) {
                return a10;
            }
        }
        return gx1.b(bx1Var, mw1Var, z3, z9);
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void A() {
        super.A();
        this.f12684i1.clear();
        this.f12701z1 = 0;
        this.N1 = 0;
        this.C1 = false;
        j6.e eVar = this.f12681f1;
        if (eVar != null) {
            eVar.f18919v = null;
            ByteBuffer byteBuffer = (ByteBuffer) eVar.f18918u;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    public final void B0(tw1 tw1Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        tw1Var.m(i);
        Trace.endSection();
        this.N0.f6884f++;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final vw1 C(IllegalStateException illegalStateException, ww1 ww1Var) {
        Surface surface = this.f12692q1;
        vw1 vw1Var = new vw1(illegalStateException, ww1Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return vw1Var;
    }

    public final boolean C0(ww1 ww1Var) {
        if (this.f12688m1 == null) {
            Surface surface = this.f12692q1;
            if (surface == null || !surface.isValid()) {
                if (Build.VERSION.SDK_INT < 35 || !ww1Var.f12358h) {
                    if (!F0(ww1Var.f12352a)) {
                        if (ww1Var.f12356f && !a1.a(this.Y0)) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void D(mw1 mw1Var) {
        y1 y1Var = this.f12688m1;
        if (y1Var != null && !y1Var.a()) {
            try {
                y1Var.B0(mw1Var);
            } catch (x1 e) {
                throw n(e, mw1Var, false, 7000);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.gms.internal.ads.z0, android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface D0(com.google.android.gms.internal.ads.ww1 r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.y1 r0 = r6.f12688m1
            if (r0 == 0) goto L9
            android.view.Surface r7 = r0.i()
            return r7
        L9:
            android.view.Surface r0 = r6.f12692q1
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r7.f12358h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            java.lang.String r0 = r7.f12352a
            boolean r0 = F0(r0)
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L30
            boolean r0 = r7.f12356f
            if (r0 == 0) goto L32
            android.content.Context r0 = r6.Y0
            boolean r0 = com.google.android.gms.internal.ads.a1.a(r0)
            if (r0 != 0) goto L32
        L30:
            r0 = r1
            goto L33
        L32:
            r0 = r3
        L33:
            com.google.android.gms.internal.ads.b80.K(r0)
            com.google.android.gms.internal.ads.a1 r0 = r6.f12693r1
            if (r0 == 0) goto L47
            boolean r4 = r7.f12356f
            boolean r5 = r0.f4308u
            if (r5 == r4) goto L47
            if (r0 == 0) goto L47
            r0.release()
            r6.f12693r1 = r2
        L47:
            com.google.android.gms.internal.ads.a1 r0 = r6.f12693r1
            if (r0 != 0) goto Lbf
            android.content.Context r0 = r6.Y0
            boolean r7 = r7.f12356f
            if (r7 == 0) goto L5b
            boolean r0 = com.google.android.gms.internal.ads.a1.a(r0)
            if (r0 == 0) goto L59
        L57:
            r0 = r3
            goto L5e
        L59:
            r0 = r1
            goto L5e
        L5b:
            int r0 = com.google.android.gms.internal.ads.a1.f4306x
            goto L57
        L5e:
            com.google.android.gms.internal.ads.b80.K(r0)
            com.google.android.gms.internal.ads.z0 r0 = new com.google.android.gms.internal.ads.z0
            java.lang.String r2 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r2)
            if (r7 == 0) goto L6d
            int r7 = com.google.android.gms.internal.ads.a1.f4306x
            goto L6e
        L6d:
            r7 = r1
        L6e:
            r0.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r2.<init>(r4, r0)
            r0.f13020v = r2
            com.google.android.gms.internal.ads.tc0 r4 = new com.google.android.gms.internal.ads.tc0
            r4.<init>(r2)
            r0.f13019u = r4
            monitor-enter(r0)
            android.os.Handler r2 = r0.f13020v     // Catch: java.lang.Throwable -> L9d
            android.os.Message r7 = r2.obtainMessage(r3, r7, r1)     // Catch: java.lang.Throwable -> L9d
            r7.sendToTarget()     // Catch: java.lang.Throwable -> L9d
        L8d:
            com.google.android.gms.internal.ads.a1 r7 = r0.f13023y     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto La1
            java.lang.RuntimeException r7 = r0.f13022x     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto La1
            java.lang.Error r7 = r0.f13021w     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto La1
            r0.wait()     // Catch: java.lang.Throwable -> L9d java.lang.InterruptedException -> L9f
            goto L8d
        L9d:
            r7 = move-exception
            goto Lbd
        L9f:
            r1 = r3
            goto L8d
        La1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto Lab
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        Lab:
            java.lang.RuntimeException r7 = r0.f13022x
            if (r7 != 0) goto Lbc
            java.lang.Error r7 = r0.f13021w
            if (r7 != 0) goto Lbb
            com.google.android.gms.internal.ads.a1 r7 = r0.f13023y
            r7.getClass()
            r6.f12693r1 = r7
            goto Lbf
        Lbb:
            throw r7
        Lbc:
            throw r7
        Lbd:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            throw r7
        Lbf:
            com.google.android.gms.internal.ads.a1 r7 = r6.f12693r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y0.D0(com.google.android.gms.internal.ads.ww1):android.view.Surface");
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void E(es1 es1Var) {
        ByteBuffer byteBuffer;
        mk1 mk1Var;
        boolean z3;
        ww1 ww1Var = this.f13305n0;
        ww1Var.getClass();
        if (ww1Var.f12353b.equals("video/av01") && (byteBuffer = es1Var.f5767d) != null) {
            mw1 mw1Var = this.f13301h0;
            if (mw1Var != null && (mk1Var = mw1Var.F) != null && mk1Var.e > 8 && Build.VERSION.SDK_INT < 37) {
                ArrayList f10 = ct.f(byteBuffer.asReadOnlyBuffer());
                int size = f10.size();
                int i = 0;
                while (i < size) {
                    Object obj = f10.get(i);
                    i++;
                    q31 q31Var = (q31) obj;
                    int i10 = q31Var.f9730a;
                    ByteBuffer byteBuffer2 = q31Var.f9731b;
                    if (i10 == 5) {
                        if (i10 == 5) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        try {
                            b80.l(z3);
                            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                            if (ct.v(asReadOnlyBuffer) == 4) {
                                if (asReadOnlyBuffer.remaining() >= 6) {
                                    byte[] bArr = new byte[6];
                                    asReadOnlyBuffer.asReadOnlyBuffer().get(bArr);
                                    if (!Arrays.equals(bArr, ct.f5153u)) {
                                    }
                                }
                                byteBuffer.put(byteBuffer2.position(), (byte) 31);
                            }
                        } catch (BufferUnderflowException unused) {
                        }
                    }
                }
            }
            j6.e eVar = this.f12681f1;
            if (eVar != null && es1Var.c(1)) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer3 = (ByteBuffer) eVar.f18918u;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer);
                byteBuffer3.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.N1 = 0;
        int F = F(es1Var);
        if (Build.VERSION.SDK_INT >= 34 && (F & 32) != 0) {
            return;
        }
        this.f12701z1++;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final int F(es1 es1Var) {
        if (Build.VERSION.SDK_INT >= 34 && this.A1 != null && es1Var.e < this.F && !I0(es1Var)) {
            return 32;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // com.google.android.gms.internal.ads.zw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(com.google.android.gms.internal.ads.es1 r15) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y0.G(com.google.android.gms.internal.ads.es1):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void H(long j10, long j11) {
        y1 y1Var = this.f12688m1;
        if (y1Var != null) {
            try {
                y1Var.t0(j10, j11);
            } catch (x1 e) {
                throw n(e, e.f12398u, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.H(j10, j11);
    }

    public final void H0(Object obj) {
        Surface surface;
        Handler handler;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        Surface surface2 = this.f12692q1;
        j6.s sVar = this.f12676a1;
        if (surface2 != surface) {
            this.f12692q1 = surface;
            y1 y1Var = this.f12688m1;
            j1 j1Var = this.f12678c1;
            if (y1Var == null) {
                j1Var.c(surface);
            }
            this.f12695t1 = false;
            int i = this.B;
            tw1 tw1Var = this.f13300g0;
            if (tw1Var != null && this.f12688m1 == null) {
                ww1 ww1Var = this.f13305n0;
                ww1Var.getClass();
                if (C0(ww1Var) && !this.f12686k1) {
                    Surface D0 = D0(ww1Var);
                    if (D0 != null) {
                        tw1Var.l(D0);
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        tw1Var.p();
                    } else {
                        g5.q.l();
                        return;
                    }
                } else {
                    x();
                    v();
                }
            }
            if (surface != null) {
                ir irVar = this.H1;
                if (irVar != null) {
                    sVar.o(irVar);
                }
            } else {
                this.H1 = null;
                y1 y1Var2 = this.f12688m1;
                if (y1Var2 != null) {
                    y1Var2.j();
                }
            }
            if (i == 2) {
                y1 y1Var3 = this.f12688m1;
                if (y1Var3 != null) {
                    y1Var3.y0(true);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            }
            return;
        }
        if (surface != null) {
            ir irVar2 = this.H1;
            if (irVar2 != null) {
                sVar.o(irVar2);
            }
            Surface surface3 = this.f12692q1;
            if (surface3 != null && this.f12695t1 && (handler = (Handler) sVar.f18981v) != null) {
                handler.post(new t1(sVar, surface3, SystemClock.elapsedRealtime()));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() >= r7.f13313u0) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.zw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.mw1 r0 = r7.Y
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3f
            boolean r0 = r7.r0()
            if (r0 == 0) goto Lf
            boolean r0 = r7.H
            goto L18
        Lf:
            com.google.android.gms.internal.ads.sy1 r0 = r7.C
            r0.getClass()
            boolean r0 = r0.zza()
        L18:
            if (r0 != 0) goto L3e
            int r0 = r7.f13317w0
            if (r0 < 0) goto L20
            r0 = r1
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != 0) goto L3e
            long r3 = r7.f13313u0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L3f
            com.google.android.gms.internal.ads.s6 r0 = r7.A
            r0.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.f13313u0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L3e
            goto L3f
        L3e:
            r2 = r1
        L3f:
            com.google.android.gms.internal.ads.y1 r0 = r7.f12688m1
            if (r0 == 0) goto L48
            boolean r0 = r0.Z(r2)
            return r0
        L48:
            if (r2 == 0) goto L50
            com.google.android.gms.internal.ads.tw1 r0 = r7.f13300g0
            if (r0 == 0) goto L4f
            goto L50
        L4f:
            return r1
        L50:
            com.google.android.gms.internal.ads.j1 r0 = r7.f12678c1
            boolean r0 = r0.d(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y0.I():boolean");
    }

    public final boolean I0(es1 es1Var) {
        if (r0() || es1Var.c(536870912)) {
            return true;
        }
        long j10 = this.L;
        if (j10 == -9223372036854775807L || j10 - (es1Var.e - this.O0.f12995c) <= 100000) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final boolean J() {
        if (this.L0) {
            y1 y1Var = this.f12688m1;
            if (y1Var == null || y1Var.f()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final int M(bx1 bx1Var, mw1 mw1Var) {
        boolean z3;
        boolean z9;
        int i;
        int i10;
        int i11;
        String str = mw1Var.f8459o;
        int i12 = 128;
        if (!ha.b(str)) {
            return 128;
        }
        int i13 = 0;
        if (mw1Var.f8463s != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Context context = this.Y0;
        List G0 = G0(context, bx1Var, mw1Var, z3, false);
        if (z3 && G0.isEmpty()) {
            G0 = G0(context, bx1Var, mw1Var, false, false);
        }
        if (G0.isEmpty()) {
            return 129;
        }
        if (mw1Var.P != 0) {
            return 130;
        }
        ww1 ww1Var = (ww1) G0.get(0);
        boolean b10 = ww1Var.b(context, mw1Var);
        if (!b10) {
            for (int i14 = 1; i14 < G0.size(); i14++) {
                ww1 ww1Var2 = (ww1) G0.get(i14);
                if (ww1Var2.b(context, mw1Var)) {
                    b10 = true;
                    z9 = false;
                    ww1Var = ww1Var2;
                    break;
                }
            }
        }
        z9 = true;
        if (true != b10) {
            i = 3;
        } else {
            i = 4;
        }
        if (true != ww1Var.c(mw1Var)) {
            i10 = 8;
        } else {
            i10 = 16;
        }
        if (true != ww1Var.f12357g) {
            i11 = 0;
        } else {
            i11 = 64;
        }
        if (true != z9) {
            i12 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !b80.m(context)) {
            i12 = 256;
        }
        if (b10) {
            List G02 = G0(context, bx1Var, mw1Var, z3, true);
            if (!G02.isEmpty()) {
                HashMap hashMap = gx1.f6499a;
                ArrayList arrayList = new ArrayList(G02);
                Collections.sort(arrayList, new ex1(new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(context, 11, mw1Var)));
                ww1 ww1Var3 = (ww1) arrayList.get(0);
                if (ww1Var3.b(context, mw1Var) && ww1Var3.c(mw1Var)) {
                    i13 = 32;
                }
            }
        }
        return i | i10 | i13 | i11 | i12;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final ArrayList O(bx1 bx1Var, mw1 mw1Var) {
        Context context = this.Y0;
        List G0 = G0(context, bx1Var, mw1Var, false, false);
        HashMap hashMap = gx1.f6499a;
        ArrayList arrayList = new ArrayList(G0);
        Collections.sort(arrayList, new ex1(new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(context, 11, mw1Var)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final p8 R(ww1 ww1Var, mw1 mw1Var, float f10) {
        mk1 mk1Var;
        x0 x0Var;
        boolean z3;
        int i;
        int i10;
        Point point;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i16;
        char c10;
        boolean z9;
        int i17;
        Pair b10;
        int A0;
        mw1[] mw1VarArr = this.D;
        mw1VarArr.getClass();
        int length = mw1VarArr.length;
        int E0 = E0(ww1Var, mw1Var);
        float f11 = mw1Var.f8470z;
        mk1 mk1Var2 = mw1Var.F;
        int i18 = mw1Var.f8467w;
        int i19 = mw1Var.f8466v;
        if (length == 1) {
            if (E0 != -1 && (A0 = A0(ww1Var, mw1Var)) != -1) {
                E0 = Math.min((int) (E0 * 1.5f), A0);
            }
            x0Var = new x0(i19, i18, E0, false);
            mk1Var = mk1Var2;
        } else {
            int i20 = i18;
            int i21 = i19;
            int i22 = 0;
            boolean z10 = false;
            while (i22 < length) {
                mw1 mw1Var2 = mw1VarArr[i22];
                if (mk1Var2 != null && mw1Var2.F == null) {
                    rv1 rv1Var = new rv1(mw1Var2);
                    rv1Var.E = mk1Var2;
                    mw1Var2 = new mw1(rv1Var);
                }
                is1 d2 = ww1Var.d(mw1Var, mw1Var2);
                mw1[] mw1VarArr2 = mw1VarArr;
                int i23 = mw1Var2.f8467w;
                if (d2.f7212d != 0) {
                    int i24 = mw1Var2.f8466v;
                    i16 = length;
                    c10 = 65535;
                    if (i24 == -1 || i23 == -1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 |= z9;
                    i21 = Math.max(i21, i24);
                    i20 = Math.max(i20, i23);
                    E0 = Math.max(E0, E0(ww1Var, mw1Var2));
                } else {
                    i16 = length;
                    c10 = 65535;
                }
                i22++;
                mw1VarArr = mw1VarArr2;
                length = i16;
            }
            if (z10) {
                x21.F("MediaCodecVideoRenderer", g3.a.f(i21, i20, "Resolutions unknown. Codec max resolution: ", "x", new StringBuilder(String.valueOf(i21).length() + 44 + String.valueOf(i20).length())));
                if (i18 > i19) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i = i18;
                } else {
                    i = i19;
                }
                if (true != z3) {
                    i10 = i18;
                } else {
                    i10 = i19;
                }
                mk1Var = mk1Var2;
                int i25 = 0;
                while (true) {
                    Point point2 = null;
                    if (i25 >= 9) {
                        break;
                    }
                    float f12 = i10;
                    int i26 = i25;
                    float f13 = i;
                    int i27 = O1[i26];
                    float f14 = i27;
                    if (i27 <= i || (i11 = (int) (f14 * (f12 / f13))) <= i10) {
                        break;
                    }
                    if (true != z3) {
                        i12 = i11;
                        i11 = i27;
                    } else {
                        i12 = i11;
                    }
                    if (true == z3) {
                        i13 = i27;
                    } else {
                        i13 = i12;
                    }
                    boolean z11 = z3;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = ww1Var.f12355d;
                    if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                        point2 = ww1.j(videoCapabilities, i11, i13);
                    }
                    point = point2;
                    if (point != null) {
                        i14 = i;
                        i15 = i10;
                        if (ww1Var.e(point.x, point.y, f11)) {
                            break;
                        }
                    } else {
                        i14 = i;
                        i15 = i10;
                    }
                    i25 = i26 + 1;
                    z3 = z11;
                    i = i14;
                    i10 = i15;
                }
                point = null;
                if (point != null) {
                    i21 = Math.max(i21, point.x);
                    i20 = Math.max(i20, point.y);
                    rv1 rv1Var2 = new rv1(mw1Var);
                    rv1Var2.f10314u = i21;
                    rv1Var2.f10315v = i20;
                    E0 = Math.max(E0, A0(ww1Var, new mw1(rv1Var2)));
                    x21.F("MediaCodecVideoRenderer", g3.a.f(i21, i20, "Codec max resolution adjusted to: ", "x", new StringBuilder(g3.a.d(i21, 35) + String.valueOf(i20).length())));
                }
            } else {
                mk1Var = mk1Var2;
            }
            x0Var = new x0(i21, i20, E0, false);
        }
        String str = ww1Var.f12354c;
        this.f12685j1 = x0Var;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i19);
        mediaFormat.setInteger("height", i18);
        x21.j(mediaFormat, mw1Var.f8462r);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        x21.C(mediaFormat, "rotation-degrees", mw1Var.A);
        if (mk1Var != null) {
            mk1 mk1Var3 = mk1Var;
            x21.C(mediaFormat, "color-transfer", mk1Var3.f8365c);
            x21.C(mediaFormat, "color-standard", mk1Var3.f8363a);
            x21.C(mediaFormat, "color-range", mk1Var3.f8364b);
            byte[] bArr = mk1Var3.f8366d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(mw1Var.f8459o) && (b10 = va0.b(mw1Var)) != null) {
            x21.C(mediaFormat, "profile", ((Integer) b10.first).intValue());
        }
        mediaFormat.setInteger("max-width", x0Var.f12384a);
        mediaFormat.setInteger("max-height", x0Var.f12385b);
        x21.C(mediaFormat, "max-input-size", x0Var.f12386c);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (this.f12677b1) {
            mediaFormat.setInteger("no-post-process", 1);
            i17 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i17 = 0;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(i17, -this.I1));
        }
        i0(mediaFormat);
        Surface D0 = D0(ww1Var);
        if (this.f12688m1 != null && !bq0.l(this.Y0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new p8(ww1Var, mediaFormat, mw1Var, D0, null, 11);
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final is1 S(ww1 ww1Var, mw1 mw1Var, mw1 mw1Var2, boolean z3) {
        int i;
        int i10;
        int i11;
        is1 d2 = ww1Var.d(mw1Var, mw1Var2);
        int i12 = d2.e;
        x0 x0Var = this.f12685j1;
        x0Var.getClass();
        if (mw1Var2.f8466v > x0Var.f12384a || mw1Var2.f8467w > x0Var.f12385b) {
            i12 |= 256;
        }
        if (E0(ww1Var, mw1Var2) > x0Var.f12386c) {
            i12 |= 64;
        }
        if (this.f12697v1 != Integer.MIN_VALUE && (i11 = Build.VERSION.SDK_INT) < 31 && (i11 != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f10 = mw1Var.f8470z;
            if (f10 != -1.0f) {
                float f11 = mw1Var2.f8470z;
                if (f11 != -1.0f && (!ww1Var.f12356f || !z3)) {
                    if (Math.abs((Math.max(f11, f10) / Math.min(f11, f10)) - Math.round(r12)) > 0.01f) {
                        i12 |= 65536;
                    }
                }
            }
        }
        String str = ww1Var.f12352a;
        if (i12 != 0) {
            i10 = 0;
            i = i12;
        } else {
            i = 0;
            i10 = d2.f7212d;
        }
        return new is1(str, mw1Var, mw1Var2, i10, i);
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final float U(float f10, mw1 mw1Var, mw1[] mw1VarArr) {
        float f11;
        ww1 ww1Var;
        float f12 = -1.0f;
        for (mw1 mw1Var2 : mw1VarArr) {
            float f13 = mw1Var2.f8470z;
            if (f13 != -1.0f) {
                f12 = Math.max(f12, f13);
            }
        }
        if (f12 == -1.0f && this.f13300g0 != null) {
            t0 t0Var = this.f12680e1;
            if (t0Var.b() != -9223372036854775807L) {
                f12 = 1.0E9f / ((float) t0Var.b());
            }
        }
        if (f12 == -1.0f) {
            f11 = -1.0f;
        } else {
            f11 = f12 * f10;
        }
        if (this.A1 != null && (ww1Var = this.f13305n0) != null) {
            int i = mw1Var.f8466v;
            int i10 = mw1Var.f8467w;
            float f14 = -3.4028235E38f;
            if (ww1Var.i) {
                float f15 = ww1Var.f12361l;
                if (f15 != -3.4028235E38f && ww1Var.f12359j == i && ww1Var.f12360k == i10) {
                    f14 = f15;
                } else {
                    f14 = 1024.0f;
                    if (!ww1Var.e(i, i10, 1024.0d)) {
                        float f16 = 0.0f;
                        while (true) {
                            float f17 = f14 - f16;
                            if (Math.abs(f17) <= 5.0f) {
                                break;
                            }
                            float f18 = (f17 / 2.0f) + f16;
                            boolean e = ww1Var.e(i, i10, f18);
                            if (true == e) {
                                f16 = f18;
                            }
                            if (true != e) {
                                f14 = f18;
                            }
                        }
                        f14 = f16;
                    }
                    ww1Var.f12361l = f14;
                    ww1Var.f12359j = i;
                    ww1Var.f12360k = i10;
                }
            }
            if (f11 != -1.0f) {
                return Math.max(f11, f14);
            }
            return f14;
        }
        return f11;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void V(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        j6.s sVar = this.f12676a1;
        Handler handler = (Handler) sVar.f18981v;
        if (handler != null) {
            str2 = str;
            handler.post(new q1(sVar, str2, j10, j11));
        } else {
            str2 = str;
        }
        this.f12686k1 = F0(str2);
        ww1 ww1Var = this.f13305n0;
        ww1Var.getClass();
        boolean z3 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(ww1Var.f12353b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = ww1Var.f12355d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z3 = true;
                    break;
                }
                i++;
            }
        }
        this.f12687l1 = z3;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void W(String str) {
        j6.s sVar = this.f12676a1;
        Handler handler = (Handler) sVar.f18981v;
        if (handler != null) {
            handler.post(new q1(sVar, str, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void X(Exception exc) {
        x21.P("MediaCodecVideoRenderer", "Video codec error", exc);
        j6.s sVar = this.f12676a1;
        Handler handler = (Handler) sVar.f18981v;
        if (handler != null) {
            handler.post(new q1(sVar, exc, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final is1 Y(i0.m mVar) {
        is1 Y = super.Y(mVar);
        mw1 mw1Var = (mw1) mVar.f18054v;
        mw1Var.getClass();
        j6.s sVar = this.f12676a1;
        Handler handler = (Handler) sVar.f18981v;
        if (handler != null) {
            handler.post(new r1(0, sVar, mw1Var, Y));
        }
        k1 k1Var = this.f12683h1;
        if (k1Var != null) {
            k1Var.c();
        }
        return Y;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void Z(mw1 mw1Var, MediaFormat mediaFormat) {
        boolean z3;
        int integer;
        int integer2;
        tw1 tw1Var = this.f13300g0;
        if (tw1Var != null) {
            tw1Var.o(this.f12696u1);
        }
        mediaFormat.getClass();
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z3) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float f10 = mw1Var.C;
        int i = mw1Var.A;
        if (i == 90 || i == 270) {
            f10 = 1.0f / f10;
            int i10 = integer2;
            integer2 = integer;
            integer = i10;
        }
        this.G1 = new ir(integer, integer2, f10);
        y1 y1Var = this.f12688m1;
        if (y1Var != null && this.M1) {
            rv1 rv1Var = new rv1(mw1Var);
            rv1Var.f10314u = integer;
            rv1Var.f10315v = integer2;
            rv1Var.B = f10;
            mw1 mw1Var2 = new mw1(rv1Var);
            int i11 = this.f12690o1;
            List list = this.f12691p1;
            if (list == null) {
                list = y51.f12781y;
            }
            y1Var.A0(mw1Var2, this.O0.f12994b, i11, list);
            this.f12690o1 = 2;
        } else {
            float f11 = mw1Var.f8470z;
            t0 t0Var = this.f12680e1;
            t0Var.f11213f = f11;
            t0Var.f11209a.a();
            t0Var.f11210b.a();
            t0Var.f11211c = false;
            t0Var.f11212d = -9223372036854775807L;
            t0Var.e = 0;
            t0Var.c();
        }
        this.M1 = false;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void a0() {
        y1 y1Var = this.f12688m1;
        if (y1Var != null) {
            y1Var.g();
            long j10 = this.L1;
            if (j10 == -9223372036854775807L) {
                j10 = this.O0.f12994b;
                this.L1 = j10;
            }
            this.f12688m1.z0(-j10);
        } else {
            this.f12678c1.a(2);
        }
        this.M1 = true;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final void b(int i, Object obj) {
        boolean z3;
        boolean z9 = true;
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 13) {
                                if (i != 14) {
                                    switch (i) {
                                        case 16:
                                            obj.getClass();
                                            this.I1 = ((Integer) obj).intValue();
                                            tw1 tw1Var = this.f13300g0;
                                            if (tw1Var != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.I1));
                                                tw1Var.j(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.f12692q1;
                                            H0(null);
                                            obj.getClass();
                                            ((y0) obj).b(1, surface);
                                            return;
                                        case 18:
                                            if (this.A1 == null) {
                                                z3 = false;
                                            } else {
                                                z3 = true;
                                            }
                                            cu1 cu1Var = (cu1) obj;
                                            this.A1 = cu1Var;
                                            if (cu1Var == null) {
                                                z9 = false;
                                            }
                                            if (z3 != z9) {
                                                j0(this.f13301h0);
                                                return;
                                            }
                                            return;
                                        default:
                                            if (i == 11) {
                                                zs1 zs1Var = (zs1) obj;
                                                zs1Var.getClass();
                                                this.f13296c0 = zs1Var;
                                                return;
                                            }
                                            return;
                                    }
                                }
                                obj.getClass();
                                jl0 jl0Var = (jl0) obj;
                                if (jl0Var.f7474a != 0 && jl0Var.f7475b != 0) {
                                    this.f12694s1 = jl0Var;
                                    y1 y1Var = this.f12688m1;
                                    if (y1Var != null) {
                                        Surface surface2 = this.f12692q1;
                                        surface2.getClass();
                                        y1Var.r0(surface2, jl0Var);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(wp.f12311a)) {
                                y1 y1Var2 = this.f12688m1;
                                if (y1Var2 != null && y1Var2.a()) {
                                    y1Var2.b();
                                    return;
                                }
                                return;
                            }
                            this.f12691p1 = list;
                            y1 y1Var3 = this.f12688m1;
                            if (y1Var3 != null) {
                                y1Var3.w0(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.f12697v1 = intValue;
                        y1 y1Var4 = this.f12688m1;
                        if (y1Var4 != null) {
                            y1Var4.u0(intValue);
                            return;
                        }
                        o1 o1Var = this.f12678c1.f7273b;
                        if (o1Var.f8913h != intValue) {
                            o1Var.f8913h = intValue;
                            o1Var.b(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.f12696u1 = intValue2;
                    tw1 tw1Var2 = this.f13300g0;
                    if (tw1Var2 != null) {
                        tw1Var2.o(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.J1 != intValue3) {
                    this.J1 = intValue3;
                    return;
                }
                return;
            }
            obj.getClass();
            h1 h1Var = (h1) obj;
            this.K1 = h1Var;
            y1 y1Var5 = this.f12688m1;
            if (y1Var5 != null) {
                y1Var5.v0(h1Var);
                return;
            }
            return;
        }
        H0(obj);
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final boolean b0(long j10, long j11, tw1 tw1Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j12, boolean z3, boolean z9, mw1 mw1Var) {
        t0 t0Var;
        tw1Var.getClass();
        long j13 = j12 - this.O0.f12995c;
        int i12 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f12684i1;
            Long l10 = (Long) priorityQueue.peek();
            t0Var = this.f12680e1;
            if (l10 == null || l10.longValue() >= j12) {
                break;
            }
            priorityQueue.poll();
            t0Var.a(l10.longValue() * 1000);
            if (l10.longValue() >= this.F) {
                i12++;
            }
        }
        w0(i12, 0);
        t0Var.a(j12 * 1000);
        y1 y1Var = this.f12688m1;
        if (y1Var != null) {
            if (z3 && !z9) {
                B0(tw1Var, i);
                return true;
            }
            return y1Var.x0(j12, new w0(this, tw1Var, i, j13));
        }
        long j14 = this.O0.f12994b;
        long b10 = t0Var.b();
        long j15 = t0Var.f11215h;
        j1 j1Var = this.f12678c1;
        i1 i1Var = this.f12679d1;
        int e = j1Var.e(j12, j10, j11, j14, z3, z9, b10, j15, i1Var);
        k1 k1Var = this.f12683h1;
        if (k1Var != null) {
            if (e != 5 && e != 4) {
                k1Var.a(j12, i1Var.f6953a);
            }
            return false;
        }
        if (e != 0) {
            if (e != 1) {
                if (e != 2) {
                    if (e == 3) {
                        B0(tw1Var, i);
                        x0(i1Var.f6953a);
                        return true;
                    }
                    return false;
                }
                Trace.beginSection("dropVideoBuffer");
                tw1Var.m(i);
                Trace.endSection();
                w0(0, 1);
                x0(i1Var.f6953a);
                return true;
            }
            long j16 = i1Var.f6954b;
            long j17 = i1Var.f6953a;
            if (j16 == this.F1) {
                B0(tw1Var, i);
            } else {
                h1 h1Var = this.K1;
                if (h1Var != null) {
                    h1Var.a(j13, j16, mw1Var, this.f13302i0);
                }
                y0(tw1Var, i, j16);
            }
            x0(j17);
            this.F1 = j16;
            return true;
        }
        this.A.getClass();
        long nanoTime = System.nanoTime();
        h1 h1Var2 = this.K1;
        if (h1Var2 != null) {
            h1Var2.a(j13, nanoTime, mw1Var, this.f13302i0);
        }
        y0(tw1Var, i, nanoTime);
        x0(i1Var.f6953a);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void c(long j10, boolean z3, boolean z9) {
        y1 y1Var = this.f12688m1;
        if (y1Var != null && !z3) {
            y1Var.p0(true);
        }
        if (z9) {
            this.B1 = j10;
        }
        super.c(j10, z3, z9);
        y1 y1Var2 = this.f12688m1;
        j1 j1Var = this.f12678c1;
        if (y1Var2 == null) {
            j1Var.f7273b.a();
            j1Var.e = -9223372036854775807L;
            j1Var.f7275d = Math.min(j1Var.f7275d, 1);
            j1Var.f7279j = false;
        }
        k1 k1Var = this.f12683h1;
        if (k1Var != null) {
            k1Var.c();
        }
        if (z3) {
            y1 y1Var3 = this.f12688m1;
            if (y1Var3 != null) {
                y1Var3.y0(false);
            } else {
                j1Var.getClass();
            }
        }
        this.f12700y1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void c0(gs1 gs1Var) {
        j6.s sVar = this.f12676a1;
        Handler handler = (Handler) sVar.f18981v;
        if (handler != null) {
            handler.post(new t81(sVar, 5, gs1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void d0() {
        y1 y1Var = this.f12688m1;
        if (y1Var != null) {
            y1Var.g();
        } else {
            long j10 = this.O0.f12997f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void f0(es1 es1Var) {
        if (this.f12687l1) {
            ByteBuffer byteBuffer = es1Var.f5768f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        tw1 tw1Var = this.f13300g0;
                        tw1Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        tw1Var.j(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void g() {
        this.f12699x1 = 0;
        this.A.getClass();
        this.f12698w1 = SystemClock.elapsedRealtime();
        this.D1 = 0L;
        this.E1 = 0;
        y1 y1Var = this.f12688m1;
        if (y1Var != null) {
            y1Var.zza();
        } else {
            this.f12678c1.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void h() {
        int i = this.f12699x1;
        j6.s sVar = this.f12676a1;
        if (i > 0) {
            this.A.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f12698w1;
            int i10 = this.f12699x1;
            Handler handler = (Handler) sVar.f18981v;
            if (handler != null) {
                handler.post(new s1(sVar, i10, j10, 0));
            }
            this.f12699x1 = 0;
            this.f12698w1 = elapsedRealtime;
        }
        int i11 = this.E1;
        if (i11 != 0) {
            long j11 = this.D1;
            Handler handler2 = (Handler) sVar.f18981v;
            if (handler2 != null) {
                handler2.post(new q1(sVar, j11, i11));
            }
            this.D1 = 0L;
            this.E1 = 0;
        }
        y1 y1Var = this.f12688m1;
        if (y1Var != null) {
            y1Var.zzb();
        } else {
            j1 j1Var = this.f12678c1;
            j1Var.f7274c = false;
            o1 o1Var = j1Var.f7273b;
            o1Var.f8909c = false;
            l1 l1Var = o1Var.f8908b;
            if (l1Var != null) {
                l1Var.b();
            }
            o1Var.c();
        }
        k1 k1Var = this.f12683h1;
        if (k1Var != null) {
            k1Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void h0(long j10) {
        super.h0(j10);
        this.f12701z1--;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void i() {
        j6.s sVar = this.f12676a1;
        this.H1 = null;
        this.f12695t1 = false;
        this.C1 = true;
        try {
            super.i();
            hs1 hs1Var = this.N0;
            sVar.getClass();
            synchronized (hs1Var) {
            }
            Handler handler = (Handler) sVar.f18981v;
            if (handler != null) {
                handler.post(new ac.a(sVar, 5, hs1Var));
            }
            sVar.o(ir.f7193d);
        } catch (Throwable th) {
            hs1 hs1Var2 = this.N0;
            sVar.getClass();
            synchronized (hs1Var2) {
                Handler handler2 = (Handler) sVar.f18981v;
                if (handler2 != null) {
                    handler2.post(new ac.a(sVar, 5, hs1Var2));
                }
                sVar.o(ir.f7193d);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zw1
    public final void j() {
        try {
            try {
                this.f13321y0 = false;
                g0();
                x();
            } finally {
                this.f13295b0 = null;
            }
        } finally {
            this.f12689n1 = false;
            this.L1 = -9223372036854775807L;
            a1 a1Var = this.f12693r1;
            if (a1Var != null) {
                a1Var.release();
                this.f12693r1 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void k() {
        y1 y1Var = this.f12688m1;
        if (y1Var != null && this.Z0) {
            y1Var.I();
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final String p() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final boolean q(long j10) {
        if (this.I0 == -9223372036854775807L || j10 < this.B1) {
            return false;
        }
        long j11 = this.P0;
        if (j11 != -9223372036854775807L && j10 <= j11) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void r(float f10, float f11) {
        super.r(f10, f11);
        y1 y1Var = this.f12688m1;
        if (y1Var != null) {
            y1Var.q0(f10);
        } else {
            this.f12678c1.f(f10);
        }
        k1 k1Var = this.f12683h1;
        if (k1Var != null) {
            k1Var.b(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void s() {
        y1 y1Var = this.f12688m1;
        if (y1Var != null) {
            int i = this.f12690o1;
            if (i != 0 && i != 1) {
                y1Var.M();
                return;
            } else {
                this.f12690o1 = 0;
                return;
            }
        }
        j1 j1Var = this.f12678c1;
        if (j1Var.f7275d == 0) {
            j1Var.f7275d = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.hs1, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zw1
    public final void u0(boolean z3, boolean z9) {
        y1 y1Var;
        this.N0 = new Object();
        l();
        hs1 hs1Var = this.N0;
        j6.s sVar = this.f12676a1;
        Handler handler = (Handler) sVar.f18981v;
        if (handler != null) {
            handler.post(new q1(sVar, hs1Var, 4));
        }
        boolean z10 = this.f12689n1;
        j1 j1Var = this.f12678c1;
        if (!z10) {
            if (this.f12691p1 != null && this.f12688m1 == null) {
                b1 b1Var = new b1(this.Y0, j1Var);
                b1Var.f4654d = true;
                b1Var.f4656g = -this.f12682g1;
                s6 s6Var = this.A;
                s6Var.getClass();
                b1Var.e = s6Var;
                b80.K(!b1Var.f4655f);
                if (b1Var.f4653c == null) {
                    b1Var.f4653c = new e1();
                }
                g1 g1Var = new g1(b1Var);
                b1Var.f4655f = true;
                g1Var.f6251p = 1;
                SparseArray sparseArray = g1Var.f6240c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    y1Var = (y1) sparseArray.get(0);
                } else {
                    c1 c1Var = new c1(g1Var, g1Var.f6238a);
                    g1Var.f6243g.add(c1Var);
                    sparseArray.put(0, c1Var);
                    y1Var = c1Var;
                }
                this.f12688m1 = y1Var;
            }
            this.f12689n1 = true;
        }
        int i = !z9 ? 1 : 0;
        y1 y1Var2 = this.f12688m1;
        if (y1Var2 != null) {
            y1Var2.s0(new v0(this));
            h1 h1Var = this.K1;
            if (h1Var != null) {
                this.f12688m1.v0(h1Var);
            }
            if (this.f12692q1 != null && !this.f12694s1.equals(jl0.f7473c)) {
                this.f12688m1.r0(this.f12692q1, this.f12694s1);
            }
            this.f12688m1.u0(this.f12697v1);
            this.f12688m1.q0(this.f13298e0);
            List list = this.f12691p1;
            if (list != null) {
                this.f12688m1.w0(list);
            }
            this.f12690o1 = i;
            this.R0 = true;
            return;
        }
        s6 s6Var2 = this.A;
        s6Var2.getClass();
        j1Var.f7278h = s6Var2;
        j1Var.a(i);
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void v0(mw1[] mw1VarArr, long j10, long j11, yx1 yx1Var) {
        super.v0(mw1VarArr, j10, j11, yx1Var);
        k1 k1Var = this.f12683h1;
        if (k1Var != null) {
            k1Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final boolean w(ww1 ww1Var) {
        return C0(ww1Var);
    }

    public final void w0(int i, int i10) {
        hs1 hs1Var = this.N0;
        hs1Var.f6886h += i;
        int i11 = i + i10;
        hs1Var.f6885g += i11;
        this.f12699x1 += i11;
        int i12 = this.f12700y1 + i11;
        this.f12700y1 = i12;
        hs1Var.i = Math.max(i12, hs1Var.i);
    }

    public final void x0(long j10) {
        hs1 hs1Var = this.N0;
        hs1Var.f6888k += j10;
        hs1Var.f6889l++;
        this.D1 += j10;
        this.E1++;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final boolean y() {
        ww1 ww1Var = this.f13305n0;
        if (this.f12688m1 != null && ww1Var != null) {
            String str = ww1Var.f12352a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.y();
    }

    public final void y0(tw1 tw1Var, int i, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        tw1Var.x(i, j10);
        Trace.endSection();
        this.N0.e++;
        this.f12700y1 = 0;
        if (this.f12688m1 == null) {
            ir irVar = this.G1;
            boolean equals = irVar.equals(ir.f7193d);
            j6.s sVar = this.f12676a1;
            if (!equals && !irVar.equals(this.H1)) {
                this.H1 = irVar;
                sVar.o(irVar);
            }
            j1 j1Var = this.f12678c1;
            int i10 = j1Var.f7275d;
            j1Var.f7275d = 3;
            j1Var.f7278h.getClass();
            j1Var.f7276f = bq0.u(SystemClock.elapsedRealtime());
            if (i10 != 3 && (surface = this.f12692q1) != null) {
                Handler handler = (Handler) sVar.f18981v;
                if (handler != null) {
                    handler.post(new t1(sVar, surface, SystemClock.elapsedRealtime()));
                }
                this.f12695t1 = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final boolean z() {
        boolean z3;
        mw1 mw1Var = this.f13301h0;
        long j10 = this.L;
        if (j10 != -9223372036854775807L) {
            if (this.T0 + 1 + j10 <= Long.MAX_VALUE - (this.O0.f12995c + j10)) {
                z3 = false;
                if (this.A1 != null && !this.C1 && ((mw1Var == null || mw1Var.f8461q <= 0) && !z3 && this.O0.f12997f == -9223372036854775807L)) {
                    return false;
                }
                return true;
            }
        }
        z3 = true;
        if (this.A1 != null) {
            return false;
        }
        return true;
    }

    public final boolean z0(long j10, long j11, boolean z3, boolean z9) {
        if (this.f12688m1 != null && this.Z0) {
            j11 -= -this.L1;
        }
        if (j10 < -500000 && !z3) {
            sy1 sy1Var = this.C;
            sy1Var.getClass();
            int a10 = sy1Var.a(j11 - this.E);
            if (a10 != 0) {
                this.B1 = j11;
                Iterator it = this.f12684i1.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((Long) it.next()).longValue() >= this.F) {
                        i++;
                    }
                }
                hs1 hs1Var = this.N0;
                if (z9) {
                    int i10 = hs1Var.f6883d + a10;
                    hs1Var.f6884f += this.f12701z1;
                    hs1Var.f6883d = i10 + i;
                } else {
                    hs1Var.f6887j++;
                    w0(a10 + i, this.f12701z1);
                }
                if (this.f13300g0 != null) {
                    if (y()) {
                        x();
                        v();
                    } else if (z()) {
                        t();
                    } else {
                        this.S0 = true;
                    }
                }
                y1 y1Var = this.f12688m1;
                if (y1Var != null) {
                    y1Var.p0(false);
                }
                return true;
            }
        }
        return false;
    }
}
