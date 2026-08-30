package q9;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.sl;
import g9.m;
import g9.n;
import g9.p;
import g9.r;
import l9.i;

/* loaded from: classes.dex */
public final class e extends FrameLayout {

    /* renamed from: u, reason: collision with root package name */
    public final FrameLayout f23618u;

    /* renamed from: v, reason: collision with root package name */
    public final eo f23619v;

    public e(Context context) {
        super(context);
        eo eoVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f23618u = frameLayout;
        if (isInEditMode()) {
            eoVar = null;
        } else {
            n nVar = p.f17688g.f17690b;
            Context context2 = frameLayout.getContext();
            nVar.getClass();
            eoVar = (eo) new m(nVar, this, frameLayout, context2).d(context2, false);
        }
        this.f23619v = eoVar;
    }

    public final View a(String str) {
        eo eoVar = this.f23619v;
        if (eoVar != null) {
            try {
                oa.a t3 = eoVar.t(str);
                if (t3 != null) {
                    return (View) oa.b.z1(t3);
                }
            } catch (RemoteException e) {
                i.d("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f23618u);
    }

    public final void b(String str, View view) {
        eo eoVar = this.f23619v;
        if (eoVar == null) {
            return;
        }
        try {
            eoVar.A1(new oa.b(view), str);
        } catch (RemoteException e) {
            i.d("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f23618u;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eo eoVar = this.f23619v;
        if (eoVar != null) {
            if (((Boolean) r.e.f17698c.a(sl.Xc)).booleanValue()) {
                try {
                    eoVar.n2(new oa.b(motionEvent));
                } catch (RemoteException e) {
                    i.d("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View a10 = a("3010");
        if (a10 instanceof b) {
            return (b) a10;
        }
        if (a10 != null) {
            i.a("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        eo eoVar = this.f23619v;
        if (eoVar == null) {
            return;
        }
        try {
            eoVar.S0(new oa.b(view), i);
        } catch (RemoteException e) {
            i.d("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f23618u);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f23618u == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        b("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        b("3005", view);
    }

    public final void setBodyView(View view) {
        b("3004", view);
    }

    public final void setCallToActionView(View view) {
        b("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        eo eoVar = this.f23619v;
        if (eoVar == null) {
            return;
        }
        try {
            eoVar.m3(new oa.b(view));
        } catch (RemoteException e) {
            i.d("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        b("3001", view);
    }

    public final void setIconView(View view) {
        b("3003", view);
    }

    public final void setImageView(View view) {
        b("3008", view);
    }

    public final void setMediaView(b bVar) {
        b("3010", bVar);
        if (bVar == null) {
            return;
        }
        k6.i iVar = new k6.i(22, this);
        synchronized (bVar) {
            bVar.f23607v = iVar;
            if (bVar.f23606u) {
                iVar.A();
            }
        }
        ic.c cVar = new ic.c(24, this);
        synchronized (bVar) {
            bVar.f23610y = cVar;
            if (bVar.f23609x) {
                cVar.F(bVar.f23608w);
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        eo eoVar = this.f23619v;
        if (eoVar == null) {
            return;
        }
        try {
            eoVar.U3(nativeAd.d());
        } catch (RemoteException e) {
            i.d("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        b("3007", view);
    }

    public final void setStarRatingView(View view) {
        b("3009", view);
    }

    public final void setStoreView(View view) {
        b("3006", view);
    }
}
