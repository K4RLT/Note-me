package b3;
import l.a;
import l.b;
import l.c;
import q.x;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import c2.x;
import pe.z;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1694u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f1695v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.f1694u = i;
        this.f1695v = qVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i;
        View findNextFocusFromRect;
        switch (this.f1694u) {
            case 0:
                i1.a aVar = (i1.a) obj;
                q qVar = this.f1695v;
                View c10 = c(qVar);
                if (!c10.isFocused() && !c10.hasFocus()) {
                    if (!i1.f.y(c10, i1.f.C(aVar.f18093a), b(((x) b2.l.v(qVar)).getFocusOwner(), b2.l.w(qVar), c10))) {
                        aVar.f18094b = true;
                    }
                }
                return z.f22715a;
            default:
                i1.a aVar2 = (i1.a) obj;
                q qVar2 = this.f1695v;
                View c11 = c(qVar2);
                if (c11.hasFocus()) {
                    i1.i focusOwner = ((x) b2.l.v(qVar2)).getFocusOwner();
                    View w10 = b2.l.w(qVar2);
                    if (!(c11 instanceof ViewGroup)) {
                        if (!w10.requestFocus()) {
                            x.o("host view did not take focus");
                            return null;
                        }
                    } else {
                        Rect b10 = b(focusOwner, w10, c11);
                        Integer C = i1.f.C(aVar2.f18093a);
                        if (C != null) {
                            i = C.intValue();
                        } else {
                            i = 130;
                        }
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = qVar2.I;
                        if (view != null) {
                            findNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) w10, view, i);
                        } else {
                            findNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) w10, b10, i);
                        }
                        if (findNextFocusFromRect != null && a(c11, findNextFocusFromRect)) {
                            findNextFocusFromRect.requestFocus(i, b10);
                            aVar2.f18094b = true;
                        } else if (!w10.requestFocus()) {
                            x.o("host view did not take focus");
                            return null;
                        }
                    }
                }
                return z.f22715a;
        }
    }
}
