package w2;

import a1.c;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import j1.e;
import k1.n0;
import r0.g0;
import r0.i1;
import r0.y;
import u2.j;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: u, reason: collision with root package name */
    public final n0 f27701u;

    /* renamed from: v, reason: collision with root package name */
    public final float f27702v;

    /* renamed from: w, reason: collision with root package name */
    public final i1 f27703w = y.B(new e(9205357640488583168L));

    /* renamed from: x, reason: collision with root package name */
    public final g0 f27704x = y.r(new c(28, this));

    public b(n0 n0Var, float f10) {
        this.f27701u = n0Var;
        this.f27702v = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.b(textPaint, this.f27702v);
        textPaint.setShader((Shader) this.f27704x.getValue());
    }
}
