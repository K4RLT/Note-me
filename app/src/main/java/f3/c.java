package f3;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f16652a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f16653b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16654c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16655d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f16656f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f16657g;

    public c(String str, PendingIntent pendingIntent) {
        IconCompat b10 = IconCompat.b(2131230810);
        Bundle bundle = new Bundle();
        this.f16655d = true;
        this.f16653b = b10;
        if (b10 != null && b10.d() == 2) {
            this.e = b10.c();
        }
        this.f16656f = i.b(str);
        this.f16657g = pendingIntent;
        this.f16652a = bundle;
        this.f16654c = true;
        this.f16655d = true;
    }
}
