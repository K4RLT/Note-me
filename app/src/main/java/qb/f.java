package qb;

import android.app.Activity;
import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f extends c1.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Activity f23632w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f23633x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f23634y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ HashMap f23635z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o5.b bVar, pd.c cVar, Activity activity, String str, String str2, HashMap hashMap) {
        super(4, cVar);
        this.f23632w = activity;
        this.f23633x = str;
        this.f23634y = str2;
        this.f23635z = hashMap;
    }

    @Override // c1.a, qb.a
    public final void K(Bundle bundle) {
        Activity activity = this.f23632w;
        activity.runOnUiThread(new b9.a(activity, this.f23633x, this.f23634y, this.f23635z, 11));
        super.K(bundle);
    }
}
