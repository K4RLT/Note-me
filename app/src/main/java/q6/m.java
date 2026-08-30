package q6;
import d.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements l, r6.a, c {
    public final o6.j e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23521f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23522g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23523h;
    public final r6.f i;

    /* renamed from: j, reason: collision with root package name */
    public final r6.e f23524j;

    /* renamed from: k, reason: collision with root package name */
    public final r6.f f23525k;

    /* renamed from: l, reason: collision with root package name */
    public final r6.f f23526l;

    /* renamed from: m, reason: collision with root package name */
    public final r6.f f23527m;

    /* renamed from: n, reason: collision with root package name */
    public final r6.f f23528n;

    /* renamed from: o, reason: collision with root package name */
    public final r6.f f23529o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23531q;

    /* renamed from: a, reason: collision with root package name */
    public final Path f23517a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f23518b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f23519c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f23520d = new float[2];

    /* renamed from: p, reason: collision with root package name */
    public final f4.h f23530p = new f4.h(2);

    public m(o6.j jVar, x6.b bVar, w6.h hVar) {
        this.e = jVar;
        int i = hVar.f27736a;
        this.f23521f = i;
        this.f23522g = hVar.i;
        this.f23523h = hVar.f27743j;
        r6.f b10 = hVar.f27737b.b();
        this.i = b10;
        r6.e b11 = hVar.f27738c.b();
        this.f23524j = b11;
        r6.f b12 = hVar.f27739d.b();
        this.f23525k = b12;
        r6.f b13 = hVar.f27740f.b();
        this.f23527m = b13;
        r6.f b14 = hVar.f27742h.b();
        this.f23529o = b14;
        if (i == 1) {
            this.f23526l = hVar.e.b();
            this.f23528n = hVar.f27741g.b();
        } else {
            this.f23526l = null;
            this.f23528n = null;
        }
        bVar.e(b10);
        bVar.e(b11);
        bVar.e(b12);
        bVar.e(b13);
        bVar.e(b14);
        if (i == 1) {
            bVar.e(this.f23526l);
            bVar.e(this.f23528n);
        }
        b10.a(this);
        b11.a(this);
        b12.a(this);
        b13.a(this);
        b14.a(this);
        if (i == 1) {
            this.f23526l.a(this);
            this.f23528n.a(this);
        }
    }

    @Override // r6.a
    public final void a() {
        this.f23531q = false;
        this.e.invalidateSelf();
    }

    @Override // q6.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                c cVar = (c) arrayList.get(i);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f23559c == 1) {
                        this.f23530p.f16717a.add(sVar);
                        sVar.e(this);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // q6.l
    public final Path f() {
        boolean z3;
        float f10;
        float f11;
        float f12;
        double d2;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        int i;
        double d10;
        boolean z9 = this.f23531q;
        Path path = this.f23517a;
        if (z9) {
            return path;
        }
        path.reset();
        if (this.f23522g) {
            this.f23531q = true;
            return path;
        }
        int b10 = q0.b(this.f23521f);
        r6.e eVar = this.f23524j;
        r6.f fVar = this.f23527m;
        r6.f fVar2 = this.f23529o;
        double d11 = 0.0d;
        r6.f fVar3 = this.f23525k;
        r6.f fVar4 = this.i;
        if (b10 != 0) {
            if (b10 != 1) {
                z3 = true;
            } else {
                int floor = (int) Math.floor(((Float) fVar4.d()).floatValue());
                if (fVar3 != null) {
                    d11 = ((Float) fVar3.d()).floatValue();
                }
                double radians = Math.toRadians(d11 - 90.0d);
                double d12 = floor;
                float floatValue = ((Float) fVar2.d()).floatValue() / 100.0f;
                float floatValue2 = ((Float) fVar.d()).floatValue();
                double d13 = floatValue2;
                z3 = true;
                float cos = (float) (Math.cos(radians) * d13);
                float sin = (float) (Math.sin(radians) * d13);
                path.moveTo(cos, sin);
                double d14 = (float) (6.283185307179586d / d12);
                double ceil = Math.ceil(d12);
                double d15 = radians + d14;
                int i10 = 0;
                while (true) {
                    double d16 = i10;
                    if (d16 >= ceil) {
                        break;
                    }
                    double d17 = ceil;
                    float cos2 = (float) (Math.cos(d15) * d13);
                    float sin2 = (float) (Math.sin(d15) * d13);
                    if (floatValue != 0.0f) {
                        i = i10;
                        Path path2 = path;
                        d10 = d13;
                        double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                        float cos3 = (float) Math.cos(atan2);
                        float sin3 = (float) Math.sin(atan2);
                        double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                        float f24 = floatValue2 * floatValue * 0.25f;
                        float f25 = f24 * cos3;
                        float f26 = f24 * sin3;
                        float cos4 = ((float) Math.cos(atan22)) * f24;
                        float sin4 = f24 * ((float) Math.sin(atan22));
                        if (d16 == d17 - 1.0d) {
                            Path path3 = this.f23518b;
                            path3.reset();
                            path3.moveTo(cos, sin);
                            float f27 = cos - f25;
                            float f28 = sin - f26;
                            float f29 = cos2 + cos4;
                            float f30 = sin2 + sin4;
                            path3.cubicTo(f27, f28, f29, f30, cos2, sin2);
                            PathMeasure pathMeasure = this.f23519c;
                            pathMeasure.setPath(path3, false);
                            float length = pathMeasure.getLength() * 0.9999f;
                            float[] fArr = this.f23520d;
                            pathMeasure.getPosTan(length, fArr, null);
                            path = path2;
                            path.cubicTo(f27, f28, f29, f30, fArr[0], fArr[1]);
                            cos = cos2;
                            sin = sin2;
                        } else {
                            float f31 = sin2 + sin4;
                            path = path2;
                            sin = sin2;
                            path.cubicTo(cos - f25, sin - f26, cos2 + cos4, f31, cos2, sin);
                            cos = cos2;
                        }
                    } else {
                        i = i10;
                        d10 = d13;
                        cos = cos2;
                        sin = sin2;
                        if (d16 != d17 - 1.0d) {
                            path.lineTo(cos, sin);
                        } else {
                            i10 = i + 1;
                            ceil = d17;
                            d13 = d10;
                        }
                    }
                    d15 += d14;
                    i10 = i + 1;
                    ceil = d17;
                    d13 = d10;
                }
                PointF pointF = (PointF) eVar.d();
                path.offset(pointF.x, pointF.y);
                path.close();
            }
        } else {
            z3 = true;
            float floatValue3 = ((Float) fVar4.d()).floatValue();
            if (fVar3 != null) {
                d11 = ((Float) fVar3.d()).floatValue();
            }
            double radians2 = Math.toRadians(d11 - 90.0d);
            double d18 = floatValue3;
            float f32 = (float) (6.283185307179586d / d18);
            if (this.f23523h) {
                f32 *= -1.0f;
            }
            float f33 = f32;
            float f34 = f33 / 2.0f;
            float f35 = floatValue3 - ((int) floatValue3);
            if (f35 != 0.0f) {
                f10 = 2.0f;
                radians2 += (1.0f - f35) * f34;
            } else {
                f10 = 2.0f;
            }
            float floatValue4 = ((Float) fVar.d()).floatValue();
            float floatValue5 = ((Float) this.f23526l.d()).floatValue();
            r6.f fVar5 = this.f23528n;
            if (fVar5 != null) {
                f11 = ((Float) fVar5.d()).floatValue() / 100.0f;
            } else {
                f11 = 0.0f;
            }
            if (fVar2 != null) {
                f12 = ((Float) fVar2.d()).floatValue() / 100.0f;
            } else {
                f12 = 0.0f;
            }
            if (f35 != 0.0f) {
                float x9 = g3.a.x(floatValue4, floatValue5, f35, floatValue5);
                double d19 = x9;
                f15 = x9;
                float cos5 = (float) (Math.cos(radians2) * d19);
                float sin5 = (float) (Math.sin(radians2) * d19);
                path.moveTo(cos5, sin5);
                d2 = radians2 + ((f33 * f35) / f10);
                f13 = cos5;
                f14 = sin5;
            } else {
                double d20 = floatValue4;
                float cos6 = (float) (Math.cos(radians2) * d20);
                float sin6 = (float) (Math.sin(radians2) * d20);
                path.moveTo(cos6, sin6);
                d2 = radians2 + f34;
                f13 = cos6;
                f14 = sin6;
                f15 = 0.0f;
            }
            double ceil2 = Math.ceil(d18) * 2.0d;
            double d21 = d2;
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                double d22 = i11;
                if (d22 >= ceil2) {
                    break;
                }
                if (z10) {
                    f16 = floatValue4;
                } else {
                    f16 = floatValue5;
                }
                if (f15 != 0.0f && d22 == ceil2 - 2.0d) {
                    f17 = (f33 * f35) / f10;
                } else {
                    f17 = f34;
                }
                if (f15 != 0.0f && d22 == ceil2 - 1.0d) {
                    f16 = f15;
                }
                double d23 = f16;
                float cos7 = (float) (Math.cos(d21) * d23);
                float sin7 = (float) (Math.sin(d21) * d23);
                if (f11 == 0.0f && f12 == 0.0f) {
                    path.lineTo(cos7, sin7);
                    f18 = f35;
                    f23 = cos7;
                } else {
                    f18 = f35;
                    Path path4 = path;
                    double atan23 = (float) (Math.atan2(f14, f13) - 1.5707963267948966d);
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    float f36 = f13;
                    float f37 = f14;
                    double atan24 = (float) (Math.atan2(sin7, cos7) - 1.5707963267948966d);
                    float cos9 = (float) Math.cos(atan24);
                    float sin9 = (float) Math.sin(atan24);
                    if (z10) {
                        f19 = f11;
                    } else {
                        f19 = f12;
                    }
                    if (z10) {
                        f20 = f12;
                    } else {
                        f20 = f11;
                    }
                    if (z10) {
                        f21 = floatValue5;
                    } else {
                        f21 = floatValue4;
                    }
                    if (z10) {
                        f22 = floatValue4;
                    } else {
                        f22 = floatValue5;
                    }
                    float f38 = f21 * f19 * 0.47829f;
                    float f39 = cos8 * f38;
                    float f40 = f38 * sin8;
                    float f41 = f22 * f20 * 0.47829f;
                    float f42 = cos9 * f41;
                    float f43 = f41 * sin9;
                    if (f35 != 0.0f) {
                        if (i11 == 0) {
                            f39 *= f18;
                            f40 *= f18;
                        } else if (d22 == ceil2 - 1.0d) {
                            f42 *= f18;
                            f43 *= f18;
                        }
                    }
                    f23 = cos7;
                    path = path4;
                    path.cubicTo(f36 - f39, f37 - f40, f42 + cos7, sin7 + f43, f23, sin7);
                }
                d21 += f17;
                z10 = !z10;
                i11++;
                f13 = f23;
                f14 = sin7;
                f35 = f18;
                f10 = 2.0f;
            }
            PointF pointF2 = (PointF) eVar.d();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f23530p.b(path);
        this.f23531q = z3;
        return path;
    }
}
