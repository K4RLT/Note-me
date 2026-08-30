package ya;
import a0.o;
import p7.g;
import pe.a;
import pe.z;
import pf.l;
import pf.w;
import q.x;
import rf.s;
import rf.t;
import te.c;
import te.e;
import te.g;
import ue.a;
import ve.c;
import ya.kb;
import ya.rc;

/* loaded from: classes.dex */
public abstract class kb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(t r4, o r5, c r6) {
        /*
            boolean r0 = r6 instanceof s
            if (r0 == 0) goto L13
            r0 = r6
            s r0 = (s) r0
            int r1 = r0.f24818w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24818w = r1
            goto L18
        L13:
            s r0 = new s
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24817v
            int r1 = r0.f24818w
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            o r5 = r0.f24816u
            a.e(r6)     // Catch: java.lang.Throwable -> L27
            goto L61
        L27:
            r4 = move-exception
            goto L67
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r4)
            r4 = 0
            return r4
        L30:
            a.e(r6)
            g r6 = r0.getContext()
            w r1 = w.f22803v
            e r6 = r6.L(r1)
            if (r6 != r4) goto L6b
            r0.f24816u = r5     // Catch: java.lang.Throwable -> L27
            r0.f24818w = r2     // Catch: java.lang.Throwable -> L27
            l r6 = new l     // Catch: java.lang.Throwable -> L27
            c r0 = rc.b(r0)     // Catch: java.lang.Throwable -> L27
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L27
            r6.s()     // Catch: java.lang.Throwable -> L27
            g r0 = new g     // Catch: java.lang.Throwable -> L27
            r1 = 1
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L27
            r4.m0(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L27
            a r6 = a.f27192u
            if (r4 != r6) goto L61
            return r6
        L61:
            r5.invoke()
            z r4 = z.f22715a
            return r4
        L67:
            r5.invoke()
            throw r4
        L6b:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            x.o(r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.kb.a(t, o, c):java.lang.Object");
    }
}
