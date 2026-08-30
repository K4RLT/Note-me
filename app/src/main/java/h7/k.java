package h7;

import eg.b1;
import eg.e0;
import eg.k0;
import eg.r0;
import eg.y;
import gg.t;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final k f17903a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, java.lang.Object, h7.k] */
    static {
        Object obj = new Object();
        f17903a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.export.ScrapManifest", obj, 8);
        r0Var.k("formatVersion", true);
        r0Var.k("notebookId", false);
        r0Var.k("title", false);
        r0Var.k("exportedAt", false);
        r0Var.k("originalAppVersion", false);
        r0Var.k("minReaderVersion", true);
        r0Var.k("writerVersion", true);
        r0Var.k("elementCount", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(t tVar, Object obj) {
        m mVar = (m) obj;
        mVar.getClass();
        int i = mVar.f17904a;
        cg.d dVar = descriptor;
        t a10 = tVar.a(dVar);
        if (a10.x(dVar) || i != 1) {
            a10.m(0, i, dVar);
        }
        String str = mVar.f17905b;
        int i10 = mVar.f17910h;
        int i11 = mVar.f17909g;
        int i12 = mVar.f17908f;
        a10.v(dVar, 1, str);
        a10.v(dVar, 2, mVar.f17906c);
        a10.o(dVar, 3, mVar.f17907d);
        a10.v(dVar, 4, mVar.e);
        if (a10.x(dVar) || i12 != 1) {
            a10.m(5, i12, dVar);
        }
        if (a10.x(dVar) || i11 != 1) {
            a10.m(6, i11, dVar);
        }
        if (a10.x(dVar) || i10 != 0) {
            a10.m(7, i10, dVar);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        boolean z3 = true;
        while (z3) {
            int t3 = k3.t(dVar);
            switch (t3) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    i10 = k3.m(dVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str = k3.B(dVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = k3.B(dVar, 2);
                    i |= 4;
                    break;
                case 3:
                    j10 = k3.e(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = k3.B(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    i11 = k3.m(dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    i12 = k3.m(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    i13 = k3.m(dVar, 7);
                    i |= 128;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new m(i, i10, str, str2, j10, str3, i11, i12, i13);
    }

    @Override // eg.y
    public final ag.a[] c() {
        e0 e0Var = e0.f16506a;
        b1 b1Var = b1.f16494a;
        return new ag.a[]{e0Var, b1Var, b1Var, k0.f16535a, b1Var, e0Var, e0Var, e0Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}