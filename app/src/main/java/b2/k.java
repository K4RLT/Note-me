package b2;
import d1.q;
import l.a;
import l1.a;
import l1.e;
import l1.f;
import n.c0;
import q.x;
import y1.a;

/* loaded from: classes.dex */
public abstract class k extends q {
    public final int I = e(this);
    public q J;

    @Override // q
    public final void O0() {
        super.O0();
        for (q qVar = this.J; qVar != null; qVar = qVar.f15693z) {
            qVar.X0(this.B);
            if (!qVar.H) {
                qVar.O0();
            }
        }
    }

    @Override // q
    public final void P0() {
        for (q qVar = this.J; qVar != null; qVar = qVar.f15693z) {
            qVar.P0();
        }
        super.P0();
    }

    @Override // q
    public final void T0() {
        super.T0();
        for (q qVar = this.J; qVar != null; qVar = qVar.f15693z) {
            qVar.T0();
        }
    }

    @Override // q
    public final void U0() {
        for (q qVar = this.J; qVar != null; qVar = qVar.f15693z) {
            qVar.U0();
        }
        super.U0();
    }

    @Override // q
    public final void V0() {
        super.V0();
        for (q qVar = this.J; qVar != null; qVar = qVar.f15693z) {
            qVar.V0();
        }
    }

    @Override // q
    public final void W0(q qVar) {
        this.f15688u = qVar;
        for (q qVar2 = this.J; qVar2 != null; qVar2 = qVar2.f15693z) {
            qVar2.W0(qVar);
        }
    }

    @Override // q
    public final void X0(k1 k1Var) {
        this.B = k1Var;
        for (q qVar = this.J; qVar != null; qVar = qVar.f15693z) {
            qVar.X0(k1Var);
        }
    }

    public final j Y0(j jVar) {
        q qVar;
        q qVar2 = ((q) jVar).f15688u;
        q qVar3 = null;
        if (qVar2 != jVar) {
            if (jVar instanceof q) {
                qVar = (q) jVar;
            } else {
                qVar = null;
            }
            if (qVar != null) {
                qVar3 = qVar.f15692y;
            }
            if (qVar2 != this.f15688u || !kotlin.jvm.internal.a(qVar3, this)) {
                x.o("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (qVar2.H) {
                a.b("Cannot delegate to an already attached node");
            }
            qVar2.W0(this.f15688u);
            int i = this.f15690w;
            int f10 = f(qVar2);
            qVar2.f15690w = f10;
            int i10 = this.f15690w;
            int i11 = f10 & 2;
            if (i11 != 0 && (i10 & 2) != 0 && !(this instanceof x)) {
                a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + qVar2);
            }
            qVar2.f15693z = this.J;
            this.J = qVar2;
            qVar2.f15692y = this;
            a1(f10 | this.f15690w, false);
            if (this.H) {
                if (i11 != 0 && (i & 2) == 0) {
                    f1 f1Var = l.u(this).Z;
                    this.f15688u.X0(null);
                    f1Var.s();
                } else {
                    X0(this.B);
                }
                qVar2.O0();
                qVar2.U0();
                if (!qVar2.H) {
                    a.b("autoInvalidateInsertedNode called on unattached node");
                }
                a(qVar2, -1, 1);
            }
        }
        return jVar;
    }

    public final void Z0(j jVar) {
        q qVar = null;
        for (q qVar2 = this.J; qVar2 != null; qVar2 = qVar2.f15693z) {
            if (qVar2 == jVar) {
                boolean z3 = qVar2.H;
                if (z3) {
                    c0 c0Var = l1.f1535a;
                    if (!z3) {
                        a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    a(qVar2, -1, 2);
                    qVar2.V0();
                    qVar2.P0();
                }
                qVar2.W0(qVar2);
                qVar2.f15691x = 0;
                q qVar3 = qVar2.f15693z;
                if (qVar == null) {
                    this.J = qVar3;
                } else {
                    qVar.f15693z = qVar3;
                }
                qVar2.f15693z = null;
                qVar2.f15692y = null;
                int i = this.f15690w;
                int f10 = f(this);
                a1(f10, true);
                if (this.H && (i & 2) != 0 && (f10 & 2) == 0) {
                    f1 f1Var = l.u(this).Z;
                    this.f15688u.X0(null);
                    f1Var.s();
                    return;
                }
                return;
            }
            qVar = qVar2;
        }
        l4.a.n(jVar, "Could not find delegate: ");
    }

    public final void a1(int i, boolean z3) {
        int i10;
        q qVar;
        int i11 = this.f15690w;
        this.f15690w = i;
        if (i11 != i) {
            q qVar2 = this.f15688u;
            if (qVar2 == this) {
                this.f15691x = i;
            }
            if (this.H) {
                q qVar3 = this;
                while (qVar3 != null) {
                    i |= qVar3.f15690w;
                    qVar3.f15690w = i;
                    if (qVar3 == qVar2) {
                        break;
                    } else {
                        qVar3 = qVar3.f15692y;
                    }
                }
                if (z3 && qVar3 == qVar2) {
                    i = f(qVar2);
                    qVar2.f15690w = i;
                }
                if (qVar3 != null && (qVar = qVar3.f15693z) != null) {
                    i10 = qVar.f15691x;
                } else {
                    i10 = 0;
                }
                int i12 = i | i10;
                while (qVar3 != null) {
                    i12 |= qVar3.f15690w;
                    qVar3.f15691x = i12;
                    qVar3 = qVar3.f15692y;
                }
            }
        }
    }
}
