package gg;
import k.a;
import l.a;
import m.f;
import n.d;
import u.a;

import a0.f0;
import eg.t0;
import eg.z;
import fg.d0;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class a implements fg.k, dg.b, dg.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17756a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f17757b;

    /* renamed from: c, reason: collision with root package name */
    public final fg.c f17758c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17759d;
    public final fg.j e;

    public a(fg.c cVar, String str) {
        this.f17758c = cVar;
        this.f17759d = str;
        this.e = cVar.f16965a;
    }

    @Override // dg.b
    public final float A() {
        return J(S());
    }

    @Override // dg.a
    public final String B(cg.d dVar, int i) {
        dVar.getClass();
        return O(Q(dVar, i));
    }

    @Override // dg.b
    public final double C() {
        return I(S());
    }

    public abstract fg.m D(String str);

    public final fg.m E() {
        fg.m D;
        String str = (String) qe.l.D(this.f17756a);
        if (str != null && (D = D(str)) != null) {
            return D;
        }
        return R();
    }

    public final boolean F(Object obj) {
        Boolean bool;
        String str = (String) obj;
        str.getClass();
        fg.m D = D(str);
        if (D instanceof d0) {
            d0 d0Var = (d0) D;
            try {
                z zVar = fg.n.f16990a;
                String a10 = d0Var.a();
                String[] strArr = v.f17807a;
                a10.getClass();
                if (a10.equalsIgnoreCase("true")) {
                    bool = Boolean.TRUE;
                } else if (a10.equalsIgnoreCase("false")) {
                    bool = Boolean.FALSE;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                V(d0Var, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                V(d0Var, "boolean", str);
                throw null;
            }
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of boolean at element: " + U(str), D.toString());
    }

    public final byte G(Object obj) {
        Byte b10;
        String str = (String) obj;
        str.getClass();
        fg.m D = D(str);
        if (D instanceof d0) {
            d0 d0Var = (d0) D;
            try {
                long d2 = fg.d(d0Var);
                if (-128 <= d2 && d2 <= 127) {
                    b10 = Byte.valueOf((byte) d2);
                } else {
                    b10 = null;
                }
                if (b10 != null) {
                    return b10.byteValue();
                }
                V(d0Var, "byte", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                V(d0Var, "byte", str);
                throw null;
            }
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of byte at element: " + U(str), D.toString());
    }

    public final char H(Object obj) {
        String str = (String) obj;
        str.getClass();
        fg.m D = D(str);
        if (D instanceof d0) {
            d0 d0Var = (d0) D;
            try {
                String a10 = d0Var.a();
                a10.getClass();
                int length = a10.length();
                if (length != 0) {
                    if (length == 1) {
                        return a10.charAt(0);
                    }
                    throw new IllegalArgumentException("Char sequence has more than one element.");
                }
                throw new NoSuchElementException("Char sequence is empty.");
            } catch (IllegalArgumentException unused) {
                V(d0Var, "char", str);
                throw null;
            }
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of char at element: " + U(str), D.toString());
    }

    public final double I(Object obj) {
        String str = (String) obj;
        str.getClass();
        fg.m D = D(str);
        if (D instanceof d0) {
            d0 d0Var = (d0) D;
            try {
                z zVar = fg.n.f16990a;
                double parseDouble = Double.parseDouble(d0Var.a());
                fg.j jVar = this.f17758c.f16965a;
                if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                    return parseDouble;
                }
                throw k.a(Double.valueOf(parseDouble), str, E().toString());
            } catch (IllegalArgumentException unused) {
                V(d0Var, "double", str);
                throw null;
            }
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of double at element: " + U(str), D.toString());
    }

    public final float J(Object obj) {
        String str = (String) obj;
        str.getClass();
        fg.m D = D(str);
        if (D instanceof d0) {
            d0 d0Var = (d0) D;
            try {
                z zVar = fg.n.f16990a;
                float parseFloat = Float.parseFloat(d0Var.a());
                fg.j jVar = this.f17758c.f16965a;
                if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                    return parseFloat;
                }
                throw k.a(Float.valueOf(parseFloat), str, E().toString());
            } catch (IllegalArgumentException unused) {
                V(d0Var, "float", str);
                throw null;
            }
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of float at element: " + U(str), D.toString());
    }

    public final dg.b K(Object obj, cg.d dVar) {
        String str = (String) obj;
        str.getClass();
        dVar.getClass();
        if (u.a(dVar)) {
            fg.m D = D(str);
            String a10 = dVar.a();
            if (D instanceof d0) {
                String a11 = ((d0) D).a();
                fg.c cVar = this.f17758c;
                cVar.getClass();
                a11.getClass();
                return new h(new f0(a11), cVar);
            }
            throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of " + a10 + " at element: " + U(str), D.toString());
        }
        this.f17756a.add(str);
        return this;
    }

    public final int L(Object obj) {
        Integer num;
        String str = (String) obj;
        str.getClass();
        fg.m D = D(str);
        if (D instanceof d0) {
            d0 d0Var = (d0) D;
            try {
                long d2 = fg.d(d0Var);
                if (-2147483648L <= d2 && d2 <= 2147483647L) {
                    num = Integer.valueOf((int) d2);
                } else {
                    num = null;
                }
                if (num != null) {
                    return num.intValue();
                }
                V(d0Var, "int", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                V(d0Var, "int", str);
                throw null;
            }
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of int at element: " + U(str), D.toString());
    }

    public final long M(Object obj) {
        String str = (String) obj;
        str.getClass();
        fg.m D = D(str);
        if (D instanceof d0) {
            d0 d0Var = (d0) D;
            try {
                return fg.d(d0Var);
            } catch (IllegalArgumentException unused) {
                V(d0Var, "long", str);
                throw null;
            }
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of long at element: " + U(str), D.toString());
    }

    public final short N(Object obj) {
        Short sh;
        String str = (String) obj;
        str.getClass();
        fg.m D = D(str);
        if (D instanceof d0) {
            d0 d0Var = (d0) D;
            try {
                long d2 = fg.d(d0Var);
                if (-32768 <= d2 && d2 <= 32767) {
                    sh = Short.valueOf((short) d2);
                } else {
                    sh = null;
                }
                if (sh != null) {
                    return sh.shortValue();
                }
                V(d0Var, "short", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                V(d0Var, "short", str);
                throw null;
            }
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of short at element: " + U(str), D.toString());
    }

    public final String O(Object obj) {
        String str = (String) obj;
        str.getClass();
        fg.m D = D(str);
        if (D instanceof d0) {
            d0 d0Var = (d0) D;
            if (d0Var instanceof fg.t) {
                fg.t tVar = (fg.t) d0Var;
                if (tVar.f16995u) {
                    return tVar.f16996v;
                }
                fg.j jVar = this.f17758c.f16965a;
                throw k.e(-1, "String literal for key '" + str + "' should be quoted at element: " + U(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", E().toString());
            }
            throw k.e(-1, "Expected string value for a non-null key '" + str + "', got null literal instead at element: " + U(str), E().toString());
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of string at element: " + U(str), D.toString());
    }

    public String P(cg.d dVar, int i) {
        dVar.getClass();
        return dVar.g(i);
    }

    public final String Q(cg.d dVar, int i) {
        dVar.getClass();
        String P = P(dVar, i);
        P.getClass();
        return P;
    }

    public abstract fg.m R();

    public final Object S() {
        ArrayList arrayList = this.f17756a;
        Object remove = arrayList.remove(qe.f(arrayList));
        this.f17757b = true;
        return remove;
    }

    public final String T() {
        ArrayList arrayList = this.f17756a;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return qe.l.B(arrayList, ".", "$.", null, null, 60);
    }

    public final String U(String str) {
        str.getClass();
        return T() + '.' + str;
    }

    public final void V(d0 d0Var, String str, String str2) {
        String str3;
        if (str.startsWith("i")) {
            str3 = "an ";
        } else {
            str3 = "a ";
        }
        throw k.e(-1, "Failed to parse literal '" + d0Var + "' as " + str3.concat(str) + " value at element: " + U(str2), E().toString());
    }

    @Override // dg.b
    public final boolean a() {
        return F(S());
    }

    @Override // dg.b
    public final char b() {
        return H(S());
    }

    @Override // dg.a
    public final boolean c(cg.d dVar, int i) {
        dVar.getClass();
        return F(Q(dVar, i));
    }

    @Override // dg.a
    public final float d(cg.d dVar, int i) {
        dVar.getClass();
        return J(Q(dVar, i));
    }

    @Override // dg.a
    public final long e(cg.d dVar, int i) {
        dVar.getClass();
        return M(Q(dVar, i));
    }

    @Override // dg.a
    public void f(cg.d dVar) {
        dVar.getClass();
    }

    @Override // fg.k
    public final fg.m g() {
        return E();
    }

    @Override // dg.b
    public final int h() {
        return L(S());
    }

    @Override // dg.b
    public final dg.b i(cg.d dVar) {
        dVar.getClass();
        if (qe.l.D(this.f17756a) != null) {
            return K(S(), dVar);
        }
        return new m(this.f17758c, R(), this.f17759d).i(dVar);
    }

    @Override // dg.b
    public final String j() {
        return O(S());
    }

    @Override // dg.b
    public dg.a k(cg.d dVar) {
        dVar.getClass();
        fg.m E = E();
        wa.z e = dVar.e();
        boolean a10 = kotlin.jvm.internal.l.a(e, cg.i.f4135c);
        fg.c cVar = this.f17758c;
        if (!a10 && !(e instanceof cg.b)) {
            if (kotlin.jvm.internal.l.a(e, cg.i.f4136d)) {
                cg.d f10 = k.f(dVar.i(0), cVar.f16966b);
                wa.z e8 = f10.e();
                if (!(e8 instanceof cg.c) && !kotlin.jvm.internal.l.a(e8, cg.h.f4133c)) {
                    throw k.c(f10);
                }
                String a11 = dVar.a();
                if (E instanceof fg.z) {
                    return new p(cVar, (fg.z) E);
                }
                throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(fg.z.class).c() + ", but had " + kotlin.jvm.internal.z.a(E.getClass()).c() + " as the serialized body of " + a11 + " at element: " + T(), E.toString());
            }
            String a12 = dVar.a();
            if (E instanceof fg.z) {
                return new n(cVar, (fg.z) E, this.f17759d, 8);
            }
            throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(fg.z.class).c() + ", but had " + kotlin.jvm.internal.z.a(E.getClass()).c() + " as the serialized body of " + a12 + " at element: " + T(), E.toString());
        }
        String a13 = dVar.a();
        if (E instanceof fg.e) {
            return new o(cVar, (fg.e) E);
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(fg.e.class).c() + ", but had " + kotlin.jvm.internal.z.a(E.getClass()).c() + " as the serialized body of " + a13 + " at element: " + T(), E.toString());
    }

    @Override // dg.b
    public final int l(cg.d dVar) {
        dVar.getClass();
        String str = (String) S();
        str.getClass();
        fg.m D = D(str);
        String a10 = dVar.a();
        if (D instanceof d0) {
            return k.i(dVar, this.f17758c, ((d0) D).a(), "");
        }
        throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(d0.class).c() + ", but had " + kotlin.jvm.internal.z.a(D.getClass()).c() + " as the serialized body of " + a10 + " at element: " + U(str), D.toString());
    }

    @Override // dg.a
    public final int m(cg.d dVar, int i) {
        dVar.getClass();
        return L(Q(dVar, i));
    }

    @Override // dg.b
    public final long n() {
        return M(S());
    }

    @Override // dg.a
    public final dg.b o(t0 t0Var, int i) {
        t0Var.getClass();
        return K(Q(t0Var, i), t0Var.i(i));
    }

    @Override // dg.b
    public boolean p() {
        return !(E() instanceof fg.w);
    }

    @Override // dg.b
    public final Object q(ag.a aVar) {
        aVar.getClass();
        if (!(aVar instanceof ag.c)) {
            return aVar.b(this);
        }
        fg.j jVar = this.f17758c.f16965a;
        throw null;
    }

    @Override // dg.a
    public final short r(t0 t0Var, int i) {
        t0Var.getClass();
        return N(Q(t0Var, i));
    }

    @Override // dg.a
    public final Object s(cg.d dVar, int i, ag.a aVar, Object obj) {
        dVar.getClass();
        aVar.getClass();
        this.f17756a.add(Q(dVar, i));
        Object q10 = q(aVar);
        if (!this.f17757b) {
            S();
        }
        this.f17757b = false;
        return q10;
    }

    @Override // dg.a
    public final char u(t0 t0Var, int i) {
        t0Var.getClass();
        return H(Q(t0Var, i));
    }

    @Override // dg.a
    public final double v(t0 t0Var, int i) {
        t0Var.getClass();
        return I(Q(t0Var, i));
    }

    @Override // dg.a
    public final Object w(cg.d dVar, int i, ag.a aVar, Object obj) {
        Object q10;
        dVar.getClass();
        aVar.getClass();
        this.f17756a.add(Q(dVar, i));
        if (!aVar.d().c() && !p()) {
            q10 = null;
        } else {
            q10 = q(aVar);
        }
        if (!this.f17757b) {
            S();
        }
        this.f17757b = false;
        return q10;
    }

    @Override // dg.b
    public final byte x() {
        return G(S());
    }

    @Override // dg.a
    public final byte y(t0 t0Var, int i) {
        t0Var.getClass();
        return G(Q(t0Var, i));
    }

    @Override // dg.b
    public final short z() {
        return N(S());
    }
}
