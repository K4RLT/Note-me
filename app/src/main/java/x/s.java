package x;
import a.a;
import y.a;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f29999a = new Object();

    public static d1.r a() {
        if (1.0f <= 0.0d) {
            a.a("invalid weight; must be greater than zero");
        }
        return new LayoutWeightElement(1.0f, true);
    }
}
