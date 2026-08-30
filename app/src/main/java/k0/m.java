package k0;
import k0.m0;
import n.a0;
import n.o;
import n.y;
import w.a;

import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f19353a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19354b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19355c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19356d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final r f19357f;

    public m(y yVar, List list, int i, int i10, boolean z3, r rVar) {
        this.f19353a = yVar;
        this.f19354b = list;
        this.f19355c = i;
        this.f19356d = i10;
        this.e = z3;
        this.f19357f = rVar;
        if (!(list.size() > 1)) {
            a.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
        }
    }

    public static void n(a0 a0Var, r rVar, p pVar, int i, int i10) {
        r rVar2;
        boolean z3 = false;
        if (rVar.f19401c) {
            q a10 = pVar.a(i10);
            q a11 = pVar.a(i);
            if (i10 > i) {
                z3 = true;
            }
            rVar2 = new r(a10, a11, z3);
        } else {
            q a12 = pVar.a(i);
            q a13 = pVar.a(i10);
            if (i > i10) {
                z3 = true;
            }
            rVar2 = new r(a12, a13, z3);
        }
        if (i > i10) {
            a.c("minOffset should be less than or equal to maxOffset: " + rVar2);
        }
        long j10 = pVar.f19383a;
        int c10 = a0Var.c(j10);
        Object[] objArr = a0Var.f20837c;
        Object obj = objArr[c10];
        a0Var.f20836b[c10] = j10;
        objArr[c10] = rVar2;
    }

    @Override // m0
    public final boolean a() {
        return this.e;
    }

    @Override // m0
    public final p b() {
        if (this.e) {
            return j();
        }
        return h();
    }

    @Override // m0
    public final r c() {
        return this.f19357f;
    }

    @Override // m0
    public final p d() {
        if (i() == i.f19302u) {
            return h();
        }
        return j();
    }

    @Override // m0
    public final a0 e(r rVar) {
        q qVar;
        p h3;
        q qVar2 = rVar.f19399a;
        boolean z3 = rVar.f19401c;
        long j10 = qVar2.f19394c;
        int i = qVar2.f19393b;
        q qVar3 = rVar.f19400b;
        long j11 = qVar3.f19394c;
        int i10 = qVar3.f19393b;
        if (j10 == j11) {
            if ((!z3 || i < i10) && (z3 || i > i10)) {
                a.c("unexpectedly miss-crossed selection: " + rVar);
            }
            long j12 = qVar2.f19394c;
            a0 a0Var = o.f20920a;
            a0 a0Var2 = new a0();
            a0Var2.h(j12, rVar);
            return a0Var2;
        }
        a0 a0Var3 = o.f20920a;
        a0 a0Var4 = new a0();
        if (z3) {
            qVar = qVar3;
        } else {
            qVar = qVar2;
        }
        n(a0Var4, rVar, d(), qVar.f19393b, d().f19387f.f20524a.f20514a.f20477v.length());
        k(new z1.e1(this, a0Var4, rVar));
        if (!z3) {
            qVar2 = qVar3;
        }
        if (i() == i.f19302u) {
            h3 = j();
        } else {
            h3 = h();
        }
        n(a0Var4, rVar, h3, 0, qVar2.f19393b);
        return a0Var4;
    }

    @Override // m0
    public final boolean f(m0 m0Var) {
        if (this.f19357f != null && m0Var != null && (m0Var instanceof m) && this.e == m0Var.a() && this.f19355c == m0Var.l() && this.f19356d == m0Var.g()) {
            List list = ((m) m0Var).f19354b;
            List list2 = this.f19354b;
            if (list2.size() == list.size()) {
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    p pVar = (p) list2.get(i);
                    p pVar2 = (p) list.get(i);
                    if (pVar.f19383a != pVar2.f19383a || pVar.f19385c != pVar2.f19385c || pVar.f19386d != pVar2.f19386d) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // m0
    public final int g() {
        return this.f19356d;
    }

    @Override // m0
    public final p h() {
        return (p) this.f19354b.get(p(this.f19356d, false));
    }

    @Override // m0
    public final i i() {
        int i = this.f19355c;
        int i10 = this.f19356d;
        if (i < i10) {
            return i.f19303v;
        }
        if (i > i10) {
            return i.f19302u;
        }
        return ((p) this.f19354b.get(i / 2)).b();
    }

    @Override // m0
    public final p j() {
        return (p) this.f19354b.get(p(this.f19355c, true));
    }

    @Override // m0
    public final void k(df.l lVar) {
        p h3;
        int o10 = o(d().f19383a);
        if (i() == i.f19302u) {
            h3 = j();
        } else {
            h3 = h();
        }
        int o11 = o(h3.f19383a);
        int i = o10 + 1;
        if (i < o11) {
            while (i < o11) {
                lVar.invoke(this.f19354b.get(i));
                i++;
            }
        }
    }

    @Override // m0
    public final int l() {
        return this.f19355c;
    }

    @Override // m0
    public final int m() {
        return this.f19354b.size();
    }

    public final int o(long j10) {
        try {
            return this.f19353a.c(j10);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(g3.a.h(j10, "Invalid selectableId: "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i, boolean z3) {
        int ordinal = i().ordinal();
        int i10 = z3;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    l4.a.o();
                    return 0;
                }
                i10 = 1;
            }
            return (i - (i10 ^ 1)) / 2;
        }
        if (z3 != 0) {
            i10 = 0;
            return (i - (i10 ^ 1)) / 2;
        }
        i10 = 1;
        return (i - (i10 ^ 1)) / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb2.append(this.e);
        sb2.append(", startPosition=");
        boolean z3 = true;
        float f10 = 2;
        sb2.append((this.f19355c + 1) / f10);
        sb2.append(", endPosition=");
        sb2.append((this.f19356d + 1) / f10);
        sb2.append(", crossed=");
        sb2.append(i());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder("[\n\t");
        List list = this.f19354b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            p pVar = (p) list.get(i);
            if (z3) {
                z3 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i++;
            sb4.append(i);
            sb4.append(" -> ");
            sb4.append(pVar);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        sb2.append(sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
