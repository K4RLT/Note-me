package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13381a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f13382b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f13383c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f13384d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f13385f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f13386g = new AtomicReference();

    public d(Application application) {
        this.f13381a = application.getApplicationContext();
    }
}
