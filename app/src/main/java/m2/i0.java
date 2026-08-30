package m2;
import i0.a;
import u.a;

import ya.ae;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f20504a = ae.e(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f20505b = ae.e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f20506c = k1.r.f19520k;

    /* renamed from: d, reason: collision with root package name */
    public static final x2.o f20507d;

    static {
        x2.o oVar;
        long j10 = k1.r.f19513b;
        if (j10 != 16) {
            oVar = new x2.c(j10);
        } else {
            oVar = x2.n.f30066a;
        }
        f20507d = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00b8, code lost:
    
        if (r15.equals(r24.i) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00c7, code lost:
    
        if (r39.equals(r24.f20491j) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00d6, code lost:
    
        if (r40.equals(r24.f20492k) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00ea, code lost:
    
        if (pe.a(r41, r6) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0042, code lost:
    
        if (pe.a(r25, r14) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m2.h0 a(m2.h0 r24, long r25, k1.n r27, float r28, long r29, q2.s r31, q2.o r32, q2.p r33, q2.i r34, java.lang.String r35, long r36, x2.a r38, x2.p r39, t2.b r40, long r41, x2.l r43, k1.o0 r44, m2.y r45, m1.e r46) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.a(m2.h0, long, k1.n, float, long, q2.s, q2.o, q2.p, q2.i, java.lang.String, long, x2.a, x2.p, t2.b, long, x2.l, k1.o0, m2.y, m1.e):m2.h0");
    }

    public static final Object b(Object obj, Object obj2, float f10) {
        if (f10 < 0.5d) {
            return obj;
        }
        return obj2;
    }

    public static final long c(long j10, long j11, float f10) {
        y2.p[] pVarArr = y2.o.f30818b;
        long j12 = j10 & 1095216660480L;
        if (j12 == 0 || (1095216660480L & j11) == 0) {
            return ((y2.o) b(new y2.o(j10), new y2.o(j11), f10)).f30820a;
        }
        ae.b(j10, j11);
        return ae.f(j12, c7.p.b(y2.o.c(j10), y2.o.c(j11), f10));
    }
}
