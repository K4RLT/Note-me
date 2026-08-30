package qb;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.consent_sdk.g7;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h extends c1.a {
    public final /* synthetic */ o5.b A;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Activity f23638w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f23639x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f23640y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ HashMap f23641z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o5.b bVar, pd.c cVar, Activity activity, String str, String str2, HashMap hashMap) {
        super(4, cVar);
        this.f23638w = activity;
        this.f23639x = str;
        this.f23640y = str2;
        this.f23641z = hashMap;
        this.A = bVar;
    }

    @Override // c1.a, qb.a
    public final void K(Bundle bundle) {
        Activity activity = this.f23638w;
        activity.runOnUiThread(new g7(this, activity, this.f23639x, this.f23640y, this.f23641z, 6));
        super.K(bundle);
    }

    @Override // c1.a, qb.a
    public final void N(Bundle bundle) {
        this.f23638w.runOnUiThread(new g(this, 0));
        super.N(bundle);
    }

    @Override // c1.a, qb.a
    public final void W(Bundle bundle) {
        this.f23638w.runOnUiThread(new g(this, 1));
        super.W(bundle);
    }
}
