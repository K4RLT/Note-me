package b3;

import android.view.View;

/* loaded from: classes.dex */
public final class s extends k {
    public final View T;
    public final u1.d U;
    public a1.n V;
    public df.l W;

    /* renamed from: a0, reason: collision with root package name */
    public df.l f1696a0;

    /* renamed from: b0, reason: collision with root package name */
    public df.l f1697b0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(android.content.Context r8, df.l r9, r0.p r10, a1.o r11, int r12, b2.v1 r13) {
        /*
            r7 = this;
            java.lang.Object r9 = r9.invoke(r8)
            r5 = r9
            android.view.View r5 = (android.view.View) r5
            u1.d r4 = new u1.d
            r4.<init>()
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.T = r5
            r0.U = r4
            r8 = 0
            r7.setClipChildren(r8)
            java.lang.String r8 = java.lang.String.valueOf(r3)
            r9 = 0
            if (r11 == 0) goto L28
            java.lang.Object r10 = r11.e(r8)
            goto L29
        L28:
            r10 = r9
        L29:
            boolean r12 = r10 instanceof android.util.SparseArray
            if (r12 == 0) goto L30
            r9 = r10
            android.util.SparseArray r9 = (android.util.SparseArray) r9
        L30:
            if (r9 == 0) goto L35
            r5.restoreHierarchyState(r9)
        L35:
            if (r11 == 0) goto L44
            b3.j r9 = new b3.j
            r10 = 2
            r9.<init>(r7, r10)
            a1.n r8 = r11.d(r8, r9)
            r7.setSavableRegistryEntry(r8)
        L44:
            b3.c r8 = b3.c.f1646y
            r0.W = r8
            r0.f1696a0 = r8
            r0.f1697b0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.s.<init>(android.content.Context, df.l, r0.p, a1.o, int, b2.v1):void");
    }

    public static final void h(s sVar) {
        sVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(a1.n nVar) {
        a1.n nVar2 = this.V;
        if (nVar2 != null) {
            ((ra.e) nVar2).A();
        }
        this.V = nVar;
    }

    public final u1.d getDispatcher() {
        return this.U;
    }

    public final df.l getReleaseBlock() {
        return this.f1697b0;
    }

    public final df.l getResetBlock() {
        return this.f1696a0;
    }

    public /* bridge */ /* synthetic */ c2.a getSubCompositionView() {
        return null;
    }

    public final df.l getUpdateBlock() {
        return this.W;
    }

    public final void setReleaseBlock(df.l lVar) {
        this.f1697b0 = lVar;
        setRelease(new j(this, 3));
    }

    public final void setResetBlock(df.l lVar) {
        this.f1696a0 = lVar;
        setReset(new j(this, 4));
    }

    public final void setUpdateBlock(df.l lVar) {
        this.W = lVar;
        setUpdate(new j(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
