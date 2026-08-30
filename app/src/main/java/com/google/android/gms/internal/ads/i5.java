package com.google.android.gms.internal.ads;
import a5.a;

/* loaded from: classes.dex */
public final class i5 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6986a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6987b;

    public i5(String str, String str2) {
        this.f6986a = ed1.t(str);
        this.f6987b = str2;
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final void a(j6 j6Var) {
        Integer I;
        Integer I2;
        Integer I3;
        Integer I4;
        String str = this.f6986a;
        int hashCode = str.hashCode();
        String str2 = this.f6987b;
        switch (hashCode) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (I = ct.I(str2)) != null) {
                    j6Var.i = I;
                    return;
                }
                return;
            case -215998278:
                if (str.equals("TOTALDISCS") && (I2 = ct.I(str2)) != null) {
                    j6Var.f7356w = I2;
                    return;
                }
                return;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (I3 = ct.I(str2)) != null) {
                    j6Var.f7342h = I3;
                    return;
                }
                return;
            case 62359119:
                if (str.equals("ALBUM")) {
                    j6Var.f7338c = str2;
                    return;
                }
                return;
            case 67703139:
                if (str.equals("GENRE")) {
                    j6Var.f7357x = str2;
                    return;
                }
                return;
            case 79833656:
                if (str.equals("TITLE")) {
                    j6Var.f7336a = str2;
                    return;
                }
                return;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    j6Var.e = str2;
                    return;
                }
                return;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    j6Var.f7354u = str2;
                    return;
                }
                return;
            case 993300766:
                if (str.equals("DISCNUMBER") && (I4 = ct.I(str2)) != null) {
                    j6Var.f7355v = I4;
                    return;
                }
                return;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    j6Var.f7339d = str2;
                    return;
                }
                return;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    j6Var.f7337b = str2;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i5.class == obj.getClass()) {
            i5 i5Var = (i5) obj;
            if (this.f6986a.equals(i5Var.f6986a) && this.f6987b.equals(i5Var.f6987b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6987b.hashCode() + ((this.f6986a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String str = this.f6986a;
        int length = String.valueOf(str).length();
        String str2 = this.f6987b;
        return a.l(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }
}
