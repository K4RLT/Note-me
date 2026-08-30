package m2;
import l.a;

import java.util.List;
import ya.ld;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f20514a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f20515b;

    /* renamed from: c, reason: collision with root package name */
    public final List f20516c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20517d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20518f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.c f20519g;

    /* renamed from: h, reason: collision with root package name */
    public final y2.m f20520h;
    public final q2.h i;

    /* renamed from: j, reason: collision with root package name */
    public final long f20521j;

    public l0(g gVar, q0 q0Var, List list, int i, boolean z3, int i10, y2.c cVar, y2.m mVar, q2.h hVar, long j10) {
        this.f20514a = gVar;
        this.f20515b = q0Var;
        this.f20516c = list;
        this.f20517d = i;
        this.e = z3;
        this.f20518f = i10;
        this.f20519g = cVar;
        this.f20520h = mVar;
        this.i = hVar;
        this.f20521j = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l0) {
                l0 l0Var = (l0) obj;
                if (kotlin.jvm.internal.a(this.f20514a, l0Var.f20514a) && kotlin.jvm.internal.a(this.f20515b, l0Var.f20515b) && kotlin.jvm.internal.a(this.f20516c, l0Var.f20516c) && this.f20517d == l0Var.f20517d && this.e == l0Var.e && this.f20518f == l0Var.f20518f && kotlin.jvm.internal.a(this.f20519g, l0Var.f20519g) && this.f20520h == l0Var.f20520h && kotlin.jvm.internal.a(this.i, l0Var.i) && y2.a.b(this.f20521j, l0Var.f20521j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20521j) + ((this.i.hashCode() + ((this.f20520h.hashCode() + ((this.f20519g.hashCode() + p.a.b(this.f20518f, p.a.c((((this.f20516c.hashCode() + ((this.f20515b.hashCode() + (this.f20514a.hashCode() * 31)) * 31)) * 31) + this.f20517d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f20514a) + ", style=" + this.f20515b + ", placeholders=" + this.f20516c + ", maxLines=" + this.f20517d + ", softWrap=" + this.e + ", overflow=" + ((Object) ld.a(this.f20518f)) + ", density=" + this.f20519g + ", layoutDirection=" + this.f20520h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) y2.a.k(this.f20521j)) + ')';
    }
}
