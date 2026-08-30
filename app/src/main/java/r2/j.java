package r2;
import k.a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    public static final j f24491g = new j(false, 0, true, 1, 1, t2.b.f25637w);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24493b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24494c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24495d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final t2.b f24496f;

    public j(boolean z3, int i, boolean z9, int i10, int i11, t2.b bVar) {
        this.f24492a = z3;
        this.f24493b = i;
        this.f24494c = z9;
        this.f24495d = i10;
        this.e = i11;
        this.f24496f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (this.f24492a == jVar.f24492a && this.f24493b == jVar.f24493b && this.f24494c == jVar.f24494c && this.f24495d == jVar.f24495d && this.e == jVar.e && kotlin.jvm.internal.a(this.f24496f, jVar.f24496f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f24496f.f25638u.hashCode() + a.b(this.e, a.b(this.f24495d, a.c(a.b(this.f24493b, Boolean.hashCode(this.f24492a) * 31, 31), 31, this.f24494c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f24492a + ", capitalization=" + ((Object) a(this.f24493b)) + ", autoCorrect=" + this.f24494c + ", keyboardType=" + ((Object) a(this.f24495d)) + ", imeAction=" + ((Object) i.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f24496f + ')';
    }
}
