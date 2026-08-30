package b1;

import b8.z8;
import w7.t9;
import wa.s8;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1383u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f1384v;

    public /* synthetic */ o(int i, df.l lVar) {
        this.f1383u = i;
        this.f1384v = lVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        boolean z9;
        switch (this.f1383u) {
            case 0:
                i iVar = (i) this.f1384v.invoke((m) obj);
                synchronized (p.f1387c) {
                    p.f1388d = p.f1388d.n(iVar.g());
                }
                return iVar;
            case 1:
                df.l lVar = this.f1384v;
                ((r0.j0) obj).getClass();
                return new z8(0, lVar);
            case 2:
                df.l lVar2 = this.f1384v;
                z1.x xVar = (z1.x) obj;
                xVar.getClass();
                long f10 = xVar.f(0L);
                float k3 = (int) (xVar.k() >> 32);
                float k4 = (int) (xVar.k() & 4294967295L);
                lVar2.invoke(s8.a(f10, (Float.floatToRawIntBits(k3) << 32) | (Float.floatToRawIntBits(k4) & 4294967295L)));
                return pe.z.f22715a;
            case 3:
                df.l lVar3 = this.f1384v;
                e7.j jVar = (e7.j) obj;
                jVar.getClass();
                if (jVar == e7.j.EARNED) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                lVar3.invoke(Boolean.valueOf(z3));
                return pe.z.f22715a;
            case 4:
                df.l lVar4 = this.f1384v;
                if (((e7.j) obj) == e7.j.EARNED) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                lVar4.invoke(Boolean.valueOf(z9));
                return pe.z.f22715a;
            case 5:
                df.l lVar5 = this.f1384v;
                ((r0.j0) obj).getClass();
                return new z8(1, lVar5);
            case 6:
                df.l lVar6 = this.f1384v;
                z1.x xVar2 = (z1.x) obj;
                xVar2.getClass();
                lVar6.invoke(Integer.valueOf((int) (xVar2.k() & 4294967295L)));
                return pe.z.f22715a;
            case 7:
                df.l lVar7 = this.f1384v;
                String str = (String) obj;
                str.getClass();
                return (k1.f) lVar7.invoke(str);
            case 8:
                df.l lVar8 = this.f1384v;
                t9 t9Var = (t9) obj;
                t9Var.getClass();
                lVar8.invoke("frames/" + t9Var.f29155a.f29080a);
                return pe.z.f22715a;
            case 9:
                df.l lVar9 = this.f1384v;
                t9 t9Var2 = (t9) obj;
                t9Var2.getClass();
                lVar9.invoke("stickers/" + t9Var2.f29155a.f29080a);
                return pe.z.f22715a;
            default:
                df.l lVar10 = this.f1384v;
                h8.e eVar = (h8.e) obj;
                eVar.getClass();
                if (eVar.f17922c) {
                    lVar10.invoke(new k1.r(eVar.f17920a));
                }
                return pe.z.f22715a;
        }
    }
}
