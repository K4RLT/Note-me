package x;
import p.a;
import b1.p;
import n.j0;
import q0.b;
import q0.d;

import android.view.View;
import com.daren.scraply.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f30011u = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a f30012a = b(4, "captionBar");

    /* renamed from: b, reason: collision with root package name */
    public final a f30013b;

    /* renamed from: c, reason: collision with root package name */
    public final a f30014c;

    /* renamed from: d, reason: collision with root package name */
    public final a f30015d;
    public final a e;

    /* renamed from: f, reason: collision with root package name */
    public final a f30016f;

    /* renamed from: g, reason: collision with root package name */
    public final a f30017g;

    /* renamed from: h, reason: collision with root package name */
    public final a f30018h;
    public final a i;

    /* renamed from: j, reason: collision with root package name */
    public final u0 f30019j;

    /* renamed from: k, reason: collision with root package name */
    public final u0 f30020k;

    /* renamed from: l, reason: collision with root package name */
    public final u0 f30021l;

    /* renamed from: m, reason: collision with root package name */
    public final u0 f30022m;

    /* renamed from: n, reason: collision with root package name */
    public final u0 f30023n;

    /* renamed from: o, reason: collision with root package name */
    public final u0 f30024o;

    /* renamed from: p, reason: collision with root package name */
    public final u0 f30025p;

    /* renamed from: q, reason: collision with root package name */
    public final u0 f30026q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f30027r;

    /* renamed from: s, reason: collision with root package name */
    public int f30028s;

    /* renamed from: t, reason: collision with root package name */
    public final z f30029t;

    public w0(View view) {
        View view2;
        Object obj;
        a b10 = b(128, "displayCutout");
        this.f30013b = b10;
        a b11 = b(8, "ime");
        this.f30014c = b11;
        a b12 = b(32, "mandatorySystemGestures");
        this.f30015d = b12;
        this.e = b(2, "navigationBars");
        this.f30016f = b(1, "statusBars");
        a b13 = b(519, "systemBars");
        this.f30017g = b13;
        a b14 = b(16, "systemGestures");
        this.f30018h = b14;
        a b15 = b(64, "tappableElement");
        this.i = b15;
        u0 u0Var = new u0(new c0(0, 0, 0, 0), "waterfall");
        this.f30019j = u0Var;
        new s0(new s0(b13, b11), b10);
        new s0(new s0(new s0(b15, b12), b14), u0Var);
        this.f30020k = d(4, "captionBarIgnoringVisibility");
        this.f30021l = d(2, "navigationBarsIgnoringVisibility");
        this.f30022m = d(1, "statusBarsIgnoringVisibility");
        this.f30023n = d(519, "systemBarsIgnoringVisibility");
        this.f30024o = d(64, "tappableElementIgnoringVisibility");
        this.f30025p = d(8, "imeAnimationTarget");
        this.f30026q = d(8, "imeAnimationSource");
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        this.f30027r = bool != null ? bool.booleanValue() : true;
        this.f30029t = new z(this);
    }

    public static void a(w0 w0Var, q3.q0 q0Var) {
        boolean z3 = false;
        w0Var.f30012a.f(q0Var, 0);
        w0Var.f30014c.f(q0Var, 0);
        w0Var.f30013b.f(q0Var, 0);
        w0Var.e.f(q0Var, 0);
        w0Var.f30016f.f(q0Var, 0);
        w0Var.f30017g.f(q0Var, 0);
        w0Var.f30018h.f(q0Var, 0);
        w0Var.i.f(q0Var, 0);
        w0Var.f30015d.f(q0Var, 0);
        w0Var.f30020k.f(b.h(q0Var.f23423a.h(4)));
        w0Var.f30021l.f(b.h(q0Var.f23423a.h(2)));
        w0Var.f30022m.f(b.h(q0Var.f23423a.h(1)));
        w0Var.f30023n.f(b.h(q0Var.f23423a.h(519)));
        w0Var.f30024o.f(b.h(q0Var.f23423a.h(64)));
        q3.c f10 = q0Var.f23423a.f();
        if (f10 != null) {
            w0Var.f30019j.f(b.h(f10.a()));
        }
        synchronized (p.f1387c) {
            j0 j0Var = p.f1392j.f1323h;
            if (j0Var != null) {
                if (j0Var.h()) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p.a();
        }
    }
}
