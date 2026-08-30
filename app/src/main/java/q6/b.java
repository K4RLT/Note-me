package q6;
import l.a;
import l.e;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements r6.a, c, e {
    public final o6.j e;

    /* renamed from: f, reason: collision with root package name */
    public final x6.b f23458f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f23460h;
    public final p6.a i;

    /* renamed from: j, reason: collision with root package name */
    public final r6.f f23461j;

    /* renamed from: k, reason: collision with root package name */
    public final r6.f f23462k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f23463l;

    /* renamed from: m, reason: collision with root package name */
    public final r6.f f23464m;

    /* renamed from: n, reason: collision with root package name */
    public final r6.f f23465n;

    /* renamed from: o, reason: collision with root package name */
    public float f23466o;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f23454a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f23455b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f23456c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f23457d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f23459g = new ArrayList();

    public b(o6.j jVar, x6.b bVar, Paint.Cap cap, Paint.Join join, float f10, v6.a aVar, v6.b bVar2, ArrayList arrayList, v6.b bVar3) {
        p6.a aVar2 = new p6.a(1, 0);
        this.i = aVar2;
        this.f23466o = 0.0f;
        this.e = jVar;
        this.f23458f = bVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f10);
        this.f23462k = (r6.f) aVar.b();
        this.f23461j = bVar2.b();
        if (bVar3 == null) {
            this.f23464m = null;
        } else {
            this.f23464m = bVar3.b();
        }
        this.f23463l = new ArrayList(arrayList.size());
        this.f23460h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f23463l.add(((v6.b) arrayList.get(i)).b());
        }
        bVar.e(this.f23462k);
        bVar.e(this.f23461j);
        for (int i10 = 0; i10 < this.f23463l.size(); i10++) {
            bVar.e((r6.e) this.f23463l.get(i10));
        }
        r6.e eVar = this.f23464m;
        if (eVar != null) {
            bVar.e(eVar);
        }
        this.f23462k.a(this);
        this.f23461j.a(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((r6.e) this.f23463l.get(i11)).a(this);
        }
        r6.f fVar = this.f23464m;
        if (fVar != null) {
            fVar.a(this);
        }
        if (bVar.j() != null) {
            r6.f b10 = ((v6.b) bVar.j().f25764v).b();
            this.f23465n = b10;
            b10.a(this);
            bVar.e(b10);
        }
    }

    @Override // r6.a
    public final void a() {
        this.e.invalidateSelf();
    }

    @Override // q6.c
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        s sVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.f23559c == 2) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.e(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f23459g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.f23559c == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(sVar3);
                    sVar3.e(this);
                    aVar = aVar2;
                }
            }
            if (cVar2 instanceof l) {
                if (aVar == null) {
                    aVar = new a(sVar);
                }
                aVar.f23452a.add((l) cVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override // q6.e
    public void c(Canvas canvas, Matrix matrix, int i, a7.b bVar) {
        int i10;
        float f10;
        float f11;
        float f12;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        float floatValue;
        b bVar2 = this;
        float[] fArr2 = (float[]) a7.e.get();
        boolean z3 = false;
        fArr2[0] = 0.0f;
        int i11 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            float f13 = 100.0f;
            float intValue = ((Integer) bVar2.f23462k.d()).intValue() / 100.0f;
            int c10 = a7.g.c((int) (i * intValue));
            p6.a aVar = bVar2.i;
            aVar.setAlpha(c10);
            aVar.setStrokeWidth(bVar2.f23461j.i());
            if (aVar.getStrokeWidth() > 0.0f) {
                ArrayList arrayList = bVar2.f23463l;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    while (true) {
                        int size = arrayList.size();
                        fArr = bVar2.f23460h;
                        if (i12 >= size) {
                            break;
                        }
                        float floatValue2 = ((Float) ((r6.e) arrayList.get(i12)).d()).floatValue();
                        fArr[i12] = floatValue2;
                        if (i12 % 2 == 0) {
                            if (floatValue2 < 1.0f) {
                                fArr[i12] = 1.0f;
                            }
                        } else if (floatValue2 < 0.1f) {
                            fArr[i12] = 0.1f;
                        }
                        i12++;
                    }
                    r6.f fVar = bVar2.f23464m;
                    if (fVar == null) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) fVar.d()).floatValue();
                    }
                    aVar.setPathEffect(new DashPathEffect(fArr, floatValue));
                }
                r6.f fVar2 = bVar2.f23465n;
                if (fVar2 != null) {
                    float floatValue3 = ((Float) fVar2.d()).floatValue();
                    if (floatValue3 == 0.0f) {
                        aVar.setMaskFilter(null);
                    } else if (floatValue3 != bVar2.f23466o) {
                        x6.b bVar3 = bVar2.f23458f;
                        if (bVar3.f30113y == floatValue3) {
                            blurMaskFilter = bVar3.f30114z;
                        } else {
                            BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                            bVar3.f30114z = blurMaskFilter2;
                            bVar3.f30113y = floatValue3;
                            blurMaskFilter = blurMaskFilter2;
                        }
                        aVar.setMaskFilter(blurMaskFilter);
                    }
                    bVar2.f23466o = floatValue3;
                }
                if (bVar != null) {
                    bVar.a((int) (intValue * 255.0f), aVar);
                }
                canvas.save();
                canvas.concat(matrix);
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = bVar2.f23459g;
                    if (i13 < arrayList2.size()) {
                        a aVar2 = (a) arrayList2.get(i13);
                        s sVar = aVar2.f23453b;
                        ArrayList arrayList3 = aVar2.f23452a;
                        Path path = bVar2.f23455b;
                        if (sVar != null) {
                            path.reset();
                            for (int size2 = arrayList3.size() - i11; size2 >= 0; size2--) {
                                path.addPath(((l) arrayList3.get(size2)).f());
                            }
                            float floatValue4 = ((Float) sVar.f23560d.d()).floatValue() / f13;
                            float floatValue5 = ((Float) sVar.e.d()).floatValue() / f13;
                            float floatValue6 = ((Float) sVar.f23561f.d()).floatValue() / 360.0f;
                            if (floatValue4 < 0.01f && floatValue5 > 0.99f) {
                                canvas.drawPath(path, aVar);
                            } else {
                                PathMeasure pathMeasure = bVar2.f23454a;
                                pathMeasure.setPath(path, z3);
                                float length = pathMeasure.getLength();
                                while (pathMeasure.nextContour()) {
                                    length += pathMeasure.getLength();
                                }
                                float f14 = floatValue6 * length;
                                float f15 = (floatValue4 * length) + f14;
                                float min = Math.min((floatValue5 * length) + f14, (f15 + length) - 1.0f);
                                int size3 = arrayList3.size() - i11;
                                float f16 = 0.0f;
                                while (size3 >= 0) {
                                    int i14 = i11;
                                    Path f17 = ((l) arrayList3.get(size3)).f();
                                    Path path2 = bVar2.f23456c;
                                    path2.set(f17);
                                    pathMeasure.setPath(path2, z3);
                                    float length2 = pathMeasure.getLength();
                                    if (min > length) {
                                        float f18 = min - length;
                                        if (f18 < f16 + length2 && f16 < f18) {
                                            if (f15 > length) {
                                                f12 = (f15 - length) / length2;
                                            } else {
                                                f12 = 0.0f;
                                            }
                                            a7.a(path2, f12, Math.min(f18 / length2, 1.0f), 0.0f);
                                            canvas.drawPath(path2, aVar);
                                            f16 += length2;
                                            size3--;
                                            bVar2 = this;
                                            i11 = i14;
                                            z3 = false;
                                        }
                                    }
                                    float f19 = f16 + length2;
                                    if (f19 >= f15 && f16 <= min) {
                                        if (f19 <= min && f15 < f16) {
                                            canvas.drawPath(path2, aVar);
                                        } else {
                                            if (f15 < f16) {
                                                f10 = 0.0f;
                                            } else {
                                                f10 = (f15 - f16) / length2;
                                            }
                                            if (min > f19) {
                                                f11 = 1.0f;
                                            } else {
                                                f11 = (min - f16) / length2;
                                            }
                                            a7.a(path2, f10, f11, 0.0f);
                                            canvas.drawPath(path2, aVar);
                                        }
                                    }
                                    f16 += length2;
                                    size3--;
                                    bVar2 = this;
                                    i11 = i14;
                                    z3 = false;
                                }
                            }
                            i10 = i11;
                        } else {
                            i10 = i11;
                            path.reset();
                            for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                                path.addPath(((l) arrayList3.get(size4)).f());
                            }
                            canvas.drawPath(path, aVar);
                        }
                        i13++;
                        bVar2 = this;
                        i11 = i10;
                        z3 = false;
                        f13 = 100.0f;
                    } else {
                        canvas.restore();
                        return;
                    }
                }
            }
        }
    }

    @Override // q6.e
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f23455b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23459g;
            if (i < arrayList.size()) {
                a aVar = (a) arrayList.get(i);
                for (int i10 = 0; i10 < aVar.f23452a.size(); i10++) {
                    path.addPath(((l) aVar.f23452a.get(i10)).f(), matrix);
                }
                i++;
            } else {
                RectF rectF2 = this.f23457d;
                path.computeBounds(rectF2, false);
                float i11 = this.f23461j.i() / 2.0f;
                rectF2.set(rectF2.left - i11, rectF2.top - i11, rectF2.right + i11, rectF2.bottom + i11);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }
}
