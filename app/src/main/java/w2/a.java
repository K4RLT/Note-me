package w2;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import k1.i;
import kotlin.jvm.internal.l;
import m1.e;
import m1.g;
import m1.h;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: u, reason: collision with root package name */
    public final e f27700u;

    public a(e eVar) {
        this.f27700u = eVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        DashPathEffect dashPathEffect;
        if (textPaint != null) {
            g gVar = g.f20429a;
            e eVar = this.f27700u;
            if (l.a(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (eVar instanceof h) {
                textPaint.setStyle(Paint.Style.STROKE);
                h hVar = (h) eVar;
                textPaint.setStrokeWidth(hVar.f20430a);
                textPaint.setStrokeMiter(hVar.f20431b);
                int i = hVar.f20433d;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else if (i == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i10 = hVar.f20432c;
                if (i10 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i10 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i10 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                i iVar = hVar.e;
                if (iVar != null) {
                    dashPathEffect = iVar.f19487a;
                } else {
                    dashPathEffect = null;
                }
                textPaint.setPathEffect(dashPathEffect);
                return;
            }
            l4.a.o();
        }
    }
}
