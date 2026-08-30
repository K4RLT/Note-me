package com.google.android.gms.internal.consent_sdk;
import c7.a;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l1 extends Exception {
    public l1(int i, String str) {
        super(str);
    }

    public final c7.a a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new c7.a(13, super.getMessage(), false);
    }

    public l1(int i, String str, IOException iOException) {
        super(str, iOException);
    }
}
