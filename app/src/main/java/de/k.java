package de;
import j.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.yh0;
import java.util.UUID;
import va.t;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final ic.a f15850b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15851a;

    static {
        yh0 b10 = ic.a.b(k.class);
        b10.a(ic.b(f.class));
        b10.a(ic.b(Context.class));
        b10.f12883z = new t(12);
        f15850b = b10.b();
    }

    public k(Context context) {
        this.f15851a = context;
    }

    public final synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    public final SharedPreferences b() {
        return this.f15851a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
