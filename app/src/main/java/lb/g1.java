package lb;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final c7.a f20146c = new c7.a("PackageStateCache", 5);

    /* renamed from: a, reason: collision with root package name */
    public final Context f20147a;

    /* renamed from: b, reason: collision with root package name */
    public int f20148b = -1;

    public g1(Context context) {
        this.f20147a = context;
    }

    public final synchronized int a() {
        if (this.f20148b == -1) {
            try {
                this.f20148b = this.f20147a.getPackageManager().getPackageInfo(this.f20147a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f20146c.c("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f20148b;
    }
}
