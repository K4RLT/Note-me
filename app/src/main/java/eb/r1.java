package eb;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16345a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16346b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16347c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16348d;
    public final Boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16349f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.a1 f16350g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16351h;
    public final Long i;

    /* renamed from: j, reason: collision with root package name */
    public final String f16352j;

    public r1(Context context, com.google.android.gms.internal.measurement.a1 a1Var, Long l10) {
        this.f16351h = true;
        fa.y.h(context);
        Context applicationContext = context.getApplicationContext();
        fa.y.h(applicationContext);
        this.f16345a = applicationContext;
        this.i = l10;
        if (a1Var != null) {
            this.f16350g = a1Var;
            this.f16346b = a1Var.f13628z;
            this.f16347c = a1Var.f13627y;
            this.f16348d = a1Var.f13626x;
            this.f16351h = a1Var.f13625w;
            this.f16349f = a1Var.f13624v;
            this.f16352j = a1Var.B;
            Bundle bundle = a1Var.A;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
