package u7;
import f.c;
import r0.i0;

import android.graphics.Bitmap;
import android.view.Choreographer;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Material;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Texture;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.View;
import com.google.android.gms.internal.ads.wd0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class e6 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f26143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w f26144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f26145c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d6 f26146d;
    public final /* synthetic */ Choreographer e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q7 f26147f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y8.c f26148g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l2 f26149h;

    public e6(kotlin.jvm.internal.u uVar, androidx.lifecycle.w wVar, c cVar, d6 d6Var, Choreographer choreographer, q7 q7Var, y8.c cVar2, l2 l2Var) {
        this.f26143a = uVar;
        this.f26144b = wVar;
        this.f26145c = cVar;
        this.f26146d = d6Var;
        this.e = choreographer;
        this.f26147f = q7Var;
        this.f26148g = cVar2;
        this.f26149h = l2Var;
    }

    @Override // i0
    public final void a() {
        kotlin.jvm.internal.u uVar = this.f26143a;
        if (!uVar.f19783u) {
            uVar.f19783u = true;
            this.f26144b.g().f(this.f26145c);
            d6 d6Var = this.f26146d;
            d6Var.f26092u = false;
            this.e.removeFrameCallback(d6Var);
            this.f26147f.a();
            y8.c cVar = this.f26148g;
            y8.b bVar = cVar.f30997d;
            if (bVar != null) {
                bVar.f30991u.setSurfaceTextureListener(null);
            }
            cVar.a();
            cVar.f30994a = null;
            cVar.f30997d = null;
            l2 l2Var = this.f26149h;
            ArrayList arrayList = l2Var.E;
            ArrayList arrayList2 = l2Var.D;
            LinkedHashMap linkedHashMap = l2Var.U;
            HashMap hashMap = l2Var.T;
            LinkedHashMap linkedHashMap2 = l2Var.Q;
            HashMap hashMap2 = l2Var.A;
            HashMap hashMap3 = l2Var.f26478z;
            ArrayList arrayList3 = l2Var.K;
            LinkedHashMap linkedHashMap3 = l2Var.F;
            LinkedHashMap linkedHashMap4 = l2Var.N;
            LinkedHashMap linkedHashMap5 = l2Var.C;
            LinkedHashMap linkedHashMap6 = l2Var.f26455n0;
            qe.s sVar = qe.s.f24023u;
            Engine engine = l2Var.f26432a;
            if (engine != null) {
                EntityManager entityManager = com.google.android.filament.b.f4241a;
                entityManager.getClass();
                l2Var.f26471v0.clear();
                l2Var.L = null;
                l2Var.M = null;
                try {
                    Integer num = l2Var.f26448j;
                    if (num != null) {
                        int intValue = num.intValue();
                        engine.n(intValue);
                        entityManager.b(intValue);
                    }
                    Integer num2 = l2Var.f26450k;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        engine.n(intValue2);
                        entityManager.b(intValue2);
                    }
                    Integer num3 = l2Var.f26452l;
                    if (num3 != null) {
                        int intValue3 = num3.intValue();
                        engine.n(intValue3);
                        entityManager.b(intValue3);
                    }
                    IndirectLight indirectLight = l2Var.f26453m;
                    if (indirectLight != null) {
                        engine.q(indirectLight);
                    }
                    Iterator it = ((Iterable) l2Var.V).iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        r7 r7Var = (r7) it.next();
                        HashMap hashMap4 = hashMap;
                        int i = r7Var.f26797a;
                        LinkedHashMap linkedHashMap7 = linkedHashMap2;
                        int i10 = r7Var.f26798b;
                        engine.n(i);
                        entityManager.b(r7Var.f26797a);
                        engine.n(i10);
                        entityManager.b(i10);
                        hashMap = hashMap4;
                        it = it2;
                        linkedHashMap2 = linkedHashMap7;
                    }
                    HashMap hashMap5 = hashMap;
                    LinkedHashMap linkedHashMap8 = linkedHashMap2;
                    Integer num4 = l2Var.W;
                    if (num4 != null) {
                        int intValue4 = num4.intValue();
                        engine.n(intValue4);
                        entityManager.b(intValue4);
                    }
                    Integer num5 = l2Var.X;
                    if (num5 != null) {
                        int intValue5 = num5.intValue();
                        engine.n(intValue5);
                        entityManager.b(intValue5);
                    }
                    Integer num6 = l2Var.H0;
                    if (num6 != null) {
                        int intValue6 = num6.intValue();
                        engine.n(intValue6);
                        entityManager.b(intValue6);
                    }
                    VertexBuffer vertexBuffer = l2Var.I0;
                    if (vertexBuffer != null) {
                        engine.w(vertexBuffer);
                    }
                    IndexBuffer indexBuffer = l2Var.J0;
                    if (indexBuffer != null) {
                        engine.p(indexBuffer);
                    }
                    Iterator it3 = ((Iterable) l2Var.f26469u0).iterator();
                    while (it3.hasNext()) {
                        r7 r7Var2 = (r7) it3.next();
                        int i11 = r7Var2.f26797a;
                        Iterator it4 = it3;
                        int i12 = r7Var2.f26798b;
                        engine.n(i11);
                        entityManager.b(r7Var2.f26797a);
                        engine.n(i12);
                        entityManager.b(i12);
                        it3 = it4;
                    }
                    l2Var.f26469u0 = sVar;
                    Iterator it5 = linkedHashMap6.values().iterator();
                    while (it5.hasNext()) {
                        int intValue7 = ((Number) it5.next()).intValue();
                        engine.n(intValue7);
                        entityManager.b(intValue7);
                    }
                    linkedHashMap6.clear();
                    l2Var.f26457o0 = sVar;
                    l2Var.f26467t0.b(engine, l2Var.f26436c);
                    Integer num7 = l2Var.f26459p0;
                    if (num7 != null) {
                        int intValue8 = num7.intValue();
                        engine.n(intValue8);
                        entityManager.b(intValue8);
                    }
                    l2Var.f26459p0 = null;
                    VertexBuffer vertexBuffer2 = l2Var.f26447i0;
                    if (vertexBuffer2 != null) {
                        engine.w(vertexBuffer2);
                    }
                    IndexBuffer indexBuffer2 = l2Var.f26449j0;
                    if (indexBuffer2 != null) {
                        engine.p(indexBuffer2);
                    }
                    VertexBuffer vertexBuffer3 = l2Var.f26461q0;
                    if (vertexBuffer3 != null) {
                        engine.w(vertexBuffer3);
                    }
                    IndexBuffer indexBuffer3 = l2Var.f26463r0;
                    if (indexBuffer3 != null) {
                        engine.p(indexBuffer3);
                    }
                    Texture texture = l2Var.l0;
                    if (texture != null) {
                        engine.v(texture);
                    }
                    l2Var.l0 = null;
                    Integer num8 = l2Var.f26473w0;
                    if (num8 != null) {
                        int intValue9 = num8.intValue();
                        engine.n(intValue9);
                        entityManager.b(intValue9);
                    }
                    VertexBuffer vertexBuffer4 = l2Var.F0;
                    if (vertexBuffer4 != null) {
                        engine.w(vertexBuffer4);
                    }
                    IndexBuffer indexBuffer4 = l2Var.G0;
                    if (indexBuffer4 != null) {
                        engine.p(indexBuffer4);
                    }
                    VertexBuffer vertexBuffer5 = l2Var.f26456o;
                    if (vertexBuffer5 != null) {
                        engine.w(vertexBuffer5);
                    }
                    IndexBuffer indexBuffer5 = l2Var.f26458p;
                    if (indexBuffer5 != null) {
                        engine.p(indexBuffer5);
                    }
                    VertexBuffer vertexBuffer6 = l2Var.f26460q;
                    if (vertexBuffer6 != null) {
                        engine.w(vertexBuffer6);
                    }
                    IndexBuffer indexBuffer6 = l2Var.f26462r;
                    if (indexBuffer6 != null) {
                        engine.p(indexBuffer6);
                    }
                    VertexBuffer vertexBuffer7 = l2Var.Y;
                    if (vertexBuffer7 != null) {
                        engine.w(vertexBuffer7);
                    }
                    IndexBuffer indexBuffer7 = l2Var.Z;
                    if (indexBuffer7 != null) {
                        engine.p(indexBuffer7);
                    }
                    VertexBuffer vertexBuffer8 = l2Var.f26433a0;
                    if (vertexBuffer8 != null) {
                        engine.w(vertexBuffer8);
                    }
                    IndexBuffer indexBuffer8 = l2Var.f26435b0;
                    if (indexBuffer8 != null) {
                        engine.p(indexBuffer8);
                    }
                    VertexBuffer vertexBuffer9 = l2Var.f26437c0;
                    if (vertexBuffer9 != null) {
                        engine.w(vertexBuffer9);
                    }
                    IndexBuffer indexBuffer9 = l2Var.f26439d0;
                    if (indexBuffer9 != null) {
                        engine.p(indexBuffer9);
                    }
                    VertexBuffer vertexBuffer10 = l2Var.f26442f0;
                    if (vertexBuffer10 != null) {
                        engine.w(vertexBuffer10);
                    }
                    IndexBuffer indexBuffer10 = l2Var.f26444g0;
                    if (indexBuffer10 != null) {
                        engine.p(indexBuffer10);
                    }
                    Iterator it6 = linkedHashMap5.values().iterator();
                    while (it6.hasNext()) {
                        engine.v((Texture) ((pe.j) it6.next()).f22694v);
                    }
                    linkedHashMap5.clear();
                    Iterator it7 = linkedHashMap4.values().iterator();
                    while (it7.hasNext()) {
                        engine.v((Texture) ((pe.j) it7.next()).f22694v);
                    }
                    linkedHashMap4.clear();
                    l2Var.O.clear();
                    Iterator it8 = linkedHashMap3.values().iterator();
                    while (it8.hasNext()) {
                        engine.v((Texture) ((pe.j) it8.next()).f22694v);
                    }
                    linkedHashMap3.clear();
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = arrayList3.get(i13);
                        i13++;
                        engine.v((Texture) obj);
                    }
                    arrayList3.clear();
                    l2Var.G.clear();
                    l2Var.H.clear();
                    l2Var.I.clear();
                    l2Var.J.clear();
                    Collection values = hashMap3.values();
                    values.getClass();
                    Iterator it9 = values.iterator();
                    while (it9.hasNext()) {
                        ((Bitmap) it9.next()).recycle();
                    }
                    hashMap3.clear();
                    Collection values2 = hashMap2.values();
                    values2.getClass();
                    Iterator it10 = values2.iterator();
                    while (it10.hasNext()) {
                        engine.v((Texture) it10.next());
                    }
                    hashMap2.clear();
                    l2Var.B.clear();
                    for (f1 f1Var : linkedHashMap8.values()) {
                        engine.w(f1Var.f26164a);
                        engine.p(f1Var.f26165b);
                    }
                    linkedHashMap8.clear();
                    Collection values3 = hashMap5.values();
                    values3.getClass();
                    Iterator it11 = values3.iterator();
                    while (it11.hasNext()) {
                        engine.w((VertexBuffer) it11.next());
                    }
                    hashMap5.clear();
                    for (pe.o oVar : linkedHashMap.values()) {
                        engine.w((VertexBuffer) oVar.f22703u);
                        engine.p((IndexBuffer) oVar.f22704v);
                    }
                    linkedHashMap.clear();
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList2.get(i14);
                        i14++;
                        engine.v((Texture) obj2);
                    }
                    arrayList2.clear();
                    int size3 = arrayList.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        Object obj3 = arrayList.get(i15);
                        i15++;
                        engine.v(((k2) obj3).f26399a);
                    }
                    arrayList.clear();
                    Texture texture2 = l2Var.f26470v;
                    if (texture2 != null) {
                        engine.v(texture2);
                    }
                    Texture texture3 = l2Var.f26472w;
                    if (texture3 != null) {
                        engine.v(texture3);
                    }
                    Texture texture4 = l2Var.f26474x;
                    if (texture4 != null) {
                        engine.v(texture4);
                    }
                    Texture texture5 = l2Var.f26476y;
                    if (texture5 != null) {
                        engine.v(texture5);
                    }
                    Texture texture6 = l2Var.f26454n;
                    if (texture6 != null) {
                        engine.v(texture6);
                    }
                    Material material = l2Var.f26464s;
                    if (material != null) {
                        engine.r(material);
                    }
                    Integer num9 = l2Var.i;
                    if (num9 != null) {
                        int intValue10 = num9.intValue();
                        engine.l(intValue10);
                        entityManager.b(intValue10);
                    }
                    ColorGrading colorGrading = l2Var.f26443g;
                    if (colorGrading != null) {
                        engine.m(colorGrading);
                    }
                    View view = l2Var.f26438d;
                    if (view != null) {
                        engine.x(view);
                    }
                    Scene scene = l2Var.f26436c;
                    if (scene != null) {
                        engine.t(scene);
                    }
                    Renderer renderer = l2Var.f26434b;
                    if (renderer != null) {
                        engine.s(renderer);
                    }
                    SwapChain swapChain = l2Var.f26441f;
                    if (swapChain != null) {
                        engine.u(swapChain);
                    }
                    engine.k();
                } catch (Exception e) {
                    wd0.o("Error durante limpieza de Filament: ", e.getMessage(), "FILAMENT_DIAG");
                }
                l2Var.f26432a = null;
                l2Var.f26434b = null;
                l2Var.f26436c = null;
                l2Var.f26438d = null;
                l2Var.e = null;
                l2Var.f26441f = null;
                l2Var.f26443g = null;
                l2Var.f26456o = null;
                l2Var.f26458p = null;
                l2Var.f26460q = null;
                l2Var.f26462r = null;
                l2Var.f26470v = null;
                l2Var.f26472w = null;
                l2Var.f26474x = null;
                l2Var.f26476y = null;
                l2Var.f26466t = null;
                l2Var.f26464s = null;
                l2Var.V = sVar;
                l2Var.f26448j = null;
                l2Var.f26450k = null;
                l2Var.f26452l = null;
                l2Var.f26453m = null;
                l2Var.f26454n = null;
                l2Var.W = null;
                l2Var.X = null;
                l2Var.H0 = null;
                l2Var.I0 = null;
                l2Var.J0 = null;
                l2Var.K0 = null;
                l2Var.Y = null;
                l2Var.Z = null;
                l2Var.f26433a0 = null;
                l2Var.f26435b0 = null;
                l2Var.f26473w0 = null;
                l2Var.F0 = null;
                l2Var.G0 = null;
            }
        }
    }
}
