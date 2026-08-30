package a1;
import b.a;
import m.h;
import n.j0;
import r.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import androidx.ink.authoring.compose.InProgressShapesKt;
import androidx.ink.brush.behavior.EasingFunction;
import androidx.ink.geometry.ImmutableVec;
import b0.b1;
import b1.a0;
import b1.b0;
import b1.i0;
import b1.y;
import b8.g1;
import b8.g4;
import b8.kb;
import b8.n5;
import b8.r0;
import b8.ta;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.mu;
import com.google.mlkit.vision.digitalink.common.RecognitionCandidate;
import eb.w;
import g5.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k1.l0;
import n.c0;
import pe.z;
import pf.d1;
import r0.f1;
import r0.r1;
import r0.u1;
import r0.x;
import r2.u;
import sf.n0;
import w7.y8;
import wa.b9;
import ya.o9;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f193u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f194v;

    public /* synthetic */ f(r2.g gVar, mu muVar) {
        this.f193u = 23;
        this.f194v = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [androidx.lifecycle.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [cg.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.List, java.lang.Object] */
    @Override // df.l
    public final Object invoke(Object obj) {
        boolean InProgressShapesImpl$lambda$12$0;
        ImmutableVec points$lambda$0;
        float f10;
        String valueOf;
        String str;
        String concat;
        StringBuilder sb2;
        int i;
        pe.j jVar;
        int i10;
        float f11;
        int i11 = 18;
        boolean z3 = false;
        Object obj2 = null;
        boolean z9 = true;
        switch (this.f193u) {
            case 0:
                o oVar = ((l) this.f194v).f213w;
                if (oVar != null) {
                    z9 = oVar.b(obj);
                }
                return Boolean.valueOf(z9);
            case 1:
                InProgressShapesImpl$lambda$12$0 = InProgressShapesKt.InProgressShapesImpl$lambda$12$0((View) this.f194v, (MotionEvent) obj);
                return Boolean.valueOf(InProgressShapesImpl$lambda$12$0);
            case 2:
                points$lambda$0 = EasingFunction.Linear.points$lambda$0((EasingFunction.Linear) this.f194v, ((Integer) obj).intValue());
                return points$lambda$0;
            case 3:
                b0 b0Var = (b0) this.f194v;
                synchronized (b0Var.f1312g) {
                    a0 a0Var = b0Var.i;
                    a0Var.getClass();
                    Object obj3 = a0Var.f1296b;
                    obj3.getClass();
                    int i12 = a0Var.f1298d;
                    c0 c0Var = a0Var.f1297c;
                    if (c0Var == null) {
                        c0Var = new c0();
                        a0Var.f1297c = c0Var;
                        a0Var.f1299f.m(obj3, c0Var);
                    }
                    a0Var.c(obj, i12, obj3, c0Var);
                }
                return z.f22715a;
            case 4:
                Typeface typeface = (Typeface) this.f194v;
                m1.d dVar = (m1.d) obj;
                dVar.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() & 4294967295L));
                Paint paint = new Paint(1);
                paint.setTypeface(typeface);
                float f12 = 0.74f * intBitsToFloat2;
                paint.setTextSize(f12);
                paint.setColor(Color.argb(230, 40, 28, 18));
                float measureText = paint.measureText("Scraply");
                float f13 = intBitsToFloat * 0.86f;
                if (measureText > f13) {
                    paint.setTextSize((f13 / measureText) * paint.getTextSize());
                    measureText = paint.measureText("Scraply");
                }
                float textSize = paint.getTextSize();
                float f14 = intBitsToFloat * 0.04f;
                float f15 = intBitsToFloat2 * 0.62f;
                float f16 = intBitsToFloat2 * 0.46f;
                k1.h a10 = k1.a();
                a10.h(f14, f15);
                a10.j((measureText * 0.5f) + f14, (0.05f * intBitsToFloat2) + ((f15 + f16) * 0.5f), f14 + measureText, f16);
                k1.a(dVar.p0().j()).drawTextOnPath("Scraply", a10.f19481a, 0.0f, 0.0f, paint);
                long d2 = l0.d(3861388306L);
                float f17 = (textSize * 0.3f) + f16;
                k1.h a11 = k1.a();
                a11.h((measureText * 0.9f) + f14, f17);
                a11.e((0.62f * measureText) + f14, (textSize * 0.16f) + f17, (measureText * 0.3f) + f14, intBitsToFloat2 * 0.96f, (0.12f * measureText) + f14, intBitsToFloat2 * 0.86f);
                a11.e((0.01f * measureText) + f14, intBitsToFloat2 * 0.79f, (0.09f * measureText) + f14, intBitsToFloat2 * 0.66f, (measureText * 0.22f) + f14, f12);
                a11.e((0.46f * measureText) + f14, intBitsToFloat2 * 0.92f, (measureText * 0.82f) + f14, intBitsToFloat2 * 0.9f, (measureText * 1.06f) + f14, intBitsToFloat2 * 0.76f);
                m1.d.o0(dVar, a11, d2, new m1.h(dVar.l0((float) 1.25d), 0.0f, 1, 1, null, 18), 52);
                m1.d.D(dVar, d2, dVar.l0((float) 1.2d), (Float.floatToRawIntBits(r29) << 32) | (Float.floatToRawIntBits(r30) & 4294967295L), null, 120);
                return z.f22715a;
            case 5:
                g1 g1Var = (g1) this.f194v;
                m1.d dVar2 = (m1.d) obj;
                dVar2.getClass();
                y2.k kVar = g1Var.f2105b;
                float d10 = kVar.d();
                float b10 = kVar.b();
                if (d10 > 0.0f && b10 > 0.0f) {
                    if (g1Var.f2106c) {
                        f10 = 0.94f;
                    } else {
                        f10 = 1.0f;
                    }
                    float min = Math.min(Float.intBitsToFloat((int) (dVar2.e() >> 32)) / d10, Float.intBitsToFloat((int) (dVar2.e() & 4294967295L)) / b10) * f10;
                    float f18 = d10 * min;
                    float f19 = b10 * min;
                    m1.d.I0(dVar2, g1Var.f2104a, (kVar.f30810b & 4294967295L) | (kVar.f30809a << 32), (kVar.d() << 32) | (kVar.b() & 4294967295L), (ff.a.b((Float.intBitsToFloat((int) (dVar2.e() >> 32)) - f18) / 2.0f) << 32) | (ff.a.b((Float.intBitsToFloat((int) (dVar2.e() & 4294967295L)) - f19) / 2.0f) & 4294967295L), (ff.a.b(f19) & 4294967295L) | (ff.a.b(f18) << 32), 0.0f, null, 3, 480);
                }
                return z.f22715a;
            case 6:
                g4 g4Var = (g4) this.f194v;
                m1.d dVar3 = (m1.d) obj;
                dVar3.getClass();
                float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar3.e() >> 32));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (dVar3.e() & 4294967295L));
                float l0 = dVar3.l0((float) 2.2d);
                float f20 = intBitsToFloat4 - l0;
                int e = b9.e((int) (intBitsToFloat3 / dVar3.l0(7)), 12, 22);
                float f21 = intBitsToFloat3 / e;
                long j10 = k1.r.f19515d;
                float f22 = 2;
                k1.c0 k3 = w.k(qe.h(new k1.r(k1.c(j10, 0.06f)), new k1.r(k1.c(j10, 0.02f)), new k1.r(k1.c(j10, 0.05f))), f20 - dVar3.l0(f22), intBitsToFloat4, 8);
                float l02 = f20 - dVar3.l0(f22);
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(l02) & 4294967295L);
                float l03 = dVar3.l0(f22) + l0;
                m1.d.q(dVar3, k3, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(l03) & 4294967295L), 0.0f, null, 0, 120);
                k1.h a12 = k1.a();
                a12.h(0.0f, 0.0f);
                a12.g(intBitsToFloat3, 0.0f);
                a12.g(intBitsToFloat3, f20);
                int i13 = e - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    float f23 = i14 * f21;
                    a12.j((((i14 + 1) * f21) + f23) / 2.0f, f20 + l0, f23, f20);
                }
                a12.d();
                k1.h a13 = k1.a();
                a13.h(0.0f, f20);
                int i15 = 0;
                while (i15 < e) {
                    float f24 = i15 * f21;
                    i15++;
                    float f25 = i15 * f21;
                    a13.j((f24 + f25) / 2.0f, f20 + l0, f25, f20);
                }
                k1.h a14 = k1.a();
                a14.h(0.0f, f20);
                int i16 = 0;
                while (i16 < e) {
                    float f26 = i16 * f21;
                    i16++;
                    float f27 = i16 * f21;
                    k1.h hVar = a12;
                    float f28 = (float) 1.8d;
                    a14.j((f26 + f27) / 2.0f, dVar3.l0(f28) + f20 + l0, f27, dVar3.l0(f28) + f20);
                    a12 = hVar;
                    i13 = i13;
                }
                k1.h hVar2 = a12;
                a14.g(intBitsToFloat3, f20);
                while (i13 >= 0) {
                    float f29 = i13 * f21;
                    a14.j((((i13 + 1) * f21) + f29) / 2.0f, f20 + l0, f29, f20);
                    i13--;
                }
                a14.d();
                long j11 = k1.r.f19513b;
                m1.d.o0(dVar3, a14, k1.c(j11, 0.32f), null, 60);
                long j12 = g4Var.f2117a;
                long j13 = g4Var.f2117a;
                m1.d.g0(dVar3, hVar2, w.k(qe.h(new k1.r(j12), new k1.r(j13), new k1.r(k1.c(j13, 0.95f))), 0.0f, 0.0f, 14), 0.0f, null, 60);
                long j14 = k1.r.f19515d;
                k1.r rVar = new k1.r(k1.c(j14, 0.18f));
                long j15 = k1.r.f19520k;
                k1.c0 k4 = w.k(qe.h(rVar, new k1.r(j15)), 0.0f, 0.0f, 14);
                float l04 = dVar3.l0((float) 1.2d);
                m1.d.q(dVar3, k4, 0L, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(l04) & 4294967295L), 0.0f, null, 0, 120);
                m1.d.o0(dVar3, a13, k1.c(j11, 0.22f), new m1.h(dVar3.l0((float) 0.45d), 0.0f, 0, 0, null, 30), 52);
                float f30 = intBitsToFloat3 / 2.0f;
                float l05 = dVar3.l0((float) 3.2d);
                float l06 = dVar3.l0((float) 4.8d);
                float l07 = (l06 - dVar3.l0((float) 2.6d)) + l05;
                float f31 = l06 + l05;
                float l08 = dVar3.l0((float) 14.5d) / 2.0f;
                float f32 = f30 - l08;
                float f33 = l08 + f30;
                float l09 = dVar3.l0((float) 5.6d) / 2.0f;
                float f34 = f30 - l09;
                float f35 = f30 + l09;
                float l010 = dVar3.l0((float) 0.9d);
                float l011 = dVar3.l0((float) 0.7d);
                k1.h a15 = k1.a();
                float f36 = f34 + l010;
                a15.h(f36, l05);
                a15.g(f35 - l010, l05);
                float f37 = l05 + l010;
                a15.j(f35, l05, f35, f37);
                float f38 = l07 - l011;
                a15.g(f35, f38);
                a15.j(f35, l07, f35 + l011, l07);
                float f39 = f33 - l010;
                a15.g(f39, l07);
                float f40 = l07 + l010;
                a15.j(f33, l07, f33, f40);
                float f41 = f31 - l010;
                a15.g(f33, f41);
                a15.j(f33, f31, f39, f31);
                float f42 = f32 + l010;
                a15.g(f42, f31);
                a15.j(f32, f31, f32, f41);
                a15.g(f32, f40);
                a15.j(f32, l07, f42, l07);
                a15.g(f34 - l011, l07);
                a15.j(f34, l07, f34, f38);
                a15.g(f34, f37);
                a15.j(f34, l05, f36, l05);
                a15.d();
                m1.d.o0(dVar3, a15, kb.f2334a, null, 60);
                m1.d.g0(dVar3, a15, w.k(qe.h(new k1.r(k1.c(j11, 0.5f)), new k1.r(j15), new k1.r(k1.c(j11, 0.15f))), l05, f31, 8), 0.0f, null, 60);
                m1.d.o0(dVar3, a15, k1.c(j11, 0.4f), new m1.h(dVar3.l0((float) 0.5d), 0.0f, 0, 0, null, 30), 52);
                long c10 = k1.c(j14, 0.22f);
                float f43 = (float) 0.3d;
                float l012 = dVar3.l0(f43) + f31;
                float l013 = dVar3.l0(f43) + f31;
                m1.d.n0(dVar3, c10, (Float.floatToRawIntBits(f42) << 32) | (Float.floatToRawIntBits(l012) & 4294967295L), (Float.floatToRawIntBits(f39) << 32) | (Float.floatToRawIntBits(l013) & 4294967295L), dVar3.l0((float) 0.35d), 0, null, 496);
                return z.f22715a;
            case 7:
                androidx.lifecycle.w wVar = (androidx.lifecycle.w) this.f194v;
                ((j0) obj).getClass();
                Object obj4 = new Object();
                wVar.g().a(obj4);
                return new b1(wVar, 3, obj4);
            case 8:
                HashMap hashMap = (HashMap) this.f194v;
                Integer num = (Integer) obj;
                num.intValue();
                return (j1.c) hashMap.get(num);
            case 9:
                ra.e eVar = (ra.e) this.f194v;
                m1.d dVar4 = (m1.d) obj;
                dVar4.getClass();
                Float valueOf2 = Float.valueOf(1.0f);
                float intBitsToFloat5 = Float.intBitsToFloat((int) (dVar4.e() >> 32));
                float intBitsToFloat6 = Float.intBitsToFloat((int) (dVar4.e() & 4294967295L));
                Float valueOf3 = Float.valueOf(0.0f);
                if (intBitsToFloat5 > 0.0f && intBitsToFloat6 > 0.0f) {
                    pe.j jVar2 = new pe.j(valueOf3, new k1.r(ta.f2807b));
                    Float valueOf4 = Float.valueOf(0.55f);
                    long j16 = ta.f2806a;
                    m1.d.q(dVar4, w.l(new pe.j[]{jVar2, new pe.j(valueOf4, new k1.r(j16)), new pe.j(valueOf2, new k1.r(j16))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 0, 126);
                    Iterator it = ((List) eVar.f24675v).iterator();
                    while (it.hasNext()) {
                        r0 r0Var = (r0) it.next();
                        long j17 = r0Var.f2618d;
                        long j18 = r0Var.f2618d;
                        float f44 = r0Var.e;
                        Float f45 = valueOf3;
                        float f46 = intBitsToFloat5;
                        float f47 = intBitsToFloat6;
                        pe.j[] jVarArr = {new pe.j(valueOf3, new k1.r(k1.c(j17, f44))), new pe.j(Float.valueOf(0.4f), new k1.r(k1.c(j18, f44 * 0.5f))), new pe.j(Float.valueOf(0.72f), new k1.r(k1.c(j18, f44 * 0.16f))), new pe.j(valueOf2, new k1.r(k1.c(j18, 0.0f)))};
                        float f48 = r0Var.f2615a;
                        float f49 = r0Var.f2616b;
                        m1.d.q(dVar4, w.j(jVarArr, (Float.floatToRawIntBits(f49) & 4294967295L) | (Float.floatToRawIntBits(f48) << 32), r0Var.f2617c, 8), 0L, (Float.floatToRawIntBits(f46) << 32) | (Float.floatToRawIntBits(f47) & 4294967295L), 0.0f, null, 12, 58);
                        valueOf3 = f45;
                        intBitsToFloat5 = f46;
                        it = it;
                        intBitsToFloat6 = f47;
                    }
                    float f50 = intBitsToFloat5;
                    float f51 = intBitsToFloat6;
                    m1.d dVar5 = dVar4;
                    for (n5 n5Var : eVar.f24676w) {
                        dVar5.m0(n5Var.f2446b, n5Var.f2445a, n5Var.f2447c);
                    }
                    for (b8.d dVar6 : eVar.f24677x) {
                        long j19 = dVar6.f1955c;
                        float f52 = dVar6.f1956d;
                        long j20 = dVar6.f1955c;
                        float f53 = dVar6.f1954b;
                        m1.d dVar7 = dVar5;
                        m1.d.D(dVar7, k1.c(j19, 0.1f * f52), f53 * 7.0f, dVar6.f1953a, null, 56);
                        m1.d.D(dVar7, k1.c(j20, 0.26f * f52), f53 * 2.8f, dVar6.f1953a, null, 56);
                        m1.d.D(dVar7, k1.c(j20, f52), dVar6.f1954b, dVar6.f1953a, null, 120);
                        float f54 = f53 * 14.0f;
                        float f55 = f52 * 0.38f;
                        ta.c(dVar7, dVar6.f1953a, f54, k1.c(j20, f55), true);
                        ta.c(dVar7, dVar6.f1953a, f54, k1.c(j20, f55), false);
                        dVar5 = dVar7;
                    }
                    m1.d dVar8 = dVar5;
                    Float valueOf5 = Float.valueOf(0.6f);
                    long j21 = k1.r.f19513b;
                    m1.d.q(dVar8, w.j(new pe.j[]{new pe.j(valueOf5, new k1.r(k1.c(j21, 0.0f))), new pe.j(valueOf2, new k1.r(k1.c(j21, 0.3f)))}, (Float.floatToRawIntBits(f50 * 0.5f) << 32) | (Float.floatToRawIntBits(f51 * 0.42f) & 4294967295L), Math.max(f50, f51) * 0.82f, 8), 0L, 0L, 0.0f, null, 0, 126);
                }
                return z.f22715a;
            case 10:
                Object r22 = this.f194v;
                int intValue = ((Integer) obj).intValue();
                return r22.g(intValue) + ": " + r22.i(intValue).a();
            case 11:
                g5.p pVar = (g5.p) this.f194v;
                r5.c cVar = (r5.c) obj;
                cVar.getClass();
                pVar.f17512h = cVar;
                return z.f22715a;
            case 12:
                v vVar = (v) this.f194v;
                g5.a aVar = (g5.a) obj;
                aVar.getClass();
                return vVar.g(aVar);
            case 13:
                c cVar2 = (c) this.f194v;
                ((p5.a) obj).getClass();
                return cVar2.invoke();
            case 14:
                h8.f fVar = (h8.f) this.f194v;
                if (fVar.c(((j1.b) obj).f18762a)) {
                    fVar.a(true);
                }
                return z.f22715a;
            case 15:
                p7.g gVar = (p7.g) this.f194v;
                List list = ((he.a) obj).f18029a;
                list.getClass();
                RecognitionCandidate recognitionCandidate = (RecognitionCandidate) qe.l.x(list);
                if (recognitionCandidate != null) {
                    obj2 = recognitionCandidate.f15624a;
                }
                gVar.invoke(obj2);
                return z.f22715a;
            case 16:
                g gVar2 = (g) this.f194v;
                o9.f31412b = true;
                o9.f31413c = false;
                o9.f31414d = "es";
                gVar2.invoke(Boolean.TRUE);
                return z.f22715a;
            case 17:
                q2.c0 c0Var2 = (q2.c0) obj;
                return ((q2.j) this.f194v).a(new q2.c0(null, c0Var2.f23337b, c0Var2.f23338c, c0Var2.f23339d, c0Var2.e)).getValue();
            case 18:
                if (obj == ((qe.a) this.f194v)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 19:
                String str2 = "(this Map)";
                w0.b bVar = (w0.b) this.f194v;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb3 = new StringBuilder();
                Object key = entry.getKey();
                if (key == bVar) {
                    valueOf = "(this Map)";
                } else {
                    valueOf = String.valueOf(key);
                }
                sb3.append(valueOf);
                sb3.append('=');
                Object value = entry.getValue();
                if (value != bVar) {
                    str2 = String.valueOf(value);
                }
                sb3.append(str2);
                return sb3.toString();
            case 20:
                ((x) this.f194v).y(obj);
                return z.f22715a;
            case gl.zzm /* 21 */:
                u1 u1Var = (u1) this.f194v;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (u1Var.f24396b) {
                    try {
                        d1 d1Var = u1Var.f24397c;
                        if (d1Var != null) {
                            n0 n0Var = u1Var.f24412t;
                            r1 r1Var = r1.f24362v;
                            n0Var.getClass();
                            n0Var.k(null, r1Var);
                            d1Var.j(cancellationException);
                            u1Var.f24409q = null;
                            d1Var.p(new androidx.ink.authoring.compose.d(u1Var, i11, th));
                        } else {
                            u1Var.f24398d = cancellationException;
                            n0 n0Var2 = u1Var.f24412t;
                            r1 r1Var2 = r1.f24361u;
                            n0Var2.getClass();
                            n0Var2.k(null, r1Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return z.f22715a;
            case 22:
                j0 j0Var = (j0) this.f194v;
                if (obj instanceof i0) {
                    ((i0) obj).f(4);
                }
                j0Var.a(obj);
                return z.f22715a;
            case 23:
                r2.g gVar3 = (r2.g) obj;
                if (((r2.g) this.f194v) == gVar3) {
                    str = " > ";
                } else {
                    str = "   ";
                }
                if (gVar3 instanceof r2.a) {
                    sb2 = new StringBuilder("CommitTextCommand(text.length=");
                    r2.a aVar2 = (r2.a) gVar3;
                    sb2.append(aVar2.f24445a.f20477v.length());
                    sb2.append(", newCursorPosition=");
                    i = aVar2.f24446b;
                } else if (gVar3 instanceof r2.v) {
                    sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
                    r2.v vVar2 = (r2.v) gVar3;
                    sb2.append(vVar2.f24511a.f20477v.length());
                    sb2.append(", newCursorPosition=");
                    i = vVar2.f24512b;
                } else {
                    if (gVar3 instanceof u) {
                        concat = ((u) gVar3).toString();
                    } else if (gVar3 instanceof r2.e) {
                        concat = ((r2.e) gVar3).toString();
                    } else if (gVar3 instanceof r2.f) {
                        concat = ((r2.f) gVar3).toString();
                    } else if (gVar3 instanceof r2.w) {
                        concat = ((r2.w) gVar3).toString();
                    } else if (gVar3 instanceof r2.h) {
                        concat = "FinishComposingTextCommand()";
                    } else if (gVar3 instanceof r2.d) {
                        concat = "DeleteAllCommand()";
                    } else {
                        String c11 = kotlin.jvm.internal.z.a(gVar3.getClass()).c();
                        if (c11 == null) {
                            c11 = "{anonymous EditCommand}";
                        }
                        concat = "Unknown EditCommand: ".concat(c11);
                    }
                    return str.concat(concat);
                }
                concat = a5.a.i(sb2, i, ')');
                return str.concat(concat);
            case 24:
                k1.n0 n0Var3 = (k1.n0) this.f194v;
                b2.l0 l0Var = (b2.l0) obj;
                l0Var.getClass();
                l0Var.b();
                m1.b bVar2 = l0Var.f1533u;
                float intBitsToFloat7 = Float.intBitsToFloat((int) (bVar2.e() & 4294967295L)) % 256.0f;
                ((ic.c) bVar2.f20424v.f18636v).D(0.0f, intBitsToFloat7);
                float f56 = -intBitsToFloat7;
                try {
                    m1.d.q(l0Var, n0Var3, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f56) & 4294967295L), bVar2.e(), 0.0f, null, 0, 120);
                    ((ic.c) bVar2.f20424v.f18636v).D(-0.0f, f56);
                    float l014 = l0Var.l0(40);
                    m1.d.q(l0Var, w.k(qe.h(new k1.r(k1.r.f19520k), new k1.r(k1.c(k1.r.f19513b, 0.4f))), (Float.intBitsToFloat((int) (bVar2.e() & 4294967295L)) - l014) - l0Var.l0(24), Float.intBitsToFloat((int) (bVar2.e() & 4294967295L)) - l014, 8), 0L, 0L, 0.0f, null, 0, 126);
                    return z.f22715a;
                } catch (Throwable th3) {
                    ((ic.c) bVar2.f20424v.f18636v).D(-0.0f, f56);
                    throw th3;
                }
            case 25:
                ArrayList arrayList = (ArrayList) this.f194v;
                u7.d dVar9 = (u7.d) obj;
                dVar9.getClass();
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size) {
                            Object obj5 = arrayList.get(i17);
                            i17++;
                            if (kotlin.jvm.internal.a(((u7.d) obj5).f26033a, dVar9.f26033a)) {
                                z3 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case 26:
                List list2 = (List) this.f194v;
                u7.b bVar3 = (u7.b) obj;
                bVar3.getClass();
                int size2 = list2.size();
                ArrayList arrayList2 = new ArrayList(size2);
                for (int i18 = 0; i18 < size2; i18++) {
                    arrayList2.add(null);
                }
                return u7.a(bVar3, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, null, null, arrayList2, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4186111);
            case 27:
                ((f1) this.f194v).i(((Integer) obj).intValue());
                return z.f22715a;
            case 28:
                Map map = (y) this.f194v;
                String str3 = (String) obj;
                str3.getClass();
                k1.f fVar2 = (k1.f) map.get(str3);
                if (fVar2 == null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = 1;
                        Bitmap decodeFile = BitmapFactory.decodeFile(str3, options);
                        decodeFile.getClass();
                        Object fVar3 = new k1.f(decodeFile);
                        map.put(str3, fVar3);
                        obj2 = fVar3;
                    } catch (Exception unused) {
                    }
                    return obj2;
                }
                return fVar2;
            default:
                u7.c cVar3 = (u7.c) this.f194v;
                m1.d dVar10 = (m1.d) obj;
                dVar10.getClass();
                k1.p j22 = dVar10.p0().j();
                float f57 = cVar3.f25974g;
                float f58 = cVar3.f25975h;
                if (f57 >= f58) {
                    jVar = new pe.j(Float.valueOf(Float.intBitsToFloat((int) (dVar10.e() >> 32))), Float.valueOf((f58 / f57) * Float.intBitsToFloat((int) (dVar10.e() >> 32))));
                } else {
                    jVar = new pe.j(Float.valueOf((f57 / f58) * Float.intBitsToFloat((int) (dVar10.e() & 4294967295L))), Float.valueOf(Float.intBitsToFloat((int) (dVar10.e() & 4294967295L))));
                }
                float floatValue = ((Number) jVar.f22693u).floatValue();
                float floatValue2 = ((Number) jVar.f22694v).floatValue();
                k1.a(j22).save();
                k1.a aVar3 = (k1.a) j22;
                aVar3.f19463a.translate(Float.intBitsToFloat((int) (dVar10.e() >> 32)) / 2.0f, Float.intBitsToFloat((int) (dVar10.e() & 4294967295L)) / 2.0f);
                List list3 = y8.f29503a;
                Canvas canvas = aVar3.f19463a;
                String str4 = cVar3.f25970b;
                Integer num2 = cVar3.f25971c;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = -1;
                }
                Integer valueOf6 = Integer.valueOf(i10);
                Integer num3 = cVar3.f25972d;
                if (num3 != null) {
                    f11 = 2.0f;
                } else {
                    f11 = 0.0f;
                }
                y8.c(canvas, str4, floatValue, floatValue2, valueOf6, num3, f11, cVar3.f25973f);
                aVar3.f19463a.restore();
                return z.f22715a;
        }
    }

    public /* synthetic */ f(int i, Object obj) {
        this.f193u = i;
        this.f194v = obj;
    }
}