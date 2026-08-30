package b8;
import b2.l0;
import eb.w;
import g3.a;
import h1.d;
import j1.e;
import k1.c0;
import k1.j0;
import k1.r;
import m.h;
import m1.d;
import u.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2503u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x5 f2504v;

    public /* synthetic */ p(x5 x5Var, int i) {
        this.f2503u = i;
        this.f2504v = x5Var;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.jvm.internal.w] */
    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f2503u) {
            case 0:
                d dVar = (d) obj;
                dVar.getClass();
                float f10 = 2.0f;
                final float c10 = e.c(dVar.f17824u.e()) / 2.0f;
                char c11 = ' ';
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f17824u.e() >> 32)) / 2.0f;
                final long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.f17824u.e() & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                final float f11 = c10 * 2.0f;
                Object obj2 = new Object();
                obj2.f19785u = 12648430;
                final ArrayList arrayList = new ArrayList(44);
                int i = 0;
                while (arrayList.size() < 44 && i < 400) {
                    i++;
                    float f12 = f10;
                    int i10 = (int) (floatToRawIntBits >> c11);
                    float a10 = (((a(obj2) * f12) - 1.0f) * c10) + Float.intBitsToFloat(i10);
                    int i11 = (int) (floatToRawIntBits & 4294967295L);
                    float a11 = (((a(obj2) * f12) - 1.0f) * c10) + Float.intBitsToFloat(i11);
                    float intBitsToFloat2 = a10 - Float.intBitsToFloat(i10);
                    float intBitsToFloat3 = a11 - Float.intBitsToFloat(i11);
                    if ((intBitsToFloat3 * intBitsToFloat3) + (intBitsToFloat2 * intBitsToFloat2) <= c10 * c10 * 0.92f) {
                        arrayList.add(new float[]{a10, a11, (a(obj2) * 1.7f) + 0.6f, (a(obj2) * f12) - 1.0f, (a(obj2) * f12) - 1.0f});
                    }
                    f10 = f12;
                    c11 = ' ';
                }
                final x5 x5Var = this.f2504v;
                return dVar.b(new df.l() { // from class: b8.q
                    @Override // df.l
                    public final Object invoke(Object obj3) {
                        l0 l0Var = (l0) obj3;
                        l0Var.getClass();
                        l0Var.b();
                        float d2 = wa.b9.d(0.9f, 0.0f, 1.0f);
                        if (d2 > 0.0f) {
                            x5 x5Var2 = x5.this;
                            float h3 = x5Var2.f2974a.h();
                            float h10 = x5Var2.f2975b.h();
                            float f13 = f11;
                            float f14 = (h3 + h10) * 0.5f * f13;
                            List list = u.f2812a;
                            long j10 = floatToRawIntBits;
                            int i12 = (int) (j10 >> 32);
                            float f15 = 0.7f * f13;
                            float intBitsToFloat4 = (Float.intBitsToFloat(i12) - f15) + f14;
                            int i13 = (int) (j10 & 4294967295L);
                            float f16 = 0.4f * f14;
                            float intBitsToFloat5 = (Float.intBitsToFloat(i13) - f15) + f16;
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L);
                            float intBitsToFloat6 = Float.intBitsToFloat(i12) + f15 + f14;
                            float intBitsToFloat7 = Float.intBitsToFloat(i13) + f15 + f16;
                            c0 h11 = w.h(list, floatToRawIntBits2, (Float.floatToRawIntBits(intBitsToFloat6) << 32) | (Float.floatToRawIntBits(intBitsToFloat7) & 4294967295L), 8);
                            float f17 = c10;
                            d.y0(l0Var, h11, f17, j10, d2, null, 48);
                            float f18 = (h3 - h10) * 0.75f * f13;
                            List list2 = u.f2813b;
                            float f19 = f13 * 0.6f;
                            float intBitsToFloat8 = (Float.intBitsToFloat(i12) + f19) - f18;
                            float f20 = f18 * 0.6f;
                            float intBitsToFloat9 = (Float.intBitsToFloat(i13) - f19) - f20;
                            float intBitsToFloat10 = (Float.intBitsToFloat(i12) - f19) - f18;
                            float intBitsToFloat11 = (Float.intBitsToFloat(i13) + f19) - f20;
                            d.y0(l0Var, w.h(list2, (Float.floatToRawIntBits(intBitsToFloat8) << 32) | (Float.floatToRawIntBits(intBitsToFloat9) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat10) << 32) | (Float.floatToRawIntBits(intBitsToFloat11) & 4294967295L), 8), f17, j10, d2 * 0.9f, null, 48);
                            long j11 = r.f19515d;
                            List h12 = qe.h(new r(r.c(j11, 0.34f)), new r(r.c(j11, 0.11f)), new r(r.f19520k));
                            float intBitsToFloat12 = Float.intBitsToFloat(i12) - ((h3 * f17) * 0.75f);
                            float c12 = a.c(h10, f17, 0.75f, Float.intBitsToFloat(i13));
                            j0 i14 = w.i(h12, (Float.floatToRawIntBits(intBitsToFloat12) << 32) | (Float.floatToRawIntBits(c12) & 4294967295L), 1.15f * f17);
                            l0 l0Var2 = l0Var;
                            d.y0(l0Var2, i14, f17, j10, d2, null, 48);
                            Iterator it = arrayList.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                float[] fArr = (float[]) next;
                                float abs = 1.0f - ((Math.abs(h10 - fArr[4]) + Math.abs(h3 - fArr[3])) * 0.85f);
                                if (abs > 0.02f) {
                                    long c13 = r.c(r.f19515d, abs * abs * 0.6f * d2);
                                    float f21 = fArr[2];
                                    float f22 = fArr[0];
                                    float f23 = fArr[1];
                                    l0Var2 = l0Var2;
                                    d.D(l0Var2, c13, f21, (Float.floatToRawIntBits(f23) & 4294967295L) | (Float.floatToRawIntBits(f22) << 32), null, 56);
                                }
                            }
                        }
                        return pe.z.f22715a;
                    }
                });
            default:
                this.f2504v.e = true;
                return pe.z.f22715a;
        }
    }
}