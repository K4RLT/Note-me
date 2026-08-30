package u7;
import u7.s7;

import android.opengl.Matrix;
import com.google.android.filament.Engine;
import com.google.android.filament.TransformManager;

/* loaded from: classes.dex */
public abstract class u7 {

    /* renamed from: a, reason: collision with root package name */
    public static final t7 f26936a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, s7] */
    /* JADX WARN: Type inference failed for: r1v0, types: [u7.t7] */
    static {
        final Object obj = new Object();
        f26936a = new ThreadLocal() { // from class: u7.t7
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                s7.this.getClass();
                return new float[16];
            }
        };
    }

    public static void a(Engine engine, TransformManager transformManager, int i) {
        engine.getClass();
        transformManager.getClass();
        int b10 = transformManager.b(i);
        if (b10 == 0) {
            transformManager.a(i);
            b10 = transformManager.b(i);
        }
        Object obj = f26936a.get();
        obj.getClass();
        float[] fArr = (float[]) obj;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 1000.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr, 0, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr, 0, -0.5f, 0.0f, 0.0f);
        transformManager.d(b10, fArr);
    }

    public static final void b(Engine engine, TransformManager transformManager, int i, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        int b10 = transformManager.b(i);
        if (b10 == 0) {
            transformManager.a(i);
            b10 = transformManager.b(i);
        }
        Object obj = f26936a.get();
        obj.getClass();
        float[] fArr = (float[]) obj;
        Matrix.setIdentityM(fArr, 0);
        if (f23 != 0.0f) {
            Matrix.translateM(fArr, 0, 0.0f, -0.75f, 0.0f);
            Matrix.rotateM(fArr, 0, f23, 1.0f, 0.0f, 0.0f);
            Matrix.translateM(fArr, 0, 0.0f, 0.75f, 0.0f);
        }
        if (f18 != 0.0f) {
            Matrix.rotateM(fArr, 0, f18, 0.0f, 0.0f, 1.0f);
        }
        if (f21 != 0.0f || f20 != 0.0f) {
            Matrix.translateM(fArr, 0, 0.0f, 0.0f, f21 + f20);
        }
        if (f19 != 1.0f) {
            Matrix.scaleM(fArr, 0, f19, f19, f19);
        }
        if (f15 != 0.0f) {
            Matrix.translateM(fArr, 0, f15, 0.0f, 0.0f);
        }
        if (f14 != 0.0f) {
            Matrix.rotateM(fArr, 0, f14, 0.0f, 1.0f, 0.0f);
        }
        Matrix.translateM(fArr, 0, f10, 0.0f, f12);
        Matrix.rotateM(fArr, 0, f11, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr, 0, (-f13) * f16, 0.0f, 0.0f);
        if (f22 != 1.0f || f17 != 1.0f) {
            Matrix.scaleM(fArr, 0, f22, 1.0f, f17);
        }
        transformManager.d(b10, fArr);
    }
}