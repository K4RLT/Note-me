package com.google.android.gms.internal.ads;
import a5.a;
import g3.a;
import p.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mk1 {

    /* renamed from: h, reason: collision with root package name */
    public static final mk1 f8362h;

    /* renamed from: a, reason: collision with root package name */
    public final int f8363a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8364b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8365c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8366d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8367f;

    /* renamed from: g, reason: collision with root package name */
    public int f8368g;

    static {
        int i = -1;
        f8362h = new mk1(1, 2, 3, null, i, i);
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ mk1(int i, int i10, int i11, byte[] bArr, int i12, int i13) {
        this.f8363a = i;
        this.f8364b = i10;
        this.f8365c = i11;
        this.f8366d = bArr;
        this.e = i12;
        this.f8367f = i13;
    }

    public static boolean a(mk1 mk1Var) {
        if (mk1Var == null) {
            return true;
        }
        int i = mk1Var.f8363a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i10 = mk1Var.f8364b;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = mk1Var.f8365c;
        if ((i11 != -1 && i11 != 3) || mk1Var.f8366d != null) {
            return false;
        }
        int i12 = mk1Var.f8367f;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = mk1Var.e;
        return i13 == -1 || i13 == 8;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String e(int i) {
        if (i != -1) {
            if (i != 6) {
                if (i != 1) {
                    if (i != 2) {
                        return a.f(i, "Undefined color space ", new StringBuilder(String.valueOf(i).length() + 22));
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String f(int i) {
        if (i != -1) {
            if (i != 10) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i != 7) {
                                    return a.f(i, "Undefined color transfer ", new StringBuilder(String.valueOf(i).length() + 25));
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static String g(int i) {
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return a.f(i, "Undefined color range ", new StringBuilder(String.valueOf(i).length() + 22));
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public final boolean d() {
        return (this.f8363a == -1 || this.f8364b == -1 || this.f8365c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mk1.class == obj.getClass()) {
            mk1 mk1Var = (mk1) obj;
            if (this.f8363a == mk1Var.f8363a && this.f8364b == mk1Var.f8364b && this.f8365c == mk1Var.f8365c && Arrays.equals(this.f8366d, mk1Var.f8366d) && this.e == mk1Var.e && this.f8367f == mk1Var.f8367f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f8368g;
        if (i == 0) {
            int hashCode = ((((Arrays.hashCode(this.f8366d) + ((((((this.f8363a + 527) * 31) + this.f8364b) * 31) + this.f8365c) * 31)) * 31) + this.e) * 31) + this.f8367f;
            this.f8368g = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        String str;
        boolean z3;
        String e = e(this.f8363a);
        String g8 = g(this.f8364b);
        String f10 = f(this.f8365c);
        String str2 = "NA";
        int i = this.e;
        if (i == -1) {
            str = "NA";
        } else {
            str = a.j(i, "bit Luma", new StringBuilder(String.valueOf(i).length() + 8));
        }
        int i10 = this.f8367f;
        if (i10 != -1) {
            str2 = a.j(i10, "bit Chroma", new StringBuilder(String.valueOf(i10).length() + 10));
        }
        if (this.f8366d != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder sb2 = new StringBuilder(a.v(str2, a.v(str, a.v(String.valueOf(z3), a.v(g8, e.length() + 12, 2) + f10.length() + 2, 2), 2), 1));
        sb2.append("ColorInfo(");
        sb2.append(e);
        sb2.append(", ");
        sb2.append(g8);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append(", ");
        sb2.append(z3);
        a.t(sb2, ", ", str, ", ", str2);
        sb2.append(")");
        return sb2.toString();
    }
}
