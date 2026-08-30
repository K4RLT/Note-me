package u7;
import m2.a;
import m3.g;
import t2.a;
import o0.h;
import o7.b;
import q.x;
import u7.m2;
import u7.m3;
import u7.r2;
import u7.s2;
import u7.t2;
import y4.a;

import java.util.List;

/* loaded from: classes.dex */
public final class t2 implements sf.h {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26882u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f26883v;

    public /* synthetic */ t2(m3 m3Var, int i) {
        this.f26882u = i;
        this.f26883v = m3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.util.List r17, te.c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            m3 r3 = r0.f26883v
            sf.n0 r4 = r3.f26531c
            boolean r5 = r2 instanceof s2
            if (r5 == 0) goto L1d
            r5 = r2
            s2 r5 = (s2) r5
            int r6 = r5.f26830x
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1d
            int r6 = r6 - r7
            r5.f26830x = r6
            goto L22
        L1d:
            s2 r5 = new s2
            r5.<init>(r0, r2)
        L22:
            java.lang.Object r2 = r5.f26828v
            int r6 = r5.f26830x
            r7 = 3
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L3b
            if (r6 != r9) goto L35
            java.util.List r1 = r5.f26827u
            java.util.List r1 = (java.util.List) r1
            pe.a.e(r2)
            goto La6
        L35:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r1)
            return r8
        L3b:
            pe.a.e(r2)
            r3.f26547u = r1
        L40:
            java.lang.Object r2 = r4.getValue()
            r6 = r2
            m2 r6 = (m2) r6
            r10 = r1
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = qe.m.d(r10, r12)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L59:
            boolean r12 = r10.hasNext()
            r13 = 0
            if (r12 == 0) goto L7a
            java.lang.Object r12 = r10.next()
            b r12 = (b) r12
            float r14 = r12.f21851d
            float r15 = r12.e
            float r12 = r12.f21852f
            float[] r8 = new float[r7]
            r8[r13] = r14
            r8[r9] = r15
            r13 = 2
            r8[r13] = r12
            r11.add(r8)
            r8 = 0
            goto L59
        L7a:
            r8 = 4
            m2 r6 = m2.a(r6, r1, r11, r13, r8)
            boolean r2 = r4.i(r2, r6)
            if (r2 == 0) goto Lb6
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto La6
            java.lang.Object r2 = r4.getValue()
            m2 r2 = (m2) r2
            int r2 = r2.f26529c
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            r5.f26827u = r4
            r5.f26830x = r9
            java.lang.Object r2 = m3.g(r3, r2, r5)
            ue.a r4 = ue.a.f27192u
            if (r2 != r4) goto La6
            return r4
        La6:
            a r2 = androidx.lifecycle.h(r3)
            r2 r4 = new r2
            r6 = 0
            r4.<init>(r1, r3, r6)
            pf.b0.x(r2, r6, r4, r7)
            pe.z r1 = pe.z.f22715a
            return r1
        Lb6:
            r8 = 0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.t2.a(java.util.List, te.c):java.lang.Object");
    }

    @Override // sf.h
    public final Object e(Object obj, te.c cVar) {
        switch (this.f26882u) {
            case 0:
                return a((List) obj, cVar);
            default:
                this.f26883v.f26551y.j((List) obj);
                return pe.z.f22715a;
        }
    }
}
