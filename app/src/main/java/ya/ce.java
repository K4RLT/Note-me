package ya;
import ce.a;
import a.a;
import x.o;
import b8.a1;
import df.l;
import pe.z;
import q.x;
import ve.c;
import y3.d;
import y3.s;
import ya.ce;

/* loaded from: classes.dex */
public abstract class ce {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0085 -> B:13:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.List r7, s r8, c r9) {
        /*
            boolean r0 = r9 instanceof d
            if (r0 == 0) goto L13
            r0 = r9
            d r0 = (d) r0
            int r1 = r0.f30829x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30829x = r1
            goto L18
        L13:
            d r0 = new d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30828w
            int r1 = r0.f30829x
            r2 = 2
            r3 = 1
            a r4 = a.f27192u
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L32
            java.util.Iterator r7 = r0.f30827v
            java.io.Serializable r8 = r0.f30826u
            kotlin.jvm.internal.y r8 = (kotlin.jvm.internal.y) r8
            a.e(r9)     // Catch: java.lang.Throwable -> L30
            goto L68
        L30:
            r9 = move-exception
            goto L81
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
            r7 = 0
            return r7
        L39:
            java.io.Serializable r7 = r0.f30826u
            java.util.List r7 = (java.util.List) r7
            a.e(r9)
            goto L5d
        L41:
            a.e(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            a1 r1 = new a1
            r5 = 0
            r6 = 18
            r1.<init>(r7, r9, r5, r6)
            r0.f30826u = r9
            r0.f30829x = r3
            java.lang.Object r7 = r8.a(r1, r0)
            if (r7 != r4) goto L5c
            goto L96
        L5c:
            r7 = r9
        L5d:
            kotlin.jvm.internal.y r8 = new kotlin.jvm.internal.y
            r8.<init>()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L68:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8e
            java.lang.Object r9 = r7.next()
            l r9 = (l) r9
            r0.f30826u = r8     // Catch: java.lang.Throwable -> L30
            r0.f30827v = r7     // Catch: java.lang.Throwable -> L30
            r0.f30829x = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r9 != r4) goto L68
            goto L96
        L81:
            java.lang.Object r1 = r8.f19787u
            if (r1 != 0) goto L88
            r8.f19787u = r9
            goto L68
        L88:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            a.a(r1, r9)
            goto L68
        L8e:
            java.lang.Object r7 = r8.f19787u
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 != 0) goto L97
            z r4 = z.f22715a
        L96:
            return r4
        L97:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.ce.a(java.util.List, s, c):java.lang.Object");
    }
}
