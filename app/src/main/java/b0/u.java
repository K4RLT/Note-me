package b0;
import x.o;
import b1.b0;
import c.c;
import d.a;
import d.e;
import f.g;
import k0.j1;
import k0.t0;
import q.x;
import r0.a1;
import r0.i0;

import android.graphics.Bitmap;
import c2.g3;
import c2.s1;
import com.daren.scraply.R;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1263b;

    public /* synthetic */ u(int i, Object obj) {
        this.f1262a = i;
        this.f1263b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, pe.g] */
    @Override // i0
    public final void a() {
        int i = this.f1262a;
        pe.z zVar = null;
        Object obj = this.f1263b;
        switch (i) {
            case 0:
                ((v) obj).f1270d = null;
                return;
            case 1:
                ((n0) obj).f1236c = null;
                return;
            case 2:
                ((j0) obj).f1220f = true;
                return;
            case 3:
                ((s1) obj).f3639v.invoke();
                return;
            case 4:
                c3.v vVar = (c3.v) obj;
                vVar.dismiss();
                c3.t tVar = vVar.A;
                g3 g3Var = tVar.f3454w;
                if (g3Var != null) {
                    g3Var.a();
                }
                tVar.f3454w = null;
                tVar.requestLayout();
                return;
            case 5:
                c3.x xVar = (c3.x) obj;
                g3 g3Var2 = xVar.f3454w;
                if (g3Var2 != null) {
                    g3Var2.a();
                }
                xVar.f3454w = null;
                xVar.requestLayout();
                xVar.setTag(R.id.view_tree_lifecycle_owner, null);
                xVar.H.removeViewImmediate(xVar);
                return;
            case 6:
                g gVar = ((a) obj).f15632a;
                if (gVar != null) {
                    gVar.f16616b.d(gVar.f16617c);
                    zVar = pe.z.f22715a;
                }
                if (zVar == null) {
                    x.o("Launcher has not been initialized");
                    return;
                }
                return;
            case 7:
                Iterator it = ((e) obj).f3275b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).cancel();
                }
                return;
            case 8:
                ((j1) obj).l();
                return;
            case 9:
                h8.f fVar = (h8.f) obj;
                fVar.getClass();
                fVar.f17930j.j(null);
                return;
            case 10:
                t0 t0Var = (t0) obj;
                t0Var.i();
                t0Var.i.setValue(Boolean.FALSE);
                return;
            case 11:
                j1 j1Var = (j1) obj;
                j1Var.getClass();
                ((b0) j1.E.getValue()).b(j1Var);
                j1Var.f22190w = true;
                return;
            default:
                a1 a1Var = (a1) obj;
                Bitmap bitmap = (Bitmap) a1Var.getValue();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                a1Var.setValue(null);
                return;
        }
    }
}
