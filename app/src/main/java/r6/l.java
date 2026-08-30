package r6;
import d.a;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import q6.p;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: h, reason: collision with root package name */
    public final w6.k f24606h;
    public final Path i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f24607j;

    public l(List list) {
        super(list);
        this.f24606h = new w6.k();
        this.i = new Path();
    }

    @Override // r6.e
    public final Object e(b7.a aVar, float f10) {
        boolean z3;
        int i;
        PointF pointF;
        PointF pointF2;
        boolean z9;
        w6.k kVar;
        float f11;
        boolean z10;
        PointF pointF3;
        PointF pointF4;
        boolean z11;
        w6.k kVar2 = (w6.k) aVar.f1794b;
        w6.k kVar3 = (w6.k) aVar.f1795c;
        if (kVar3 == null) {
            kVar3 = kVar2;
        }
        w6.k kVar4 = this.f24606h;
        ArrayList arrayList = kVar4.f27749a;
        if (kVar4.f27750b == null) {
            kVar4.f27750b = new PointF();
        }
        boolean z12 = kVar2.f27751c;
        ArrayList arrayList2 = kVar2.f27749a;
        boolean z13 = true;
        if (!z12 && !kVar3.f27751c) {
            z3 = false;
        } else {
            z3 = true;
        }
        kVar4.f27751c = z3;
        int size = arrayList2.size();
        ArrayList arrayList3 = kVar3.f27749a;
        if (size != arrayList3.size()) {
            a7.a("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int min = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < min) {
            for (int size2 = arrayList.size(); size2 < min; size2++) {
                arrayList.add(new u6.a());
            }
        } else if (arrayList.size() > min) {
            for (int size3 = arrayList.size() - 1; size3 >= min; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF5 = kVar2.f27750b;
        PointF pointF6 = kVar3.f27750b;
        kVar4.a(a7.g.e(pointF5.x, pointF6.x, f10), a7.g.e(pointF5.y, pointF6.y, f10));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            u6.a aVar2 = (u6.a) arrayList2.get(size4);
            u6.a aVar3 = (u6.a) arrayList3.get(size4);
            PointF pointF7 = aVar2.f25856a;
            PointF pointF8 = aVar2.f25857b;
            PointF pointF9 = aVar2.f25858c;
            PointF pointF10 = aVar3.f25856a;
            PointF pointF11 = aVar3.f25857b;
            PointF pointF12 = aVar3.f25858c;
            ((u6.a) arrayList.get(size4)).f25856a.set(a7.g.e(pointF7.x, pointF10.x, f10), a7.g.e(pointF7.y, pointF10.y, f10));
            ((u6.a) arrayList.get(size4)).f25857b.set(a7.g.e(pointF8.x, pointF11.x, f10), a7.g.e(pointF8.y, pointF11.y, f10));
            ((u6.a) arrayList.get(size4)).f25858c.set(a7.g.e(pointF9.x, pointF12.x, f10), a7.g.e(pointF9.y, pointF12.y, f10));
            size4--;
            z13 = z13;
        }
        boolean z14 = z13;
        ArrayList arrayList4 = this.f24607j;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            while (true) {
                ArrayList arrayList5 = kVar4.f27749a;
                if (size5 < 0) {
                    break;
                }
                p pVar = (p) this.f24607j.get(size5);
                pVar.getClass();
                if (arrayList5.size() > 2) {
                    float floatValue = ((Float) pVar.f23548b.d()).floatValue();
                    if (floatValue != 0.0f) {
                        boolean z15 = kVar4.f27751c;
                        int i10 = 0;
                        for (int size6 = arrayList5.size() - 1; size6 >= 0; size6--) {
                            u6.a aVar4 = (u6.a) arrayList5.get(size6);
                            u6.a aVar5 = (u6.a) arrayList5.get(p.e(size6 - 1, arrayList5.size()));
                            if (size6 == 0 && !z15) {
                                pointF3 = kVar4.f27750b;
                            } else {
                                pointF3 = aVar5.f25858c;
                            }
                            if (size6 == 0 && !z15) {
                                pointF4 = pointF3;
                            } else {
                                pointF4 = aVar5.f25857b;
                            }
                            PointF pointF13 = aVar4.f25856a;
                            if (!kVar4.f27751c && (size6 == 0 || size6 == arrayList5.size() - 1)) {
                                z11 = z14;
                            } else {
                                z11 = false;
                            }
                            if (pointF4.equals(pointF3) && pointF13.equals(pointF3) && !z11) {
                                i10 += 2;
                            } else {
                                i10++;
                            }
                        }
                        w6.k kVar5 = pVar.f23549c;
                        if (kVar5 != null && kVar5.f27749a.size() == i10) {
                            i = 0;
                        } else {
                            ArrayList arrayList6 = new ArrayList(i10);
                            for (int i11 = 0; i11 < i10; i11++) {
                                arrayList6.add(new u6.a());
                            }
                            i = 0;
                            pVar.f23549c = new w6.k(new PointF(0.0f, 0.0f), false, arrayList6);
                        }
                        w6.k kVar6 = pVar.f23549c;
                        kVar6.f27751c = z15;
                        PointF pointF14 = kVar4.f27750b;
                        kVar6.a(pointF14.x, pointF14.y);
                        ArrayList arrayList7 = kVar6.f27749a;
                        boolean z16 = kVar4.f27751c;
                        int i12 = i;
                        int i13 = i12;
                        while (i12 < arrayList5.size()) {
                            u6.a aVar6 = (u6.a) arrayList5.get(i12);
                            u6.a aVar7 = (u6.a) arrayList5.get(p.e(i12 - 1, arrayList5.size()));
                            u6.a aVar8 = (u6.a) arrayList5.get(p.e(i12 - 2, arrayList5.size()));
                            if (i12 == 0 && !z16) {
                                pointF = kVar4.f27750b;
                            } else {
                                pointF = aVar7.f25858c;
                            }
                            if (i12 == 0 && !z16) {
                                pointF2 = pointF;
                            } else {
                                pointF2 = aVar7.f25857b;
                            }
                            PointF pointF15 = aVar6.f25856a;
                            PointF pointF16 = aVar8.f25858c;
                            int i14 = size5;
                            PointF pointF17 = aVar6.f25858c;
                            ArrayList arrayList8 = arrayList5;
                            if (!kVar4.f27751c && (i12 == 0 || i12 == arrayList8.size() - 1)) {
                                z9 = z14;
                            } else {
                                z9 = false;
                            }
                            if (pointF2.equals(pointF) && pointF15.equals(pointF) && !z9) {
                                float f12 = pointF.x;
                                float f13 = f12 - pointF16.x;
                                float f14 = pointF.y;
                                float f15 = f14 - pointF16.y;
                                float f16 = pointF17.x - f12;
                                float f17 = pointF17.y - f14;
                                kVar = kVar4;
                                f11 = floatValue;
                                float hypot = (float) Math.hypot(f13, f15);
                                float hypot2 = (float) Math.hypot(f16, f17);
                                float min2 = Math.min(f11 / hypot, 0.5f);
                                float min3 = Math.min(f11 / hypot2, 0.5f);
                                float f18 = pointF.x;
                                float x9 = g3.a.x(pointF16.x, f18, min2, f18);
                                float f19 = pointF.y;
                                float x10 = g3.a.x(pointF16.y, f19, min2, f19);
                                float x11 = g3.a.x(pointF17.x, f18, min3, f18);
                                float x12 = g3.a.x(pointF17.y, f19, min3, f19);
                                float f20 = x9 - ((x9 - f18) * 0.5519f);
                                float f21 = x10 - ((x10 - f19) * 0.5519f);
                                float f22 = x11 - ((x11 - f18) * 0.5519f);
                                float f23 = x12 - ((x12 - f19) * 0.5519f);
                                u6.a aVar9 = (u6.a) arrayList7.get(p.e(i13 - 1, arrayList7.size()));
                                u6.a aVar10 = (u6.a) arrayList7.get(i13);
                                z10 = z16;
                                aVar9.f25857b.set(x9, x10);
                                aVar9.f25858c.set(x9, x10);
                                if (i12 == 0) {
                                    kVar6.a(x9, x10);
                                }
                                aVar10.f25856a.set(f20, f21);
                                u6.a aVar11 = (u6.a) arrayList7.get(i13 + 1);
                                aVar10.f25857b.set(f22, f23);
                                aVar10.f25858c.set(x11, x12);
                                aVar11.f25856a.set(x11, x12);
                                i13 += 2;
                            } else {
                                kVar = kVar4;
                                f11 = floatValue;
                                z10 = z16;
                                u6.a aVar12 = (u6.a) arrayList7.get(p.e(i13 - 1, arrayList7.size()));
                                u6.a aVar13 = (u6.a) arrayList7.get(i13);
                                PointF pointF18 = aVar7.f25857b;
                                aVar12.f25857b.set(pointF18.x, pointF18.y);
                                PointF pointF19 = aVar7.f25858c;
                                aVar12.f25858c.set(pointF19.x, pointF19.y);
                                PointF pointF20 = aVar6.f25856a;
                                aVar13.f25856a.set(pointF20.x, pointF20.y);
                                i13++;
                            }
                            i12++;
                            size5 = i14;
                            arrayList5 = arrayList8;
                            kVar4 = kVar;
                            floatValue = f11;
                            z16 = z10;
                        }
                        kVar4 = kVar6;
                    }
                }
                size5--;
            }
        }
        Path path = this.i;
        path.reset();
        PointF pointF21 = kVar4.f27750b;
        ArrayList arrayList9 = kVar4.f27749a;
        path.moveTo(pointF21.x, pointF21.y);
        PointF pointF22 = a7.g.f315a;
        pointF22.set(pointF21.x, pointF21.y);
        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
            u6.a aVar14 = (u6.a) arrayList9.get(i15);
            PointF pointF23 = aVar14.f25856a;
            PointF pointF24 = aVar14.f25857b;
            PointF pointF25 = aVar14.f25858c;
            if (pointF23.equals(pointF22) && pointF24.equals(pointF25)) {
                path.lineTo(pointF25.x, pointF25.y);
            } else {
                path.cubicTo(pointF23.x, pointF23.y, pointF24.x, pointF24.y, pointF25.x, pointF25.y);
            }
            pointF22.set(pointF25.x, pointF25.y);
        }
        if (kVar4.f27751c) {
            path.close();
        }
        return path;
    }

    @Override // r6.e
    public final boolean h() {
        ArrayList arrayList = this.f24607j;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }
}
