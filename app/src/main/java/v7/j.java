package v7;

import wa.b9;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final jf.d f27439a = b9.i(0, 6);

    public static final String a(int i) {
        String str;
        int i10 = i / 2;
        if (i % 2 == 0) {
            str = "highlighter";
        } else {
            str = "main";
        }
        if (i10 == 0) {
            return str;
        }
        return str + (i10 + 1);
    }
}
