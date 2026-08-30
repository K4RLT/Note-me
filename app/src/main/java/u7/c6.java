package u7;
import l.a;
import o7.b;
import p.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26022a;

    /* renamed from: b, reason: collision with root package name */
    public final b f26023b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26024c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f26025d;

    public c6(int i, b bVar, boolean z3, ArrayList arrayList) {
        bVar.getClass();
        this.f26022a = i;
        this.f26023b = bVar;
        this.f26024c = z3;
        this.f26025d = arrayList;
    }

    public final int a() {
        return this.f26022a;
    }

    public final List b() {
        return this.f26025d;
    }

    public final b c() {
        return this.f26023b;
    }

    public final boolean d() {
        return this.f26024c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c6) {
                c6 c6Var = (c6) obj;
                if (this.f26022a != c6Var.f26022a || !kotlin.jvm.internal.a(this.f26023b, c6Var.f26023b) || this.f26024c != c6Var.f26024c || !this.f26025d.equals(c6Var.f26025d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f26025d.hashCode() + a.c((this.f26023b.hashCode() + (Integer.hashCode(this.f26022a) * 31)) * 31, 31, this.f26024c);
    }

    public final String toString() {
        return "FrameState(activeBook=" + this.f26022a + ", collection=" + this.f26023b + ", sceneReady=" + this.f26024c + ", bookIds=" + this.f26025d + ")";
    }
}
