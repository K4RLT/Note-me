package r2;
import c.p;
import d0.a;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import j.i0;
import k1.l0;
import m2.g0;
import m2.m0;
import m2.p0;
import wa.b9;
import ya.ya;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final c2.x f24467a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f24468b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24470d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24471f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24472g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24473h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public x f24474j;

    /* renamed from: k, reason: collision with root package name */
    public m0 f24475k;

    /* renamed from: l, reason: collision with root package name */
    public q f24476l;

    /* renamed from: n, reason: collision with root package name */
    public j1.c f24478n;

    /* renamed from: o, reason: collision with root package name */
    public j1.c f24479o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24469c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.m f24477m = b.f24460w;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f24480p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f24481q = k1.a();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f24482r = new Matrix();

    public c(c2.x xVar, i0 i0Var) {
        this.f24467a = xVar;
        this.f24468b = i0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pe.g] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.m, df.l] */
    public final void a() {
        View view;
        int e;
        int e8;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        int i14;
        i0 i0Var = this.f24468b;
        Object r22 = i0Var.f18637w;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view2 = (View) i0Var.f18636v;
        if (!inputMethodManager.isActive(view2)) {
            return;
        }
        Object r32 = this.f24477m;
        float[] fArr = this.f24481q;
        r32.invoke(new k1.d0(fArr));
        this.f24467a.t(fArr);
        Matrix matrix = this.f24482r;
        l0.x(matrix, fArr);
        x xVar = this.f24474j;
        xVar.getClass();
        long j10 = xVar.f24516b;
        q qVar = this.f24476l;
        qVar.getClass();
        m0 m0Var = this.f24475k;
        m0Var.getClass();
        m2.q qVar2 = m0Var.f20525b;
        j1.c cVar = this.f24478n;
        cVar.getClass();
        float f10 = cVar.f18766d;
        float f11 = cVar.f18764b;
        j1.c cVar2 = this.f24479o;
        cVar2.getClass();
        boolean z9 = this.f24471f;
        boolean z10 = this.f24472g;
        boolean z11 = this.f24473h;
        boolean z12 = this.i;
        CursorAnchorInfo.Builder builder = this.f24480p;
        builder.reset();
        builder.setMatrix(matrix);
        p0 p0Var = xVar.f24517c;
        int e10 = p0.e(j10);
        builder.setSelectionRange(e10, p0.d(j10));
        x2.j jVar = x2.j.f30058v;
        if (z9 && e10 >= 0) {
            int g8 = qVar.g(e10);
            j1.c c10 = m0Var.c(g8);
            view = view2;
            float d2 = b9.d(c10.f18763a, 0.0f, (int) (m0Var.f20526c >> 32));
            boolean a10 = ya.a(cVar, d2, c10.f18764b);
            boolean a11 = ya.a(cVar, d2, c10.f18766d);
            if (m0Var.a(g8) == jVar) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!a10 && !a11) {
                i14 = 0;
            } else {
                i14 = 1;
            }
            if (!a10 || !a11) {
                i14 |= 2;
            }
            if (z3) {
                i14 |= 4;
            }
            float f12 = c10.f18764b;
            float f13 = c10.f18766d;
            builder.setInsertionMarkerLocation(d2, f12, f13, f13, i14);
        } else {
            view = view2;
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z10) {
            int i15 = -1;
            if (p0Var != null) {
                i = p0.e(p0Var.f20546a);
            } else {
                i = -1;
            }
            if (p0Var != null) {
                i15 = p0.d(p0Var.f20546a);
            }
            if (i >= 0 && i < i15) {
                builder2.setComposingText(i, xVar.f24515a.f20477v.subSequence(i, i15));
                int g10 = qVar.g(i);
                int g11 = qVar.g(i15);
                float[] fArr2 = new float[(g11 - g10) * 4];
                qVar2.a(g0.b(g10, g11), fArr2);
                while (i < i15) {
                    int g12 = qVar.g(i);
                    int i16 = (g12 - g10) * 4;
                    float f14 = fArr2[i16];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f15 = fArr2[i16 + 1];
                    int i17 = i15;
                    float f16 = fArr2[i16 + 2];
                    float f17 = fArr2[i16 + 3];
                    int i18 = i;
                    if (cVar.f18763a < f16) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (f14 < cVar.f18765c) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int i19 = i10 & i11;
                    if (f11 < f17) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    int i20 = i19 & i12;
                    if (f15 < f10) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    int i21 = i20 & i13;
                    if (!ya.a(cVar, f14, f15) || !ya.a(cVar, f16, f17)) {
                        i21 |= 2;
                    }
                    if (m0Var.a(g12) == jVar) {
                        i21 |= 4;
                    }
                    builder3.addCharacterBounds(i18, f14, f15, f16, f17, i21);
                    builder2 = builder3;
                    i = i18 + 1;
                    i15 = i17;
                }
            }
        }
        int i22 = Build.VERSION.SDK_INT;
        if (i22 >= 33 && z11) {
            editorBounds = p.g().setEditorBounds(l0.D(cVar2));
            handwritingBounds = editorBounds.setHandwritingBounds(l0.D(cVar2));
            build = handwritingBounds.build();
            builder2.setEditorBoundsInfo(build);
        }
        if (i22 >= 34 && z12 && !cVar.f() && (e = qVar2.e(f11)) <= (e8 = qVar2.e(f10))) {
            while (true) {
                builder2.addVisibleLineBounds(m0Var.f(e), qVar2.f(e), m0Var.g(e), qVar2.b(e));
                if (e == e8) {
                    break;
                } else {
                    e++;
                }
            }
        }
        ((InputMethodManager) r22.getValue()).updateCursorAnchorInfo(view, builder2.build());
        this.e = false;
    }
}