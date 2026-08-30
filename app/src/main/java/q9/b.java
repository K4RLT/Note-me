package q9;

import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.ko;
import k6.i;
import z8.m;

/* loaded from: classes.dex */
public final class b extends FrameLayout {

    /* renamed from: u, reason: collision with root package name */
    public boolean f23606u;

    /* renamed from: v, reason: collision with root package name */
    public i f23607v;

    /* renamed from: w, reason: collision with root package name */
    public ImageView.ScaleType f23608w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23609x;

    /* renamed from: y, reason: collision with root package name */
    public ic.c f23610y;

    public m getMediaContent() {
        return null;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f23609x = true;
        this.f23608w = scaleType;
        ic.c cVar = this.f23610y;
        if (cVar != null) {
            cVar.F(scaleType);
        }
    }

    public void setMediaContent(m mVar) {
        boolean n02;
        this.f23606u = true;
        i iVar = this.f23607v;
        if (iVar != null) {
            iVar.A();
        }
        if (mVar != null) {
            try {
                ko zzb = mVar.zzb();
                if (zzb != null) {
                    if (mVar.a()) {
                        n02 = zzb.h2(new oa.b(this));
                    } else {
                        if (mVar.zza()) {
                            n02 = zzb.n0(new oa.b(this));
                        }
                        removeAllViews();
                    }
                    if (n02) {
                        return;
                    }
                    removeAllViews();
                }
            } catch (RemoteException e) {
                removeAllViews();
                l9.i.d("", e);
            }
        }
    }
}
