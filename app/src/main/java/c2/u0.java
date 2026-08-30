package c2;
import u0.a;
import x.o;
import a0.u;
import b0.i;
import c2.t0;
import c2.u0;
import i0.r;
import q.x;
import r2.y;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u0 implements pf.z {

    /* renamed from: u, reason: collision with root package name */
    public final View f3652u;

    /* renamed from: v, reason: collision with root package name */
    public final y f3653v;

    /* renamed from: w, reason: collision with root package name */
    public final pf.z f3654w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f3655x = new AtomicReference(null);

    public u0(View view, y yVar, pf.z zVar) {
        this.f3652u = view;
        this.f3653v = yVar;
        this.f3654w = zVar;
    }

    @Override // pf.z
    public final te.g A() {
        return this.f3654w.A();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r r5, ve.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t0
            if (r0 == 0) goto L13
            r0 = r6
            t0 r0 = (t0) r0
            int r1 = r0.f3645w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3645w = r1
            goto L18
        L13:
            t0 r0 = new t0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3643u
            int r1 = r0.f3645w
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            return
        L27:
            pe.a.e(r6)
            goto L4f
        L2b:
            pe.a.e(r6)
            u r6 = new u
            r1 = 12
            r6.<init>(r5, r1, r4)
            b5.a r5 = new b5.a
            r1 = 11
            r3 = 0
            r5.<init>(r4, r3, r1)
            r0.f3645w = r2
            b8.l2 r1 = new b8.l2
            java.util.concurrent.atomic.AtomicReference r2 = r4.f3655x
            r1.<init>(r6, r2, r5, r3)
            java.lang.Object r5 = pf.i(r1, r0)
            ue.a r6 = ue.a.f27192u
            if (r5 != r6) goto L4f
            return
        L4f:
            l4.a.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.u0.a(r, ve.c):void");
    }
}
