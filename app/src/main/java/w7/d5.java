package w7;
import l7.b;
import p.a;

import java.util.List;

/* loaded from: classes.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final b f28080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28081b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28082c;

    /* renamed from: d, reason: collision with root package name */
    public final List f28083d;

    public d5(b bVar, String str, float f10, List list) {
        bVar.getClass();
        list.getClass();
        this.f28080a = bVar;
        this.f28081b = str;
        this.f28082c = f10;
        this.f28083d = list;
    }

    public final boolean a() {
        if (this.f28080a == b.REMOTE) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        if (this.f28080a == d5Var.f28080a && kotlin.jvm.internal.l.a(this.f28081b, d5Var.f28081b) && Float.compare(this.f28082c, d5Var.f28082c) == 0 && kotlin.jvm.internal.l.a(this.f28083d, d5Var.f28083d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f28080a.hashCode() * 31;
        String str = this.f28081b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f28083d.hashCode() + a.a((hashCode2 + hashCode) * 31, 31, this.f28082c);
    }

    public final String toString() {
        return "FrameSpec(shape=" + this.f28080a + ", artPath=" + this.f28081b + ", aspect=" + this.f28082c + ", holes=" + this.f28083d + ")";
    }
}
