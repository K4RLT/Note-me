package p7;
import l.a;
import p.a;

import java.util.List;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f22545a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22546b;

    /* renamed from: c, reason: collision with root package name */
    public final List f22547c;

    public o0(int i, String str, List list) {
        list.getClass();
        this.f22545a = str;
        this.f22546b = i;
        this.f22547c = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (!this.f22545a.equals(o0Var.f22545a) || this.f22546b != o0Var.f22546b || !kotlin.jvm.internal.a(this.f22547c, o0Var.f22547c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22547c.hashCode() + a.b(this.f22546b, this.f22545a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder m4 = a5.a.m("MagicPalette(id=", this.f22545a, ", displayNameRes=", this.f22546b, ", colors=");
        m4.append(this.f22547c);
        m4.append(")");
        return m4.toString();
    }
}
