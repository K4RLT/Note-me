package i0;
import p.g;
import c.p;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import k1.d0;
import k1.l0;
import m2.g0;
import m2.m0;
import m2.p0;
import r2.x;
import wa.a8;
import wa.b9;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final b f18056a;

    /* renamed from: b, reason: collision with root package name */
    public final m f18057b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18059d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18060f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18061g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18062h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public x f18063j;

    /* renamed from: k, reason: collision with root package name */
    public m0 f18064k;

    /* renamed from: l, reason: collision with root package name */
    public r2.q f18065l;

    /* renamed from: m, reason: collision with root package name */
    public j1.c f18066m;

    /* renamed from: n, reason: collision with root package name */
    public j1.c f18067n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18058c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f18068o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f18069p = d0.a();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f18070q = new Matrix();

    public o(b bVar, m mVar) {
        this.f18056a = bVar;
        this.f18057b = mVar;
    }

    public final void a() {
        float f10;
        float f11;
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
        m mVar = this.f18057b;
        InputMethodManager i15 = mVar.i();
        View view = (View) mVar.f18055w;
        if (i15.isActive(view) && this.f18063j != null && this.f18065l != null && this.f18064k != null && this.f18066m != null && this.f18067n != null) {
            float[] fArr = this.f18069p;
            d0.d(fArr);
            z1.x xVar = (z1.x) this.f18056a.f18035u.L.getValue();
            if (xVar != null) {
                if (!xVar.i()) {
                    xVar = null;
                }
                if (xVar != null) {
                    xVar.j(fArr);
                }
            }
            j1.c cVar = this.f18067n;
            cVar.getClass();
            float f12 = -cVar.f18763a;
            j1.c cVar2 = this.f18067n;
            cVar2.getClass();
            d0.f(fArr, f12, -cVar2.f18764b);
            Matrix matrix = this.f18070q;
            l0.x(matrix, fArr);
            x xVar2 = this.f18063j;
            xVar2.getClass();
            long j10 = xVar2.f24516b;
            r2.q qVar = this.f18065l;
            qVar.getClass();
            m0 m0Var = this.f18064k;
            m0Var.getClass();
            m2.q qVar2 = m0Var.f20525b;
            j1.c cVar3 = this.f18066m;
            cVar3.getClass();
            float f13 = cVar3.f18766d;
            float f14 = cVar3.f18764b;
            j1.c cVar4 = this.f18067n;
            cVar4.getClass();
            boolean z9 = this.f18060f;
            boolean z10 = this.f18061g;
            boolean z11 = this.f18062h;
            boolean z12 = this.i;
            CursorAnchorInfo.Builder builder = this.f18068o;
            builder.reset();
            builder.setMatrix(matrix);
            p0 p0Var = xVar2.f24517c;
            int e10 = p0.e(j10);
            builder.setSelectionRange(e10, p0.d(j10));
            x2.j jVar = x2.j.f30058v;
            if (z9 && e10 >= 0) {
                int g8 = qVar.g(e10);
                j1.c c10 = m0Var.c(g8);
                f10 = f13;
                f11 = f14;
                float d2 = b9.d(c10.f18763a, 0.0f, (int) (m0Var.f20526c >> 32));
                boolean a10 = a8.a(cVar3, d2, c10.f18764b);
                boolean a11 = a8.a(cVar3, d2, c10.f18766d);
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
                float f15 = c10.f18764b;
                float f16 = c10.f18766d;
                builder.setInsertionMarkerLocation(d2, f15, f16, f16, i14);
            } else {
                f10 = f13;
                f11 = f14;
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z10) {
                int i16 = -1;
                if (p0Var != null) {
                    i = p0.e(p0Var.f20546a);
                } else {
                    i = -1;
                }
                if (p0Var != null) {
                    i16 = p0.d(p0Var.f20546a);
                }
                if (i >= 0 && i < i16) {
                    builder2.setComposingText(i, xVar2.f24515a.f20477v.subSequence(i, i16));
                    int g10 = qVar.g(i);
                    int g11 = qVar.g(i16);
                    float[] fArr2 = new float[(g11 - g10) * 4];
                    qVar2.a(g0.b(g10, g11), fArr2);
                    while (i < i16) {
                        int g12 = qVar.g(i);
                        int i17 = (g12 - g10) * 4;
                        float f17 = fArr2[i17];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f18 = fArr2[i17 + 1];
                        int i18 = g10;
                        float f19 = fArr2[i17 + 2];
                        float f20 = fArr2[i17 + 3];
                        int i19 = i16;
                        if (cVar3.f18763a < f19) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (f17 < cVar3.f18765c) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        int i20 = i10 & i11;
                        if (f11 < f20) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        int i21 = i20 & i12;
                        if (f18 < f10) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        int i22 = i21 & i13;
                        if (!a8.a(cVar3, f17, f18) || !a8.a(cVar3, f19, f20)) {
                            i22 |= 2;
                        }
                        if (m0Var.a(g12) == jVar) {
                            i22 |= 4;
                        }
                        int i23 = i;
                        builder3.addCharacterBounds(i23, f17, f18, f19, f20, i22);
                        builder2 = builder3;
                        i = i23 + 1;
                        g10 = i18;
                        i16 = i19;
                    }
                }
            }
            int i24 = Build.VERSION.SDK_INT;
            if (i24 >= 33 && z11) {
                editorBounds = p.g().setEditorBounds(l0.D(cVar4));
                handwritingBounds = editorBounds.setHandwritingBounds(l0.D(cVar4));
                build = handwritingBounds.build();
                builder2.setEditorBoundsInfo(build);
            }
            if (i24 >= 34 && z12 && !cVar3.f() && (e = qVar2.e(f11)) <= (e8 = qVar2.e(f10))) {
                while (true) {
                    builder2.addVisibleLineBounds(m0Var.f(e), qVar2.f(e), m0Var.g(e), qVar2.b(e));
                    if (e == e8) {
                        break;
                    } else {
                        e++;
                    }
                }
            }
            mVar.i().updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
