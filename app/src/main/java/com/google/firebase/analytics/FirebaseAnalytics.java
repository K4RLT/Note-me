package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.datastore.preferences.protobuf.s1;
import bc.g;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.i1;
import eb.j2;
import ec.c;
import fa.y;
import hd.d;
import hd.e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import wa.h8;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f15586b;

    /* renamed from: a, reason: collision with root package name */
    public final f1 f15587a;

    public FirebaseAnalytics(f1 f1Var) {
        y.h(f1Var);
        this.f15587a = f1Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f15586b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f15586b == null) {
                        f15586b = new FirebaseAnalytics(f1.b(context, null));
                    }
                } finally {
                }
            }
        }
        return f15586b;
    }

    public static j2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        f1 b10 = f1.b(context, bundle);
        if (b10 == null) {
            return null;
        }
        return new c(b10);
    }

    public final String getFirebaseInstanceId() {
        try {
            Object obj = d.f18010m;
            return (String) h8.b(((d) g.c().b(e.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            s1.r(e);
            return null;
        } catch (ExecutionException e8) {
            s1.r(e8.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        f1 f1Var = this.f15587a;
        f1Var.getClass();
        f1Var.e(new i1(f1Var, activity, str, str2));
    }
}
