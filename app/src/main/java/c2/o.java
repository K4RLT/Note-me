package c2;
import b2.f1;
import b2.i0;
import b3.k;
import c2.d1;
import c2.f0;
import c2.n0;
import c2.o;
import c2.x;
import j2.n;
import j2.p;
import n.u;
import r2.v;

/* loaded from: classes.dex */
public final class o extends q3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f3584d;
    public final /* synthetic */ i0 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f3585f;

    public o(x xVar, i0 i0Var, x xVar2) {
        this.f3584d = xVar;
        this.e = i0Var;
        this.f3585f = xVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().a().f18825g) goto L19;
     */
    @Override // q3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r8, r3.e r9) {
        /*
            r7 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.f24537a
            android.view.View$AccessibilityDelegate r1 = r7.f23380a
            r1.onInitializeAccessibilityNodeInfo(r8, r0)
            x r8 = r7.f3584d
            f0 r1 = r8.M
            boolean r2 = r1.o()
            if (r2 == 0) goto L15
            r2 = 0
            r0.setVisibleToUser(r2)
        L15:
            i0 r2 = r7.e
            i0 r3 = v()
        L1b:
            r4 = 0
            if (r3 == 0) goto L2e
            f1 r5 = r3.Z
            r6 = 8
            boolean r5 = r5.n(r6)
            if (r5 == 0) goto L29
            goto L2f
        L29:
            i0 r3 = r3.v()
            goto L1b
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L37
            int r3 = r3.f1490v
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L37:
            r3 = -1
            if (r4 == 0) goto L4a
            p r5 = r8.getSemanticsOwner()
            n r5 = r5.a()
            int r5 = r5.f18825g
            int r6 = r4.intValue()
            if (r6 != r5) goto L4e
        L4a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L4e:
            int r4 = r4.intValue()
            r9.f24538b = r4
            x r9 = r7.f3585f
            r0.setParent(r9, r4)
            int r2 = r2.f1490v
            u r4 = r1.E
            int r4 = r4.d(r2)
            if (r4 == r3) goto L79
            d1 r5 = r8.getAndroidViewsHandler$ui_release()
            k r5 = n0.s(r5, r4)
            if (r5 == 0) goto L71
            r0.setTraversalBefore(r5)
            goto L74
        L71:
            r0.setTraversalBefore(r9, r4)
        L74:
            java.lang.String r4 = r1.G
            x.a(r8, r2, r0, r4)
        L79:
            u r4 = r1.F
            int r4 = r4.d(r2)
            if (r4 == r3) goto L97
            d1 r3 = r8.getAndroidViewsHandler$ui_release()
            k r3 = n0.s(r3, r4)
            if (r3 == 0) goto L8f
            r0.setTraversalAfter(r3)
            goto L92
        L8f:
            r0.setTraversalAfter(r9, r4)
        L92:
            java.lang.String r9 = r1.H
            x.a(r8, r2, r0, r9)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.o.b(android.view.View, r3.e):void");
    }
}
