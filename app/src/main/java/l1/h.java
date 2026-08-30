package l1;
import d.e;
import n.l;

import n.w;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final w f19842a;

    static {
        q qVar = e;
        int i = qVar.f19812c;
        g gVar = new g(qVar, qVar, 1);
        int i10 = qVar.f19812c;
        l lVar = d.f19834x;
        int i11 = (lVar.f19812c << 6) | i10;
        g gVar2 = new g(qVar, lVar, 0);
        int i12 = (i10 << 6) | lVar.f19812c;
        g gVar3 = new g(lVar, qVar, 0);
        w wVar = l.f20912a;
        w wVar2 = new w();
        wVar2.i(i | (i << 6), gVar);
        wVar2.i(i11, gVar2);
        wVar2.i(i12, gVar3);
        f19842a = wVar2;
    }
}
