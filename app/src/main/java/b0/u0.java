package b0;
import u0.b;
import b0.u0;
import c0.a0;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1264a = 2500;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1265b = 1500;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1266c = 50;

    public static final boolean a(boolean z3, a0 a0Var, int i) {
        if (z3) {
            if (a0Var.c() <= i) {
                if (a0Var.c() == i && a0Var.d() > 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        if (a0Var.c() >= i) {
            if (a0Var.c() == i && a0Var.d() < 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(10:18|19|20|21|22|23|24|(3:26|27|28)|13|14))(5:90|(1:92)|93|94|(10:96|97|(1:99)(1:102)|100|101|23|24|(0)|13|14)(2:103|104))))|110|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00f6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00c3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db A[Catch: j -> 0x01a4, TRY_ENTER, TRY_LEAVE, TryCatch #4 {j -> 0x01a4, blocks: (B:24:0x00bd, B:31:0x00db, B:38:0x0100, B:40:0x0114, B:43:0x0129), top: B:23:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r20v1, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x017b -> B:22:0x0186). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(a0 r27, int r28, int r29, y2.c r30, ve.c r31) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.u0.b(a0, int, int, y2.c, ve.c):java.lang.Object");
    }

    public static final boolean c(a0 a0Var, int i) {
        int c10 = a0Var.c();
        if (i <= a0Var.e() && c10 <= i) {
            return true;
        }
        return false;
    }
}
