package q6;
import d.b;
import n.q;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f23504p;

    /* renamed from: q, reason: collision with root package name */
    public final q f23505q;

    /* renamed from: r, reason: collision with root package name */
    public final q f23506r;

    /* renamed from: s, reason: collision with root package name */
    public final RectF f23507s;

    /* renamed from: t, reason: collision with root package name */
    public final int f23508t;

    /* renamed from: u, reason: collision with root package name */
    public final int f23509u;

    /* renamed from: v, reason: collision with root package name */
    public final r6.h f23510v;

    /* renamed from: w, reason: collision with root package name */
    public final r6.h f23511w;

    /* renamed from: x, reason: collision with root package name */
    public final r6.h f23512x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(o6.j r12, x6.b r13, w6.e r14) {
        /*
            r11 = this;
            int r0 = r14.f27725g
            int r0 = q0.b(r0)
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 == r1) goto Lf
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        Ld:
            r3 = r0
            goto L15
        Lf:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto Ld
        L12:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto Ld
        L15:
            int r0 = r14.f27726h
            int r0 = q0.b(r0)
            r10 = 0
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L29
            r1 = 2
            if (r0 == r1) goto L25
            r4 = r10
            goto L2f
        L25:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
        L27:
            r4 = r0
            goto L2f
        L29:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L27
        L2c:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L27
        L2f:
            float r5 = r14.i
            v6.a r6 = r14.f27722c
            v6.b r7 = r14.f27724f
            java.util.ArrayList r8 = r14.f27727j
            v6.b r9 = r14.f27728k
            r0 = r11
            r1 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            q r1 = new q
            r1.<init>(r10)
            r11.f23505q = r1
            q r1 = new q
            r1.<init>(r10)
            r11.f23506r = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r11.f23507s = r1
            int r1 = r14.f27720a
            r11.f23508t = r1
            boolean r1 = r14.f27729l
            r11.f23504p = r1
            o6.a r1 = r12.f21819u
            float r1 = r1.b()
            r3 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 / r3
            int r1 = (int) r1
            r11.f23509u = r1
            v6.a r1 = r14.f27721b
            r6.e r1 = r1.b()
            r3 = r1
            r6.h r3 = (r6.h) r3
            r11.f23510v = r3
            r1.a(r11)
            r13.e(r1)
            v6.a r1 = r14.f27723d
            r6.e r1 = r1.b()
            r3 = r1
            r6.h r3 = (r6.h) r3
            r11.f23511w = r3
            r1.a(r11)
            r13.e(r1)
            v6.a r1 = r14.e
            r6.e r1 = r1.b()
            r3 = r1
            r6.h r3 = (r6.h) r3
            r11.f23512x = r3
            r1.a(r11)
            r13.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.i.<init>(o6.j, x6.b, w6.e):void");
    }

    @Override // q6.b, q6.e
    public final void c(Canvas canvas, Matrix matrix, int i, a7.b bVar) {
        Shader shader;
        if (this.f23504p) {
            return;
        }
        d(this.f23507s, matrix, false);
        int i10 = this.f23508t;
        r6.h hVar = this.f23510v;
        r6.h hVar2 = this.f23512x;
        r6.h hVar3 = this.f23511w;
        if (i10 == 1) {
            long e = e();
            q qVar = this.f23505q;
            shader = (LinearGradient) qVar.b(e);
            if (shader == null) {
                PointF pointF = (PointF) hVar3.d();
                PointF pointF2 = (PointF) hVar2.d();
                w6.c cVar = (w6.c) hVar.d();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, cVar.f27713b, cVar.f27712a, Shader.TileMode.CLAMP);
                qVar.d(e, shader);
            }
        } else {
            long e8 = e();
            q qVar2 = this.f23506r;
            shader = (RadialGradient) qVar2.b(e8);
            if (shader == null) {
                PointF pointF3 = (PointF) hVar3.d();
                PointF pointF4 = (PointF) hVar2.d();
                w6.c cVar2 = (w6.c) hVar.d();
                int[] iArr = cVar2.f27713b;
                float[] fArr = cVar2.f27712a;
                shader = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r9, pointF4.y - r10), iArr, fArr, Shader.TileMode.CLAMP);
                qVar2.d(e8, shader);
            }
        }
        this.i.setShader(shader);
        super.c(canvas, matrix, i, bVar);
    }

    public final int e() {
        int i;
        float f10 = this.f23511w.f24588d;
        float f11 = this.f23509u;
        int round = Math.round(f10 * f11);
        int round2 = Math.round(this.f23512x.f24588d * f11);
        int round3 = Math.round(this.f23510v.f24588d * f11);
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }
}
