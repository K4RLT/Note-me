package g0;

import android.R;
import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class n1 {
    public static final /* synthetic */ n1[] A;

    /* renamed from: v, reason: collision with root package name */
    public static final n1 f17222v;

    /* renamed from: w, reason: collision with root package name */
    public static final n1 f17223w;

    /* renamed from: x, reason: collision with root package name */
    public static final n1 f17224x;

    /* renamed from: y, reason: collision with root package name */
    public static final n1 f17225y;

    /* renamed from: z, reason: collision with root package name */
    public static final n1 f17226z;

    /* renamed from: u, reason: collision with root package name */
    public final int f17227u;

    static {
        int i;
        n1 n1Var = new n1("Cut", 0, R.string.cut);
        f17222v = n1Var;
        n1 n1Var2 = new n1("Copy", 1, R.string.copy);
        f17223w = n1Var2;
        n1 n1Var3 = new n1("Paste", 2, R.string.paste);
        f17224x = n1Var3;
        n1 n1Var4 = new n1("SelectAll", 3, R.string.selectAll);
        f17225y = n1Var4;
        if (Build.VERSION.SDK_INT <= 26) {
            i = com.daren.scraply.R.string.autofill;
        } else {
            i = R.string.autofill;
        }
        n1 n1Var5 = new n1("Autofill", 4, i);
        f17226z = n1Var5;
        A = new n1[]{n1Var, n1Var2, n1Var3, n1Var4, n1Var5};
    }

    public n1(String str, int i, int i10) {
        this.f17227u = i10;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) A.clone();
    }
}
