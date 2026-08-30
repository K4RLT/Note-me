package q3;
import q0.c;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import com.google.android.gms.internal.ads.zb1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final zb1 f23439a;

    /* renamed from: b, reason: collision with root package name */
    public List f23440b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f23441c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f23442d;

    public x(zb1 zb1Var) {
        super(zb1Var.f13134u);
        this.f23442d = new HashMap();
        this.f23439a = zb1Var;
    }

    public final a0 a(WindowInsetsAnimation windowInsetsAnimation) {
        a0 a0Var = (a0) this.f23442d.get(windowInsetsAnimation);
        if (a0Var == null) {
            a0Var = new a0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                a0Var.f23378a = new y(windowInsetsAnimation);
            }
            this.f23442d.put(windowInsetsAnimation, a0Var);
        }
        return a0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f23439a.a(a(windowInsetsAnimation));
        this.f23442d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f23439a.b();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f23441c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f23441c = arrayList2;
            this.f23440b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation i = w.i(list.get(size));
            a0 a10 = a(i);
            fraction = i.getFraction();
            a10.f23378a.e(fraction);
            this.f23441c.add(a10);
        }
        return this.f23439a.d(c(windowInsets, null), this.f23440b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        j6.l e = this.f23439a.e(a(windowInsetsAnimation), new j6.l(bounds));
        e.getClass();
        w.k();
        return w.g(((j3.c) e.f18933v).d(), ((j3.c) e.f18934w).d());
    }
}
