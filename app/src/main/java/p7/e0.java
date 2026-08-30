package p7;

import android.content.Context;
import android.graphics.Matrix;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.ink.authoring.InProgressStrokeId;
import androidx.ink.authoring.InProgressStrokesView;
import androidx.ink.brush.InputToolType;
import androidx.ink.rendering.android.canvas.CanvasStrokeRenderer;
import androidx.ink.strokes.MutableStrokeInputBatch;
import androidx.ink.strokes.StrokeInput;
import androidx.ink.strokes.StrokeInputBatch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import wa.b9;

/* loaded from: classes.dex */
public final class e0 {
    public InputToolType A;
    public long B;
    public long C;
    public long D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public final FrameLayout J;

    /* renamed from: a, reason: collision with root package name */
    public a f22451a;

    /* renamed from: b, reason: collision with root package name */
    public int f22452b;

    /* renamed from: c, reason: collision with root package name */
    public int f22453c;

    /* renamed from: d, reason: collision with root package name */
    public float f22454d;
    public df.l e;

    /* renamed from: f, reason: collision with root package name */
    public df.a f22455f;

    /* renamed from: g, reason: collision with root package name */
    public df.a f22456g;

    /* renamed from: h, reason: collision with root package name */
    public df.s f22457h;
    public df.l i;

    /* renamed from: j, reason: collision with root package name */
    public df.a f22458j;

    /* renamed from: k, reason: collision with root package name */
    public df.l f22459k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22460l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f22461m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f22462n;

    /* renamed from: o, reason: collision with root package name */
    public float f22463o;

    /* renamed from: p, reason: collision with root package name */
    public int f22464p;

    /* renamed from: q, reason: collision with root package name */
    public float f22465q;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f22466r;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f22467s;

    /* renamed from: t, reason: collision with root package name */
    public Matrix f22468t;

    /* renamed from: u, reason: collision with root package name */
    public float f22469u;

    /* renamed from: v, reason: collision with root package name */
    public float f22470v;

    /* renamed from: w, reason: collision with root package name */
    public final CanvasStrokeRenderer f22471w;

    /* renamed from: x, reason: collision with root package name */
    public final InProgressStrokesView f22472x;

    /* renamed from: y, reason: collision with root package name */
    public InProgressStrokeId f22473y;

    /* renamed from: z, reason: collision with root package name */
    public int f22474z;

    public e0(Context context) {
        context.getClass();
        this.f22451a = a.PRESSURE_PEN;
        this.f22452b = -14013904;
        this.f22454d = 18.0f;
        this.e = new m2.f0(8);
        int i = 19;
        this.f22455f = new fg.o(i);
        this.f22456g = new fg.o(i);
        this.f22457h = m0.f22535a;
        this.i = new m2.f0(9);
        this.f22458j = new fg.o(19);
        this.f22459k = m0.f22536b;
        this.f22461m = new ArrayList();
        this.f22462n = new ArrayList();
        this.f22466r = new HashSet();
        this.f22467s = new HashMap();
        this.f22468t = new Matrix();
        this.f22469u = 1.0f;
        this.f22470v = 1.0f;
        CanvasStrokeRenderer.Companion companion = CanvasStrokeRenderer.Companion;
        s0 s0Var = s0.f22566a;
        this.f22471w = companion.create(s0Var);
        InProgressStrokesView inProgressStrokesView = new InProgressStrokesView(context, null, 0, 6, null);
        this.f22472x = inProgressStrokesView;
        this.f22474z = 1;
        this.A = InputToolType.TOUCH;
        this.I = 1.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(inProgressStrokesView, new FrameLayout.LayoutParams(-1, -1));
        this.J = frameLayout;
        inProgressStrokesView.setTextureBitmapStore(s0Var);
        inProgressStrokesView.eagerInit();
        inProgressStrokesView.addFinishedStrokesListener(new d0(this));
    }

    public final void a(float f10, float f11, long j10, float f12, boolean z3) {
        int b10;
        InputToolType inputToolType;
        Log.d("ScraplyDrawDbg", "controller.beginStroke x=" + f10 + " y=" + f11 + " stylus=" + z3 + " brush=" + this.f22451a);
        a aVar = this.f22451a;
        a aVar2 = a.HIGHLIGHTER;
        int i = this.f22453c;
        if (aVar == aVar2) {
            List list = u7.a.f25881a;
            b10 = i * 2;
        } else {
            b10 = u7.a.b(i);
        }
        this.f22474z = b10;
        this.f22455f.invoke();
        this.f22461m.clear();
        this.f22462n.clear();
        this.f22463o = 0.0f;
        this.f22464p = 0;
        this.f22465q = e();
        ArrayList arrayList = this.f22461m;
        if (!arrayList.isEmpty()) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            long j11 = ((j1.b) obj).f18762a;
            this.f22463o += (float) Math.hypot(f10 - Float.intBitsToFloat((int) (j11 >> 32)), f11 - Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
        arrayList.add(new j1.b((4294967295L & Float.floatToRawIntBits(f11)) | (Float.floatToRawIntBits(f10) << 32)));
        this.f22462n.add(Float.valueOf(this.f22463o));
        if (z3) {
            inputToolType = InputToolType.STYLUS;
        } else {
            inputToolType = InputToolType.TOUCH;
        }
        this.A = inputToolType;
        this.B = j10;
        this.C = 0L;
        this.D = 0L;
        this.E = f10;
        this.F = f11;
        this.G = f10;
        this.H = f11;
        float d2 = b9.d(f12, 0.05f, 1.0f);
        this.I = d2;
        InProgressStrokeId startStroke = this.f22472x.startStroke(StrokeInput.Companion.create$default(StrokeInput.Companion, f10, f11, 0L, this.A, 0.0f, d2, 0.0f, 0.0f, 192, null), m0.e(this.f22451a, this.f22452b, e()), this.f22468t);
        this.f22473y = startStroke;
        if (startStroke != null) {
            this.f22467s.put(startStroke, new v0(this.f22474z, this.f22451a, this.f22452b, z3));
        }
        InProgressStrokeId inProgressStrokeId = this.f22473y;
        boolean isAttachedToWindow = this.f22472x.isAttachedToWindow();
        int width = this.f22472x.getWidth();
        int height = this.f22472x.getHeight();
        float f13 = this.f22469u;
        float f14 = this.f22470v;
        float e = e();
        boolean z9 = v.f22585a;
        boolean z10 = v.f22585a;
        StringBuilder sb2 = new StringBuilder("startStroke sid=");
        sb2.append(inProgressStrokeId);
        sb2.append(" attached=");
        sb2.append(isAttachedToWindow);
        sb2.append(" viewSize=");
        a5.a.n(width, height, "x", " page=", sb2);
        a5.a.s(sb2, f13, "x", f14, " size=");
        sb2.append(e);
        sb2.append(" accum=");
        sb2.append(z10);
        Log.d("ScraplyDrawDbg", sb2.toString());
    }

    public final void b() {
        InProgressStrokeId inProgressStrokeId = this.f22473y;
        if (inProgressStrokeId == null) {
            return;
        }
        this.f22473y = null;
        int i = this.f22464p;
        InProgressStrokesView inProgressStrokesView = this.f22472x;
        if (i > 0) {
            this.f22466r.add(inProgressStrokeId);
            inProgressStrokesView.finishStroke(StrokeInput.Companion.create$default(StrokeInput.Companion, this.E, this.F, 1 + this.C, this.A, 0.0f, this.I, 0.0f, 0.0f, 192, null), inProgressStrokeId);
            this.f22456g.invoke();
        } else {
            this.f22467s.remove(inProgressStrokeId);
            InProgressStrokesView.cancelStroke$default(inProgressStrokesView, inProgressStrokeId, null, 2, null);
        }
    }

    public final void c(v1.t tVar, boolean z3) {
        float d2;
        MutableStrokeInputBatch mutableStrokeInputBatch;
        long j10 = tVar.f27343c;
        InProgressStrokeId inProgressStrokeId = this.f22473y;
        if (inProgressStrokeId != null) {
            if (z3) {
                d2 = this.I;
            } else {
                d2 = b9.d(tVar.e, 0.05f, 1.0f);
            }
            float f10 = d2;
            MutableStrokeInputBatch mutableStrokeInputBatch2 = new MutableStrokeInputBatch();
            for (v1.d dVar : tVar.b()) {
                long j11 = dVar.f27290a;
                long j12 = dVar.f27291b;
                long j13 = j11 - this.B;
                long j14 = j10;
                if (j13 > this.C) {
                    int i = (int) (j12 >> 32);
                    int i10 = (int) (j12 & 4294967295L);
                    MutableStrokeInputBatch.add$default(mutableStrokeInputBatch2, this.A, Float.intBitsToFloat(i), Float.intBitsToFloat(i10), j13, 0.0f, f10, 0.0f, 0.0f, 192, null);
                    this.G = this.E;
                    this.H = this.F;
                    this.D = this.C;
                    this.E = Float.intBitsToFloat(i);
                    this.F = Float.intBitsToFloat(i10);
                    this.C = j13;
                }
                j10 = j14;
            }
            long j15 = j10;
            long j16 = tVar.f27342b - this.B;
            if (j16 > this.C) {
                int i11 = (int) (j15 >> 32);
                int i12 = (int) (j15 & 4294967295L);
                MutableStrokeInputBatch.add$default(mutableStrokeInputBatch2, this.A, Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), j16, 0.0f, f10, 0.0f, 0.0f, 192, null);
                mutableStrokeInputBatch = mutableStrokeInputBatch2;
                this.G = this.E;
                this.H = this.F;
                this.D = this.C;
                this.E = Float.intBitsToFloat(i11);
                this.F = Float.intBitsToFloat(i12);
                this.C = j16;
            } else {
                mutableStrokeInputBatch = mutableStrokeInputBatch2;
            }
            this.I = f10;
            if (mutableStrokeInputBatch.getSize() == 0) {
                return;
            }
            long j17 = this.C - this.D;
            if (1 <= j17 && j17 < 65) {
                float f11 = 16.0f / ((float) j17);
                float f12 = this.E;
                float x9 = g3.a.x(f12, this.G, f11, f12);
                float f13 = this.F;
                this.f22472x.addToStroke(mutableStrokeInputBatch, inProgressStrokeId, MutableStrokeInputBatch.add$default(new MutableStrokeInputBatch(), this.A, x9, g3.a.x(f13, this.H, f11, f13), this.C + 16, 0.0f, f10, 0.0f, 0.0f, 192, null));
                return;
            }
            InProgressStrokesView.addToStroke$default(this.f22472x, mutableStrokeInputBatch, inProgressStrokeId, (StrokeInputBatch) null, 4, (Object) null);
        }
    }

    public final void d(Matrix matrix) {
        this.f22468t = matrix;
    }

    public final float e() {
        float f10 = 2048;
        float f11 = this.f22469u;
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        float f12 = this.f22454d / (f10 / f11);
        if (f12 < 0.5f) {
            return 0.5f;
        }
        return f12;
    }
}
