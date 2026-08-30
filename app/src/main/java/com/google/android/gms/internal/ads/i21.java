package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class i21 {

    /* renamed from: a, reason: collision with root package name */
    public static final ClipData f6969a = ClipData.newIntent("", new Intent());

    public static Intent a(Intent intent, int i) {
        boolean z3;
        boolean b10 = b(0, 17);
        boolean b11 = b(0, 9);
        boolean b12 = b(0, 5);
        boolean b13 = b(0, 3);
        if (intent.getComponent() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.w("Must set component on Intent.", z3);
        if (b(0, 1)) {
            b80.w("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i, 67108864));
        } else {
            b80.w("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", b(i, 67108864));
        }
        Intent intent2 = new Intent(intent);
        if (!b(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b13 && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b11 && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b12 && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b10 && intent2.getClipData() == null) {
                intent2.setClipData(f6969a);
            }
        }
        return intent2;
    }

    public static boolean b(int i, int i10) {
        return (i & i10) == i10;
    }
}
