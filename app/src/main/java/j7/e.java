package j7;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18998a;

    public final void a(p5.c cVar, Object obj) {
        switch (this.f18998a) {
            case 0:
                k7.c cVar2 = (k7.c) obj;
                cVar.getClass();
                cVar.s(1, cVar2.f19594a);
                cVar.s(2, cVar2.f19595b);
                cVar.b(3, cVar2.f19596c);
                cVar.b(4, cVar2.f19597d);
                cVar.s(5, cVar2.e);
                cVar.b(6, cVar2.f19598f);
                cVar.c(cVar2.f19599g, 7);
                cVar.c(cVar2.f19600h, 8);
                cVar.c(cVar2.i, 9);
                cVar.c(cVar2.f19601j, 10);
                cVar.s(11, cVar2.f19602k);
                cVar.b(12, cVar2.f19603l);
                return;
            case 1:
                k7.f fVar = (k7.f) obj;
                cVar.getClass();
                cVar.s(1, fVar.f19605a);
                cVar.s(2, fVar.f19606b);
                cVar.b(3, fVar.f19607c);
                cVar.c(fVar.f19608d, 4);
                cVar.c(fVar.e, 5);
                cVar.c(fVar.f19609f, 6);
                cVar.b(7, fVar.f19610g);
                String str = fVar.f19611h;
                if (str == null) {
                    cVar.g(8);
                } else {
                    cVar.s(8, str);
                }
                String str2 = fVar.i;
                if (str2 == null) {
                    cVar.g(9);
                } else {
                    cVar.s(9, str2);
                }
                String str3 = fVar.f19612j;
                if (str3 == null) {
                    cVar.g(10);
                } else {
                    cVar.s(10, str3);
                }
                String str4 = fVar.f19613k;
                if (str4 == null) {
                    cVar.g(11);
                } else {
                    cVar.s(11, str4);
                }
                cVar.b(12, fVar.f19614l);
                cVar.b(13, fVar.f19615m);
                return;
            default:
                k7.i iVar = (k7.i) obj;
                cVar.getClass();
                cVar.s(1, iVar.f19617a);
                cVar.s(2, iVar.f19618b);
                cVar.b(3, iVar.f19619c);
                cVar.b(4, iVar.f19620d);
                cVar.b(5, iVar.e);
                return;
        }
    }

    public final String b() {
        switch (this.f18998a) {
            case 0:
                return "INSERT OR REPLACE INTO `canvas_elements` (`id`,`notebookId`,`spreadIndex`,`pageSide`,`type`,`zIndex`,`x`,`y`,`scale`,`rotation`,`payload`,`createdAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `notebooks` (`id`,`title`,`pageCount`,`colorR`,`colorG`,`colorB`,`orderIndex`,`coverConfig`,`backgroundConfig`,`sizeId`,`stackId`,`createdAt`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `stacks` (`id`,`title`,`orderIndex`,`createdAt`,`updatedAt`) VALUES (?,?,?,?,?)";
        }
    }

    public void c(p5.a aVar, Object obj) {
        aVar.getClass();
        p5.c T = aVar.T(b());
        try {
            a(T, obj);
            T.P();
            ug.a.b(T, null);
        } finally {
        }
    }

    public void d(p5.a aVar, ArrayList arrayList) {
        aVar.getClass();
        p5.c T = aVar.T(b());
        try {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (obj != null) {
                    a(T, obj);
                    T.P();
                    T.reset();
                }
            }
            ug.a.b(T, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ug.a.b(T, th);
                throw th2;
            }
        }
    }
}
