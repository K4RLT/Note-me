package q6;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements e, r6.a, c {

    /* renamed from: a, reason: collision with root package name */
    public final Path f23482a;

    /* renamed from: b, reason: collision with root package name */
    public final p6.a f23483b;

    /* renamed from: c, reason: collision with root package name */
    public final x6.b f23484c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23485d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final r6.f f23486f;

    /* renamed from: g, reason: collision with root package name */
    public final r6.f f23487g;

    /* renamed from: h, reason: collision with root package name */
    public final o6.j f23488h;
    public final r6.f i;

    /* renamed from: j, reason: collision with root package name */
    public float f23489j;

    public g(o6.j jVar, x6.b bVar, w6.l lVar) {
        Path path = new Path();
        this.f23482a = path;
        this.f23483b = new p6.a(1, 0);
        this.e = new ArrayList();
        this.f23484c = bVar;
        v6.a aVar = lVar.f27755d;
        v6.a aVar2 = lVar.f27754c;
        this.f23485d = lVar.e;
        this.f23488h = jVar;
        if (bVar.j() != null) {
            r6.f b10 = ((v6.b) bVar.j().f25764v).b();
            this.i = b10;
            b10.a(this);
            bVar.e(b10);
        }
        if (aVar2 != null) {
            path.setFillType(lVar.f27753b);
            r6.e b11 = aVar2.b();
            this.f23486f = (r6.f) b11;
            b11.a(this);
            bVar.e(b11);
            r6.e b12 = aVar.b();
            this.f23487g = (r6.f) b12;
            b12.a(this);
            bVar.e(b12);
            return;
        }
        this.f23486f = null;
        this.f23487g = null;
    }

    @Override // r6.a
    public final void a() {
        this.f23488h.invalidateSelf();
    }

    @Override // q6.c
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = (c) list2.get(i);
            if (cVar instanceof l) {
                this.e.add((l) cVar);
            }
        }
    }

    @Override // q6.e
    public final void c(Canvas canvas, Matrix matrix, int i, a7.b bVar) {
        BlurMaskFilter blurMaskFilter;
        if (this.f23485d) {
            return;
        }
        r6.f fVar = this.f23486f;
        float intValue = ((Integer) this.f23487g.d()).intValue() / 100.0f;
        int c10 = (a7.g.c((int) (i * intValue)) << 24) | (fVar.k(fVar.f24587c.b(), fVar.b()) & 16777215);
        p6.a aVar = this.f23483b;
        aVar.setColor(c10);
        r6.f fVar2 = this.i;
        if (fVar2 != null) {
            float floatValue = ((Float) fVar2.d()).floatValue();
            if (floatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f23489j) {
                x6.b bVar2 = this.f23484c;
                if (bVar2.f30113y == floatValue) {
                    blurMaskFilter = bVar2.f30114z;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar2.f30114z = blurMaskFilter2;
                    bVar2.f30113y = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.f23489j = floatValue;
        }
        if (bVar != null) {
            bVar.a((int) (intValue * 255.0f), aVar);
        } else {
            aVar.clearShadowLayer();
        }
        Path path = this.f23482a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                path.addPath(((l) arrayList.get(i10)).f(), matrix);
                i10++;
            } else {
                canvas.drawPath(path, aVar);
                return;
            }
        }
    }

    @Override // q6.e
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f23482a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                path.addPath(((l) arrayList.get(i)).f(), matrix);
                i++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }
}
