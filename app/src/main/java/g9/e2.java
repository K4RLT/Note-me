package g9;
import b3.a;
import q1.f;
import r.e;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.ei;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.sf0;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.um;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17614a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17615b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17616c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17617d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17618f;

    /* renamed from: g, reason: collision with root package name */
    public Object f17619g;

    /* renamed from: h, reason: collision with root package name */
    public Object f17620h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f17621j;

    /* renamed from: k, reason: collision with root package name */
    public Object f17622k;

    /* renamed from: l, reason: collision with root package name */
    public Object f17623l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f17624m;

    /* renamed from: n, reason: collision with root package name */
    public Object f17625n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f17626o;

    public e2(v6.d dVar) {
        r6.e b10;
        r6.e b11;
        r6.e b12;
        r6.f b13;
        r6.f b14;
        r6.f b15;
        this.f17615b = new Matrix();
        f fVar = dVar.f27387a;
        if (fVar == null) {
            b10 = null;
        } else {
            b10 = fVar.b();
        }
        this.f17619g = (r6.i) b10;
        v6.e eVar = dVar.f27388b;
        if (eVar == null) {
            b11 = null;
        } else {
            b11 = eVar.b();
        }
        this.f17620h = b11;
        v6.a aVar = dVar.f27389c;
        if (aVar == null) {
            b12 = null;
        } else {
            b12 = aVar.b();
        }
        this.i = (r6.h) b12;
        v6.b bVar = dVar.f27390d;
        if (bVar == null) {
            b13 = null;
        } else {
            b13 = bVar.b();
        }
        this.f17621j = b13;
        v6.b bVar2 = dVar.f27391f;
        if (bVar2 == null) {
            b14 = null;
        } else {
            b14 = bVar2.b();
        }
        this.f17623l = b14;
        this.f17614a = dVar.f27394j;
        if (b14 != null) {
            this.f17616c = new Matrix();
            this.f17617d = new Matrix();
            this.e = new Matrix();
            this.f17618f = new float[9];
        } else {
            this.f17616c = null;
            this.f17617d = null;
            this.e = null;
            this.f17618f = null;
        }
        v6.b bVar3 = dVar.f27392g;
        if (bVar3 == null) {
            b15 = null;
        } else {
            b15 = bVar3.b();
        }
        this.f17624m = b15;
        v6.a aVar2 = dVar.e;
        if (aVar2 != null) {
            this.f17622k = (r6.f) aVar2.b();
        }
        v6.b bVar4 = dVar.f27393h;
        if (bVar4 != null) {
            this.f17625n = bVar4.b();
        } else {
            this.f17625n = null;
        }
        v6.b bVar5 = dVar.i;
        if (bVar5 != null) {
            this.f17626o = bVar5.b();
        } else {
            this.f17626o = null;
        }
    }

    public static c3 f(Context context, z8.h[] hVarArr) {
        for (z8.h hVar : hVarArr) {
            if (hVar.equals(z8.h.f31985j)) {
                return new c3("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
            }
        }
        c3 c3Var = new c3(context, hVarArr);
        c3Var.D = false;
        return c3Var;
    }

    public void a(x6.b bVar) {
        bVar.e((r6.f) this.f17622k);
        bVar.e((r6.f) this.f17625n);
        bVar.e((r6.f) this.f17626o);
        bVar.e((r6.i) this.f17619g);
        bVar.e((r6.e) this.f17620h);
        bVar.e((r6.h) this.i);
        bVar.e((r6.f) this.f17621j);
        bVar.e((r6.f) this.f17623l);
        bVar.e((r6.f) this.f17624m);
    }

    public void b(r6.a aVar) {
        r6.f fVar = (r6.f) this.f17622k;
        if (fVar != null) {
            fVar.a(aVar);
        }
        r6.f fVar2 = (r6.f) this.f17625n;
        if (fVar2 != null) {
            fVar2.a(aVar);
        }
        r6.f fVar3 = (r6.f) this.f17626o;
        if (fVar3 != null) {
            fVar3.a(aVar);
        }
        r6.i iVar = (r6.i) this.f17619g;
        if (iVar != null) {
            iVar.a(aVar);
        }
        r6.e eVar = (r6.e) this.f17620h;
        if (eVar != null) {
            eVar.a(aVar);
        }
        r6.h hVar = (r6.h) this.i;
        if (hVar != null) {
            hVar.a(aVar);
        }
        r6.f fVar4 = (r6.f) this.f17621j;
        if (fVar4 != null) {
            fVar4.a(aVar);
        }
        r6.f fVar5 = (r6.f) this.f17623l;
        if (fVar5 != null) {
            fVar5.a(aVar);
        }
        r6.f fVar6 = (r6.f) this.f17624m;
        if (fVar6 != null) {
            fVar6.a(aVar);
        }
    }

    public void c() {
        for (int i = 0; i < 9; i++) {
            ((float[]) this.f17618f)[i] = 0.0f;
        }
    }

    public Matrix d() {
        PointF pointF;
        b7.b bVar;
        float cos;
        float sin;
        PointF pointF2;
        Matrix matrix = (Matrix) this.f17616c;
        r6.f fVar = (r6.f) this.f17624m;
        Matrix matrix2 = (Matrix) this.e;
        Matrix matrix3 = (Matrix) this.f17617d;
        float[] fArr = (float[]) this.f17618f;
        Matrix matrix4 = (Matrix) this.f17615b;
        matrix4.reset();
        r6.e eVar = (r6.e) this.f17620h;
        if (eVar != null && (pointF2 = (PointF) eVar.d()) != null) {
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                matrix4.preTranslate(f10, pointF2.y);
            }
        }
        if (this.f17614a) {
            if (eVar != null) {
                float f11 = eVar.f24588d;
                PointF pointF3 = (PointF) eVar.d();
                float f12 = pointF3.x;
                float f13 = pointF3.y;
                eVar.g(1.0E-4f + f11);
                PointF pointF4 = (PointF) eVar.d();
                eVar.g(f11);
                matrix4.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f13, pointF4.x - f12)));
            }
        } else {
            r6.f fVar2 = (r6.f) this.f17621j;
            if (fVar2 != null) {
                float i = fVar2.i();
                if (i != 0.0f) {
                    matrix4.preRotate(i);
                }
            }
        }
        if (((r6.f) this.f17623l) != null) {
            if (fVar == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-fVar.i()) + 90.0f));
            }
            if (fVar == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-fVar.i()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r7.i()));
            c();
            fArr[0] = cos;
            fArr[1] = sin;
            float f14 = -sin;
            fArr[3] = f14;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            matrix.setValues(fArr);
            c();
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            matrix3.setValues(fArr);
            c();
            fArr[0] = cos;
            fArr[1] = f14;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            matrix2.setValues(fArr);
            matrix3.preConcat(matrix);
            matrix2.preConcat(matrix3);
            matrix4.preConcat(matrix2);
        }
        r6.h hVar = (r6.h) this.i;
        if (hVar != null && (bVar = (b7.b) hVar.d()) != null) {
            float f15 = bVar.f1807a;
            if (f15 != 1.0f || bVar.f1808b != 1.0f) {
                matrix4.preScale(f15, bVar.f1808b);
            }
        }
        r6.i iVar = (r6.i) this.f17619g;
        if (iVar != null && (pointF = (PointF) iVar.d()) != null) {
            float f16 = pointF.x;
            if (f16 != 0.0f || pointF.y != 0.0f) {
                matrix4.preTranslate(-f16, -pointF.y);
            }
        }
        return matrix4;
    }

    public Matrix e(float f10) {
        PointF pointF;
        b7.b bVar;
        float f11;
        Matrix matrix = (Matrix) this.f17615b;
        r6.e eVar = (r6.e) this.f17620h;
        PointF pointF2 = null;
        if (eVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) eVar.d();
        }
        r6.h hVar = (r6.h) this.i;
        if (hVar == null) {
            bVar = null;
        } else {
            bVar = (b7.b) hVar.d();
        }
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        if (bVar != null) {
            double d2 = f10;
            matrix.preScale((float) Math.pow(bVar.f1807a, d2), (float) Math.pow(bVar.f1808b, d2));
        }
        r6.f fVar = (r6.f) this.f17621j;
        if (fVar != null) {
            float floatValue = ((Float) fVar.d()).floatValue();
            r6.i iVar = (r6.i) this.f17619g;
            if (iVar != null) {
                pointF2 = (PointF) iVar.d();
            }
            float f12 = floatValue * f10;
            float f13 = 0.0f;
            if (pointF2 == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF2.x;
            }
            if (pointF2 != null) {
                f13 = pointF2.y;
            }
            matrix.preRotate(f12, f11, f13);
        }
        return matrix;
    }

    public void g(d2 d2Var) {
        z8.k kVar = (z8.k) this.f17624m;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            k0 k0Var = (k0) this.f17621j;
            if (k0Var == null) {
                if ((((z8.h[]) this.f17620h) != null && ((String) this.f17623l) != null) || k0Var != null) {
                    Context context = kVar.getContext();
                    k0 k0Var2 = (k0) new g(p.f17688g.f17690b, context, f(context, (z8.h[]) this.f17620h), (String) this.f17623l, (tr) this.f17615b).d(context, false);
                    this.f17621j = k0Var2;
                    k0Var2.G3(new x2((sf0) this.e));
                    a aVar = (a) this.f17618f;
                    if (aVar != null) {
                        ((k0) this.f17621j).p2(new q(aVar));
                    }
                    a9.d dVar = (a9.d) this.i;
                    if (dVar != null) {
                        ((k0) this.f17621j).O0(new ei(dVar));
                    }
                    z8.t tVar = (z8.t) this.f17622k;
                    if (tVar != null) {
                        ((k0) this.f17621j).d3(new w2(tVar));
                    }
                    ((k0) this.f17621j).F1(new s2((z8.n) this.f17625n));
                    ((k0) this.f17621j).G2(this.f17614a);
                    k0 k0Var3 = (k0) this.f17621j;
                    if (k0Var3 != null) {
                        try {
                            oa.a zza = k0Var3.zza();
                            if (zza != null) {
                                if (((Boolean) um.f11680f.p()).booleanValue()) {
                                    if (((Boolean) e.f17698c.a(sl.Cc)).booleanValue()) {
                                        l9.d.f20036b.post(new iv1(this, 15, zza));
                                    }
                                }
                                kVar.addView((View) oa.b.z1(zza));
                            }
                        } catch (RemoteException e) {
                            l9.i.i(e, "#007 Could not call remote method.");
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            d2Var.f17607m = currentTimeMillis;
            k0 k0Var4 = (k0) this.f17621j;
            if (k0Var4 != null) {
                AtomicLong atomicLong = (AtomicLong) this.f17626o;
                if (atomicLong.get() != 0) {
                    k0Var4.B0(atomicLong.get());
                }
                b3 b3Var = (b3) this.f17616c;
                Context context2 = kVar.getContext();
                b3Var.getClass();
                k0Var4.n1(a(context2, d2Var));
                return;
            }
            throw null;
        } catch (RemoteException e8) {
            l9.i.i(e8, "#007 Could not call remote method.");
        }
    }

    public void h(a aVar) {
        q qVar;
        try {
            this.f17618f = aVar;
            k0 k0Var = (k0) this.f17621j;
            if (k0Var != null) {
                if (aVar != null) {
                    qVar = new q(aVar);
                } else {
                    qVar = null;
                }
                k0Var.p2(qVar);
            }
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
    }

    public void i(z8.h... hVarArr) {
        z8.k kVar = (z8.k) this.f17624m;
        this.f17620h = hVarArr;
        try {
            k0 k0Var = (k0) this.f17621j;
            if (k0Var != null) {
                k0Var.q2(f(kVar.getContext(), (z8.h[]) this.f17620h));
            }
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
        kVar.requestLayout();
    }

    public void j(a9.d dVar) {
        ei eiVar;
        try {
            this.i = dVar;
            k0 k0Var = (k0) this.f17621j;
            if (k0Var != null) {
                if (dVar != null) {
                    eiVar = new ei(dVar);
                } else {
                    eiVar = null;
                }
                k0Var.O0(eiVar);
            }
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
    }

    public e2(z8.k kVar) {
        this.f17615b = new tr();
        this.f17617d = new z8.s();
        this.e = new sf0(this);
        this.f17626o = new AtomicLong();
        this.f17624m = kVar;
        this.f17616c = b3.f17575u;
        this.f17621j = null;
        new AtomicBoolean(false);
    }
}
