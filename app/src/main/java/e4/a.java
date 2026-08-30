package e4;

import android.text.Editable;
import c4.y;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15901a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f15902b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f15903c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f15903c;
        if (cls != null) {
            return new y(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
