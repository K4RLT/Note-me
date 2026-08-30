package ag;

import java.util.List;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: u, reason: collision with root package name */
    public final List f381u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(java.lang.String r5, java.util.ArrayList r6) {
        /*
            r4 = this;
            r5.getClass()
            int r0 = r6.size()
            r1 = 1
            if (r0 != r1) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Field '"
            r0.<init>(r1)
            r1 = 0
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "' is required for type with serial name '"
            java.lang.String r3 = "', but it was missing"
            java.lang.String r5 = a5.a.l(r0, r1, r2, r5, r3)
            goto L3c
        L21:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fields "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = " are required for type with serial name '"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "', but they were missing"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L3c:
            r0 = 0
            r4.<init>(r5, r0)
            r4.f381u = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.b.<init>(java.lang.String, java.util.ArrayList):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, String str, b bVar) {
        super(str, bVar);
        list.getClass();
        this.f381u = list;
    }
}
