package q6;
import n.q;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements e, r6.a, c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23490a;

    /* renamed from: b, reason: collision with root package name */
    public final q f23491b = new q((Object) null);

    /* renamed from: c, reason: collision with root package name */
    public final q f23492c = new q((Object) null);

    /* renamed from: d, reason: collision with root package name */
    public final Path f23493d;
    public final p6.a e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f23494f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f23495g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23496h;
    public final r6.h i;

    /* renamed from: j, reason: collision with root package name */
    public final r6.f f23497j;

    /* renamed from: k, reason: collision with root package name */
    public final r6.h f23498k;

    /* renamed from: l, reason: collision with root package name */
    public final r6.h f23499l;

    /* renamed from: m, reason: collision with root package name */
    public final o6.j f23500m;

    /* renamed from: n, reason: collision with root package name */
    public final int f23501n;

    /* renamed from: o, reason: collision with root package name */
    public final r6.f f23502o;

    /* renamed from: p, reason: collision with root package name */
    public float f23503p;

    public h(o6.j jVar, o6.a aVar, x6.b bVar, w6.d dVar) {
        Path path = new Path();
        this.f23493d = path;
        this.e = new p6.a(1, 0);
        this.f23494f = new RectF();
        this.f23495g = new ArrayList();
        this.f23503p = 0.0f;
        this.f23490a = dVar.f27719g;
        this.f23500m = jVar;
        this.f23496h = dVar.f27714a;
        path.setFillType(dVar.f27715b);
        this.f23501n = (int) (aVar.b() / 32.0f);
        r6.e b10 = dVar.f27716c.b();
        this.i = (r6.h) b10;
        b10.a(this);
        bVar.e(b10);
        r6.e b11 = dVar.f27717d.b();
        this.f23497j = (r6.f) b11;
        b11.a(this);
        bVar.e(b11);
        r6.e b12 = dVar.e.b();
        this.f23498k = (r6.h) b12;
        b12.a(this);
        bVar.e(b12);
        r6.e b13 = dVar.f27718f.b();
        this.f23499l = (r6.h) b13;
        b13.a(this);
        bVar.e(b13);
        if (bVar.j() != null) {
            r6.f b14 = ((v6.b) bVar.j().f25764v).b();
            this.f23502o = b14;
            b14.a(this);
            bVar.e(b14);
        }
    }

    @Override // r6.a
    public final void a() {
        this.f23500m.invalidateSelf();
    }

    @Override // q6.c
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = (c) list2.get(i);
            if (cVar instanceof l) {
                this.f23495g.add((l) cVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
    @Override // q6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22, a7.b r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.h.c(android.graphics.Canvas, android.graphics.Matrix, int, a7.b):void");
    }

    @Override // q6.e
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f23493d;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23495g;
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

    public final int e() {
        int i;
        float f10 = this.f23498k.f24588d;
        float f11 = this.f23501n;
        int round = Math.round(f10 * f11);
        int round2 = Math.round(this.f23499l.f24588d * f11);
        int round3 = Math.round(this.i.f24588d * f11);
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }
}
