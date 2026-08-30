package k0;
import g0.a1;
import g1.e;
import l.a;
import r.a;
import v0.h;

/* loaded from: classes.dex */
public final /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19403a;

    public /* synthetic */ s(int i) {
        this.f19403a = i;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.jvm.internal.u, java.lang.Object] */
    public final r a(m0 m0Var) {
        boolean z3;
        q l10;
        q qVar;
        boolean z9;
        q qVar2;
        boolean z10;
        boolean z11;
        int s10;
        r a10;
        switch (this.f19403a) {
            case 0:
                q a11 = m0Var.j().a(m0Var.j().f19385c);
                q a12 = m0Var.h().a(m0Var.h().f19386d);
                if (m0Var.i() == i.f19302u) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new r(a11, a12, z3);
            case 1:
                return h(m0Var, t.f19408c);
            case 2:
                return h(m0Var, t.f19407b);
            default:
                r c10 = m0Var.c();
                if (c10 == null) {
                    return h(m0Var, t.f19408c);
                }
                q qVar3 = c10.f19400b;
                q qVar4 = c10.f19399a;
                if (m0Var.a()) {
                    qVar = v0.l(m0Var, m0Var.j(), qVar4);
                    l10 = qVar3;
                    qVar3 = qVar4;
                    qVar4 = qVar;
                } else {
                    l10 = v0.l(m0Var, m0Var.h(), qVar3);
                    qVar = l10;
                }
                if (!kotlin.jvm.internal.a(qVar, qVar3)) {
                    if (m0Var.i() != i.f19302u && (m0Var.i() != i.f19304w || qVar4.f19393b <= l10.f19393b)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    r rVar = new r(qVar4, l10, z9);
                    boolean z12 = false;
                    q qVar5 = rVar.f19399a;
                    long j10 = qVar5.f19394c;
                    q qVar6 = rVar.f19400b;
                    if (j10 == qVar6.f19394c) {
                        if (qVar5.f19393b == qVar6.f19393b) {
                            z10 = true;
                        }
                        z10 = false;
                    } else {
                        boolean z13 = rVar.f19401c;
                        if (z13) {
                            qVar2 = qVar5;
                        } else {
                            qVar2 = qVar6;
                        }
                        if (qVar2.f19393b == 0) {
                            if (z13) {
                                qVar5 = qVar6;
                            }
                            if (m0Var.d().f19387f.f20524a.f20514a.f20477v.length() == qVar5.f19393b) {
                                Object obj = new Object();
                                obj.f19783u = true;
                                m0Var.k(new e(obj, 1));
                                z10 = obj.f19783u;
                            }
                        }
                        z10 = false;
                    }
                    if (z10) {
                        String str = m0Var.b().f19387f.f20524a.f20514a.f20477v;
                        if (m0Var.m() <= 1 && m0Var.c() != null) {
                            if (str.length() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                p b10 = m0Var.b();
                                String str2 = b10.f19387f.f20524a.f20514a.f20477v;
                                int i = b10.f19385c;
                                int length = str2.length();
                                if (i == 0) {
                                    int s11 = a1.s(0, str2);
                                    if (m0Var.a()) {
                                        a10 = a(rVar, v0.o(rVar.f19399a, b10, s11), null, true, 2);
                                    } else {
                                        a10 = a(rVar, null, v0.o(rVar.f19400b, b10, s11), false, 1);
                                    }
                                } else if (i == length) {
                                    int v2 = a1.v(length, str2);
                                    if (m0Var.a()) {
                                        a10 = a(rVar, v0.o(rVar.f19399a, b10, v2), null, false, 2);
                                    } else {
                                        a10 = a(rVar, null, v0.o(rVar.f19400b, b10, v2), true, 1);
                                    }
                                } else {
                                    r c11 = m0Var.c();
                                    if (c11 != null && c11.f19401c) {
                                        z12 = true;
                                    }
                                    if (m0Var.a() ^ z12) {
                                        s10 = a1.v(i, str2);
                                    } else {
                                        s10 = a1.s(i, str2);
                                    }
                                    if (m0Var.a()) {
                                        a10 = a(rVar, v0.o(rVar.f19399a, b10, s10), null, z12, 2);
                                    } else {
                                        a10 = a(rVar, null, v0.o(rVar.f19400b, b10, s10), z12, 1);
                                    }
                                }
                                return a10;
                            }
                        }
                    }
                    return rVar;
                }
                return c10;
        }
    }
}