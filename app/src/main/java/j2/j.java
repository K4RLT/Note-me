package j2;
import l.a;
import n.h;
import n.t;
import p.a;

import c2.n0;
import java.util.Iterator;
import n.i0;
import n.p0;

/* loaded from: classes.dex */
public final class j implements Iterable, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final i0 f18813u;

    /* renamed from: v, reason: collision with root package name */
    public t f18814v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18815w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18816x;

    public j() {
        long[] jArr = p0.f20923a;
        this.f18813u = new i0();
    }

    public final j a() {
        j jVar = new j();
        jVar.f18815w = this.f18815w;
        jVar.f18816x = this.f18816x;
        i0 i0Var = jVar.f18813u;
        i0Var.getClass();
        i0 i0Var2 = this.f18813u;
        i0Var2.getClass();
        Object[] objArr = i0Var2.f20893b;
        Object[] objArr2 = i0Var2.f20894c;
        long[] jArr = i0Var2.f20892a;
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
                            i0Var.m(objArr[i12], objArr2[i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return jVar;
    }

    public final Object b(v vVar) {
        Object g8 = this.f18813u.g(vVar);
        if (g8 != null) {
            return g8;
        }
        l4.a.j("Key not present: ", vVar, " - consider getOrElse or getOrNull");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (!kotlin.jvm.internal.a(this.f18813u, jVar.f18813u) || this.f18815w != jVar.f18815w || this.f18816x != jVar.f18816x) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void g(j jVar) {
        i0 i0Var = jVar.f18813u;
        Object[] objArr = i0Var.f20893b;
        Object[] objArr2 = i0Var.f20894c;
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
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            v vVar = (v) obj;
                            i0 i0Var2 = this.f18813u;
                            Object g8 = i0Var2.g(vVar);
                            vVar.getClass();
                            Object invoke = vVar.f18867b.invoke(g8, obj2);
                            if (invoke != null) {
                                i0Var2.m(vVar, invoke);
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

    public final int hashCode() {
        return Boolean.hashCode(this.f18816x) + a.c(this.f18813u.hashCode() * 31, 31, this.f18815w);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        t tVar = this.f18814v;
        if (tVar == null) {
            i0 i0Var = this.f18813u;
            i0Var.getClass();
            t tVar2 = new t(i0Var);
            this.f18814v = tVar2;
            tVar = tVar2;
        }
        return ((h) tVar.entrySet()).iterator();
    }

    public final void k(v vVar, Object obj) {
        boolean z3 = obj instanceof a;
        i0 i0Var = this.f18813u;
        if (z3 && i0Var.c(vVar)) {
            Object g8 = i0Var.g(vVar);
            g8.getClass();
            a aVar = (a) g8;
            a aVar2 = (a) obj;
            String str = aVar2.f18775a;
            if (str == null) {
                str = aVar.f18775a;
            }
            pe.d dVar = aVar2.f18776b;
            if (dVar == null) {
                dVar = aVar.f18776b;
            }
            i0Var.m(vVar, new a(str, dVar));
        } else {
            i0Var.m(vVar, obj);
        }
        vVar.getClass();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f18815w) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f18816x) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        i0 i0Var = this.f18813u;
        Object[] objArr = i0Var.f20893b;
        Object[] objArr2 = i0Var.f20894c;
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
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            sb2.append(str);
                            sb2.append(((v) obj).f18866a);
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return n0.t(this) + "{ " + ((Object) sb2) + " }";
    }
}
