package ya;
import n.i0;
import n.j0;
import n.p0;

/* loaded from: classes.dex */
public abstract class gc {
    public static final void a(i0 i0Var, Object obj, Object obj2) {
        boolean z3;
        Object obj3;
        int f10 = i0Var.f(obj);
        if (f10 < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            obj3 = null;
        } else {
            obj3 = i0Var.f20894c[f10];
        }
        if (obj3 != null) {
            if (obj3 instanceof j0) {
                ((j0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                j0 j0Var = new j0();
                j0Var.a(obj3);
                j0Var.a(obj2);
                obj2 = j0Var;
            }
            obj2 = obj3;
        }
        if (z3) {
            int i = ~f10;
            i0Var.f20893b[i] = obj;
            i0Var.f20894c[i] = obj2;
            return;
        }
        i0Var.f20894c[f10] = obj2;
    }

    public static i0 b() {
        long[] jArr = p0.f20923a;
        return new i0();
    }

    public static final boolean c(i0 i0Var, Object obj, Object obj2) {
        Object g8 = i0Var.g(obj);
        if (g8 == null) {
            return false;
        }
        if (g8 instanceof j0) {
            j0 j0Var = (j0) g8;
            boolean l10 = j0Var.l(obj2);
            if (l10 && j0Var.g()) {
                i0Var.k(obj);
            }
            return l10;
        }
        if (!g8.equals(obj2)) {
            return false;
        }
        i0Var.k(obj);
        return true;
    }

    public static final void d(i0 i0Var, Object obj) {
        boolean z3;
        long[] jArr = i0Var.f20892a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            int i12 = (i << 3) + i11;
                            Object obj2 = i0Var.f20893b[i12];
                            Object obj3 = i0Var.f20894c[i12];
                            if (obj3 instanceof j0) {
                                j0 j0Var = (j0) obj3;
                                j0Var.l(obj);
                                z3 = j0Var.g();
                            } else if (obj3 == obj) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                i0Var.l(i12);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
