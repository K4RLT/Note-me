package q6;
import d.c;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import c7.x;
import g9.e2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements e, l, r6.a {

    /* renamed from: a, reason: collision with root package name */
    public final x f23467a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f23468b;

    /* renamed from: c, reason: collision with root package name */
    public final a7.j f23469c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f23470d;
    public final Path e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f23471f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23472g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f23473h;
    public final o6.j i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f23474j;

    /* renamed from: k, reason: collision with root package name */
    public final e2 f23475k;

    public d(o6.j jVar, x6.b bVar, boolean z3, ArrayList arrayList, v6.d dVar) {
        this.f23467a = new x(1, (byte) 0);
        this.f23468b = new RectF();
        this.f23469c = new a7.j();
        this.f23470d = new Matrix();
        this.e = new Path();
        this.f23471f = new RectF();
        this.i = jVar;
        this.f23472g = z3;
        this.f23473h = arrayList;
        if (dVar != null) {
            e2 e2Var = new e2(dVar);
            this.f23475k = e2Var;
            e2Var.a(bVar);
            e2Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // r6.a
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // q6.c
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f23473h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067  */
    @Override // q6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r8, android.graphics.Matrix r9, int r10, a7.b r11) {
        /*
            r7 = this;
            boolean r0 = r7.f23472g
            if (r0 == 0) goto L6
            goto Lbb
        L6:
            android.graphics.Matrix r0 = r7.f23470d
            r0.set(r9)
            g9.e2 r1 = r7.f23475k
            if (r1 == 0) goto L34
            android.graphics.Matrix r2 = r1.d()
            r0.preConcat(r2)
            java.lang.Object r1 = r1.f17622k
            r6.f r1 = (r6.f) r1
            if (r1 != 0) goto L1f
            r1 = 100
            goto L29
        L1f:
            java.lang.Object r1 = r1.d()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L29:
            float r1 = (float) r1
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            float r10 = (float) r10
            float r1 = r1 * r10
            r10 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r10
            float r1 = r1 * r10
            int r10 = (int) r1
        L34:
            o6.j r1 = r7.i
            r1.getClass()
            r2 = 1
            if (r11 == 0) goto L61
            boolean r1 = r1.E
            if (r1 == 0) goto L61
            r1 = 0
            r3 = r1
            r4 = r3
        L43:
            java.util.ArrayList r5 = r7.f23473h
            int r6 = r5.size()
            if (r3 >= r6) goto L5d
            java.lang.Object r5 = r5.get(r3)
            boolean r5 = r5 instanceof q6.e
            if (r5 == 0) goto L5a
            int r4 = r4 + 1
            r5 = 2
            if (r4 < r5) goto L5a
            r1 = 1
            goto L5d
        L5a:
            int r3 = r3 + 1
            goto L43
        L5d:
            if (r1 == 0) goto L61
            r1 = r2
            goto L62
        L61:
            r1 = 0
        L62:
            if (r1 == 0) goto L67
            r3 = 255(0xff, float:3.57E-43)
            goto L68
        L67:
            r3 = r10
        L68:
            a7.j r4 = r7.f23469c
            if (r1 == 0) goto L92
            android.graphics.RectF r5 = r7.f23468b
            r6 = 0
            r5.set(r6, r6, r6, r6)
            r7.d(r5, r9, r2)
            c7.x r9 = r7.f23467a
            r9.f4002v = r10
            r10 = 0
            if (r11 == 0) goto L8b
            int r6 = r11.f302d
            int r6 = android.graphics.Color.alpha(r6)
            if (r6 <= 0) goto L87
            r9.f4003w = r11
            goto L89
        L87:
            r9.f4003w = r10
        L89:
            r11 = r10
            goto L8d
        L8b:
            r9.f4003w = r10
        L8d:
            android.graphics.Canvas r8 = r4.e(r8, r5, r9)
            goto L9d
        L92:
            if (r11 == 0) goto L9d
            a7.b r9 = new a7.b
            r9.<init>(r11)
            r9.b(r3)
            r11 = r9
        L9d:
            java.util.ArrayList r9 = r7.f23473h
            int r10 = r9.size()
            int r10 = r10 - r2
        La4:
            if (r10 < 0) goto Lb6
            java.lang.Object r2 = r9.get(r10)
            boolean r5 = r2 instanceof q6.e
            if (r5 == 0) goto Lb3
            q6.e r2 = (q6.e) r2
            r2.c(r8, r0, r3, r11)
        Lb3:
            int r10 = r10 + (-1)
            goto La4
        Lb6:
            if (r1 == 0) goto Lbb
            r4.c()
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.c(android.graphics.Canvas, android.graphics.Matrix, int, a7.b):void");
    }

    @Override // q6.e
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        Matrix matrix2 = this.f23470d;
        matrix2.set(matrix);
        e2 e2Var = this.f23475k;
        if (e2Var != null) {
            matrix2.preConcat(e2Var.d());
        }
        RectF rectF2 = this.f23471f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f23473h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(rectF2, matrix2, z3);
                rectF.union(rectF2);
            }
        }
    }

    public final List e() {
        if (this.f23474j == null) {
            this.f23474j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f23473h;
                if (i >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i);
                if (cVar instanceof l) {
                    this.f23474j.add((l) cVar);
                }
                i++;
            }
        }
        return this.f23474j;
    }

    @Override // q6.l
    public final Path f() {
        Matrix matrix = this.f23470d;
        matrix.reset();
        e2 e2Var = this.f23475k;
        if (e2Var != null) {
            matrix.set(e2Var.d());
        }
        Path path = this.e;
        path.reset();
        if (!this.f23472g) {
            ArrayList arrayList = this.f23473h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                if (cVar instanceof l) {
                    path.addPath(((l) cVar).f(), matrix);
                }
            }
        }
        return path;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(o6.j r8, x6.b r9, w6.m r10, o6.a r11) {
        /*
            r7 = this;
            java.lang.String r0 = r10.f27756a
            boolean r4 = r10.f27758c
            java.util.List r10 = r10.f27757b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r10.size()
            r5.<init>(r0)
            r0 = 0
            r1 = r0
        L11:
            int r2 = r10.size()
            if (r1 >= r2) goto L29
            java.lang.Object r2 = r10.get(r1)
            w6.b r2 = (w6.b) r2
            q6.c r2 = r2.a(r8, r11, r9)
            if (r2 == 0) goto L26
            r5.add(r2)
        L26:
            int r1 = r1 + 1
            goto L11
        L29:
            int r11 = r10.size()
            if (r0 >= r11) goto L43
            java.lang.Object r11 = r10.get(r0)
            w6.b r11 = (w6.b) r11
            boolean r1 = r11 instanceof v6.d
            if (r1 == 0) goto L40
            v6.d r11 = (v6.d) r11
        L3b:
            r1 = r7
            r2 = r8
            r3 = r9
            r6 = r11
            goto L45
        L40:
            int r0 = r0 + 1
            goto L29
        L43:
            r11 = 0
            goto L3b
        L45:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.d.<init>(o6.j, x6.b, w6.m, o6.a):void");
    }
}
