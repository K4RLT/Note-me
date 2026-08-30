package com.google.android.gms.internal.ads;
import k9.a0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* loaded from: classes.dex */
public final class d10 extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public Activity f5247a;

    /* renamed from: b, reason: collision with root package name */
    public Context f5248b;

    /* renamed from: c, reason: collision with root package name */
    public Context f5249c;

    public final void a(Intent intent) {
        if (this.f5247a != null) {
            String valueOf = String.valueOf(intent.getData());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 63);
            sb2.append("Starting activity for result with intent: ");
            sb2.append(valueOf);
            sb2.append(" and requestCode: 236");
            a0.k(sb2.toString());
            this.f5247a.startActivityForResult(intent, 236);
            return;
        }
        intent.setFlags(268435456);
        this.f5248b.startActivity(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f5249c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Activity activity;
        Context applicationContext = context.getApplicationContext();
        this.f5248b = applicationContext;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.f5247a = activity;
        this.f5249c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f5247a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f5248b.startActivity(intent);
        }
    }
}
