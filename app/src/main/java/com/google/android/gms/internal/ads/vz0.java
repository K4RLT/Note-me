package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class vz0 extends c01 {

    /* renamed from: f, reason: collision with root package name */
    public final Map f12080f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f12081g;

    /* renamed from: h, reason: collision with root package name */
    public final yx0 f12082h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f12083j;

    public vz0(wd wdVar, pz0 pz0Var, Map map, Context context, yx0 yx0Var, rx0 rx0Var, h21 h21Var) {
        super("+PCjsR8uUrE+ODYObgFJ15LzzbP31PRWxMEYlQ7sSRGBdHPl6GvLcY6T0RM0sryv", "LK6oYs0YHGkrF/9CgiECppIXTefV1s/9lm3/dqGO06I=", wdVar, pz0Var, h21Var.a(113));
        this.f12081g = context;
        this.f12080f = map;
        this.f12082h = yx0Var;
        this.i = rx0Var.X();
        this.f12083j = rx0Var.Y();
    }

    @Override // com.google.android.gms.internal.ads.c01
    public final void a(Method method, wd wdVar) {
        String str;
        je jeVar;
        Object[] objArr = (Object[]) method.invoke("", this.f12081g, Integer.valueOf(this.f12082h.ordinal()));
        objArr.getClass();
        String str2 = "E";
        int i = 1;
        try {
            ac.b bVar = (ac.b) this.f12080f.get("gs");
            if (bVar != null && ((Build.VERSION.SDK_INT < 31 || bVar.isDone()) && (jeVar = (je) bVar.get(this.i, TimeUnit.MILLISECONDS)) != null && jeVar.u0().length() > 1)) {
                str2 = jeVar.u0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str2.equals("E")) {
            try {
                ac.b bVar2 = (ac.b) this.f12080f.get("ai");
                if (bVar2 != null) {
                    String str3 = (String) bVar2.get(this.f12083j, TimeUnit.MILLISECONDS);
                    if (!xy.y(str3)) {
                        str2 = str3;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (wdVar) {
            try {
                Object obj = objArr[4];
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    str = Base64.encodeToString(r61.f10130f.f().g(bArr, bArr.length).getBytes(StandardCharsets.UTF_8), 11);
                } else {
                    str = (String) obj;
                }
                long longValue = ((Long) objArr[0]).longValue();
                wdVar.b();
                ((je) wdVar.f4845v).E(longValue);
                String str4 = (String) objArr[1];
                wdVar.b();
                ((je) wdVar.f4845v).D(str4);
                String str5 = (String) objArr[2];
                wdVar.b();
                ((je) wdVar.f4845v).N(str5);
                String str6 = (String) objArr[3];
                wdVar.b();
                ((je) wdVar.f4845v).O(str6);
                wdVar.b();
                ((je) wdVar.f4845v).z(str);
                wdVar.b();
                ((je) wdVar.f4845v).R0(str2);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    wdVar.b();
                    ((je) wdVar.f4845v).s0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
