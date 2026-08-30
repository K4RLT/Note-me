package com.google.android.filament;
import d.c;

import android.view.Surface;
import g5.q;
import q.x;

/* loaded from: classes.dex */
public class Engine {

    /* renamed from: a, reason: collision with root package name */
    public long f4213a;

    /* renamed from: b, reason: collision with root package name */
    public final TransformManager f4214b;

    /* renamed from: c, reason: collision with root package name */
    public final LightManager f4215c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderableManager f4216d;

    static {
        q0.c(5);
        q0.c(4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.filament.TransformManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.filament.LightManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.filament.RenderableManager, java.lang.Object] */
    public Engine(long j10) {
        this.f4213a = j10;
        long nGetTransformManager = nGetTransformManager(j10);
        Object obj = new Object();
        obj.f4236a = nGetTransformManager;
        this.f4214b = obj;
        long nGetLightManager = nGetLightManager(j10);
        Object obj2 = new Object();
        obj2.f4221a = nGetLightManager;
        this.f4215c = obj2;
        long nGetRenderableManager = nGetRenderableManager(j10);
        Object obj3 = new Object();
        obj3.f4225a = nGetRenderableManager;
        this.f4216d = obj3;
        new EntityManager(nGetEntityManager(j10));
    }

    public static void d(boolean z3) {
        if (z3) {
            return;
        }
        x.o("Object couldn't be destroyed (double destroy()?)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    private static native long nCreateCamera(long j10, int i);

    private static native long nCreateFence(long j10);

    private static native long nCreateRenderer(long j10);

    private static native long nCreateScene(long j10);

    private static native long nCreateSwapChain(long j10, Object obj, long j11);

    private static native long nCreateView(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nDestroyCameraComponent(long j10, int i);

    private static native boolean nDestroyColorGrading(long j10, long j11);

    private static native void nDestroyEngine(long j10);

    private static native void nDestroyEntity(long j10, int i);

    private static native boolean nDestroyFence(long j10, long j11);

    private static native boolean nDestroyIndexBuffer(long j10, long j11);

    private static native boolean nDestroyIndirectLight(long j10, long j11);

    private static native boolean nDestroyMaterial(long j10, long j11);

    private static native boolean nDestroyRenderer(long j10, long j11);

    private static native boolean nDestroyScene(long j10, long j11);

    private static native boolean nDestroySwapChain(long j10, long j11);

    private static native boolean nDestroyTexture(long j10, long j11);

    private static native boolean nDestroyVertexBuffer(long j10, long j11);

    private static native boolean nDestroyView(long j10, long j11);

    private static native void nFlushAndWait(long j10);

    private static native long nGetEntityManager(long j10);

    private static native long nGetJobSystem(long j10);

    private static native long nGetLightManager(long j10);

    private static native long nGetRenderableManager(long j10);

    private static native long nGetTransformManager(long j10);

    public final TransformManager A() {
        return this.f4214b;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.android.filament.Camera, java.lang.Object] */
    public final Camera e(int i) {
        long nCreateCamera = nCreateCamera(getNativeObject(), i);
        if (nCreateCamera != 0) {
            Object obj = new Object();
            obj.f4211a = nCreateCamera;
            return obj;
        }
        x.o("Couldn't create Camera");
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.filament.Fence] */
    public final Fence f() {
        long nCreateFence = nCreateFence(getNativeObject());
        if (nCreateFence != 0) {
            Object obj = new Object();
            obj.f4218a = nCreateFence;
            return obj;
        }
        x.o("Couldn't create Fence");
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.filament.Renderer] */
    public final Renderer g() {
        long nCreateRenderer = nCreateRenderer(getNativeObject());
        if (nCreateRenderer != 0) {
            Object obj = new Object();
            obj.f4226a = nCreateRenderer;
            return obj;
        }
        x.o("Couldn't create Renderer");
        return null;
    }

    public long getNativeJobSystem() {
        if (this.f4213a != 0) {
            return nGetJobSystem(getNativeObject());
        }
        x.o("Calling method on destroyed Engine");
        return 0L;
    }

    public long getNativeObject() {
        long j10 = this.f4213a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed Engine");
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.filament.Scene] */
    public final Scene h() {
        long nCreateScene = nCreateScene(getNativeObject());
        if (nCreateScene != 0) {
            Object obj = new Object();
            obj.f4229a = nCreateScene;
            return obj;
        }
        x.o("Couldn't create Scene");
        return null;
    }

    public final SwapChain i(Surface surface) {
        if (e.a().b(surface)) {
            long nCreateSwapChain = nCreateSwapChain(getNativeObject(), surface, 0L);
            if (nCreateSwapChain != 0) {
                return new SwapChain(nCreateSwapChain, surface);
            }
            x.o("Couldn't create SwapChain");
            return null;
        }
        q.g(surface, "Invalid surface ");
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.filament.View] */
    public final View j() {
        long nCreateView = nCreateView(getNativeObject());
        if (nCreateView != 0) {
            Object obj = new Object();
            int i = 0;
            obj.f4239b = new k(i, i);
            obj.f4238a = nCreateView;
            return obj;
        }
        x.o("Couldn't create View");
        return null;
    }

    public final void k() {
        nDestroyEngine(getNativeObject());
        this.f4213a = 0L;
    }

    public final void l(int i) {
        nDestroyCameraComponent(getNativeObject(), i);
    }

    public final void m(ColorGrading colorGrading) {
        long nativeObject = getNativeObject();
        long j10 = colorGrading.f4212a;
        if (j10 != 0) {
            d(nDestroyColorGrading(nativeObject, j10));
            colorGrading.f4212a = 0L;
        } else {
            x.o("Calling method on destroyed ColorGrading");
        }
    }

    public final void n(int i) {
        nDestroyEntity(getNativeObject(), i);
    }

    public final void o(Fence fence) {
        long nativeObject = getNativeObject();
        long j10 = fence.f4218a;
        if (j10 != 0) {
            d(nDestroyFence(nativeObject, j10));
            fence.f4218a = 0L;
        } else {
            x.o("Calling method on destroyed Fence");
        }
    }

    public final void p(IndexBuffer indexBuffer) {
        d(nDestroyIndexBuffer(getNativeObject(), indexBuffer.f()));
        indexBuffer.f4219a = 0L;
    }

    public final void q(IndirectLight indirectLight) {
        d(nDestroyIndirectLight(getNativeObject(), indirectLight.f()));
        indirectLight.f4220a = 0L;
    }

    public final void r(Material material) {
        d(nDestroyMaterial(getNativeObject(), material.c()));
        material.f4222a = 0L;
    }

    public final void s(Renderer renderer) {
        d(nDestroyRenderer(getNativeObject(), renderer.c()));
        renderer.f4226a = 0L;
    }

    public final void t(Scene scene) {
        d(nDestroyScene(getNativeObject(), scene.b()));
        scene.f4229a = 0L;
    }

    public final void u(SwapChain swapChain) {
        long nativeObject = getNativeObject();
        long j10 = swapChain.f4232b;
        if (j10 != 0) {
            d(nDestroySwapChain(nativeObject, j10));
            swapChain.f4232b = 0L;
        } else {
            x.o("Calling method on destroyed SwapChain");
        }
    }

    public final void v(Texture texture) {
        d(nDestroyTexture(getNativeObject(), texture.getNativeObject()));
        texture.f4233a = 0L;
    }

    public final void w(VertexBuffer vertexBuffer) {
        d(nDestroyVertexBuffer(getNativeObject(), vertexBuffer.g()));
        vertexBuffer.f4237a = 0L;
    }

    public final void x(View view) {
        d(nDestroyView(getNativeObject(), view.a()));
        view.f4238a = 0L;
    }

    public final void y() {
        nFlushAndWait(getNativeObject());
    }

    public final LightManager z() {
        return this.f4215c;
    }
}