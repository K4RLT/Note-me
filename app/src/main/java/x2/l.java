package x2;
import a.a;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f30061b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f30062c = new l(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f30063d = new l(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f30064a;

    public l(int i) {
        this.f30064a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        if (this.f30064a == ((l) obj).f30064a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30064a;
    }

    public final String toString() {
        int i = this.f30064a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return a.n(new StringBuilder("TextDecoration["), a3.a(arrayList, ", ", null, 62), ']');
    }
}
