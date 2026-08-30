package m;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.customtabs.ICustomTabsCallback;
import com.google.android.gms.internal.ads.iv1;

/* loaded from: classes.dex */
public final class e extends ICustomTabsCallback.Stub {

    /* renamed from: u, reason: collision with root package name */
    public final Handler f20410u = new Handler(Looper.getMainLooper());

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a f20411v;

    public e(a aVar) {
        this.f20411v = aVar;
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void extraCallback(String str, Bundle bundle) {
        if (this.f20411v == null) {
            return;
        }
        this.f20410u.post(new c(this, str, bundle, 0));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        a aVar = this.f20411v;
        if (aVar == null) {
            return null;
        }
        return aVar.b(str, bundle);
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onActivityLayout(int i, int i10, int i11, int i12, int i13, Bundle bundle) {
        if (this.f20411v == null) {
            return;
        }
        this.f20410u.post(new b(this, i, i10, i11, i12, i13, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onActivityResized(int i, int i10, Bundle bundle) {
        if (this.f20411v == null) {
            return;
        }
        this.f20410u.post(new i6.b(this, i, i10, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle) {
        if (this.f20411v == null) {
            return;
        }
        this.f20410u.post(new iv1(22, this, bundle, false));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onMinimized(Bundle bundle) {
        if (this.f20411v == null) {
            return;
        }
        this.f20410u.post(new b(this, bundle, 3));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        if (this.f20411v == null) {
            return;
        }
        this.f20410u.post(new d6.i(this, i, bundle, 4));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onPostMessage(String str, Bundle bundle) {
        if (this.f20411v == null) {
            return;
        }
        this.f20410u.post(new c(this, str, bundle, 1));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z3, Bundle bundle) {
        if (this.f20411v == null) {
            return;
        }
        this.f20410u.post(new d(this, i, uri, z3, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onUnminimized(Bundle bundle) {
        if (this.f20411v == null) {
            return;
        }
        this.f20410u.post(new b(this, bundle, 0));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onWarmupCompleted(Bundle bundle) {
        if (this.f20411v == null) {
            return;
        }
        this.f20410u.post(new b(this, bundle, 1));
    }
}
