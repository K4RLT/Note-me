package g0;
import k.a;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final d1 f17042d = new d1(0, 0, 127);

    /* renamed from: a, reason: collision with root package name */
    public final int f17043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17045c;

    public d1(int i, int i10, int i11) {
        int i12;
        if ((i11 & 1) != 0) {
            i12 = -1;
        } else {
            i12 = 3;
        }
        i = (i11 & 4) != 0 ? 0 : i;
        i10 = (i11 & 8) != 0 ? -1 : i10;
        this.f17043a = i12;
        this.f17044b = i;
        this.f17045c = i10;
    }

    public final r2.j a(boolean z3) {
        int i;
        r2.i iVar;
        int i10;
        int i11;
        int i12 = this.f17043a;
        r2.k kVar = new r2.k(i12);
        if (i12 == -1) {
            kVar = null;
        }
        if (kVar != null) {
            i = kVar.f24497a;
        } else {
            i = 0;
        }
        int i13 = i;
        int i14 = this.f17044b;
        r2.l lVar = new r2.l(i14);
        if (i14 == 0) {
            lVar = null;
            iVar = null;
        } else {
            iVar = null;
        }
        if (lVar != null) {
            i10 = lVar.f24498a;
        } else {
            i10 = 1;
        }
        int i15 = this.f17045c;
        r2.i iVar2 = new r2.i(i15);
        if (i15 != -1) {
            iVar = iVar2;
        }
        if (iVar != null) {
            i11 = iVar.f24490a;
        } else {
            i11 = 1;
        }
        return new r2.j(z3, i13, true, i10, i11, t2.b.f25637w);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d1) {
                d1 d1Var = (d1) obj;
                if (this.f17043a == d1Var.f17043a && this.f17044b == d1Var.f17044b && this.f17045c == d1Var.f17045c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return a.b(this.f17045c, a.b(this.f17044b, Integer.hashCode(this.f17043a) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) r2.a(this.f17043a)) + ", autoCorrectEnabled=null, keyboardType=" + ((Object) r2.a(this.f17044b)) + ", imeAction=" + ((Object) r2.i.a(this.f17045c)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
