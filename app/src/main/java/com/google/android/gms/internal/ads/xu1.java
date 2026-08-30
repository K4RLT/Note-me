package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class xu1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f12629a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f12630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pu f12631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu1(pu puVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f12631c = puVar;
        this.f12629a = contentResolver;
        this.f12630b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        this.f12631c.l();
    }
}
