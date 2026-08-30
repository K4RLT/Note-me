package m;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20405u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Uri f20406v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f20407w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Bundle f20408x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f20409y;

    public d(e eVar, int i, Uri uri, boolean z3, Bundle bundle) {
        this.f20409y = eVar;
        this.f20405u = i;
        this.f20406v = uri;
        this.f20407w = z3;
        this.f20408x = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20409y.f20411v.g(this.f20405u, this.f20406v, this.f20407w, this.f20408x);
    }
}
