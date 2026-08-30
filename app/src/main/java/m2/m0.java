package m2;
import a.a;
import g0.b;
import g0.d;
import g0.e;
import g0.g;
import k.a;
import l.a;
import l.c;
import l.d;
import m.f;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import com.google.android.gms.internal.ads.l3;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f20524a;

    /* renamed from: b, reason: collision with root package name */
    public final q f20525b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20526c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20527d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f20528f;

    public m0(l0 l0Var, q qVar, long j10) {
        float d2;
        this.f20524a = l0Var;
        this.f20525b = qVar;
        this.f20526c = j10;
        ArrayList arrayList = qVar.f20553h;
        float f10 = 0.0f;
        if (arrayList.isEmpty()) {
            d2 = 0.0f;
        } else {
            d2 = ((n2.h) ((s) arrayList.get(0)).f20561a.f20437d).d(0);
        }
        this.f20527d = d2;
        if (!arrayList.isEmpty()) {
            s sVar = (s) qe.l.C(arrayList);
            f10 = ((n2.h) sVar.f20561a.f20437d).d(r4.f21132g - 1) + sVar.f20565f;
        }
        this.e = f10;
        this.f20528f = qVar.f20552g;
    }

    public final x2.j a(int i) {
        int d2;
        q qVar = this.f20525b;
        qVar.l(i);
        int length = ((g) qVar.f20547a.f15036v).f20477v.length();
        ArrayList arrayList = qVar.f20553h;
        if (i == length) {
            d2 = qe.f(arrayList);
        } else {
            d2 = d(i, arrayList);
        }
        s sVar = (s) arrayList.get(d2);
        a aVar = sVar.f20561a;
        if (((n2.h) aVar.f20437d).f21131f.isRtlCharAt(sVar.d(i))) {
            return x2.j.f30058v;
        }
        return x2.j.f30057u;
    }

    public final j1.c b(int i) {
        boolean z3;
        float i10;
        float i11;
        float h3;
        float h10;
        q qVar = this.f20525b;
        qVar.k(i);
        ArrayList arrayList = qVar.f20553h;
        s sVar = (s) arrayList.get(d(i, arrayList));
        a aVar = sVar.f20561a;
        int d2 = sVar.d(i);
        CharSequence charSequence = (CharSequence) aVar.e;
        if (d2 < 0 || d2 >= charSequence.length()) {
            StringBuilder m4 = g3.a.m("offset(", d2, ") is out of bounds [0,");
            m4.append(charSequence.length());
            m4.append(')');
            s2.a(m4.toString());
        }
        n2.h hVar = (n2.h) aVar.f20437d;
        Layout layout = hVar.f21131f;
        int lineForOffset = layout.getLineForOffset(d2);
        float g8 = hVar.g(lineForOffset);
        float e = hVar.e(lineForOffset);
        if (layout.getParagraphDirection(lineForOffset) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(d2);
        if (z3 && !isRtlCharAt) {
            i10 = hVar.h(d2, false);
            i11 = hVar.h(d2 + 1, true);
        } else {
            if (z3 && isRtlCharAt) {
                h3 = hVar.i(d2, false);
                h10 = hVar.i(d2 + 1, true);
            } else if (isRtlCharAt) {
                h3 = hVar.h(d2, false);
                h10 = hVar.h(d2 + 1, true);
            } else {
                i10 = hVar.i(d2, false);
                i11 = hVar.i(d2 + 1, true);
            }
            float f10 = h3;
            i10 = h10;
            i11 = f10;
        }
        RectF rectF = new RectF(i10, g8, i11, e);
        return sVar.a(new j1.c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final j1.c c(int i) {
        int d2;
        q qVar = this.f20525b;
        qVar.l(i);
        int length = ((g) qVar.f20547a.f15036v).f20477v.length();
        ArrayList arrayList = qVar.f20553h;
        if (i == length) {
            d2 = qe.f(arrayList);
        } else {
            d2 = d(i, arrayList);
        }
        s sVar = (s) arrayList.get(d2);
        a aVar = sVar.f20561a;
        int d10 = sVar.d(i);
        CharSequence charSequence = (CharSequence) aVar.e;
        n2.h hVar = (n2.h) aVar.f20437d;
        if (d10 < 0 || d10 > charSequence.length()) {
            StringBuilder m4 = g3.a.m("offset(", d10, ") is out of bounds [0,");
            m4.append(charSequence.length());
            m4.append(']');
            s2.a(m4.toString());
        }
        float h3 = hVar.h(d10, false);
        int lineForOffset = hVar.f21131f.getLineForOffset(d10);
        return sVar.a(new j1.c(h3, hVar.g(lineForOffset), h3, hVar.e(lineForOffset)));
    }

    public final boolean d() {
        q qVar = this.f20525b;
        if (!qVar.f20549c && ((int) (this.f20526c & 4294967295L)) >= qVar.e) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (((int) (this.f20526c >> 32)) < this.f20525b.f20550d || d()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m0) {
                m0 m0Var = (m0) obj;
                if (kotlin.jvm.internal.a(this.f20524a, m0Var.f20524a) && this.f20525b.equals(m0Var.f20525b) && y2.c(this.f20526c, m0Var.f20526c) && this.f20527d == m0Var.f20527d && this.e == m0Var.e && kotlin.jvm.internal.a(this.f20528f, m0Var.f20528f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final float f(int i) {
        float f10;
        q qVar = this.f20525b;
        qVar.m(i);
        ArrayList arrayList = qVar.f20553h;
        s sVar = (s) arrayList.get(e(i, arrayList));
        a aVar = sVar.f20561a;
        int i10 = i - sVar.f20564d;
        n2.h hVar = (n2.h) aVar.f20437d;
        float lineLeft = hVar.f21131f.getLineLeft(i10);
        if (i10 == hVar.f21132g - 1) {
            f10 = hVar.f21134j;
        } else {
            f10 = 0.0f;
        }
        return lineLeft + f10;
    }

    public final float g(int i) {
        float f10;
        q qVar = this.f20525b;
        qVar.m(i);
        ArrayList arrayList = qVar.f20553h;
        s sVar = (s) arrayList.get(e(i, arrayList));
        a aVar = sVar.f20561a;
        int i10 = i - sVar.f20564d;
        n2.h hVar = (n2.h) aVar.f20437d;
        float lineRight = hVar.f21131f.getLineRight(i10);
        if (i10 == hVar.f21132g - 1) {
            f10 = hVar.f21135k;
        } else {
            f10 = 0.0f;
        }
        return lineRight + f10;
    }

    public final int h(int i) {
        q qVar = this.f20525b;
        qVar.m(i);
        ArrayList arrayList = qVar.f20553h;
        s sVar = (s) arrayList.get(e(i, arrayList));
        a aVar = sVar.f20561a;
        return ((n2.h) aVar.f20437d).f21131f.getLineStart(i - sVar.f20564d) + sVar.f20562b;
    }

    public final int hashCode() {
        return this.f20528f.hashCode() + p.a(p.a(p.a.d(this.f20526c, (this.f20525b.hashCode() + (this.f20524a.hashCode() * 31)) * 31, 31), 31, this.f20527d), 31, this.e);
    }

    public final x2.j i(int i) {
        int d2;
        q qVar = this.f20525b;
        qVar.l(i);
        int length = ((g) qVar.f20547a.f15036v).f20477v.length();
        ArrayList arrayList = qVar.f20553h;
        if (i == length) {
            d2 = qe.f(arrayList);
        } else {
            d2 = d(i, arrayList);
        }
        s sVar = (s) arrayList.get(d2);
        a aVar = sVar.f20561a;
        int d10 = sVar.d(i);
        n2.h hVar = (n2.h) aVar.f20437d;
        if (hVar.f21131f.getParagraphDirection(hVar.f21131f.getLineForOffset(d10)) == 1) {
            return x2.j.f30057u;
        }
        return x2.j.f30058v;
    }

    public final k1.h j(final int i, final int i10) {
        q qVar = this.f20525b;
        g gVar = (g) qVar.f20547a.f15036v;
        if (i < 0 || i > i10 || i10 > gVar.f20477v.length()) {
            StringBuilder n10 = g3.a.n("Start(", i, ") or End(", ") is out of range [0..", i10);
            n10.append(gVar.f20477v.length());
            n10.append("), or start > end!");
            s2.a(n10.toString());
        }
        if (i == i10) {
            return k1.a();
        }
        final k1.h a10 = k1.a();
        g(qVar.f20553h, b(i, i10), new df.l() { // from class: m2.p
            @Override // df.l
            public final Object invoke(Object obj) {
                s sVar = (s) obj;
                a aVar = sVar.f20561a;
                int d2 = sVar.d(i);
                int d10 = sVar.d(i10);
                CharSequence charSequence = (CharSequence) aVar.e;
                if (d2 < 0 || d2 > d10 || d10 > charSequence.length()) {
                    StringBuilder n11 = g3.a.n("start(", d2, ") or end(", ") is out of range [0..", d10);
                    n11.append(charSequence.length());
                    n11.append("], or start > end!");
                    s2.a(n11.toString());
                }
                Path path = new Path();
                n2.h hVar = (n2.h) aVar.f20437d;
                hVar.f21131f.getSelectionPath(d2, d10, path);
                int i11 = hVar.f21133h;
                if (i11 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i11);
                }
                float f10 = sVar.f20565f;
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                int i12 = (int) 0;
                k1.h.this.f19481a.addPath(path, Float.intBitsToFloat(i12), Float.intBitsToFloat(i12));
                return pe.z.f22715a;
            }
        });
        return a10;
    }

    public final long k(int i) {
        int d2;
        int i10;
        int i11;
        int j10;
        q qVar = this.f20525b;
        qVar.l(i);
        int length = ((g) qVar.f20547a.f15036v).f20477v.length();
        ArrayList arrayList = qVar.f20553h;
        if (i == length) {
            d2 = qe.f(arrayList);
        } else {
            d2 = d(i, arrayList);
        }
        s sVar = (s) arrayList.get(d2);
        a aVar = sVar.f20561a;
        int d10 = sVar.d(i);
        l3 j11 = ((n2.h) aVar.f20437d).j();
        if (j11.i(j11.m(d10))) {
            j11.b(d10);
            i10 = d10;
            while (i10 != -1 && (!j11.i(i10) || j11.e(i10))) {
                i10 = j11.m(i10);
            }
        } else {
            j11.b(d10);
            if (j11.h(d10)) {
                if (j11.f(d10) && !j11.d(d10)) {
                    i10 = d10;
                } else {
                    i10 = j11.m(d10);
                }
            } else if (j11.d(d10)) {
                i10 = j11.m(d10);
            } else {
                i10 = -1;
            }
        }
        if (i10 == -1) {
            i10 = d10;
        }
        if (j11.e(j11.j(d10))) {
            j11.b(d10);
            i11 = d10;
            while (i11 != -1 && (j11.i(i11) || !j11.e(i11))) {
                i11 = j11.j(i11);
            }
        } else {
            j11.b(d10);
            if (j11.d(d10)) {
                if (j11.f(d10) && !j11.h(d10)) {
                    i11 = d10;
                } else {
                    j10 = j11.j(d10);
                    i11 = j10;
                }
            } else if (j11.h(d10)) {
                j10 = j11.j(d10);
                i11 = j10;
            } else {
                i11 = -1;
            }
        }
        if (i11 != -1) {
            d10 = i11;
        }
        return sVar.b(b(i10, d10), false);
    }

    public final boolean l(int i) {
        q qVar = this.f20525b;
        qVar.m(i);
        ArrayList arrayList = qVar.f20553h;
        Layout layout = ((n2.h) ((s) arrayList.get(e(i, arrayList))).f20561a.f20437d).f21131f;
        n2.g gVar = n2.i.f21142a;
        if (layout.getEllipsisCount(i) > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f20524a + ", multiParagraph=" + this.f20525b + ", size=" + ((Object) y2.d(this.f20526c)) + ", firstBaseline=" + this.f20527d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f20528f + ')';
    }
}
