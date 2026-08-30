package nd;
import n.e;
import s.g;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import b0.g1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n.r0;
import wa.h8;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21286a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f21287b;

    /* renamed from: c, reason: collision with root package name */
    public final g9.n f21288c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f21289d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f21290f;

    /* renamed from: h, reason: collision with root package name */
    public final q f21292h;
    public final e e = new r0(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f21291g = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [e, r0] */
    public s(FirebaseMessaging firebaseMessaging, g1 g1Var, q qVar, g9.n nVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f21289d = firebaseMessaging;
        this.f21287b = g1Var;
        this.f21292h = qVar;
        this.f21288c = nVar;
        this.f21286a = context;
        this.f21290f = scheduledThreadPoolExecutor;
    }

    public static void a(ib.o oVar) {
        try {
            h8.b(oVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e8);
            }
            throw ((IOException) cause);
        }
    }

    public final void b(String str) {
        String a10 = this.f21289d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        g9.n nVar = this.f21288c;
        a(nVar.o(nVar.x(a10, bundle, "/topics/" + str)));
    }

    public final void c(String str) {
        String a10 = this.f21289d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        g9.n nVar = this.f21288c;
        a(nVar.o(nVar.x(a10, bundle, "/topics/" + str)));
    }

    public final ib.o d(p pVar) {
        ArrayDeque arrayDeque;
        q qVar = this.f21292h;
        synchronized (qVar) {
            u0 u0Var = qVar.f21280a;
            String str = pVar.f21278c;
            u0Var.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains((String) u0Var.f15038x)) {
                synchronized (((ArrayDeque) u0Var.f15039y)) {
                    if (((ArrayDeque) u0Var.f15039y).add(str)) {
                        ((ScheduledThreadPoolExecutor) u0Var.f15040z).execute(new a6.e(20, u0Var));
                    }
                }
            }
        }
        ib.h hVar = new ib.h();
        synchronized (this.e) {
            try {
                String str2 = pVar.f21278c;
                if (this.e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.e.get(str2);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar.f18363a;
    }

    public final synchronized void e(boolean z3) {
        this.f21291g = z3;
    }

    public final void f() {
        boolean z3;
        if (this.f21292h.a() != null) {
            synchronized (this) {
                z3 = this.f21291g;
            }
            if (!z3) {
                h(0L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:8:0x002b, B:13:0x008b, B:15:0x0093, B:61:0x003c, B:63:0x0044, B:65:0x004f, B:66:0x0065, B:68:0x006d, B:70:0x0078), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.g():boolean");
    }

    public final void h(long j10) {
        this.f21290f.schedule(new u(this, this.f21286a, this.f21287b, Math.min(Math.max(30L, 2 * j10), 28800L)), j10, TimeUnit.SECONDS);
        e(true);
    }
}
