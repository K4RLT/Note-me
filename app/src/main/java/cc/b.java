package cc;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f4073g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f4074h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f4075a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4076b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4077c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f4078d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4079f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f4075a = str;
        this.f4076b = str2;
        this.f4077c = str3;
        this.f4078d = date;
        this.e = j10;
        this.f4079f = j11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, fc.a] */
    public final fc.a a() {
        Object obj = new Object();
        obj.f16935a = "frc";
        obj.f16945m = this.f4078d.getTime();
        obj.f16936b = this.f4075a;
        obj.f16937c = this.f4076b;
        String str = this.f4077c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        obj.f16938d = str;
        obj.e = this.e;
        obj.f16942j = this.f4079f;
        return obj;
    }
}