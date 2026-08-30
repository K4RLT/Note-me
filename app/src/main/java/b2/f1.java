package b2;
import b0.x;
import b1.v;
import b1.y;
import b2.c;
import b2.f1;
import c.c;
import c2.y1;
import d.a;
import d1.p;
import d1.q;
import d1.r;
import l.f;
import l1.a;
import l1.c;
import l1.d;
import l1.f;
import n.c0;
import p.a;
import q.x;
import r0.c;
import t.m1;
import t0.e;
import y1.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcelable;
import b8.l2;
import com.google.android.gms.internal.ads.ay0;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.do0;
import com.google.android.gms.internal.ads.ed1;
import com.google.android.gms.internal.ads.gm1;
import com.google.android.gms.internal.ads.ir0;
import com.google.android.gms.internal.ads.l40;
import com.google.android.gms.internal.ads.o10;
import com.google.android.gms.internal.ads.qr1;
import com.google.android.gms.internal.ads.r40;
import com.google.android.gms.internal.ads.r60;
import com.google.android.gms.internal.ads.rr1;
import com.google.android.gms.internal.ads.rw;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.sr1;
import com.google.android.gms.internal.ads.um0;
import com.google.android.gms.internal.ads.ur1;
import com.google.android.gms.internal.ads.wr1;
import com.google.android.gms.internal.ads.x21;
import com.google.android.gms.internal.ads.xr1;
import com.google.android.gms.internal.ads.y10;
import com.google.android.gms.internal.ads.z20;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iv;
import com.google.android.gms.internal.mlkit_vision_digital_ink.kv;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ss;
import com.google.android.gms.internal.mlkit_vision_digital_ink.tq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.tu;
import com.google.android.gms.internal.mlkit_vision_digital_ink.uq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.yv;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import u7.n2;
import u7.t6;

/* loaded from: classes.dex */
public final class f1 implements uq {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1455u;

    /* renamed from: v, reason: collision with root package name */
    public Object f1456v;

    /* renamed from: w, reason: collision with root package name */
    public Object f1457w;

    /* renamed from: x, reason: collision with root package name */
    public Object f1458x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1459y;

    /* renamed from: z, reason: collision with root package name */
    public Object f1460z;

    public f1(y10 y10Var, c7.x xVar) {
        this.f1455u = 1;
        this.f1457w = y10Var;
        this.f1456v = xVar;
        do0 do0Var = new do0(xVar, 0);
        this.f1458x = new z20(21, do0Var);
        rr1 rr1Var = y10Var.f12713d;
        o10 o10Var = y10Var.f12718g;
        int i = 10;
        this.f1459y = new l40(rr1Var, o10Var, i);
        do0 do0Var2 = new do0(xVar, 1);
        do0 do0Var3 = new do0(xVar, 2);
        do0 do0Var4 = new do0(xVar, 3);
        this.f1460z = new r40((wr1) o10Var, (wr1) rr1Var, (sr1) do0Var2, (sr1) do0Var3, (wr1) do0Var4, 15);
        this.A = new um0(o10Var, 9);
        rr1 rr1Var2 = y10Var.F;
        this.B = new rw(do0Var, rr1Var2, rr1Var, 28);
        this.C = new r40(rr1Var2, do0Var4, do0Var, rr1Var, new do0(xVar, 5), 16);
        this.D = rr1.a(new um0(y10Var.f12749x, 13));
        do0 do0Var5 = new do0(xVar, 4);
        rr1 a10 = rr1.a(ay0.f4634z);
        rr1 a11 = rr1.a(b80.F);
        rr1 a12 = rr1.a(x21.f12442b0);
        rr1 a13 = rr1.a(ed1.F);
        int i10 = ur1.f11707b;
        LinkedHashMap d2 = gm1.d(4);
        d2.put(ir0.GMS_SIGNALS, a10);
        d2.put(ir0.BUILD_URL, a11);
        d2.put(ir0.HTTP, a12);
        d2.put(ir0.PRE_PROCESS, a13);
        rr1 a14 = rr1.a(new rw(do0Var5, y10Var.f12718g, new qr1(d2), i));
        int i11 = xr1.f12610c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a14);
        this.E = rr1.a(new sm0(y10Var.f12713d, new r60(new xr1(list, arrayList), 25)));
    }

    public static final Object a(f1 f1Var, String str, Context context, File file, int i, ve.i iVar) {
        ((ConcurrentHashMap) f1Var.f1459y).remove(file.getAbsolutePath());
        v7.d a10 = v7.a(f1Var.m(context, str), file.getAbsolutePath(), true, i, false, null, null, 0, 0.0f, 1.0f, 0.0f, 0.0f, null, 0, null, 30968);
        ((ConcurrentHashMap) f1Var.f1458x).put(str, a10);
        o(str, context, a10);
        wf.e eVar = pf.l0.f22767a;
        Object J = pf.b0.J(uf.n.f27235a, new v7.a(f1Var, str, null, 0), iVar);
        if (J == ue.a.f27192u) {
            return J;
        }
        return pe.z.f22715a;
    }

    public static final void b(f1 f1Var, q qVar, k1 k1Var) {
        s sVar;
        for (q qVar2 = qVar.f15692y; qVar2 != null; qVar2 = qVar2.f15692y) {
            if (qVar2 == ((e1) f1Var.f1457w)) {
                i0 v2 = ((i0) f1Var.f1456v).v();
                if (v2 != null) {
                    sVar = (s) v2.Z.f1458x;
                } else {
                    sVar = null;
                }
                k1Var.M = sVar;
                f1Var.f1459y = k1Var;
                return;
            }
            if ((qVar2.f15690w & 2) == 0) {
                qVar2.X0(k1Var);
            } else {
                return;
            }
        }
    }

    public static File h(Context context) {
        File file = new File(context.getFilesDir(), "covers");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c, q] */
    public static q i(p pVar, q qVar) {
        q qVar2;
        if (pVar instanceof b1) {
            qVar2 = ((b1) pVar).f();
            qVar2.f15690w = f(qVar2);
        } else {
            q qVar3 = new q();
            qVar3.f15690w = d(pVar);
            qVar3.I = pVar;
            qVar3.K = new HashSet();
            qVar2 = qVar3;
        }
        if (qVar2.H) {
            a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        qVar2.C = true;
        q qVar4 = qVar.f15693z;
        if (qVar4 != null) {
            qVar4.f15692y = qVar2;
            qVar2.f15693z = qVar4;
        }
        qVar.f15693z = qVar2;
        qVar2.f15692y = qVar;
        return qVar2;
    }

    public static q j(q qVar) {
        boolean z3 = qVar.H;
        if (z3) {
            c0 c0Var = l1.f1535a;
            if (!z3) {
                a.b("autoInvalidateRemovedNode called on unattached node");
            }
            a(qVar, -1, 2);
            qVar.V0();
            qVar.P0();
        }
        q qVar2 = qVar.f15693z;
        q qVar3 = qVar.f15692y;
        if (qVar2 != null) {
            qVar2.f15692y = qVar3;
            qVar.f15693z = null;
        }
        if (qVar3 != null) {
            qVar3.f15693z = qVar2;
            qVar.f15692y = null;
        }
        qVar3.getClass();
        return qVar3;
    }

    public static void o(String str, Context context, v7.d dVar) {
        String str2;
        Integer num = dVar.e;
        if (num == null || (str2 = String.valueOf(num.intValue())) == null) {
            str2 = "none";
        }
        try {
            File file = new File(h(context), "meta_" + str + ".txt");
            boolean z3 = dVar.f27407b;
            int i = dVar.f27408c;
            boolean z9 = dVar.f27409d;
            String str3 = dVar.f27410f;
            int i10 = dVar.f27411g;
            float f10 = dVar.f27412h;
            float f11 = dVar.i;
            float f12 = dVar.f27413j;
            float f13 = dVar.f27414k;
            String str4 = dVar.f27415l;
            if (str4 == null) {
                str4 = "";
            }
            af.l.h(file, z3 + ";" + i + ";" + z9 + ";" + str2 + ";" + str3 + ";" + i10 + ";" + f10 + ";" + f11 + ";" + f12 + ";" + f13 + ";" + str4 + ";" + dVar.f27416m + ";" + dVar.f27417n + ";" + t6.c(dVar.f27418o));
        } catch (Exception unused) {
        }
    }

    public static void t(p pVar, p pVar2, q qVar) {
        if ((pVar instanceof b1) && (pVar2 instanceof b1)) {
            qVar.getClass();
            ((b1) pVar2).g(qVar);
            if (qVar.H) {
                c(qVar);
                return;
            } else {
                qVar.D = true;
                return;
            }
        }
        if (qVar instanceof c) {
            c cVar = (c) qVar;
            if (cVar.H) {
                cVar.Z0();
            }
            cVar.I = pVar2;
            cVar.f15690w = d(pVar2);
            if (cVar.H) {
                cVar.Y0(false);
            }
            if (qVar.H) {
                c(qVar);
                return;
            } else {
                qVar.D = true;
                return;
            }
        }
        a.b("Unknown Modifier.Node type");
    }

    public void d(String str, String str2) {
        HashMap hashMap = (HashMap) this.A;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            x.o("Property \"autoMetadata\" has not been set");
        }
    }

    public n8.h e() {
        String str;
        if (((String) this.f1456v) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((n8.k) this.f1458x) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f1459y) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.f1460z) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.A) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new n8.h((String) this.f1456v, (Integer) this.f1457w, (n8.k) this.f1458x, ((Long) this.f1459y).longValue(), ((Long) this.f1460z).longValue(), (HashMap) this.A, (Integer) this.B, (String) this.C, (byte[]) this.D, (byte[]) this.E);
        }
        x.o("Missing required properties:".concat(str));
        return null;
    }

    public void f(String str) {
        int i;
        str.getClass();
        y yVar = (y) this.f1460z;
        Integer num = (Integer) yVar.get(str);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        yVar.put(str, Integer.valueOf(i + 1));
    }

    public void g(Context context, String str) {
        str.getClass();
        context.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.D;
        pf.d1 d1Var = (pf.d1) concurrentHashMap.remove(str);
        te.c cVar = null;
        if (d1Var != null) {
            d1Var.j(null);
        }
        concurrentHashMap.put(str, pf.x((y4.a) this.f1456v, null, new m1(this, str, context, cVar, 11), 3));
    }

    public void k(String str) {
        str.getClass();
        pf.d1 d1Var = (pf.d1) ((ConcurrentHashMap) this.D).remove(str);
        if (d1Var != null) {
            d1Var.j(null);
        }
        ((ConcurrentHashMap) this.f1458x).remove(str);
        ((ConcurrentHashMap) this.f1459y).remove(str);
        ((y) this.f1460z).remove(str);
        ((ConcurrentHashMap) this.A).remove(str);
    }

    public Bitmap l(Context context, String str) {
        str.getClass();
        context.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.A;
        Bitmap bitmap = (Bitmap) concurrentHashMap.get(str);
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        File file = new File(h(context), a.k("coverdraw_", str, ".png"));
        Bitmap bitmap2 = null;
        if (file.exists()) {
            try {
                String absolutePath = file.getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = true;
                options.inSampleSize = 1;
                bitmap2 = BitmapFactory.decodeFile(absolutePath, options);
            } catch (Exception unused) {
            }
        }
        if (bitmap2 == null) {
            bitmap2 = Bitmap.createBitmap(1024, 1536, Bitmap.Config.ARGB_8888);
            bitmap2.eraseColor(0);
        }
        concurrentHashMap.put(str, bitmap2);
        return bitmap2;
    }

    public v7.d m(Context context, String str) {
        str.getClass();
        context.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f1458x;
        v7.d dVar = (v7.d) concurrentHashMap.get(str);
        if (dVar == null) {
            v7.d c10 = v7.c(context, str);
            concurrentHashMap.put(str, c10);
            return c10;
        }
        return dVar;
    }

    public boolean n(int i) {
        if ((i & ((q) this.A).f15691x) != 0) {
            return true;
        }
        return false;
    }

    public void p() {
        for (q qVar = (q) this.A; qVar != null; qVar = qVar.f15693z) {
            qVar.U0();
            if (qVar.C) {
                c0 c0Var = l1.f1535a;
                if (!qVar.H) {
                    a.b("autoInvalidateInsertedNode called on unattached node");
                }
                a(qVar, -1, 1);
            }
            if (qVar.D) {
                c(qVar);
            }
            qVar.C = false;
            qVar.D = false;
        }
    }

    public pf.r1 q(Context context, String str) {
        Bitmap bitmap;
        Bitmap bitmap2 = (Bitmap) ((ConcurrentHashMap) this.A).get(str);
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            jf.d dVar = v7.j.f27439a;
            config.getClass();
            try {
                bitmap = bitmap2.copy(config, false);
            } catch (OutOfMemoryError unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                ((ConcurrentHashMap.KeySetView) this.E).add(str);
                y4.a aVar = (y4.a) this.f1456v;
                wf.e eVar = pf.l0.f22767a;
                return pf.x(aVar, wf.d.f29913w, new l2(this, context, str, (Parcelable) bitmap, (te.c) null, 25), 2);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0198, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a2, code lost:
    
        if (r14 <= r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a4, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a6, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b2, code lost:
    
        if (c(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b4, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c3, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c5, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c7, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c9, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cf, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d1, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0266, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01bb, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0196, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018f, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017d, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0170, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x017b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026c, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0156, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d2, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014c, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0152, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0154, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0158, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0159, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015b, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015d, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015f, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016d, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0172, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0184, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018a, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018c, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(int r32, e r33, e r34, q r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.f1.r(int, e, e, q, boolean):void");
    }

    public void s() {
        s sVar;
        a0 a0Var;
        i0 i0Var = (i0) this.f1456v;
        k1 k1Var = (s) this.f1458x;
        for (q qVar = ((g2) this.f1460z).f15692y; qVar != null; qVar = qVar.f15692y) {
            x f10 = f(qVar);
            if (f10 != null) {
                k1 k1Var2 = qVar.B;
                if (k1Var2 != null) {
                    a0 a0Var2 = (a0) k1Var2;
                    x xVar = a0Var2.f1414k0;
                    a0Var2.H1(f10);
                    a0Var = a0Var2;
                    if (xVar != qVar) {
                        u1 u1Var = a0Var2.f1531e0;
                        a0Var = a0Var2;
                        if (u1Var != null) {
                            ((y1) u1Var).c();
                            a0Var = a0Var2;
                        }
                    }
                } else {
                    a0 a0Var3 = new a0(i0Var, f10);
                    qVar.X0(a0Var3);
                    a0Var = a0Var3;
                }
                k1Var.M = a0Var;
                a0Var.L = k1Var;
                k1Var = a0Var;
            } else {
                qVar.X0(k1Var);
            }
        }
        i0 v2 = i0Var.v();
        if (v2 != null) {
            sVar = (s) v2.Z.f1458x;
        } else {
            sVar = null;
        }
        k1Var.M = sVar;
        this.f1459y = k1Var;
    }

    public String toString() {
        switch (this.f1455u) {
            case 0:
                StringBuilder sb2 = new StringBuilder("[");
                q qVar = (q) this.A;
                g2 g2Var = (g2) this.f1460z;
                if (qVar == g2Var) {
                    sb2.append("]");
                } else {
                    while (true) {
                        if (qVar != null && qVar != g2Var) {
                            sb2.append(String.valueOf(qVar));
                            if (qVar.f15693z == g2Var) {
                                sb2.append("]");
                            } else {
                                sb2.append(",");
                                qVar = qVar.f15693z;
                            }
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public tu c() {
        return new tu(((yv) this.f1457w).a(), (iv) ((tq) this.f1458x).c(), (iv) ((tq) this.f1459y).c(), (Uri) ((tq) this.f1460z).c(), (Uri) ((tq) this.A).c(), ((kv) this.B).a(), (com.google.android.gms.internal.mlkit_vision_digital_ink.i) ((tq) this.C).c(), (Executor) ((tq) this.D).c(), (ss) ((tq) this.E).c());
    }

    public /* synthetic */ f1() {
        this.f1455u = 3;
    }

    public f1(tq tqVar, yv yvVar, tq tqVar2, tq tqVar3, tq tqVar4, tq tqVar5, kv kvVar, tq tqVar6, tq tqVar7, tq tqVar8) {
        this.f1455u = 2;
        this.f1456v = tqVar;
        this.f1457w = yvVar;
        this.f1458x = tqVar2;
        this.f1459y = tqVar3;
        this.f1460z = tqVar4;
        this.A = tqVar5;
        this.B = kvVar;
        this.C = tqVar6;
        this.D = tqVar7;
        this.E = tqVar8;
    }

    public f1(i0 i0Var) {
        this.f1455u = 0;
        this.f1456v = i0Var;
        q qVar = new q();
        qVar.f15691x = -1;
        this.f1457w = qVar;
        s sVar = new s(i0Var);
        this.f1458x = sVar;
        this.f1459y = sVar;
        g2 g2Var = sVar.f1589k0;
        this.f1460z = g2Var;
        this.A = g2Var;
        this.D = new e(new r[16]);
    }

    public f1(y4.a aVar, n2 n2Var) {
        this.f1455u = 4;
        this.f1456v = aVar;
        this.f1457w = n2Var;
        this.f1458x = new ConcurrentHashMap();
        this.f1459y = new ConcurrentHashMap();
        this.f1460z = new y();
        this.A = new ConcurrentHashMap();
        this.B = new v();
        this.C = new v();
        this.D = new ConcurrentHashMap();
        this.E = ConcurrentHashMap.newKeySet();
    }
}