package x6;
import d.a;
import d.b;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import c7.x;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import java.util.ArrayList;
import java.util.List;
import n.q;

/* loaded from: classes.dex */
public final class c extends b {
    public final r6.f B;
    public final ArrayList C;
    public final RectF D;
    public final RectF E;
    public final RectF F;
    public final a7.j G;
    public final x H;
    public float I;
    public boolean J;
    public final r6.g K;

    public c(o6.j jVar, e eVar, List list, o6.a aVar) {
        super(jVar, eVar);
        b bVar;
        b cVar;
        String str;
        this.C = new ArrayList();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new a7.j();
        this.H = new x(1, (byte) 0);
        this.J = true;
        v6.b bVar2 = eVar.f30131s;
        if (bVar2 != null) {
            r6.f b10 = bVar2.b();
            this.B = b10;
            e(b10);
            b10.a(this);
        } else {
            this.B = null;
        }
        q qVar = new q(aVar.f21791j.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size >= 0) {
                e eVar2 = (e) list.get(size);
                int b11 = q0.b(eVar2.e);
                if (b11 != 0) {
                    if (b11 != 1) {
                        if (b11 != 2) {
                            if (b11 != 3) {
                                if (b11 != 4) {
                                    if (b11 != 5) {
                                        switch (eVar2.e) {
                                            case 1:
                                                str = "PRE_COMP";
                                                break;
                                            case 2:
                                                str = "SOLID";
                                                break;
                                            case 3:
                                                str = "IMAGE";
                                                break;
                                            case 4:
                                                str = "NULL";
                                                break;
                                            case 5:
                                                str = "SHAPE";
                                                break;
                                            case 6:
                                                str = "TEXT";
                                                break;
                                            case 7:
                                                str = "UNKNOWN";
                                                break;
                                            default:
                                                str = "null";
                                                break;
                                        }
                                        a7.a("Unknown layer type ".concat(str));
                                        cVar = null;
                                    } else {
                                        cVar = new j(jVar, eVar2);
                                    }
                                } else {
                                    cVar = new g(jVar, eVar2, this, aVar);
                                }
                            } else {
                                cVar = new b(jVar, eVar2);
                            }
                        } else {
                            cVar = new d(jVar, eVar2);
                        }
                    } else {
                        cVar = new h(jVar, eVar2);
                    }
                } else {
                    cVar = new c(jVar, eVar2, (List) aVar.f21786c.get(eVar2.f30120g), aVar);
                }
                if (cVar != null) {
                    qVar.d(cVar.f30104p.f30118d, cVar);
                    if (bVar3 != null) {
                        bVar3.f30107s = cVar;
                        bVar3 = null;
                    } else {
                        this.C.add(0, cVar);
                        int b12 = q0.b(eVar2.f30133u);
                        if (b12 == 1 || b12 == 2) {
                            bVar3 = cVar;
                        }
                    }
                }
                size--;
            } else {
                for (int i = 0; i < qVar.f(); i++) {
                    b bVar4 = (b) qVar.b(qVar.c(i));
                    if (bVar4 != null && (bVar = (b) qVar.b(bVar4.f30104p.f30119f)) != null) {
                        bVar4.f30108t = bVar;
                    }
                }
                u0 u0Var = this.f30104p.f30136x;
                if (u0Var != null) {
                    this.K = new r6.g(this, this, u0Var);
                    return;
                }
                return;
            }
        }
    }

    @Override // x6.b, q6.e
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.D;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).d(rectF2, this.f30102n, true);
            rectF.union(rectF2);
        }
    }

    @Override // x6.b
    public final void i(Canvas canvas, Matrix matrix, int i, a7.b bVar) {
        boolean z3;
        boolean z9;
        int i10;
        Canvas canvas2;
        r6.g gVar = this.K;
        int i11 = 0;
        if (bVar == null && gVar == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        o6.j jVar = this.f30103o;
        jVar.getClass();
        if (z3 && jVar.E) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i10 = 255;
        } else {
            i10 = i;
        }
        if (gVar != null) {
            bVar = gVar.b(matrix, i10);
        }
        boolean z10 = this.J;
        e eVar = this.f30104p;
        ArrayList arrayList = this.C;
        RectF rectF = this.E;
        if (!z10 && "__container".equals(eVar.f30117c)) {
            rectF.setEmpty();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                RectF rectF2 = this.F;
                ((b) obj).d(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        } else {
            rectF.set(0.0f, 0.0f, eVar.f30127o, eVar.f30128p);
            matrix.mapRect(rectF);
        }
        a7.j jVar2 = this.G;
        if (z9) {
            x xVar = this.H;
            xVar.f4003w = null;
            xVar.f4002v = i;
            if (bVar != null) {
                if (Color.alpha(bVar.f302d) > 0) {
                    xVar.f4003w = bVar;
                } else {
                    xVar.f4003w = null;
                }
                bVar = null;
            }
            canvas2 = jVar2.e(canvas, rectF, xVar);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((b) arrayList.get(size2)).c(canvas2, matrix, i10, bVar);
            }
        }
        if (z9) {
            jVar2.c();
        }
        canvas.restore();
    }

    @Override // x6.b
    public final void m(float f10) {
        this.I = f10;
        super.m(f10);
        e eVar = this.f30104p;
        r6.f fVar = this.B;
        if (fVar != null) {
            o6.a aVar = this.f30103o.f21819u;
            f10 = ((((Float) fVar.d()).floatValue() * eVar.f30116b.f21795n) - eVar.f30116b.f21793l) / ((aVar.f21794m - aVar.f21793l) + 0.01f);
        }
        if (fVar == null) {
            float f11 = eVar.f30126n;
            o6.a aVar2 = eVar.f30116b;
            f10 -= f11 / (aVar2.f21794m - aVar2.f21793l);
        }
        if (eVar.f30125m != 0.0f && !"__container".equals(eVar.f30117c)) {
            f10 /= eVar.f30125m;
        }
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).m(f10);
        }
    }
}
