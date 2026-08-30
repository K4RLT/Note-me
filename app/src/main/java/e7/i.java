package e7;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Log;
import androidx.ink.strokes.Stroke;
import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.y;
import p7.v;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ Serializable A;
    public final /* synthetic */ Object B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15951u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15952v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15953w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f15954x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Serializable f15955y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f15956z;

    public /* synthetic */ i(Bitmap bitmap, Stroke stroke, Matrix matrix, y yVar, w wVar, w wVar2, CountDownLatch countDownLatch) {
        this.f15952v = bitmap;
        this.f15953w = stroke;
        this.f15954x = matrix;
        this.f15955y = yVar;
        this.f15956z = wVar;
        this.A = wVar2;
        this.B = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15951u) {
            case 0:
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f15952v;
                kotlin.jvm.internal.u uVar2 = (kotlin.jvm.internal.u) this.f15953w;
                Activity activity = (Activity) this.f15956z;
                kotlin.jvm.internal.u uVar3 = (kotlin.jvm.internal.u) this.f15954x;
                kotlin.jvm.internal.u uVar4 = (kotlin.jvm.internal.u) this.f15955y;
                String str = (String) this.A;
                df.l lVar = (df.l) this.B;
                if (!uVar.f19783u) {
                    Log.w("AdsManager", "rewarded colgado: no llegó a enseñarse en 12 s, se sigue sin él");
                    o.f(uVar2, activity, uVar3, uVar4, str, lVar);
                    return;
                }
                return;
            default:
                Bitmap bitmap = (Bitmap) this.f15952v;
                Stroke stroke = (Stroke) this.f15953w;
                Matrix matrix = (Matrix) this.f15954x;
                final y yVar = (y) this.f15955y;
                final w wVar = (w) this.f15956z;
                final w wVar2 = (w) this.A;
                final CountDownLatch countDownLatch = (CountDownLatch) this.B;
                boolean z3 = v.f22585a;
                df.q qVar = new df.q() { // from class: p7.q
                    @Override // df.q
                    public final Object b(Object obj, Object obj2, Object obj3) {
                        int intValue = ((Integer) obj2).intValue();
                        int intValue2 = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.y.this.f19787u = (Bitmap) obj;
                        wVar.f19785u = intValue;
                        wVar2.f19785u = intValue2;
                        countDownLatch.countDown();
                        return pe.z.f22715a;
                    }
                };
                p7.u uVar5 = new p7.u(bitmap, stroke, matrix, qVar);
                if (!v.f22585a) {
                    qVar.b(null, 0, 0);
                    return;
                }
                v.f22594l.add(uVar5);
                if (v.f22595m == null) {
                    v.e();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ i(kotlin.jvm.internal.u uVar, kotlin.jvm.internal.u uVar2, Activity activity, kotlin.jvm.internal.u uVar3, kotlin.jvm.internal.u uVar4, String str, df.l lVar) {
        this.f15952v = uVar;
        this.f15953w = uVar2;
        this.f15956z = activity;
        this.f15954x = uVar3;
        this.f15955y = uVar4;
        this.A = str;
        this.B = lVar;
    }
}
