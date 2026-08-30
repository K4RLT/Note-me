package b8;
import b8.w0;
import l.a;

import androidx.ink.storage.DecompressedBytes;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f2909a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, java.lang.Object, b8.w0] */
    static {
        Object obj = new Object();
        f2909a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.universe.CloudUniverseApi.FeedRow", obj, 16);
        r0Var.k(FacebookMediationAdapter.KEY_ID, true);
        r0Var.k("author_handle", true);
        r0Var.k("kind", true);
        r0Var.k("unlock", true);
        r0Var.k("price_coins", true);
        r0Var.k("title", true);
        r0Var.k("page_count", true);
        r0Var.k("preview_count", true);
        r0Var.k("cover_argb", true);
        r0Var.k("spine_argb", true);
        r0Var.k("spine_enabled", true);
        r0Var.k("hearts_count", true);
        r0Var.k("downloads_count", true);
        r0Var.k("published_at", true);
        r0Var.k("hearted_by_me", true);
        r0Var.k("price_tier", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        int i;
        y0 y0Var = (y0) obj;
        y0Var.getClass();
        String str = y0Var.f3019p;
        boolean z3 = y0Var.f3018o;
        String str2 = y0Var.f3017n;
        int i10 = y0Var.f3016m;
        int i11 = y0Var.f3015l;
        boolean z9 = y0Var.f3014k;
        int i12 = y0Var.f3013j;
        int i13 = y0Var.i;
        int i14 = y0Var.f3012h;
        int i15 = y0Var.f3011g;
        String str3 = y0Var.f3010f;
        int i16 = y0Var.e;
        String str4 = y0Var.f3009d;
        String str5 = y0Var.f3008c;
        String str6 = y0Var.f3007b;
        String str7 = y0Var.f3006a;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str7, "")) {
            i = i10;
            a10.v(dVar, 0, str7);
        } else {
            i = i10;
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str6, "")) {
            a10.v(dVar, 1, str6);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str5, "template")) {
            a10.v(dVar, 2, str5);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str4, "free")) {
            a10.v(dVar, 3, str4);
        }
        if (a10.x(dVar) || i16 != 0) {
            a10.m(4, i16, dVar);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str3, "")) {
            a10.v(dVar, 5, str3);
        }
        if (a10.x(dVar) || i15 != 0) {
            a10.m(6, i15, dVar);
        }
        if (a10.x(dVar) || i14 != 0) {
            a10.m(7, i14, dVar);
        }
        if (a10.x(dVar) || i13 != 0) {
            a10.m(8, i13, dVar);
        }
        if (a10.x(dVar) || i12 != 0) {
            a10.m(9, i12, dVar);
        }
        if (a10.x(dVar) || !z9) {
            a10.c(dVar, 10, z9);
        }
        if (a10.x(dVar) || i11 != 0) {
            a10.m(11, i11, dVar);
        }
        if (a10.x(dVar) || i != 0) {
            a10.m(12, i, dVar);
        }
        if (a10.x(dVar) || str2 != null) {
            a10.q(dVar, 13, eg.b1.f16494a, str2);
        }
        if (a10.x(dVar) || z3) {
            a10.c(dVar, 14, z3);
        }
        if (a10.x(dVar) || str != null) {
            a10.q(dVar, 15, eg.b1.f16494a, str);
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
        String str6 = null;
        String str7 = null;
        boolean z3 = true;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z9 = false;
        int i15 = 0;
        int i16 = 0;
        boolean z10 = false;
        while (z3) {
            int t3 = k3.t(dVar);
            switch (t3) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    str3 = k3.B(dVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str4 = k3.B(dVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str5 = k3.B(dVar, 2);
                    i |= 4;
                    break;
                case 3:
                    str6 = k3.B(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    i10 = k3.m(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str7 = k3.B(dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    i11 = k3.m(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    i12 = k3.m(dVar, 7);
                    i |= 128;
                    break;
                case 8:
                    i13 = k3.m(dVar, 8);
                    i |= 256;
                    break;
                case 9:
                    i14 = k3.m(dVar, 9);
                    i |= 512;
                    break;
                case 10:
                    z9 = k3.c(dVar, 10);
                    i |= 1024;
                    break;
                case 11:
                    i15 = k3.m(dVar, 11);
                    i |= 2048;
                    break;
                case 12:
                    i16 = k3.m(dVar, 12);
                    i |= 4096;
                    break;
                case 13:
                    str = (String) k3.w(dVar, 13, eg.b1.f16494a, str);
                    i |= 8192;
                    break;
                case 14:
                    z10 = k3.c(dVar, 14);
                    i |= 16384;
                    break;
                case 15:
                    str2 = (String) k3.w(dVar, 15, eg.b1.f16494a, str2);
                    i |= DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new y0(i, str3, str4, str5, str6, i10, str7, i11, i12, i13, i14, z9, i15, i16, str, z10, str2);
    }

    @Override // eg.y
    public final ag.a[] c() {
        eg.b1 b1Var = eg.b1.f16494a;
        ag.a a10 = va.r.a(b1Var);
        ag.a a11 = va.r.a(b1Var);
        eg.e0 e0Var = eg.e0.f16506a;
        eg.f fVar = eg.f.f16510a;
        return new ag.a[]{b1Var, b1Var, b1Var, b1Var, e0Var, b1Var, e0Var, e0Var, e0Var, e0Var, fVar, e0Var, e0Var, a10, fVar, a11};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}