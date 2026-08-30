package u7;
import k6.r;
import q.c;
import b8.fa;
import o7.b;
import q.d;
import r0.a1;
import r0.f1;
import r2.i;
import r3.e;
import t.f0;
import u7.k6;
import v1.m;
import v1.w;
import y2.q;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.internal.ads.n00;

/* loaded from: classes.dex */
public final class m5 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f26560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26561c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f26562d;
    public final /* synthetic */ pf.z e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f26563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f26564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1 f26565h;
    public final /* synthetic */ f1 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f1 f26566j;

    public m5(boolean z3, float f10, float f11, Context context, pf.z zVar, d dVar, b bVar, a1 a1Var, f1 f1Var, f1 f1Var2) {
        this.f26559a = z3;
        this.f26560b = f10;
        this.f26561c = f11;
        this.f26562d = context;
        this.e = zVar;
        this.f26563f = dVar;
        this.f26564g = bVar;
        this.f26565h = a1Var;
        this.i = f1Var;
        this.f26566j = f1Var2;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        float f10;
        if (this.f26559a) {
            final n00 n00Var = new n00(2);
            float f11 = this.f26560b * 1.0f;
            float f12 = this.f26561c;
            float m4 = f11 / (m(1.0f / f12) / f12);
            if (m4 < 1.0f) {
                m4 = 1.0f;
            }
            int i = this.f26562d.getResources().getConfiguration().smallestScreenWidthDp;
            if (i >= 720) {
                f10 = 1.8f;
            } else if (i >= 600) {
                f10 = 1.4f;
            } else {
                f10 = 1.0f;
            }
            final float f13 = ((f10 * 1.36f) * 1.0f) / m4;
            final Object obj = new Object();
            final pf.z zVar = this.e;
            final d dVar = this.f26563f;
            final b bVar = this.f26564g;
            final a1 a1Var = this.f26565h;
            final f1 f1Var = this.i;
            h hVar = new h(zVar, (kotlin.jvm.internal.v) obj, dVar, bVar, n00Var, a1Var, f1Var);
            final f1 f1Var2 = this.f26566j;
            Object i10 = f0.i(wVar, hVar, new df.a() { // from class: u7.j5
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
                
                    if (java.lang.Math.abs(r4) <= java.lang.Math.abs(r6)) goto L30;
                 */
                @Override // df.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke() {
                    /*
                        r9 = this;
                        a1 r0 = r7
                        r1 = 0
                        k6.r(r0, r1)
                        b r0 = b.this
                        int r0 = r0.f21850c
                        r2 = 1
                        int r0 = r0 - r2
                        if (r0 >= 0) goto Lf
                        r0 = r1
                    Lf:
                        d r3 = r2
                        java.lang.Object r4 = e()
                        java.lang.Number r4 = (java.lang.Number) r4
                        float r4 = r4.floatValue()
                        kotlin.jvm.internal.v r5 = r3
                        float r6 = r5.f19784u
                        float r4 = r4 - r6
                        int r6 = (int) r4
                        float r7 = (float) r6
                        float r4 = r4 - r7
                        float r7 = java.lang.Math.abs(r4)
                        r8 = 1051595899(0x3eae147b, float:0.34)
                        int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                        if (r7 < 0) goto L37
                        r7 = 0
                        int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                        if (r4 <= 0) goto L35
                        r4 = r2
                        goto L38
                    L35:
                        r4 = -1
                        goto L38
                    L37:
                        r4 = r1
                    L38:
                        int r6 = r6 + r4
                        r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
                        long r7 = ya.be.a(r4, r4)
                        com.google.android.gms.internal.ads.n00 r4 = r4
                        long r7 = r4.b(r7)
                        float r4 = q.c(r7)
                        float r4 = -r4
                        float r7 = r5
                        float r4 = r4 * r7
                        float r7 = java.lang.Math.abs(r4)
                        r8 = 1067030938(0x3f99999a, float:1.2)
                        int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                        if (r7 < 0) goto L68
                        r7 = 1045220557(0x3e4ccccd, float:0.2)
                        float r4 = r4 * r7
                        int r4 = ff.a.b(r4)
                        r7 = -4
                        r8 = 4
                        int r4 = wa.b9.e(r4, r7, r8)
                        goto L69
                    L68:
                        r4 = r1
                    L69:
                        if (r4 != 0) goto L6c
                        goto L85
                    L6c:
                        if (r6 != 0) goto L6f
                        goto L84
                    L6f:
                        if (r4 <= 0) goto L73
                        r7 = r2
                        goto L74
                    L73:
                        r7 = r1
                    L74:
                        if (r6 <= 0) goto L77
                        goto L78
                    L77:
                        r2 = r1
                    L78:
                        if (r7 != r2) goto L84
                        int r2 = java.lang.Math.abs(r4)
                        int r7 = java.lang.Math.abs(r6)
                        if (r2 <= r7) goto L85
                    L84:
                        r6 = r4
                    L85:
                        float r2 = r5.f19784u
                        int r2 = ff.a.b(r2)
                        int r2 = r2 + r6
                        int r0 = wa.b9.e(r2, r1, r0)
                        float r0 = (float) r0
                        int r1 = (int) r0
                        f1 r2 = r8
                        i(r1)
                        f1 r2 = r9
                        i(r1)
                        fa r1 = new fa
                        r2 = 3
                        r4 = 0
                        r1.<init>(r0, r2, r3, r4)
                        r0 = 3
                        pf.z r2 = r6
                        pf.b0.x(r2, r4, r1, r0)
                        pe.z r0 = pe.z.f22715a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: u7.j5.invoke():java.lang.Object");
                }
            }, new k4(a1Var, 2), new k5(n00Var, bVar, zVar, dVar, f13), cVar);
            if (i10 == ue.a.f27192u) {
                return i10;
            }
        }
        return pe.z.f22715a;
    }
}