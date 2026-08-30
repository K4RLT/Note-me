package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class eb0 implements View.OnClickListener {
    public WeakReference A;

    /* renamed from: u, reason: collision with root package name */
    public final rc0 f5634u;

    /* renamed from: v, reason: collision with root package name */
    public final la.a f5635v;

    /* renamed from: w, reason: collision with root package name */
    public vo f5636w;

    /* renamed from: x, reason: collision with root package name */
    public jp f5637x;

    /* renamed from: y, reason: collision with root package name */
    public String f5638y;

    /* renamed from: z, reason: collision with root package name */
    public Long f5639z;

    public eb0(rc0 rc0Var, la.a aVar) {
        this.f5634u = rc0Var;
        this.f5635v = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.A;
        if (weakReference != null && weakReference.get() == view) {
            if (this.f5638y != null && this.f5639z != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(FacebookMediationAdapter.KEY_ID, this.f5638y);
                this.f5635v.getClass();
                hashMap.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f5639z.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f5634u.d(hashMap);
            }
            this.f5638y = null;
            this.f5639z = null;
            WeakReference weakReference2 = this.A;
            if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null) {
                view2.setClickable(false);
                view2.setOnClickListener(null);
                this.A = null;
            }
        }
    }
}
