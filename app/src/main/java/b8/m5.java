package b8;
import m5.a;
import m5.b;
import b0.x;
import b8.m5;
import j1.b;
import j1.c;
import k1.l0;
import l.a;
import r0.a1;
import r0.e1;
import r0.m;
import y2.l;

/* loaded from: classes.dex */
public abstract class m5 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2417a = l0.d(4278913806L);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2418b = 0;

    /* JADX WARN: Code restructure failed: missing block: B:87:0x02b6, code lost:
    
        if (kotlin.jvm.internal.a(r2.O(), java.lang.Integer.valueOf(r4)) == false) goto L106;
     */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.util.List r35, final int r36, final c r37, final df.p r38, final df.l r39, final df.a r40, m r41, final int r42) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.m5.a(java.util.List, int, c, df.p, df.l, df.a, m, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e7, code lost:
    
        if (kotlin.jvm.internal.a(r9.O(), java.lang.Integer.valueOf(r7)) == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.io.File r20, boolean r21, df.l r22, df.l r23, df.a r24, m r25, int r26) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.m5.b(java.io.File, boolean, df.l, df.l, df.a, m, int):void");
    }

    public static final long c(a1 a1Var) {
        return ((b) a1Var.getValue()).f18762a;
    }

    public static final void d(pf.z zVar, e1 e1Var, a1 a1Var, boolean z3, df.l lVar, a1 a1Var2, float f10, long j10) {
        pf.x(zVar, null, new l5(e1Var.h(), f10, c(a1Var), j10, z3, lVar, e1Var, a1Var, a1Var2, null), 3);
    }

    public static final void e(boolean z3, df.l lVar, e1 e1Var, a1 a1Var, a1 a1Var2, float f10, long j10) {
        boolean z9;
        e1Var.i(f10);
        a1Var.setValue(new b(j10));
        if (f10 > 1.01f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != ((Boolean) a1Var2.getValue()).booleanValue() && z3) {
            a1Var2.setValue(Boolean.valueOf(z9));
            lVar.invoke(Boolean.valueOf(z9));
        }
    }

    public static final long f(a1 a1Var, a1 a1Var2, long j10, float f10) {
        float f11 = ((((int) (((l) a1Var.getValue()).f30813a >> 32)) * f10) - ((int) (((l) a1Var2.getValue()).f30813a >> 32))) / 2.0f;
        float f12 = 0.0f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f13 = ((((int) (((l) a1Var.getValue()).f30813a & 4294967295L)) * f10) - ((int) (((l) a1Var2.getValue()).f30813a & 4294967295L))) / 2.0f;
        if (f13 >= 0.0f) {
            f12 = f13;
        }
        float d2 = wa.b9.d(Float.intBitsToFloat((int) (j10 >> 32)), -f11, f11);
        float d10 = wa.b9.d(Float.intBitsToFloat((int) (j10 & 4294967295L)), -f12, f12);
        return (Float.floatToRawIntBits(d10) & 4294967295L) | (Float.floatToRawIntBits(d2) << 32);
    }
}
