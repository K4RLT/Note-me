package fa;
import k0.a;
import q.x;

import android.accounts.Account;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h extends e implements da.c {
    public final Set S;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(android.content.Context r10, android.os.Looper r11, int r12, g9.n r13, da.g r14, da.h r15) {
        /*
            r9 = this;
            fa.k0 r3 = fa.a(r10)
            ca.e r4 = ca.e.f4034d
            fa.y.h(r14)
            fa.y.h(r15)
            fa.l r6 = new fa.l
            r6.<init>(r14)
            fa.l r7 = new fa.l
            r7.<init>(r15)
            java.lang.Object r14 = r13.f17681y
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r10 = r13.f17679w
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r11 = r10.iterator()
        L2a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L44
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L3d
            goto L2a
        L3d:
            java.lang.String r10 = "Expanding scopes is not permitted, use implied scopes instead"
            x.o(r10)
            r10 = 0
            throw r10
        L44:
            r0.S = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.h.<init>(android.content.Context, android.os.Looper, int, g9.n, da.g, da.h):void");
    }

    @Override // da.c
    public final Set b() {
        if (l()) {
            return this.S;
        }
        return Collections.EMPTY_SET;
    }

    @Override // fa.e
    public final Account p() {
        return null;
    }

    @Override // fa.e
    public final Set s() {
        return this.S;
    }
}
