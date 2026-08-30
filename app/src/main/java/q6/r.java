package q6;
import d.b;

import android.graphics.Canvas;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class r extends b {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f23555p;

    /* renamed from: q, reason: collision with root package name */
    public final r6.f f23556q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(o6.j r13, x6.b r14, w6.o r15) {
        /*
            r12 = this;
            int r0 = r15.f27767f
            int r0 = q0.b(r0)
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 == r1) goto Lf
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        Ld:
            r5 = r0
            goto L15
        Lf:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto Ld
        L12:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto Ld
        L15:
            int r0 = r15.f27768g
            int r0 = q0.b(r0)
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L28
            r1 = 2
            if (r0 == r1) goto L25
            r0 = 0
        L23:
            r6 = r0
            goto L2e
        L25:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L23
        L28:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L23
        L2b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L23
        L2e:
            float r7 = r15.f27769h
            v6.a r8 = r15.f27766d
            v6.b r9 = r15.e
            java.util.ArrayList r10 = r15.f27764b
            v6.b r11 = r15.f27763a
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r13 = r15.i
            r2.f23555p = r13
            v6.a r13 = r15.f27765c
            r6.e r13 = r13.b()
            r14 = r13
            r6.f r14 = (r6.f) r14
            r2.f23556q = r14
            r13.a(r12)
            r4.e(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.r.<init>(o6.j, x6.b, w6.o):void");
    }

    @Override // q6.b, q6.e
    public final void c(Canvas canvas, Matrix matrix, int i, a7.b bVar) {
        if (this.f23555p) {
            return;
        }
        r6.f fVar = this.f23556q;
        this.i.setColor(fVar.k(fVar.f24587c.b(), fVar.b()));
        super.c(canvas, matrix, i, bVar);
    }
}
