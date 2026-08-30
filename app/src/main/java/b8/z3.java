package b8;
import a0.j0;
import b8.d1;
import b8.p6;
import b8.s4;
import b8.u3;
import b8.u6;
import b8.w3;
import b8.y3;
import b8.z3;
import r6.f;

import java.io.File;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class z3 implements u6 {

    /* renamed from: a, reason: collision with root package name */
    public final u3 f3066a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f3067b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Set f3068c = qe.u.f24025u;

    public z3(u3 u3Var, d1 d1Var) {
        this.f3066a = u3Var;
        this.f3067b = d1Var;
    }

    @Override // u6
    public final Object a(String str, ve.c cVar) {
        Object a10 = j(str).a(str, cVar);
        if (a10 == ue.a.f27192u) {
            return a10;
        }
        return pe.z.f22715a;
    }

    @Override // u6
    public final void b(String str) {
        str.getClass();
        this.f3066a.b(str);
        if (((Boolean) p6.e.f25140u.getValue()).booleanValue()) {
            this.f3067b.b(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(s4 r5, df.p r6, df.r r7, ve.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof y3
            if (r0 == 0) goto L13
            r0 = r8
            y3 r0 = (y3) r0
            int r1 = r0.f3031w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3031w = r1
            goto L18
        L13:
            y3 r0 = new y3
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f3029u
            int r1 = r0.f3031w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            pe.a.e(r8)
            pe.l r8 = (pe.l) r8
            java.lang.Object r5 = r8.f22696u
            return r5
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            r5 = 0
            return r5
        L33:
            pe.a.e(r8)
            pe.l r8 = (pe.l) r8
            java.lang.Object r5 = r8.f22696u
            return r5
        L3b:
            pe.a.e(r8)
            sf.a0 r8 = p6.e
            sf.n0 r8 = r8.f25140u
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            ue.a r1 = ue.a.f27192u
            if (r8 == 0) goto L5c
            r0.f3031w = r3
            d1 r8 = r4.f3067b
            java.lang.Object r5 = r8.c(r5, r6, r7, r0)
            if (r5 != r1) goto L5b
            goto L66
        L5b:
            return r5
        L5c:
            r0.f3031w = r2
            u3 r8 = r4.f3066a
            java.lang.Object r5 = r8.c(r5, r6, r7, r0)
            if (r5 != r1) goto L67
        L66:
            return r1
        L67:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.z3.c(s4, df.p, df.r, ve.c):java.lang.Object");
    }

    @Override // u6
    public final String d() {
        p6 p6Var = p6.f2523a;
        String str = "";
        String string = p6.d().getString("handle", "");
        if (string != null) {
            str = string;
        }
        if (mf.f.u(str)) {
            return this.f3066a.d();
        }
        return str;
    }

    @Override // u6
    public final List e(String str) {
        str.getClass();
        return j(str).e(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, ve.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof w3
            if (r0 == 0) goto L13
            r0 = r6
            w3 r0 = (w3) r0
            int r1 = r0.f2919w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2919w = r1
            goto L18
        L13:
            w3 r0 = new w3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2917u
            int r1 = r0.f2919w
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            pe.a.e(r6)
            pe.l r6 = (pe.l) r6
            java.lang.Object r5 = r6.f22696u
            return r5
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            r5 = 0
            return r5
        L30:
            pe.a.e(r6)
            u6 r6 = r4.j(r5)
            r0.f2919w = r2
            java.lang.Object r5 = f(r5, r0)
            ue.a r6 = ue.a.f27192u
            if (r5 != r6) goto L42
            return r6
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.z3.f(java.lang.String, ve.c):java.lang.Object");
    }

    @Override // u6
    public final File g(String str) {
        str.getClass();
        return j(str).g(str);
    }

    @Override // u6
    public final Object h(String str, o9 o9Var) {
        return j(str).h(str, o9Var);
    }

    @Override // u6
    public final Object i(ve.c cVar) {
        wf.e eVar = pf.l0.f22767a;
        return pf.b0.J(wf.d.f29913w, new j0(this, null, 4), cVar);
    }

    public final u6 j(String str) {
        if (this.f3068c.contains(str)) {
            return this.f3067b;
        }
        return this.f3066a;
    }
}
