package b8;
import aa.a;
import b8.aa;
import l.a;

import androidx.ink.storage.DecompressedBytes;

/* loaded from: classes.dex */
public final /* synthetic */ class aa implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final aa f1854a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, b8.aa, java.lang.Object] */
    static {
        Object obj = new Object();
        f1854a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.universe.UniverseListing", obj, 18);
        r0Var.k("cloudId", false);
        r0Var.k("title", false);
        r0Var.k("authorHandle", false);
        r0Var.k("kind", true);
        r0Var.k("priceCoins", true);
        r0Var.k("hearts", true);
        r0Var.k("downloads", true);
        r0Var.k("pageCount", true);
        r0Var.k("previewCount", true);
        r0Var.k("coverArgb", true);
        r0Var.k("spineArgb", true);
        r0Var.k("spineEnabled", true);
        r0Var.k("publishedAt", true);
        r0Var.k("originNotebookId", true);
        r0Var.k("heartedByMe", true);
        r0Var.k("unlockRaw", true);
        r0Var.k("priceTier", true);
        r0Var.k("houseItemId", true);
        descriptor = r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
    
        if (kotlin.jvm.internal.a(r0, "") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0127, code lost:
    
        if (kotlin.jvm.internal.a(r0, "") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0111, code lost:
    
        if (kotlin.jvm.internal.a(r0, "") == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
    
        if (kotlin.jvm.internal.a(r0, "") == false) goto L59;
     */
    @Override // ag.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(gg.t r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.aa.a(gg.t, java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0032. Please report as an issue. */
    @Override // ag.a
    public final Object b(dg.b bVar) {
        int i;
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z3 = false;
        boolean z9 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        boolean z10 = true;
        while (z10) {
            int t3 = k3.t(dVar);
            switch (t3) {
                case -1:
                    z10 = false;
                case 0:
                    str = k3.B(dVar, 0);
                    i10 |= 1;
                case 1:
                    str2 = k3.B(dVar, 1);
                    i10 |= 2;
                case 2:
                    str3 = k3.B(dVar, 2);
                    i10 |= 4;
                case 3:
                    str4 = k3.B(dVar, 3);
                    i10 |= 8;
                case 4:
                    i11 = k3.m(dVar, 4);
                    i10 |= 16;
                case 5:
                    i12 = k3.m(dVar, 5);
                    i10 |= 32;
                case 6:
                    i13 = k3.m(dVar, 6);
                    i10 |= 64;
                case 7:
                    i14 = k3.m(dVar, 7);
                    i10 |= 128;
                case 8:
                    i15 = k3.m(dVar, 8);
                    i10 |= 256;
                case 9:
                    i16 = k3.m(dVar, 9);
                    i10 |= 512;
                case 10:
                    i17 = k3.m(dVar, 10);
                    i10 |= 1024;
                case 11:
                    z3 = k3.c(dVar, 11);
                    i10 |= 2048;
                case 12:
                    j10 = k3.e(dVar, 12);
                    i10 |= 4096;
                case 13:
                    str5 = k3.B(dVar, 13);
                    i10 |= 8192;
                case 14:
                    z9 = k3.c(dVar, 14);
                    i10 |= 16384;
                case 15:
                    str6 = k3.B(dVar, 15);
                    i = DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
                    i10 |= i;
                case 16:
                    str7 = k3.B(dVar, 16);
                    i = 65536;
                    i10 |= i;
                case 17:
                    str8 = k3.B(dVar, 17);
                    i = 131072;
                    i10 |= i;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new ca(i10, str, str2, str3, str4, i11, i12, i13, i14, i15, i16, i17, z3, j10, str5, z9, str6, str7, str8);
    }

    @Override // eg.y
    public final ag.a[] c() {
        eg.b1 b1Var = eg.b1.f16494a;
        eg.e0 e0Var = eg.e0.f16506a;
        eg.f fVar = eg.f.f16510a;
        return new ag.a[]{b1Var, b1Var, b1Var, b1Var, e0Var, e0Var, e0Var, e0Var, e0Var, e0Var, e0Var, fVar, eg.k0.f16535a, b1Var, fVar, b1Var, b1Var, b1Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}