package c2;
import n.c0;
import n.i0;
import n.j0;
import n.m0;
import n.p0;
import n.q0;
import n0.b;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class u1 implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final i0 f3656u;

    /* renamed from: v, reason: collision with root package name */
    public final j0 f3657v;

    /* renamed from: w, reason: collision with root package name */
    public final i0 f3658w;

    /* renamed from: x, reason: collision with root package name */
    public final c0 f3659x;

    /* renamed from: y, reason: collision with root package name */
    public View f3660y;

    public u1(androidx.datastore.preferences.protobuf.s1 s1Var) {
        long[] jArr = p0.f20923a;
        this.f3656u = new i0();
        int i = q0.f20928a;
        this.f3657v = new j0();
        this.f3658w = new i0();
        c0 c0Var = m0.f20916a;
        this.f3659x = new c0();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        c0 c0Var;
        View view;
        this.f3660y = viewGroup;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            c0Var = this.f3659x;
            if (i >= size) {
                break;
            }
            c0Var.h(i, (View) arrayList.get(i));
            i++;
        }
        int size2 = arrayList.size() - 1;
        j0 j0Var = this.f3657v;
        i0 i0Var = this.f3656u;
        if (size2 >= 0) {
            while (true) {
                int i10 = size2 - 1;
                View view2 = (View) arrayList.get(size2);
                int nextFocusForwardId = view2.getNextFocusForwardId();
                if (nextFocusForwardId != 0 && nextFocusForwardId != -1) {
                    view = b(view2, viewGroup, 2);
                } else {
                    view = null;
                }
                if (view != null && c0Var.d(view) >= 0) {
                    i0Var.m(view2, view);
                    j0Var.a(view);
                }
                if (i10 < 0) {
                    break;
                } else {
                    size2 = i10;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i11 = size3 - 1;
            View view3 = (View) arrayList.get(size3);
            if (((View) i0Var.g(view3)) != null && !j0Var.c(view3)) {
                View view4 = view3;
                while (view3 != null) {
                    i0 i0Var2 = this.f3658w;
                    View view5 = (View) i0Var2.g(view3);
                    if (view5 != null) {
                        if (view5 == view4) {
                            break;
                        }
                        view3 = view4;
                        view4 = view5;
                    }
                    i0Var2.m(view3, view4);
                    view3 = (View) i0Var.g(view3);
                }
            }
            if (i11 >= 0) {
                size3 = i11;
            } else {
                return;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view != view2) {
            if (view != null) {
                if (view2 != null) {
                    i0 i0Var = this.f3658w;
                    View view3 = (View) i0Var.g(view);
                    View view4 = (View) i0Var.g(view2);
                    if (view3 == view4 && view3 != null) {
                        if (view != view3) {
                            if (view2 != view3 && this.f3656u.g(view) != null) {
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    if (view3 != null) {
                        view = view3;
                    }
                    if (view4 != null) {
                        view2 = view4;
                    }
                    if (view3 == null && view4 == null) {
                        return 0;
                    }
                    c0 c0Var = this.f3659x;
                    if (c0Var.e(view) < c0Var.e(view2)) {
                        return -1;
                    }
                    return 1;
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }
}
