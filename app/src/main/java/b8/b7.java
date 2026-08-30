package b8;
import a.a;
import a1.f;
import a1.m;
import b2.l0;
import d4.b;
import e7.q;
import g7.i;
import h1.c;
import h1.d;
import k1.m0;
import k1.r;
import lb.z;
import m.h;
import p.b0;
import p.d0;
import p.p0;
import p.p;
import p.q0;
import p.r0;
import p.t1;
import p.v0;
import p.v1;
import r0.j0;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.gl;
import com.google.android.play.core.assetpacks.bn;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1883u;

    public /* synthetic */ b7(int i) {
        this.f1883u = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.jvm.internal.x] */
    @Override // df.l
    public final Object invoke(Object obj) {
        int i;
        int i10;
        int i11;
        ra.e eVar;
        long j10;
        int i12;
        float f10;
        r[] rVarArr;
        float f11;
        float f12;
        Object value;
        Map map;
        String D;
        String D2;
        String D3;
        String D4;
        String D5;
        String D6;
        String D7;
        String D8;
        int i13 = this.f1883u;
        int i14 = 2;
        int i15 = 0;
        pe.z zVar = pe.z.f22715a;
        switch (i13) {
            case 0:
                ((j0) obj).getClass();
                return new g0(3);
            case 1:
                fg.h hVar = (fg.h) obj;
                hVar.getClass();
                hVar.f16978c = true;
                return zVar;
            case 2:
                z1.x xVar = (z1.x) obj;
                xVar.getClass();
                long k3 = z1.h1.i(xVar).k();
                int i16 = (int) (k3 >> 32);
                if (i16 > 0 && (i = (int) (k3 & 4294967295L)) > 0) {
                    long W = xVar.W(0L);
                    z5 z5Var = z5.f3075a;
                    float k4 = ((((int) (xVar.k() >> 32)) / 2.0f) + Float.intBitsToFloat((int) (W >> 32))) / i16;
                    float k10 = ((((int) (xVar.k() & 4294967295L)) / 2.0f) + Float.intBitsToFloat((int) (W & 4294967295L))) / i;
                    if (Math.abs(k4) <= Float.MAX_VALUE && Math.abs(k10) <= Float.MAX_VALUE) {
                        pe.j jVar = new pe.j(Float.valueOf(wa.b9.d(k4, 0.0f, 1.0f)), Float.valueOf(wa.b9.d(k10, 0.0f, 1.0f)));
                        sf.n0 n0Var = z5.f3082j;
                        if (!kotlin.jvm.internal.a(n0Var.getValue(), jVar)) {
                            n0Var.k(null, jVar);
                        }
                    }
                }
                return zVar;
            case 3:
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                m0Var.g(-14.0f);
                return zVar;
            case 4:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                l0Var.b();
                float f13 = d4.f1972a;
                float l0 = l0Var.l0(f13);
                float l02 = l0Var.l0((float) 4.5d);
                float intBitsToFloat = Float.intBitsToFloat((int) (l0Var.f1533u.e() & 4294967295L)) / 2.0f;
                float f14 = l0 / 2.0f;
                float l03 = l0Var.l0(f13);
                float f15 = d4.f1973b;
                b(l0Var, (Float.floatToRawIntBits(l02 + f14) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), l03, l0Var.l0(f15));
                b(l0Var, (Float.floatToRawIntBits((Float.intBitsToFloat((int) (r4.e() >> 32)) - l02) - f14) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), l0Var.l0(f13), l0Var.l0(f15));
                return zVar;
            case 5:
                ((j0) obj).getClass();
                return new g0(4);
            case 6:
                p pVar = (p) obj;
                pVar.getClass();
                if (z9.r((la) pVar.c()) >= z9.r((la) pVar.a())) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                q.k1 s10 = q.e.s(280, 0, z9.f3099a, 2);
                x7 x7Var = new x7(i10, i14);
                q.l1 l1Var = androidx.compose.animation.c.f425a;
                p0 a10 = new p0(new v1((r0) null, new t1(new c(3, x7Var), s10), (b0) null, (v0) null, (LinkedHashMap) null, 61)).a(androidx.compose.animation.c.d(q.e.s(200, 0, null, 6), 2));
                q0 a11 = new q0(new v1((r0) null, new t1(new c(5, new x7(i10, 3)), q.e.s(280, 0, z9.f3100b, 2)), (b0) (0 == true ? 1 : 0), (v0) (0 == true ? 1 : 0), (LinkedHashMap) null, 61)).a(androidx.compose.animation.c.e(q.e.s(160, 0, null, 6), 2));
                int i17 = androidx.compose.animation.a.f423b;
                return new d0(a10, a11);
            case 7:
                p pVar2 = (p) obj;
                pVar2.getClass();
                if (((o5) pVar2.c()).ordinal() > ((o5) pVar2.a()).ordinal()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                q.k1 s11 = q.e.s(320, 0, z9.f3099a, 2);
                x7 x7Var2 = new x7(i11, 0);
                q.l1 l1Var2 = androidx.compose.animation.c.f425a;
                p0 a12 = new p0(new v1((r0) null, new t1(new c(3, x7Var2), s11), (b0) null, (v0) null, (LinkedHashMap) null, 61)).a(androidx.compose.animation.c.d(q.e.s(200, 0, null, 6), 2));
                q0 a13 = new q0(new v1((r0) null, new t1(new c(5, new x7(i11, 1)), q.e.s(280, 0, z9.f3100b, 2)), (b0) (0 == true ? 1 : 0), (v0) (0 == true ? 1 : 0), (LinkedHashMap) null, 61)).a(androidx.compose.animation.c.e(q.e.s(150, 0, null, 6), 2));
                int i18 = androidx.compose.animation.a.f423b;
                return new d0(a12, a13);
            case 8:
                f fVar = (f) obj;
                fVar.getClass();
                return fVar.f19605a;
            case 9:
                ((Long) obj).getClass();
                return zVar;
            case 10:
                ((j0) obj).getClass();
                return new g0(5);
            case 11:
                d dVar = (d) obj;
                dVar.getClass();
                long e = dVar.f17824u.e();
                float a14 = dVar.a();
                r[] rVarArr2 = ta.f2811g;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (e >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (e & 4294967295L));
                if (intBitsToFloat2 > 0.0f && intBitsToFloat3 > 0.0f) {
                    Object obj2 = new Object();
                    obj2.f19786u = 1592594996L;
                    float f16 = intBitsToFloat2 * 0.3f;
                    float f17 = 0.62f;
                    r0 r0Var = new r0(f16, intBitsToFloat3 * 0.72f, intBitsToFloat2 * 0.62f, ta.f2808c, 0.34f, 0.34f);
                    long j11 = ta.f2809d;
                    List h3 = qe.h(r0Var, new r0(intBitsToFloat2 * 0.22f, intBitsToFloat3 * 0.8f, intBitsToFloat2 * 0.34f, j11, 0.3f, 0.26f), new r0(intBitsToFloat2 * 0.55f, intBitsToFloat3 * 0.3f, intBitsToFloat2 * 0.58f, ta.e, 0.26f, 0.22f), new r0(intBitsToFloat2 * 0.86f, intBitsToFloat3 * 0.16f, intBitsToFloat2 * 0.36f, ta.f2810f, 0.17f, 0.1f), new r0(intBitsToFloat2 * 0.92f, intBitsToFloat3 * 0.62f, f16, j11, 0.14f, 0.08f));
                    int e8 = wa.b9.e((int) (((intBitsToFloat3 / a14) * (intBitsToFloat2 / a14)) / 210.0f), 600, 2800);
                    int i19 = (int) (e8 * 0.45f);
                    float[] fArr = {0.45f, 0.75f, 1.15f};
                    float[] fArr2 = {0.16f, 0.34f, 0.58f, 0.85f};
                    int length = rVarArr2.length * 12;
                    int i20 = i19;
                    ArrayList[] arrayListArr = new ArrayList[length];
                    for (int i21 = 0; i21 < length; i21++) {
                        arrayListArr[i21] = new ArrayList();
                    }
                    int i22 = e8 - i20;
                    int i23 = 0;
                    while (i23 < i22) {
                        int i24 = length;
                        float[] fArr3 = fArr;
                        a(intBitsToFloat2, intBitsToFloat3, fArr2, arrayListArr, obj2, fArr3, ta.b(obj2) * intBitsToFloat2, ta.b(obj2) * intBitsToFloat3, 0.0f);
                        i23++;
                        i20 = i20;
                        fArr = fArr3;
                        length = i24;
                        f17 = f17;
                    }
                    float f18 = f17;
                    int i25 = length;
                    float[] fArr4 = fArr;
                    int i26 = i20;
                    Iterator it = h3.iterator();
                    while (it.hasNext()) {
                        r0 r0Var2 = (r0) it.next();
                        float f19 = r0Var2.f2619f;
                        float f20 = r0Var2.f2617c;
                        int i27 = 0;
                        for (int i28 = (int) (i26 * f19); i27 < i28; i28 = i28) {
                            a(intBitsToFloat2, intBitsToFloat3, fArr2, arrayListArr, obj2, fArr4, (((ta.b(obj2) + (ta.b(obj2) + ta.b(obj2))) - 1.5f) * 0.85f * f20 * f18) + r0Var2.f2615a, (((ta.b(obj2) + (ta.b(obj2) + ta.b(obj2))) - 1.5f) * 0.85f * f20 * f18) + r0Var2.f2616b, 0.1f);
                            i27++;
                            r0Var2 = r0Var2;
                            it = it;
                        }
                    }
                    ArrayList arrayList = new ArrayList(i25);
                    int length2 = rVarArr2.length;
                    for (int i29 = 0; i29 < length2; i29++) {
                        for (int i30 = 0; i30 < 3; i30++) {
                            int i31 = 0;
                            while (i31 < 4) {
                                ArrayList arrayList2 = arrayListArr[(((i29 * 3) + i30) * 4) + i31];
                                if (!arrayList2.isEmpty()) {
                                    i12 = length2;
                                    f10 = a14;
                                    rVarArr = rVarArr2;
                                    f11 = intBitsToFloat2;
                                    f12 = intBitsToFloat3;
                                    arrayList.add(new n5(Math.max(1.0f, fArr4[i30] * f10), r.c(rVarArr2[i29].f19523a, fArr2[i31]), arrayList2));
                                } else {
                                    i12 = length2;
                                    f10 = a14;
                                    rVarArr = rVarArr2;
                                    f11 = intBitsToFloat2;
                                    f12 = intBitsToFloat3;
                                }
                                i31++;
                                length2 = i12;
                                a14 = f10;
                                rVarArr2 = rVarArr;
                                intBitsToFloat2 = f11;
                                intBitsToFloat3 = f12;
                            }
                        }
                    }
                    float f21 = a14;
                    r[] rVarArr3 = rVarArr2;
                    float f22 = intBitsToFloat2;
                    float f23 = intBitsToFloat3;
                    ArrayList arrayList3 = new ArrayList(14);
                    for (int i32 = 0; i32 < 14; i32++) {
                        long floatToRawIntBits = (Float.floatToRawIntBits(((ta.b(obj2) * 0.88f) + 0.06f) * f22) << 32) | (Float.floatToRawIntBits(((ta.b(obj2) * 0.92f) + 0.04f) * f23) & 4294967295L);
                        float b10 = ((ta.b(obj2) * 0.7f) + 0.7f) * f21;
                        if (ta.b(obj2) > 0.6f) {
                            j10 = rVarArr3[1].f19523a;
                        } else {
                            j10 = r.f19515d;
                        }
                        arrayList3.add(new d(floatToRawIntBits, j10, b10, (ta.b(obj2) * 0.3f) + 0.7f));
                    }
                    eVar = new ra.e(8, h3, arrayList, arrayList3);
                } else {
                    qe.s sVar = qe.s.f24023u;
                    eVar = new ra.e(8, sVar, sVar, sVar);
                }
                return dVar.b(new c(0, new f(9, eVar)));
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey() + "=" + URLEncoder.encode((String) entry.getValue(), "UTF-8");
            case 13:
                ((Float) obj).getClass();
                return zVar;
            case 14:
                return "    at " + ((StackTraceElement) obj);
            case 15:
                fg.h hVar2 = (fg.h) obj;
                hVar2.getClass();
                hVar2.f16978c = true;
                return zVar;
            case 16:
                ((Boolean) obj).getClass();
                q qVar = q.f15992z;
                return zVar;
            case 17:
                cg.a aVar = (cg.a) obj;
                aVar.getClass();
                cg.a(aVar, "JsonPrimitive", new fg.q(new m(28)));
                cg.a(aVar, "JsonNull", new fg.q(new m(29)));
                cg.a(aVar, "JsonLiteral", new fg.q(new fg.o(i15)));
                cg.a(aVar, "JsonObject", new fg.q(new fg.o(1)));
                cg.a(aVar, "JsonArray", new fg.q(new fg.o(i14)));
                return zVar;
            case 18:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                String str = (String) entry2.getKey();
                fg.m mVar = (fg.m) entry2.getValue();
                StringBuilder sb2 = new StringBuilder();
                gg.a(str, sb2);
                sb2.append(':');
                sb2.append(mVar);
                return sb2.toString();
            case 19:
                c cVar = (c) obj;
                cVar.getClass();
                return Boolean.valueOf(cVar.P());
            case 20:
                c cVar2 = (c) obj;
                cVar2.getClass();
                re.h hVar3 = new re.h();
                while (cVar2.P()) {
                    hVar3.add(Integer.valueOf((int) cVar2.getLong(0)));
                }
                return qe.a(hVar3);
            case gl.zzm /* 21 */:
                sf.n0 n0Var2 = i.f17566a;
                for (Map.Entry entry3 : ((z) obj).f20316b.entrySet()) {
                    String str2 = (String) entry3.getKey();
                    bn bnVar = (bn) entry3.getValue();
                    if (bnVar.e > 0) {
                        sf.n0 n0Var3 = i.f17568c;
                        do {
                            value = n0Var3.getValue();
                            Map map2 = (Map) value;
                            Long valueOf = Long.valueOf(bnVar.e);
                            map2.getClass();
                            if (map2.isEmpty()) {
                                map = Collections.singletonMap(str2, valueOf);
                                map.getClass();
                            } else {
                                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                                linkedHashMap.put(str2, valueOf);
                                map = linkedHashMap;
                            }
                        } while (!n0Var3.i(value, map));
                    }
                    if (bnVar.f15576b != 0) {
                        str2.getClass();
                        i.a(str2, bnVar);
                    }
                }
                return zVar;
            case 22:
                fg.h hVar4 = (fg.h) obj;
                hVar4.getClass();
                hVar4.f16978c = true;
                hVar4.f16976a = true;
                return zVar;
            case 23:
                fg.h hVar5 = (fg.h) obj;
                hVar5.getClass();
                hVar5.f16978c = true;
                hVar5.f16979d = false;
                hVar5.f16976a = true;
                return zVar;
            case 24:
                h8.f fVar2 = (h8.f) obj;
                fVar2.getClass();
                return Float.valueOf(((Number) fVar2.i.getValue()).floatValue());
            case 25:
                h8.f fVar3 = (h8.f) obj;
                fVar3.getClass();
                return qe.h(new r(r.f19513b), fVar3.f17928g.getValue());
            case 26:
                a aVar2 = (a) obj;
                aVar2.getClass();
                c T = aVar2.T("SELECT * FROM notebooks ORDER BY orderIndex ASC");
                try {
                    int b11 = ya.b(T, FacebookMediationAdapter.KEY_ID);
                    int b12 = ya.b(T, "title");
                    int b13 = ya.b(T, "pageCount");
                    int b14 = ya.b(T, "colorR");
                    int b15 = ya.b(T, "colorG");
                    int b16 = ya.b(T, "colorB");
                    int b17 = ya.b(T, "orderIndex");
                    int b18 = ya.b(T, "coverConfig");
                    int b19 = ya.b(T, "backgroundConfig");
                    int b20 = ya.b(T, "sizeId");
                    int b21 = ya.b(T, "stackId");
                    int b22 = ya.b(T, "createdAt");
                    int b23 = ya.b(T, "updatedAt");
                    ArrayList arrayList4 = new ArrayList();
                    while (T.P()) {
                        String D9 = T.D(b11);
                        String D10 = T.D(b12);
                        ArrayList arrayList5 = arrayList4;
                        int i33 = (int) T.getLong(b13);
                        int i34 = b13;
                        int i35 = b12;
                        float f24 = (float) T.getDouble(b14);
                        int i36 = b14;
                        float f25 = (float) T.getDouble(b15);
                        int i37 = b15;
                        float f26 = (float) T.getDouble(b16);
                        int i38 = b16;
                        int i39 = (int) T.getLong(b17);
                        if (T.isNull(b18)) {
                            D = null;
                        } else {
                            D = T.D(b18);
                        }
                        if (T.isNull(b19)) {
                            D2 = null;
                        } else {
                            D2 = T.D(b19);
                        }
                        if (T.isNull(b20)) {
                            D3 = null;
                        } else {
                            D3 = T.D(b20);
                        }
                        if (T.isNull(b21)) {
                            D4 = null;
                        } else {
                            D4 = T.D(b21);
                        }
                        arrayList5.add(new f(D9, D10, i33, f24, f25, f26, i39, D, D2, D3, D4, T.getLong(b22), T.getLong(b23)));
                        arrayList4 = arrayList5;
                        b16 = i38;
                        b15 = i37;
                        b14 = i36;
                        b12 = i35;
                        b13 = i34;
                    }
                    return arrayList4;
                } finally {
                }
            case 27:
                a aVar3 = (a) obj;
                aVar3.getClass();
                c T2 = aVar3.T("SELECT COALESCE(MAX(orderIndex), -1) + 1 FROM notebooks");
                try {
                    if (T2.P()) {
                        i15 = (int) T2.getLong(0);
                    }
                    T2.close();
                    return Integer.valueOf(i15);
                } finally {
                }
            case 28:
                a aVar4 = (a) obj;
                aVar4.getClass();
                c T3 = aVar4.T("SELECT COUNT(*) FROM notebooks");
                try {
                    if (T3.P()) {
                        i15 = (int) T3.getLong(0);
                    }
                    T3.close();
                    return Integer.valueOf(i15);
                } finally {
                }
            default:
                a aVar5 = (a) obj;
                aVar5.getClass();
                c T4 = aVar5.T("SELECT * FROM notebooks ORDER BY orderIndex ASC");
                try {
                    int b24 = ya.b(T4, FacebookMediationAdapter.KEY_ID);
                    int b25 = ya.b(T4, "title");
                    int b26 = ya.b(T4, "pageCount");
                    int b27 = ya.b(T4, "colorR");
                    int b28 = ya.b(T4, "colorG");
                    int b29 = ya.b(T4, "colorB");
                    int b30 = ya.b(T4, "orderIndex");
                    int b31 = ya.b(T4, "coverConfig");
                    int b32 = ya.b(T4, "backgroundConfig");
                    int b33 = ya.b(T4, "sizeId");
                    int b34 = ya.b(T4, "stackId");
                    int b35 = ya.b(T4, "createdAt");
                    int b36 = ya.b(T4, "updatedAt");
                    ArrayList arrayList6 = new ArrayList();
                    while (T4.P()) {
                        String D11 = T4.D(b24);
                        String D12 = T4.D(b25);
                        int i40 = b24;
                        int i41 = (int) T4.getLong(b26);
                        float f27 = (float) T4.getDouble(b27);
                        float f28 = (float) T4.getDouble(b28);
                        float f29 = (float) T4.getDouble(b29);
                        int i42 = (int) T4.getLong(b30);
                        if (T4.isNull(b31)) {
                            D5 = null;
                        } else {
                            D5 = T4.D(b31);
                        }
                        if (T4.isNull(b32)) {
                            D6 = null;
                        } else {
                            D6 = T4.D(b32);
                        }
                        if (T4.isNull(b33)) {
                            D7 = null;
                        } else {
                            D7 = T4.D(b33);
                        }
                        if (T4.isNull(b34)) {
                            D8 = null;
                        } else {
                            D8 = T4.D(b34);
                        }
                        arrayList6.add(new f(D11, D12, i41, f27, f28, f29, i42, D5, D6, D7, D8, T4.getLong(b35), T4.getLong(b36)));
                        b24 = i40;
                    }
                    return arrayList6;
                } finally {
                }
        }
    }
}