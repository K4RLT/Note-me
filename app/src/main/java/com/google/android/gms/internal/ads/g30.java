package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class g30 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6280a;

    /* renamed from: b, reason: collision with root package name */
    public final k9.c0 f6281b;

    /* renamed from: c, reason: collision with root package name */
    public final ci0 f6282c;

    /* renamed from: d, reason: collision with root package name */
    public final jd0 f6283d;
    public final wx e;

    /* renamed from: f, reason: collision with root package name */
    public final wx f6284f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f6285g;

    public g30(Context context, k9.c0 c0Var, ci0 ci0Var, jd0 jd0Var, wx wxVar, wx wxVar2, ScheduledExecutorService scheduledExecutorService) {
        this.f6280a = context;
        this.f6281b = c0Var;
        this.f6282c = ci0Var;
        this.f6283d = jd0Var;
        this.e = wxVar;
        this.f6284f = wxVar2;
        this.f6285g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) g9.r.e.f17698c.a(sl.Cb));
    }

    public final ac.b a(String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return ed1.e(str);
        }
        return ed1.U(c(str, this.f6283d.f7421a, random), Throwable.class, new kp(this, str, 1), this.e);
    }

    public final ac.b c(String str, MotionEvent motionEvent, Random random) {
        Exception exc;
        ac.b A;
        try {
            nl nlVar = sl.Cb;
            g9.r rVar = g9.r.e;
            ql qlVar = rVar.f17698c;
            ql qlVar2 = rVar.f17698c;
            try {
                if (str.contains((CharSequence) qlVar.a(nlVar)) && !this.f6281b.t()) {
                    Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                    buildUpon.appendQueryParameter((String) qlVar2.a(sl.Db), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
                    if (motionEvent == null) {
                        try {
                            buildUpon.appendQueryParameter((String) qlVar2.a(sl.Eb), "11");
                            return ed1.e(buildUpon.toString());
                        } catch (Exception e) {
                            exc = e;
                            return ed1.A(exc);
                        }
                    }
                    ci0 ci0Var = this.f6282c;
                    ci0Var.getClass();
                    try {
                        b5.b b10 = b5.b.b(ci0Var.f5092b);
                        ci0Var.f5091a = b10;
                        if (b10 == null) {
                            A = ed1.A(new IllegalStateException("MeasurementManagerFutures is null"));
                        } else {
                            A = b10.c();
                        }
                    } catch (Exception e8) {
                        A = ed1.A(e8);
                    }
                    return ed1.U(ed1.c0(q81.t(A), new lr(1, this, buildUpon, motionEvent, str), this.f6284f), Throwable.class, new mr(this, 2, buildUpon), this.e);
                }
                return ed1.e(str);
            } catch (Exception e10) {
                e = e10;
                exc = e;
                return ed1.A(exc);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
