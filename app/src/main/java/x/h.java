package x;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f29961a = new q0(4);

    /* renamed from: b, reason: collision with root package name */
    public static final c f29962b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.android.filament.g f29963c = new com.google.android.filament.g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.android.filament.g f29964d = new com.google.android.filament.g(4);
    public static final com.google.android.filament.g e = new com.google.android.filament.g(3);

    static {
        new com.google.android.filament.g(2);
    }

    public static com.google.android.filament.g a() {
        return f29963c;
    }

    public static com.google.android.filament.g b() {
        return e;
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float f10 = (i - i11) / 2;
        if (!z3) {
            int length = iArr.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f10);
                f10 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i15 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i15;
            } else {
                return;
            }
        }
    }

    public static void d(int[] iArr, int[] iArr2, boolean z3) {
        int i = 0;
        if (!z3) {
            int length = iArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i < length) {
                int i12 = iArr[i];
                iArr2[i10] = i11;
                i11 += i12;
                i++;
                i10++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i13 = iArr[length2];
                iArr2[length2] = i;
                i += i13;
            } else {
                return;
            }
        }
    }

    public static void e(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        int i13 = i - i11;
        if (!z3) {
            int length = iArr.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = iArr[i10];
                iArr2[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i16 = iArr[length2];
                iArr2[length2] = i13;
                i13 += i16;
            } else {
                return;
            }
        }
    }

    public static void f(int i, int[] iArr, int[] iArr2, boolean z3) {
        float length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        if (iArr.length == 0) {
            length = 0.0f;
        } else {
            length = (i - i11) / iArr.length;
        }
        float f10 = length / 2;
        if (!z3) {
            int length2 = iArr.length;
            int i13 = 0;
            while (i10 < length2) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f10);
                f10 += i14 + length;
                i10++;
                i13++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 < length3) {
                int i15 = iArr[length3];
                iArr2[length3] = Math.round(f10);
                f10 += i15 + length;
            } else {
                return;
            }
        }
    }

    public static void g(int i, int[] iArr, int[] iArr2, boolean z3) {
        float f10;
        if (iArr.length != 0) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 : iArr) {
                i11 += i12;
            }
            float max = (i - i11) / Math.max(iArr.length - 1, 1);
            if (z3 && iArr.length == 1) {
                f10 = max;
            } else {
                f10 = 0.0f;
            }
            if (!z3) {
                int length = iArr.length;
                int i13 = 0;
                while (i10 < length) {
                    int i14 = iArr[i10];
                    iArr2[i13] = Math.round(f10);
                    f10 += i14 + max;
                    i10++;
                    i13++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i15 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i15 + max;
            }
        }
    }

    public static void h(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float length = (i - i11) / (iArr.length + 1);
        if (!z3) {
            int length2 = iArr.length;
            float f10 = length;
            int i13 = 0;
            while (i10 < length2) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f10);
                f10 += i14 + length;
                i10++;
                i13++;
            }
            return;
        }
        float f11 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i15 = iArr[length3];
            iArr2[length3] = Math.round(f11);
            f11 += i15 + length;
        }
    }

    public static e i(float f10) {
        return new e(f10, true, g.f29959v);
    }
}
