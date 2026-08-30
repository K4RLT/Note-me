package q6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import g9.e2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o implements e, l, j, r6.a, c {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f23540a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f23541b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final o6.j f23542c;

    /* renamed from: d, reason: collision with root package name */
    public final x6.b f23543d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final r6.f f23544f;

    /* renamed from: g, reason: collision with root package name */
    public final r6.f f23545g;

    /* renamed from: h, reason: collision with root package name */
    public final e2 f23546h;
    public d i;

    public o(o6.j jVar, x6.b bVar, w6.i iVar) {
        this.f23542c = jVar;
        this.f23543d = bVar;
        this.e = iVar.f27746c;
        r6.f b10 = iVar.f27745b.b();
        this.f23544f = b10;
        bVar.e(b10);
        b10.a(this);
        r6.f b11 = ((v6.b) iVar.f27747d).b();
        this.f23545g = b11;
        bVar.e(b11);
        b11.a(this);
        v6.d dVar = (v6.d) iVar.e;
        dVar.getClass();
        e2 e2Var = new e2(dVar);
        this.f23546h = e2Var;
        e2Var.a(bVar);
        e2Var.b(this);
    }

    @Override // r6.a
    public final void a() {
        this.f23542c.invalidateSelf();
    }

    @Override // q6.c
    public final void b(List list, List list2) {
        this.i.b(list, list2);
    }

    @Override // q6.e
    public final void c(Canvas canvas, Matrix matrix, int i, a7.b bVar) {
        float floatValue = ((Float) this.f23544f.d()).floatValue();
        float floatValue2 = ((Float) this.f23545g.d()).floatValue();
        e2 e2Var = this.f23546h;
        float floatValue3 = ((Float) ((r6.f) e2Var.f17625n).d()).floatValue() / 100.0f;
        float floatValue4 = ((Float) ((r6.f) e2Var.f17626o).d()).floatValue() / 100.0f;
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix2 = this.f23540a;
            matrix2.set(matrix);
            float f10 = i10;
            matrix2.preConcat(e2Var.e(f10 + floatValue2));
            this.i.c(canvas, matrix2, (int) (a7.g.e(floatValue3, floatValue4, f10 / floatValue) * i), bVar);
        }
    }

    @Override // q6.e
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        this.i.d(rectF, matrix, z3);
    }

    @Override // q6.j
    public final void e(ListIterator listIterator) {
        if (this.i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.i = new d(this.f23542c, this.f23543d, this.e, arrayList, null);
    }

    @Override // q6.l
    public final Path f() {
        Path f10 = this.i.f();
        Path path = this.f23541b;
        path.reset();
        float floatValue = ((Float) this.f23544f.d()).floatValue();
        float floatValue2 = ((Float) this.f23545g.d()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            Matrix e = this.f23546h.e(i + floatValue2);
            Matrix matrix = this.f23540a;
            matrix.set(e);
            path.addPath(f10, matrix);
        }
        return path;
    }
}
