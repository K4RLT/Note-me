package m2;
import d.a;
import k.b;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f20554d = new q0(0, 0, null, null, null, 0, 0, 0, null, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final h0 f20555a;

    /* renamed from: b, reason: collision with root package name */
    public final v f20556b;

    /* renamed from: c, reason: collision with root package name */
    public final z f20557c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q0(long r26, long r28, q2.s r30, q2.o r31, q2.i r32, long r33, int r35, long r36, m2.z r38, int r39) {
        /*
            r25 = this;
            r0 = r39
            r1 = r0 & 1
            if (r1 == 0) goto La
            long r1 = k1.r.f19521l
            r4 = r1
            goto Lc
        La:
            r4 = r26
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            long r1 = y2.o.f30819c
            r6 = r1
            goto L16
        L14:
            r6 = r28
        L16:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L1d
            r8 = r2
            goto L1f
        L1d:
            r8 = r30
        L1f:
            r1 = r0 & 8
            if (r1 == 0) goto L25
            r9 = r2
            goto L27
        L25:
            r9 = r31
        L27:
            r1 = r0 & 32
            if (r1 == 0) goto L2d
            r11 = r2
            goto L2f
        L2d:
            r11 = r32
        L2f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L37
            long r12 = y2.o.f30819c
            r13 = r12
            goto L39
        L37:
            r13 = r33
        L39:
            long r18 = k1.r.f19521l
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L44
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L46
        L44:
            r1 = r35
        L46:
            r3 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r0
            if (r3 == 0) goto L50
            long r15 = y2.o.f30819c
            r23 = r15
            goto L52
        L50:
            r23 = r36
        L52:
            r3 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L59
            r0 = r2
            goto L5b
        L59:
            r0 = r38
        L5b:
            m2.h0 r3 = new m2.h0
            if (r0 == 0) goto L64
            m2.y r10 = r0.f20583a
            r22 = r10
            goto L66
        L64:
            r22 = r2
        L66:
            r10 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22)
            m2.v r4 = new m2.v
            if (r0 == 0) goto L7a
            m2.x r2 = r0.f20584b
        L7a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 0
            r27 = r1
            r32 = r2
            r26 = r4
            r28 = r5
            r31 = r6
            r33 = r7
            r34 = r8
            r35 = r9
            r36 = r10
            r29 = r23
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36)
            r1 = r25
            r2 = r26
            r1.<init>(r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.q0.<init>(long, long, q2.s, q2.o, q2.i, long, int, long, m2.z, int):void");
    }

    public static q0 a(q0 q0Var, long j10, long j11, q2.s sVar, q2.i iVar, long j12, long j13, z zVar, x2.i iVar2, int i) {
        long j14;
        long j15;
        q2.s sVar2;
        q2.i iVar3;
        long j16;
        long j17;
        z zVar2;
        x2.i iVar4;
        x2.o oVar;
        y yVar;
        if ((i & 1) != 0) {
            j14 = q0Var.f20555a.f20484a.b();
        } else {
            j14 = j10;
        }
        if ((i & 2) != 0) {
            j15 = q0Var.f20555a.f20485b;
        } else {
            j15 = j11;
        }
        if ((i & 4) != 0) {
            sVar2 = q0Var.f20555a.f20486c;
        } else {
            sVar2 = sVar;
        }
        h0 h0Var = q0Var.f20555a;
        q2.o oVar2 = h0Var.f20487d;
        q2.p pVar = h0Var.e;
        if ((i & 32) != 0) {
            iVar3 = h0Var.f20488f;
        } else {
            iVar3 = iVar;
        }
        String str = h0Var.f20489g;
        if ((i & 128) != 0) {
            j16 = h0Var.f20490h;
        } else {
            j16 = j12;
        }
        x2.a aVar = h0Var.i;
        x2.p pVar2 = h0Var.f20491j;
        t2.b bVar = h0Var.f20492k;
        long j18 = h0Var.f20493l;
        x2.l lVar = h0Var.f20494m;
        k1.o0 o0Var = h0Var.f20495n;
        m1.e eVar = h0Var.f20497p;
        v vVar = q0Var.f20556b;
        int i10 = vVar.f20571a;
        int i11 = vVar.f20572b;
        if ((i & 131072) != 0) {
            j17 = vVar.f20573c;
        } else {
            j17 = j13;
        }
        x2.q qVar = vVar.f20574d;
        if ((i & 524288) != 0) {
            zVar2 = q0Var.f20557c;
        } else {
            zVar2 = zVar;
        }
        if ((i & 1048576) != 0) {
            iVar4 = vVar.f20575f;
        } else {
            iVar4 = iVar2;
        }
        int i12 = vVar.f20576g;
        int i13 = vVar.f20577h;
        x2.s sVar3 = vVar.i;
        long b10 = h0Var.f20484a.b();
        int i14 = k1.r.f19522m;
        if (pe.a(j14, b10)) {
            oVar = h0Var.f20484a;
        } else if (j14 != 16) {
            oVar = new x2.c(j14);
        } else {
            oVar = x2.n.f30066a;
        }
        x xVar = null;
        if (zVar2 != null) {
            yVar = zVar2.f20583a;
        } else {
            yVar = null;
        }
        h0 h0Var2 = new h0(oVar, j15, sVar2, oVar2, pVar, iVar3, str, j16, aVar, pVar2, bVar, j18, lVar, o0Var, yVar, eVar);
        if (zVar2 != null) {
            xVar = zVar2.f20584b;
        }
        return new q0(h0Var2, new v(i10, i11, j17, qVar, xVar, iVar4, i12, i13, sVar3), zVar2);
    }

    public static q0 e(q0 q0Var, long j10, long j11, q2.s sVar, q2.o oVar, q2.i iVar, long j12, int i, long j13, int i10) {
        long j14;
        q2.s sVar2;
        q2.o oVar2;
        q2.i iVar2;
        long j15;
        int i11;
        long j16;
        if ((i10 & 2) != 0) {
            j14 = y2.o.f30819c;
        } else {
            j14 = j11;
        }
        if ((i10 & 4) != 0) {
            sVar2 = null;
        } else {
            sVar2 = sVar;
        }
        if ((i10 & 8) != 0) {
            oVar2 = null;
        } else {
            oVar2 = oVar;
        }
        if ((i10 & 32) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        if ((i10 & 128) != 0) {
            j15 = y2.o.f30819c;
        } else {
            j15 = j12;
        }
        long j17 = k1.r.f19521l;
        if ((32768 & i10) != 0) {
            i11 = Integer.MIN_VALUE;
        } else {
            i11 = i;
        }
        if ((i10 & 131072) != 0) {
            j16 = y2.o.f30819c;
        } else {
            j16 = j13;
        }
        h0 a10 = a(q0Var.f20555a, j10, null, Float.NaN, j14, sVar2, oVar2, null, iVar2, null, j15, null, null, null, j17, null, null, null, null);
        v a11 = a(q0Var.f20556b, i11, Integer.MIN_VALUE, j16, null, null, null, 0, Integer.MIN_VALUE, null);
        if (q0Var.f20555a == a10 && q0Var.f20556b == a11) {
            return q0Var;
        }
        return new q0(a10, a11);
    }

    public final long b() {
        return this.f20555a.f20484a.b();
    }

    public final boolean c(q0 q0Var) {
        if (this != q0Var) {
            if (!kotlin.jvm.internal.a(this.f20556b, q0Var.f20556b) || !this.f20555a.a(q0Var.f20555a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final q0 d(q0 q0Var) {
        if (q0Var != null && !q0Var.equals(f20554d)) {
            return new q0(this.f20555a.c(q0Var.f20555a), this.f20556b.a(q0Var.f20556b));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (kotlin.jvm.internal.a(this.f20555a, q0Var.f20555a) && kotlin.jvm.internal.a(this.f20556b, q0Var.f20556b) && kotlin.jvm.internal.a(this.f20557c, q0Var.f20557c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f20556b.hashCode() + (this.f20555a.hashCode() * 31)) * 31;
        z zVar = this.f20557c;
        if (zVar != null) {
            i = zVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) k1.r.i(b()));
        sb2.append(", brush=");
        h0 h0Var = this.f20555a;
        sb2.append(h0Var.f20484a.c());
        sb2.append(", alpha=");
        sb2.append(h0Var.f20484a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) y2.o.e(h0Var.f20485b));
        sb2.append(", fontWeight=");
        sb2.append(h0Var.f20486c);
        sb2.append(", fontStyle=");
        sb2.append(h0Var.f20487d);
        sb2.append(", fontSynthesis=");
        sb2.append(h0Var.e);
        sb2.append(", fontFamily=");
        sb2.append(h0Var.f20488f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(h0Var.f20489g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) y2.o.e(h0Var.f20490h));
        sb2.append(", baselineShift=");
        sb2.append(h0Var.i);
        sb2.append(", textGeometricTransform=");
        sb2.append(h0Var.f20491j);
        sb2.append(", localeList=");
        sb2.append(h0Var.f20492k);
        sb2.append(", background=");
        p.a.u(h0Var.f20493l, sb2, ", textDecoration=");
        sb2.append(h0Var.f20494m);
        sb2.append(", shadow=");
        sb2.append(h0Var.f20495n);
        sb2.append(", drawStyle=");
        sb2.append(h0Var.f20497p);
        sb2.append(", textAlign=");
        v vVar = this.f20556b;
        sb2.append((Object) x2.b(vVar.f20571a));
        sb2.append(", textDirection=");
        sb2.append((Object) x2.a(vVar.f20572b));
        sb2.append(", lineHeight=");
        sb2.append((Object) y2.o.e(vVar.f20573c));
        sb2.append(", textIndent=");
        sb2.append(vVar.f20574d);
        sb2.append(", platformStyle=");
        sb2.append(this.f20557c);
        sb2.append(", lineHeightStyle=");
        sb2.append(vVar.f20575f);
        sb2.append(", lineBreak=");
        sb2.append((Object) x2.e.a(vVar.f20576g));
        sb2.append(", hyphens=");
        sb2.append((Object) x2.a(vVar.f20577h));
        sb2.append(", textMotion=");
        sb2.append(vVar.i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q0(m2.h0 r4, m2.v r5) {
        /*
            r3 = this;
            m2.y r0 = r4.f20496o
            m2.x r1 = r5.e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            m2.z r2 = new m2.z
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.q0.<init>(m2.h0, m2.v):void");
    }

    public q0(h0 h0Var, v vVar, z zVar) {
        this.f20555a = h0Var;
        this.f20556b = vVar;
        this.f20557c = zVar;
    }
}
