package q6;
import d.b;

import android.graphics.Matrix;
import android.graphics.Path;
import g9.e2;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class k implements l, j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f23513a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f23514b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f23515c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23516d = new ArrayList();
    public final w6.g e;

    public k(w6.g gVar) {
        this.e = gVar;
    }

    public final void a(Path.Op op) {
        Path path = this.f23514b;
        path.reset();
        Path path2 = this.f23513a;
        path2.reset();
        ArrayList arrayList = this.f23516d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            l lVar = (l) arrayList.get(size);
            if (lVar instanceof d) {
                d dVar = (d) lVar;
                ArrayList arrayList2 = (ArrayList) dVar.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path f10 = ((l) arrayList2.get(size2)).f();
                    Matrix matrix = dVar.f23470d;
                    e2 e2Var = dVar.f23475k;
                    if (e2Var != null) {
                        matrix = e2Var.d();
                    } else {
                        matrix.reset();
                    }
                    f10.transform(matrix);
                    path.addPath(f10);
                }
            } else {
                path.addPath(lVar.f());
            }
        }
        int i = 0;
        l lVar2 = (l) arrayList.get(0);
        if (lVar2 instanceof d) {
            d dVar2 = (d) lVar2;
            List e = dVar2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) e;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path f11 = ((l) arrayList3.get(i)).f();
                Matrix matrix2 = dVar2.f23470d;
                e2 e2Var2 = dVar2.f23475k;
                if (e2Var2 != null) {
                    matrix2 = e2Var2.d();
                } else {
                    matrix2.reset();
                }
                f11.transform(matrix2);
                path2.addPath(f11);
                i++;
            }
        } else {
            path2.set(lVar2.f());
        }
        this.f23515c.op(path2, path, op);
    }

    @Override // q6.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23516d;
            if (i < arrayList.size()) {
                ((l) arrayList.get(i)).b(list, list2);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // q6.j
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof l) {
                this.f23516d.add((l) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // q6.l
    public final Path f() {
        Path path = this.f23515c;
        path.reset();
        w6.g gVar = this.e;
        if (!gVar.f27735b) {
            int b10 = q0.b(gVar.f27734a);
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 == 4) {
                                a(Path.Op.XOR);
                                return path;
                            }
                        } else {
                            a(Path.Op.INTERSECT);
                            return path;
                        }
                    } else {
                        a(Path.Op.REVERSE_DIFFERENCE);
                        return path;
                    }
                } else {
                    a(Path.Op.UNION);
                    return path;
                }
            } else {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f23516d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((l) arrayList.get(i)).f());
                    i++;
                }
            }
        }
        return path;
    }
}
