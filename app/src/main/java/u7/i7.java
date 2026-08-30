package u7;
import l.a;

import java.util.List;

/* loaded from: classes.dex */
public final class i7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26340b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f26341c;

    /* renamed from: d, reason: collision with root package name */
    public final List f26342d;

    public i7(String str, int i, Integer num, List list, int i10) {
        num = (i10 & 4) != 0 ? null : num;
        list = (i10 & 8) != 0 ? qe.s.f24023u : list;
        this.f26339a = str;
        this.f26340b = i;
        this.f26341c = num;
        this.f26342d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i7) {
            i7 i7Var = (i7) obj;
            if (this.f26339a.equals(i7Var.f26339a) && this.f26340b == i7Var.f26340b && kotlin.jvm.internal.a(this.f26341c, i7Var.f26341c) && this.f26342d.equals(i7Var.f26342d) && Float.compare(9.0f, 9.0f) == 0 && Float.compare(5.0f, 5.0f) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = a.b(this.f26340b, this.f26339a.hashCode() * 31, 31);
        Integer num = this.f26341c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return Boolean.hashCode(true) + a.a(a.a((this.f26342d.hashCode() + ((b10 + hashCode) * 31)) * 31, 31, 9.0f), 31, 5.0f);
    }

    public final String toString() {
        StringBuilder m4 = a5.a.m("PaperStyle(id=", this.f26339a, ", labelRes=", this.f26340b, ", bgArgb=");
        m4.append(this.f26341c);
        m4.append(", rulings=");
        m4.append(this.f26342d);
        m4.append(", padMm=9.0, gutterMm=5.0, mirrored=true)");
        return m4.toString();
    }
}
