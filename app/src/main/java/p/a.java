package p;
import b1.y;
import j.i0;
import r.i;
import r0.f1;
import r0.r;
import z0.g;

import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import r0.n2;
import u7.m3;
import wa.n7;
import ya.hc;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(int i, int i10, float f10) {
        return (Float.hashCode(f10) + i) * i10;
    }

    public static int b(int i, int i10, int i11) {
        return (Integer.hashCode(i) + i10) * i11;
    }

    public static int c(int i, int i10, boolean z3) {
        return (Boolean.hashCode(z3) + i) * i10;
    }

    public static int d(long j10, int i, int i10) {
        return (Long.hashCode(j10) + i) * i10;
    }

    public static b2.f e(r rVar, z1.p0 p0Var, r rVar2, g gVar) {
        y.I(b2.g.e, p0Var, rVar);
        y.I(b2.g.f1464d, gVar, rVar2);
        return b2.g.f1465f;
    }

    public static ClassCastException f(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object g(Number number, k1.m0 m0Var, n2 n2Var) {
        m0Var.h(number.floatValue());
        return n2Var.getValue();
    }

    public static Object h(String str, Integer num, y yVar) {
        return yVar.get(new pe.j(str, num));
    }

    public static String i() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return uuid;
    }

    public static String j(int i, String str, StringBuilder sb2) {
        sb2.append(i);
        sb2.append(str);
        return sb2.toString();
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(StringBuilder sb2, float f10, char c10) {
        sb2.append(f10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String p(r rVar, int i, int i10, r rVar2, boolean z3) {
        rVar.a0(i);
        String b10 = n7.b(i10, rVar2);
        rVar.p(z3);
        return b10;
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static i r(r rVar) {
        i iVar = new i();
        rVar.k0(iVar);
        return iVar;
    }

    public static void s(int i, int i10, int i11, int i12, int i13) {
        hc.a(i);
        hc.a(i10);
        hc.a(i11);
        hc.a(i12);
        hc.a(i13);
    }

    public static void t(int i, r rVar, int i10, b2.f fVar) {
        rVar.k0(Integer.valueOf(i));
        rVar.b(fVar, Integer.valueOf(i10));
    }

    public static void u(long j10, StringBuilder sb2, String str) {
        sb2.append((Object) k1.i(j10));
        sb2.append(str);
    }

    public static void v(i0 i0Var, long j10) {
        i0Var.j().s();
        i0Var.I(j10);
    }

    public static void w(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void x(f1 f1Var, int i, m3 m3Var) {
        m3Var.Z0(f1Var.h() + i);
    }

    public static Object y(Number number, k1.m0 m0Var, n2 n2Var) {
        m0Var.i(number.floatValue());
        return n2Var.getValue();
    }
}
