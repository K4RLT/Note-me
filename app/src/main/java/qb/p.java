package qb;
import b.a;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class p implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f23665a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f23666b;

    /* JADX WARN: Type inference failed for: r1v0, types: [qb.j, java.lang.Object] */
    public p(Intent intent, Activity activity) {
        this.f23666b = activity;
        if (za.a(activity)) {
            this.f23665a = new l(activity.getApplicationContext(), "HpoaService", intent, new Object());
        } else {
            this.f23665a = null;
        }
    }
}
