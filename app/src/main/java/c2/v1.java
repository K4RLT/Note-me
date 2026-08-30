package c2;
import x.n;
import g3.a;
import i1.d;
import i1.f;
import j1.c;
import k1.l0;
import n0.b;
import q.x;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: f, reason: collision with root package name */
    public static final a7.k f3667f = new a7.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3668a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3669b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f3670c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final u1 f3671d = new u1(new androidx.datastore.preferences.protobuf.s1(this));
    public final ArrayList e = new ArrayList();

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int indexOf;
        int lastIndexOf;
        int i10;
        Rect rect2 = this.f3668a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i != 17 && i != 33) {
                    if (i == 66 || i == 130) {
                        int scrollY = viewGroup.getScrollY();
                        int scrollX = viewGroup.getScrollX();
                        rect2.set(scrollX, scrollY, scrollX, scrollY);
                    }
                } else {
                    d(viewGroup, rect2);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                x.n(a.g(i, "Unknown direction: "));
                return null;
            }
            return c(i, rect2, view, viewGroup, arrayList);
        }
        u1 u1Var = this.f3671d;
        try {
            u1Var.a(arrayList, viewGroup);
            Collections.sort(arrayList, u1Var);
            u1Var.f3658w.a();
            u1Var.f3657v.b();
            u1Var.f3659x.a();
            u1Var.f3656u.a();
            int size = arrayList.size();
            View view2 = null;
            if (size < 2) {
                return null;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 17 || i == 33 || i == 66 || i == 130) {
                        view2 = c(i, this.f3668a, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    view2 = (view == null || (lastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i10 = lastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i10);
                }
            } else if (size >= 2) {
                view2 = (view == null || (indexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(indexOf - 1);
            }
            if (view2 == null) {
                return (View) arrayList.get(size - 1);
            }
            return view2;
        } catch (Throwable th) {
            u1Var.f3658w.a();
            u1Var.f3657v.b();
            u1Var.f3659x.a();
            u1Var.f3656u.a();
            throw th;
        }
    }

    public final View b(int i, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View view2 = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == viewGroup) {
                    if (viewGroup3 != null) {
                        viewGroup2 = viewGroup3;
                    }
                } else {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                }
            }
        }
        viewGroup2 = viewGroup;
        View b10 = b(view, viewGroup2, i);
        boolean z3 = true;
        View view3 = b10;
        while (b10 != null) {
            if (b10.isFocusable() && b10.getVisibility() == 0 && (!b10.isInTouchMode() || b10.isFocusableInTouchMode())) {
                view2 = b10;
                break;
            }
            b10 = b(b10, viewGroup2, i);
            boolean z9 = !z3;
            if (!z3) {
                if (view3 != null) {
                    view3 = b(view3, viewGroup2, i);
                } else {
                    view3 = null;
                }
                if (view3 == b10) {
                    break;
                }
            }
            z3 = z9;
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> arrayList = this.e;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                d(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                view2 = a(i, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final View c(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int i10;
        Rect rect2 = this.f3669b;
        rect2.set(rect);
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect2.offset(0, (-rect.height()) - 1);
                    }
                } else {
                    rect2.offset((-rect.width()) - 1, 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = (View) arrayList.get(i11);
            if (!kotlin.jvm.internal.l.a(view3, view) && !kotlin.jvm.internal.l.a(view3, viewGroup)) {
                Rect rect3 = this.f3670c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                c H = l0.H(rect3);
                c H2 = l0.H(rect2);
                c H3 = l0.H(rect);
                d D = f.D(i);
                if (D != null) {
                    i10 = D.f18099a;
                } else {
                    i10 = 1;
                }
                if (f.o(H, H2, H3, i10)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
