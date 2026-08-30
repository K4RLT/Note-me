package l7;
import c.a;

import androidx.ink.storage.DecompressedBytes;
import eg.b1;
import eg.e0;
import eg.r0;
import eg.x;
import eg.y;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19967a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [l7.c, eg.y, java.lang.Object] */
    static {
        Object obj = new Object();
        f19967a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.local.payload.ImagePayload", obj, 16);
        r0Var.k("localPath", false);
        r0Var.k("frameShape", true);
        r0Var.k("visible", true);
        r0Var.k("locked", true);
        r0Var.k("name", true);
        r0Var.k("frameColorArgb", true);
        r0Var.k("halfClip", true);
        r0Var.k("slotPaths", true);
        r0Var.k("flipH", true);
        r0Var.k("cropL", true);
        r0Var.k("cropT", true);
        r0Var.k("cropR", true);
        r0Var.k("cropB", true);
        r0Var.k("framePath", true);
        r0Var.k("frameAspect", true);
        r0Var.k("frameHoles", true);
        descriptor = r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        if (kotlin.jvm.internal.a(r1, qe.s.f24023u) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
    
        if (java.lang.Float.compare(r0, 1.0f) != 0) goto L76;
     */
    @Override // ag.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(gg.t r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.a(gg.t, java.lang.Object):void");
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        pe.g[] gVarArr = e.f19968q;
        List list = null;
        List list2 = null;
        String str = null;
        b bVar2 = null;
        String str2 = null;
        Integer num = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        boolean z3 = true;
        int i = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str3 = null;
        while (z3) {
            int t3 = k3.t(dVar);
            switch (t3) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    str = k3.B(dVar, 0);
                    i |= 1;
                    break;
                case 1:
                    bVar2 = (b) k3.w(dVar, 1, (ag.a) gVarArr[1].getValue(), bVar2);
                    i |= 2;
                    break;
                case 2:
                    z9 = k3.c(dVar, 2);
                    i |= 4;
                    break;
                case 3:
                    z10 = k3.c(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) k3.w(dVar, 4, b1.f16494a, str2);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) k3.w(dVar, 5, e0.f16506a, num);
                    i |= 32;
                    break;
                case 6:
                    z11 = k3.c(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) k3.w(dVar, 7, (ag.a) gVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    z12 = k3.c(dVar, 8);
                    i |= 256;
                    break;
                case 9:
                    f10 = k3.d(dVar, 9);
                    i |= 512;
                    break;
                case 10:
                    f11 = k3.d(dVar, 10);
                    i |= 1024;
                    break;
                case 11:
                    f12 = k3.d(dVar, 11);
                    i |= 2048;
                    break;
                case 12:
                    f13 = k3.d(dVar, 12);
                    i |= 4096;
                    break;
                case 13:
                    str3 = (String) k3.w(dVar, 13, b1.f16494a, str3);
                    i |= 8192;
                    break;
                case 14:
                    f14 = k3.d(dVar, 14);
                    i |= 16384;
                    break;
                case 15:
                    list2 = (List) k3.s(dVar, 15, (ag.a) gVarArr[15].getValue(), list2);
                    i |= DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new e(i, str, bVar2, z9, z10, str2, num, z11, list, z12, f10, f11, f12, f13, str3, f14, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eg.y
    public final ag.a[] c() {
        pe.g[] gVarArr = e.f19968q;
        b1 b1Var = b1.f16494a;
        eg.f fVar = eg.f.f16510a;
        x xVar = x.f16594a;
        return new ag.a[]{b1Var, va.a((ag.a) gVarArr[1].getValue()), fVar, fVar, va.a(b1Var), va.a(e0.f16506a), fVar, va.a((ag.a) gVarArr[7].getValue()), fVar, xVar, xVar, xVar, xVar, va.a(b1Var), xVar, gVarArr[15].getValue()};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}