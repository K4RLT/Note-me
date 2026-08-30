package wa;
import f8.a;
import x.o;
import b0.j;
import i7.h;
import q.x;
import wa.f8;
import wa.g8;

/* loaded from: classes.dex */
public abstract class g8 {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (pf.j(250 << r8, r0) == r4) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:11:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(df.l r8, te.c r9) {
        /*
            boolean r0 = r9 instanceof h
            if (r0 == 0) goto L13
            r0 = r9
            h r0 = (h) r0
            int r1 = r0.f18343x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18343x = r1
            goto L18
        L13:
            h r0 = new h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f18342w
            int r1 = r0.f18343x
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r8 = r0.f18341v
            df.l r1 = r0.f18340u
            pe.a.e(r9)
            goto L6e
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            r8 = 0
            return r8
        L35:
            int r8 = r0.f18341v
            df.l r1 = r0.f18340u
            pe.a.e(r9)     // Catch: java.lang.RuntimeException -> L3d
            return r9
        L3d:
            r9 = move-exception
            goto L56
        L3f:
            pe.a.e(r9)
            r9 = 0
        L43:
            r0.f18340u = r8     // Catch: java.lang.RuntimeException -> L51
            r0.f18341v = r9     // Catch: java.lang.RuntimeException -> L51
            r0.f18343x = r3     // Catch: java.lang.RuntimeException -> L51
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.RuntimeException -> L51
            if (r8 != r4) goto L50
            goto L6d
        L50:
            return r8
        L51:
            r1 = move-exception
            r7 = r1
            r1 = r8
            r8 = r9
            r9 = r7
        L56:
            if (r8 >= r2) goto L72
            boolean r5 = f8.a(r9)
            if (r5 == 0) goto L72
            r5 = 250(0xfa, double:1.235E-321)
            long r5 = r5 << r8
            r0.f18340u = r1
            r0.f18341v = r8
            r0.f18343x = r2
            java.lang.Object r9 = pf.j(r5, r0)
            if (r9 != r4) goto L6e
        L6d:
            return r4
        L6e:
            int r9 = r8 + 1
            r8 = r1
            goto L43
        L72:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.g8.a(df.l, te.c):java.lang.Object");
    }
}
