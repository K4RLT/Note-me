package q2;
import x.o;
import b0.u;
import c.a;
import q.x;

import j.i0;
import java.util.List;
import r0.i1;
import r0.n2;

/* loaded from: classes.dex */
public final class c implements n2 {

    /* renamed from: u, reason: collision with root package name */
    public final List f23331u;

    /* renamed from: v, reason: collision with root package name */
    public final c0 f23332v;

    /* renamed from: w, reason: collision with root package name */
    public final df.l f23333w;

    /* renamed from: x, reason: collision with root package name */
    public final i1 f23334x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23335y = true;

    public c(List list, Object obj, c0 c0Var, i0 i0Var, df.l lVar, jb.f fVar) {
        this.f23331u = list;
        this.f23332v = c0Var;
        this.f23333w = lVar;
        this.f23334x = r0.y.B(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0033, B:16:0x00a1, B:24:0x004c, B:26:0x0051, B:28:0x0077, B:34:0x0094), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a1 -> B:14:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ve.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof q2.b
            if (r0 == 0) goto L13
            r0 = r12
            q2.b r0 = (q2.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            q2.b r0 = new q2.b
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f23328y
            int r1 = r0.A
            pe.z r2 = pe.z.f22715a
            df.l r3 = r11.f23333w
            r0.i1 r4 = r11.f23334x
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L91
            r7 = 2
            if (r1 == r5) goto L42
            if (r1 != r7) goto L3b
            int r1 = r0.f23327x
            int r7 = r0.f23326w
            java.util.List r8 = r0.f23324u
            java.util.List r8 = (java.util.List) r8
            pe.a.e(r12)     // Catch: java.lang.Throwable -> L38
            goto Laa
        L38:
            r12 = move-exception
            goto Lc0
        L3b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r12)
            r12 = 0
            return r12
        L42:
            int r1 = r0.f23327x
            int r8 = r0.f23326w
            q2.z r9 = r0.f23325v
            java.util.List r10 = r0.f23324u
            java.util.List r10 = (java.util.List) r10
            pe.a.e(r12)     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L77
            q2.c0 r1 = r11.f23332v     // Catch: java.lang.Throwable -> L38
            int r5 = r1.f23339d     // Catch: java.lang.Throwable -> L38
            q2.s r7 = r1.f23337b     // Catch: java.lang.Throwable -> L38
            int r1 = r1.f23338c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r12 = ya.z9.a(r5, r12, r9, r7, r1)     // Catch: java.lang.Throwable -> L38
            r4.setValue(r12)     // Catch: java.lang.Throwable -> L38
            te.g r12 = r0.getContext()
            boolean r12 = pf.u(r12)
            r11.f23335y = r6
            q2.e0 r0 = new q2.e0
            java.lang.Object r1 = r4.getValue()
            r0.<init>(r1, r12)
        L73:
            r3.invoke(r0)
            return r2
        L77:
            r12 = r10
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L38
            r0.f23324u = r12     // Catch: java.lang.Throwable -> L38
            r12 = 0
            r0.f23325v = r12     // Catch: java.lang.Throwable -> L38
            r0.f23326w = r8     // Catch: java.lang.Throwable -> L38
            r0.f23327x = r1     // Catch: java.lang.Throwable -> L38
            r0.A = r7     // Catch: java.lang.Throwable -> L38
            java.lang.Object r12 = pf.b0.L(r0)     // Catch: java.lang.Throwable -> L38
            ue.a r7 = ue.a.f27192u
            if (r12 != r7) goto L8e
            return r7
        L8e:
            r7 = r8
            r8 = r10
            goto Laa
        L91:
            pe.a.e(r12)
            java.util.List r12 = r11.f23331u     // Catch: java.lang.Throwable -> L38
            r1 = r12
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L38
            r8 = r12
            r7 = r6
        L9f:
            if (r7 >= r1) goto Lac
            java.lang.Object r12 = r8.get(r7)     // Catch: java.lang.Throwable -> L38
            q2.z r12 = (q2.z) r12     // Catch: java.lang.Throwable -> L38
            r12.getClass()     // Catch: java.lang.Throwable -> L38
        Laa:
            int r7 = r7 + r5
            goto L9f
        Lac:
            te.g r12 = r0.getContext()
            boolean r12 = pf.u(r12)
            r11.f23335y = r6
            q2.e0 r0 = new q2.e0
            java.lang.Object r1 = r4.getValue()
            r0.<init>(r1, r12)
            goto L73
        Lc0:
            te.g r0 = r0.getContext()
            boolean r0 = pf.u(r0)
            r11.f23335y = r6
            q2.e0 r1 = new q2.e0
            java.lang.Object r2 = r4.getValue()
            r1.<init>(r2, r0)
            r3.invoke(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.a(ve.c):java.lang.Object");
    }

    @Override // r0.n2
    public final Object getValue() {
        return this.f23334x.getValue();
    }
}
