package b3;
import f.g;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import b2.i0;
import q.x;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final de.b f1676a = new de.b(6);

    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(i1.i iVar, View view, View view2) {
        j1.c cVar;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        i1.s g8 = i1.g(((i1.j) iVar).f18108c);
        if (g8 != null) {
            cVar = i1.f.j(g8);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return null;
        }
        int i = (int) cVar.f18763a;
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = (int) cVar.f18764b;
        int i13 = iArr[1];
        int i14 = iArr2[1];
        return new Rect((i + i10) - i11, (i12 + i13) - i14, (((int) cVar.f18765c) + i10) - i11, (((int) cVar.f18766d) + i13) - i14);
    }

    public static final View c(d1.q qVar) {
        View view;
        s sVar = b2.l.u(qVar.f15688u).I;
        if (sVar != null) {
            view = sVar.getInteropView();
        } else {
            view = null;
        }
        if (view != null) {
            return view;
        }
        x.o("Could not fetch interop view");
        return null;
    }

    public static final void d(s sVar, i0 i0Var) {
        long W = ((b2.s) i0Var.Z.f1458x).W(0L);
        int round = Math.round(Float.intBitsToFloat((int) (W >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (W & 4294967295L)));
        sVar.layout(round, round2, sVar.getMeasuredWidth() + round, sVar.getMeasuredHeight() + round2);
    }
}
