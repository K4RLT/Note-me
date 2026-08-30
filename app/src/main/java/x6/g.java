package x6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import java.util.Collections;
import java.util.List;
import w6.m;

/* loaded from: classes.dex */
public final class g extends b {
    public final q6.d B;
    public final c C;
    public final r6.g D;

    public g(o6.j jVar, e eVar, c cVar, o6.a aVar) {
        super(jVar, eVar);
        this.C = cVar;
        q6.d dVar = new q6.d(jVar, this, new m("__container", eVar.f30115a, false), aVar);
        this.B = dVar;
        List list = Collections.EMPTY_LIST;
        dVar.b(list, list);
        u0 u0Var = this.f30104p.f30136x;
        if (u0Var != null) {
            this.D = new r6.g(this, this, u0Var);
        }
    }

    @Override // x6.b, q6.e
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        this.B.d(rectF, this.f30102n, z3);
    }

    @Override // x6.b
    public final void i(Canvas canvas, Matrix matrix, int i, a7.b bVar) {
        r6.g gVar = this.D;
        if (gVar != null) {
            bVar = gVar.b(matrix, i);
        }
        this.B.c(canvas, matrix, i, bVar);
    }

    @Override // x6.b
    public final u.c j() {
        u.c cVar = this.f30104p.f30135w;
        if (cVar != null) {
            return cVar;
        }
        return this.C.f30104p.f30135w;
    }
}
