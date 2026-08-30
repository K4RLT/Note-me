package m2;
import a.a;
import b.b;
import g0.b;
import g0.d;
import g0.e;
import g0.f;
import g0.g;
import j.a;
import m.f;
import p0.a;
import p0.c;
import p0.d;
import p0.e;
import q.n;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f20547a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20548b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20549c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20550d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20551f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f20552g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f20553h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.lang.Object] */
    public q(u0 u0Var, long j10, int i, int i10) {
        boolean z3;
        j1.c cVar;
        int i11;
        int g8;
        int i12;
        this.f20547a = u0Var;
        this.f20548b = i;
        if (y2.a.j(j10) != 0 || y2.a.i(j10) != 0) {
            s2.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) u0Var.f15040z;
        int size = arrayList2.size();
        float f10 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            t tVar = (t) arrayList2.get(i13);
            u2.c cVar2 = tVar.f20568a;
            int h3 = y2.a.h(j10);
            if (y2.a.c(j10)) {
                i11 = i13;
                g8 = y2.a.g(j10) - ((int) Math.ceil(f10));
                if (g8 < 0) {
                    g8 = 0;
                }
            } else {
                i11 = i13;
                g8 = y2.a.g(j10);
            }
            a aVar = new a(cVar2, this.f20548b - i14, i10, y2.b(h3, g8, 5));
            n2.h hVar = (n2.h) aVar.f20437d;
            float h10 = aVar.h() + f10;
            int i15 = i14 + hVar.f21132g;
            arrayList.add(new s(aVar, tVar.f20569b, tVar.f20570c, i14, i15, f10, h10));
            if (!hVar.f21130d) {
                if (i15 == this.f20548b) {
                    i12 = i11;
                    if (i12 != qe.f((ArrayList) this.f20547a.f15040z)) {
                    }
                } else {
                    i12 = i11;
                }
                i13 = i12 + 1;
                i14 = i15;
                f10 = h10;
            }
            z3 = true;
            i14 = i15;
            f10 = h10;
            break;
        }
        z3 = false;
        this.e = f10;
        this.f20551f = i14;
        this.f20549c = z3;
        this.f20553h = arrayList;
        this.f20550d = y2.a.h(j10);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            s sVar = (s) arrayList.get(i16);
            Object r72 = sVar.f20561a.f20438f;
            ArrayList arrayList4 = new ArrayList(r72.size());
            int size3 = ((Collection) r72).size();
            for (int i17 = 0; i17 < size3; i17++) {
                j1.c cVar3 = (j1.c) r72.get(i17);
                if (cVar3 != null) {
                    cVar = sVar.a(cVar3);
                } else {
                    cVar = null;
                }
                arrayList4.add(cVar);
            }
            qe.n(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f20547a.f15037w).size()) {
            int size4 = ((List) this.f20547a.f15037w).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i18 = 0; i18 < size4; i18++) {
                arrayList5.add(null);
            }
            arrayList3 = qe.l.E(arrayList3, arrayList5);
        }
        this.f20552g = arrayList3;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    public final void a(final long j10, final float[] fArr) {
        k(e(j10));
        l(d(j10));
        final Object obj = new Object();
        obj.f19785u = 0;
        final Object obj2 = new Object();
        g(this.f20553h, j10, new df.l() { // from class: m2.o
            @Override // df.l
            public final Object invoke(Object obj3) {
                int e;
                long j11;
                a aVar;
                boolean z3;
                boolean z9;
                float a10;
                float a11;
                s sVar = (s) obj3;
                int i = sVar.f20562b;
                a aVar2 = sVar.f20561a;
                int i10 = sVar.f20563c;
                long j12 = j10;
                if (i > e(j12)) {
                    e = sVar.f20562b;
                } else {
                    e = e(j12);
                }
                if (i10 >= d(j12)) {
                    i10 = d(j12);
                }
                long b10 = b(sVar.d(e), sVar.d(i10));
                kotlin.jvm.internal.w wVar = obj;
                int i11 = wVar.f19785u;
                n2.h hVar = (n2.h) aVar2.f20437d;
                int e8 = e(b10);
                int d2 = d(b10);
                Layout layout = hVar.f21131f;
                int length = layout.getText().length();
                if (e8 < 0) {
                    s2.a("startOffset must be > 0");
                }
                if (e8 >= length) {
                    s2.a("startOffset must be less than text length");
                }
                if (d2 <= e8) {
                    s2.a("endOffset must be greater than startOffset");
                }
                if (d2 > length) {
                    s2.a("endOffset must be smaller or equal to text length");
                }
                int i12 = (d2 - e8) * 4;
                float[] fArr2 = fArr;
                if (fArr2.length - i11 < i12) {
                    s2.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(e8);
                int lineForOffset2 = layout.getLineForOffset(d2 - 1);
                i2.f fVar = new i2.f(hVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int f10 = hVar.f(lineForOffset);
                        int max = Math.max(e8, lineStart);
                        int min = Math.min(d2, f10);
                        float g8 = hVar.g(lineForOffset);
                        float e10 = hVar.e(lineForOffset);
                        j11 = b10;
                        aVar = aVar2;
                        boolean z10 = false;
                        if (layout.getParagraphDirection(lineForOffset) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (z3 && !isRtlCharAt) {
                                a10 = fVar.a(max, z10, z10, true);
                                z9 = z3;
                                a11 = fVar.a(max + 1, true, true, true);
                            } else {
                                if (z3 && isRtlCharAt) {
                                    z10 = false;
                                    float a12 = fVar.a(max, false, false, false);
                                    z9 = z3;
                                    a10 = fVar.a(max + 1, true, true, false);
                                    a11 = a12;
                                } else {
                                    z9 = z3;
                                    z10 = false;
                                    if (!z9 && isRtlCharAt) {
                                        a11 = fVar.a(max, false, false, true);
                                        a10 = fVar.a(max + 1, true, true, true);
                                    } else {
                                        a10 = fVar.a(max, false, false, false);
                                        a11 = fVar.a(max + 1, true, true, false);
                                    }
                                }
                                fArr2[i11] = a10;
                                fArr2[i11 + 1] = g8;
                                fArr2[i11 + 2] = a11;
                                fArr2[i11 + 3] = e10;
                                i11 += 4;
                                max++;
                                z3 = z9;
                            }
                            z10 = false;
                            fArr2[i11] = a10;
                            fArr2[i11 + 1] = g8;
                            fArr2[i11 + 2] = a11;
                            fArr2[i11 + 3] = e10;
                            i11 += 4;
                            max++;
                            z3 = z9;
                        }
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        aVar2 = aVar;
                        b10 = j11;
                    }
                } else {
                    j11 = b10;
                    aVar = aVar2;
                }
                int c10 = (c(j11) * 4) + wVar.f19785u;
                int i13 = wVar.f19785u;
                while (true) {
                    kotlin.jvm.internal.v vVar = obj2;
                    if (i13 < c10) {
                        int i14 = i13 + 1;
                        float f11 = fArr2[i14];
                        float f12 = vVar.f19784u;
                        fArr2[i14] = f11 + f12;
                        int i15 = i13 + 3;
                        fArr2[i15] = fArr2[i15] + f12;
                        i13 += 4;
                    } else {
                        wVar.f19785u = c10;
                        vVar.f19784u = aVar.h() + vVar.f19784u;
                        return pe.z.f22715a;
                    }
                }
            }
        });
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.f20553h;
        s sVar = (s) arrayList.get(e(i, arrayList));
        a aVar = sVar.f20561a;
        return ((n2.h) aVar.f20437d).e(i - sVar.f20564d) + sVar.f20565f;
    }

    public final int c(int i, boolean z3) {
        int f10;
        m(i);
        ArrayList arrayList = this.f20553h;
        s sVar = (s) arrayList.get(e(i, arrayList));
        a aVar = sVar.f20561a;
        int i10 = i - sVar.f20564d;
        n2.h hVar = (n2.h) aVar.f20437d;
        if (z3) {
            Layout layout = hVar.f21131f;
            n2.g gVar = n2.i.f21142a;
            if (layout.getEllipsisCount(i10) > 0 && hVar.f21128b == TextUtils.TruncateAt.END) {
                f10 = layout.getEllipsisStart(i10) + layout.getLineStart(i10);
            } else {
                u0 c10 = hVar.c();
                Layout layout2 = (Layout) c10.f15036v;
                f10 = c10.l(layout2.getLineEnd(i10), layout2.getLineStart(i10));
            }
        } else {
            f10 = hVar.f(i10);
        }
        return f10 + sVar.f20562b;
    }

    public final int d(int i) {
        int d2;
        int length = ((g) this.f20547a.f15036v).f20477v.length();
        ArrayList arrayList = this.f20553h;
        if (i >= length) {
            d2 = qe.f(arrayList);
        } else if (i < 0) {
            d2 = 0;
        } else {
            d2 = d(i, arrayList);
        }
        s sVar = (s) arrayList.get(d2);
        a aVar = sVar.f20561a;
        return ((n2.h) aVar.f20437d).f21131f.getLineForOffset(sVar.d(i)) + sVar.f20564d;
    }

    public final int e(float f10) {
        ArrayList arrayList = this.f20553h;
        s sVar = (s) arrayList.get(f(arrayList, f10));
        int i = sVar.f20563c - sVar.f20562b;
        int i10 = sVar.f20564d;
        if (i == 0) {
            return i10;
        }
        a aVar = sVar.f20561a;
        float f11 = f10 - sVar.f20565f;
        n2.h hVar = (n2.h) aVar.f20437d;
        return hVar.f21131f.getLineForVertical(((int) f11) - hVar.f21133h) + i10;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.f20553h;
        s sVar = (s) arrayList.get(e(i, arrayList));
        a aVar = sVar.f20561a;
        return ((n2.h) aVar.f20437d).g(i - sVar.f20564d) + sVar.f20565f;
    }

    public final int g(long j10) {
        int i = (int) (j10 & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.f20553h;
        s sVar = (s) arrayList.get(f(arrayList, intBitsToFloat));
        int i10 = sVar.f20563c;
        int i11 = sVar.f20562b;
        if (i10 - i11 == 0) {
            return i11;
        }
        a aVar = sVar.f20561a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - sVar.f20565f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
        n2.h hVar = (n2.h) aVar.f20437d;
        int lineForVertical = hVar.f21131f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - hVar.f21133h);
        return hVar.f21131f.getOffsetForHorizontal(lineForVertical, (hVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i11;
    }

    public final long h(j1.c cVar, int i, l4.a aVar) {
        long j10;
        long j11;
        float f10 = cVar.f18764b;
        ArrayList arrayList = this.f20553h;
        int f11 = f(arrayList, f10);
        float f12 = ((s) arrayList.get(f11)).f20566g;
        float f13 = cVar.f18766d;
        if (f12 < f13 && f11 != qe.f(arrayList)) {
            int f14 = f(arrayList, f13);
            long j12 = p0.f20544b;
            while (true) {
                j10 = p0.f20544b;
                if (!a(j12, j10) || f11 > f14) {
                    break;
                }
                s sVar = (s) arrayList.get(f11);
                j12 = sVar.b(sVar.f20561a.i(sVar.c(cVar), i, aVar), true);
                f11++;
            }
            if (a(j12, j10)) {
                return j10;
            }
            while (true) {
                j11 = p0.f20544b;
                if (!a(j10, j11) || f11 > f14) {
                    break;
                }
                s sVar2 = (s) arrayList.get(f14);
                j10 = sVar2.b(sVar2.f20561a.i(sVar2.c(cVar), i, aVar), true);
                f14--;
            }
            if (a(j10, j11)) {
                return j12;
            }
            return b((int) (j12 >> 32), (int) (4294967295L & j10));
        }
        s sVar3 = (s) arrayList.get(f11);
        return sVar3.b(sVar3.f20561a.i(sVar3.c(cVar), i, aVar), true);
    }

    public final void i(k1.p pVar, long j10, k1.o0 o0Var, x2.l lVar, m1.e eVar) {
        pVar.l();
        ArrayList arrayList = this.f20553h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s sVar = (s) arrayList.get(i);
            sVar.f20561a.m(pVar, j10, o0Var, lVar, eVar);
            pVar.q(0.0f, sVar.f20561a.h());
        }
        pVar.s();
    }

    public final void j(k1.p pVar, k1.n nVar, float f10, k1.o0 o0Var, x2.l lVar, m1.e eVar) {
        pVar.l();
        ArrayList arrayList = this.f20553h;
        if (arrayList.size() <= 1) {
            u2.a(this, pVar, nVar, f10, o0Var, lVar, eVar);
        } else if (nVar instanceof k1.r0) {
            u2.a(this, pVar, nVar, f10, o0Var, lVar, eVar);
        } else if (nVar instanceof k1.n0) {
            int size = arrayList.size();
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i = 0; i < size; i++) {
                s sVar = (s) arrayList.get(i);
                f12 += sVar.f20561a.h();
                f11 = Math.max(f11, sVar.f20561a.j());
            }
            Shader b10 = ((k1.n0) nVar).b((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
            Matrix matrix = new Matrix();
            b10.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                a aVar = ((s) arrayList.get(i10)).f20561a;
                aVar.n(pVar, new k1.o(b10), f10, o0Var, lVar, eVar);
                pVar.q(0.0f, aVar.h());
                matrix.setTranslate(0.0f, -aVar.h());
                b10.setLocalMatrix(matrix);
            }
        } else {
            l4.a.o();
            return;
        }
        pVar.s();
    }

    public final void k(int i) {
        g gVar = (g) this.f20547a.f15036v;
        if (i >= 0 && i < gVar.f20477v.length()) {
            return;
        }
        StringBuilder m4 = g3.a.m("offset(", i, ") is out of bounds [0, ");
        m4.append(gVar.f20477v.length());
        m4.append(')');
        s2.a(m4.toString());
    }

    public final void l(int i) {
        g gVar = (g) this.f20547a.f15036v;
        if (i >= 0 && i <= gVar.f20477v.length()) {
            return;
        }
        StringBuilder m4 = g3.a.m("offset(", i, ") is out of bounds [0, ");
        m4.append(gVar.f20477v.length());
        m4.append(']');
        s2.a(m4.toString());
    }

    public final void m(int i) {
        boolean z3 = false;
        int i10 = this.f20551f;
        if (i >= 0 && i < i10) {
            z3 = true;
        }
        if (!z3) {
            s2.a("lineIndex(" + i + ") is out of bounds [0, " + i10 + ')');
        }
    }
}