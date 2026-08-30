package c7;
import a0.f0;
import b0.b;
import f.d;
import l.a;
import n.l;
import n.w;
import t.i;
import v.h;
import x.o;

import android.os.Parcel;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.d71;
import com.google.android.gms.internal.ads.dw0;
import com.google.android.gms.internal.ads.e3;
import com.google.android.gms.internal.ads.eq0;
import com.google.android.gms.internal.ads.g21;
import com.google.android.gms.internal.ads.i2;
import com.google.android.gms.internal.ads.l3;
import com.google.android.gms.internal.ads.mi;
import com.google.android.gms.internal.ads.ni;
import com.google.android.gms.internal.ads.od;
import com.google.android.gms.internal.ads.qp0;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.rh0;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.tw;
import com.google.android.gms.internal.ads.um1;
import com.google.android.gms.internal.ads.vs0;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.xy;
import com.google.android.gms.internal.ads.zd0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.da;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import com.google.android.gms.internal.play_billing.c4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import lb.k0;
import lb.q0;
import lb.s0;
import lb.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements e3, s81, ib.a, da, l9.e, s0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4001u;

    /* renamed from: v, reason: collision with root package name */
    public int f4002v;

    /* renamed from: w, reason: collision with root package name */
    public Object f4003w;

    public x(int i, byte b10) {
        this.f4001u = i;
        switch (i) {
            case 2:
                this.f4003w = new xk0(8);
                return;
            case 12:
                return;
            case 17:
                this.f4002v = 300;
                w wVar = l.f20912a;
                this.f4003w = new w();
                return;
            default:
                this.f4002v = 255;
                this.f4003w = null;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(c7.x r10, pe.b r11, ve.a r12) {
        /*
            java.lang.Object r0 = r10.f4003w
            f0 r0 = (f0) r0
            boolean r1 = r12 instanceof gg.r
            if (r1 == 0) goto L17
            r1 = r12
            gg.r r1 = (gg.r) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.B = r2
            goto L1c
        L17:
            gg.r r1 = new gg.r
            r1.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r1.f17794z
            int r2 = r1.B
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5d
            if (r2 != r8) goto L56
            int r10 = r1.f17793y
            java.lang.String r11 = r1.f17792x
            java.util.LinkedHashMap r0 = r1.f17791w
            c7.x r2 = r1.f17790v
            pe.b r9 = r1.f17789u
            pe.a.e(r12)
            fg.m r12 = (fg.m) r12
            r0.put(r11, r12)
            java.lang.Object r11 = r2.f4003w
            f0 r11 = (f0) r11
            byte r11 = r11.e()
            if (r11 == r7) goto L53
            if (r11 != r6) goto L49
            goto L98
        L49:
            java.lang.Object r10 = r2.f4003w
            f0 r10 = (f0) r10
            java.lang.String r11 = "Expected end of the object or comma"
            f0.u(r10, r11, r5, r4)
            throw r3
        L53:
            r5 = r10
            r10 = r2
            goto L71
        L56:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            q.o(r10)
            r10 = 0
            return r10
        L5d:
            pe.a.e(r12)
            byte r12 = r0.f(r4)
            byte r2 = r0.D()
            if (r2 == r7) goto Lb0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9 = r11
            r11 = r12
        L71:
            java.lang.Object r12 = r10.f4003w
            f0 r12 = (f0) r12
            boolean r2 = r12.b()
            if (r2 == 0) goto L97
            java.lang.String r11 = r12.i()
            r2 = 5
            r12.f(r2)
            r1.f17789u = r9
            r1.f17790v = r10
            r1.f17791w = r0
            r1.f17792x = r11
            r1.f17793y = r5
            r1.B = r8
            r9.getClass()
            r9.f22686v = r1
            ue.a r10 = ue.a.f27192u
            return r10
        L97:
            r2 = r10
        L98:
            java.lang.Object r10 = r2.f4003w
            f0 r10 = (f0) r10
            if (r11 != r4) goto La2
            r10.f(r6)
            goto La4
        La2:
            if (r11 == r7) goto Laa
        La4:
            fg.z r10 = new fg.z
            r10.<init>(r0)
            return r10
        Laa:
            java.lang.String r11 = "object"
            gg.k.k(r10, r11)
            throw r3
        Lb0:
            java.lang.String r10 = "Unexpected leading comma"
            f0.u(r0, r10, r5, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.a(c7.x, pe.b, ve.a):java.lang.Object");
    }

    @Override // lb.s0
    public Object b() {
        t0 t0Var = (t0) this.f4003w;
        int i = this.f4002v;
        lb.v vVar = t0Var.f20279a;
        q0 a10 = t0Var.a(i);
        int i10 = a10.f20235b;
        g21 g21Var = a10.f20236c;
        int i11 = g21Var.f6274b;
        long j10 = g21Var.f6273a;
        String str = (String) g21Var.f6276d;
        if (i11 != 5 && i11 != 6 && i11 != 4) {
            throw new k0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        if (vVar.d(str, j10, i10).exists()) {
            lb.h(vVar.d(str, j10, i10));
        }
        int i12 = g21Var.f6274b;
        if ((i12 == 5 || i12 == 6) && vVar.k(str, j10, i10).exists()) {
            lb.h(vVar.k(str, j10, i10));
            return null;
        }
        return null;
    }

    @Override // l9.e
    public /* synthetic */ void c(JsonWriter jsonWriter) {
        int i = this.f4002v;
        Map map = (Map) this.f4003w;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        l9.d(jsonWriter, map);
        jsonWriter.endObject();
    }

    public void d(float f10) {
        int i = this.f4002v;
        float[] fArr = (float[]) this.f4003w;
        if (i == fArr.length) {
            this.f4003w = Arrays.copyOf(fArr, i * 2);
        }
        float[] fArr2 = (float[]) this.f4003w;
        int i10 = this.f4002v;
        this.f4002v = i10 + 1;
        fArr2[i10] = f10;
    }

    public q.g0 e(Float f10, int i) {
        q.g0 g0Var = new q.g0(f10, q.y.f23034d);
        ((w) this.f4003w).i(i, g0Var);
        return g0Var;
    }

    public void f(int i, int i10) {
        int i11 = i10 + i;
        char[] cArr = (char[]) this.f4003w;
        if (cArr.length <= i11) {
            int i12 = i * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            this.f4003w = Arrays.copyOf(cArr, i11);
        }
    }

    @Override // ib.a
    public Object g(ib.o oVar) {
        if (oVar.l()) {
            int i = this.f4002v;
            od odVar = (od) this.f4003w;
            dw0 dw0Var = (dw0) oVar.j();
            byte[] b10 = ((rd) odVar.c()).b();
            dw0Var.getClass();
            l3 l3Var = new l3(dw0Var, b10);
            l3Var.f7926c = i;
            l3Var.p();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public boolean h() {
        if (((a7.b) this.f4003w) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [te.c, java.lang.Object, pe.b] */
    public fg.m i() {
        fg.m zVar;
        Object obj;
        f0 f0Var = (f0) this.f4003w;
        byte D = f0Var.D();
        if (D == 1) {
            return k(true);
        }
        if (D == 0) {
            return k(false);
        }
        if (D == 6) {
            int i = this.f4002v + 1;
            this.f4002v = i;
            if (i == 200) {
                gg.q qVar = new gg.q(this, null);
                Object obj2 = new Object();
                obj2.f22685u = qVar;
                obj2.f22686v = obj2;
                ue.a aVar = pe.a.f22682a;
                obj2.f22687w = aVar;
                while (true) {
                    obj = obj2.f22687w;
                    te.c cVar = obj2.f22686v;
                    if (cVar == null) {
                        break;
                    }
                    if (kotlin.jvm.internal.a(aVar, obj)) {
                        try {
                            gg.q qVar2 = obj2.f22685u;
                            kotlin.jvm.internal.b(3, qVar2);
                            gg.q qVar3 = new gg.q(qVar2.f17788w, cVar);
                            qVar3.f17787v = obj2;
                            Object invokeSuspend = qVar3.invokeSuspend(pe.z.f22715a);
                            if (invokeSuspend != ue.a.f27192u) {
                                cVar.resumeWith(invokeSuspend);
                            }
                        } catch (Throwable th) {
                            cVar.resumeWith(new pe.k(th));
                        }
                    } else {
                        obj2.f22687w = aVar;
                        cVar.resumeWith(obj);
                    }
                }
                pe.a.e(obj);
                zVar = (fg.m) obj;
            } else {
                byte f10 = f0Var.f((byte) 6);
                if (f0Var.D() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!f0Var.b()) {
                            break;
                        }
                        String i10 = f0Var.i();
                        f0Var.f((byte) 5);
                        linkedHashMap.put(i10, i());
                        f10 = f0Var.e();
                        if (f10 != 4) {
                            if (f10 != 7) {
                                f0.u(f0Var, "Expected end of the object or comma", 0, 6);
                                throw null;
                            }
                        }
                    }
                    if (f10 == 6) {
                        f0Var.f((byte) 7);
                    } else if (f10 == 4) {
                        gg.k.k(f0Var, "object");
                        throw null;
                    }
                    zVar = new fg.z(linkedHashMap);
                } else {
                    f0.u(f0Var, "Unexpected leading comma", 0, 6);
                    throw null;
                }
            }
            this.f4002v--;
            return zVar;
        }
        if (D == 8) {
            return j();
        }
        f0.u(f0Var, "Cannot read Json element because of unexpected ".concat(gg.k.p(D)), 0, 6);
        throw null;
    }

    public fg.e j() {
        boolean z3;
        f0 f0Var = (f0) this.f4003w;
        byte e = f0Var.e();
        if (f0Var.D() != 4) {
            ArrayList arrayList = new ArrayList();
            while (f0Var.b()) {
                arrayList.add(i());
                e = f0Var.e();
                if (e != 4) {
                    if (e == 9) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i = f0Var.f47b;
                    if (!z3) {
                        f0.u(f0Var, "Expected end of the array or comma", i, 4);
                        throw null;
                    }
                }
            }
            if (e == 8) {
                f0Var.f((byte) 9);
            } else if (e == 4) {
                gg.k.k(f0Var, "array");
                throw null;
            }
            return new fg.e(arrayList);
        }
        f0.u(f0Var, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public fg.d0 k(boolean z3) {
        String i;
        f0 f0Var = (f0) this.f4003w;
        if (!z3) {
            i = f0Var.j();
        } else {
            i = f0Var.i();
        }
        if (!z3 && kotlin.jvm.internal.a(i, "null")) {
            return fg.w.INSTANCE;
        }
        return new fg.t(i, z3);
    }

    public void l() {
        gg.c cVar = gg.c.f17761c;
        char[] cArr = (char[]) this.f4003w;
        cVar.getClass();
        cArr.getClass();
        synchronized (cVar) {
            int i = cVar.f17763b;
            if (cArr.length + i < gg.b.f17760a) {
                cVar.f17763b = i + cArr.length;
                cVar.f17762a.addLast(cArr);
            }
        }
    }

    public void m(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(this.f4002v, length);
        str.getChars(0, str.length(), (char[]) this.f4003w, this.f4002v);
        this.f4002v += length;
    }

    public String n(c4 c4Var) {
        String str;
        b0 b0Var = (b0) this.f4003w;
        int i = this.f4002v;
        try {
            if (b0Var.G != null) {
                com.google.android.gms.internal.play_billing.h hVar = b0Var.G;
                String packageName = b0Var.E.getPackageName();
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 6) {
                                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                                } else {
                                    str = "START_CONNECTION";
                                }
                            } else {
                                str = "IS_FEATURE_SUPPORTED";
                            }
                        } else {
                            str = "CONSUME_ASYNC";
                        }
                    } else {
                        str = "ACKNOWLEDGE_PURCHASE";
                    }
                } else {
                    str = "LAUNCH_BILLING_FLOW";
                }
                z zVar = new z(c4Var);
                com.google.android.gms.internal.play_billing.f fVar = (com.google.android.gms.internal.play_billing.f) hVar;
                Parcel b42 = fVar.b4();
                b42.writeString(packageName);
                b42.writeString(str);
                int i10 = com.google.android.gms.internal.play_billing.e.f15409a;
                b42.writeStrongBinder(zVar);
                try {
                    fVar.f9120v.transact(1, b42, null, 1);
                    b42.recycle();
                    return "billingOverrideService.getBillingOverride";
                } catch (Throwable th) {
                    b42.recycle();
                    throw th;
                }
            }
            throw null;
        } catch (Exception e) {
            b0Var.J(95, 28, e0.f3945r);
            com.google.android.gms.internal.play_billing.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            c4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public String o(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        Object r32 = 0;
        for (int i = 0; i < size; i++) {
            sb2.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] split = sb2.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        int i10 = this.f4002v;
        PriorityQueue priorityQueue = new PriorityQueue(i10, new com.google.android.gms.internal.ads.c(16));
        int i11 = 0;
        while (i11 < split.length) {
            String[] I = xy.I(split[i11], r32);
            if (I.length != 0) {
                int length = I.length;
                if (length < 6) {
                    b80.t(i10, b80.F(I, length), b80.y(I, r32, length), length, priorityQueue);
                } else {
                    long F = b80.F(I, 6);
                    b80.t(i10, F, b80.y(I, r32, 6), 6, priorityQueue);
                    int i12 = 1;
                    while (true) {
                        int length2 = I.length;
                        if (i12 < length2 - 5) {
                            int n10 = xy.n(I[i12 - 1]);
                            int n11 = xy.n(I[i12 + 5]);
                            int i13 = i12;
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            String y10 = b80.y(I, i13, 6);
                            F = (((n11 + 2147483647L) % 1073807359) + (((((F + 1073807359) - ((((n10 + 2147483647L) % 1073807359) * b80.C(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            b80.t(i10, F, y10, length2, priorityQueue);
                            i12 = i13 + 1;
                            split = split;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    }
                }
            }
            i11++;
            split = split;
            byteArrayOutputStream = byteArrayOutputStream;
            r32 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((mi) this.f4003w).U1(((ni) it.next()).f8719b));
            } catch (IOException e) {
                int i14 = k9.a0.f19634b;
                l9.i.d("Error while writing hash to byteStream", e);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e8) {
            int i15 = k9.a0.f19634b;
            l9.i.d("HashManager: Unable to convert to Base64.", e8);
        }
        try {
            byteArrayOutputStream3.close();
            return byteArrayOutputStream3.toString();
        } catch (IOException e10) {
            int i16 = k9.a0.f19634b;
            l9.i.d("HashManager: Unable to convert to Base64.", e10);
            return "";
        }
    }

    public long q(i2 i2Var) {
        int i;
        xk0 xk0Var = (xk0) this.f4003w;
        int i10 = 0;
        i2Var.E(xk0Var.f12580a, 0, 1, false);
        int i11 = xk0Var.f12580a[0] & 255;
        if (i11 != 0) {
            int i12 = 128;
            int i13 = 0;
            while (true) {
                i = i13 + 1;
                if ((i11 & i12) != 0) {
                    break;
                }
                i12 >>= 1;
                i13 = i;
            }
            int i14 = i11 & (~i12);
            i2Var.E(xk0Var.f12580a, 1, i13, false);
            while (i10 < i13) {
                i10++;
                i14 = (xk0Var.f12580a[i10] & 255) + (i14 << 8);
            }
            this.f4002v += i;
            return i14;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        switch (this.f4001u) {
            case 5:
                String f10 = wd0.f(this.f4002v);
                f9.k.C.f16819k.getClass();
                ((zd0) ((tw) this.f4003w).f11473y).c(System.currentTimeMillis(), f10);
                return;
            default:
                eq0 eq0Var = (eq0) this.f4003w;
                String str = (String) obj;
                int i = this.f4002v;
                qp0 qp0Var = eq0Var.f5755a;
                if (!qp0Var.f9939i0) {
                    eq0Var.f5757c.b(str, qp0Var.f9967x0, eq0Var.e, null);
                    return;
                }
                vs0 vs0Var = eq0Var.f5758d;
                String str2 = eq0Var.f5756b.f11091b;
                vs0Var.getClass();
                f9.k.C.f16819k.getClass();
                rb rbVar = new rb(i, System.currentTimeMillis(), str2, str);
                rh0 rh0Var = vs0Var.f11978a;
                rh0Var.getClass();
                rh0Var.f(new gw(rh0Var, 7, rbVar));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        switch (this.f4001u) {
            case 5:
                return;
            default:
                f9.k.C.f16817h.d("BufferingUrlPinger.attributionReportingManager", th);
                return;
        }
    }

    public String toString() {
        switch (this.f4001u) {
            case 3:
                d71 d71Var = (d71) this.f4003w;
                ArrayList arrayList = new ArrayList(d71Var.f5333v);
                for (int i = 0; i < d71Var.f5333v; i++) {
                    arrayList.add(bq0.a(d71Var.a(i)));
                }
                String a10 = bq0.a(this.f4002v);
                String obj = arrayList.toString();
                StringBuilder sb2 = new StringBuilder(g3.a.v(obj, a10.length() + 37, 1));
                sb2.append("UnsupportedBrands{major=");
                sb2.append(a10);
                sb2.append(", compatible=");
                sb2.append(obj);
                sb2.append("}");
                return sb2.toString();
            case 12:
                return new String((char[]) this.f4003w, 0, this.f4002v);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        return ((g9.n) this.f4003w).A(this.f4002v);
    }

    private final void p(Throwable th) {
    }

    public /* synthetic */ x(Object obj, int i, int i10) {
        this.f4001u = i10;
        this.f4003w = obj;
        this.f4002v = i;
    }

    public x(boolean z3, boolean z9, boolean z10) {
        this.f4001u = 9;
        int i = 1;
        if (!z3 && !z9 && !z10) {
            i = 0;
        }
        this.f4002v = i;
    }

    public x(int i, int i10) {
        this.f4001u = i10;
        switch (i10) {
            case 18:
                this.f4003w = new float[4096];
                return;
            default:
                this.f4003w = new um1(3);
                this.f4002v = i;
                return;
        }
    }

    public x(int i, int[] iArr) {
        d71 d71Var;
        this.f4001u = 3;
        this.f4002v = i;
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            d71Var = new d71(copyOf.length, copyOf);
        } else {
            d71Var = d71.f5331w;
        }
        this.f4003w = d71Var;
    }

    public x(ca.b bVar, int i) {
        this.f4001u = 11;
        fa.y.h(bVar);
        this.f4003w = bVar;
        this.f4002v = i;
    }

    public x(fg.j jVar, f0 f0Var) {
        this.f4001u = 13;
        this.f4003w = f0Var;
    }

    public /* synthetic */ x(int i, Map map) {
        this.f4001u = 14;
        this.f4002v = i;
        this.f4003w = map;
    }
}