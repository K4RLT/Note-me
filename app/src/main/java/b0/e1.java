package b0;
import b0.e1;
import f0.e;
import j.m0;
import k.b;
import l.a;
import n.c0;
import n.m0;
import n.r0;
import q.f;
import q.x;
import t0.e;
import w.a;

import c2.r2;
import com.google.android.gms.internal.ads.hb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import ya.cb;
import ya.qe;
import ya.rf;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1178a;

    /* renamed from: b, reason: collision with root package name */
    public int f1179b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1180c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1181d;

    public e1(jf.d dVar, f0 f0Var) {
        this.f1178a = 1;
        e1 k3 = f0Var.k();
        int i = dVar.f19189u;
        if (i < 0) {
            a.c("negative nearestRange.first");
        }
        int min = Math.min(dVar.f19190v, k3.f1179b - 1);
        if (min < i) {
            c0 c0Var = m0.f20916a;
            c0Var.getClass();
            this.f1180c = c0Var;
            this.f1181d = new Object[0];
            this.f1179b = 0;
            return;
        }
        int i10 = (min - i) + 1;
        this.f1181d = new Object[i10];
        this.f1179b = i;
        c0 c0Var2 = new c0(i10);
        f1 f1Var = new f1(i, min, c0Var2, this);
        e eVar = (e) k3.f1180c;
        if (i < 0 || i >= k3.f1179b) {
            StringBuilder m4 = g3.a.m("Index ", i, ", size ");
            m4.append(k3.f1179b);
            a.e(m4.toString());
        }
        if (min < 0 || min >= k3.f1179b) {
            StringBuilder m10 = g3.a.m("Index ", min, ", size ");
            m10.append(k3.f1179b);
            a.e(m10.toString());
        }
        if (min < i) {
            a.a("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')');
        }
        int e = e(i, eVar);
        int i11 = ((i) eVar.f25617u[e]).f1196a;
        while (i11 <= min) {
            i iVar = (i) eVar.f25617u[e];
            f1Var.invoke(iVar);
            i11 += iVar.f1197b;
            e++;
        }
        this.f1180c = c0Var2;
    }

    public static e1 h(String str) {
        int i;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        ig.r rVar = ig.r.HTTP_1_0;
        if (startsWith) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        rVar = ig.r.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i10 = i + 3;
        if (str.length() >= i10) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i10));
                if (str.length() > i10) {
                    if (str.charAt(i10) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new e1(rVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public void a(int i, r rVar) {
        if (i < 0) {
            a.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        i iVar = new i(this.f1179b, i, rVar);
        this.f1179b += i;
        ((e) this.f1180c).b(iVar);
    }

    public jd.b b() {
        if ("".isEmpty()) {
            return new jd.b((String) this.f1180c, ((Long) this.f1181d).longValue(), this.f1179b);
        }
        x.o("Missing required properties:".concat(""));
        return null;
    }

    public i c(int i) {
        if (i < 0 || i >= this.f1179b) {
            StringBuilder m4 = g3.a.m("Index ", i, ", size ");
            m4.append(this.f1179b);
            a.e(m4.toString());
        }
        i iVar = (i) this.f1181d;
        if (iVar != null) {
            int i10 = iVar.f1196a;
            if (i < iVar.f1197b + i10 && i10 <= i) {
                return iVar;
            }
        }
        e eVar = (e) this.f1180c;
        i iVar2 = (i) eVar.f25617u[e(i, eVar)];
        this.f1181d = iVar2;
        return iVar2;
    }

    public int d(Object obj) {
        c0 c0Var = (c0) this.f1180c;
        int d2 = c0Var.d(obj);
        if (d2 >= 0) {
            return c0Var.f20851c[d2];
        }
        return -1;
    }

    public Object e(int i) {
        Object[] objArr = (Object[]) this.f1181d;
        int i10 = i - this.f1179b;
        if (i10 >= 0) {
            objArr.getClass();
            if (i10 <= objArr.length - 1) {
                return objArr[i10];
            }
            return null;
        }
        return null;
    }

    public String f() {
        StringBuilder sb2 = new StringBuilder("$");
        int i = this.f1179b + 1;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = ((Object[]) this.f1180c)[i10];
            if (obj instanceof cg.d) {
                cg.d dVar = (cg.d) obj;
                boolean a10 = kotlin.jvm.internal.a(dVar.e(), cg.i.f4135c);
                int[] iArr = (int[]) this.f1181d;
                if (a10) {
                    if (iArr[i10] != -1) {
                        sb2.append("[");
                        sb2.append(((int[]) this.f1181d)[i10]);
                        sb2.append("]");
                    }
                } else {
                    int i11 = iArr[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(dVar.g(i11));
                    }
                }
            } else if (obj != gg.l.f17774a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    public void g(int i, int i10, int i11, int i12, int i13, int i14, boolean z3, boolean z9) {
        long[] jArr = (long[]) this.f1180c;
        int i15 = this.f1179b;
        int i16 = i15 + 3;
        this.f1179b = i16;
        int length = jArr.length;
        if (length <= i16) {
            int max = Math.max(length * 2, i16);
            this.f1180c = Arrays.copyOf(jArr, max);
            this.f1181d = Arrays.copyOf((long[]) this.f1181d, max);
        }
        long[] jArr2 = (long[]) this.f1180c;
        jArr2[i15] = (i10 << 32) | (i11 & 4294967295L);
        jArr2[i15 + 1] = (i12 << 32) | (i13 & 4294967295L);
        int i17 = i14 & 67108863;
        jArr2[i15 + 2] = ((z9 ? 1L : 0L) << 63) | ((z3 ? 1L : 0L) << 62) | (1 << 61) | (0 << 52) | (i17 << 26) | (i & 67108863);
        if (i14 >= 0) {
            for (int i18 = i15 - 3; i18 >= 0; i18 -= 3) {
                int i19 = i18 + 2;
                long j10 = jArr2[i19];
                if ((((int) j10) & 67108863) == i17) {
                    jArr2[i19] = (j10 & (-2301339409586323457L)) | (((i15 - i18) & 511) << 52);
                    return;
                }
            }
        }
    }

    public void i() {
        int i = this.f1179b * 2;
        this.f1180c = Arrays.copyOf((Object[]) this.f1180c, i);
        int[] iArr = new int[i];
        for (int i10 = 0; i10 < i; i10++) {
            iArr[i10] = -1;
        }
        qe.k.f(0, 0, 14, (int[]) this.f1181d, iArr);
        this.f1181d = iArr;
    }

    public void j(int i, df.r rVar) {
        int i10 = i & 67108863;
        long[] jArr = (long[]) this.f1180c;
        int i11 = this.f1179b;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if ((((int) jArr[i12 + 2]) & 67108863) == i10) {
                long j10 = jArr[i12];
                long j11 = jArr[i12 + 1];
                rVar.d(Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                return;
            }
        }
    }

    public void k(Object obj, Object obj2) {
        int i = this.f1179b + 1;
        Object[] objArr = (Object[]) this.f1180c;
        int length = objArr.length;
        int i10 = i + i;
        if (i10 > length) {
            this.f1180c = Arrays.copyOf(objArr, xa.b(length, i10));
        }
        xa.u0.r(obj, obj2);
        Object[] objArr2 = (Object[]) this.f1180c;
        int i11 = this.f1179b;
        int i12 = i11 + i11;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f1179b = i11 + 1;
    }

    public void l(String str, ca.d dVar) {
        int i;
        int i10 = this.f1179b + 1;
        Object[] objArr = (Object[]) this.f1180c;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 >= 0) {
                i = length + (length >> 1) + 1;
                if (i < i11) {
                    int highestOneBit = Integer.highestOneBit(i11 - 1);
                    i = highestOneBit + highestOneBit;
                }
                if (i < 0) {
                    i = Integer.MAX_VALUE;
                }
            } else {
                g5.f("cannot store more than MAX_VALUE elements");
                i = 0;
            }
            this.f1180c = Arrays.copyOf(objArr, i);
        }
        Object[] objArr2 = (Object[]) this.f1180c;
        int i12 = this.f1179b;
        int i13 = i12 + i12;
        objArr2[i13] = str;
        objArr2[i13 + 1] = dVar;
        this.f1179b = i12 + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a8  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xa.t m() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e1.m():xa.t");
    }

    public byte[] n() {
        ya.x xVar;
        zc.d dVar;
        rf rfVar = rf.f31482w;
        m0 m0Var = (m0) this.f1180c;
        ((hb) this.f1181d).C = false;
        hb hbVar = (hb) this.f1181d;
        hbVar.A = Boolean.FALSE;
        m0Var.f18662u = new qe(hbVar);
        try {
            rf.b();
            cb cbVar = new cb(m0Var);
            ya.y yVar = new ya.y(0);
            rfVar.a(yVar);
            HashMap hashMap = new HashMap((HashMap) yVar.f31591v);
            HashMap hashMap2 = new HashMap((HashMap) yVar.f31592w);
            ya.w wVar = (ya.w) yVar.f31593x;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                xVar = new ya.x(byteArrayOutputStream, hashMap, hashMap2, wVar);
                dVar = (zc.d) hashMap.get(cb.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(cbVar, xVar);
                return byteArrayOutputStream.toByteArray();
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(cb.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public String toString() {
        String str;
        switch (this.f1178a) {
            case 8:
                return f();
            case 12:
                String str2 = (String) this.f1181d;
                StringBuilder sb2 = new StringBuilder();
                if (((ig.r) this.f1180c) == ig.r.HTTP_1_0) {
                    str = "HTTP/1.0";
                } else {
                    str = "HTTP/1.1";
                }
                sb2.append(str);
                sb2.append(' ');
                sb2.append(this.f1179b);
                sb2.append(' ');
                sb2.append(str2);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public e1(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f1178a = 3;
        this.f1179b = i;
        this.f1181d = str;
        this.f1180c = arrayList;
    }

    public e1(m0 m0Var, int i) {
        this.f1178a = 15;
        this.f1181d = new Object();
        this.f1180c = m0Var;
        rf.b();
        this.f1179b = i;
    }

    public e1(int i) {
        this.f1178a = 14;
        this.f1180c = new Object[i + i];
        this.f1179b = 0;
    }

    public e1(String str, int i) {
        this.f1178a = 7;
        this.f1180c = str;
        this.f1179b = i;
    }

    public e1(ig.r rVar, int i, String str) {
        this.f1178a = 12;
        this.f1180c = rVar;
        this.f1179b = i;
        this.f1181d = str;
    }

    public /* synthetic */ e1(int i, char c10) {
        this.f1178a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, r0] */
    public e1(int i, byte b10) {
        this(4);
        this.f1178a = i;
        switch (i) {
            case 6:
                this.f1180c = Collections.synchronizedMap(new r0(0));
                this.f1179b = 0;
                return;
            case 13:
                this.f1180c = new Object[8];
                this.f1179b = 0;
                return;
            case 14:
                return;
            default:
                this.f1180c = new e(new i[16]);
                return;
        }
    }

    public e1(r2 r2Var) {
        this.f1178a = 10;
        this.f1180c = r2Var;
    }
}
