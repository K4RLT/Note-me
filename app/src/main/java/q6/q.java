package q6;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements l, r6.a, c {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23551b;

    /* renamed from: c, reason: collision with root package name */
    public final o6.j f23552c;

    /* renamed from: d, reason: collision with root package name */
    public final r6.l f23553d;
    public boolean e;

    /* renamed from: a, reason: collision with root package name */
    public final Path f23550a = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final f4.h f23554f = new f4.h(2);

    public q(o6.j jVar, x6.b bVar, w6.n nVar) {
        this.f23551b = nVar.f27762d;
        this.f23552c = jVar;
        r6.l lVar = new r6.l((List) nVar.f27761c.f3443v);
        this.f23553d = lVar;
        bVar.e(lVar);
        lVar.a(this);
    }

    @Override // r6.a
    public final void a() {
        this.e = false;
        this.f23552c.invalidateSelf();
    }

    @Override // q6.c
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i < arrayList2.size()) {
                c cVar = (c) arrayList2.get(i);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f23559c == 1) {
                        this.f23554f.f16717a.add(sVar);
                        sVar.e(this);
                        i++;
                    }
                }
                if (cVar instanceof p) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    p pVar = (p) cVar;
                    pVar.f23548b.a(this);
                    arrayList.add(pVar);
                }
                i++;
            } else {
                this.f23553d.f24607j = arrayList;
                return;
            }
        }
    }

    @Override // q6.l
    public final Path f() {
        boolean z3 = this.e;
        r6.l lVar = this.f23553d;
        Path path = this.f23550a;
        if (z3) {
            lVar.getClass();
            return path;
        }
        path.reset();
        if (this.f23551b) {
            this.e = true;
            return path;
        }
        Path path2 = (Path) lVar.d();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f23554f.b(path);
        this.e = true;
        return path;
    }
}
