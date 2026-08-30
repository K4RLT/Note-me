package m2;
import d.a;
import k.b;
import l.a;
import m.a;
import w.a;

/* loaded from: classes.dex */
public final class v implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f20571a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20572b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20573c;

    /* renamed from: d, reason: collision with root package name */
    public final x2.q f20574d;
    public final x e;

    /* renamed from: f, reason: collision with root package name */
    public final x2.i f20575f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20576g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20577h;
    public final x2.s i;

    public v(int i, int i10, long j10, x2.q qVar, x xVar, x2.i iVar, int i11, int i12, x2.s sVar) {
        this.f20571a = i;
        this.f20572b = i10;
        this.f20573c = j10;
        this.f20574d = qVar;
        this.e = xVar;
        this.f20575f = iVar;
        this.f20576g = i11;
        this.f20577h = i12;
        this.i = sVar;
        if (!y2.o.a(j10, y2.o.f30819c) && y2.o.c(j10) < 0.0f) {
            s2.a.b("lineHeight can't be negative (" + y2.o.c(j10) + ')');
        }
    }

    public final v a(v vVar) {
        if (vVar == null) {
            return this;
        }
        return a(this, vVar.f20571a, vVar.f20572b, vVar.f20573c, vVar.f20574d, vVar.e, vVar.f20575f, vVar.f20576g, vVar.f20577h, vVar.i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (this.f20571a == vVar.f20571a && this.f20572b == vVar.f20572b && y2.o.a(this.f20573c, vVar.f20573c) && kotlin.jvm.internal.a(this.f20574d, vVar.f20574d) && kotlin.jvm.internal.a(this.e, vVar.e) && kotlin.jvm.internal.a(this.f20575f, vVar.f20575f) && this.f20576g == vVar.f20576g && this.f20577h == vVar.f20577h && kotlin.jvm.internal.a(this.i, vVar.i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i10;
        int i11;
        int b10 = p.a.b(this.f20572b, Integer.hashCode(this.f20571a) * 31, 31);
        y2.p[] pVarArr = y2.o.f30818b;
        int d2 = p.a.d(this.f20573c, b10, 31);
        int i12 = 0;
        x2.q qVar = this.f20574d;
        if (qVar != null) {
            i = qVar.hashCode();
        } else {
            i = 0;
        }
        int i13 = (d2 + i) * 31;
        x xVar = this.e;
        if (xVar != null) {
            i10 = xVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        x2.i iVar = this.f20575f;
        if (iVar != null) {
            i11 = iVar.hashCode();
        } else {
            i11 = 0;
        }
        int b11 = p.a.b(this.f20577h, p.a.b(this.f20576g, (i14 + i11) * 31, 31), 31);
        x2.s sVar = this.i;
        if (sVar != null) {
            i12 = sVar.hashCode();
        }
        return b11 + i12;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) x2.b(this.f20571a)) + ", textDirection=" + ((Object) x2.a(this.f20572b)) + ", lineHeight=" + ((Object) y2.o.e(this.f20573c)) + ", textIndent=" + this.f20574d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f20575f + ", lineBreak=" + ((Object) x2.e.a(this.f20576g)) + ", hyphens=" + ((Object) x2.a(this.f20577h)) + ", textMotion=" + this.i + ')';
    }
}
