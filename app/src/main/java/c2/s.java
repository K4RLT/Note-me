package c2;
import a.a;
import c.b;
import x.o;
import i1.d;
import i1.f;
import i1.j;
import j1.c;
import k1.l0;
import q.x;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3635u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x f3636v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(x xVar, int i) {
        super(1);
        this.f3635u = i;
        this.f3636v = xVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        d dVar;
        int i;
        boolean z3;
        boolean z9;
        Rect rect;
        Looper looper;
        switch (this.f3635u) {
            case 0:
                KeyEvent keyEvent = ((b) obj).f25635a;
                long a10 = c.a(keyEvent);
                boolean z10 = true;
                if (a.a(a10, a.f25622b)) {
                    dVar = new d(2);
                } else if (a.a(a10, a.f25623c)) {
                    dVar = new d(1);
                } else if (a.a(a10, a.i)) {
                    if (keyEvent.isShiftPressed()) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    dVar = new d(i);
                } else if (a.a(a10, a.f25626g)) {
                    dVar = new d(4);
                } else if (a.a(a10, a.f25625f)) {
                    dVar = new d(3);
                } else if (!a.a(a10, a.f25624d) && !a.a(a10, a.f25631m)) {
                    if (!a.a(a10, a.e) && !a.a(a10, a.f25632n)) {
                        if (!a.a(a10, a.f25627h) && !a.a(a10, a.f25629k) && !a.a(a10, a.f25633o)) {
                            if (!a.a(a10, a.f25621a) && !a.a(a10, a.f25630l)) {
                                dVar = null;
                            } else {
                                dVar = new d(8);
                            }
                        } else {
                            dVar = new d(7);
                        }
                    } else {
                        dVar = new d(6);
                    }
                } else {
                    dVar = new d(5);
                }
                if (dVar != null) {
                    int i10 = dVar.f18099a;
                    if (c.b(keyEvent) == 2) {
                        Integer C = f.C(i10);
                        x xVar = this.f3636v;
                        c embeddedViewFocusRect = xVar.getEmbeddedViewFocusRect();
                        Boolean f10 = ((j) xVar.getFocusOwner()).f(i10, embeddedViewFocusRect, new r(dVar, 1));
                        if (f10 != null) {
                            z3 = f10.booleanValue();
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            return Boolean.TRUE;
                        }
                        if (i10 == 1 || i10 == 2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (!z9) {
                            return Boolean.FALSE;
                        }
                        if (C != null) {
                            int intValue = C.intValue();
                            Object obj2 = v1.f3667f.get();
                            obj2.getClass();
                            v1 v1Var = (v1) obj2;
                            View view = xVar;
                            while (true) {
                                if (view != null) {
                                    View rootView = xVar.getRootView();
                                    rootView.getClass();
                                    view = v1Var.b(intValue, view, (ViewGroup) rootView);
                                    if (view != null) {
                                        if (!view.equals(xVar)) {
                                            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == xVar) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    view = null;
                                }
                            }
                            if (kotlin.jvm.internal.l.a(view, xVar)) {
                                view = null;
                            }
                            if (view != null) {
                                if (embeddedViewFocusRect != null) {
                                    rect = l0.B(embeddedViewFocusRect);
                                } else {
                                    rect = null;
                                }
                                if (rect != null) {
                                    View rootView2 = xVar.getRootView();
                                    rootView2.getClass();
                                    ViewGroup viewGroup = (ViewGroup) rootView2;
                                    viewGroup.offsetDescendantRectToMyCoords(xVar, rect);
                                    viewGroup.offsetRectIntoDescendantCoords(view, rect);
                                    if (f.y(view, C, rect)) {
                                        return Boolean.TRUE;
                                    }
                                } else {
                                    x.o("Invalid rect");
                                    return null;
                                }
                            }
                        }
                        if (!((j) xVar.getFocusOwner()).c(i10, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean f11 = ((j) xVar.getFocusOwner()).f(i10, null, new r(dVar, 0));
                        if (f11 != null) {
                            z10 = f11.booleanValue();
                        }
                        return Boolean.valueOf(z10);
                    }
                }
                return Boolean.FALSE;
            case 1:
                df.a aVar = (df.a) obj;
                x xVar2 = this.f3636v;
                Handler handler = xVar2.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = xVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new a(2, aVar));
                    }
                }
                return pe.z.f22715a;
            default:
                x xVar3 = this.f3636v;
                return new u0(xVar3, xVar3.getTextInputService(), (pf.z) obj);
        }
    }
}
