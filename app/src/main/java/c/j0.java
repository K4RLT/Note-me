package c;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public static final j0 f3243u = new kotlin.jvm.internal.m(1);

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        Resources resources = (Resources) obj;
        resources.getClass();
        if ((resources.getConfiguration().uiMode & 48) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
