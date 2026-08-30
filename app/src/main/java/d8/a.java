package d8;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import eg.b1;
import eg.e0;
import eg.k0;
import eg.r0;
import eg.y;
import fg.b0;
import fg.z;
import gg.t;
import kotlin.jvm.internal.l;
import va.r;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15771a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, d8.a, java.lang.Object] */
    static {
        Object obj = new Object();
        f15771a = obj;
        r0 r0Var = new r0("com.daren.scraply.universe.packs.RemotePackStore.PackRow", obj, 12);
        r0Var.k(FacebookMediationAdapter.KEY_ID, false);
        r0Var.k("kind", true);
        r0Var.k("name", true);
        r0Var.k("version", true);
        r0Var.k("premium", true);
        r0Var.k("price_coins", true);
        r0Var.k("archive_path", true);
        r0Var.k("archive_bytes", true);
        r0Var.k("archive_sha256", true);
        r0Var.k("thumb_path", true);
        r0Var.k("manifest", true);
        r0Var.k("min_app_version", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(t tVar, Object obj) {
        c cVar = (c) obj;
        cVar.getClass();
        int i = cVar.f15781l;
        cg.d dVar = descriptor;
        t a10 = tVar.a(dVar);
        String str = cVar.f15772a;
        z zVar = cVar.f15780k;
        String str2 = cVar.f15779j;
        String str3 = cVar.i;
        long j10 = cVar.f15778h;
        String str4 = cVar.f15777g;
        int i10 = cVar.f15776f;
        boolean z3 = cVar.e;
        int i11 = cVar.f15775d;
        String str5 = cVar.f15774c;
        String str6 = cVar.f15773b;
        a10.v(dVar, 0, str);
        if (a10.x(dVar) || !l.a(str6, "stickers")) {
            a10.v(dVar, 1, str6);
        }
        if (a10.x(dVar) || !l.a(str5, "")) {
            a10.v(dVar, 2, str5);
        }
        if (a10.x(dVar) || i11 != 1) {
            a10.m(3, i11, dVar);
        }
        if (a10.x(dVar) || z3) {
            a10.c(dVar, 4, z3);
        }
        if (a10.x(dVar) || i10 != 0) {
            a10.m(5, i10, dVar);
        }
        if (a10.x(dVar) || !l.a(str4, "")) {
            a10.v(dVar, 6, str4);
        }
        if (a10.x(dVar) || j10 != 0) {
            a10.o(dVar, 7, j10);
        }
        if (a10.x(dVar) || str3 != null) {
            a10.q(dVar, 8, b1.f16494a, str3);
        }
        if (a10.x(dVar) || str2 != null) {
            a10.q(dVar, 9, b1.f16494a, str2);
        }
        if (a10.x(dVar) || !l.a(zVar, new z(qe.t.f24024u))) {
            a10.r(dVar, 10, b0.f16962a, zVar);
        }
        if (a10.x(dVar) || i != 1) {
            a10.m(11, i, dVar);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j10 = 0;
        boolean z3 = true;
        int i = 0;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        int i12 = 0;
        String str6 = null;
        z zVar = null;
        while (z3) {
            int t3 = k3.t(dVar);
            switch (t3) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    str2 = k3.B(dVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = k3.B(dVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str4 = k3.B(dVar, 2);
                    i |= 4;
                    break;
                case 3:
                    i10 = k3.m(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    z9 = k3.c(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    i11 = k3.m(dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = k3.B(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    j10 = k3.e(dVar, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) k3.w(dVar, 8, b1.f16494a, str);
                    i |= 256;
                    break;
                case 9:
                    str6 = (String) k3.w(dVar, 9, b1.f16494a, str6);
                    i |= 512;
                    break;
                case 10:
                    zVar = (z) k3.s(dVar, 10, b0.f16962a, zVar);
                    i |= 1024;
                    break;
                case 11:
                    i12 = k3.m(dVar, 11);
                    i |= 2048;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new c(i, str2, str3, str4, i10, z9, i11, str5, j10, str, str6, zVar, i12);
    }

    @Override // eg.y
    public final ag.a[] c() {
        b1 b1Var = b1.f16494a;
        ag.a a10 = r.a(b1Var);
        ag.a a11 = r.a(b1Var);
        e0 e0Var = e0.f16506a;
        return new ag.a[]{b1Var, b1Var, b1Var, e0Var, eg.f.f16510a, e0Var, b1Var, k0.f16535a, a10, a11, b0.f16962a, e0Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}