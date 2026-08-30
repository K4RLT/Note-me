package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class zw1 implements wt1 {
    public static final byte[] X0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public s6 A;
    public boolean A0;
    public int B;
    public boolean B0;
    public sy1 C;
    public int C0;
    public mw1[] D;
    public int D0;
    public long E;
    public int E0;
    public long F;
    public boolean F0;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public long I0;
    public long J0;
    public yx1 K;
    public boolean K0;
    public boolean L0;
    public p M;
    public boolean M0;
    public final Context N;
    public hs1 N0;
    public final rl O;
    public yw1 O0;
    public final bx1 P;
    public long P0;
    public final es1 Q;
    public boolean Q0;
    public final es1 R;
    public boolean R0;
    public final es1 S;
    public boolean S0;
    public final rw1 T;
    public long T0;
    public final MediaCodec.BufferInfo U;
    public final gs1 U0;
    public final ArrayDeque V;
    public gs1 V0;
    public final q5 W;
    public final e61 W0;
    public final AtomicInteger X;
    public mw1 Y;
    public mw1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public zq0 f13294a0;

    /* renamed from: b0, reason: collision with root package name */
    public zq0 f13295b0;

    /* renamed from: c0, reason: collision with root package name */
    public zs1 f13296c0;

    /* renamed from: d0, reason: collision with root package name */
    public final long f13297d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f13298e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f13299f0;

    /* renamed from: g0, reason: collision with root package name */
    public tw1 f13300g0;

    /* renamed from: h0, reason: collision with root package name */
    public mw1 f13301h0;

    /* renamed from: i0, reason: collision with root package name */
    public MediaFormat f13302i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f13303j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f13304k0;
    public ArrayDeque l0;
    public xw1 m0;

    /* renamed from: n0, reason: collision with root package name */
    public ww1 f13305n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f13306o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f13307p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f13308q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f13309r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f13310s0;

    /* renamed from: t0, reason: collision with root package name */
    public long f13311t0;

    /* renamed from: u0, reason: collision with root package name */
    public long f13313u0;

    /* renamed from: v, reason: collision with root package name */
    public final int f13314v;

    /* renamed from: v0, reason: collision with root package name */
    public int f13315v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f13317w0;

    /* renamed from: x, reason: collision with root package name */
    public au1 f13318x;

    /* renamed from: x0, reason: collision with root package name */
    public ByteBuffer f13319x0;

    /* renamed from: y, reason: collision with root package name */
    public int f13320y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f13321y0;

    /* renamed from: z, reason: collision with root package name */
    public tu1 f13322z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f13323z0;

    /* renamed from: u, reason: collision with root package name */
    public final Object f13312u = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final i0.m f13316w = new i0.m(10);
    public long G = Long.MIN_VALUE;
    public uh J = uh.f11636a;
    public long L = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v11, types: [com.google.android.gms.internal.ads.hs1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.android.gms.internal.ads.es1, com.google.android.gms.internal.ads.rw1] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.q5, java.lang.Object] */
    public zw1(Context context, int i, rl rlVar, bx1 bx1Var) {
        this.f13314v = i;
        this.N = context.getApplicationContext();
        this.O = rlVar;
        bx1Var.getClass();
        this.P = bx1Var;
        this.X = new AtomicInteger();
        this.Q = new es1(0);
        this.R = new es1(0);
        this.S = new es1(2);
        ?? es1Var = new es1(2);
        es1Var.f10327j = 32;
        this.T = es1Var;
        this.U = new MediaCodec.BufferInfo();
        this.f13298e0 = 1.0f;
        this.f13299f0 = 1.0f;
        this.f13297d0 = -9223372036854775807L;
        this.V = new ArrayDeque();
        this.O0 = yw1.f12992g;
        es1Var.d(0);
        es1Var.f5767d.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f9753w = t10.f11228a;
        obj.f9752v = 0;
        obj.f9751u = 2;
        this.W = obj;
        this.f13304k0 = -1.0f;
        this.f13306o0 = 0;
        this.C0 = 0;
        this.f13315v0 = -1;
        this.f13317w0 = -1;
        this.f13313u0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.f13311t0 = -9223372036854775807L;
        this.D0 = 0;
        this.E0 = 0;
        this.N0 = new Object();
        this.S0 = false;
        this.T0 = 0L;
        int i10 = j51.f7334w;
        this.W0 = e61.D;
        gs1 gs1Var = gs1.f6444b;
        this.U0 = gs1Var;
        this.V0 = gs1Var;
    }

    public static boolean K(int i, boolean z3) {
        int i10 = i & 7;
        if (i10 != 4) {
            if (!z3 || i10 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void A() {
        this.f13315v0 = -1;
        this.R.f5767d = null;
        this.f13317w0 = -1;
        this.f13319x0 = null;
        this.I0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        n0().f12997f = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.f13313u0 = -9223372036854775807L;
        this.G0 = false;
        this.f13311t0 = -9223372036854775807L;
        this.F0 = false;
        this.f13308q0 = false;
        this.f13309r0 = false;
        this.D0 = 0;
        this.E0 = 0;
        this.C0 = this.B0 ? 1 : 0;
        this.S0 = false;
        this.T0 = 0L;
    }

    public final void B() {
        A();
        this.l0 = null;
        this.f13305n0 = null;
        this.f13301h0 = null;
        this.f13302i0 = null;
        this.f13303j0 = false;
        this.H0 = false;
        this.f13304k0 = -1.0f;
        this.f13306o0 = 0;
        this.f13307p0 = false;
        this.f13310s0 = false;
        this.B0 = false;
        this.C0 = 0;
    }

    public vw1 C(IllegalStateException illegalStateException, ww1 ww1Var) {
        return new vw1(illegalStateException, ww1Var);
    }

    public void E(es1 es1Var) {
    }

    public int F(es1 es1Var) {
        return 0;
    }

    public boolean G(es1 es1Var) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0507, code lost:
    
        if (r36.f13310s0 != false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0509, code lost:
    
        r36.G0 = true;
        r8.v(r36.f13315v0, 0, 4, 0);
        r36.f13315v0 = r3;
        r14.f5767d = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x051c, code lost:
    
        r36.D0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0416, code lost:
    
        if (r36.Z != null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x01ff, code lost:
    
        r36.f13323z0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x008d, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0692 A[Catch: IllegalStateException -> 0x054b, CryptoException -> 0x054e, TryCatch #14 {CryptoException -> 0x054e, IllegalStateException -> 0x054b, blocks: (B:98:0x0760, B:97:0x0737, B:85:0x0524, B:87:0x052a, B:90:0x071a, B:102:0x0551, B:103:0x0552, B:106:0x0558, B:108:0x055c, B:110:0x0564, B:112:0x0572, B:114:0x0578, B:116:0x0579, B:118:0x057c, B:119:0x057d, B:121:0x0581, B:123:0x058b, B:126:0x058e, B:127:0x0594, B:200:0x059d, B:202:0x05a3, B:131:0x05b4, B:133:0x05b8, B:134:0x05bd, B:136:0x05ca, B:190:0x05d0, B:192:0x05e0, B:193:0x05e5, B:195:0x05eb, B:196:0x05f0, B:198:0x05f4, B:138:0x0605, B:140:0x0609, B:142:0x060f, B:144:0x0616, B:145:0x0619, B:147:0x0621, B:149:0x0627, B:150:0x062c, B:152:0x0630, B:154:0x063a, B:156:0x0643, B:157:0x0644, B:159:0x0654, B:161:0x066a, B:163:0x0670, B:166:0x067b, B:167:0x0687, B:169:0x0692, B:170:0x0695, B:172:0x0699, B:174:0x06a1, B:175:0x06ab, B:176:0x06b4, B:179:0x06c3, B:180:0x06e9, B:181:0x06d6, B:183:0x06e2, B:185:0x06f9, B:188:0x0662, B:206:0x070d, B:211:0x0736, B:251:0x073d, B:260:0x0742, B:365:0x0746, B:366:0x0747), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0699 A[Catch: IllegalStateException -> 0x054b, CryptoException -> 0x054e, TryCatch #14 {CryptoException -> 0x054e, IllegalStateException -> 0x054b, blocks: (B:98:0x0760, B:97:0x0737, B:85:0x0524, B:87:0x052a, B:90:0x071a, B:102:0x0551, B:103:0x0552, B:106:0x0558, B:108:0x055c, B:110:0x0564, B:112:0x0572, B:114:0x0578, B:116:0x0579, B:118:0x057c, B:119:0x057d, B:121:0x0581, B:123:0x058b, B:126:0x058e, B:127:0x0594, B:200:0x059d, B:202:0x05a3, B:131:0x05b4, B:133:0x05b8, B:134:0x05bd, B:136:0x05ca, B:190:0x05d0, B:192:0x05e0, B:193:0x05e5, B:195:0x05eb, B:196:0x05f0, B:198:0x05f4, B:138:0x0605, B:140:0x0609, B:142:0x060f, B:144:0x0616, B:145:0x0619, B:147:0x0621, B:149:0x0627, B:150:0x062c, B:152:0x0630, B:154:0x063a, B:156:0x0643, B:157:0x0644, B:159:0x0654, B:161:0x066a, B:163:0x0670, B:166:0x067b, B:167:0x0687, B:169:0x0692, B:170:0x0695, B:172:0x0699, B:174:0x06a1, B:175:0x06ab, B:176:0x06b4, B:179:0x06c3, B:180:0x06e9, B:181:0x06d6, B:183:0x06e2, B:185:0x06f9, B:188:0x0662, B:206:0x070d, B:211:0x0736, B:251:0x073d, B:260:0x0742, B:365:0x0746, B:366:0x0747), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x06c3 A[Catch: IllegalStateException -> 0x054b, CryptoException -> 0x054e, TRY_ENTER, TryCatch #14 {CryptoException -> 0x054e, IllegalStateException -> 0x054b, blocks: (B:98:0x0760, B:97:0x0737, B:85:0x0524, B:87:0x052a, B:90:0x071a, B:102:0x0551, B:103:0x0552, B:106:0x0558, B:108:0x055c, B:110:0x0564, B:112:0x0572, B:114:0x0578, B:116:0x0579, B:118:0x057c, B:119:0x057d, B:121:0x0581, B:123:0x058b, B:126:0x058e, B:127:0x0594, B:200:0x059d, B:202:0x05a3, B:131:0x05b4, B:133:0x05b8, B:134:0x05bd, B:136:0x05ca, B:190:0x05d0, B:192:0x05e0, B:193:0x05e5, B:195:0x05eb, B:196:0x05f0, B:198:0x05f4, B:138:0x0605, B:140:0x0609, B:142:0x060f, B:144:0x0616, B:145:0x0619, B:147:0x0621, B:149:0x0627, B:150:0x062c, B:152:0x0630, B:154:0x063a, B:156:0x0643, B:157:0x0644, B:159:0x0654, B:161:0x066a, B:163:0x0670, B:166:0x067b, B:167:0x0687, B:169:0x0692, B:170:0x0695, B:172:0x0699, B:174:0x06a1, B:175:0x06ab, B:176:0x06b4, B:179:0x06c3, B:180:0x06e9, B:181:0x06d6, B:183:0x06e2, B:185:0x06f9, B:188:0x0662, B:206:0x070d, B:211:0x0736, B:251:0x073d, B:260:0x0742, B:365:0x0746, B:366:0x0747), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06d6 A[Catch: IllegalStateException -> 0x054b, CryptoException -> 0x054e, TryCatch #14 {CryptoException -> 0x054e, IllegalStateException -> 0x054b, blocks: (B:98:0x0760, B:97:0x0737, B:85:0x0524, B:87:0x052a, B:90:0x071a, B:102:0x0551, B:103:0x0552, B:106:0x0558, B:108:0x055c, B:110:0x0564, B:112:0x0572, B:114:0x0578, B:116:0x0579, B:118:0x057c, B:119:0x057d, B:121:0x0581, B:123:0x058b, B:126:0x058e, B:127:0x0594, B:200:0x059d, B:202:0x05a3, B:131:0x05b4, B:133:0x05b8, B:134:0x05bd, B:136:0x05ca, B:190:0x05d0, B:192:0x05e0, B:193:0x05e5, B:195:0x05eb, B:196:0x05f0, B:198:0x05f4, B:138:0x0605, B:140:0x0609, B:142:0x060f, B:144:0x0616, B:145:0x0619, B:147:0x0621, B:149:0x0627, B:150:0x062c, B:152:0x0630, B:154:0x063a, B:156:0x0643, B:157:0x0644, B:159:0x0654, B:161:0x066a, B:163:0x0670, B:166:0x067b, B:167:0x0687, B:169:0x0692, B:170:0x0695, B:172:0x0699, B:174:0x06a1, B:175:0x06ab, B:176:0x06b4, B:179:0x06c3, B:180:0x06e9, B:181:0x06d6, B:183:0x06e2, B:185:0x06f9, B:188:0x0662, B:206:0x070d, B:211:0x0736, B:251:0x073d, B:260:0x0742, B:365:0x0746, B:366:0x0747), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0159 A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TRY_ENTER, TryCatch #1 {IllegalStateException -> 0x00b1, blocks: (B:398:0x0222, B:386:0x00ae, B:387:0x00c1, B:389:0x00c5, B:394:0x00d4, B:399:0x00e4, B:400:0x00f3, B:470:0x0100, B:472:0x0106, B:446:0x020a, B:448:0x0210, B:449:0x0213, B:451:0x0219, B:453:0x021d, B:404:0x0116, B:467:0x011d, B:406:0x012b, B:408:0x013b, B:411:0x014a, B:412:0x0153, B:415:0x0159, B:417:0x015d, B:419:0x0167, B:421:0x0171, B:422:0x0199, B:424:0x01a1, B:425:0x01a2, B:427:0x01a9, B:429:0x01b1, B:431:0x01b9, B:432:0x01c0, B:436:0x01d1, B:437:0x01dd, B:440:0x01f4, B:445:0x01ff, B:460:0x01e4, B:475:0x0202, B:18:0x0237, B:20:0x0241, B:21:0x0251, B:23:0x0255, B:268:0x0271, B:270:0x0277, B:272:0x027f, B:274:0x0289, B:276:0x0291, B:278:0x029d, B:280:0x02a3, B:282:0x02ad, B:283:0x02b8, B:285:0x02c2, B:287:0x02d0, B:297:0x02e6, B:299:0x02ec, B:300:0x02f0, B:301:0x0306, B:302:0x0310, B:303:0x031e, B:304:0x032c, B:307:0x033a, B:309:0x0349, B:310:0x034e, B:313:0x035d, B:315:0x035e, B:317:0x0364, B:319:0x0368, B:321:0x036c, B:322:0x036f, B:324:0x0375, B:326:0x0385), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x01fb A[LOOP:5: B:400:0x00f3->B:442:0x01fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x01e4 A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #1 {IllegalStateException -> 0x00b1, blocks: (B:398:0x0222, B:386:0x00ae, B:387:0x00c1, B:389:0x00c5, B:394:0x00d4, B:399:0x00e4, B:400:0x00f3, B:470:0x0100, B:472:0x0106, B:446:0x020a, B:448:0x0210, B:449:0x0213, B:451:0x0219, B:453:0x021d, B:404:0x0116, B:467:0x011d, B:406:0x012b, B:408:0x013b, B:411:0x014a, B:412:0x0153, B:415:0x0159, B:417:0x015d, B:419:0x0167, B:421:0x0171, B:422:0x0199, B:424:0x01a1, B:425:0x01a2, B:427:0x01a9, B:429:0x01b1, B:431:0x01b9, B:432:0x01c0, B:436:0x01d1, B:437:0x01dd, B:440:0x01f4, B:445:0x01ff, B:460:0x01e4, B:475:0x0202, B:18:0x0237, B:20:0x0241, B:21:0x0251, B:23:0x0255, B:268:0x0271, B:270:0x0277, B:272:0x027f, B:274:0x0289, B:276:0x0291, B:278:0x029d, B:280:0x02a3, B:282:0x02ad, B:283:0x02b8, B:285:0x02c2, B:287:0x02d0, B:297:0x02e6, B:299:0x02ec, B:300:0x02f0, B:301:0x0306, B:302:0x0310, B:303:0x031e, B:304:0x032c, B:307:0x033a, B:309:0x0349, B:310:0x034e, B:313:0x035d, B:315:0x035e, B:317:0x0364, B:319:0x0368, B:321:0x036c, B:322:0x036f, B:324:0x0375, B:326:0x0385), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04a7 A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0089, TryCatch #0 {CryptoException -> 0x0012, blocks: (B:3:0x0005, B:5:0x0009, B:8:0x0016, B:10:0x001b, B:14:0x0023, B:372:0x0049, B:374:0x006a, B:376:0x007f, B:479:0x009c, B:490:0x0091, B:56:0x04a7, B:65:0x04cc, B:67:0x04d5, B:69:0x04d9, B:71:0x04de, B:73:0x04e6, B:75:0x04ea, B:77:0x04f2, B:78:0x0500, B:237:0x0505, B:239:0x0509, B:240:0x051c, B:82:0x051f, B:42:0x046e, B:44:0x0474, B:48:0x0486, B:51:0x048c, B:52:0x0497, B:254:0x049f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04bd A[LOOP:0: B:21:0x0251->B:61:0x04bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x071a A[Catch: IllegalStateException -> 0x054b, CryptoException -> 0x054e, TryCatch #14 {CryptoException -> 0x054e, IllegalStateException -> 0x054b, blocks: (B:98:0x0760, B:97:0x0737, B:85:0x0524, B:87:0x052a, B:90:0x071a, B:102:0x0551, B:103:0x0552, B:106:0x0558, B:108:0x055c, B:110:0x0564, B:112:0x0572, B:114:0x0578, B:116:0x0579, B:118:0x057c, B:119:0x057d, B:121:0x0581, B:123:0x058b, B:126:0x058e, B:127:0x0594, B:200:0x059d, B:202:0x05a3, B:131:0x05b4, B:133:0x05b8, B:134:0x05bd, B:136:0x05ca, B:190:0x05d0, B:192:0x05e0, B:193:0x05e5, B:195:0x05eb, B:196:0x05f0, B:198:0x05f4, B:138:0x0605, B:140:0x0609, B:142:0x060f, B:144:0x0616, B:145:0x0619, B:147:0x0621, B:149:0x0627, B:150:0x062c, B:152:0x0630, B:154:0x063a, B:156:0x0643, B:157:0x0644, B:159:0x0654, B:161:0x066a, B:163:0x0670, B:166:0x067b, B:167:0x0687, B:169:0x0692, B:170:0x0695, B:172:0x0699, B:174:0x06a1, B:175:0x06ab, B:176:0x06b4, B:179:0x06c3, B:180:0x06e9, B:181:0x06d6, B:183:0x06e2, B:185:0x06f9, B:188:0x0662, B:206:0x070d, B:211:0x0736, B:251:0x073d, B:260:0x0742, B:365:0x0746, B:366:0x0747), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x072f A[LOOP:1: B:65:0x04cc->B:95:0x072f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0737 A[EDGE_INSN: B:96:0x0737->B:97:0x0737 BREAK  A[LOOP:1: B:65:0x04cc->B:95:0x072f], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Throwable, java.lang.Object, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Throwable, android.media.MediaFormat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r36v0, types: [com.google.android.gms.internal.ads.zw1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H(long r37, long r39) {
        /*
            Method dump skipped, instructions count: 1982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zw1.H(long, long):void");
    }

    public abstract boolean I();

    public abstract boolean J();

    public final int L(mw1 mw1Var) {
        try {
            return M(this.P, mw1Var);
        } catch (dx1 e) {
            throw n(e, mw1Var, false, 4002);
        }
    }

    public abstract int M(bx1 bx1Var, mw1 mw1Var);

    public final void N(long j10, boolean z3, boolean z9) {
        this.H = false;
        this.F = j10;
        this.G = j10;
        if (!z9) {
            sy1 sy1Var = this.C;
            sy1Var.getClass();
            if (sy1Var.a(j10 - this.E) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        c(j10, z3, z9);
    }

    public abstract ArrayList O(bx1 bx1Var, mw1 mw1Var);

    public final void P() {
        yx1 yx1Var;
        int e;
        if (!this.J.g() && (yx1Var = this.K) != null && (e = this.J.e(yx1Var.f13003a)) != -1) {
            qg d2 = this.J.d(e, new qg(), false);
            this.L = d2.f9842d;
            int i = yx1Var.f13004b;
            if (i != -1) {
                this.L = d2.f9843f.a(i).e[yx1Var.f13005c];
                return;
            }
            int i10 = yx1Var.e;
            if (i10 != -1) {
                d2.f9843f.a(i10).getClass();
                this.L = 0L;
                return;
            }
            return;
        }
        this.L = -9223372036854775807L;
    }

    public boolean Q(mw1 mw1Var) {
        return false;
    }

    public abstract p8 R(ww1 ww1Var, mw1 mw1Var, float f10);

    public abstract is1 S(ww1 ww1Var, mw1 mw1Var, mw1 mw1Var2, boolean z3);

    public long T(long j10) {
        if (this.B == 1) {
            if (I() || J()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public abstract float U(float f10, mw1 mw1Var, mw1[] mw1VarArr);

    public abstract void V(long j10, long j11, String str);

    public abstract void W(String str);

    public abstract void X(Exception exc);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (java.util.Objects.equals(r2, "video/av01") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        if (k0() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00eb, code lost:
    
        if (k0() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f9, code lost:
    
        if (k0() == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.is1 Y(i0.m r14) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zw1.Y(i0.m):com.google.android.gms.internal.ads.is1");
    }

    public abstract void Z(mw1 mw1Var, MediaFormat mediaFormat);

    public abstract void a0();

    public abstract boolean b0(long j10, long j11, tw1 tw1Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j12, boolean z3, boolean z9, mw1 mw1Var);

    public void c(long j10, boolean z3, boolean z9) {
        ArrayDeque arrayDeque = this.V;
        if (!arrayDeque.isEmpty()) {
            this.O0 = (yw1) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (!z9) {
            return;
        }
        this.K0 = false;
        this.L0 = false;
        if (this.f13321y0) {
            g0();
        } else if (this.f13300g0 != null) {
            if (y()) {
                x();
                v();
            } else if (z()) {
                t();
            } else {
                this.S0 = true;
            }
        }
        if (this.O0.f12996d.s() > 0) {
            this.M0 = true;
        }
        l3 l3Var = this.O0.f12996d;
        synchronized (l3Var) {
            l3Var.f7925b = 0;
            l3Var.f7926c = 0;
            Arrays.fill((Object[]) l3Var.e, (Object) null);
        }
        this.O0.e = false;
    }

    public abstract void c0(gs1 gs1Var);

    public abstract void d0();

    public void e0(long j10) {
    }

    public abstract void f0(es1 es1Var);

    public abstract void g();

    public final void g0() {
        this.I0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        n0().f12997f = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.A0 = false;
        this.T.a();
        this.S.a();
        this.f13323z0 = false;
        q5 q5Var = this.W;
        q5Var.getClass();
        q5Var.f9753w = t10.f11228a;
        q5Var.f9752v = 0;
        q5Var.f9751u = 2;
    }

    public abstract void h();

    public void h0(long j10) {
        this.P0 = Math.max(j10, this.P0);
        while (true) {
            ArrayDeque arrayDeque = this.V;
            if (!arrayDeque.isEmpty() && j10 >= ((yw1) arrayDeque.peek()).f12993a) {
                yw1 yw1Var = (yw1) arrayDeque.poll();
                yw1Var.getClass();
                m0(yw1Var);
                a0();
            } else {
                return;
            }
        }
    }

    public void i() {
        this.Y = null;
        m0(yw1.f12992g);
        this.V.clear();
        if (this.f13321y0) {
            this.f13321y0 = false;
            g0();
        } else if (this.f13300g0 != null) {
            if (y()) {
                x();
            } else if (z()) {
                t();
            } else {
                this.S0 = true;
            }
        }
    }

    public final void i0(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.U0.f6445a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    public abstract void j();

    public final void j0(mw1 mw1Var) {
        if (this.f13300g0 != null && this.E0 != 3 && this.B != 0) {
            float f10 = this.f13299f0;
            mw1Var.getClass();
            mw1[] mw1VarArr = this.D;
            mw1VarArr.getClass();
            float U = U(f10, mw1Var, mw1VarArr);
            float f11 = this.f13304k0;
            if (f11 != U && U != -1.0f) {
                if (f11 != -1.0f || U > 0.0f) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", U);
                    tw1 tw1Var = this.f13300g0;
                    tw1Var.getClass();
                    tw1Var.j(bundle);
                    this.f13304k0 = U;
                }
            }
        }
    }

    public abstract void k();

    public final boolean k0() {
        if (this.F0) {
            this.D0 = 1;
            if (y()) {
                this.E0 = 3;
                return false;
            }
            this.E0 = 2;
            return true;
        }
        zq0 zq0Var = this.f13295b0;
        zq0Var.getClass();
        this.f13294a0 = zq0Var;
        this.D0 = 0;
        this.E0 = 0;
        return true;
    }

    public final void l() {
        this.f13318x.getClass();
    }

    public final void l0() {
        int i = this.E0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.L0 = true;
                    d0();
                    return;
                } else {
                    x();
                    v();
                    return;
                }
            }
            t();
            zq0 zq0Var = this.f13295b0;
            zq0Var.getClass();
            this.f13294a0 = zq0Var;
            this.D0 = 0;
            this.E0 = 0;
            return;
        }
        t();
    }

    public final long m() {
        return this.L;
    }

    public final void m0(yw1 yw1Var) {
        this.O0 = yw1Var;
        long j10 = yw1Var.f12995c;
        if (j10 != -9223372036854775807L) {
            this.Q0 = true;
            e0(j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.ns1 n(java.lang.Exception r12, com.google.android.gms.internal.ads.mw1 r13, boolean r14, int r15) {
        /*
            r11 = this;
            r0 = 4
            if (r13 == 0) goto L1a
            boolean r1 = r11.I
            if (r1 != 0) goto L1a
            r1 = 1
            r11.I = r1
            r1 = 0
            int r2 = r11.L(r13)     // Catch: java.lang.Throwable -> L14 com.google.android.gms.internal.ads.ns1 -> L18
            r2 = r2 & 7
            r11.I = r1
            goto L1b
        L14:
            r0 = move-exception
            r11.I = r1
            throw r0
        L18:
            r11.I = r1
        L1a:
            r2 = r0
        L1b:
            java.lang.String r5 = r11.p()
            int r6 = r11.f13320y
            com.google.android.gms.internal.ads.yx1 r9 = r11.K
            com.google.android.gms.internal.ads.ns1 r1 = new com.google.android.gms.internal.ads.ns1
            if (r13 != 0) goto L29
            r8 = r0
            goto L2a
        L29:
            r8 = r2
        L2a:
            r2 = 1
            r3 = r12
            r7 = r13
            r10 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zw1.n(java.lang.Exception, com.google.android.gms.internal.ads.mw1, boolean, int):com.google.android.gms.internal.ads.ns1");
    }

    public final yw1 n0() {
        ArrayDeque arrayDeque = this.V;
        if (!arrayDeque.isEmpty()) {
            return (yw1) arrayDeque.getLast();
        }
        return this.O0;
    }

    public final int o(i0.m mVar, es1 es1Var, int i) {
        sy1 sy1Var = this.C;
        sy1Var.getClass();
        int b10 = sy1Var.b(mVar, es1Var, i);
        if (b10 == -4) {
            int i10 = i & 1;
            if (es1Var.c(4)) {
                if (i10 == 0) {
                    this.G = Long.MIN_VALUE;
                }
                if (this.H) {
                    return -4;
                }
                return -3;
            }
            long j10 = es1Var.e + this.E;
            es1Var.e = j10;
            if (i10 == 0) {
                this.G = Math.max(this.G, j10);
                return -4;
            }
        } else if (b10 == -5) {
            mw1 mw1Var = (mw1) mVar.f18054v;
            mw1Var.getClass();
            long j11 = mw1Var.f8464t;
            if (j11 != Long.MAX_VALUE) {
                rv1 rv1Var = new rv1(mw1Var);
                rv1Var.f10312s = j11 + this.E;
                mVar.f18054v = new mw1(rv1Var);
                return -5;
            }
        }
        return b10;
    }

    public final boolean o0(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        mw1 mw1Var = this.Z;
        if (mw1Var != null && Objects.equals(mw1Var.f8459o, "audio/opus") && j10 - j11 <= 80000) {
            return false;
        }
        return true;
    }

    public abstract String p();

    public final void p0(mw1[] mw1VarArr, sy1 sy1Var, long j10, long j11, yx1 yx1Var) {
        b80.K(!this.H);
        this.C = sy1Var;
        this.K = yx1Var;
        P();
        if (this.G == Long.MIN_VALUE) {
            this.G = j10;
        }
        this.D = mw1VarArr;
        this.E = j11;
        v0(mw1VarArr, j10, j11, yx1Var);
    }

    public boolean q(long j10) {
        return false;
    }

    public final sy1 q0() {
        return this.C;
    }

    public void r(float f10, float f11) {
        this.f13298e0 = f10;
        this.f13299f0 = f11;
        j0(this.f13301h0);
    }

    public final boolean r0() {
        if (this.G == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public kt1 s0() {
        return null;
    }

    public final void t() {
        try {
            tw1 tw1Var = this.f13300g0;
            if (tw1Var != null) {
                tw1Var.i();
                return;
            }
            throw null;
        } finally {
            A();
        }
    }

    public final void t0() {
        synchronized (this.f13312u) {
            this.M = null;
        }
    }

    public final boolean u(int i) {
        i0.m mVar = this.f13316w;
        mVar.f18055w = null;
        mVar.f18054v = null;
        es1 es1Var = this.Q;
        es1Var.a();
        int o10 = o(mVar, es1Var, i | 4);
        if (o10 == -5) {
            Y(mVar);
            return true;
        }
        if (o10 == -4 && es1Var.c(4)) {
            this.K0 = true;
            l0();
            return false;
        }
        return false;
    }

    public abstract void u0(boolean z3, boolean z9);

    /* JADX WARN: Can't wrap try/catch for region: R(24:(5:56|57|58|59|e9)(1:202)|72|73|75|76|77|78|79|(0)|82|83|(15:85|87|(1:89)|95|96|97|(0)|172|102|(0)|(0)|165|171|108|(0)(0))|173|96|97|(0)|172|102|(0)|(0)|165|171|108|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(37:42|43|44|45|46|(1:48)|49|50|51|52|53|54|(5:56|57|58|59|e9)(1:202)|188|72|73|75|76|77|78|79|(0)|82|83|(15:85|87|(1:89)|95|96|97|(0)|172|102|(0)|(0)|165|171|108|(0)(0))|173|96|97|(0)|172|102|(0)|(0)|165|171|108|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x028d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x028e, code lost:
    
        r11 = r1;
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0286, code lost:
    
        r10 = r2;
        r11 = r11;
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0284, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0285, code lost:
    
        r11 = r1;
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x028b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x028c, code lost:
    
        r10 = r10;
        r11 = r11;
        r19 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01dd A[Catch: Exception -> 0x010e, TRY_ENTER, TryCatch #1 {Exception -> 0x010e, blocks: (B:71:0x0106, B:81:0x0166, B:85:0x0198, B:87:0x01a0, B:89:0x01aa, B:91:0x01b2, B:93:0x01ba, B:99:0x01cb, B:104:0x01dd, B:112:0x023f, B:116:0x025c, B:118:0x0262, B:120:0x0266, B:122:0x0271, B:153:0x01eb, B:155:0x01f3, B:157:0x01fb, B:159:0x0203, B:161:0x020b, B:163:0x0213, B:167:0x0225, B:169:0x022f, B:196:0x0124), top: B:70:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023b A[Catch: Exception -> 0x0284, TRY_LEAVE, TryCatch #13 {Exception -> 0x0284, blocks: (B:76:0x0152, B:79:0x015a, B:82:0x018f, B:96:0x01c5, B:102:0x01d7, B:108:0x0235, B:110:0x023b, B:113:0x024e, B:165:0x021b), top: B:75:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ec A[Catch: xw1 -> 0x0306, TryCatch #11 {xw1 -> 0x0306, blocks: (B:133:0x02ba, B:135:0x02ec, B:137:0x02f9, B:139:0x0303, B:140:0x031d, B:145:0x0325, B:146:0x0327, B:147:0x0308, B:218:0x032b, B:220:0x032c, B:223:0x0333, B:224:0x0334, B:225:0x033e, B:237:0x0341), top: B:25:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0303 A[Catch: xw1 -> 0x0306, TryCatch #11 {xw1 -> 0x0306, blocks: (B:133:0x02ba, B:135:0x02ec, B:137:0x02f9, B:139:0x0303, B:140:0x031d, B:145:0x0325, B:146:0x0327, B:147:0x0308, B:218:0x032b, B:220:0x032c, B:223:0x0333, B:224:0x0334, B:225:0x033e, B:237:0x0341), top: B:25:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0308 A[Catch: xw1 -> 0x0306, TryCatch #11 {xw1 -> 0x0306, blocks: (B:133:0x02ba, B:135:0x02ec, B:137:0x02f9, B:139:0x0303, B:140:0x031d, B:145:0x0325, B:146:0x0327, B:147:0x0308, B:218:0x032b, B:220:0x032c, B:223:0x0333, B:224:0x0334, B:225:0x033e, B:237:0x0341), top: B:25:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01eb A[Catch: Exception -> 0x010e, TryCatch #1 {Exception -> 0x010e, blocks: (B:71:0x0106, B:81:0x0166, B:85:0x0198, B:87:0x01a0, B:89:0x01aa, B:91:0x01b2, B:93:0x01ba, B:99:0x01cb, B:104:0x01dd, B:112:0x023f, B:116:0x025c, B:118:0x0262, B:120:0x0266, B:122:0x0271, B:153:0x01eb, B:155:0x01f3, B:157:0x01fb, B:159:0x0203, B:161:0x020b, B:163:0x0213, B:167:0x0225, B:169:0x022f, B:196:0x0124), top: B:70:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0166 A[Catch: Exception -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x010e, blocks: (B:71:0x0106, B:81:0x0166, B:85:0x0198, B:87:0x01a0, B:89:0x01aa, B:91:0x01b2, B:93:0x01ba, B:99:0x01cb, B:104:0x01dd, B:112:0x023f, B:116:0x025c, B:118:0x0262, B:120:0x0266, B:122:0x0271, B:153:0x01eb, B:155:0x01f3, B:157:0x01fb, B:159:0x0203, B:161:0x020b, B:163:0x0213, B:167:0x0225, B:169:0x022f, B:196:0x0124), top: B:70:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cb A[Catch: Exception -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x010e, blocks: (B:71:0x0106, B:81:0x0166, B:85:0x0198, B:87:0x01a0, B:89:0x01aa, B:91:0x01b2, B:93:0x01ba, B:99:0x01cb, B:104:0x01dd, B:112:0x023f, B:116:0x025c, B:118:0x0262, B:120:0x0266, B:122:0x0271, B:153:0x01eb, B:155:0x01f3, B:157:0x01fb, B:159:0x0203, B:161:0x020b, B:163:0x0213, B:167:0x0225, B:169:0x022f, B:196:0x0124), top: B:70:0x0106 }] */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zw1.v():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r4 >= r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v0(com.google.android.gms.internal.ads.mw1[] r12, long r13, long r15, com.google.android.gms.internal.ads.yx1 r17) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.sy1 r12 = r11.C
            r12.getClass()
            com.google.android.gms.internal.ads.yw1 r12 = r11.O0
            long r0 = r12.f12995c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L29
            com.google.android.gms.internal.ads.yw1 r4 = new com.google.android.gms.internal.ads.yw1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.m0(r4)
            boolean r12 = r11.R0
            if (r12 == 0) goto L5b
            r11.a0()
            return
        L29:
            java.util.ArrayDeque r12 = r11.V
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L5c
            long r0 = r11.I0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L41
            long r4 = r11.P0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L5c
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L5c
        L41:
            com.google.android.gms.internal.ads.yw1 r4 = new com.google.android.gms.internal.ads.yw1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.m0(r4)
            com.google.android.gms.internal.ads.yw1 r12 = r11.O0
            long r12 = r12.f12995c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L5b
            r11.a0()
        L5b:
            return
        L5c:
            com.google.android.gms.internal.ads.yw1 r0 = new com.google.android.gms.internal.ads.yw1
            long r1 = r11.I0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zw1.v0(com.google.android.gms.internal.ads.mw1[], long, long, com.google.android.gms.internal.ads.yx1):void");
    }

    public boolean w(ww1 ww1Var) {
        return true;
    }

    public final void x() {
        try {
            tw1 tw1Var = this.f13300g0;
            if (tw1Var != null) {
                tw1Var.h();
                this.N0.f6881b++;
                ww1 ww1Var = this.f13305n0;
                if (ww1Var != null) {
                    W(ww1Var.f12352a);
                } else {
                    throw null;
                }
            }
            this.f13300g0 = null;
            this.f13294a0 = null;
            B();
        } catch (Throwable th) {
            this.f13300g0 = null;
            this.f13294a0 = null;
            B();
            throw th;
        }
    }

    public boolean y() {
        int i = this.E0;
        if (i == 3 || (this.f13307p0 && !this.H0)) {
            return true;
        }
        if (i == 2) {
            try {
                zq0 zq0Var = this.f13295b0;
                zq0Var.getClass();
                this.f13294a0 = zq0Var;
                this.D0 = 0;
                this.E0 = 0;
            } catch (ns1 e) {
                x21.K("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    public boolean z() {
        return true;
    }

    public void s() {
    }

    public void D(mw1 mw1Var) {
    }
}
