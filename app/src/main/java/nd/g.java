package nd;
import v.a;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import n.r0;
import wa.h8;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21250c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static y f21251d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f21252a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21253b;

    public g(ExecutorService executorService) {
        this.f21253b = new r0(0);
        this.f21252a = executorService;
    }

    public static ib.o a(Context context, Intent intent, boolean z3) {
        y yVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f21250c) {
            try {
                if (f21251d == null) {
                    f21251d = new y(context);
                }
                yVar = f21251d;
            } finally {
            }
        }
        if (z3) {
            if (o.j().l(context)) {
                synchronized (v.f21301a) {
                    try {
                        a(context);
                        boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                        if (!booleanExtra) {
                            v.f21302b.a();
                        }
                        yVar.b(intent).b(new b1.h(14, intent));
                    } finally {
                    }
                }
            } else {
                yVar.b(intent);
            }
            return h8.e(-1);
        }
        return yVar.b(intent).g(new d5.c(0), new l4.a(19));
    }

    public ib.o b(Intent intent) {
        boolean z3;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z9 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f21252a;
        d5.c cVar = (d5.c) this.f21253b;
        if (la.b.h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z9 = true;
        }
        if (z3 && !z9) {
            return a(context, intent, z9);
        }
        return h8.c(new e(context, 0, intent), cVar).h(cVar, new f(context, intent, z9));
    }

    public g(Context context) {
        this.f21252a = context;
        this.f21253b = new d5.c(0);
    }
}
