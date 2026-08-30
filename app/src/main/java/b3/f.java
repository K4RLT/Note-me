package b3;

import android.view.View;
import android.view.ViewGroup;
import b2.i0;
import java.util.List;
import z1.p0;
import z1.q0;
import z1.r0;
import z1.t;

/* loaded from: classes.dex */
public final class f implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f1653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f1654b;

    public f(s sVar, i0 i0Var) {
        this.f1653a = sVar;
        this.f1654b = i0Var;
    }

    @Override // z1.p0
    public final int a(t tVar, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        s sVar = this.f1653a;
        ViewGroup.LayoutParams layoutParams = sVar.getLayoutParams();
        layoutParams.getClass();
        sVar.measure(makeMeasureSpec, k.e(sVar, 0, i, layoutParams.height));
        return sVar.getMeasuredWidth();
    }

    @Override // z1.p0
    public final int d(t tVar, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        s sVar = this.f1653a;
        ViewGroup.LayoutParams layoutParams = sVar.getLayoutParams();
        layoutParams.getClass();
        sVar.measure(makeMeasureSpec, k.e(sVar, 0, i, layoutParams.height));
        return sVar.getMeasuredWidth();
    }

    @Override // z1.p0
    public final int f(t tVar, List list, int i) {
        s sVar = this.f1653a;
        ViewGroup.LayoutParams layoutParams = sVar.getLayoutParams();
        layoutParams.getClass();
        sVar.measure(k.e(sVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return sVar.getMeasuredHeight();
    }

    @Override // z1.p0
    public final q0 g(r0 r0Var, List list, long j10) {
        s sVar = this.f1653a;
        int childCount = sVar.getChildCount();
        qe.t tVar = qe.t.f24024u;
        if (childCount == 0) {
            return r0Var.u0(y2.a.j(j10), y2.a.i(j10), tVar, c.f1644w);
        }
        if (y2.a.j(j10) != 0) {
            sVar.getChildAt(0).setMinimumWidth(y2.a.j(j10));
        }
        if (y2.a.i(j10) != 0) {
            sVar.getChildAt(0).setMinimumHeight(y2.a.i(j10));
        }
        int j11 = y2.a.j(j10);
        int h3 = y2.a.h(j10);
        ViewGroup.LayoutParams layoutParams = sVar.getLayoutParams();
        layoutParams.getClass();
        int e = k.e(sVar, j11, h3, layoutParams.width);
        int i = y2.a.i(j10);
        int g8 = y2.a.g(j10);
        ViewGroup.LayoutParams layoutParams2 = sVar.getLayoutParams();
        layoutParams2.getClass();
        sVar.measure(e, k.e(sVar, i, g8, layoutParams2.height));
        return r0Var.u0(sVar.getMeasuredWidth(), sVar.getMeasuredHeight(), tVar, new d(sVar, this.f1654b, 1));
    }

    @Override // z1.p0
    public final int i(t tVar, List list, int i) {
        s sVar = this.f1653a;
        ViewGroup.LayoutParams layoutParams = sVar.getLayoutParams();
        layoutParams.getClass();
        sVar.measure(k.e(sVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return sVar.getMeasuredHeight();
    }
}
