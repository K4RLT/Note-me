package x2;
import f.b;
import p.a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f30054c = new i(17, f.f30050c);

    /* renamed from: a, reason: collision with root package name */
    public final float f30055a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30056b;

    public i(int i, float f10) {
        this.f30055a = f10;
        this.f30056b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            float f10 = iVar.f30055a;
            float f11 = f.f30049b;
            if (Float.compare(this.f30055a, f10) == 0 && this.f30056b == iVar.f30056b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        float f10 = f.f30049b;
        return Integer.hashCode(0) + a.b(this.f30056b, Float.hashCode(this.f30055a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) b(this.f30055a));
        sb2.append(", trim=");
        int i = this.f30056b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i == 0) {
            str = "LineHeightStyle.Trim.None";
        } else {
            str = "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(",mode=Mode(value=0))");
        return sb2.toString();
    }
}
