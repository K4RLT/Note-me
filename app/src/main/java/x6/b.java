package x6;
import b.c;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import g9.e2;
import j.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements q6.e, r6.a {
    public p6.a A;

    /* renamed from: a, reason: collision with root package name */
    public final Path f30091a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f30092b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f30093c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final p6.a f30094d = new p6.a(1, 0);
    public final p6.a e;

    /* renamed from: f, reason: collision with root package name */
    public final p6.a f30095f;

    /* renamed from: g, reason: collision with root package name */
    public final p6.a f30096g;

    /* renamed from: h, reason: collision with root package name */
    public final p6.a f30097h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f30098j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f30099k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f30100l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f30101m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f30102n;

    /* renamed from: o, reason: collision with root package name */
    public final o6.j f30103o;

    /* renamed from: p, reason: collision with root package name */
    public final e f30104p;

    /* renamed from: q, reason: collision with root package name */
    public final i0 f30105q;

    /* renamed from: r, reason: collision with root package name */
    public final r6.f f30106r;

    /* renamed from: s, reason: collision with root package name */
    public b f30107s;

    /* renamed from: t, reason: collision with root package name */
    public b f30108t;

    /* renamed from: u, reason: collision with root package name */
    public List f30109u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f30110v;

    /* renamed from: w, reason: collision with root package name */
    public final e2 f30111w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f30112x;

    /* renamed from: y, reason: collision with root package name */
    public float f30113y;

    /* renamed from: z, reason: collision with root package name */
    public BlurMaskFilter f30114z;

    public b(o6.j jVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new p6.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f30095f = new p6.a(mode2);
        p6.a aVar = new p6.a(1, 0);
        this.f30096g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        p6.a aVar2 = new p6.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f30097h = aVar2;
        this.i = new RectF();
        this.f30098j = new RectF();
        this.f30099k = new RectF();
        this.f30100l = new RectF();
        this.f30101m = new RectF();
        this.f30102n = new Matrix();
        this.f30110v = new ArrayList();
        this.f30112x = true;
        this.f30113y = 0.0f;
        this.f30103o = jVar;
        this.f30104p = eVar;
        List list = eVar.f30121h;
        if (eVar.f30133u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        v6.d dVar = eVar.i;
        dVar.getClass();
        e2 e2Var = new e2(dVar);
        this.f30111w = e2Var;
        e2Var.b(this);
        if (list != null && !list.isEmpty()) {
            i0 i0Var = new i0(list);
            this.f30105q = i0Var;
            ArrayList arrayList = (ArrayList) i0Var.f18636v;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((r6.e) obj).a(this);
            }
            ArrayList arrayList2 = (ArrayList) this.f30105q.f18637w;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                r6.e eVar2 = (r6.e) obj2;
                e(eVar2);
                eVar2.a(this);
            }
        }
        e eVar3 = this.f30104p;
        if (!eVar3.f30132t.isEmpty()) {
            r6.f fVar = new r6.f(1, eVar3.f30132t);
            this.f30106r = fVar;
            fVar.f24586b = true;
            fVar.a(new r6.a() { // from class: x6.a
                @Override // r6.a
                public final void a() {
                    boolean z3;
                    b bVar = b.this;
                    if (bVar.f30106r.i() == 1.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 != bVar.f30112x) {
                        bVar.f30112x = z3;
                        bVar.f30103o.invalidateSelf();
                    }
                }
            });
            boolean z3 = ((Float) this.f30106r.d()).floatValue() == 1.0f;
            if (z3 != this.f30112x) {
                this.f30112x = z3;
                this.f30103o.invalidateSelf();
            }
            e(this.f30106r);
            return;
        }
        if (true != this.f30112x) {
            this.f30112x = true;
            this.f30103o.invalidateSelf();
        }
    }

    @Override // r6.a
    public final void a() {
        this.f30103o.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fd  */
    @Override // q6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24, a7.b r25) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.c(android.graphics.Canvas, android.graphics.Matrix, int, a7.b):void");
    }

    @Override // q6.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        g();
        Matrix matrix2 = this.f30102n;
        matrix2.set(matrix);
        if (z3) {
            List list = this.f30109u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f30109u.get(size)).f30111w.d());
                }
            } else {
                b bVar = this.f30108t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f30111w.d());
                }
            }
        }
        matrix2.preConcat(this.f30111w.d());
    }

    public final void e(r6.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f30110v.add(eVar);
    }

    public final void g() {
        if (this.f30109u == null) {
            if (this.f30108t == null) {
                this.f30109u = Collections.EMPTY_LIST;
                return;
            }
            this.f30109u = new ArrayList();
            for (b bVar = this.f30108t; bVar != null; bVar = bVar.f30108t) {
                this.f30109u.add(bVar);
            }
        }
    }

    public final void h(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f30097h);
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i, a7.b bVar);

    public u.c j() {
        return this.f30104p.f30135w;
    }

    public final boolean k() {
        i0 i0Var = this.f30105q;
        if (i0Var != null && !((ArrayList) i0Var.f18636v).isEmpty()) {
            return true;
        }
        return false;
    }

    public final void l() {
        ic.c cVar = this.f30103o.f21819u.f21784a;
        String str = this.f30104p.f30117c;
        Object obj = cVar.f18393v;
    }

    public void m(float f10) {
        e2 e2Var = this.f30111w;
        r6.f fVar = (r6.f) e2Var.f17622k;
        if (fVar != null) {
            fVar.g(f10);
        }
        r6.f fVar2 = (r6.f) e2Var.f17625n;
        if (fVar2 != null) {
            fVar2.g(f10);
        }
        r6.f fVar3 = (r6.f) e2Var.f17626o;
        if (fVar3 != null) {
            fVar3.g(f10);
        }
        r6.i iVar = (r6.i) e2Var.f17619g;
        if (iVar != null) {
            iVar.g(f10);
        }
        r6.e eVar = (r6.e) e2Var.f17620h;
        if (eVar != null) {
            eVar.g(f10);
        }
        r6.h hVar = (r6.h) e2Var.i;
        if (hVar != null) {
            hVar.g(f10);
        }
        r6.f fVar4 = (r6.f) e2Var.f17621j;
        if (fVar4 != null) {
            fVar4.g(f10);
        }
        r6.f fVar5 = (r6.f) e2Var.f17623l;
        if (fVar5 != null) {
            fVar5.g(f10);
        }
        r6.f fVar6 = (r6.f) e2Var.f17624m;
        if (fVar6 != null) {
            fVar6.g(f10);
        }
        int i = 0;
        i0 i0Var = this.f30105q;
        if (i0Var != null) {
            ArrayList arrayList = (ArrayList) i0Var.f18636v;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((r6.e) arrayList.get(i10)).g(f10);
            }
        }
        r6.f fVar7 = this.f30106r;
        if (fVar7 != null) {
            fVar7.g(f10);
        }
        b bVar = this.f30107s;
        if (bVar != null) {
            bVar.m(f10);
        }
        while (true) {
            ArrayList arrayList2 = this.f30110v;
            if (i < arrayList2.size()) {
                ((r6.e) arrayList2.get(i)).g(f10);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // q6.c
    public final void b(List list, List list2) {
    }
}
