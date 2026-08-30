package com.google.android.gms.internal.ads;
import q.x;
import z5.h;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s21 {

    /* renamed from: c, reason: collision with root package name */
    public static final w91 f10467c = new w91("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f10468d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final bj0 f10469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10470b;

    public s21(Context context) {
        if (v21.a(context)) {
            this.f10469a = new bj0(context.getApplicationContext(), f10467c, f10468d);
        } else {
            this.f10469a = null;
        }
        this.f10470b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = "";
        }
        return str.trim().isEmpty();
    }

    public static boolean c(h hVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        f10467c.d(str, new Object[0]);
        byte b10 = (byte) (((byte) (((byte) (0 | 1)) | 2)) | 1);
        if (b10 != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" statusCode");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" uiMode");
            }
            x.o("Missing required properties:".concat(sb2.toString()));
            return false;
        }
        hVar.t(new p21(8160, null, 0, null));
        return false;
    }

    public final void a(q21 q21Var, h hVar, int i) {
        bj0 bj0Var = this.f10469a;
        if (bj0Var == null) {
            f10467c.d("error: %s", "Play Store not found.");
        } else {
            if (!c(hVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(q21Var.f9720a, q21Var.f9721b))) {
                return;
            }
            bj0Var.a(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(bj0Var, 28, new gz(this, q21Var, i, hVar)));
        }
    }
}
