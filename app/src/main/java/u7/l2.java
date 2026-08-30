package u7;
import b2.t;
import b6.u;
import b8.l;
import c7.x;
import g3.a;
import j6.c;
import q.d;
import q.e;
import u7.l2;
import v1.i;
import z7.n;

import android.content.Context;
import android.view.TextureView;
import com.facebook.ads.AdError;
import com.google.android.filament.Camera;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import wa.b9;

/* loaded from: classes.dex */
public final class l2 {
    public static int P0;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public float E0;
    public VertexBuffer F0;
    public IndexBuffer G0;
    public Integer H0;
    public VertexBuffer I0;
    public IndexBuffer J0;
    public MaterialInstance K0;
    public ArrayList L;
    public final float[] L0;
    public List M;
    public float M0;
    public float N0;
    public float O0;
    public int R;
    public int S;
    public final LinkedHashMap U;
    public Object V;
    public Integer W;
    public Integer X;
    public VertexBuffer Y;
    public IndexBuffer Z;

    /* renamed from: a, reason: collision with root package name */
    public Engine f26432a;

    /* renamed from: a0, reason: collision with root package name */
    public VertexBuffer f26433a0;

    /* renamed from: b, reason: collision with root package name */
    public Renderer f26434b;

    /* renamed from: b0, reason: collision with root package name */
    public IndexBuffer f26435b0;

    /* renamed from: c, reason: collision with root package name */
    public Scene f26436c;

    /* renamed from: c0, reason: collision with root package name */
    public VertexBuffer f26437c0;

    /* renamed from: d, reason: collision with root package name */
    public View f26438d;

    /* renamed from: d0, reason: collision with root package name */
    public IndexBuffer f26439d0;
    public Camera e;

    /* renamed from: e0, reason: collision with root package name */
    public int f26440e0;

    /* renamed from: f, reason: collision with root package name */
    public SwapChain f26441f;

    /* renamed from: f0, reason: collision with root package name */
    public VertexBuffer f26442f0;

    /* renamed from: g, reason: collision with root package name */
    public ColorGrading f26443g;

    /* renamed from: g0, reason: collision with root package name */
    public IndexBuffer f26444g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f26446h0;
    public Integer i;

    /* renamed from: i0, reason: collision with root package name */
    public VertexBuffer f26447i0;

    /* renamed from: j, reason: collision with root package name */
    public Integer f26448j;

    /* renamed from: j0, reason: collision with root package name */
    public IndexBuffer f26449j0;

    /* renamed from: k, reason: collision with root package name */
    public Integer f26450k;

    /* renamed from: k0, reason: collision with root package name */
    public int f26451k0;

    /* renamed from: l, reason: collision with root package name */
    public Integer f26452l;
    public Texture l0;

    /* renamed from: m, reason: collision with root package name */
    public IndirectLight f26453m;
    public Context m0;

    /* renamed from: n, reason: collision with root package name */
    public Texture f26454n;

    /* renamed from: n0, reason: collision with root package name */
    public final LinkedHashMap f26455n0;

    /* renamed from: o, reason: collision with root package name */
    public VertexBuffer f26456o;

    /* renamed from: o0, reason: collision with root package name */
    public Object f26457o0;

    /* renamed from: p, reason: collision with root package name */
    public IndexBuffer f26458p;

    /* renamed from: p0, reason: collision with root package name */
    public Integer f26459p0;

    /* renamed from: q, reason: collision with root package name */
    public VertexBuffer f26460q;

    /* renamed from: q0, reason: collision with root package name */
    public VertexBuffer f26461q0;

    /* renamed from: r, reason: collision with root package name */
    public IndexBuffer f26462r;

    /* renamed from: r0, reason: collision with root package name */
    public IndexBuffer f26463r0;

    /* renamed from: s, reason: collision with root package name */
    public Material f26464s;

    /* renamed from: s0, reason: collision with root package name */
    public final d f26465s0;

    /* renamed from: t, reason: collision with root package name */
    public TextureSampler f26466t;

    /* renamed from: t0, reason: collision with root package name */
    public final n6 f26467t0;

    /* renamed from: u, reason: collision with root package name */
    public TextureSampler f26468u;

    /* renamed from: u0, reason: collision with root package name */
    public Object f26469u0;

    /* renamed from: v, reason: collision with root package name */
    public Texture f26470v;

    /* renamed from: v0, reason: collision with root package name */
    public final LinkedHashMap f26471v0;

    /* renamed from: w, reason: collision with root package name */
    public Texture f26472w;

    /* renamed from: w0, reason: collision with root package name */
    public Integer f26473w0;

    /* renamed from: x, reason: collision with root package name */
    public Texture f26474x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f26475x0;

    /* renamed from: y, reason: collision with root package name */
    public Texture f26476y;

    /* renamed from: y0, reason: collision with root package name */
    public float f26477y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f26479z0;

    /* renamed from: h, reason: collision with root package name */
    public float f26445h = 1.0f;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f26478z = new HashMap();
    public final HashMap A = new HashMap();
    public final HashSet B = new HashSet();
    public final LinkedHashMap C = new LinkedHashMap();
    public final ArrayList D = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final LinkedHashMap F = new LinkedHashMap();
    public final HashMap G = new HashMap();
    public final HashMap H = new HashMap();
    public final HashMap I = new HashMap();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final LinkedHashMap N = new LinkedHashMap();
    public final LinkedHashMap O = new LinkedHashMap();
    public final HashSet P = new HashSet();
    public final LinkedHashMap Q = new LinkedHashMap();
    public final HashMap T = new HashMap();

    public l2() {
        ByteBuffer.allocateDirect(10512).order(ByteOrder.nativeOrder());
        this.U = new LinkedHashMap();
        qe.s sVar = qe.s.f24023u;
        this.V = sVar;
        this.f26455n0 = new LinkedHashMap();
        this.f26457o0 = sVar;
        this.f26465s0 = e.a(1.0f);
        this.f26467t0 = new n6();
        this.f26469u0 = sVar;
        this.f26471v0 = new LinkedHashMap();
        this.f26477y0 = 90.0f;
        this.f26479z0 = 90.0f;
        this.A0 = 0.07f;
        e.f30989a.getClass();
        this.L0 = new float[]{0.144f, 0.195f, 0.429f};
        this.M0 = Float.NaN;
        this.N0 = Float.NaN;
        this.O0 = Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.filament.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.filament.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.google.android.filament.f] */
    public static void b(View view, n nVar) {
        int i;
        boolean z3;
        view.j();
        view.i();
        int i10 = 1;
        if (nVar.f31964b) {
            i = 2;
        } else {
            i = 1;
        }
        view.c(i);
        Object obj = new Object();
        obj.f4248a = 0.5f;
        boolean z9 = false;
        obj.f4249b = false;
        obj.f4250c = false;
        obj.f4251d = 1;
        float f10 = nVar.f31965c;
        if (f10 < 1.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        obj.f4249b = z3;
        obj.f4250c = true;
        obj.f4248a = f10;
        obj.f4251d = 2;
        view.f(obj);
        Object obj2 = new Object();
        obj2.f4252u = false;
        obj2.f4253v = 4;
        int i11 = nVar.f31966d;
        if (i11 > 1) {
            z9 = true;
        }
        obj2.f4252u = z9;
        if (i11 >= 1) {
            i10 = i11;
        }
        obj2.f4253v = i10;
        view.g(obj2);
        Object obj3 = new Object();
        obj3.f4245b = new float[]{0.0f, -1.0f, 0.0f};
        obj3.f4244a = nVar.e;
        view.b(obj3);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.filament.VertexBuffer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, com.google.android.filament.IndexBuffer] */
    public static f1 g(l2 l2Var, float f10, float f11, float f12, float f13, float f14) {
        long nCreateBuilder;
        long nBuilderBuild;
        long nCreateBuilder2;
        long nBuilderBuild2;
        Engine engine = l2Var.f26432a;
        if (engine == null) {
            return null;
        }
        int i = 0;
        int e = b9.e((int) (f10 / 0.1f), 0, 1800);
        int e8 = b9.e((int) (f11 / 0.1f), 0, 1800);
        int e10 = b9.e((int) (f12 / 0.1f), 0, 200);
        int e11 = b9.e((int) (f13 * 1000.0f), -900, 900);
        int e12 = b9.e((int) (f14 * 24.0f), 0, 24);
        int e13 = b9.e((int) 0.0f, 0, 16);
        LinkedHashMap linkedHashMap = l2Var.Q;
        j2 j2Var = new j2(e, e8, e10, e11, e12, e13);
        Object obj = linkedHashMap.get(j2Var);
        if (obj == null) {
            l2Var.R++;
            float f15 = e * 0.1f;
            float f16 = e8 * 0.1f;
            float f17 = e10 * 0.1f;
            float f18 = e11 / 1000.0f;
            float f19 = e12 / 24.0f;
            x xVar = new x(0, 18);
            t tVar = new t(0, 4);
            float i10 = i(0.005f, 0.0f, b9.d(e13 / 16.0f, 0.0f, 1.0f));
            float min = Math.min(1.0f, 0.75f);
            if (0.08f <= min) {
                min = 0.08f;
            }
            float d2 = b9.d(f19, 0.0f, 1.0f) * min;
            float[] U = e.U(f16 - f17, f15 - f17, true);
            float[] U2 = e.U(f16 + f17, f15 + f17, false);
            e.O(d2, i10, xVar, tVar, (f18 + 1.0f) * 1.0f, f16, true, f17, U, U2);
            e.O(d2, i10, xVar, tVar, (1.0f - f18) * 1.0f, f15, false, f17, U, U2);
            x xVar2 = xVar;
            int i11 = xVar2.f4002v / 9;
            ByteBuffer order = ByteBuffer.allocateDirect(i11 * 36).order(ByteOrder.nativeOrder());
            float[] fArr = (float[]) xVar2.f4003w;
            int i12 = xVar2.f4002v;
            for (int i13 = 0; i13 < i12; i13++) {
                order.putFloat(fArr[i13]);
            }
            order.flip();
            nCreateBuilder = VertexBuffer.nCreateBuilder();
            new b0.a(nCreateBuilder, 8);
            VertexBuffer.nBuilderVertexCount(nCreateBuilder, i11);
            VertexBuffer.nBuilderBufferCount(nCreateBuilder, 1);
            VertexBuffer.nBuilderAttribute(nCreateBuilder, 0, 0, 20, 0, 36);
            VertexBuffer.nBuilderAttribute(nCreateBuilder, 1, 0, 21, 12, 36);
            VertexBuffer.nBuilderAttribute(nCreateBuilder, 3, 0, 19, 28, 36);
            nBuilderBuild = VertexBuffer.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
            if (nBuilderBuild != 0) {
                Object obj2 = new Object();
                obj2.f4237a = nBuilderBuild;
                obj2.h(engine, order);
                ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(tVar.f1592a * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
                int[] iArr = tVar.f1593b;
                int i14 = tVar.f1592a;
                for (int i15 = 0; i15 < i14; i15++) {
                    asShortBuffer.put((short) iArr[i15]);
                }
                asShortBuffer.flip();
                nCreateBuilder2 = IndexBuffer.nCreateBuilder();
                new b0.a(nCreateBuilder2, 3);
                IndexBuffer.nBuilderIndexCount(nCreateBuilder2, tVar.f1592a);
                IndexBuffer.nBuilderBufferType(nCreateBuilder2, 0);
                nBuilderBuild2 = IndexBuffer.nBuilderBuild(nCreateBuilder2, engine.getNativeObject());
                if (nBuilderBuild2 != 0) {
                    Object obj3 = new Object();
                    obj3.f4219a = nBuilderBuild2;
                    obj3.g(engine, asShortBuffer);
                    int i16 = tVar.f1592a;
                    float[] fArr2 = (float[]) xVar2.f4003w;
                    float f20 = Float.POSITIVE_INFINITY;
                    float f21 = Float.POSITIVE_INFINITY;
                    float f22 = Float.NEGATIVE_INFINITY;
                    float f23 = Float.NEGATIVE_INFINITY;
                    float f24 = Float.NEGATIVE_INFINITY;
                    float f25 = Float.POSITIVE_INFINITY;
                    while (i < xVar2.f4002v) {
                        float f26 = fArr2[i];
                        x xVar3 = xVar2;
                        float f27 = fArr2[i + 1];
                        float[] fArr3 = fArr2;
                        float f28 = fArr3[i + 2];
                        f20 = Math.min(f20, f26);
                        f25 = Math.min(f25, f27);
                        f21 = Math.min(f21, f28);
                        f22 = Math.max(f22, f26);
                        f23 = Math.max(f23, f27);
                        f24 = Math.max(f24, f28);
                        i += 9;
                        fArr2 = fArr3;
                        xVar2 = xVar3;
                    }
                    obj = new f1(obj2, obj3, i16, new c((f20 + f22) * 0.5f, (f25 + f23) * 0.5f, (f21 + f24) * 0.5f, a.x(f22, f20, 0.5f, 0.0025f), a.x(f23, f25, 0.5f, 0.0025f), a.x(f24, f21, 0.5f, 0.0025f)));
                    linkedHashMap.put(j2Var, obj);
                } else {
                    x.o("Couldn't create IndexBuffer");
                    return null;
                }
            } else {
                x.o("Couldn't create VertexBuffer");
                return null;
            }
        }
        return (f1) obj;
    }

    public final void A(float f10) {
        this.D0 = f10;
    }

    public final void B(float f10) {
        this.B0 = f10;
    }

    public final void C(float f10) {
        this.f26477y0 = f10;
    }

    public final void D(float f10) {
        this.E0 = f10;
    }

    public final void E(float f10) {
        this.C0 = f10;
    }

    public final void F(float f10) {
        this.f26479z0 = f10;
    }

    public final void G(float f10) {
        this.A0 = f10;
    }

    public final void H(float f10) {
        this.M0 = f10;
    }

    public final void I(float f10) {
        this.O0 = f10;
    }

    public final void J(float f10) {
        this.N0 = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.filament.IndirectLight, java.lang.Object] */
    public final void a(Engine engine, Scene scene, n nVar) {
        long nCreateBuilder;
        long nBuilderBuild;
        IndirectLight indirectLight = this.f26453m;
        if (indirectLight != null) {
            engine.q(indirectLight);
            this.f26453m = null;
        }
        nCreateBuilder = IndirectLight.nCreateBuilder();
        new b0.a(nCreateBuilder, 4);
        IndirectLight.nIrradiance(nCreateBuilder, 1, new float[]{0.52f, 0.55f, 0.62f});
        IndirectLight.nIntensity(nCreateBuilder, 20000.0f);
        nBuilderBuild = IndirectLight.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
        if (nBuilderBuild != 0) {
            Object obj = new Object();
            obj.f4220a = nBuilderBuild;
            scene.d(obj);
            this.f26453m = obj;
            return;
        }
        x.o("Couldn't create IndirectLight");
    }

    public final void c(TextureView textureView, y8.c cVar, q7 q7Var, l lVar) {
        Renderer renderer;
        View view;
        Camera camera;
        textureView.getClass();
        cVar.getClass();
        q7Var.getClass();
        Engine engine = this.f26432a;
        if (engine != null && (renderer = this.f26434b) != null && (view = this.f26438d) != null && (camera = this.e) != null) {
            cVar.f30995b = new u(this, engine, textureView, q7Var, renderer, view, camera, lVar);
            TextureView textureView2 = cVar.f30994a;
            if (textureView2 != null) {
                if (textureView2 == textureView) {
                    return;
                }
                y8.b bVar = cVar.f30997d;
                if (bVar != null) {
                    bVar.f30991u.setSurfaceTextureListener(null);
                    cVar.f30997d = null;
                }
                cVar.a();
            }
            cVar.f30994a = textureView;
            textureView.setOpaque(true);
            cVar.f30997d = new y8.b(cVar, textureView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x036c  */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, com.google.android.filament.f] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, com.google.android.filament.IndexBuffer] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.filament.Texture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45, types: [com.google.android.filament.VertexBuffer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [com.google.android.filament.Texture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.google.android.filament.Texture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.google.android.filament.ColorGrading, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r65, java.util.List r66, java.util.List r67) {
        /*
            Method dump skipped, instructions count: 2672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.l2.d(android.content.Context, java.util.List, java.util.List):void");
    }

    public final pe.o e(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        Engine engine = this.f26432a;
        if (engine == null) {
            return null;
        }
        int e = b9.e(ff.a.b(f10 * 4.0f), 0, 720);
        int e8 = b9.e(ff.a.b(f11 * 4.0f), 0, 720);
        int e10 = b9.e(ff.a.b(f12 * 200.0f), 2, 400);
        int e11 = b9.e(ff.a.b(f13 * 1000.0f), -900, 900);
        int e12 = b9.e(ff.a.b(f14 * 1000.0f), -900, 900);
        int e13 = b9.e(ff.a.b(f15 * 500.0f), -2000, AdError.SERVER_ERROR_CODE);
        int e14 = b9.e(ff.a.b(f16 * 500.0f), -2000, AdError.SERVER_ERROR_CODE);
        i2 i2Var = new i2(e, e8, e10, e11, e12, e13, e14);
        LinkedHashMap linkedHashMap = this.U;
        Object obj = linkedHashMap.get(i2Var);
        if (obj == null) {
            this.S++;
            obj = e.s(engine, e / 4.0f, e8 / 4.0f, e10 / 200.0f, e11 / 1000.0f, e12 / 1000.0f, e13 / 500.0f, e14 / 500.0f);
            linkedHashMap.put(i2Var, obj);
        }
        return (pe.o) obj;
    }

    public final void f(Engine engine, Scene scene, n nVar) {
        long nCreateBuilder;
        boolean nBuilderBuild;
        int i = nVar.f31963a;
        boolean z3 = nVar.f31967f;
        int a10 = com.google.android.filament.b.f4241a.a();
        this.f26448j = Integer.valueOf(a10);
        nCreateBuilder = LightManager.nCreateBuilder(d.b(1));
        new b0.a(nCreateBuilder, 5);
        LightManager.nBuilderDirection(nCreateBuilder, -1.5f, -3.4f, -8.2f);
        LightManager.nBuilderIntensity(nCreateBuilder, 50000.0f);
        LightManager.nBuilderColor(nCreateBuilder, 1.0f, 0.985f, 0.96f);
        LightManager.nBuilderCastShadows(nCreateBuilder, true);
        LightManager.nBuilderShadowOptions(nCreateBuilder, i, 1, new float[]{0.125f, 0.25f, 0.5f}, 0.02f, 2.5f, 0.0f, 1.0f, 100.0f, false, false, 0.5f, 2.0f, z3, 8, 0.3f, false, 0.0f, 0.02f, new float[]{0.0f, 0.0f, 0.0f, 1.0f});
        nBuilderBuild = LightManager.nBuilderBuild(nCreateBuilder, engine.getNativeObject(), a10);
        if (nBuilderBuild) {
            scene.a(a10);
        } else {
            x.o(a.i("Couldn't create Light component for entity ", a10, ", see log."));
        }
    }

    public final Integer h() {
        return this.X;
    }

    public final Integer i() {
        return this.H0;
    }

    public final MaterialInstance j() {
        return this.K0;
    }

    public final Texture k() {
        return this.f26470v;
    }

    public final HashMap l() {
        return this.G;
    }

    public final Camera m() {
        return this.e;
    }

    public final Engine n() {
        return this.f26432a;
    }

    public final Integer o() {
        return this.f26450k;
    }

    public final Integer p() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List q() {
        return this.f26457o0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List r() {
        return this.f26469u0;
    }

    public final IndirectLight s() {
        return this.f26453m;
    }

    public final float t() {
        return this.M0;
    }

    public final float u() {
        return this.O0;
    }

    public final float v() {
        return this.N0;
    }

    public final TextureSampler w() {
        return this.f26468u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List x() {
        return this.V;
    }

    public final SwapChain y() {
        return this.f26441f;
    }

    public final View z() {
        return this.f26438d;
    }
}