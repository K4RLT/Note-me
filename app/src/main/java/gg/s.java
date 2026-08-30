package gg;
import q.q;
import s.f;
import u.a;

import a0.f0;
import b0.e1;
import c7.x;
import java.util.ArrayList;
import wa.d6;

/* loaded from: classes.dex */
public final class s extends d6 implements fg.k {

    /* renamed from: a, reason: collision with root package name */
    public final fg.c f17795a;

    /* renamed from: b, reason: collision with root package name */
    public final w f17796b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f17797c;

    /* renamed from: d, reason: collision with root package name */
    public int f17798d;
    public final j e;

    public s(fg.c cVar, w wVar, f0 f0Var, cg.d dVar) {
        j jVar;
        dVar.getClass();
        this.f17795a = cVar;
        this.f17796b = wVar;
        this.f17797c = f0Var;
        this.f17798d = -1;
        if (cVar.f16965a.f16986d) {
            jVar = null;
        } else {
            jVar = new j(dVar);
        }
        this.e = jVar;
    }

    @Override // wa.d6, dg.b
    public final float A() {
        f0 f0Var = this.f17797c;
        String j10 = f0Var.j();
        try {
            float parseFloat = Float.parseFloat(j10);
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            k.o(f0Var, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            f0.u(f0Var, "Failed to parse type 'float' for input '" + j10 + '\'', 0, 6);
            throw null;
        }
    }

    @Override // wa.d6, dg.b
    public final double C() {
        f0 f0Var = this.f17797c;
        String j10 = f0Var.j();
        try {
            double parseDouble = Double.parseDouble(j10);
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            k.o(f0Var, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            f0.u(f0Var, "Failed to parse type 'double' for input '" + j10 + '\'', 0, 6);
            throw null;
        }
    }

    @Override // wa.d6, dg.b
    public final boolean a() {
        boolean z3;
        boolean z9;
        f0 f0Var = this.f17797c;
        int Q = f0Var.Q();
        String str = (String) f0Var.f50f;
        if (Q != str.length()) {
            if (str.charAt(Q) == '\"') {
                Q++;
                z3 = true;
            } else {
                z3 = false;
            }
            int E = f0Var.E(Q);
            if (E < str.length() && E != -1) {
                int i = E + 1;
                int charAt = str.charAt(E) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        f0Var.c(i, "rue");
                        z9 = true;
                    } else {
                        f0.u(f0Var, "Expected valid boolean literal prefix, but had '" + f0Var.j() + '\'', 0, 6);
                        throw null;
                    }
                } else {
                    f0Var.c(i, "alse");
                    z9 = false;
                }
                if (z3) {
                    if (f0Var.f47b != str.length()) {
                        if (str.charAt(f0Var.f47b) == '\"') {
                            f0Var.f47b++;
                            return z9;
                        }
                        f0.u(f0Var, "Expected closing quotation mark", 0, 6);
                        throw null;
                    }
                    f0.u(f0Var, "EOF", 0, 6);
                    throw null;
                }
                return z9;
            }
            f0.u(f0Var, "EOF", 0, 6);
            throw null;
        }
        f0.u(f0Var, "EOF", 0, 6);
        throw null;
    }

    @Override // wa.d6, dg.b
    public final char b() {
        f0 f0Var = this.f17797c;
        String j10 = f0Var.j();
        if (j10.length() == 1) {
            return j10.charAt(0);
        }
        f0.u(f0Var, "Expected single char, but got '" + j10 + '\'', 0, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (gg.k.j(r6, r5.f17795a) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (t(r6) != (-1)) goto L20;
     */
    @Override // wa.d6, dg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(cg.d r6) {
        /*
            r5 = this;
            r6.getClass()
            int r0 = r6.f()
            r1 = -1
            if (r0 != 0) goto L18
            fg.c r0 = r5.f17795a
            boolean r0 = gg.k.j(r6, r0)
            if (r0 == 0) goto L18
        L12:
            int r0 = r5.t(r6)
            if (r0 != r1) goto L12
        L18:
            a0.f0 r6 = r5.f17797c
            boolean r0 = r6.S()
            if (r0 != 0) goto L43
            gg.w r0 = r5.f17796b
            char r0 = r0.f17814v
            r6.g(r0)
            java.lang.Object r6 = r6.f48c
            b0.e1 r6 = (b0.e1) r6
            int r0 = r6.f1179b
            java.lang.Object r2 = r6.f1181d
            int[] r2 = (int[]) r2
            r3 = r2[r0]
            r4 = -2
            if (r3 != r4) goto L3b
            r2[r0] = r1
            int r0 = r0 + r1
            r6.f1179b = r0
        L3b:
            int r0 = r6.f1179b
            if (r0 == r1) goto L42
            int r0 = r0 + r1
            r6.f1179b = r0
        L42:
            return
        L43:
            java.lang.String r0 = ""
            gg.k.k(r6, r0)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.f(cg.d):void");
    }

    @Override // fg.k
    public final fg.m g() {
        return new x(this.f17795a.f16965a, this.f17797c).i();
    }

    @Override // wa.d6, dg.b
    public final int h() {
        f0 f0Var = this.f17797c;
        long h3 = f0Var.h();
        int i = (int) h3;
        if (h3 == i) {
            return i;
        }
        f0.u(f0Var, "Failed to parse int for input '" + h3 + '\'', 0, 6);
        throw null;
    }

    @Override // wa.d6, dg.b
    public final dg.b i(cg.d dVar) {
        dVar.getClass();
        if (a(dVar)) {
            return new h(this.f17797c, this.f17795a);
        }
        return this;
    }

    @Override // wa.d6, dg.b
    public final String j() {
        return this.f17797c.i();
    }

    @Override // wa.d6, dg.b
    public final dg.a k(cg.d dVar) {
        dVar.getClass();
        fg.c cVar = this.f17795a;
        w n10 = k.n(dVar, cVar);
        f0 f0Var = this.f17797c;
        e1 e1Var = (e1) f0Var.f48c;
        int i = e1Var.f1179b + 1;
        e1Var.f1179b = i;
        if (i == ((Object[]) e1Var.f1180c).length) {
            e1Var.i();
        }
        ((Object[]) e1Var.f1180c)[i] = dVar;
        f0Var.g(n10.f17813u);
        if (f0Var.D() != 4) {
            int ordinal = n10.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (this.f17796b == n10 && cVar.f16965a.f16986d) {
                    return this;
                }
                return new s(cVar, n10, f0Var, dVar);
            }
            return new s(cVar, n10, f0Var, dVar);
        }
        f0.u(f0Var, "Unexpected leading comma", 0, 6);
        throw null;
    }

    @Override // wa.d6, dg.b
    public final int l(cg.d dVar) {
        dVar.getClass();
        f0 f0Var = this.f17797c;
        return k.i(dVar, this.f17795a, f0Var.i(), " at path ".concat(((e1) f0Var.f48c).f()));
    }

    @Override // wa.d6, dg.b
    public final long n() {
        return this.f17797c.h();
    }

    @Override // wa.d6, dg.b
    public final boolean p() {
        boolean z3;
        j jVar = this.e;
        if (jVar != null) {
            z3 = jVar.f17772b;
        } else {
            z3 = false;
        }
        if (!z3) {
            f0 f0Var = this.f17797c;
            int E = f0Var.E(f0Var.Q());
            String str = (String) f0Var.f50f;
            int length = str.length() - E;
            boolean z9 = false;
            if (length >= 4 && E != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(E + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || k.g(str.charAt(E + 4)) != 0) {
                        z9 = true;
                        f0Var.f47b = E + 4;
                    }
                }
            }
            if (!z9) {
                return true;
            }
        }
        return false;
    }

    @Override // wa.d6, dg.b
    public final Object q(ag.a aVar) {
        aVar.getClass();
        try {
            if (!(aVar instanceof ag.c)) {
                return aVar.b(this);
            }
            throw null;
        } catch (ag.b e) {
            String message = e.getMessage();
            message.getClass();
            if (mf.f.n(message, "at path")) {
                throw e;
            }
            throw new ag.b(e.f381u, e.getMessage() + " at path: " + ((e1) this.f17797c.f48c).f(), e);
        }
    }

    @Override // wa.d6, dg.a
    public final Object s(cg.d dVar, int i, ag.a aVar, Object obj) {
        boolean z3;
        e1 e1Var = (e1) this.f17797c.f48c;
        dVar.getClass();
        aVar.getClass();
        if (this.f17796b == w.f17811y && (i & 1) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            int[] iArr = (int[]) e1Var.f1181d;
            int i10 = e1Var.f1179b;
            if (iArr[i10] == -2) {
                ((Object[]) e1Var.f1180c)[i10] = l.f17774a;
            }
        }
        Object q10 = q(aVar);
        if (z3) {
            int[] iArr2 = (int[]) e1Var.f1181d;
            int i11 = e1Var.f1179b;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                e1Var.f1179b = i12;
                if (i12 == ((Object[]) e1Var.f1180c).length) {
                    e1Var.i();
                }
            }
            Object[] objArr = (Object[]) e1Var.f1180c;
            int i13 = e1Var.f1179b;
            objArr[i13] = q10;
            ((int[]) e1Var.f1181d)[i13] = -2;
        }
        return q10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dg.a
    public final int t(cg.d dVar) {
        byte b10;
        Object[] objArr;
        f0 f0Var = this.f17797c;
        e1 e1Var = (e1) f0Var.f48c;
        String str = (String) f0Var.f50f;
        dVar.getClass();
        w wVar = this.f17796b;
        int ordinal = wVar.ordinal();
        Throwable th = null;
        char c10 = ':';
        int i = 0;
        r11 = false;
        boolean z3 = false;
        byte b11 = 1;
        int i10 = -1;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean S = f0Var.S();
                if (f0Var.b()) {
                    int i11 = this.f17798d;
                    if (i11 != -1 && !S) {
                        f0.u(f0Var, "Expected end of the array or comma", 0, 6);
                        throw null;
                    }
                    i10 = i11 + 1;
                    this.f17798d = i10;
                } else if (S) {
                    k.k(f0Var, "array");
                    throw null;
                }
            } else {
                int i12 = this.f17798d;
                if (i12 % 2 != 0) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                if (objArr != false) {
                    if (i12 != -1) {
                        z3 = f0Var.S();
                    }
                } else {
                    f0Var.g(':');
                }
                if (f0Var.b()) {
                    if (objArr != false) {
                        int i13 = this.f17798d;
                        int i14 = f0Var.f47b;
                        if (i13 == -1) {
                            if (z3) {
                                f0.u(f0Var, "Unexpected leading comma", i14, 4);
                                throw null;
                            }
                        } else if (!z3) {
                            f0.u(f0Var, "Expected comma after the key-value pair", i14, 4);
                            throw null;
                        }
                    }
                    i10 = this.f17798d + 1;
                    this.f17798d = i10;
                } else if (z3) {
                    k.k(f0Var, "object");
                    throw null;
                }
            }
        } else {
            boolean S2 = f0Var.S();
            while (true) {
                boolean b12 = f0Var.b();
                Throwable th2 = th;
                j jVar = this.e;
                if (b12) {
                    String d2 = f0Var.d();
                    f0Var.g(c10);
                    fg.c cVar = this.f17795a;
                    int h3 = k.h(dVar, cVar, d2);
                    byte b13 = b11;
                    if (h3 != -3) {
                        if (jVar != null) {
                            eg.s sVar = jVar.f17771a;
                            if (h3 < 64) {
                                sVar.f16580c |= 1 << h3;
                            } else {
                                int i15 = (h3 >>> 6) - 1;
                                long[] jArr = sVar.f16581d;
                                jArr[i15] = jArr[i15] | (1 << (h3 & 63));
                            }
                        }
                        i10 = h3;
                    } else {
                        if (!k.j(dVar, cVar)) {
                            int i16 = e1Var.f1179b;
                            int[] iArr = (int[]) e1Var.f1181d;
                            if (iArr[i16] == -2) {
                                iArr[i16] = -1;
                                e1Var.f1179b = i16 - 1;
                            }
                            int i17 = e1Var.f1179b;
                            if (i17 != -1) {
                                e1Var.f1179b = i17 - 1;
                            }
                            int v2 = mf.f.v(str.subSequence(0, f0Var.f47b).toString(), 6, d2);
                            StringBuilder m4 = a5.a.m("Encountered an unknown key '", d2, "' at offset ", v2, " at path: ");
                            m4.append(e1Var.f());
                            m4.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                            m4.append((Object) k.l(str, v2));
                            throw new IllegalArgumentException(m4.toString());
                        }
                        ArrayList arrayList = new ArrayList();
                        byte D = f0Var.D();
                        if (D == 8 || D == 6) {
                            while (true) {
                                byte D2 = f0Var.D();
                                b10 = b13;
                                if (D2 == b10) {
                                    f0Var.d();
                                } else {
                                    if (D2 != 8 && D2 != 6) {
                                        if (D2 == 9) {
                                            if (((Number) qe.l.C(arrayList)).byteValue() == 8) {
                                                qe.q(arrayList);
                                            } else {
                                                throw k.e(f0Var.f47b, "found ] instead of } at path: " + e1Var, str);
                                            }
                                        } else if (D2 == 7) {
                                            if (((Number) qe.l.C(arrayList)).byteValue() == 6) {
                                                qe.q(arrayList);
                                            } else {
                                                throw k.e(f0Var.f47b, "found } instead of ] at path: " + e1Var, str);
                                            }
                                        } else if (D2 == 10) {
                                            f0.u(f0Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                            throw th2;
                                        }
                                    } else {
                                        arrayList.add(Byte.valueOf(D2));
                                    }
                                    f0Var.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                                b13 = b10;
                            }
                        } else {
                            f0Var.j();
                            b10 = b13;
                        }
                        S2 = f0Var.S();
                        b11 = b10;
                        th = th2;
                        c10 = ':';
                    }
                } else if (!S2) {
                    if (jVar != null) {
                        eg.s sVar2 = jVar.f17771a;
                        g5.u uVar = sVar2.f16579b;
                        cg.d dVar2 = sVar2.f16578a;
                        int f10 = dVar2.f();
                        while (true) {
                            long j10 = sVar2.f16580c;
                            long j11 = -1;
                            if (j10 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                                sVar2.f16580c |= 1 << numberOfTrailingZeros;
                                if (((Boolean) uVar.invoke(dVar2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i10 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (f10 > 64) {
                                long[] jArr2 = sVar2.f16581d;
                                int length = jArr2.length;
                                loop3: while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    int i18 = i + 1;
                                    int i19 = i18 * 64;
                                    long j12 = jArr2[i];
                                    while (j12 != j11) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j12);
                                        j12 |= 1 << numberOfTrailingZeros2;
                                        int i20 = numberOfTrailingZeros2 + i19;
                                        if (((Boolean) uVar.invoke(dVar2, Integer.valueOf(i20))).booleanValue()) {
                                            jArr2[i] = j12;
                                            i10 = i20;
                                            break loop3;
                                        }
                                        j11 = -1;
                                    }
                                    jArr2[i] = j12;
                                    i = i18;
                                    j11 = -1;
                                }
                            }
                        }
                    }
                } else {
                    k.k(f0Var, "object");
                    throw th2;
                }
            }
        }
        if (wVar != w.f17811y) {
            ((int[]) e1Var.f1181d)[e1Var.f1179b] = i10;
        }
        return i10;
    }

    @Override // wa.d6, dg.b
    public final byte x() {
        f0 f0Var = this.f17797c;
        long h3 = f0Var.h();
        byte b10 = (byte) h3;
        if (h3 == b10) {
            return b10;
        }
        f0.u(f0Var, "Failed to parse byte for input '" + h3 + '\'', 0, 6);
        throw null;
    }

    @Override // wa.d6, dg.b
    public final short z() {
        f0 f0Var = this.f17797c;
        long h3 = f0Var.h();
        short s10 = (short) h3;
        if (h3 == s10) {
            return s10;
        }
        f0.u(f0Var, "Failed to parse short for input '" + h3 + '\'', 0, 6);
        throw null;
    }
}
