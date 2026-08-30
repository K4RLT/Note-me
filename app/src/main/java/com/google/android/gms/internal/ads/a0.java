package com.google.android.gms.internal.ads;
import a0.d;
import a0.e;
import l4.a;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a0 implements as1 {
    public static final y51 H = d51.s(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final y51 I = d51.s(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final y51 J = d51.s(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final y51 K = d51.s(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final y51 L = d51.s(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final y51 M = d51.s(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static a0 N;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public String G;

    /* renamed from: u, reason: collision with root package name */
    public final Context f4293u;

    /* renamed from: v, reason: collision with root package name */
    public final d61 f4294v;

    /* renamed from: w, reason: collision with root package name */
    public final hx0 f4295w;

    /* renamed from: x, reason: collision with root package name */
    public final h0 f4296x;

    /* renamed from: y, reason: collision with root package name */
    public int f4297y;

    /* renamed from: z, reason: collision with root package name */
    public long f4298z;

    public a0(Context context, HashMap hashMap) {
        Context applicationContext;
        boolean z3;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f4293u = applicationContext;
        this.f4294v = d61.a(hashMap);
        this.f4295w = new hx0(1);
        this.f4296x = new h0();
        if (context != null) {
            ik0 a10 = ik0.a(context);
            int b10 = a10.b();
            this.F = b10;
            this.D = b(b10);
            z zVar = new z(this);
            Executor h3 = b80.h();
            CopyOnWriteArrayList copyOnWriteArrayList = a10.f7155b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                wi0 wi0Var = (wi0) it.next();
                if (wi0Var.f12247a.get() == null) {
                    copyOnWriteArrayList.remove(wi0Var);
                }
            }
            wi0 wi0Var2 = new wi0(a10, zVar, h3);
            synchronized (a10.f7156c) {
                a10.f7155b.add(wi0Var2);
                z3 = a10.e;
            }
            if (z3) {
                wi0Var2.f12248b.execute(new e40(17, wi0Var2));
                return;
            }
            return;
        }
        this.F = 0;
        this.D = 1000000L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0130, code lost:
    
        if (r3.equals("AQ") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x064f, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0148, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0b02, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x016e, code lost:
    
        if (r3.equals("GM") != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x047d, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0178, code lost:
    
        if (r3.equals("GL") != false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x07ef, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0182, code lost:
    
        if (r3.equals("GI") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0994, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01d2, code lost:
    
        if (r3.equals("FK") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x06a9, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0214, code lost:
    
        if (r3.equals("ER") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x023a, code lost:
    
        if (r3.equals("CX") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0c1a, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0244, code lost:
    
        if (r3.equals("CW") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x025c, code lost:
    
        if (r3.equals("CU") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x08dd, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0282, code lost:
    
        if (r3.equals("CM") != false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0745, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x028c, code lost:
    
        if (r3.equals("CL") != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x040f, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0296, code lost:
    
        if (r3.equals("CK") != false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0be2, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02a0, code lost:
    
        if (r3.equals("ZW") != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0521, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02c6, code lost:
    
        if (r3.equals("YT") != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x06c1, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x02d0, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x02e8, code lost:
    
        if (r3.equals("WS") != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06dd, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x02f2, code lost:
    
        if (r3.equals("WF") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x07ad, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02fc, code lost:
    
        if (r3.equals("VU") != false) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x08cf, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0330, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x033a, code lost:
    
        if (r3.equals("VC") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0344, code lost:
    
        if (r3.equals("VA") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0386, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0ad8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x03ac, code lost:
    
        if (r3.equals("TV") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03c4, code lost:
    
        if (r3.equals("TR") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0c0c, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03ea, code lost:
    
        if (r3.equals("TM") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x03f4, code lost:
    
        if (r3.equals("TL") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x03fe, code lost:
    
        if (r3.equals("TJ") != false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0a88, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0408, code lost:
    
        if (r3.equals("TH") != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0424, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0b2c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x043c, code lost:
    
        if (r3.equals("SZ") != false) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0bbd, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0446, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0450, code lost:
    
        if (r3.equals("SX") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0476, code lost:
    
        if (r3.equals("SS") != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x04ae, code lost:
    
        if (r3.equals("SM") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x04b8, code lost:
    
        if (r3.equals("SL") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0ba1, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x04d0, code lost:
    
        if (r3.equals("SJ") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x04da, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0b1e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x04e4, code lost:
    
        if (r3.equals("SH") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x04fc, code lost:
    
        if (r3.equals("SE") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0506, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0510, code lost:
    
        if (r3.equals("SC") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r3.equals("CI") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x051a, code lost:
    
        if (r3.equals("SB") != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0baf, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x058a, code lost:
    
        if (r3.equals("PY") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05a2, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05c8, code lost:
    
        if (r3.equals("PM") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x05fc, code lost:
    
        if (r3.equals("PG") != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x083b, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0622, code lost:
    
        if (r3.equals("PA") != false) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0c36, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0648, code lost:
    
        if (r3.equals("NU") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0656, code lost:
    
        if (r3.equals("NR") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007c, code lost:
    
        if (r3.equals("CG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x068a, code lost:
    
        if (r3.equals("NI") != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0abc, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x06a2, code lost:
    
        if (r3.equals("NF") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0a5e, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x06b0, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x06ba, code lost:
    
        if (r3.equals("NC") != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x06d6, code lost:
    
        if (r3.equals("MZ") != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x072a, code lost:
    
        if (r3.equals("MT") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0734, code lost:
    
        if (r3.equals("MS") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x073e, code lost:
    
        if (r3.equals("MR") != false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x075a, code lost:
    
        if (r3.equals("MP") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0784, code lost:
    
        if (r3.equals("MM") != false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0853, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x078e, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0aca, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x07a6, code lost:
    
        if (r3.equals("MH") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x07b4, code lost:
    
        if (r3.equals("MG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x07e8, code lost:
    
        if (r3.equals("MC") != false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0804, code lost:
    
        if (r3.equals("LY") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x080e, code lost:
    
        if (r3.equals("LV") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0834, code lost:
    
        if (r3.equals("LS") != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0842, code lost:
    
        if (r3.equals("LR") != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0a96, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x084c, code lost:
    
        if (r3.equals("LK") != false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x085a, code lost:
    
        if (r3.equals("LI") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x089c, code lost:
    
        if (r3.equals("KY") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x08a6, code lost:
    
        if (r3.equals("KW") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x09e0, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x08be, code lost:
    
        if (r3.equals("KN") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x08c8, code lost:
    
        if (r3.equals("KM") != false) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x08d6, code lost:
    
        if (r3.equals("KI") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x091c, code lost:
    
        if (r3.equals("JO") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0934, code lost:
    
        if (r3.equals("JE") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x094b, code lost:
    
        if (r3.equals("IS") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x098d, code lost:
    
        if (r3.equals("IM") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x09c5, code lost:
    
        if (r3.equals("HU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00be, code lost:
    
        if (r3.equals("BQ") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x09cf, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x09d9, code lost:
    
        if (r3.equals("HR") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0bfe, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x0a57, code lost:
    
        if (r3.equals("EG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x0a65, code lost:
    
        if (r3.equals("EE") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x0a81, code lost:
    
        if (r3.equals("DZ") != false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0a8f, code lost:
    
        if (r3.equals("DO") != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0a9d, code lost:
    
        if (r3.equals("DM") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x0ab5, code lost:
    
        if (r3.equals("CR") != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x0ac3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x0ad1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0afb, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x0b17, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x0b25, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x0b4f, code lost:
    
        if (r3.equals("AZ") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x0b66, code lost:
    
        if (r3.equals("AI") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0b9a, code lost:
    
        if (r3.equals("DJ") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x0ba8, code lost:
    
        if (r3.equals("AG") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0bb6, code lost:
    
        if (r3.equals("AF") != false) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0bd2, code lost:
    
        if (r3.equals("AD") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0bdb, code lost:
    
        if (r3.equals("BZ") != false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0bf7, code lost:
    
        if (r3.equals("BB") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0c05, code lost:
    
        if (r3.equals("BA") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0c13, code lost:
    
        if (r3.equals("AX") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0c2f, code lost:
    
        if (r3.equals("AM") != false) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f2, code lost:
    
        if (r3.equals("BL") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0761, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x010a, code lost:
    
        if (r3.equals("AT") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0a6c, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x003b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x003e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0041. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0044. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0047. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x004a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0053. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0056. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0059. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] d(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a0.d(java.lang.String):int[]");
    }

    public final void a(long j10, int i, final long j11) {
        final long j12;
        final int i10;
        if (i == 0) {
            if (j10 == 0) {
                if (j11 != this.E) {
                    j12 = 0;
                } else {
                    return;
                }
            } else {
                j12 = j10;
            }
            i10 = 0;
        } else {
            j12 = j10;
            i10 = i;
        }
        this.E = j11;
        Iterator it = ((CopyOnWriteArrayList) this.f4295w.f6914v).iterator();
        while (it.hasNext()) {
            final y yVar = (y) it.next();
            if (!yVar.f12675c) {
                yVar.f12673a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object next;
                        Object obj;
                        yx1 yx1Var;
                        ku1 ku1Var = y.this.f12674b;
                        k60 k60Var = ku1Var.f7884d;
                        if (((d51) k60Var.f7667b).isEmpty()) {
                            yx1Var = null;
                        } else {
                            List list = (d51) k60Var.f7667b;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    obj = list.get(list.size() - 1);
                                } else {
                                    l4.a.c();
                                    return;
                                }
                            } else if (list instanceof SortedSet) {
                                obj = ((SortedSet) list).last();
                            } else {
                                b51 listIterator = list.listIterator(0);
                                do {
                                    next = listIterator.next();
                                } while (listIterator.hasNext());
                                obj = next;
                            }
                            yx1Var = (yx1) obj;
                        }
                        gu1 t3 = ku1Var.t(yx1Var);
                        ku1Var.p(t3, 1006, new r7(t3, i10, j12, j11));
                    }
                });
            }
        }
    }

    public final long b(int i) {
        long longValue;
        Integer valueOf = Integer.valueOf(i);
        d61 d61Var = this.f4294v;
        Long l10 = (Long) d61Var.get(valueOf);
        if (l10 == null) {
            l10 = (Long) d61Var.get(0);
        } else if (l10.longValue() == -9223372036854775807L) {
            String str = this.G;
            if (str == null) {
                str = "";
            }
            int[] d2 = d(str);
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 7) {
                                if (i != 9) {
                                    if (i != 10) {
                                        longValue = 1000000;
                                    } else {
                                        longValue = ((Long) L.get(d2[4])).longValue();
                                    }
                                } else {
                                    longValue = ((Long) M.get(d2[5])).longValue();
                                }
                            }
                        } else {
                            longValue = ((Long) K.get(d2[3])).longValue();
                        }
                    } else {
                        longValue = ((Long) J.get(d2[2])).longValue();
                    }
                } else {
                    longValue = ((Long) I.get(d2[1])).longValue();
                }
                l10 = Long.valueOf(longValue);
            }
            longValue = ((Long) H.get(d2[0])).longValue();
            l10 = Long.valueOf(longValue);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    @Override // com.google.android.gms.internal.ads.as1
    public final synchronized void c(qb1 qb1Var, dj1 dj1Var, boolean z3) {
        boolean z9;
        if (z3) {
            dj1Var.getClass();
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        if (this.f4297y == 0) {
            this.f4298z = SystemClock.elapsedRealtime();
        }
        this.f4297y++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r10.C >= 524288) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.as1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(com.google.android.gms.internal.ads.dj1 r11, boolean r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto Lf
            r11.getClass()     // Catch: java.lang.Throwable -> La
            r11 = r1
            goto L10
        La:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7b
        Lf:
            r11 = r0
        L10:
            if (r11 != 0) goto L14
            monitor-exit(r10)
            return
        L14:
            int r11 = r10.f4297y     // Catch: java.lang.Throwable -> L6f
            if (r11 <= 0) goto L19
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.b80.K(r0)     // Catch: java.lang.Throwable -> L6f
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6f
            long r0 = r10.f4298z     // Catch: java.lang.Throwable -> L6f
            long r0 = r11 - r0
            long r2 = r10.B     // Catch: java.lang.Throwable -> L6f
            int r7 = (int) r0     // Catch: java.lang.Throwable -> L6f
            long r0 = (long) r7     // Catch: java.lang.Throwable -> L6f
            long r2 = r2 + r0
            r10.B = r2     // Catch: java.lang.Throwable -> L6f
            long r0 = r10.C     // Catch: java.lang.Throwable -> L6f
            long r2 = r10.A     // Catch: java.lang.Throwable -> L6f
            long r0 = r0 + r2
            r10.C = r0     // Catch: java.lang.Throwable -> L6f
            if (r7 <= 0) goto L72
            float r0 = (float) r2     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.h0 r1 = r10.f4296x     // Catch: java.lang.Throwable -> L6f
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L6f
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L6f
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L6f
            r3 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r3
            float r3 = (float) r7     // Catch: java.lang.Throwable -> L6f
            float r0 = r0 / r3
            r1.g(r2, r0)     // Catch: java.lang.Throwable -> L6f
            long r2 = r10.B     // Catch: java.lang.Throwable -> L6f
            r4 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L56
            long r2 = r10.C     // Catch: java.lang.Throwable -> La
            r4 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L5d
        L56:
            float r0 = r1.h()     // Catch: java.lang.Throwable -> L6f
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L6f
            r10.D = r0     // Catch: java.lang.Throwable -> L6f
        L5d:
            long r5 = r10.A     // Catch: java.lang.Throwable -> L6f
            long r8 = r10.D     // Catch: java.lang.Throwable -> L6f
            r4 = r10
            r4.a(r5, r7, r8)     // Catch: java.lang.Throwable -> L6c
            r4.f4298z = r11     // Catch: java.lang.Throwable -> L6c
            r11 = 0
            r4.A = r11     // Catch: java.lang.Throwable -> L6c
            goto L73
        L6c:
            r0 = move-exception
        L6d:
            r11 = r0
            goto L7b
        L6f:
            r0 = move-exception
            r4 = r10
            goto L6d
        L72:
            r4 = r10
        L73:
            int r11 = r4.f4297y     // Catch: java.lang.Throwable -> L6c
            int r11 = r11 + (-1)
            r4.f4297y = r11     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r10)
            return
        L7b:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6c
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a0.e(com.google.android.gms.internal.ads.dj1, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.as1
    public final synchronized void k(dj1 dj1Var, boolean z3, int i) {
        boolean z9;
        if (z3) {
            dj1Var.getClass();
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        this.A += i;
    }
}
