package n2;

import android.text.Layout;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f21124a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f21125b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (l.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (l.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f21124a = alignment;
        f21125b = alignment2;
    }
}
