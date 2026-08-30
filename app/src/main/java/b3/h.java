package b3;
import d.c;
import q.d;
import q.r0;
import q.x;

import pf.z;
import v1.g0;

/* loaded from: classes.dex */
public final class h extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1660u;

    /* renamed from: v, reason: collision with root package name */
    public int f1661v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f1662w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1663x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j10, g0 g0Var, te.c cVar) {
        super(2, cVar);
        this.f1660u = 2;
        this.f1662w = j10;
        this.f1663x = g0Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1660u) {
            case 0:
                return new h((k) this.f1663x, this.f1662w, cVar, 0);
            case 1:
                return new h((d) this.f1663x, this.f1662w, cVar, 1);
            default:
                return new h(this.f1662w, (g0) this.f1663x, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f1660u) {
            case 0:
                return ((h) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((h) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((h) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f1660u
            switch(r0) {
                case 0: goto L84;
                case 1: goto L53;
                default: goto L5;
            }
        L5:
            int r0 = r10.f1661v
            r1 = 8
            long r3 = r10.f1662w
            r5 = 2
            r6 = 1
            ue.a r7 = ue.a.f27192u
            if (r0 == 0) goto L24
            if (r0 == r6) goto L20
            if (r0 != r5) goto L19
            pe.a.e(r11)
            goto L3b
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r11)
            r7 = 0
            goto L52
        L20:
            pe.a.e(r11)
            goto L32
        L24:
            pe.a.e(r11)
            long r8 = r3 - r1
            r10.f1661v = r6
            java.lang.Object r11 = pf.b0.j(r8, r10)
            if (r11 != r7) goto L32
            goto L52
        L32:
            r10.f1661v = r5
            java.lang.Object r11 = pf.b0.j(r1, r10)
            if (r11 != r7) goto L3b
            goto L52
        L3b:
            java.lang.Object r11 = r10.f1663x
            v1.g0 r11 = (v1.g0) r11
            pf.l r11 = r11.f27310w
            if (r11 == 0) goto L50
            v1.m r0 = new v1.m
            r0.<init>(r3)
            pe.k r1 = new pe.k
            r1.<init>(r0)
            r11.resumeWith(r1)
        L50:
            pe.z r7 = pe.z.f22715a
        L52:
            return r7
        L53:
            int r0 = r10.f1661v
            r1 = 1
            if (r0 == 0) goto L65
            if (r0 != r1) goto L5e
            pe.a.e(r11)
            goto L81
        L5e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r11)
            r11 = 0
            goto L83
        L65:
            pe.a.e(r11)
            java.lang.Object r11 = r10.f1663x
            d r11 = (d) r11
            j1.b r0 = new j1.b
            long r2 = r10.f1662w
            r0.<init>(r2)
            r0 r2 = k0.q0.f19398d
            r10.f1661v = r1
            java.lang.Object r11 = d.c(r11, r0, r2, r10)
            ue.a r0 = ue.a.f27192u
            if (r11 != r0) goto L81
            r11 = r0
            goto L83
        L81:
            pe.z r11 = pe.z.f22715a
        L83:
            return r11
        L84:
            int r0 = r10.f1661v
            r1 = 1
            if (r0 == 0) goto L96
            if (r0 != r1) goto L8f
            pe.a.e(r11)
            goto Lad
        L8f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r11)
            r11 = 0
            goto Laf
        L96:
            pe.a.e(r11)
            java.lang.Object r11 = r10.f1663x
            b3.k r11 = (b3.k) r11
            u1.d r11 = r11.f1670u
            r10.f1661v = r1
            long r0 = r10.f1662w
            java.lang.Object r11 = r11.b(r0, r10)
            ue.a r0 = ue.a.f27192u
            if (r11 != r0) goto Lad
            r11 = r0
            goto Laf
        Lad:
            pe.z r11 = pe.z.f22715a
        Laf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, long j10, te.c cVar, int i) {
        super(2, cVar);
        this.f1660u = i;
        this.f1663x = obj;
        this.f1662w = j10;
    }
}
